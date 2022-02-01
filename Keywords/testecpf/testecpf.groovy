package testecpf

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class testecpf {
	
	
	@Keyword
	public   testecpf(){
		
		 function testecpf(cpf){
	
		int soma = 0
		int resto
		int cpf = document.getElementById('cpf').value
		
		if(this.cpf == '00000000000') return false
		for(i=1; i<=9; i++) this.soma = this.soma + parseInt(this.cpf.substring(i-1, i)) * (11 - i)
		this.resto = (this.soma * 10) % 11
		
		if((this.resto == 10) || (this.resto == 11)) this.resto = 0
		if(this.resto != parseInt(this.cpf.substring(9, 10))) return false
		
		this.soma = 0
		for(i = 1; i <= 10; i++) this.soma = this.soma + parseInt(this.cpf.substring(i-1, i))*(12-i)
		this.resto = (this.soma * 10) % 11
		
		if((this.resto == 10) || (this.resto == 11)) this.resto = 0
		if(this.resto != parseInt(this.cpf.substring(10, 11))) return false
		return true
		System.out.println("cpf válido")
	
	
		}
	}
}


