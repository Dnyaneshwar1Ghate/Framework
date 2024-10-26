package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationForAmazon {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
				
			WebDriver driver = new FirefoxDriver();
			try {
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				driver.get("https://www.amazon.com");
				WebElement  searchBox=driver.findElement(By.id("twotabsearchtextbox"));
				searchBox.sendKeys("Laptop");
				
				WebElement searchButton =driver.findElement(By.id("nav-search-submit-button"));
				searchButton.click();
				
				WebElement Clickon=driver.findElement(By.cssSelector(".widgetId\\=search-results_1 > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(2) > a:nth-child(1) > span:nth-child(1)"));
				Clickon.click();
				
				}catch(Exception e)
			{
						e.printStackTrace();
				}
			finally {
				Thread.sleep(1000);
			//	driver.close();
			}
			
			
			
	}

}
