package Priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script1 {
	@Test(priority = 1)
	public void try1()
	{
		Reporter.log("1",true);
		
	}
	@Test(priority = 1)
	public void try2()
	{
		Reporter.log("2",true);
	}
	

}
