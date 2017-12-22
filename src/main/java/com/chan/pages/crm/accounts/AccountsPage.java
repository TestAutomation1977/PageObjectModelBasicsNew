package com.chan.pages.crm.accounts;

import org.openqa.selenium.By;

import com.chan.base.Page;

public class AccountsPage  extends Page{
	
	
	
	
	public CreateAccountPage gotoCreateAccounts(){
		
		click("createaccountbtn_CSS");
		
		return new CreateAccountPage();
	}
	
	
	public void gotoImportAccounts(){
		
		
	}

}
