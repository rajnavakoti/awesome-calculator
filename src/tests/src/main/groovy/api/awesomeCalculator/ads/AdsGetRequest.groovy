package api.awesomeCalculator.ads

import api.awesomeCalculator.EndPoints
import api.basic.Get
import io.restassured.response.ValidatableResponse

/**
 * Test steps for /newad endpoint
 */
class AdsGetRequest {
  private ValidatableResponse response = null
  private query_parameters = [:]

  /**
   * make get request on /newad endpoint
   * @return
   */
  Object makeRequest(){
    this.response = Get.makeRequest(EndPoints.EP_ADS,query_parameters)
    this }

  /**
   * Assert status code
   * @param statusCode
   * @return
   */
  Boolean assertStatusCode(int statusCode) {
    this.response.assertThat().statusCode(statusCode) }
}
