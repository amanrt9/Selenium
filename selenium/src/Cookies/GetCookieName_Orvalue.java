package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookieName_Orvalue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	       driver.get("https://tutorialsninja.com/demo/");
	       driver.manage().window().maximize();
	       
	       Cookie c=driver.manage().getCookieNamed("currency");
	       
	       System.out.println(c);
	}

}
