package pom_With_DDF;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement menuBtn;
    @FindBy(xpath="//div[@class='app_logo']")private WebElement logo;
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSwagLabHomePageMenuBtn()
	{
		menuBtn.click();
	}
	
	public void verifySwagLabLogin(String expText)
    {
 	   String actText=logo.getText();
 	   if(actText.equals(expText))
       {
 		System.out.println("Login Sucessfull");   
      	
       }
 	   else {
 		   System.out.println("Login Unsuccesfull");
 	   }
    }
	
}
