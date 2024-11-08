package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwagLabLoginPage 
{
     private WebElement un;
     private WebElement pass;
     private WebElement loginbtn;
     
     public SwagLabLoginPage (WebDriver driver)//before/early initilization
     {
    	 un=driver.findElement(By.xpath("//input[@id='user-name']"));
    	 pass=driver.findElement(By.xpath("//input[@id='password']"));
    	 loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));

     }
     
     public void enterUsername()
     {
    	 un.sendKeys("standard_user");
     }
     public void enterPass()
     {
    	 pass.sendKeys("secret_sauce");	 
     }
     public void clickLoginbtn()
     {
    	 loginbtn.click();
     }
}
