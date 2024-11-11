package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hp/OneDrive/Desktop/multi.html");
		WebElement w=driver.findElement(By.xpath("//select[@id='abc123']"));
		Select sel=new Select(w);
		System.out.println(sel.isMultiple());
		
		sel.selectByVisibleText("NZ");
		sel.selectByVisibleText("IND");
	   //sel.deselectAll();
		
		List<WebElement> l=sel.getAllSelectedOptions();
		for(WebElement x:l)
		{
			String d=x.getText();
			System.out.println(d);
		}
		
	System.out.println("---------");
		List<WebElement> l1=sel.getOptions();
		for(WebElement g:l1)
		{
			String h=g.getText();
			System.out.println(h);
		}

	
	
	}

}
