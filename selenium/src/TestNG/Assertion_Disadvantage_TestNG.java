package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Assertion_Disadvantage_TestNG {
	@Test
	public void abc()
	{
		Assert.assertTrue(false);//failed
		Assert.assertTrue(true);//not executed because in hard Assert one the any assert is failed then following assert is not executed
		
	}
	//Due to that We use Soft Assert
	

}
