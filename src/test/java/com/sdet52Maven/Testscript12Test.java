package com.sdet52Maven;

import org.testng.annotations.Test;

public class Testscript12Test {

	
	@Test(groups = "smoke")
	public void ts1Test()
	{
		System.out.println("-- TEstscript-1 --");
	}
	
	@Test(groups = "regression")
	public void ts2Test()
	{
		System.out.println("-- TEstscript-2 --");
	}
}
