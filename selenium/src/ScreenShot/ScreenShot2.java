package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException   
	{
     WebDriver driver= new ChromeDriver();
    driver.get("https://www.youtube.com/");
    TakesScreenshot ts=(TakesScreenshot)driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File des=new File("\\D:\\Ts\\AMAN1.png");
    FileHandler.copy(src, des);
    
	}

}
