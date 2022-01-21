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

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'mayara.morais@gmail.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    'yk4Hk5tHTG0=')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/form_LoginNome de usurio ou endereo de emai_327498'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Usurio ou Senha incorretos'), 
    'Usuário ou Senha incorretos')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'mayara.moraes@dataplace.com.br')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/div_LoginNome de usurio ou endereo de email_d83c56'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace SFA/img_Mayara Normandia_rounded-circle'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace SFA/a_Sair'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

