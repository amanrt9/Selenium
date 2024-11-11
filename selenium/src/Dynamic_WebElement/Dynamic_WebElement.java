package Dynamic_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebElement 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	       driver.get("https://www.flipkart.com/search?q=redmi&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=of");
	       WebElement w=driver.findElement(By.xpath("((//div[@class='_5OesEi'])[1]//span)[4]"));
	       
	       String rating_Count=w.getText();
	       System.out.println(rating_Count);
	}

}
