package Selenium_Waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      // Thread.sleep(5000);
       driver.quit();
	}

}
