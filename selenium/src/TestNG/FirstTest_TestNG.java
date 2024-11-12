package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest_TestNG {
	    @Test
	    public void TC03_Print2()
	    {
	    	Reporter.log("Heyy",true); // when true print in emailable report and console //and if write false then only write in emailable report
	    }                              // by default if we don't write true false it is false
	    
	    @Test
	    public void TC01_openGoogle()
	    {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	    }
	      
	    @Test
	    public void TC02_print()
	    {
          Reporter.log("Hello From TestNG", true);
       
	    }
	

}
