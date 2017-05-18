package blueocean.samplepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginSite {

	protected WebDriver driver;
	
	public LoginSite(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//input[contains(@name,'userName')]")
	protected WebElement userNameField;

	protected void enterEmail() {
		userNameField.sendKeys("mercury1");
	}
	
	@FindBy(xpath = "//input[contains(@name,'password')]")
	protected WebElement passwordField;

	protected void enterPassword() {
		passwordField.sendKeys("mercury1");
	}
	
	@FindBy(xpath = "//input[contains(@src,'images')]")
	protected WebElement signInButton;

	protected void clickSignInButton() {
		signInButton.click();
	}
	
	
	public void loginApplication() {

		enterEmail();
	//	enterPassword();
		clickSignInButton();
		}

}
