package Multiple_window_Handle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Windows_Tab {

	public static void main(String[] args) {
     WebDriver d=new ChromeDriver();
     d.get("https://www.google.com/");
     d.switchTo().newWindow(WindowType.TAB);
     d.get("https://www.facebook.com/");
     d.switchTo().newWindow(WindowType.WINDOW);
     d.get("https://www.saucedemo.com/");
     
       Set<String> s=d.getWindowHandles();
       ArrayList<String> al=new ArrayList<String>(s);
       
       for(String x:al)
       {
    	  System.out.println(x); 
       }
       String saucedemo=al.get(2);
       d.switchTo().window(saucedemo);
       
       String actTitile=d.getTitle();
       String expTitle="Swag Labs";
       if(actTitile.equals(expTitle))
       {
    	   System.out.println("Pass");
       }
       else {
    	   System.out.println("fail");
       }
	}

}
