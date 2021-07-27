package gui.awesomeCalculator.objects

import gui.awesomeCalculator.EndPoints
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

/**
 * Page object for Home page
 */
class HomePage {
  WebDriver driver

  private By headerText = By.cssSelector("h1 > center")
  private By inputTextBox = By.id("input")
  private By calculateButton = By.id("run")
  private By resultText = By.id("output")
  private By adImage = By.id("id1")

  HomePage(WebDriver driver){
    this.driver = driver }

  /**
   * Go to home page
   */
  void open(){
    driver.get(EndPoints.HOME_PAGE) }

  /**
   * Check header text is displayed
   * @return
   */
  Boolean isHeaderTextVisible(){
    return driver.findElement(headerText).isDisplayed() }

  /**
   * Get text from the header
   * @return
   */
  String getHeaderText(){
    return driver.findElement(headerText).getText() }

  /**
   * check input text filed is enabled
   * @return
   */
  Boolean isInputTextBoxEnabled(){
    return driver.findElement(inputTextBox).isEnabled() }

  /**
   * Enter value in input filed
   * @param input
   */
  void enterInputText(String input){
    driver.findElement(inputTextBox).sendKeys(input) }

  /**
   * check calculate button is enabled
   * @return
   */
  Boolean isCalculateButtonEnabled(){
    return driver.findElement(calculateButton).isEnabled() }

  /**
   * click on calculate button
   */
  void clickCalculateButton(){
    driver.findElement(calculateButton).click() }

  /**
   * get the result message shown on home page
   * @return
   */
  String getResultText(){
    driver.findElement(resultText).getText() }

  /**
   * check if the ad image is displayed on the home page
   * @return
   */
  Boolean isAdImageDisplayed(){
    return driver.findElement(adImage).isDisplayed() }
}
