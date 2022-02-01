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

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'mayara.moraes@dataplace.cpm.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'mayara.moraes@dataplace.com.br')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_Cadastrar pedido'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/input_Cliente_clienteId'), 
    'premium')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_Premium_row p-2'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/input_Cliente_clienteId'), 
    'Premium RS - Premium RS')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/input_Tipo de pedido_tipoPedido'), 
    ' ')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/ngb-highlight_Vendas_ST'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/input_Tipo de pedido_tipoPedido'), 
    'Vendas_ST')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/a_Editar detalhes do pedido_bg-success floa_925a26'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/input_Produto_typeahead-produto'), 
    ' ')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_COIFA CAIXA DIREAO a - 8029ST'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/input_Produto_typeahead-produto'), 
    ' ')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_Confirmar'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/td_1 pc'), 
    '1 pc')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/td_R15,00'), 
    'R$ 15,00')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/td_R15,00'), 
    'R$ 15,00')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/td_R15,00'), 
    'R$ 15,00')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/td_R15,90'), 
    'R$ 15,90')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_R15,90'), 
    'R$ 15,90')

