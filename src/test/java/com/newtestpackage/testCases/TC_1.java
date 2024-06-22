package com.newtestpackage.testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cm.newtestpackage.PageObjects.LoginPage;


public class TC_1 extends BaseClass
{
	
	@Test
	public void logintest() throws IOException 
	{
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("standard_user");
		lp.setPassword("secret_sauce");
		lp.clickButton();
		System.out.println("Test Case Pass from TC");
		
		
		//Assert.assertEquals("Sara", "Sara");// test is pass
		Assert.assertTrue(true);
	
	
		captureScreen(driver, "logintest");
	}	
	
	
	
		
	/*driver.get(baseURL);
	logger.info("Base URL opened");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println(usname);
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	/*LoginPage lp = new LoginPage(driver);
	lp.setUserName(usname);
	logger.info("This is the user name "+ usname);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	lp.setPassword(pwrd);
	logger.info("This is the password "+ pwrd);
	lp.clickButton();


	logger.info("First logger msg");*/
	
	//extent report*/
	// directory where output is to be printe

	
	
	
	//String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	//String repname="Test-Report-"+timestamp+".html";
	/*spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-ouput/"+repname);*/
	//ExtentSparkReporter spark = new ExtentSparkReporter("test-output/"+"TestReport9.html");
	//spark.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
	//sparkreporter.config().setTheme(Theme.DARK);
	
	//ExtentTest Test=extent.createTest("New Test entry entered in report");//Create new entry in the report
	//Test.pass("Test Case passed");
	
	
	//extent.flush();		
}
