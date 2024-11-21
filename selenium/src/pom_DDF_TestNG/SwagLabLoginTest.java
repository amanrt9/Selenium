package pom_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.SwagLabLoginPage;

public class SwagLabLoginTest {
     WebDriver driver;
     Sheet sh;
     SwagLabLoginPagePF s;
     SwagLabHomePage h;
     SwagLabMenuPage m;
    
     
	@BeforeClass
	public void OpenBroweser() throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("D:\\Automation\\Selenium\\HandleWebElements\\ExtractData.xlsx");
	 sh=WorkbookFactory.create(file).getSheet("DDF");

	    driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	 @BeforeMethod
	 public void login() throws InterruptedException {
	     s=new SwagLabLoginPagePF(driver);

		String username=sh.getRow(0).getCell(0).getStringCellValue();
		s.enterSwagLabLoginpageUn(username);

		String password=sh.getRow(0).getCell(1).getStringCellValue();
		s.enterSwagLabLoginPass(password);
		
		Thread.sleep(2000);
		s.clickSwagLabLoginbtn();
	 }

      @Test
      public void homepage() throws InterruptedException {
		 h=new SwagLabHomePage(driver);
		
		String logoText=sh.getRow(0).getCell(2).getStringCellValue();
		h.verifySwagLabLogin(logoText);
		
		Thread.sleep(2000);
		h.clickSwagLabHomePageMenuBtn();
      }
      
      @AfterMethod
      public void logout() throws InterruptedException {

    	m=new SwagLabMenuPage(driver);
		Thread.sleep(2000);

		m.clickSwagLabMenuPageaboutBtn();//about 
		Thread.sleep(2000);

		driver.navigate().back();//go back
		Thread.sleep(2000);

		h.clickSwagLabHomePageMenuBtn();//click again on  menu 
		Thread.sleep(2000);

		m.clickSwagLabMenuPageLogoutBtn(); //click on logout

		Thread.sleep(2000);
      }
      
      @AfterClass
      public void closeBrowser() {
		driver.quit();
      }
      //

	}
	


