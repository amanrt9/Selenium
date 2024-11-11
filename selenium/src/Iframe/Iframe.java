package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
     WebDriver driver =new ChromeDriver();
     driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
     WebElement w=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
     driver.switchTo().frame(w);
     driver.findElement(By.xpath("//button[contains(text(),'me to')]")).click();
	}

}
