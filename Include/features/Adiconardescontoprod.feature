#language: pt
#encoding: UTF-8
#author: Luiza
#version: 1.0

Funcionalidade: Adicionar desconto

  Esquema do Cenario: : Desconto produto
  Dado que acesso a aplicação
  E adiciono email <email>
  E adiciono senha <senha>
  Quando clico no produto 
  Então adiciono desconto ao produto

Exemplos:

	| 				email 						         |     senha |
	|  mayara.moraes@dataplace.com.br    |  jBu/h84nUum0DzfFUdyvAQ== | 