package TestNG_Groups;

import org.testng.annotations.Test;

public class GroupByPayment {

	   @Test(groups= {"sanity","regression","functional"})
	   void paymentInRupees()
	   {
		   System.out.println("Pay in rupees");
	   }
	   
	   @Test( groups = { "regression", "functional"})
	   void paymentInDoller()
	   {
		   System.out.println("pay in doller");
	   }

}
