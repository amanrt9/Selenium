package selenium;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayYouTubeVDO
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();


		driver.manage().window().maximize();


		driver.navigate().to("https://www.youtube.com/");

		Thread.sleep(2000);

		//    driver.switchTo().newWindow(WindowType.WINDOW);
		//    driver.get("https://www.google.com/");
		//    Thread.sleep(2000);  
		//    driver.close();
		//    Thread.sleep(2000);
		//    driver.quit();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ve haniya");

		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();


		//  driver.findElement(By.xpath("(//ytd-video-renderer[1])//a[@id='thumbnail']")).click();//Not working thats why we use elementstobeclicakble method

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement firstVideo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ytd-video-renderer)[1]//a[@id='thumbnail']")));
		//elementToBeClickable ensures that the element is not only present but also ready for interaction, which helps avoid errors and improves script reliability.
		firstVideo.click();//theory is below the code

	}
}
/*Why Use elementToBeClickable?
		Using elementToBeClickable has specific advantages:

			Wait for Interaction: Even if an element is present in the DOM, it might not be ready for interaction (i.e., clickable). For example, an element could be obscured by another element or not yet fully rendered. Using elementToBeClickable waits until the element is both present and in a state that allows user interaction.

			Avoid Exceptions: If you tried to click an element that is present but not clickable, Selenium would throw an exception. By using elementToBeClickable, you ensure that you're only attempting to click when the element is ready, which reduces the risk of runtime errors.*/