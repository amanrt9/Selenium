package pom_DDF_TestNG_TestBase_Utility_Properties_FailedTCSS;

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
	
	public String verifySwagLabLogin()
    {
 	   String actText=logo.getText();
 	   return actText;
    }
	
}
