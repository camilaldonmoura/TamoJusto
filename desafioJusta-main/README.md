<h2 align="center"> Desafio QA Justa </h2>
<h4 align="center"> #ModoRun ativado </h4>

------


## Automação de testes utilizando Selenium e Cucumber 

Meu objetivo: automatizar a compra de um produto de eCommerce: http://automationpractice.com/

- 1 caso de teste
- 3 cenários

#### :space_invader: Tecnologias utilizadas:

**Selenium**: Framework responsável por fazer a integração do código Java com a linguagem Gherkin (Cucumber), abrindo o browser e realizando os testes de comportamento

**Junit**: testar o software em Java

**Cucumber**: Framework responsável por traduzir uma linguagem humana em código Java

**Java**: Linguagem de programação utilizada

**Maven**: Gerenciador das dependências para o Java

**Eclipse**: IDE para implementação do projeto


#### :space_invader: Cenário Um

	Feature: Validar Compra de produto com o pagamento por Cheque
		Scenario: 
               Given heroi abrir site
               And como heroi tenho "<emailLogin>", "<passwdLogin>" credenciais validas 
               And estou logado no site
               And escolho o produto que desejo comprar
               And seleciono o frete "<txtAdditionalInformation>"
               And concordo com os Terms of service
               When seleciono a opcao Pay by check
               And confirmo meu Pedido
               Then minha compra foi concluida com sucesso
           

#### :space_invader: Cenário Dois

	Feature: Validar Compra de produtos alterando o endereço de Cobrança
		Scenario: 
               And que como heroi tenho "<emailLogin>", "<passwdLogin>" credenciais validas 
               And escolho o produto que desejo
               And incluo o produto no carrinho de compras
               And confirmo o Proceed to checkout
               And altero os dados de cobranca "<newAddress>", "<newAddress2>", "<newCity>", "<NewPostCode>", "<NewPhone>", "<MobilePhone>", "<information>","<OtherAddress>", "<leiaPlease>"
               When finalizo o checkout
               And escolho a opcao Pay by Bank Wire
               And confirmo o pedido
               Then minha compra foi concluida
           
           
#### :space_invader: Cenário Três

	Feature: Validar Compra de produtos alterando o endereco de Entrega
		Scenario: 
               Given eu abrir o site indicado
               And estou logado no site "<emailLogin>", "<passwdLogin>"
               And escolho o produto indicado
               And altero o endereco de entrega "<newAddress>", "<newAddress2>", "<newCity>", "<NewPostCode>", "<NewPhone>", "<MobilePhone>", "<information>", "<OtherAddress>", "<leiaPlease>"
               When finalizo minhas compras
               And escolho a opcao Pay By Check
               And confirmo meu pedido
               Then a compra foi concluida com sucesso
               
               
 #### :space_invader: Pré-requisito

Já deve ter instalado em seu computador:

- Java; - se você não tiver certeza digite `java -version` seu cmd
-  Jdk
- Eclipse;

Se você não tiver, verifique estes links: [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR) | [Eclipse](https://www.eclipse.org/downloads/) | [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)


#### :space_invader:Detalhes

**Plugin:** Cucumber

**Driver:** Este projeto está funcionando no ChromeDriver, mas você pode escolher qualquer navegador [Download](https://www.selenium.dev/downloads/)
<p> Configurando Selenium no computador:
<p>Fazer o download do Chrome Web Driver e adiconar o arquivo (descompactado) dentro da pasta "driver" na raíz do projeto 




## Estrutura de arquivos



    
    src
        |-- main
        |  |-- java
        |  |  |  |-- actions
        |  |  |  |  |-- defaultpackage
        |  |  |  |  |  |  |-- ChoosingProductsActions.java -- Mapeamento dos métodos de ações
        
        |  |  |  |  |  |-- pages
        |  |  |  |  |  |  |-- ChoosingProductsPage.java -- Mapeamento dos elementos
        
        |  |  |  |  |  |-- utils
        |  |  |  |  |  |  |-- Configuracao.java -- Arquivo que mapeia os localizadores da página
    
    src
        |-- test
        |  |-- java
        |  |  |  |  |-- defaultpackage
        |  |  |  |  |  |  |-- TestChoosingProducts.java -- Arquivo que especifica o contexto comum aos casos de testes
      

        |  |  |  |  |  |-- stepdefinitions
        |  |  |  |  |  |  |-- cenarioUm.java
        |  |  |  |  |  |  |-- cenarioDois.java
        |  |  |  |  |  |  |-- cenarioTres.java
       

       |  |  |  |  |  |-- Runner.java -- Arquivo que configura a inicialização do Java test
       
     src

       |  |-- test
       |  |  |-- resources
       |  |  |  |  |  |-- features -- Gherkin com os casos de teste de acordo com a especificação do cliente   

   
  
 
 
 ------

:speech_balloon: [Linkedin](https://www.linkedin.com/in/camilalnmoura/)


