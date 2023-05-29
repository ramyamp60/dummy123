package practice_hybrid_frame_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_script2 {
	@FindBy(xpath = "//a[.='Log in']")
	private WebElement signlink;
	@FindBy(id="Email")
	private WebElement emailtxtBox;
	@FindBy(name="Password")
	private WebElement  pwdtxtBox;
	@FindBy(xpath="//input[@type='submit' and @value='Search']")
	private WebElement lgnbtn;
	public pom_script2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void lgnlink()
	{
		signlink.click();
	}
	public void email(String em)
	{
		emailtxtBox.sendKeys(em);
	}
	
	public void password(String psw)
	{
		pwdtxtBox.sendKeys(psw);
		
	}
	public void clicklgn()
	{
		lgnbtn.click();
	}

}
