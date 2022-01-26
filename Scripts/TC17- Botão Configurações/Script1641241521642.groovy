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

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Nome de usurio ou endereo de email (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (14)'), 
    'joaofrancisco.frabetti@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha (14)'), 
    '8W3YzVZBmX7qefCTiF4kOg==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/button_Login (7)'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/div_Configuraes'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/input_Status de pedido_termData'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/i_Status de pedido_fa fa-search'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/a_Vendas'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/div_Transportadora'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/a_O PROPRIO'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/div_Condio de pagamento'))

WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/input_Status de pedido_termData'), 
    'Dias')

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/button_Status de pedido_btn btn-secondary btn-sm'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/a_15DIAS'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/div_Status de pedido'))

WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/input_Status de pedido_termData'), 
    'ERP')

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA (1)/button_Status de pedido_btn btn-secondary btn-sm'))

WebUI.closeBrowser()

