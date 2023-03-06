//package pagefactory;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class HomePage_PF {
//	
//
//	@FindBy(xpath=("//div[@class='aw-commands-showIconLabel aw-commands-commandIconButtonText ng-binding'][normalize-space()='Folders']"))
//	WebElement open_homefolder;
//	@FindBy(xpath=("//aw-popup-panel2[@id='ui-id-11']//aw-scrollpanel[@class='ng-scope aw-base-scrollPanel']"))
//	WebElement open_testfolder;
//	@FindBy(xpath=("//button[@aria-label='Add to']"))
//	WebElement btn_addicon;
//	@FindBy(xpath=("//input[@placeholder='Filter']"))
//	WebElement field_filter;
//	@FindBy(xpath=("//aw-list[@class='ng-isolate-scope']//div[@title='PDF']"))
//	WebElement select_pdf;
//	@FindBy(xpath=("//input[@title='No File Chosen']"))
//	WebElement choose_file;
//	@FindBy(xpath=("//button[@class='aw-base-blk-button ng-scope ng-isolate-scope aw-accent-highContrast']//aw-i18n[@class='ng-scope'][normalize-space()='Add']"))
//	WebElement btn_addfinal;
//	
//	WebDriver driver;
//	
//	public HomePage_PF(WebDriver driver) {
//		this.driver =driver;
//		PageFactory.initElements(driver,this);
//	}
//	
//	public void fileupload() {
//		open_homefolder.click();
//		open_testfolder.click();
//		btn_addicon.click();
//		field_filter.sendKeys("PDF");
//		field_filter.sendKeys(Keys.ENTER);
//		select_pdf.click();
//		choose_file.sendKeys("C:/Users/srajendran/Desktop/test2.txt");
//		btn_addfinal.click();
//		
//		
//	}
//
//}
//
