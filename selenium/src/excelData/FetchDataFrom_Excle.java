package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFrom_Excle {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{       
     FileInputStream file=new FileInputStream("\\D:\\Selenium\\HandleWebElements\\ExtractData.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	String value=sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	//         int rownum=sh.getLastRowNum()+1;
	//         System.out.println(rownum);
	
	   double a=  sh.getRow(1).getCell(3).getNumericCellValue();
	   System.out.println(a);
	   
	   boolean b=sh.getRow(2).getCell(3).getBooleanCellValue();
	   System.out.println(b);


	}


}
