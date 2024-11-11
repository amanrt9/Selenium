package ToolTip;

import java.util.LinkedHashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip_Handling {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	   
	       WebElement w=driver.findElement(By.xpath("//div[@jscontroller='unV4T']"));
	       Actions act=new Actions(driver);
	       act.moveToElement(w).perform();
	       
	       String expected="Search by voice";
	       
	       String Actual=w.getAttribute("aria-label");//here in get attribute take that attribute that has same text in tool tip but in 90% the attribute is title here getText() is not working
	       System.out.println(Actual);
	       
	       if(expected.equals(Actual))
	       {
	    	   System.out.println("its matching");
	       }
	       else {
	    	   System.out.println("Its Not Matching");
	       }
	}
}
