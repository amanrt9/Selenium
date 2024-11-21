package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_TestNG {
	@Test
	public void login()
	{
		String expected="Login";
		String actual="Logout";
		Assert.assertEquals(actual,expected,"This is not Matching");		
	}
	@Test
	public void check()
	{
		String act="login";
		String exp="login";
		Assert.assertEquals(act,exp,"This is not Matching");
	}
	
	@Test
	public void abc()
	{
		String act="Login";
		String exp="Login";
		Assert.assertNotEquals(act,exp,"This is matching");
		
	}
	@Test
	public void xyz()
	{
		String act="login";
		String exp="logout";
		Assert.assertNotEquals(act, exp,"This is matching");
	}
	
	@Test
	public void dfg()
	{   
		Assert.assertTrue(false);//failed
	}
	
	@Test
	public void ser()
	{    boolean s=true;
		Assert.assertTrue(s);//pass
	}
	
	@Test
	public void wer()
	{
		boolean n=false;
		Assert.assertFalse(n);//pass
	}
	@Test
	public void qwe()
	{
		boolean d=true;
		Assert.assertFalse(d,"found true");//failed
		
	}
	
	
	

}
