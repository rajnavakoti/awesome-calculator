package awesomeCalculator.api

import io.qameta.allure.Story
import org.testng.Assert
import org.testng.annotations.Test
import utils.Groups
import utils.dataProviders.FactorialDataProvider
import api.awesomeCalculator.factorial.FactorialGetRequest

/**
 * All tests related to /factorial API endpoint
 * Test steps implementation need to be @ /src/main/groovy/api/awesomeCalculator/factorial
 */
class FactorialTest {
  FactorialGetRequest factorialGetRequest = new FactorialGetRequest()

  /**
   * smoke check on API endpoint
   */
  @Story("Verify the API is up and accessbile for user testing")
  @Test(groups = Groups.smoke)
  void apiSmokeTest(){ }

  /**
   * Sanity check for endpoint response
   */
  @Story("Verify /Factorial API endpoint returns 200 success response for invalid request")
  @Test(groups = [Groups.sanity,Groups.regression])
  void getFactorialSuccessfulStatus() {
    Assert.assertTrue(factorialGetRequest
      .makeRequest(5)
      .assertStatusCode(200)) }

  /**
   * contract test to check schema of the response
   */
  @Story("Verify /factorial API response schema")
  @Test(groups = [Groups.sanity, Groups.contract])
  void getFactorialSchemaValidation() {
    Assert.assertTrue(factorialGetRequest
      .makeRequest(5)
      .verifySchema("src/main/resources/schemas/factorial.json" as File)) }

  /**
   * Factorial operation with valid api request
   * @param input
   * @param expectedFactorialValue
   */
  @Story("Verify /Factorial API endpoint with valid request params and assert response params")
  @Test(dataProvider = "factorialValues", dataProviderClass = FactorialDataProvider,groups = Groups.regression)
  void getFactorial(int input, long expectedFactorialValue) {
    def actualFactorialValue = factorialGetRequest
      .makeRequest(input)
      .extractNumberFromResponse()
    Assert.assertEquals(actualFactorialValue,expectedFactorialValue.toString()) }

  /**
   * Factorial operation with invalid api request
   * @param input
   */
  @Story("Verify /Factorial API endpoint with invalid request params and assert error response")
  @Test(dataProvider = "invalidNumericValues", dataProviderClass = FactorialDataProvider, groups = Groups.regression)
  void getFactorialForInvalidInputs(int input) {
    def actualFactorialValue = factorialGetRequest
      .makeRequest(input)
      .assertStatusCode(400) }
}
