#@cadastro
#Feature: Cadastro em E-commerce


	#Background: Abrir site
		#Given usuario abrir site "http://automationpractice.com/index.php"
	
	
				
	#Scenario Outline: Acessar site 
		#When usuario clicar no botao linkSignIn
	  #And preencher o  "<email>"  no campo de E-mail
		#And clicar no botao CreateAccount
		#And quando abrir pagina de cadastro
		#And selecionar o TitleChoose
		#And preencher o "<FirstName>", "<LastName>", "<passwd>", "<comboboxDay>", "<comboboxMonths>", "<comboboxYears>" 
		#And clicar na  Newsletter
		#And clicar na  opcional
		#And preencher a  "<txtCompany>", "<txtAddress>", "<txtAddressTwo>", "<txtCity>", "<State>"
		#And preencher o  "<txtPostalCode>", "<txtAdditionalInformation>", "<txtHomePhone>", "<txtPhoneMobile>", "<txtAddressAlias>"
		#And clicar no botao SubmitAccount
		#Then fechar o navegador
	