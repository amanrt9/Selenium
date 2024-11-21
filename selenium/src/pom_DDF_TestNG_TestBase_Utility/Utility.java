package pom_DDF_TestNG_TestBase_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;

import pom.SwagLabLoginPage;

public class Utility {

	public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Automation\\Selenium\\HandleWebElements\\ExtractData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		String data=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;
	}

	


}
