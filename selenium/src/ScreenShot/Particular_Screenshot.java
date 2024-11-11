package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Particular_Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 
		 
		WebElement w=driver.findElement(By.xpath("//img[@class='_97vu img']"));
		File src=w.getScreenshotAs(OutputType.FILE);
		File des=new File("\\D:\\Ts\\logofacebook.png");
		FileHandler.copy(src, des);

	}

}
