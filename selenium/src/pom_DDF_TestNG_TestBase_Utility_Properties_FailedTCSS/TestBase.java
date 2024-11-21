package pom_DDF_TestNG_TestBase_Utility_Properties_FailedTCSS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	WebDriver driver;
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.get(Utility.getPFdata("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
