package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTypes {

	public static void main(String[] args)
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/login/");
       
    //  driver.findElement(By.xpath("")).sendKeys("Aman");
	}

}
