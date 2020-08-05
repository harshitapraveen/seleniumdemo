package axisbank;

import org.testng.annotations.Test;


	public class Runner extends DriverSetup 
	{
		
	@Test (priority =0)
	public void runChrome()
	{
	       driver = setUpChrome();             
	       Applicationflow.code();
    } 
	
//	@Test (priority = 1)
//	public void runFirefox()
//	{	             
//	       driver = setUpFirefox();
//	       Applicationflow.code();
//    }

//	@Test (priority = 2)
//	public void runIE()
//	{
//	     driver = setUpIE();
//	     Applicationflow.code();
//	     
//	}
	
}

	      
