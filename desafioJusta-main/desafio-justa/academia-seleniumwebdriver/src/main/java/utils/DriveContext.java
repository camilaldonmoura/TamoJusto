package utils;

import org.openqa.selenium.WebDriver;

public class DriveContext {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	public static void setDriver(WebDriver driver) {
		DriveContext.driver = driver;
	}

}
