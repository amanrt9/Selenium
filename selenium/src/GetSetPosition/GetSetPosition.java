package GetSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Point p=new Point(100,500);
		driver.manage().window().setPosition(p);
		
		Point e=driver.manage().window().getPosition();
		System.out.println(e);
		
		
		

	}

}
