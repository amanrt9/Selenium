package TestNG;
import org.testng.annotations.Test;

public class AlwaysRunWith_DependsOn {
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
     @Test(dependsOnMethods= {"openApp","login"})
     public void search()
     {
    	 System.out.println("Search");
     }
     @Test(dependsOnMethods= {"openApp","login"},alwaysRun=true)
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
