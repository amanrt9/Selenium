package ChromeOptionsImp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetBrowserName_GetBrowserVersion1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver.getCapabilities().getBrowserName());
		System.out.println(driver.getCapabilities().getBrowserVersion());
	}

}
