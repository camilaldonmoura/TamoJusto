package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CreatAccountPage;
import utils.DriveContext;

public class CreatAccountAction extends CreatAccountPage {
	
	protected WebDriverWait wait; 
	
	public CreatAccountAction() {
		wait = new WebDriverWait(DriveContext.getDriver(),10);		
	}	
	public void clicarSingIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
				
	}	
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);

	}
	public void clicarCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCreateAcconunt)).click();
	
	}	
	public void clickradioTitleChoose() {
		wait.until(ExpectedConditions.elementToBeClickable(radioTitleChoose)).click();
	
	}	
	public void writetxtFirstName(String firstname) {
		wait.until(ExpectedConditions.visibilityOf(txtFirstName)).sendKeys(firstname);
	
	}	
	public void writetxtLastName(String lastname) {
		wait.until(ExpectedConditions.visibilityOf(txtLastName)).sendKeys(lastname);

	}	
	public void writetxtPasswd(String passwd) {
		wait.until(ExpectedConditions.visibilityOf(txtPasswd)).sendKeys(passwd);

	}	
	public void comboboxDay(String days) {
		Select combo = new Select(comboboxDay);	
		combo.selectByValue(days);	
				
	}	
	public void comboboxMonths(String months) {
		Select combo = new Select(comboboxMonths);	
		combo.selectByValue(months);	
				
	}	
	public void comboboxYears(String years) {
		Select combo = new Select(comboboxYears);	
		combo.selectByValue(years);	
				
	}
	public void clickradioCheckNewsletter() {
		wait.until(ExpectedConditions.elementToBeClickable(radioCheckNewsletter)).click();
	
	}	
	public void clickradioCheckOptin() {
		wait.until(ExpectedConditions.elementToBeClickable(radioCheckOptin)).click();
	
	}
	public void writetxtCompany(String company) {
		wait.until(ExpectedConditions.visibilityOf(txtCompany)).sendKeys(company);
	
	}
	public void writetxtAddress(String address) {
		wait.until(ExpectedConditions.visibilityOf(txtAddress)).sendKeys(address);
	
	}
	public void writetxtAddressTwo(String address2) {
		wait.until(ExpectedConditions.visibilityOf(txtAddressTwo)).sendKeys(address2);
	
	}
	public void writetxtCity(String city) {
		wait.until(ExpectedConditions.visibilityOf(txtCity)).sendKeys(city);
	
	}
	public void comboboxState(String state) {
		Select combo = new Select(comboboxState);	
		combo.selectByValue(state);
				
	}
	public void writetxtPostalCode(String zip) {
		wait.until(ExpectedConditions.visibilityOf(txtPostalCode)).sendKeys(zip);
	
	}
	public void writetxtAdditionalInformation(String addInf) {
		wait.until(ExpectedConditions.visibilityOf(txtAdditionalInformation)).sendKeys(addInf);
	
	}
	public void writetxtHomePhone(String homephone) {
		wait.until(ExpectedConditions.visibilityOf(txtHomePhone)).sendKeys(homephone);
	
	}
	public void writetxtPhoneMobile(String phonemobile) {
		wait.until(ExpectedConditions.visibilityOf(txtPhoneMobile)).sendKeys(phonemobile);
		
	}
	public void writetxtAddressAlias(String alias) {
		wait.until(ExpectedConditions.visibilityOf(txtAddressAlias)).sendKeys(alias);
	
	}
	public void clickbtnSubmitAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmitAccount)).click();
	
	}
	
}
