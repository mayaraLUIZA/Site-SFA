#language: pt
#encoding: UTF-8
#author: Mayara
#version: 1.0

Funcionalidade: Validar cadastro na aplicação

	Esquema do Cenario: Visualiza Produto
		Dado que acesso a aplicação
		E faço login <email>
		E adiciono senha <senha>
		Quando clico no botão login
		Entao visualizo a tela produto
	
		
	Exemplos:
	| 				email 						         |     senha |
	|  mayara.moraes@dataplace.com.br    |  jBu/h84nUum0DzfFUdyvAQ== |  
  | joaofrancisco.frabetti@gmail.com   |  8W3YzVZBmX7qefCTiF4kOg== |
 
  
  
