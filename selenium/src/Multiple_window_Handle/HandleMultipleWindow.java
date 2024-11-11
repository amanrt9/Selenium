package Multiple_window_Handle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String>ids=driver.getWindowHandles();
       ArrayList<String> al=new ArrayList<String>(ids);
       
      String c=al.get(1);
       
     driver.switchTo().window(c);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		String c1=al.get(0);
		driver.switchTo().window(c1);
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		
	}

}
