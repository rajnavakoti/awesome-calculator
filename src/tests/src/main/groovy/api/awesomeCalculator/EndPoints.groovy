package api.awesomeCalculator

import utils.configuration.Config

/**
 * API end points design class
 */
class EndPoints {
  private static String API_URL = Config.getAwesomeCalculatorAPIURL()
  public static final String EP_FACTORIAL = API_URL + "/factorial"
  public static final String EP_ADS = API_URL + "/newad"
}
