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
import utils.DriveManager;
import pages.CreatAccountPage;



public class cadastroStep {
	
	DriveManager manager = new DriveManager();
	WebDriver driver = manager.AbrirUrl();
	CreatAccountAction actions = PageFactory.initElements(driver, CreatAccountAction.class);
	
	
public void cadastroStep() {
	}

@Given("usuario abrir site {string}")
public void usuario_abrir_site(String url) {
	driver.get(url);
	driver.manage() .window() .maximize();
	System.out.println(driver.getTitle());
	Assert.assertEquals("My Store", driver.getTitle());
	
	
}
@When("usuario clicar no botao linkSignIn")
public void usuario_clicar_no_botao_link_sign_in() {
	actions.clicarSingIn();
			
	}
@And("preencher o  {string}  no campo de E-mail")
public void preencher_o_no_campo_de_e_mail(String email) {
    actions.preencherEmail(email);
    driver.findElement(By.id("email_create")) .getAttribute("value");
	Assert.assertEquals("camilalnm@gmail.com", driver.findElement(By.id("email_create")).getAttribute("value"));
	}
@And("clicar no botao CreateAccount")
public void clicar_no_botao_create_account() {
	WebElement btnCreateAccount = driver.findElement(By.id("SubmitCreate"));
	actions.clicarCreateAccount();
	//Assert.assertEquals("", btnCreateAccount.getAttribute("value"));    
  
	}
@When("quando abrir pagina de cadastro")
public void quando_abrir_pagina_de_cadastro() {
    
	}

@And("selecionar o TitleChoose")
public void selecionar_o_title_choose() {
	actions.clickradioTitleChoose();
	Assert.assertFalse(driver.findElement(By.id("uniform-id_gender2")).isSelected());
	}
@And("preencher o {string}, {string}, {string}, {string}, {string}, {string}")
public void preencher_o(String FirstName, String LastName, String passwd, String comboboxDay, String comboboxMonths, String comboboxYears) {
	actions.writetxtFirstName(FirstName);
	driver.findElement(By.id("customer_firstname")) .getAttribute("value");
	Assert.assertEquals("Camila", driver.findElement(By.id("customer_firstname")).getAttribute("value"));
	
	actions.writetxtLastName(LastName);
	driver.findElement(By.id("customer_lastname")) .getAttribute("value");
	Assert.assertEquals("Moura", driver.findElement(By.id("customer_lastname")).getAttribute("value"));
	
	actions.writetxtPasswd(passwd);
	driver.findElement(By.id("passwd")) .getAttribute("value");
	Assert.assertEquals("Teste@123", driver.findElement(By.id("passwd")).getAttribute("value"));
	
	actions.comboboxDay(comboboxDay);
	actions.comboboxMonths(comboboxMonths);
	actions.comboboxYears(comboboxYears);	
	}
@And("clicar na  Newsletter")
public void clicar_na_newsletter() {
	actions.clickradioCheckNewsletter();
	Assert.assertFalse(driver.findElement(By.id("uniform-newsletter")).isSelected());
	}
@And("clicar na  opcional")
public void clicar_na_opcional() {
	actions.clickradioCheckOptin();
	Assert.assertFalse(driver.findElement(By.id("uniform-optin")).isSelected());    
	}
@And("preencher a  {string}, {string}, {string}, {string}, {string}")
public void preencher_a(String txtCompany, String txtAddress, String txtAddressTwo, String txtCity, String State) {
	actions.writetxtCompany(txtCompany);
	actions.writetxtAddress(txtAddress);
	actions.writetxtAddressTwo(txtAddressTwo);
	actions.writetxtCity(txtCity);
	actions.comboboxState(State);
	}
@And("preencher o  {string}, {string}, {string}, {string}, {string}")
public void preencher_o(String txtPostalCode, String txtAdditionalInformation, String txtHomePhone, String txtPhoneMobile, String txtAddressAlias) {
	actions.writetxtPostalCode(txtPostalCode);
	actions.writetxtAdditionalInformation(txtAdditionalInformation);
	actions.writetxtHomePhone(txtHomePhone);
	actions.writetxtPhoneMobile(txtPhoneMobile);
	actions.writetxtAddressAlias(txtAddressAlias);    
	}
@And("clicar no botao SubmitAccount")
public void clicar_no_botao_submit_account() {
	WebElement btnCreateAccount = driver.findElement(By.id("submitAccount"));
    actions.clickbtnSubmitAccount();
    //Assert.assertEquals("", btnCreateAccount.getAttribute("value")); 
	}
@Then("fechar o navegador")
public void fechar_o_navegador() {
	driver.close();
	
  
	}

}