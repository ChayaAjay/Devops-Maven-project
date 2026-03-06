package com.alvas;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
	@Test
	public void testadd()
	{
		App app= new App();
		int result=app.add(2, 3);
		System.out.println("Running :2+3"+result);
		Assert.assertEquals(5, result);
	}
 
}