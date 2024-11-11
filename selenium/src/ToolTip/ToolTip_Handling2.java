package ToolTip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip_Handling2
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	       driver.get("https://www.redbus.in/");
	       driver.manage().window().maximize();
           Thread.sleep(2000);	 
           
	       WebElement w=driver.findElement(By.xpath("(//img[@class='img_rb_vertical'])[1]"));	    
	       Actions act=new Actions(driver);
	       Thread.sleep(2000);
	       act.moveToElement(w).perform();
	       
	       String expected="Online Bus Tickets Booking";
           String actual=w.getAttribute("title");
	       System.out.println(actual);
	       
	       if(expected.equals(actual))
	       {
	    	   System.out.println("Its Matching");
	       }
	       else {
	    	   System.out.println("Its Not Matching");
	       }
	}

}
