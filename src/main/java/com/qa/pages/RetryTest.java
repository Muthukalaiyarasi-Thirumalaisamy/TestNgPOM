package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class RetryTest {
WebDriver driver;
	
	@BeforeTest
	@Parameters({"url"})
	
	public void setUp(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	
	@Test(retryAnalyzer= com.Analyzer.RetryAnalyzer.class)

	public void getTitileOfTheApp()
	{
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, "crm");
	}
	
	
	@AfterTest
	
	public void tearDown()
	{
		driver.quit();
	}

}
