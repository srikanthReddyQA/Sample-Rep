package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver extends var{

	
	//public WebDriver driver;
	
	@BeforeMethod
	public WebDriver openbrowser () throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		//ChromeOptions options =new ChromeOptions();
		
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		return driver;		
		
	}
	
	@AfterMethod
	public void  aftertest() {
				
		driver.close();
	}
}
