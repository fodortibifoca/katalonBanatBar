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

WebUI.click(findTestObject('NavigationBar/TableReservation'))

WebUI.waitForElementVisible(findTestObject('NavigationBar/iFrame-TableReservation'), GlobalVariable.TimeOut)

WebUI.switchToFrame(findTestObject('NavigationBar/iFrame-TableReservation'), GlobalVariable.TimeOut)

WebUI.selectOptionByIndex(findTestObject('ReservationTable/NumberOfPeople'), 2)

WebUI.selectOptionByLabel(findTestObject('ReservationTable/Date'), 'tomorrow', false)

WebUI.selectOptionByLabel(findTestObject('ReservationTable/Time'), '07:45', false)

WebUI.click(findTestObject('ReservationTable/Next'))

WebUI.delay(3)

WebUI.click(findTestObject('ReservationTable/AddDetails'))

WebUI.waitForElementVisible(findTestObject('ReservationTable/FirstName'), GlobalVariable.TimeOut)

WebUI.setText(findTestObject('ReservationTable/FirstName'), GlobalVariable.Name)

WebUI.setText(findTestObject('ReservationTable/LastName'), GlobalVariable.LastName)

WebUI.setText(findTestObject('ReservationTable/E-mail'), GlobalVariable.Email)

WebUI.setText(findTestObject('ReservationTable/Phone'), GlobalVariable.Phone)

WebUI.click(findTestObject('ReservationTable/SaveBtn'))

WebUI.click(findTestObject('ReservationTable/PlaceTableReservationNow'))

WebUI.delay(3)

WebUI.closeBrowser()

