package com.newtestpackage.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.newtestpackage.utilities.XLUtils;

import cm.newtestpackage.PageObjects.LoginPage;

public class TC_001_DDT_001 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException, IOException 

	{
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickButton();
	
		String crul=driver.getCurrentUrl();
		System.out.println(crul);
		String eurl="https://www.saucedemo.com/v1/inventory.html";
		System.out.println(eurl);
		if(crul.equals(eurl)) 
		{
			assert true;
			System.out.println(user+pwd);
			System.out.println("Test Case Passed");
			System.out.println("Page title is "+ driver.getCurrentUrl());
		}	
		else 
		{
			assert false;
			System.out.println(user+pwd);
			System.out.println("Test Case Failed");
			System.out.println("Page title is "+ driver.getTitle());
			captureScreen(driver,"loginDDT");
			
			
		}

		
		
		}
	
	public boolean isAlertPresent() //user defined method to check isalert is present
	{
	
		try 
		{
			
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;	
		}
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getdata() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/newtestpackage/testData/inputdata.xlsx";	
		
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getRowCount(path, "Sheet1");
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) 
		{
			for(int j=0;j<colcount;j++) 
			{
			logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
							
			}
		}
		return logindata;
	
	}
	
}
