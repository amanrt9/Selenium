package ChromeOptionsImp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_Notification {

	public static void main(String[] args) {

		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(cp);
		driver.get("https://pushalert.co/demo");
		
	}

}
