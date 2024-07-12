package com.newtestpackage.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class findallanchortagsSizePrintString {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.msedge.driver","/newtest/Drivers/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://automationpractice.blogspot.com/");
	//get all href in strings
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
	for(WebElement eachlink:allLinks) 
	{
		System.out.println(eachlink.getText());
	}
	 
	
		

	}

}
