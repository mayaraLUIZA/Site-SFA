import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.16.1.21:7802/pt/account/login?returnUrl=%2Fpedidos')

WebUI.setText(findTestObject('Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_1603'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/td_R70,00'), 
    'R$ 70,00')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_20,00'), 
    '20,00')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_10,00'), 
    '10,00%')

if(
WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace SFA/div_R1.260,00'), 
    'R$ 1.260,00') != true)
{
	System.out.println("Valor invalido")
}else {
	System.out.println("Valor válido")
}

WebUI.closeBrowser()

