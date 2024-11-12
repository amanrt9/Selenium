package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled_TestNG {
	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}
	@Test(invocationCount=2,enabled=false)
	public void user1() {
		System.out.println("User 1");
	}
	@Test
	public void user2()
	{
		System.out.println("User 2");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("Logout");
	}	
	
}


