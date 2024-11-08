package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException 
	{  
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.navigate().to("https://www.google.co.in/");
        
		 driver.switchTo().newWindow(WindowType.TAB);
		 
		 driver.get("https://www.facebook.com/login/");
		 
	      String actual=driver.getTitle();
	      String expected="Log in to Facebook";
	      
	      if(actual.equals(expected))
	      {
	    	  System.out.println("Pass");
	      }
	      else {
	    	  System.out.println("Fail");
	      }
	}

}
