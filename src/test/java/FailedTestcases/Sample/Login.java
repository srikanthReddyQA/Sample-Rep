package FailedTestcases.Sample;

import org.testng.annotations.Test;

import methods.Driver;
import methods.Loginpage;

public class Login extends Driver {

	
	
	
	@Test
	public static void Login() throws InterruptedException {
	
	
	Loginpage log = new Loginpage(driver);
   log.loginmethod();
	}
	
	
}



