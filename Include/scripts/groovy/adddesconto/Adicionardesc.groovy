package adddesconto
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.pt.E
import cucumber.api.java.pt.Quando



class Adicionardesc {

	@E("adiciono email (.*)")
	def adicionoemail(String email){

		WebUI.setText(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace - SFA/input_Nome de usurio ou endereo de email_email (4)'),
				email)
	}
	@E("adiciono senha (.*)")
	def adicionosenha(String senha){
		WebUI.setEncryptedText(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace - SFA/input_Senha_senha (4)'),
				senha)

		WebUI.click(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace - SFA/button_Login (4)'))
	}
	@Quando("clico no produto")
	def cliconoproduto() {
		WebUI.click(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace SFA/div_1624 (2)'))

		WebUI.click(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace SFA/button_R2.800,00_minibutton btn default-btn_5f37b0'))

		WebUI.click(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace SFA/div_Quantidade'))

		WebUI.setText(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace SFA/input_Quantidade_quantidade (3)'), '3')

		WebUI.click(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace SFA/input_R_precoLiquido (4)'))

		WebUI.verifyElementText(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace SFA/input_R_precoLiquido (4)'),
				'')

		WebUI.verifyElementText(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace SFA/div_R210,00'), 'R$ 210,00')

		WebUI.click(findTestObject('Object Repository/Comercial Vendas/Page_Dataplace SFA/div_Confirmar (3)'))

		WebUI.closeBrowser()
	}
}


