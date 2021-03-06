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

WebUI.navigateToUrl('http://172.16.1.21:7802/pt/account/login?returnUrl=%2Fpedidos')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (15)'), 
    'mayara..moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha (15)'), 
    'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (15)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Login (6)'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/div_1595'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/button_Enviar por e-mail'))

WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/input_Enviar por e-mail_form-control ng-unt_f4d8b2'), 
    'normandiamayaragmailc.om')

WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/textarea_Mensagem do e-mail_cabecalhoTexto'), 
    'teste')

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/div_CancelarEnviar'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/div_Enviar'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/ngb-modal-window_Enviar por e-mailDesculpe,_23bc12'))

WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/input_Enviar por e-mail_form-control ng-unt_f4d8b2'), 
    'normandiamayara@gmail.com')

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/ngb-modal-window_Enviar por e-mailDesculpe,_23bc12'))

WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/textarea_Mensagem do e-mail_cabecalhoTexto'), 
    'teste123')

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/div_CancelarEnviar'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/button_Enviar'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)