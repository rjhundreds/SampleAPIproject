import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import pages.LoginPage
import pages.InventoryPage



class LoginPageStepDef {

	@Given("I open the browser")
	def openBrowser() {
		WebUI.openBrowser('')
	}

	@When("I navigate to the login page")
	def navigateToLoginPage() {
		WebUI.navigateToUrl('https://www.saucedemo.com')
	}

	@When('I login with username "(.*)" and password "(.*)"')
	def login(String username, String password) {
		LoginPage.login(username, password)
	}

	@Then("I should see the inventory page")
	def verifyInventoryPage() {
		assert InventoryPage.isOnInventoryPage()
		WebUI.closeBrowser()
	}

	@Then("I should see an error message")
	def verifyErrorMessage() {
		WebUI.verifyElementPresent(findTestObject('LoginPage/lbl_Error'), 5)
		WebUI.closeBrowser()
	}
}