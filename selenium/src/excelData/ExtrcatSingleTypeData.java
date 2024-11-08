package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.SheetBuilder;

public class ExtrcatSingleTypeData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Selenium\\HandleWebElements\\ExtractData.xlsx");//open xcle file
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");//open sheet
		
		int rowsize=sh.getLastRowNum();//row size
		
		for(int i=0;i<=rowsize;i++)//for loop for row
		{
			int cellsize=sh.getRow(i).getLastCellNum()-1;//column size
			
			for(int j=0;j<=cellsize;j++)//for loop for column
			{
				String s=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(s+"  ");
			
			}
			System.out.println();
		}

	}

}
