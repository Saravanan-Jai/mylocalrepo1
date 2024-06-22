package com.newtestpackage.testCases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.newtestpackage.utilities.ReadConfig;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass 
{
	

	ReadConfig readconfig = new ReadConfig();
	

	public String baseURL=readconfig.getApplicationURL();
	public String usname=readconfig.getusername();
	public String pwrd=readconfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.msedge.driver",readconfig.getedgepath());
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened");
		
		logger = LogManager.getLogger(BaseClass.class);
		
		
	}
	
	@AfterClass
	public void teardown() 
	{
		
		driver.quit();
		logger.info("driver is quit");
		System.out.println("browser closed");
	}
	
	public static void captureScreen(WebDriver driver,String tname) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/scrrenshots/" + tname + ".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot taken");
		
		
		
		
	}
	
	
}
