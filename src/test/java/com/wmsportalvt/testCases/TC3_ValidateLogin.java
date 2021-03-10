package com.wmsportalvt.testCases;

import java.io.IOException;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.wmsportalvt.pageElements.*;

public class TC3_ValidateLogin extends TestBaseClass {
	
	
	PullConfiguration readconfig=new PullConfiguration();
	
	public String mainurl=readconfig.getApplicationURL();
	
	public String username=readconfig.getTrueUsername();
	public String password=readconfig.getTruePassword();
	public int accountno=readconfig.getTrueAccountno();
	public int zipcode=readconfig.getTrueZipcode();
	
	@Test
	public void loginTest() throws IOException 
	{
			
		logger.info("BEGINNING TEST CASE Three");
		logger.info("***********************");
		logger.info("WMS Portal is opened");
		
	
        
		WebPage lp = new WebPage(driver);
		lp.setUserName(username);
		logger.info("Entered correct username");
		
		lp.setPassword(password);
		logger.info("Entered corrent password");
		
		lp.setAccountno(accountno);
		logger.info("Entered corret accountno");
		
		lp.setZipcode(zipcode);
		logger.info("Entered correct zipcode");
		
		
	    lp.clickLogin();
              
		
		if(driver.getTitle().equals("Allied WMS"))
		{
			Assert.assertTrue(true);
			logger.info("Confirmed Validation");
		}
		else
		{
			logger.info("Test has Failed");
			Assert.assertTrue(false);
			
		}
	
	
	
	

	}
	}
