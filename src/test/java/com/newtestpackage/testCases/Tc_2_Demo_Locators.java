package com.newtestpackage.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Tc_2_Demo_Locators 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("webdriver.msedge.driver","/newtest/Drivers/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	System.out.println("Browser opened");
	
	
	Boolean partialText = driver.findElement(By.partialLinkText("Table")).isEnabled();
	System.out.println("Tablet "+ partialText);
	//Partial Text
	//driver.findElement(By.partialLinkText("Table")).click();
	//Text
	//driver.findElement(By.partialLinkText("Tablet")).click();
	
	//CSS Selector
	//tag id    tag#id
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
	
	//tag class tag.classname
	//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
	
	//tag attribute   tag[attribute='value']
	//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
	
	//tag class attribute
	//driver.findElement(By.cssSelector(@)).sendKeys("T-shirts");
	
	
	//img[@title='iPhone']
	//driver.findElement(By.xpath("//img[@title='iPhone']")).click();
	
	
	

    // Close the browser
    driver.quit();
}


	
	
	}

