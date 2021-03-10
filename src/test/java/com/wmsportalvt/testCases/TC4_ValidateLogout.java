package com.wmsportalvt.testCases;


import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.wmsportalvt.pageElements.*;
import com.wmsportalvt.testCases.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



public class TC4_ValidateLogout extends TestBaseClass {
	
	
PullConfiguration readconfig=new PullConfiguration();
	
	public String mainurl=readconfig.getApplicationURL();
	
	public String username=readconfig.getTrueUsername();
	public String password=readconfig.getTruePassword();
	public int accountno=readconfig.getTrueAccountno();
	public int zipcode=readconfig.getTrueZipcode();
	
	@Test
	public void logoutTest() throws IOException 
	{
			
		logger.info("BEGINNING TEST CASE Four");
		logger.info("***********************");
		logger.info("WMS Portal is opened");
		
	
        
		WebPage lp = new WebPage(driver);
		lp.setUserName(username);
	    lp.setPassword(password);	
		lp.setAccountno(accountno);
		lp.setZipcode(zipcode);
		lp.clickLogin();
		logger.info("WMS Portal login is Successful");
		//WebElement p=driver.findElement(By.linkText("Logout"));
		//p.click();
		logger.info("testing logout functionality");
		lp.clickLogout();     		
		if(driver.getTitle().equals("WMS ADMIN Portal Main Page"))
		{
			Assert.assertTrue(true);
			logger.info("Logout Test Successful");
		}
		else
		{
			logger.info("Log out Test Failed");
			Assert.assertTrue(false);
			
		}
	
	

}}
