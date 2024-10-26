package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		
	//get title
	System.out.println(driver.getTitle());
	//get current url
	System.out.println(driver.getCurrentUrl());
	//close browser
	//System.out.println(driver.getPageSource());
	Thread.sleep(3000);
	driver.close();
	
	
		
	}

}
