package utils.configuration

import static utils.configuration.PropertiesReader.*
import static utils.configuration.PropertiesReader.getKey

/**
 * Getters methods for properties defined in /configuration.groovy file
 */
class Config {
  /**
   * Get environment
   * @return
   */
  static String getEnvironment(){
    return getKey("environment") }

  /**
   * Get awesome calculator API URL
   * @return
   */
  static String getAwesomeCalculatorAPIURL(){
    return getKey("awesomeCalculatorAPIURL", getEnvironment()) }

  /**
   * Get awesome calculator APP URL
   * @return
   */
  static String getAwesomeCalculatorAPPURL(){
    return getKey("awesomeCalculatorAPPURL", getEnvironment()) }

  /**
   * Get headless browser flag
   * @return
   */
  static String getHeadLessOption(){
    return getKey("headless") }

  /**
   * Get path for saving failure screenshots
   * @return
   */
  static String getFailScreenshotPath(){
    return getKey("failScreenShotPath") }
}
