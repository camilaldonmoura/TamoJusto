package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;





public class DriveManager {

	private static WebDriver driver;
	
	public WebDriver AbrirUrl() {
		
		if (driver == null) {
			
			System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		DriveContext.setDriver(driver);
		return driver;
	}
	
	
		

}
