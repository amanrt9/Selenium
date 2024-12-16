package ChromeOptionsImp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {

		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--headless");
		 WebDriver driver=new ChromeDriver(cp);
		 driver.get("https://www.facebook.com/");
		 if(driver.getTitle().equals("Facebook – log in or sign up"))
		 {
			 System.out.println("match");}
		 else
		 {
			 System.out.println("not match");
		 }
		 
	}

}
