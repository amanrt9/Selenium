package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class GetTypeOfCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Selenium\\HandleWebElements\\ExtractData.xlsx");
        Sheet sh= WorkbookFactory.create(file).getSheet("Sheet1");
       CellType type =sh.getRow(2).getCell(0).getCellType();
       System.out.println(type);
     
	}

}
