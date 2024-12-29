package TakeScreenshotOnFailedTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {


	public static WebDriver driver;

	
	public void init()
	{
		driver=new ChromeDriver();
		driver.get("https://www.zoho.com/crm/request-migration-assistance.html");
		
	}
	

	
	public void failed(String MethodName)
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\My_Projects\\TestngPOM\\screenshots\\"+MethodName+"_"+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
