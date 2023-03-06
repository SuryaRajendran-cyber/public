//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class loginPage {
//	
//	WebDriver driver;
//
//	By txt_username = By.name("userName");
//	By txt_password = By.xpath("//input[@placeholder='Password']");  
//	By btn_login =  By.xpath("//button[normalize-space()='Sign in']");
//	public loginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//	
//	public void enterUsername(String username) {
//		driver.findElement(txt_username).sendKeys(username);
//	}
//    public void enterPassword(String password) {
//		driver.findElement(txt_password).sendKeys(password);
//	}
//    public void clickLogin() {
//		driver.findElement(btn_login).click();
//  	}
//   public void loginValidUser(String username, String password) {
//    	driver.findElement(txt_username).sendKeys(username);
//    	driver.findElement(txt_password).sendKeys(password);
//    	driver.findElement(btn_login).click();
//    }
//    
//	
//}
// 