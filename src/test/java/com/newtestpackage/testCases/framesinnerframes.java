package com.newtestpackage.testCases;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class framesinnerframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.msedge.driver",  "/newtest/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		// find the xpath of iframe and save in webelement
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		
		// use iframe webelement to switch to iframe
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//a[@title=\"Facebook\"]")).click();
		
		//switch back from i frame to default contect 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[normalize-space()=\"Home\"]")).click();
		
		//Javascript executor to click any element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", frame1);
		
			

	}

}
