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

WebUI.doubleClick(findTestObject('Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (1)'))

WebUI.setText(findTestObject('Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (1)'), 
    'joaofrancisco.frabetti@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Dataplace - SFA/input_Senha_senha (1)'), 
    '8W3YzVZBmX7qefCTiF4kOg==')

WebUI.click(findTestObject('Page_Dataplace - SFA/div_Login (1)'))

WebUI.click(findTestObject('Page_Dataplace - SFA/div_1084 emitido por Joao F Frabetti       _7cff95'))

WebUI.verifyElementVisible(findTestObject('Page_Dataplace - SFA/div_Gerar Pedido'))

WebUI.click(findTestObject('Page_Dataplace - SFA/div_Gerar Pedido'))

WebUI.verifyElementVisible(findTestObject('Page_Dataplace - SFA/button_Confirmar (1)'))

WebUI.click(findTestObject('Page_Dataplace - SFA/button_Confirmar (1)'))

WebUI.verifyElementPresent(findTestObject('Page_Dataplace - SFA/div_Pedido gerado com sucesso'), 
    0)

WebUI.closeBrowser()

