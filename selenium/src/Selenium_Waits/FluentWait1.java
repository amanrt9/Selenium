package Selenium_Waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait1 {

	public static void main(String[] args) {
		  
		WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	       
	       WebElement w=driver.findElement(By.xpath("//input[@name='email']"));
	       
	       FluentWait wait=new FluentWait(driver);
	       
	       wait.withTimeout(Duration.ofSeconds(5));
	       
	       wait.pollingEvery(Duration.ofSeconds(1/2));
	       
	       wait.ignoring(NoSuchElementException.class);
	       
	       wait.until(ExpectedConditions.alertIsPresent());
	      
	       wait.until(ExpectedConditions.visibilityOf(w));
	       
	       wait.until((ExpectedConditions.elementToBeClickable(w)));
	       
	       wait.until(ExpectedConditions.elementToBeSelected(w));
	       
	       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	       

	}

}
