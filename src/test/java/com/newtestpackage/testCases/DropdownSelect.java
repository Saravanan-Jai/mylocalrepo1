package com.newtestpackage.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.msedge.driver", "/newtest/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5)); 
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement drpdownEl = driver.findElement(By.id("dropdown"));
		
		Select drpDownSelect = new Select(drpdownEl);
		drpDownSelect.selectByVisibleText("Option 1");
		
		List<WebElement> drplist = drpDownSelect.getOptions();
		
		for (WebElement drpl:drplist) {
			
			System.out.println("Options are :"+drpl.getText());
			
			
		}

	}

}
