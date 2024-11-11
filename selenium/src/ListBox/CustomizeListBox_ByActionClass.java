package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizeListBox_ByActionClass {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");

		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		//month.sendKeys("June");
		
		Actions act=new Actions(driver);
		act.moveToElement(month).click().perform();
		act.sendKeys(Keys.HOME).perform();//due to home button it goes to 1st value
		
		for(int i=1;i<=8;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();//for sep it is 8 becoz bydefault 1s is selected
		Thread.sleep(350);
		}
		
		
	}

}
