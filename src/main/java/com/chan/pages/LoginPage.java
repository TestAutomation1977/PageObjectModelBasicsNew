package com.chan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.chan.base.Page;

public class LoginPage  extends Page{

	
	//Why return type is Zoho Page? Page Pattern used in Login Test Java. Look at complete notes of 
	public ZohoAppPage doLogin(String username,String password){
		
		type("email_CSS",username);
		type("password_CSS",password);
		click("signbtn_CSS");
		
		return new ZohoAppPage();
	}
	
	
	public void gotoSalesandMarketing(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
}
