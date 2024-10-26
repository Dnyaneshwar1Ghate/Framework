package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAccount 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		
		List<String>urls=new ArrayList<String>();
		urls.add("https://www.facebook.com");		
		urls.add("https://www.google.com");
		urls.add("https://www.amazon.com");
		urls.add("https://www.flipkart.com");
		urls.add("https://www.npav.net");

		WebDriver driver = new FirefoxDriver();
		try
		{
			for(String url:urls)
			{
				driver.get(url);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			driver.close();
		}
	
		
	}

}
