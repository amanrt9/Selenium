package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
public static void main(String[] args) throws IOException
{
	
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.youtube.com/");
	 driver.manage().window().maximize();
	 
//	 TakesScreenshot ts=(TakesScreenshot)driver;
//	 File src=ts.getScreenshotAs(OutputType.FILE);
//	 File des=new File("\\D:\\Ts\\Aman.png");
//	 FileHandler.copy(src, des);
//	 
	 WebElement logo=driver.findElement(By.xpath("//yt-icon[@id='logo-icon']"));
     File src=   logo.getScreenshotAs(OutputType.FILE);
     File des=new File("\\D:\\Ts\\youyubelogo.png");
     FileHandler.copy(src, des);
     
}

}
