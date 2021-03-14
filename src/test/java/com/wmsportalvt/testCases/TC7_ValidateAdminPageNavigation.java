package com.wmsportalvt.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wmsportalvt.pageElements.WebPage;

public class TC7_ValidateAdminPageNavigation extends TestBaseClass{
	
	PullConfiguration readconfig=new PullConfiguration();
	
	public String mainurl=readconfig.getApplicationURL();
	
	public String username=readconfig.getTrueUsername();
	public String password=readconfig.getTruePassword();
	public int accountno=readconfig.getTrueAccountno();
	public int zipcode=readconfig.getTrueZipcode();
	
	@Test
	public void manageAdmin() throws IOException 
	{
			
		logger.info("BEGINNING TEST CASE Seven");
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
		logger.info("testing admin page navigation functionality");
		lp.clickAdminp();     		
		if(driver.getTitle().equals("Admin Transaction"))
		{
			Assert.assertTrue(true);
			logger.info("Admin page navigation was reached");
			logger.info("Test successful");
		}
		else
		{
			logger.info("Admin page naviation Test unnsuccessful");
			Assert.assertTrue(false);
			
		}
	
	}

}
