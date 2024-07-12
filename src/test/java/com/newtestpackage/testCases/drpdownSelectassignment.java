package com.newtestpackage.testCases;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drpdownSelectassignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "/newtest/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5)); 
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement ddlist = driver.findElement(By.xpath("//select[@name='country' and @class='demoInputBox']"));
		
		Select sddlist = new Select(ddlist);
		sddlist.selectByVisibleText("India");
		
		List<WebElement> listoptions = sddlist.getOptions();
		System.out.println("Total options in the dropdown " + listoptions.size());
		int drpsize = listoptions.size();
		listoptions.get(0).getText();
		
		
		
			
			for(int i=0;i<listoptions.size();i++) {
				//for (WebElement ld:listoptions) {		
				System.out.println("Dropdown no :"+i+" is "+listoptions.get(i).getText());	
			}
			
		}
		
		
		

	}


