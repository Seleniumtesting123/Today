package Simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {
	
	
	WebDriver driver ;
	
	@Parameters(value = "SearchByName")
	
	@Test
	
	public void SearchByName(String SearchByName)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_j")).sendKeys(SearchByName);
	}

	
    @Parameters(value="SearchByEmailId")
	
	@Test
	
	public void SearchByEmailId(String SearchByEmailId)
	{
		System.out.println(SearchByEmailId);
	}
    
    @Parameters(value="LastName")
    
    @Test
    
    public void lastname(String LastName)
    {
    	driver.findElement(By.id("u_0_l")).sendKeys(LastName);
    }
}
