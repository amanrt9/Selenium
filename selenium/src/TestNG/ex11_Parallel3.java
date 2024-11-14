package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ex11_Parallel3
{
	@Test
	public void openGoogleApp() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		//driver.quit();
	}
}
