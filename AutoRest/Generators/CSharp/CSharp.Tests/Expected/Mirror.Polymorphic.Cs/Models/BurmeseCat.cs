namespace Fixtures.MirrorPolymorphic.Models
{
    using System;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// </summary>
    public partial class BurmeseCat : SiameseCat
    {
        /// <summary>
        /// cat nick name
        /// </summary>
        [JsonProperty(PropertyName = "nickName")]
        public int? NickName { get; set; }

    }
}