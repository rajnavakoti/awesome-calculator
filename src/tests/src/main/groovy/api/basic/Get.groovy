package api.basic

import io.restassured.response.ValidatableResponse
import static io.restassured.RestAssured.given

/**
 * Rest Get operation
 */
class Get {
  static ValidatableResponse makeRequest(String url, def query_params){
    return given()
      .queryParams(query_params)
      .when()
      .get(url)
      .then() }
}
