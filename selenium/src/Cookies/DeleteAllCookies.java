package Cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	       driver.get("https://tutorialsninja.com/demo/");
	       driver.manage().window().maximize();
	       
	      System.out.println("Cookies Before Deleting="+driver.manage().getCookies().size());//3
	      
	      driver.manage().deleteAllCookies();
	      
	      System.out.println("Cookies After Deleting="+driver.manage().getCookies().size());//3
	      
	      
 
	}

}
