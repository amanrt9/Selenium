package pageFactoryPom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School_Test {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/");
		driver.manage().window().maximize();
		
		W3School_JS_Page w= new W3School_JS_Page(driver);
		w.click_W3School_JS_Page_TryitBtn();
		
		W3School_TryIt_Page t=new W3School_TryIt_Page(driver);
		t.click_W3School_TryIt_Page_dateTimeBtn(driver);
	}

}
