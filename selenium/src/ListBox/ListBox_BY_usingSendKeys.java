package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox_BY_usingSendKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	       driver.get("https://www.amazon.in");
	       WebElement w=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	       w.sendKeys(Keys.ARROW_DOWN);
	       w.sendKeys(Keys.ARROW_DOWN);
	       w.sendKeys(Keys.ARROW_DOWN);
	       
	     //to scroll down or up to the Page
	     WebElement wd=  driver.findElement(By.tagName("body"));
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);

	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);
	     wd.sendKeys(Keys.PAGE_DOWN);

	
	
	}

}
