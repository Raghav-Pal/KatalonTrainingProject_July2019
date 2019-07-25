import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('WebObjects/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), GlobalVariable.USERNAME)

WebUI.setEncryptedText(findTestObject('WebObjects/Page_OrangeHRM/input_Username_txtPassword'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('WebObjects/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('WebObjects/Page_OrangeHRM/b_Performance'))

WebUI.click(findTestObject('WebObjects/Page_OrangeHRM/b_Time'))

WebUI.click(findTestObject('WebObjects/Page_OrangeHRM/a_Welcome Admin'))

WebUI.waitForElementPresent(findTestObject('WebObjects/Page_OrangeHRM/a_Logout'), 5)

WebUI.click(findTestObject('WebObjects/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

