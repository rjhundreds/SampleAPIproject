package pages
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class LoginPage {

	def static login(String username, String password) {
		WebUI.setText(findTestObject('LoginPage/input_Username'), username)
		WebUI.setText(findTestObject('LoginPage/input_Password'), password)
		WebUI.click(findTestObject('LoginPage/btn_Login'))
	}
}
