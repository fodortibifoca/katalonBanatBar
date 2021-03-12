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

WebUI.click(findTestObject('SeeMenuAndOrder/Dodaci/BaconBurger'))

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/Dodaci/490'), GlobalVariable.TimeOut)

// getText komanda za ispis teksta sa Web elementa
// 1. cena Burgera
cenaSaRsdBurger = WebUI.getText(findTestObject('SeeMenuAndOrder/Dodaci/490'))

System.out.println(cenaSaRsdBurger)

// Prevodjenje Varijable cenaSaRsdBurger u str
String strBurger = cenaSaRsdBurger

// nova Varijabla cenaSlobodnaBurger bez ",00 i RSD"
String cenaSlobodnaBurger = strBurger.replaceAll('\\,00 RSD', '')

System.out.println("Cena burgera je " + cenaSlobodnaBurger)

// Konverzija Stringa u Integer
int cenaBurgerInt = Integer.parseInt(cenaSlobodnaBurger)

System.out.println("Cena Burgera integer je " + cenaBurgerInt)

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/Dodaci/20'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('SeeMenuAndOrder/Dodaci/Kecap'))

//2. cena Kecapa

kecapSaRsd = WebUI.getText(findTestObject('SeeMenuAndOrder/Dodaci/20'))

System.out.println("Cena kecapa sa + i ,00 " + kecapSaRsd)

String strKecap = kecapSaRsd

String kecapBezPlusa = strKecap.replaceAll("\\+", "")

System.out.println("Bez + " + kecapBezPlusa)

String strBezNula = kecapBezPlusa

String kecapBezNula = strBezNula.replaceAll("\\,00", "")

System.out.println("Bez ,00 " + kecapBezNula)

int cenaKecapInt = Integer.parseInt(kecapBezNula)

System.out.println("Cena Kecapa integer je " + cenaKecapInt)

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/Dodaci/200'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('SeeMenuAndOrder/Dodaci/DuploMeso'))

//3. cena Duplog Mesa

duploMesoSaRsd = WebUI.getText(findTestObject('SeeMenuAndOrder/Dodaci/200'))

System.out.println("Cena Duplog Mesa sa + i ,00 " + duploMesoSaRsd)

String strDuploMeso = duploMesoSaRsd

String duploMesoBezPlusa = strDuploMeso.replaceAll("\\+", "")

System.out.println("Bez + " + duploMesoBezPlusa)

String strBezNula2 =  duploMesoBezPlusa

String duploMesoBezNula = strBezNula2.replaceAll("\\,00", "")

System.out.println("Bez ,00 " + duploMesoBezNula)

int cenaDuploMesoInt = Integer.parseInt(duploMesoBezNula)

System.out.println("Cena Duplog Mesa integer je " + cenaDuploMesoInt)

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/Dodaci/280'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('SeeMenuAndOrder/Dodaci/Svetionik'))

//3. cena Svetionika

svetionikSaRsd = WebUI.getText(findTestObject('SeeMenuAndOrder/Dodaci/280'))

System.out.println("Cena Svetionika sa + i ,00 " + svetionikSaRsd)

String strSvetionik = svetionikSaRsd

String svetionikBezPlusa = strSvetionik.replaceAll("\\+", "")

System.out.println("Bez + " + svetionikBezPlusa)

String strBezNula3 =   svetionikBezPlusa

String svetionikBezNula = strBezNula3.replaceAll("\\,00", "")

System.out.println("Bez ,00 " + svetionikBezNula)

int cenaSvetionikInt = Integer.parseInt(svetionikBezNula)

System.out.println("Cena Svetionika integer je " + cenaSvetionikInt)

// Izracunata cena kostanja narucenog obroka je

izracunataCenaObroka = cenaBurgerInt + cenaKecapInt + cenaDuploMesoInt + cenaSvetionikInt

System.out.println("Izracunata cena kostanja obroka je " + izracunataCenaObroka)

WebUI.waitForElementVisible(findTestObject('SeeMenuAndOrder/Dodaci/990'), GlobalVariable.TimeOut)

cenaObrokaSaBanatBara = WebUI.getText(findTestObject('SeeMenuAndOrder/Dodaci/990'))

String strCenaObroka = cenaObrokaSaBanatBara

String cenaObrokaSlobodna = strCenaObroka.replaceAll('\\,00 RSD', '')

System.out.println("Cena obroka sa sajta Banat bara je " + cenaObrokaSlobodna)

int cenaObrokaSaSajtaInt = Integer.parseInt(cenaObrokaSlobodna)

System.out.println("Cena obroka preuzeta sa sajta (integer) je " + cenaObrokaSaSajtaInt)

if (izracunataCenaObroka == cenaObrokaSaSajtaInt) {
      System.out.println("Izracunata cena obroka i cena preuzeta sa sajta je jednaka.");
    } else {
      System.out.println("Izracunata cena obroka i cena preuzeta sa sajta nije jednaka.");
    } 

WebUI.delay(1)

WebUI.closeBrowser()

