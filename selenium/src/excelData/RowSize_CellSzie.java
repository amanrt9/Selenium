package excelData;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowSize_CellSzie {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("\\D:\\Selenium\\HandleWebElements\\ExtractData.xlsx");
		
		 Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		 
		int rowsize= sh.getLastRowNum()+1;//rowsize
		System.out.println(rowsize);
		
		int cellsize=sh.getRow(0).getLastCellNum();//column size
		System.out.println(cellsize);
        
	}

}
