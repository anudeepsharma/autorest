// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Linq;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Utilities;
using Microsoft.Rest.Modeler.Swagger.Model;
using ParameterLocation = Microsoft.Rest.Modeler.Swagger.Model.ParameterLocation;
using System.Globalization;

namespace Microsoft.Rest.Modeler.Swagger
{
    /// <summary>
    /// The builder for building swagger parameters into client model parameters, 
    /// service types or Json serialization types.
    /// </summary>
    public class ParameterBuilder : ObjectBuilder
    {
        private readonly SwaggerParameter _swaggerParameter;

        public ParameterBuilder(SwaggerParameter swaggerParameter, SwaggerModeler modeler)
            : base(swaggerParameter, modeler)
        {
            _swaggerParameter = swaggerParameter;
        }

        public Parameter Build()
        {
            string parameterName = _swaggerParameter.Name;
            if (_swaggerParameter.Schema != null && _swaggerParameter.Schema.Reference != null)
            {
                parameterName = _swaggerParameter.Schema.Reference.StripDefinitionPath();
            }

            IType parameterType = BuildServiceType(parameterName);
            var parameter = new Parameter
            {
                Name = _swaggerParameter.Name,
                SerializedName = _swaggerParameter.Name,
                Type = parameterType,
                IsRequired = _swaggerParameter.IsRequired,
                Location = (Generator.ClientModel.ParameterLocation) Enum.Parse(typeof (Generator.ClientModel.ParameterLocation), _swaggerParameter.In.ToString())
            };
            parameter.IsRequired = parameter.IsRequired || parameter.Location == Generator.ClientModel.ParameterLocation.Path;

            parameter.CollectionFormat = _swaggerParameter.CollectionFormat;
            parameter.Documentation = _swaggerParameter.Description;
            var enumType = parameterType as EnumType;
            if (enumType != null)
            {
                if (parameter.Documentation == null)
                {
                    parameter.Documentation = string.Empty;
                }
                else
                {
                    parameter.Documentation = parameter.Documentation.TrimEnd('.') + ". ";
                }
                parameter.Documentation += "Possible values for this parameter include: " +
                                           string.Join(", ", enumType.Values.Select(v =>
                                               string.Format(CultureInfo.InvariantCulture, 
                                               "'{0}'", v.Name)));
            }
            _swaggerParameter.Extensions.ForEach(e => parameter.Extensions[e.Key] = e.Value);

            return parameter;
        }

        public override IType BuildServiceType(string serviceTypeName)
        {
            // Check if already generated
            if (serviceTypeName != null && Modeler.GeneratedTypes.ContainsKey(serviceTypeName))
            {
                return Modeler.GeneratedTypes[serviceTypeName];
            }

            var swaggerParameter = Modeler.Unwrap(_swaggerParameter);

            // Generic type
            if (swaggerParameter.In != ParameterLocation.Body)
            {
                return swaggerParameter.GetBuilder(Modeler).ParentBuildServiceType(serviceTypeName);
            }

                // Contains a complex type schema
            return swaggerParameter.Schema.GetBuilder(Modeler).BuildServiceType(serviceTypeName);
        }

        public override IType ParentBuildServiceType(string serviceTypeName)
        {
            return base.BuildServiceType(serviceTypeName);
        }
    }
}