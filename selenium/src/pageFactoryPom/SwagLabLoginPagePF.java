package pageFactoryPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPagePF {


      @FindBy(xpath="//input[@id='user-name']") private WebElement un; //private WebElement un=driver.FindElement(By.xpath(""));
      @FindBy(xpath="//input[@id='password']") private WebElement pass;
      @FindBy(xpath="//input[@id='login-button']") private WebElement loginbtn;
       
       public SwagLabLoginPagePF(WebDriver driver) //early/before initilization
       {
    	   PageFactory.initElements(driver, this);//late /after/lazy initilization
       }
       
       public void enterSwagLabLoginpageUn()
       {
    	   un.sendKeys("standard_user");
    	   
       }
       public void enterSwagLabLoginPass()
       {
    	   pass.sendKeys("secret_sauce");
       }
	
       public void clickSwagLabLoginbtn()
       {
    	   loginbtn.click();
       }

}
