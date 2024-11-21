package pom_DDF_TestNG_TestBase_Utility_Properties_FailedTCSS;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.SwagLabLoginPage;

public class SwagLabLoginTest extends TestBase
{


	SwagLabLoginPagePF s;
	SwagLabHomePage h;
	SwagLabMenuPage m;
	int TCID;


	@BeforeClass
	public void OpenBrowwsera() throws EncryptedDocumentException, IOException
	{

		openBrowser();
		s=new SwagLabLoginPagePF(driver);
		h=new SwagLabHomePage(driver);
		m=new SwagLabMenuPage(driver);

	}

	@BeforeMethod
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {
		String username=Utility.getPFdata("UN");
		s.enterSwagLabLoginpageUn(username);

		String password=Utility.getPFdata("PASS");
		s.enterSwagLabLoginPass(password);

		Thread.sleep(2000);
		s.clickSwagLabLoginbtn();
	}

	@Test
	public void homepage() throws InterruptedException, EncryptedDocumentException, IOException {

		TCID=01;
		String expText=Utility.getTD(0, 2);
		String actText=h.verifySwagLabLogin();
		Assert.assertEquals(actText, expText,"Logo Not match");

		h.clickSwagLabHomePageMenuBtn();
	}

	@AfterMethod
	public void logout(ITestResult s) throws InterruptedException, IOException {

		if(s.getStatus()==ITestResult.FAILURE)
		{
			Utility.getSS(driver,TCID);
		}

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



