package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
public void initializeBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\chrome driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}
