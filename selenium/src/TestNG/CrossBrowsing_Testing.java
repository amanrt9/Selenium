package TestNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class CrossBrowsing_Testing {
	
     @Parameters("browserName")
     
	@Test
	public void VerfifyLoginTC(String browserName) 
	{      WebDriver driver=null;
	  
		 if(browserName.equals("chrome"))
			 {
			  driver=new ChromeDriver();
			 }
		 else if( browserName.equals("firefox"))
		 {
			driver=new FirefoxDriver();
		 }
		 else if(browserName.equals("edge")) {
			 driver=new EdgeDriver();
		 }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		String actTitle = driver.getTitle();
		String expTitle = "Swag Labs";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
	}
}