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

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/div_Produtos'))

WebUI.setText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/input_Produtos e preos_termData'), 
    'W3179')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/i_Produtos e preos_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/a_W3179'))

WebUI.closeBrowser()