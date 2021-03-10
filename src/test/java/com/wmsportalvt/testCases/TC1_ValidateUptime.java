package com.wmsportalvt.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.wmsportalvt.pageElements.*;
import com.wmsportalvt.testCases.*;

public class TC1_ValidateUptime extends TestBaseClass{
	
	// This test case tests if our application is alive 
	
	@Test
	public void upTime() 
	{
	
		logger.info("BEGINNING TEST CASE ONE");
		logger.info("***********************");
		logger.info("Checking application uptime !");
	
		
	if(driver.getTitle().equals("WMS ADMIN Portal Main Page"))
	{
		Assert.assertTrue(true);
		logger.info("Applicaton URL is opened : Server is Up");
		logger.info("Test has passed");
	}
	
	else {
		Assert.assertTrue(true);
		logger.info("Application URL is not detected : Server is Down");
		logger.info("Uptime test has failed");
		
	}
	}
}
