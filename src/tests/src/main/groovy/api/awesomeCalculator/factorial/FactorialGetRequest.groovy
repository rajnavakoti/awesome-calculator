package api.awesomeCalculator.factorial

import api.awesomeCalculator.EndPoints
import api.basic.Get
import groovy.json.JsonSlurper
import io.qameta.allure.Step
import io.restassured.module.jsv.JsonSchemaValidator
import io.restassured.response.ValidatableResponse

/**
 * Test steps for /factorial endpoint
 */
class FactorialGetRequest{
  private query_parameters = [:]
  private ValidatableResponse response = null

  /**
   * make get request on /factorial endpoint
   * @param num
   * @return response
   */
  Object makeRequest(int num){
    query_parameters.put('number', num)
    this.response = Get.makeRequest(EndPoints.EP_FACTORIAL,query_parameters)
    this }

  /**
   * Extract 'number' parameter value from response
   * @return
   */
  String extractNumberFromResponse(){
    def parser = new JsonSlurper()
    def json = parser.parseText(this.response.extract().asString())
    return json["data"]["number"].toString() }

  /**
   * Assert the status code of response
   * @param statusCode
   * @return
   */
  Boolean assertStatusCode(int statusCode) {
    this.response.assertThat().statusCode(statusCode) }

  /**
   * Validate response schema
   * @param schemaPath
   * @return
   */
  Boolean verifySchema(File schemaPath) {
    this.response.body(JsonSchemaValidator.matchesJsonSchema(schemaPath)) }
}
