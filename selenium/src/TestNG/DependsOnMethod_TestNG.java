package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod_TestNG {
	//if their is no priority keyword then all is 0 priority but if their is dependent method then it run first
	//same in that case their is no priority keyword in any method so openApp run first
     @Test()
     public void openApp()
     {
    	 System.out.println("OpenApp");
     }
     
     @Test(dependsOnMethods= {"openApp"})
     public void login()
     {
    	 System.out.println("Login");
     }
     @Test
     public void search()
     {
    	 System.out.println("Search");
     }
     @Test
     public void advSearch()
     {
    	 System.out.println("AdvSearch");
     }
     @Test
     public void logout()
     {
    	 System.out.println("Logout");
     }
     
}
