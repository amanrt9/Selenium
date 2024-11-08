package pageFactoryPom;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3School_TryIt_Page 
{
   @FindBy(xpath="//iframe[@id='iframeResult']")private WebElement iframe;
   @FindBy(xpath="//button[contains(text(),'me to')]")private WebElement dateTimeBtn;
   
   public W3School_TryIt_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   
   }
   
   public void click_W3School_TryIt_Page_dateTimeBtn(WebDriver driver)
   {
	   Set<String>s=driver.getWindowHandles();
       ArrayList<String> a=new ArrayList<String>(s);
       for(String x:a)
       {
    	   System.out.print(x+" ");
       }
       String SecondTab=a.get(1);  //switch to second tab
       driver.switchTo().window(SecondTab);
     
       
       driver.switchTo().frame(iframe);//switch to iframe
       
       dateTimeBtn.click();
       
   }
   
}
