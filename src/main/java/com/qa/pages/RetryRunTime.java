package com.qa.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryRunTime {

@Test
	
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(true, true);
	}

}
