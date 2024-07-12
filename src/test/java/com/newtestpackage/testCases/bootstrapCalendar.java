package com.newtestpackage.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bootstrapCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "/newtest/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
		driver.manage().window().maximize();
		
		// Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 1000 pixels
        //js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//span[@class='input-group-addon']/i")).click();
		
		//String crdate = driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();
		//System.out.println("Full String " + crdate);
		//int spaceIndex = crdate.indexOf(" ");
		//String month = crdate.substring(0, spaceIndex);
		//String year = crdate.substring(spaceIndex, spaceIndex+5);
		//System.out.println("this is the month "+month);
		//System.out.println("this is the year "+year);
		
		//System.out.println("Space index number :"+spaceIndex);
		
		String expectedDate = "May 2024";
		
		while(true) 
		{
			String crdate = driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();
			if(!expectedDate.equals(crdate)) 
			{
				driver.findElement(By.xpath("//div[@class='datepicker-days']/*//th[@class='prev' and text()='«']")).click();
						
				
			}
			
			//Add code to click the date
			
		}
			
		
		


	}

}
