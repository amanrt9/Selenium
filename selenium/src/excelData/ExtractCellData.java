package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExtractCellData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Selenium\\HandleWebElements\\ExtractData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowsize=sh.getLastRowNum();
        
		for(int i=0;i<=rowsize;i++)
		{
			String s=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(s);
		}
		
	}

}
