package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Virat");
		Thread.sleep(2000);
		List<WebElement> w= driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));

		
		String actual="virat kohli net worth";
		for(WebElement x:w)
		{
			String d= x.getText();
			System.out.println(d);
			if(d.equals(actual))
			{
				x.click();
				break;
			}

		}

	}

}
