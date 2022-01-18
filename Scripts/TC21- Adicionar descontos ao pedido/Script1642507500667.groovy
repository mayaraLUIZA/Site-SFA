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

WebUI.setText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (3)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/input_Senha_senha (3)'), 
    'jBu/h84nUum0DzfFUdyvAQ==')

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace - SFA/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/div_1561'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/button_R10,00_minibutton btn default-btn bt_4dda75'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/i_R10,00_fas fa-edit text-primary m-auto'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/input_Descontos_44334dba-539d-404b-ae94-043_2c4642'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/input__8e34af9b-8c51-44d4-992e-277a680ba363'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/input__c4a9d945-9738-464f-bd07-3cf45d09803b'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/input__7bcc2e7a-b2c7-449a-bae9-e89c3fd670a5'))

WebUI.click(findTestObject('Object Repository/Page_Dataplace SFA/Page_Dataplace SFA/input__45ea18cc-48ed-4ee6-9fad-7e33f752b90a'))

