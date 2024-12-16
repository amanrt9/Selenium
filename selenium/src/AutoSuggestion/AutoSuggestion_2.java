package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_2 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("dhoni");
		Thread.sleep(2000);

		List<WebElement>w=driver.findElements(By.xpath("//ul/li//div[@class='wM6W7d']"));

		String expected="dhoni net worth";
		
		for(WebElement x:w)
		{
			String f=x.getText();
			System.out.println(f);
			if(expected.equals(f))
			{
				x.click();
				break;
			}
		}




	}

}
