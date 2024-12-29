package TakeScreenshotOnFailedTest;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(customListener.class)

public class TakeScreenshotTest extends Base{
	@BeforeMethod
	public void SetUp()
	{
		init();
	}
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	
	@Test
	public void takeScreenshotOnFailedCase1()
	{
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void takeScreenshotOnFailedCase2()
	{
		Assert.assertEquals(false, true);
	}

}
