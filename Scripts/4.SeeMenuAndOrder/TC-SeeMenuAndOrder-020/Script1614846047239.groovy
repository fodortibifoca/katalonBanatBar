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

WebUI.openBrowser('https://www.banatbar.rs/en')

WebUI.waitForPageLoad(GlobalVariable.TimeOut)

WebUI.maximizeWindow()

WebUI.click(findTestObject('NavigationBar/SeeMenuAndOrder'))

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/iFrame-SeeMenuAndOrder'), GlobalVariable.TimeOut)

WebUI.switchToFrame(findTestObject('SeeMenuAndOrder/iFrame-SeeMenuAndOrder'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('SeeMenuAndOrder/InfoPage'))

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/Language'), GlobalVariable.TimeOut)

WebUI.scrollToElement(findTestObject('SeeMenuAndOrder/Language'), GlobalVariable.TimeOut)

WebUI.selectOptionByLabel(findTestObject('SeeMenuAndOrder/Language'), 'Deutsch', false)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/Sprachen'), GlobalVariable.TimeOut)

WebUI.verifyElementText(findTestObject('SeeMenuAndOrder/Sprachen'), 'Sprachen')

WebUI.click(findTestObject('SeeMenuAndOrder/Close'))

WebUI.switchToDefaultContent()

WebUI.closeBrowser()

