package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriveContext;


public class CreatAccountPage {
	
	public CreatAccountPage() {
		PageFactory.initElements(DriveContext.getDriver(), this);
		
	}
		
	@FindBy(how=How.LINK_TEXT, using="Sign in")	
	protected WebElement linkSignIn;
	
	@FindBy(how=How.ID, using="email_create")	
	protected WebElement txtEmail;
	
	@FindBy(how=How.ID, using="SubmitCreate")	
	protected WebElement btnCreateAcconunt;

	@FindBy(how=How.ID, using="uniform-id_gender2")	
	protected WebElement radioTitleChoose;
	
	@FindBy(how=How.ID, using="customer_firstname")	
	protected WebElement txtFirstName;
	
	@FindBy(how=How.ID, using="customer_lastname")	
	protected WebElement txtLastName;
	
	@FindBy(how=How.ID, using="passwd")	
	protected WebElement txtPasswd;
	
	@FindBy(how=How.ID, using="days")	
	protected WebElement comboboxDay;
	
	@FindBy(how=How.ID, using="months")	
	protected WebElement comboboxMonths;
	
	@FindBy(how=How.ID, using="years")	
	protected WebElement comboboxYears;
	
	@FindBy(how=How.ID, using="uniform-newsletter")	
	protected WebElement radioCheckNewsletter;
	
	@FindBy(how=How.ID, using="uniform-optin")	
	protected WebElement radioCheckOptin;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"company\"]")	
	protected WebElement txtCompany;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"address1\"]")	
	protected WebElement txtAddress;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"address2\"]")	
	protected WebElement txtAddressTwo;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"city\"]")	
	protected WebElement txtCity;
	
	@FindBy(how=How.ID, using="id_state")
	protected WebElement comboboxState;
	
	@FindBy(how=How.NAME, using="postcode")	
	protected WebElement txtPostalCode;
	
	@FindBy(how=How.NAME, using="other")	
	protected WebElement txtAdditionalInformation;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"phone\"]")	
	protected WebElement txtHomePhone;
	
	@FindBy(how=How.NAME, using="phone_mobile")	
	protected WebElement txtPhoneMobile;
	
	@FindBy(how=How.ID, using="alias")	
	protected WebElement txtAddressAlias;
	
	@FindBy(how=How.ID, using="submitAccount")	
	protected WebElement btnSubmitAccount;
}