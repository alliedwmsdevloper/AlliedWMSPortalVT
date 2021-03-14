package com.wmsportalvt.testCases;

import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.wmsportalvt.pageElements.*;
import com.wmsportalvt.testCases.*;

public class TC2_ValidateSecurity extends TestBaseClass {
	
	
    PullConfiguration readconfig=new PullConfiguration();
	
	public String mainURL=readconfig.getApplicationURL();
	
	public String username=readconfig.getFalseUsername();
	public String password=readconfig.getFalsePassword();
	public int accountno=readconfig.getFalseAccountno();
	public int zipcode=readconfig.getFalseZipcode();
	
	
	@Test
	public void securityTest() throws IOException 
	{
			
		logger.info("BEGINNING TEST CASE TWO");
		logger.info("***********************");
		logger.info("Application URL is opened");
		
	
		WebPage lp = new WebPage(driver);
		lp.setUserName(username);
		logger.info("Entered corrupt username");
		
		lp.setPassword(password);
		logger.info("Entered corrupt password");
		
		lp.setAccountno(accountno);
		logger.info("Entered corrupt accountno");
		
		lp.setZipcode(zipcode);
		logger.info("Entered corrupt zipcode");
		
		
	    lp.clickLogin();
		
		if(driver.getTitle().equals("WMS ADMIN Portal Main Page"))
		{
			Assert.assertTrue(true);
			logger.info("Test has passed");
			logger.info("Backend Security is Valid");
		}
		else
		{
			logger.info("Test has failed");
			logger.info("Backend Security is Invalid ");
			Assert.assertTrue(false);
			
		}
		
	}
	
	
	
	

}
