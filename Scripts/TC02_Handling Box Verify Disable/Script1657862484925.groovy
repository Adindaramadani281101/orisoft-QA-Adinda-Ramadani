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

WebUI.navigateToUrl('https://rahulshettyacademy.com/angularpractice/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Handling Box/fieldName'), 'Adinda Ramadani')

WebUI.setText(findTestObject('Handling Box/fieldEmail'), 'adinda@gmail.com')

WebUI.setText(findTestObject('Handling Box/Field Password'), 'Addani281101')

WebUI.click(findTestObject('Handling Box/Chech Box'))

WebUI.click(findTestObject('Handling Box/Drop Down'))

WebUI.verifyElementText(findTestObject('Handling Box/disabled'), 'Entrepreneur (disabled)')

WebUI.sendKeys(findTestObject('Handling Box/Field Birth Box'), '28-11-2001')

WebUI.click(findTestObject('Handling Box/Submit'))

WebUI.waitForPageLoad(5)

WebUI.closeBrowser()

