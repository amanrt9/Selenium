package pageFactoryPom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SwagLabLoginPage;

public class SwagLabLoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        SwagLabLoginPagePF s=new SwagLabLoginPagePF(driver);
        s.enterSwagLabLoginpageUn();
        s.enterSwagLabLoginPass();
        Thread.sleep(2000);
        s.clickSwagLabLoginbtn();
         
        
        SwagLabHomePage h=new SwagLabHomePage(driver);
        Thread.sleep(2000);
        h.clickSwagLabHomePageMenuBtn();
        
        SwagLabMenuPage m=new SwagLabMenuPage(driver);
        Thread.sleep(2000);
        
        m.clickSwagLabMenuPageaboutBtn();//about 
        Thread.sleep(2000);
        
        driver.navigate().back();//go back
        Thread.sleep(2000);
        
        h.clickSwagLabHomePageMenuBtn();//click again on  menu 
        Thread.sleep(2000);
        
        m.clickSwagLabMenuPageLogoutBtn(); //click on logout
        
        Thread.sleep(2000);
        driver.quit();
       
	}

}
