package com.wmsportalvt.pageElements;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPage {
	
	WebDriver ldriver;
	
	public WebPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(name="accountno")
	@CacheLookup
	WebElement txtAccountno;
	
	@FindBy(name="zipcode")
	@CacheLookup
	WebElement txtZip;
	
	@FindBy(name="loginsubmit")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(name="logout")
	@CacheLookup
	WebElement btnLogout;
	
	@FindBy(name="order")
	@CacheLookup
	WebElement btnOrder;
	
	@FindBy(name="admincontrol")
	@CacheLookup
	WebElement btnAdminP;
	
	@FindBy(name="inventory")
	@CacheLookup
	WebElement btnInv;
	
	
	

	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void setAccountno(int uname)
	{
		txtAccountno.sendKeys(String.valueOf(uname));
	}
	
	public void setZipcode(int code)
	{
		txtZip.sendKeys(String.valueOf(code));
	}
	
	
	public void clickAdminp()
	{
		btnAdminP.click();
	}
	
	public void clickInventory()
	{
		btnInv.click();
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		btnLogout.click();
	}	
	
	public void clickOrder()
	{
		btnOrder.click();
	}
	
	
	

}
