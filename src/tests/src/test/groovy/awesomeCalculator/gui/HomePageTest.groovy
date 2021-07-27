package awesomeCalculator.gui

import gui.awesomeCalculator.objects.HomePage
import io.qameta.allure.Story
import org.testng.Assert
import org.testng.annotations.Test
import utils.Groups

/**
 * All UI tests for HOME PAGE
 * Test steps implementation need to be @ /src/main/groovy/gui/awesomeCalculator/objects/HomePage.groovy
 */
class HomePageTest extends BaseTest {
  HomePage homePage

  /**
   * UI checks for Home page
   */
  @Story("Verify expected UI is displayed for Home Page")
  @Test(groups = [Groups.sanity, Groups.regression])
  void homePageUITests(){
    homePage = new HomePage(super.getDriver())
    homePage.open()
    Assert.assertTrue(homePage.isHeaderTextVisible())
    Assert.assertTrue(homePage.isInputTextBoxEnabled())
    Assert.assertTrue(homePage.isCalculateButtonEnabled())
    Assert.assertEquals(homePage.getHeaderText(), "Best, most awesome factorial calculator!") }
}
