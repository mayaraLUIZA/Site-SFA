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

Windows.startApplicationWithTitle('\\\\P-arnaldo\\symfp2021r3\\Install\\Comercial_Vendas.exe', 'Comercial - Gestão de Vendas')

Windows.setText(findWindowsObject('Object Repository/Comercial Vendas/Editar'), 'venda')

Windows.setText(findWindowsObject('Object Repository/Comercial Vendas/Editar(1)'), '')

Windows.setText(findWindowsObject('Object Repository/Comercial Vendas/Painel'), '')

Windows.setText(findWindowsObject('Object Repository/Comercial Vendas/Editar(2)'), '')

Windows.setText(findWindowsObject('Object Repository/Comercial Vendas/Editar(3)'), '')

Windows.setText(findWindowsObject('Object Repository/Comercial Vendas/Painel(1)'), '')

Windows.closeApplication()

