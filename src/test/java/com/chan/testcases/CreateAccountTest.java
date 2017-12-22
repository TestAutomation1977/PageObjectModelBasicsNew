package com.chan.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.chan.base.Page;
import com.chan.pages.ZohoAppPage;
import com.chan.pages.crm.accounts.AccountsPage;
import com.chan.pages.crm.accounts.CreateAccountPage;
import com.chan.utilities.Utilities;

public class CreateAccountTest {
	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		Assert.fail("Create account test failed");
		
	}

}
