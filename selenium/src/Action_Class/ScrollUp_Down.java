package Action_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUp_Down {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//Scroll up and down by pixel
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 400).perform();//here left 0 is constant for left right and right is y axis for up down
        Thread.sleep(2000);
        act.scrollByAmount(0, -400).perform();//scroll up
	}

}
