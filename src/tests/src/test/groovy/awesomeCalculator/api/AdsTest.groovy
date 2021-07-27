package awesomeCalculator.api

import api.awesomeCalculator.ads.AdsGetRequest
import io.qameta.allure.Story
import org.testng.Assert
import org.testng.annotations.Test
import utils.Groups

/**
 * All tests related to /newad API endpoint
 * Test steps implementation need to be @ /src/main/groovy/api/awesomeCalculator/ads
 */
class AdsTest extends BaseTest {
  AdsGetRequest adsGetRequest = new AdsGetRequest()

  /**
   * Sanity check on /newad endpoint
   */
  @Story("Verify ads service is up and the api request returns 200 success response")
  @Test(groups = Groups.sanity)
  void getFactorialSuccessfulStatus() {
    Assert.assertTrue(adsGetRequest
      .makeRequest()
      .assertStatusCode(200)) }
}
