package com.alvas;

import org.junit.Assert;
import org.junit.Test;

public class AppTest
{
	@Test
	public void testfact()
	{
		App app= new App();
		int result=app.fact(3);
		System.out.println("Test Result"+result);
		Assert.assertEquals(6, result);
	}
	@Test 
	public void testfact1()
	{
		App app= new App();
		int result=app.fact(4);
		System.out.println("Test Result"+result);
		Assert.assertEquals(24, result);
	}
}