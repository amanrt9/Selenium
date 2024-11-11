package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationcentral.com/demo/alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		driver.findElement(By.xpath("//button[@class='bg-green-500 text-white px-4 py-2 rounded']")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
	alt.sendKeys("Hello I am Aman");
	alt.accept();
		
	}

}
