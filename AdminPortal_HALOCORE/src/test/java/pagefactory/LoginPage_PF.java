package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	

	@FindBy(xpath=("//input[@placeholder='User Name']"))
	WebElement txt_username;
	@FindBy(xpath=("//input[@placeholder='Password']"))
	WebElement txt_password;
	@FindBy(xpath=("//button[normalize-space()='Sign in']"))
	
	WebElement btn_login;
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	public void clickLogin() {
		btn_login.click();
		// TODO Auto-generated method stub
		
	}
}

