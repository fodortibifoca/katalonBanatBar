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

CustomKeywords.'com.helper.browserhelper.CustomBrowser.openBrowser'()

WebUI.click(findTestObject('NavigationBar/SeeMenuAndOrder'))

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/iFrame-SeeMenuAndOrder'), GlobalVariable.TimeOut)

WebUI.switchToFrame(findTestObject('SeeMenuAndOrder/iFrame-SeeMenuAndOrder'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('SeeMenuAndOrder/Cart'))

WebUI.waitForElementPresent(findTestObject('SeeMenuAndOrder/AddDetails'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('SeeMenuAndOrder/AddDetails'))

WebUI.waitForElementPresent(findTestObject('SeeMenuAndOrder/Form/Name'), GlobalVariable.TimeOut)

WebUI.setText(findTestObject('SeeMenuAndOrder/Form/Name'), findTestData('DataDrivenTestCase/BanatBarExcelSheet').getValue(
        1, 1))

WebUI.setText(findTestObject('SeeMenuAndOrder/Form/LastName'), findTestData('DataDrivenTestCase/BanatBarExcelSheet').getValue(
        2, 1))

WebUI.setText(findTestObject('SeeMenuAndOrder/Form/Email'), findTestData('DataDrivenTestCase/BanatBarExcelSheet').getValue(
        3, 1))

WebUI.setText(findTestObject('SeeMenuAndOrder/Form/Phone'), findTestData('DataDrivenTestCase/BanatBarExcelSheet').getValue(
        4, 1))

WebUI.click(findTestObject('SeeMenuAndOrder/Form/SaveBtn'))

WebUI.delay(3)

WebUI.click(findTestObject('SeeMenuAndOrder/Close'))

CustomKeywords.'com.helper.browserhelper.CustomBrowser.closeBrowser'()

