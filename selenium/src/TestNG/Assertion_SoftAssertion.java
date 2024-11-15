package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_SoftAssertion {
	SoftAssert soft=new SoftAssert();
	@Test
	public void abc()
	{  
		soft.assertTrue(false, "not equals");;//failed
		soft.assertTrue(true,"pass");//this is run because we use soft Assert but not show because it is pass
		soft.assertEquals("login", "logout","not match");//this is execute n show error in console because we we soft assert
		soft.assertAll();
		
	}

}
