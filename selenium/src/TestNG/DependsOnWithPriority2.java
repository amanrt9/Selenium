package TestNG;

import org.testng.annotations.Test;

public class DependsOnWithPriority2 {
	@Test(priority=5)
    public void openApp()
    {
   	 System.out.println("OpenApp");
    }
    
    @Test(priority=1,dependsOnMethods= {"openApp"})
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
    
    @Test(priority=2)
    public void logout()
    {
   	 System.out.println("Logout");
    }


}
