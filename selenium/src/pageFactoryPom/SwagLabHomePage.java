package pageFactoryPom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement menuBtn;
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSwagLabHomePageMenuBtn()
	{
		menuBtn.click();
	}
    
	
}
