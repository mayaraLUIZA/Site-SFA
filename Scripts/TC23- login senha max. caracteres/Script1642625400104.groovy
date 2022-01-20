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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    'z54qm3HMb8eU8VyelYSugNPZVduRshLu')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/form_LoginNome de usurio ou endereo de emai_6d358d'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/p_A senha deve possuir entre 5 e 15 caracteres'), 
    'A senha deve possuir entre 5 e 15 caracteres')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Senha_senha'), 
    'z54qm3HMb8eU8VyelYSugNPZVduRshLu')

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace SFA/Page_Dataplace - SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'), 
    'mayara.moraes@dataplace.com.br')

