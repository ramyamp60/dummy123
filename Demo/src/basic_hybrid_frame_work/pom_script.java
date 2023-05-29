package basic_hybrid_frame_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_script {
	@FindBy(id="email")
	private WebElement usname;
	@FindBy(name="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement lgnbtn;
	public pom_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void username(String data)
	{
		usname.sendKeys(data);
		
	}
	public void password(String data1)
	{
		pwd.sendKeys(data1);
		
	}
	public void click_btn()
	{
		lgnbtn.click();
	}

	
}
