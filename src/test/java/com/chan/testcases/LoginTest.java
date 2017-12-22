package com.chan.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.chan.pages.HomePage;
import com.chan.pages.LoginPage;
import com.chan.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data){
		
		
		//DURING EXECUTION OF THIS STEP, PAGE.JAVA CLASS (IT IS A SUPER CALSS OF HOMEPAGE.JAVA CLASS) CONSTUCTOR WILL BE INVOKED 
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		Assert.fail("Login test failed");
			
	}

}
