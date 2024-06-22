package com.newtestpackage.utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	
	ExtentReports extentReport;
	ExtentTest extentTest;
	
	
	@Override
    public void onStart(ITestContext context) {
        // Not used
		extentReport = ExtentReporter.generateExtentReport();		
	}

    @Override
    public void onTestStart(ITestResult result) {
    	String testname = result.getName();
    	ExtentTest extentTest = extentReport.createTest(testname);
    	extentTest.log(Status.INFO,testname+" started executing");	
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       
    	String testname = result.getName();
    	extentTest.log(Status.PASS,testname+" Test case passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //ExtentTestManager.getTest().log(Status.FAIL, "Test failed");
        //ExtentTestManager.getTest().log(Status.FAIL, result.getThrowable());
    	String testname = result.getName();   	
    	ExtentTest extentTest = extentReport.createTest(testname);
    	extentTest.log(Status.FAIL,testname+" Test Case Failed");
    	String screenshotpath = System.getProperty("user.dir")+"\\scrrenshots\\"+result.getName()+".png";
    	File f = new File(screenshotpath);
    	if (f.exists())
    	{
    	extentTest.fail("Screenshot is below" + extentTest.addScreenCaptureFromPath(screenshotpath));
    }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //ExtentTestManager.getTest().log(Status.SKIP, "Test skipped");
    	String testname = result.getName();   	
    	ExtentTest extentTest = extentReport.createTest(testname);
    	extentTest.log(Status.SKIP,testname+" Test Case Skipped");
        }

    

    @Override
    public void onFinish(ITestContext result) {
        // Not used
    	
    	String testname = result.getName();
    	System.out.println(testname + "All test cases finished");
    	extentReport.flush();
    }
}
