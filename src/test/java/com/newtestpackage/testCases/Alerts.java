package com.newtestpackage.testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.msedge.driver", "/newtest/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5)); 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Simple alert
		driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Alert\"]")).click();
		/*Alert myalert = driver.switchTo().alert();*/
		
		
		//handling alert without switchTO command
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		
		
		System.out.println(myalert.getText());
		myalert.accept();
		
	}

}
