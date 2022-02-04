package testelogin
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.github.javafaker.Faker
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.pt.E
import cucumber.api.java.pt.Entao
import cucumber.api.java.pt.Quando
import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException



class FacoLogin {

	@E("faço login (.*)")
	def facologin(String email) {
		if(WebUI.setText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email'),
		email) == true){
			System.out.println("valido")
		}
	}
	@E("adiciono senha(.*)")
	def addsenha(String senha) {
		WebUI.setEncryptedText(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace - SFA/input_Senha_senha'),
				senha)
	}

	@Quando("clico no botão login")
	def clicobotaologin() {
		WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace - SFA/div_Login'))
	}
	
	@Entao("visualizo a tela produto")
	def visualizoproduto() {
		WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/div_Produtos'))

		WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/button_Produtos e preos_btn btn-secondary btn-sm'))

		WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/a_W3179'))

		WebUI.click(findTestObject('Page_Dataplace - SFA/Page_Dataplace - SFA/Page_Dataplace - SFA (1)/Page_Dataplace SFA/i_Produtos e preos_fas fa-sync-alt'))
		WebUI.closeBrowser()
	}
}
