package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_After_Class {

	@BeforeClass
	public void login()
	{
		System.out.println("Login");
	}
	@Test
	public void user1()
	{
		System.out.println("User 1");
	}
	@Test
	public void user2()
	{
		System.out.println("User 2");
	}
	
    @AfterClass
    public void logout()
    {
    	System.out.println("logout");
    }
	
	
	
}
