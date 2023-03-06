//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pagefactory.HomePage_PF;
////import pagefactory.Browserlaunch_PF;
//import pagefactory.LogOut_PF;
//import pagefactory.LoginPage_PF;
//
//
//public class File_Upload {
//	
////user is on login page
//	WebDriver driver =null;
//	LoginPage_PF login;
//	LogOut_PF logout;
////	Browserlaunch_PF browserlaunch;
//	HomePage_PF homepage;
//	
//	@SuppressWarnings("deprecation")
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
////		browserlaunch =new Browserlaunch_PF(driver);
////		browserlaunch.browserLaunch();
//		String projectPath = System.getProperty("user.dir");
//		  System.out.println("Project path is:"+projectPath);
//		  System.setProperty("Webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		  //System.setProperty("Webdriver.gecko.driver",projectPath+"/src/test/resources/drivers/geckodriver.exe");
//		  //driver = new FirefoxDriver();
//		  driver =new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.navigate().to("http://svlu0363:8080/awc/#/showHome");
//		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//		  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		 
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		login =new LoginPage_PF(driver);
//		login.enterUsername(username);
//		login.enterPassword(password); 
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		login =new LoginPage_PF(driver);
//		login.clickLogin();
//	}
//
//	@SuppressWarnings("deprecation")
//	@And("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		System.out.println("Inside step User navigated to home page");
//		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//		  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	    
//	}
//	@And("user uploads file")
//	public void user_uploads_file(){
//		homepage= new HomePage_PF(driver);
//		homepage.fileupload();
//		
//	}
//	
//	@Then("file should upload")
//	public void file_should_upload(){
//		System.out.println("file is uploaded successfully");
//	}
//
//}
