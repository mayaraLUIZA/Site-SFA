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

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (16)'), 
    'joaofrancisco.frabetti@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha (16)'), 
    '8W3YzVZBmX7qefCTiF4kOg==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Login (7)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Cadastrar pedido (2)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Dados do pedido (obrigatrio) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_Cliente_clienteId (4)'), 'Premiu')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/span_Premiu'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Tipo de pedidoInforme o tipo do pedido'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_Tipo de pedido_tipoPedido (3)'), 
    'Ve')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/ngb-highlight_Vendas_ST (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_Tipo de pedido_tipoPedido (3)'), 
    'Vendas_ST')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/a_Editar detalhes do pedido_bg-success floa_925a26 (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_Produto_typeahead-produto (2)'), 
    '8029')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_COIFA CAIXA DIREAO a - 8029ST (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_Produto_typeahead-produto (2)'), 
    '8029')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_Quantidade_quantidade (2)'), 
    '2')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Preo lquidoR'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_R_precoLiquido (1)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Confirmar (1)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_R31,80'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/td_R31,80 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/td_R30,00'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/td_R31,80 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_R31,80'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Gerar Pedido (2)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/button_Confirmar (2)'))

