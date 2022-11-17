package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import actions.CreatAccountAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Constants;
import utils.DriveManager;
import pages.CreatAccountPage;
import pages.LoggingAccountPage;
import pages.ChoosingProductsPage;
import actions.LoggingAccountAction;
import actions.ChoosingProductsAction;




public class purchaseStep {
	DriveManager manager = new DriveManager();
	WebDriver driver = manager.AbrirUrl();
	LoggingAccountAction actions2 = PageFactory.initElements(driver, LoggingAccountAction.class);
	ChoosingProductsAction actions3 = PageFactory.initElements(driver, ChoosingProductsAction.class);
	
	
	public void purchaseStep() {
			
	}

		
@Given("usuario acessa o site {string}")
			public void usuario_acessa_o_site(String url2) {
	driver.get(url2);
	driver.manage() .window() .maximize();
					
		}

@When("preenche as {string}, {string} credenciais validas")
		public void preenche_as_credenciais_validas(String emailLogin, String passwdLogin) {
	actions2.clicarSingIn();
	actions2.writeEmailLoggin(emailLogin);
	actions2.writeTxtpasswdLoggin(passwdLogin);
	actions2.clickSubmitLogin();		
		
	}
@And("escolhe o departamento feminino")
public void escolhe_o_departamento_feminino() {
    actions3.clickbtnWomen();
	}
@And("escolhe um produto disponivel")
public void escolhe_um_produto_disponivel() {
    actions3.clickselectSale();
	}

@And("coloca no carrinho de compras")
public void coloca_no_carrinho_de_compras() {
	actions3.clickbtnAddToCart();
	}

@And("confirma o checkout")
public void confirma_o_checkout() {
    actions3.clickbtnCheckout();
	}

@And("adciona mais um produto")
public void adciona_mais_um_produto() {
    actions3.clickbtnQuantityUp();
	}

@And("confirma o segundo checkout")
public void confirma_o_segundo_checkout() {
    actions3.clickbtnProceedCheckout();
	}

@And("deixei um {string} recado para o pessoal da academia qa2022")
public void deixei_um_recado_para_o_pessoal_da_academia_qa2022(String leiam) {
    actions3.writetxtLeiaEsseCampoPlease(leiam);
	}

@And("confirma o terceiro checkout")
public void confirma_o_terceiro_checkout() {
    actions3.clickbtnProceedCheckout2();
	}

@And("confirma os termos de servico")
public void confirma_os_termos_de_servico() {
    actions3.checkboxTerms();
	}
@And("confirma o quarto checkout")
public void confirma_o_quarto_checkout() {
    actions3.clickbtnProceedCheckout3();
	}

@And("seleciona pagamento por cheque")
public void seleciona_pagamento_por_cheque() {
	actions3.clicklinkPayByCheck();    
	}

@Then("seu pedido foi realizado com sucesso")
public void seu_pedido_foi_realizado_com_sucesso() {
	actions3.clickbtnConfirmMyOrder();
    
	}
}

