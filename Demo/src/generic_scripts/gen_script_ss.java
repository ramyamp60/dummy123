package generic_scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class gen_script_ss {
	public static void photo(WebDriver driver) throws IOException
	{
		String photo="./photos";//folder name
		java.util.Date todaydate=new java.util.Date();//to fetch system date
		String S=todaydate.toString(); //convert to string and store in s
		TakesScreenshot ts=(TakesScreenshot)driver;
		File img=ts.getScreenshotAs(OutputType.FILE);
		File s1=new File(photo+S+".jpeg");
		FileHandler.copy(img, s1);
	}

}