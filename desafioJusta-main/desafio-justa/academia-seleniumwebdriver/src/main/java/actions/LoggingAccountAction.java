package actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreatAccountPage;
import pages.LoggingAccountPage;
import utils.DriveContext;



public class LoggingAccountAction extends LoggingAccountPage {
		
		protected WebDriverWait wait; 
		
	public LoggingAccountAction() {
		wait = new WebDriverWait(DriveContext.getDriver(),10);		
		}
	
	public void clicarSingIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();					
	}
	public void writeEmailLoggin(String emailLoggin) {
		wait.until(ExpectedConditions.visibilityOf(txtEmailLoggin)).sendKeys(emailLoggin);
	}
	public void clickSubmitLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmitLogin)).click();
	}
	public void writeTxtpasswdLoggin(String passwdLoggin) {
		wait.until(ExpectedConditions.visibilityOf(txtpasswdLoggin)).clear();
		wait.until(ExpectedConditions.visibilityOf(txtpasswdLoggin)).sendKeys(passwdLoggin);
	}
	public void clickForgotPasswd() {
		wait.until(ExpectedConditions.elementToBeClickable(txtforgotPasswd)).click();
	}
	public void writetxtEmailforgot(String emailForgot) {
		wait.until(ExpectedConditions.visibilityOf(txtEmailforgot)).sendKeys(emailForgot);
	}
	public void clickBtnForgotPasswd() {
		wait.until(ExpectedConditions.elementToBeClickable(btnForgotPasswd)).click();
	}
	public void clickbtnBackLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(btnBackLogin)).click();
	}
	
}
