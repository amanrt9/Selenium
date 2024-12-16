package GetSetSize;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetSize {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	    Dimension d= new Dimension(550, 350);
	    driver.manage().window().setSize(d);
	    
	    Dimension dr=driver.manage().window().getSize();
	    System.out.println(dr);

	}

}
