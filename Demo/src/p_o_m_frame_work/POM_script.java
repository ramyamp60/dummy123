package p_o_m_frame_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class POM_script {
	
	//declaration
	@FindBy(name="email")
	private WebElement emailBox;
	@FindBy(name="pass")
	private WebElement pwdBox;
	@FindBy(name="login")
	private WebElement lgnbtn;
	//Initialization
	public POM_script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void unEmail(String un)
	{
		emailBox.sendKeys(un);
	}
		public void password(String pwd)
		{
		pwdBox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		lgnbtn.click();
	}
	public void passwd(String string) {
		// TODO Auto-generated method stub
		
	}
}
