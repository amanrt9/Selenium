package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllTypeOfData
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file= new FileInputStream("D:\\Selenium\\HandleWebElements\\ExtractData.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sh=book.getSheet("Sheet1");
		//Sheet sh= WorkbookFactory.create(file).getSheet("Sheet1");	
		
		int rowsize=sh.getLastRowNum();
		 for(int i=0;i<=rowsize;i++)
		 {
			 int cellsize=sh.getRow(i).getLastCellNum()-1;
			 for(int j=0;j<=cellsize;j++)
			 {
				 Cell s1 = sh.getRow(i).getCell(j);//get cell
				 
				 CellType type = s1.getCellType();//get cell type
				 
				 if(type==CellType.STRING)  //check cell type
				 {
				 String value = s1.getStringCellValue();//get cell value
				 System.out.print(value+" ");
				 }
				 
				 else if(type==CellType.NUMERIC)
				 {
				 double value = s1.getNumericCellValue();
				 System.out.print(value+" ");
				 }
				 
				 else if(type==CellType.BOOLEAN)
				 {
				 boolean value = s1.getBooleanCellValue();
				 System.out.print(value+" ");
				 }
				 
				 }
			 System.out.println();
			 
		 }
		

	}

}
