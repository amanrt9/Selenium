package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddCookie {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		Set<Cookie>BeforeAddcookie=driver.manage().getCookies();

		for(Cookie cc:BeforeAddcookie)
		{
			System.out.println(cc);
		}

		Cookie c=new Cookie("America","Donald Trump");
		driver.manage().addCookie(c);

		Set<Cookie>AfterAddcookie=driver.manage().getCookies();

		for(Cookie c1:AfterAddcookie)
		{
			System.out.println(c1);
		}


	}

}
