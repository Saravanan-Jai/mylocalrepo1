package com.newtestpackage.testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getWindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.msedge.driver","/newtest/Drivers/msedgedriver.exe");
		
        // Initialize WebDriver with EdgeOptions 
        WebDriver driver = new EdgeDriver();
    	driver.manage().window().maximize();
        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Main Page Title:"+driver.getTitle());
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("OrangeHRM, Inc")));
		//element.click();
		
		//get multiple browser window handle approch 1 
  
		//save all window handles(Browser pages) in to Set of Strings
		Set<String> manyBrowserHandles = driver.getWindowHandles();
		
		/*//convert the saved data from set strings to List Strings.
		List<String> handleList = new ArrayList(manyBrowserHandles);
		
		String handle1=handleList.get(0);
		System.out.println(handle1);
		
		String handle2=handleList.get(1);
		driver.switchTo().window(handle2);
		
		System.out.println(handle2);
		System.out.println("this text is from get window handlers:"+manyBrowserHandles);
		System.out.println("Window handle Page Title:"+driver.getTitle());*/
		
		
		//get mutiple window handle approach 2 and close browser by matching title
			
		for(String winind:manyBrowserHandles)
		{
			System.out.println(winind);
			
			System.out.println("Page Tile :"+driver.switchTo().window(winind).getTitle());
			if(driver.getTitle().equals("Human Resources Management Software | OrangeHRM")){
				driver.close();
				
			}
		}
		
		
		

	}

}
