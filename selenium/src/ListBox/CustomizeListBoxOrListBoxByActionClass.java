package ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CustomizeListBoxOrListBoxByActionClass 
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement w=driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control'])[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(w).click().perform();
		
        act.sendKeys(Keys.ENTER).perform();//for select 1st becoz here its is by defualt selected 1st value
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		

	}

}
