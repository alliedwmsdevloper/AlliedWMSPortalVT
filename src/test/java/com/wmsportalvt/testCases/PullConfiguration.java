package com.wmsportalvt.testCases;

import java.io.File;


import java.io.FileInputStream;
import java.util.Properties;

public class PullConfiguration {
	
	Properties property;
	
	public PullConfiguration(){
		
		File src = new File("./Configuration/config.properties");

			try {
				FileInputStream input = new FileInputStream(src);
				property = new Properties();
				property.load(input);
				} 
			catch (Exception e) 
				{
				System.out.println("Exception is " + e.getMessage());
				}	
	}
	

	// get application main url
	
	public String getApplicationURL()
	{
		String mainurl=property.getProperty("mainurl");
		return mainurl;
	}
	
	// methods to grab false values
	
	public String getFalseUsername()
	{
	String username=property.getProperty("usernamef");
	return username;
	}
	
	public String getFalsePassword()
	{
	String password=property.getProperty("passwordf");
	return password;
	}
	
	public int getFalseAccountno()
	{
	int an=Integer.parseInt(property.getProperty("accountnof"));
	return an;
	}
	
	public int getFalseZipcode()
	{
	int zipcode= Integer.parseInt(property.getProperty("zipcodef"));
	return zipcode;
	
	}
	
	
	// methods to grab true values
	
	
	public String getTrueUsername()
	{
	String username=property.getProperty("usernamet");
	return username;
	}
	
	public String getTruePassword()
	{
	String password=property.getProperty("passwordt");
	return password;
	}
	
	public int getTrueAccountno()
	{
	int an=Integer.parseInt(property.getProperty("accountnot"));
	return an;
	}
	
	public int getTrueZipcode()
	{
	int zipcode= Integer.parseInt(property.getProperty("zipcodet"));
	return zipcode;
	}
	
	
	// get local browser paths 
	
	public String getChromePath()
	{
	String chromepath=property.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=property.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=property.getProperty("firefoxpath");
	return firefoxpath;
	}


}
