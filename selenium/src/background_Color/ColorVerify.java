package background_Color;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorVerify {

	public static void main(String[] args) {

		String ExpectedColor="#0866ff";
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement w=driver.findElement(By.xpath("//button[@name='login']"));
		
		String Color1=w.getCssValue("background-color");
		  
		String ActColor=Color.fromString(Color1).asHex();
		
		if(ExpectedColor.equals(ActColor)) {
			System.out.println("Blue Color");
		}
		else {
			System.out.println("Other Color");
		}
		
	}

}

