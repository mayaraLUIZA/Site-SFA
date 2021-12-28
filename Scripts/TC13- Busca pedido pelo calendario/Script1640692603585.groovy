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

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (8)'), 
    'joaofrancisco.frabetti@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha (8)'), 
    '8W3YzVZBmX7qefCTiF4kOg==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/button_Login (4)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/a_Pesquisa avanada (1)'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/button_Data de emisso do pedido_minibutton _0ecd70'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/button_Data de emisso do pedido_minibutton _0ecd70'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/button_Data de emisso do pedido_minibutton _0ecd70'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/button_Data de emisso do pedido_btn btn-lin_c1cd13'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/button_Data de emisso do pedido_btn btn-lin_c1cd13_1'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/span_24'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace SFA/div_Pesquisar pedidos (1)'))

WebUI.closeBrowser()

