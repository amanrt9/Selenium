package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimesOut_TestNG {

	@Test(timeOut=5000)
    public void TC01()
    {
      System.out.println("TimesOut Code");
   
    }
	@Test(timeOut=5000)
    public void TC012() throws InterruptedException
    {   
		Thread.sleep(7000); // to increase the time execution of TC
      System.out.println("TimesOut Code 2");;
   
    }
	

}
