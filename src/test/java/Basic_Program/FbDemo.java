package Basic_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
		 Thread.sleep(1000);
		driver.manage().window().maximize();
		
		 gmailDemo();
		tearDown();
	}
	public static  void gmailDemo() throws InterruptedException
	{
		driver.navigate().to("http://www.gmail.com");
	 Thread.sleep(1000);
		
	}
	public static void tearDown()
	{
		driver.close();
	}

}
