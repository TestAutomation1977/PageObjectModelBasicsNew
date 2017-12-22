package com.chan.pages.crm.accounts;

import com.chan.base.Page;

public class CreateAccountPage  extends Page {
	
	
	public void createAccount(String accountName){
		
		type("accountname_CSS",accountName);
		
	}

}
