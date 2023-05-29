package basic_hybrid_frame_work;

import org.testng.annotations.Test;

public class test_script extends generic_script
{
	@Test
	public void validlogin() throws InterruptedException
	{
	pom_script p=new pom_script(driver);
	p.username("ramya");
	Thread.sleep(2000);
	p.password("nuthan");
	Thread.sleep(2000);
	p.click_btn();
	}
}
