package pom_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SwagLabLoginPage;

public class SwagLabLoginTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Automation\\Selenium\\HandleWebElements\\ExtractData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		SwagLabLoginPagePF s=new SwagLabLoginPagePF(driver);

		String username=sh.getRow(0).getCell(0).getStringCellValue();
		s.enterSwagLabLoginpageUn(username);

		String password=sh.getRow(0).getCell(1).getStringCellValue();
		s.enterSwagLabLoginPass(password);
		
		Thread.sleep(2000);
		s.clickSwagLabLoginbtn();


		SwagLabHomePage h=new SwagLabHomePage(driver);
		
		String logoText=sh.getRow(0).getCell(2).getStringCellValue();
		h.verifySwagLabLogin(logoText);
		
		Thread.sleep(2000);
		h.clickSwagLabHomePageMenuBtn();

		SwagLabMenuPage m=new SwagLabMenuPage(driver);
		Thread.sleep(2000);

		m.clickSwagLabMenuPageaboutBtn();//about 
		Thread.sleep(2000);

		driver.navigate().back();//go back
		Thread.sleep(2000);

		h.clickSwagLabHomePageMenuBtn();//click again on  menu 
		Thread.sleep(2000);

		m.clickSwagLabMenuPageLogoutBtn(); //click on logout

		Thread.sleep(2000);
		driver.quit();

	}
	

}
