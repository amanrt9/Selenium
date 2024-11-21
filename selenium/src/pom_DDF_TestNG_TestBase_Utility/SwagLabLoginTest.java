package pom_DDF_TestNG_TestBase_Utility;

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

public class SwagLabLoginTest extends TestBase {


	SwagLabLoginPagePF s;
	SwagLabHomePage h;
	SwagLabMenuPage m;


	@BeforeClass
	public void OpenFileExcle() throws EncryptedDocumentException, IOException
	{

		openBrowser();
		s=new SwagLabLoginPagePF(driver);
		h=new SwagLabHomePage(driver);
		m=new SwagLabMenuPage(driver);

	}

	@BeforeMethod
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {
		String username=Utility.getTD(0, 0);
		s.enterSwagLabLoginpageUn(username);

		String password=Utility.getTD(0, 1);
		s.enterSwagLabLoginPass(password);

		Thread.sleep(2000);
		s.clickSwagLabLoginbtn();
	}

	@Test
	public void homepage() throws InterruptedException, EncryptedDocumentException, IOException {


		String logoText=Utility.getTD(0, 2);
		h.verifySwagLabLogin(logoText);



		Thread.sleep(2000);
		h.clickSwagLabHomePageMenuBtn();
	}

	@AfterMethod
	public void logout() throws InterruptedException, IOException {


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


}



