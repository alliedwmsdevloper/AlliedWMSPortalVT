package com.wmsportalvt.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wmsportalvt.pageElements.WebPage;

public class TC5_ValidateInventoryPageNavigation extends TestBaseClass {
	PullConfiguration readconfig=new PullConfiguration();

	public String mainurl=readconfig.getApplicationURL();
	
	public String username=readconfig.getTrueUsername();
	public String password=readconfig.getTruePassword();
	public int accountno=readconfig.getTrueAccountno();
	public int zipcode=readconfig.getTrueZipcode();
	
	@Test
	public void listorder() throws IOException 
	{
			
		logger.info("BEGINNING TEST CASE Five");
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
		logger.info("Testing Inventory page navigation functionality");
		lp.clickInventory();     		
		if(driver.getTitle().equals("View Inventory"))
		{
			Assert.assertTrue(true);
			logger.info("Inventory page was reached");
			logger.info("Inventory Test successful");
		}
		else
		{
			logger.info("Inventory Test unnsuccessful");
			Assert.assertTrue(false);
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
