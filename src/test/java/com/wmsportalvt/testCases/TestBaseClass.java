package com.wmsportalvt.testCases;

import java.io.File;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class TestBaseClass {
	

	
	public static WebDriver driver;
	public static Logger logger;
	
	PullConfiguration config=new PullConfiguration();
	public String url=config.getApplicationURL();
	
	// testing enviroment setup - based on annotation runs before test class 
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{			
		logger = Logger.getLogger("ATM Portal App");
		PropertyConfigurator.configure("Log4j.properties");
		
					if(br.equals("firefox"))
						{
							System.setProperty("webdriver.gecko.driver", config.getFirefoxPath() );
							driver = new FirefoxDriver();
						}
					else if(br.equals("ie"))
						{
							

							System.setProperty("webdriver.ie.driver", config.getIEPath() );
							driver = new InternetExplorerDriver();
							
						}
					else if(br.equals("chrome"))
						{
						System.setProperty("webdriver.chrome.driver", config.getChromePath() );
						driver=new ChromeDriver();
						}
					
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(url);
	}
	
	// testing enviroment shutdown - based on annotation runs after test class 
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
		

}
