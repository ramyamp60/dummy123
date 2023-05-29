package practice_hybrid_frame_work;

import org.testng.annotations.Test;

public class test_script1 extends generic_script1
{
@Test
public void validsignin() throws InterruptedException
{
	pom_script2 p=new pom_script2(driver);
	p.lgnlink();
	Thread.sleep(2000);
	p.email("ramyam60@gmail.com");
	Thread.sleep(2000);
	p.password("ramya1234");
	Thread.sleep(2000);
	p.clicklgn();
			
}
}
