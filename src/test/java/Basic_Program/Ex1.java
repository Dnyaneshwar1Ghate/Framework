package Basic_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
		 Thread.sleep(1000);
		driver.manage().window().maximize();		
		boolean b;
		b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/d1iv/div/div[1]/div/img")).isDisplayed();
	try
	{
		if(b=true)
		{
			System.out.println("logo is available");
		}
		else
		{
			System.out.println("logo is not available");
		}
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		driver.quit();
	}
	}
		
	}

