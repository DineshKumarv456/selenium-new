package org.sng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
public class SampleNG {
	
	@Test (invocationCount = 3)
	private void tc5() {
		System.out.println("This is tc5");

	}
	
	@BeforeTest (enabled = true)
	private void tc2() {
		System.out.println("This is the test cases");

	}

	@AfterTest 
	private void tc4() {
		System.out.println("New test cases are over");

	}
	
	@Ignore
	private void tc10() {
		
System.out.println("this is ignored");
	}
}
