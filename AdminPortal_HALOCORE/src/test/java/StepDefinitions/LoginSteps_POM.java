package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.Browserlaunch_PF;
import pagefactory.LogOut_PF;
import pagefactory.LoginPage_PF;


public class LoginSteps_POM {
	
//user is on login page
	WebDriver driver =null;
	LoginPage_PF login;
	LogOut_PF logout;
	//Browserlaunch_PF browserlaunch;
	
	@SuppressWarnings("deprecation")
	@Given("user is on login page")
	public void user_is_on_login_page() {
		//hello all
		//browserlaunch =new Browserlaunch_PF(driver);
		//browserlaunch.browserLaunch();
		String projectPath = System.getProperty("user.dir");
		  System.out.println("Project path is:"+projectPath);
		  System.setProperty("Webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		  //System.setProperty("Webdriver.gecko.driver",projectPath+"/src/test/resources/drivers/geckodriver.exe");
		  //driver = new FirefoxDriver();
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("http://svlu0363:8080/awc/#/showHome");
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login =new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password); 
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		login =new LoginPage_PF(driver);
		login.clickLogin();
	}

	@SuppressWarnings("deprecation")
	@And("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside step User navigated to home page");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	}
	@And("clicks on profile button")
	public void clicks_on_profile_button(){
		logout =new LogOut_PF(driver);
		logout.clickProfile(); 
	}
	@And("clicks on sign out")
	public void clicks_on_sign_out(){
		logout =new LogOut_PF(driver);
     	logout.clickSignout(); 
	}
	@Then("user is navigated back to login page")
	public void user_is_navigated_back_to_login_page(){
		System.out.println("user is back to login page");
	}

}
