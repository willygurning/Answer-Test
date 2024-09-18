import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

'Edit new phone number before execute the test case\r\n'
WebUI.setText(findTestObject('Page_Daftar/input_No. Handphone_mobilePhone'), '0816365741348')

'Edit new email before execute the test case '
WebUI.setText(findTestObject('Page_Daftar/input_Email_email'), '13willygurning1@gmail.com')

WebUI.setText(findTestObject('Page_Daftar/input_Nama Depan_firstName'), 'Willy')

WebUI.setText(findTestObject('Page_Daftar/input_Nama Belakang_lastName'), 'Gurning')

WebUI.click(findTestObject('Page_Daftar/button_Daftar'))

'Added some delay to solve the captcha'
WebUI.delay(6)

WebUI.click(findTestObject('Page_Daftar/button_Daftar'))

'delay for verify text "Verifikasi No. Handphone" appear.'
WebUI.delay(6)

WebUI.verifyTextPresent('Verifikasi No. Handphone', false)

WebUI.closeBrowser()

