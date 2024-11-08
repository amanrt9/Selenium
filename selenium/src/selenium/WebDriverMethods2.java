package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods2 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.navigate().to("https://www.google.co.in/");
        
		 driver.switchTo().newWindow(WindowType.TAB);
		 
		 driver.get("https://www.facebook.com/login/");
		 
		 String link=driver.getCurrentUrl();
		 System.out.println(link);
		 

	}

}
