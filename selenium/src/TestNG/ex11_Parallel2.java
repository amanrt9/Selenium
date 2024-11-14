package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ex11_Parallel2
{       
	@Test
	public void openFlilpkartApp() throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	
}
