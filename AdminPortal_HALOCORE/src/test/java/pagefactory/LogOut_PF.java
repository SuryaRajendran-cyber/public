package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_PF {
	

	@FindBy(xpath=("//img[@class='aw-avatar-icon aw-avatar-image ng-scope']"))
	WebElement btn_profile;
	@FindBy(xpath=("//button[contains(@class,'aw-commandId-cmdSignOut')]//div[contains(@class,'aw-commands-showIconLabel aw-commands-commandIconButtonText ng-binding')][normalize-space()='Sign Out']"))
	WebElement btn_signout;
	WebDriver driver;
	
	public LogOut_PF(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickProfile() {
		btn_profile.click();
	}
	public void clickSignout() {
		btn_signout.click();
	}

}

