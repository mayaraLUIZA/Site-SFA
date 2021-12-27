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

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (4)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha (4)'), 
    'qQ83QJxV0tpHrL/eDa4HSA==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Clientes'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Cadastrar cliente'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/select_Fsica Jurdica'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_CPF_inscricaoFederal'), '767.936.319-69')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_Razo Social_razaoSocial (1)'), 
    'Vitor Kevin Jesus')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_Nome fantasia_fantasia'), 
    'Vitor Kevin Jesus')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_RG_inscricaoEstadual'), '16.800.728-9')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_CEP_endereco_cep'), '48.981-632')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_SFA - Fora de Vendas  DP INFORMTICA LTD_a6a7a3'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/input_CEP_endereco_cep'), '17.400-052')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Buscar endereo'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Salvar'))

WebUI.closeBrowser()

