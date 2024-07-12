package com.newtestpackage.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkboxes 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.msedge.driver", "\"/newtest/Drivers/msedgedriver.exe\"");
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("wednesday")).click();
		
		//Select all check boxes
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(allcheckboxes.size());
		for (WebElement checkbox:allcheckboxes) {
			checkbox.click();
									
		}
		
		

	}

}
