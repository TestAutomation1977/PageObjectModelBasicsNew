package com.chan.testcases;

import org.testng.annotations.AfterSuite;

import com.chan.base.Page;

//This class will be executed once all our test cases execution completed. 
//Anything which is common to do in all the test cases will go to this class.
public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		//IMP Note: The quit() method defined inside the Page.Java class
		Page.quit();
		
	}

}
