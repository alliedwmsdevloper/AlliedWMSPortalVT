package com.wmsportalvt.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wmsportalvt.pageElements.WebPage;

public class TC6_ValidateOrderPageNavigation extends TestBaseClass  {
	
	PullConfiguration readconfig=new PullConfiguration();
	
	public String mainurl=readconfig.getApplicationURL();
	
	public String username=readconfig.getTrueUsername();
	public String password=readconfig.getTruePassword();
	public int accountno=readconfig.getTrueAccountno();
	public int zipcode=readconfig.getTrueZipcode();
	
	@Test
	public void listInventory() throws IOException 
	{
			
		logger.info("BEGINNING TEST CASE Six");
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
		logger.info("Testing inventory Page functionality");
		lp.clickOrder();     		
		if(driver.getTitle().equals("View Orders"))
		{
			Assert.assertTrue(true);
			logger.info("Order page was reached");
			logger.info("Order Test successful");
		}
		else
		{
			logger.info("Order Test unnsuccessful");
			Assert.assertTrue(false);
			
		}
	
	}
	
	

}
