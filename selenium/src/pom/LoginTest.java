package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         
         SwagLabLoginPage s=new SwagLabLoginPage(driver);
         s.enterUsername();
         s.enterPass();
         Thread.sleep(2000);
         s.clickLoginbtn();
	}

}
