package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_By_ActionClass {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	       driver.get("https://www.flipkart.in");
	       WebElement w=driver.findElement(By.xpath("//span[text()='Login']"));
	       Actions act =new Actions(driver);
	      act.moveToElement(w).perform();//hover
	       
	     driver.findElement(By.xpath("(//li[@class='AT0fUR'])[6]")).click();
	     
	     // act.contextClick(w).perform();
	      // act.click(w).perform();
	      
	   
	     
	      
	      

	}

}
