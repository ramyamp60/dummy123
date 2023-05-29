package p_o_m_frame_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_facebook {
	@Test
	public void create_account() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:facebook.com");
		POM_script p=new POM_script(driver);
		p.unEmail("ramyamp60@gmail.com");
		Thread.sleep(2000);
		p.passwd("ram@123456");
		Thread.sleep(2000);
		p.clickLogin();
		
		
	}

}
