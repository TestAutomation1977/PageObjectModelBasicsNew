package com.chan.pages;

import org.openqa.selenium.By;

import com.chan.base.Page;
import com.chan.pages.crm.CRMHomePage;

public class ZohoAppPage  extends Page{
	
	
	
	public void gotoChat(){
		
		driver.findElement(By.cssSelector(".zicon-apps-chat.zicon-apps-96")).click();
		
	}
	
	public CRMHomePage gotoCRM(){
		
		click("crmlink_CSS");
		
		return new CRMHomePage();
	}
	
	
	public void gotoSalesIQ(){
		
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
		
	}

}
