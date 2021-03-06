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

WebUI.navigateToUrl('http://172.16.1.21:7802/pt/pedidos')

WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/button_Login'))

WebUI.setViewPortSize(347, 703)

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/div_Configuraes'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/nav_Mayara Normandia                       _d83259'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/button_Minha conta_menu-toggle'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/div_Indicadores'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/div_Clientes'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/button_Minha conta_menu-toggle'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/i_Minha conta_fas fa-bars'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/div_TAX'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/button_Minha conta_menu-toggle'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/button_Minha conta_menu-toggle'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/div_Produtos'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/button_Minha conta_menu-toggle'))

