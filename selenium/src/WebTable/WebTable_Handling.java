package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Handling
{

	public static void main(String[] args)  
	{
          WebDriver driver=new ChromeDriver();
          
          driver.get("file:///C:/Users/Hp/OneDrive/Desktop/WebTable.html");
          
          WebElement table = driver.findElement(By.xpath("//table[@id='123']"));

          // Locate all rows in the table
          List<WebElement> rows = table.findElements(By.tagName("tr"));

          // Handle the header row (first row)
          WebElement headerRow = rows.get(0);
          
          List<WebElement> headers = headerRow.findElements(By.tagName("th"));
     
          for (WebElement header : headers) //for Header
          {
              System.out.print(header.getText() + "\t");
          }
          System.out.println();

          
          for (int i = 1; i < rows.size(); i++) // Loop through each remaining row (data rows)
               	  
          { 
        	  // Start from 1 to skip the header row
              List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            
              for (WebElement cell : cells)
              {
                  System.out.print(cell.getText() + "\t");
              }
              System.out.println();
          }    
               
	}

}
