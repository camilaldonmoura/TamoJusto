package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriveContext;





public class LoggingAccountPage {
	public LoggingAccountPage() {
		PageFactory.initElements(DriveContext.getDriver(), this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")	
	protected WebElement linkSignIn;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"email\"]")	
	protected WebElement txtEmailLoggin;
	
	@FindBy(how=How.ID, using="SubmitLogin")	
	protected WebElement btnSubmitLogin;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"passwd\"]")	
	protected WebElement txtpasswdLoggin;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"login_form\"]/div/p[1]/a")	
	protected WebElement txtforgotPasswd;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"email\"]")	
	protected WebElement txtEmailforgot;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"form_forgotpassword\"]/fieldset/p/button")	
	protected WebElement btnForgotPasswd;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"center_column\"]/ul/li/a")	
	protected WebElement btnBackLogin;
}
