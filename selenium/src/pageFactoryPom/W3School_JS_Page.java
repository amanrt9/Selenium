package pageFactoryPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3School_JS_Page
{
   @FindBy(xpath="//a[@class='w3-btn']" )private WebElement tryitBtn;
   
   public W3School_JS_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   
   }
   public void click_W3School_JS_Page_TryitBtn()
   {
	   tryitBtn.click();
   }
}
