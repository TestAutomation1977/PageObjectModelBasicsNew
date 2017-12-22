package com.chan.rough;

import com.chan.base.Page;
import com.chan.pages.HomePage;
import com.chan.pages.LoginPage;
import com.chan.pages.ZohoAppPage;
import com.chan.pages.crm.accounts.AccountsPage;
import com.chan.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {


		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("trainer@way2automation.com", "Selenium@123");
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount("Raman");
		
		//driver.manage.window.maximze()

		
		
	}

}
