package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExtrcatRowDAta {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
          FileInputStream file=new FileInputStream("\\D:\\Selenium\\HandleWebElements\\ExtractData.xlsx");
          Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1"); 
          
          int cellsize=sh.getRow(0).getLastCellNum();
          
          for(int i=0;i<=cellsize-1;i++)
          {
        	  String s=sh.getRow(0).getCell(i).getStringCellValue();
        	  System.out.println(s);
          }
	}

}
