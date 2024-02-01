package Estater;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ExtentReportListener.class)
public class SearchPropertyEstater {

	WebDriver driver;
	
	@BeforeClass
	
	//Opening the browser
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	
driver.get("https://estater.com/");
		
		driver.manage().window().maximize();
	
	
	
	}
	
	
@Test
	
	public void SearchProperty() throws InterruptedException, AWTException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

//		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://estater.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement SelectCityDropDown =  driver.findElement(By.xpath("//div[@id='mat-select-value-1']"));
		
		
		SelectCityDropDown.click();
		
		Thread.sleep(3000);
		/*
		 * List<WebElement> CityOptions = driver.findElements(By.xpath(
		 * "(//div[@class='cdk-overlay-pane']//span[@class='mdc-list-item__primary-text'])"
		 * ));
		 * 
		 * 
		 * for(int i=0;i<CityOptions.size();i++) {
		 * System.out.println(CityOptions.get(i).getText());
		 * if(CityOptions.get(i).getText()=="Kuwait") {
		 * 
		 * 
		 * } }
		 */
		
		driver.findElement(By.xpath("(//div[@class='cdk-overlay-pane']//span[@class='mdc-list-item__primary-text'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Dasma");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//div[@class='mat-mdc-autocomplete-panel mdc-menu-surface mdc-menu-surface--open ng-tns-c41-3 ng-trigger ng-trigger-panelAnimation ng-star-inserted mat-primary mat-mdc-autocomplete-visible']//span)[1]")).click();
	
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(8000);

		driver.findElement(By.xpath("(//div[@class='items_container']//button)[1]")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//div[@class='header error-img'])[1]")).click();
		
		Thread.sleep(5000);
		
		String Address =	driver.findElement(By.xpath("//div[@class='property_sub_section txt_position ng-star-inserted']")).getText();
		
//		System.out.println(Address);
		
		Reporter.log(Address);
	
	}
	
	
		
		@AfterClass
		public void closeBrowser() {
	        // Close the browser
	        driver.quit();
	    }


		
		
	}
	

