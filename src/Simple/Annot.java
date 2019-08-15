package Simple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annot {

	
	@BeforeMethod
	
	public void method()
	{
		System.out.println("Login Into Application");
	}
	
	
	@Test(priority=1)
	
	public void method2()
	{
		System.out.println("Customer Added");
	}

	@Test(priority=2)
	
	public void method3()
	{
		System.out.println("Customer Edit");
	}
	
	@AfterMethod
	
	public void method4()
	{
		System.out.println("Logout Application");
	}
}
