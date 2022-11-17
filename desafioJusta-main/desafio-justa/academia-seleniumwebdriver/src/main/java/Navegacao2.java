import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Constants;

import java.util.List;

import org.openqa.selenium.*;

public class Navegacao2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		
		//abrir a pagina e maximizar janela
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage() .window() .maximize();
		
		//clicar em cadastro
		WebElement linkSingIn = driver.findElement(By.linkText("Sign in"));
		linkSingIn.click();
		
		//Escrever e-mail
		
		WebElement txtEmail = driver.findElement(By.id("email_create"));
		txtEmail.sendKeys("moura.camilaluiza@gmail.com");
		
		WebElement btnCreateAccount = driver.findElement(By.id("SubmitCreate"));
		btnCreateAccount.click();
		
		try {
		Thread.sleep(5000);
		WebElement newsletter = driver.findElement(By.id("newsletter"));
			
			if (newsletter.isSelected()) {
				newsletter.click();
			}
	} catch (InterruptedException e) {
		e.printStackTrace();
			
		
	}
		
	Select comboboxMes = new Select(driver.findElement(By.id("months")));
	//comboboxMes.selectByValue("7");
	comboboxMes.selectByIndex(0);
	//comboboxMes.selectByVisibleText("April ");
	
		List<WebElement> meses = comboboxMes.getOptions();
		
		for(int i=0; i < meses.size(); i++) {
			System.out.println(meses.get(i).getText());
		}
	
		// clicando no botao cadastro

		driver.findElement(By.id("SubmitCreate")).click();
				
		// clicando no bot�o carrinho
				
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[3]/div/a")).click();
				
		//selecionando seção  "mulheres"
				
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
				
					
		//System.out.println(driver.getTitle());
		//driver.navigate() .refresh();
		driver.quit();
		
		
		// 
		
		WebElement SignIn = driver.findElement(By.linkText("Sign in"));
		System.out.println(SignIn.getText());
		System.out.println(SignIn.getAttribute("title"));
		SignIn.click();
			

				

	}
}