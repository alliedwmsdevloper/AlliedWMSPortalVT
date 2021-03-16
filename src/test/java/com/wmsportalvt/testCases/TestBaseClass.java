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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class TestBaseClass {
	

	
	public static WebDriver driver;
	public static Logger logger;
	int value = 1;
	
	
	
	PullConfiguration config=new PullConfiguration();
	public String appurl=config.getApplicationURL();
	
	
	// testing enviroment setup - based on annotation runs before test class 
	
	@Parameters("browser")
	@BeforeClass
	public void boot(String browser)
	{			
		logger = Logger.getLogger("ATM Portal App");
		PropertyConfigurator.configure("Log4j.properties");
		
					if(browser.equals("firefox"))
						{
						   FirefoxOptions fxOptions = new FirefoxOptions();
						   fxOptions.setHeadless(true);
							System.setProperty("webdriver.gecko.driver", config.getFirefoxPath() );
							driver = new FirefoxDriver(fxOptions);
						}
					
					else if(browser.equals("chrome"))
						{
						ChromeOptions chromeOption = new ChromeOptions();
						chromeOption.setHeadless(true);
						System.setProperty("webdriver.chrome.driver", config.getChromePath() );

						driver=new ChromeDriver(chromeOption);
						//driver=new ChromeDriver();

						//driver=new ChromeDriver(chromeOption);

						}
					
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(appurl);
	}
	
	// testing enviroment shutdown - based on annotation runs after test class 
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
		

}
