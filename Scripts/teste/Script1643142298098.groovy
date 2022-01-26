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

WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace - SFA/input_Senha_senha'), 
    'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace - SFA/div_Login'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/div_Premium RS - Premium RS'))

WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/div_1605'))

WebUI.verifyElementText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/td_1 pc'), 
    '1 pc')

WebUI.verifyElementText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/td_R15,00'), 
    'R$ 15,00')

WebUI.verifyElementText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/td_10'), 
    '10 %')

WebUI.verifyElementText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/td_R13,50'), 
    'R$ 13,50')

WebUI.verifyElementText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/td_R13,50'), 
    'R$ 13,50')

if(WebUI.verifyElementText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/td_R14,31'), 
    'R$ 14,31') == true) {
System.out.println("valor correto")}
	else {
System.out.println("valor incorreto")
	}

WebUI.verifyElementText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/div_R14,31'), 
    'R$ 14,31')

WebUI.closeBrowser()

