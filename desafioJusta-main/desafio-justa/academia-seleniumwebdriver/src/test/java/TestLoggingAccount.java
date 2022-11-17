import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;
import utils.DriveContext;
import actions.CreatAccountAction;
import actions.LoggingAccountAction;
import pages.LoggingAccountPage;




class TestLoggingAccount {
	WebDriver driver;
	LoggingAccountAction account;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage() .window() .maximize();
		System.out.println(driver.getTitle());
		Assert.assertEquals("My Store", driver.getTitle());
		
		DriveContext.setDriver(driver);
		account = new LoggingAccountAction();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	void testLoginSenhaValidaNoveCaracteres () {
		account.clicarSingIn();
		account.writeEmailLoggin("moura.camilaluiza@gmail.com");
		account.writeTxtpasswdLoggin("Teste@123");
		account.clickSubmitLogin();
	}
	
	@Test
	void testLoginSenhaInvalidaSemLetraMaiuscula () {
		account.clicarSingIn();
		account.writeEmailLoggin("moura.camilaluiza@gmail.com");
		account.writeTxtpasswdLoggin("teste@123");
		account.clickSubmitLogin();
	}
	
	@Test
	void testLoginSenhaInvalidaSemCaracterEspecial () {
		account.clicarSingIn();
		account.writeEmailLoggin("moura.camilaluiza@gmail.com");
		account.writeTxtpasswdLoggin("teste123");
		account.clickSubmitLogin();
	}
	
	@Test
	void testLoginSenhaInvalidaSemNumeros () {
		account.clicarSingIn();
		account.writeEmailLoggin("moura.camilaluiza@gmail.com");
		account.writeTxtpasswdLoggin("Teste@");
		account.clickSubmitLogin();
	}
	
	@Test
	void testLinkEsqueciMinhaSenha () {
		account.clicarSingIn();
		account.clickForgotPasswd();
		account.writetxtEmailforgot("moura.camilaluiza@gmail.com");
		account.clickBtnForgotPasswd();
		account.clickbtnBackLogin();
		account.clicarSingIn();
		account.writeEmailLoggin("moura.camilaluiza@gmail.com");
		account.writeTxtpasswdLoggin("Teste@123");
		account.clickSubmitLogin();
	}
	
	@Test
	void testLoginLoginEmailNaoCadastrado () {
		account.clicarSingIn();
		account.writeEmailLoggin("moura.luizacamila@gmail.com");
		account.writeTxtpasswdLoggin("Teste@123");
		account.clickSubmitLogin();
	}
		
}