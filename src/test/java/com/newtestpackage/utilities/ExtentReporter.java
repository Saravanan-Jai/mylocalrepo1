package com.newtestpackage.utilities;

import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter 
{

		public static ExtentReports generateExtentReport() 
		{
			
			ExtentReports extentReport = new ExtentReports();
			File extentReportfile = new File(System.getProperty("user.dir")+"\\test-output\\ExtentReports\\extentreport.html");
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportfile);
			sparkReporter.config().setTheme(Theme.DARK);
			sparkReporter.config().setReportName("ExtentReportName");
			sparkReporter.config().setDocumentTitle("ExtentReportTitle");
			sparkReporter.config().setTimeStampFormat("dd/mm/yyy hh:mm:ss");
		
			extentReport.attachReporter(sparkReporter);
			extentReport.setSystemInfo("Application URL","WWW.saucelap.com");
			
			return extentReport;
		
	
		}
}