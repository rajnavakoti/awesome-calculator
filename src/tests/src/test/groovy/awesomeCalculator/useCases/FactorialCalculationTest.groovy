package awesomeCalculator.useCases

import awesomeCalculator.gui.BaseTest
import gui.awesomeCalculator.objects.HomePage
import io.qameta.allure.Story
import org.testng.Assert
import org.testng.annotations.Test
import utils.Groups
import utils.dataProviders.FactorialDataProvider

/**
 * All tests related to factorial operation from GUI
 * Test steps implementation need to be @ /src/main/groovy/gui/awesomeCalculator
 */
class FactorialCalculationTest extends BaseTest{
  HomePage homePage

  /**
   * Factorial operation with valid request
   * @param input
   * @param expectedResultMsg
   */
  @Story("Verify user is able to get the expected factorial value for the given number")
  @Test(dataProvider = "factorialValidInputs", dataProviderClass = FactorialDataProvider, groups = Groups.regression)
  void factorialCalculationWithValidInputs(int input, String expectedResultMsg){
    homePage = new HomePage(super.getDriver())
    homePage.open()
    homePage.enterInputText(input.toString())
    homePage.clickCalculateButton()
    Assert.assertTrue(homePage.getResultText().equalsIgnoreCase(expectedResultMsg)) }

  /**
   * Factorial operation with invalid request
   * @param input
   * @param expectedErrorMsg
   */
  @Story("Verify user is able see expected error msg when  invalid values are provided")
  @Test(dataProvider = "factorialInvalidInputs", dataProviderClass = FactorialDataProvider, groups = Groups.regression)
  void factorialCalculationWithInvalidInputs(String input, String expectedErrorMsg){
    homePage = new HomePage(super.getDriver())
    homePage.open()
    homePage.enterInputText(input.toString())
    homePage.clickCalculateButton()
    Assert.assertTrue(homePage.getResultText().equalsIgnoreCase(expectedErrorMsg)) }
}
