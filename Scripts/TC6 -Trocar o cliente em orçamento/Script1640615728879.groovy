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

WebUI.navigateToUrl('http://172.16.1.21:7802/pt/')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'joaofrancisco.frabetti@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    '8W3YzVZBmX7qefCTiF4kOg==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_1184'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_Trocar Cliente'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace SFA/input_Cliente_clienteId'), 
    'Jo')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_Joao Francisco Frabetti Vieira Junior'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace SFA/i_Editar detalhes do pedido_fa fa-check my-float'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_Mensagem'), 
    0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

