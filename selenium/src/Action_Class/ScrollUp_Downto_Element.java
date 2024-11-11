package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUp_Downto_Element 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		WebElement w= driver.findElement(By.xpath("//a[text()='Careers']"));

		Actions act=new Actions(driver);
		act.scrollToElement(w).perform();
	}

}
