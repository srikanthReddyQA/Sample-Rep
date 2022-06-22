package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage  {

	
	WebDriver driver;
	
	public Loginpage(WebDriver driver ) {
		this.driver=driver;
		
	}
	
	public void loginmethod() {
		
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("test");
		
	}
	
	
}
