package com.qa.pages;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.utility.TestUtil;

public class BaseTest {

	WebDriver driver;
	
	@BeforeTest
	@Parameters({"url"})
	
	public void setUp(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	@DataProvider()
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> Testdata= TestUtil.getDataFromTestUtil();
		return Testdata.iterator();
	}
	
	@Test()
	@Parameters({"ExpectedTitle"})

	public void getTitileOfTheApp(String ExpectedTitle)
	{
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@Test(dependsOnMethods="getTitileOfTheApp",dataProvider="getTestData")
	public void fillTheForm(String Name, String Email)
	{
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(Name);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(Email);
	}
	
	@AfterTest
	
	public void tearDown()
	{
		driver.quit();
	}
}
