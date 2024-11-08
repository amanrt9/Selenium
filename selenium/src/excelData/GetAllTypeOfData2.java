package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllTypeOfData2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
     FileInputStream file=new FileInputStream("D:\\Selenium\\HandleWebElements\\ExtractData.xlsx");
     Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
     
     int rowsize=sh.getLastRowNum();
     
     for(int i=0;i<=rowsize;i++)
     {
    	 int cellsize=sh.getRow(i).getLastCellNum()-1;
    	 
    	 for(int j=0;j<=cellsize;j++)
    	 {    
    		 Cell c= sh.getRow(i).getCell(j);
    		 CellType type=c.getCellType();
    		 
    		 if(type==CellType.STRING)
    		 {
    			String s= c.getStringCellValue();
    			System.out.print(s+"   ");
    			 
    		 }
    		 else if(type==CellType.NUMERIC)
    		 {
    			 double x=c.getNumericCellValue();   
    			 System.out.print(x+"   ");
    		 }
    		 else if(type==CellType.BOOLEAN)
    		 {
    			 boolean b=c.getBooleanCellValue();
    			 System.out.print(b+"   ");
    		 }    		 
    		    		 
    	 }
		 System.out.println();

     }
     
     
	}
	
	

}
