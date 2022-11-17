import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actions.CreatAccountAction;
import utils.Constants;
import utils.DriveContext;


class TestAutomationPractice {
	WebDriver driver;
	CreatAccountAction account;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage() .window() .maximize();
		System.out.println(driver.getTitle());
		Assert.assertEquals("My Store", driver.getTitle());
		
		DriveContext.setDriver(driver);
		account = new CreatAccountAction();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		account.clicarSingIn();
		account.preencherEmail("moura.camilaluiza@gmail.com");
		account.clicarCreateAccount();
		account.clickradioTitleChoose();
		account.writetxtFirstName("Camila");
		account.writetxtLastName("Moura");
		account.writetxtPasswd("Teste@123");
		account.comboboxDay("9");
		account.comboboxMonths("2");
		account.comboboxYears("1990");
		account.clickradioCheckNewsletter();
		account.clickradioCheckOptin();
		account.writetxtCompany("Accenture");
		account.writetxtAddress("155 6th Ave, U.S.A");
		account.writetxtAddressTwo("10th Floor");
		account.writetxtCity("New York");
		account.comboboxState("32");
		account.writetxtPostalCode("00000");
		account.writetxtAdditionalInformation("Important to carry document with photo for registration and release at the concierge.");
		account.writetxtHomePhone("+1 (212) 380-7700");
		account.writetxtPhoneMobile("+1 (212) 98888-7845");
		account.writetxtAddressAlias(" 155 6th Ave - NY");
		account.clickbtnSubmitAccount();
	}
}
