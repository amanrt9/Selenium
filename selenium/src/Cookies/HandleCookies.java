package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	       driver.get("https://tutorialsninja.com/demo/");
	       driver.manage().window().maximize();
	       
	       Set<Cookie>Allcookie=driver.manage().getCookies();
	       
	       for(Cookie c:Allcookie)
	       {
	    	   System.out.println(c);
	       }
	       
	       System.out.println(Allcookie.size());
	       
	}

}
