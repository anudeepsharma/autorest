﻿
import unittest
import sys
import datetime
import os
from uuid import uuid4
from os.path import dirname, pardir, join, realpath, sep, pardir

cwd = dirname(realpath(__file__))

sys.path.append(cwd + sep + pardir + sep + pardir + sep + pardir + sep + pardir + sep + pardir + sep + "ClientRuntimes" + sep + "Python" + sep + "msrest")
sys.path.append(cwd + sep + pardir + sep + pardir + sep + pardir + sep + pardir + sep + pardir + sep + "ClientRuntimes" + sep + "Python" + sep + "msrestazure")
log_level = int(os.environ.get('PythonLogLevel', 30))

tests = realpath(join(cwd, pardir, "Expected", "AcceptanceTests"))

sys.path.append(join(tests, "AzureParameterGrouping"))
sys.path.append(join(tests, "SubscriptionIdApiVersion"))
sys.path.append(join(tests, "AzureBodyDuration"))
sys.path.append(join(tests, "AzureSpecials"))
sys.path.append(join(tests, "AzureReport"))

from msrest.exceptions import DeserializationError

from auto_rest_parameter_grouping_test_service import AutoRestParameterGroupingTestServiceConfiguration, AutoRestParameterGroupingTestService
from microsoft_azure_test_url import MicrosoftAzureTestUrl, MicrosoftAzureTestUrlConfiguration
from auto_rest_report_service_for_azure import AutoRestReportServiceForAzureConfiguration, AutoRestReportServiceForAzure
from auto_rest_duration_test_service import AutoRestDurationTestService, AutoRestDurationTestServiceConfiguration 
from auto_rest_azure_special_parameters_test_client import AutoRestAzureSpecialParametersTestClient, AutoRestAzureSpecialParametersTestClientConfiguration

from auto_rest_parameter_grouping_test_service.models import ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup, ParameterGroupingPostOptionalParameters, ParameterGroupingPostRequiredParameters, FirstParameterGroup

from msrest.authentication import BasicTokenAuthentication


class AcceptanceTests(unittest.TestCase):

    def test_parameter_grouping(self):

        bodyParameter = 1234
        headerParameter = 'header'
        queryParameter = 21
        pathParameter = 'path'

        cred = BasicTokenAuthentication({"access_token" :str(uuid4())})
        config = AutoRestParameterGroupingTestServiceConfiguration(cred, base_url="http://localhost:3000")
        config.log_level = log_level
        client = AutoRestParameterGroupingTestService(config)

        # Valid required parameters
        requiredParameters = ParameterGroupingPostRequiredParameters(body = bodyParameter, path = pathParameter, custom_header = headerParameter, query = queryParameter)
        client.parameter_grouping.post_required(requiredParameters)

        #Required parameters but null optional parameters
        requiredParameters = ParameterGroupingPostRequiredParameters(body = bodyParameter, path = pathParameter)
        client.parameter_grouping.post_required(requiredParameters)

        #Required parameters object is not null, but a required property of the object is
        requiredParameters = ParameterGroupingPostRequiredParameters(body = None, path = pathParameter)

        with self.assertRaises(ValueError):
            client.parameter_grouping.post_required(requiredParameters)
        with self.assertRaises(ValueError):
            client.parameter_grouping.post_required(None)

        #Valid optional parameters
        optionalParameters = ParameterGroupingPostOptionalParameters(custom_header = headerParameter, query = queryParameter)
        client.parameter_grouping.post_optional(optionalParameters)

        #null optional paramters
        client.parameter_grouping.post_optional(None)

        #Multiple grouped parameters
        firstGroup = FirstParameterGroup(header_one = headerParameter, query_one = queryParameter)
        secondGroup = ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup(header_two = "header2", query_two = 42)

        client.parameter_grouping.post_multiple_parameter_groups(firstGroup, secondGroup)

        #Multiple grouped parameters -- some optional parameters omitted
        firstGroup = FirstParameterGroup(header_one = headerParameter)
        secondGroup = ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup(query_two = 42)

        client.parameter_grouping.post_multiple_parameter_groups(firstGroup, secondGroup)
        client.parameter_grouping.post_shared_parameter_group_object(firstGroup)

    def test_azure_special_parameters(self):

        validSubscription = '1234-5678-9012-3456'
        validApiVersion = '2.0'
        unencodedPath = 'path1/path2/path3'
        unencodedQuery = 'value1&q2=value2&q3=value3'
        cred = BasicTokenAuthentication({"access_token" :str(uuid4())})
        config = AutoRestAzureSpecialParametersTestClientConfiguration(cred, validSubscription, base_url="http://localhost:3000")
        config.log_level = log_level
        client = AutoRestAzureSpecialParametersTestClient(config)

        client.subscription_in_credentials.post_method_global_not_provided_valid()
        client.subscription_in_credentials.post_method_global_valid()
        client.subscription_in_credentials.post_path_global_valid()
        client.subscription_in_credentials.post_swagger_global_valid()
        client.subscription_in_method.post_method_local_valid(validSubscription)
        client.subscription_in_method.post_path_local_valid(validSubscription)
        client.subscription_in_method.post_swagger_local_valid(validSubscription)
        with self.assertRaises(ValueError):
            client.subscription_in_method.post_method_local_null(None)

        client.api_version_default.get_method_global_not_provided_valid()
        client.api_version_default.get_method_global_valid()
        client.api_version_default.get_path_global_valid()
        client.api_version_default.get_swagger_global_valid()
        client.api_version_local.get_method_local_valid(validApiVersion)
        client.api_version_local.get_method_local_null(None)
        client.api_version_local.get_path_local_valid(validApiVersion)
        client.api_version_local.get_swagger_local_valid(validApiVersion)

        client.skip_url_encoding.get_method_path_valid(unencodedPath)
        client.skip_url_encoding.get_path_path_valid(unencodedPath)
        client.skip_url_encoding.get_swagger_path_valid(unencodedPath)
        client.skip_url_encoding.get_method_query_valid(unencodedQuery)
        client.skip_url_encoding.get_path_query_valid(unencodedQuery)
        client.skip_url_encoding.get_swagger_query_valid(unencodedQuery)
        client.skip_url_encoding.get_method_query_null()
        client.skip_url_encoding.get_method_query_null(None)

    def test_azure_odata(self):

        validSubscription = '1234-5678-9012-3456'
        cred = BasicTokenAuthentication({"access_token" :str(uuid4())})
        config = AutoRestAzureSpecialParametersTestClientConfiguration(cred, validSubscription, base_url="http://localhost:3000")
        config.log_level = log_level
        client = AutoRestAzureSpecialParametersTestClient(config)
        client.odata.get_with_filter(filter="id gt 5 and name eq 'foo'", top=10, orderby="id")

    def test_ensure_coverage(self):

        cred = BasicTokenAuthentication({"access_token" :str(uuid4())})
        config = AutoRestReportServiceForAzureConfiguration(cred, base_url="http://localhost:3000")
        config.log_level = log_level
        client = AutoRestReportServiceForAzure(config)
        report = client.get_report()

        skipped = [k for k, v in report.items() if v == 0]

        for s in skipped:
            print("SKIPPED {0}".format(s))

        totalTests = len(report)
        print("The test coverage is {0}/{1}.".format(totalTests - len(skipped), totalTests))
        self.assertEqual(0, len(skipped))

if __name__ == '__main__':
    unittest.main()