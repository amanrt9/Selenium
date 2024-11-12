package TestNG_Groups;

import org.testng.annotations.Test;

public class GroupBySingUp {
	@Test(groups= {"sanity"})
	  void test_signupByEmail()
	  {
		  System.out.println("sign up by email...");
	  }
	  
	  @Test(groups= {"sanity"})
	  void test_signupByFB()
	  {
		  System.out.println("sign up by FB...");
	  }
	  
	  @Test(groups= {"sanity"})
	  void test_signupByTwitter()
	  {
		  System.out.println("sign up by Twitter...");
	  }

}
