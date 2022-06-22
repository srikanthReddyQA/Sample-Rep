package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegistarPage {

WebDriver driver;
	
	public RegistarPage(WebDriver driver ) {
		this.driver=driver;
		
	}
	public void Reg() {
		
	
		
		WebElement searchbar = driver.findElement(By.name("q1"));
		searchbar.sendKeys("test");
		
	}
}
