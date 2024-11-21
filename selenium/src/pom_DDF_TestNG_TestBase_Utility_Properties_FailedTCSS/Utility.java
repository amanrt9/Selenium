package pom_DDF_TestNG_TestBase_Utility_Properties_FailedTCSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Property;
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

	public static void getSS(WebDriver driver, int testCaseID) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Hp\\git\\Selenium\\selenium\\ScreenShot\\TCid_"+testCaseID+".jpg");
		FileHandler.copy(src, des);
	}

	public static String getPFdata(String key) throws IOException
	{  
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\git\\Selenium\\selenium\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		String value= p.getProperty(key);
		return value;
	}


}
