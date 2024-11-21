package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_By_Select 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement w=driver.findElement(By.xpath("//select[@id='country']"));

		Select sel=new Select(w);
		sel.selectByVisibleText("Canada");

		WebElement s=sel.getFirstSelectedOption();
		System.out.println(s.getText());

		boolean b=sel.isMultiple();
		System.out.println(b);

		
		List<WebElement>f=  sel.getOptions();
		for(WebElement d:f) 
		{
           System.out.println(d.getText());
		} 
		
		sel.selectByIndex(0);
	
		sel.selectByValue("brazil");
		
		


	}

}
