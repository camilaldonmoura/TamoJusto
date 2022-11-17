import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Constants;



public class Janela {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
				
				
		WebElement linkYoutube = driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[3]"));
		linkYoutube.click();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		
	

	}
}
