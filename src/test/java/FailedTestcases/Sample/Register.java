package FailedTestcases.Sample;

import org.testng.annotations.Test;

import methods.Driver;
import methods.RegistarPage;

public class Register extends Driver {
	
	@Test
	public static void Regst() throws InterruptedException {
	
	 RegistarPage ss = new RegistarPage(driver);
      ss.Reg();
	
	}
}
