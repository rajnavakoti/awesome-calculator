package awesomeCalculator.gui

import io.github.bonigarcia.wdm.WebDriverManager
import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.testng.ITestResult
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Parameters
import org.openqa.selenium.TakesScreenshot
import static utils.configuration.Config.*

/**
 * Base test to perform setup, teardown for GUI tests
 * All GUI test classes required to extend Base test
 */
class BaseTest {
  WebDriver driver

  /**
   * Browser setup
   * @param browser
   * @return
   */
  @BeforeMethod
  @Parameters("browser")
  before(String browser) {
    switch (browser){
      case "chrome":
        ChromeOptions options = new ChromeOptions()
        options.headless = getHeadLessOption().toLowerCase().toBoolean()
        WebDriverManager.chromedriver().setup()
        driver = new ChromeDriver(options)
        break
      case "firefox":
        WebDriverManager.firefoxdriver().setup()
        driver = new FirefoxDriver()
        break  } }

  /**
   * Take screenshots in case of failure and quit browser once the test is run
   * @param testResult
   * @return
   */
  @AfterMethod
  after(ITestResult testResult) {
    if(testResult.getStatus() == ITestResult.FAILURE){
      takeSnapShot(driver, getFailScreenshotPath() + testResult.getName() + ".jpg") }
    driver.quit() }

  /**
   * Method to be called to perform screenshot operation
   * @param webdriver
   * @param fileWithPAth
   * @throws Exception
   */
  static void takeSnapShot(WebDriver webdriver, String fileWithPAth) throws Exception{
    TakesScreenshot screenShot = ((TakesScreenshot)webdriver)
    File SrcFile = screenShot.getScreenshotAs(OutputType.FILE)
    File DestFile = new File(fileWithPAth)
    FileUtils.copyFile(SrcFile, DestFile) }
}
