package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_By_RegularMethod
{

	public static void main(String[] args)
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://testautomationpractice.blogspot.com/");
      List<WebElement> wb=driver.findElements(By.xpath("//select[@id='country']/option"));
      //here if we do not take/option in xpath then it is use for select class but if we have to take a list then we use /option in xpath to get list
      String Expected="Japan";
     for(WebElement x:wb)
     {
    	String actual= x.getText();
    	System.out.println(actual);
    	if(Expected.equals(actual))
    	{
    		x.click();
    	}
     }
       
	}

}
