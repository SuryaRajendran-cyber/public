//package pagefactory;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//
//public class Browserlaunch_PF {
//	
//	@FindBy(xpath=("//input[@placeholder='User Name']"))
//	WebElement txt_username;
//
//	
//	WebDriver driver;
//	
//	public Browserlaunch_PF(WebDriver driver) {
//		this.driver =driver;
//		PageFactory.initElements(driver,this);
//	}
//	
//	public void browserLaunch() {
//		  String projectPath = System.getProperty("user.dir");
//		  System.setProperty("Webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		  //System.setProperty("Webdriver.gecko.driver",projectPath+"/src/test/resources/drivers/geckodriver.exe");
//		  //driver = new FirefoxDriver();
//		  driver =new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.navigate().to("http://svlu0363:8080/awc/#/showHome");
//		  txt_username.click();
//		
//	}
//
//}
