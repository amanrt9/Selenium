package TestNG;

import org.testng.annotations.Test;

public class Priority_TestNG {
   //if there is no priority then byDefault it is 0 and we can give negative priority also
	//-2>0>2 priority
	 @Test(priority=1)
	 public void login()
	 {
		 System.out.println("Login");
	 }
	 
	 @Test(priority=2)
	 public void user1()
	 {
		 System.out.println("User 1");
	 }
	 @Test(priority=3)
	 public void User2()
	 {
		 System.out.println("USer 2");
	 }
}
