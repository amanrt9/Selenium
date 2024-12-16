package Selenium_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		   WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	       
	       WebElement w=driver.findElement(By.xpath("//input[@name='email']"));
	       
	       WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
	       
	       wait.until(ExpectedConditions.elementToBeClickable(w));
	       
	       wait.until(ExpectedConditions.visibilityOf(w));
	       
	       wait.until(ExpectedConditions.alertIsPresent());
	       
	       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	       
	       wait.until(ExpectedConditions.elementToBeSelected(w));
	       
	       
	}

}
