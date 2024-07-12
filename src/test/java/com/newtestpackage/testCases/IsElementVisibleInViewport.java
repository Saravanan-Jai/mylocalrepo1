package com.newtestpackage.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsElementVisibleInViewport {
	
	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("webdriver.msedge.driver","/newtest/Drivers/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	System.out.println("Browser opened");
	
	
	
	 // Define the locator for the element you want to check
    By elementLocator = By.xpath("//img[@title='iPhone']");

    // Initialize WebDriverWait
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

 // Wait until the element is present in the DOM
    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));

    // Check if the element is visible within the viewport
    if (isElementVisibleInViewport(driver, element)) {
        System.out.println("The element is visible within the viewport.");
    } else {
        System.out.println("The element is not visible within the viewport.");
    }

    // Close the browser
    driver.quit();
}

// Function to check if an element is visible within the viewport
private static boolean isElementVisibleInViewport(WebDriver driver, WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    return (Boolean) js.executeScript(
        "var elem = arguments[0],                 " +
        "  box = elem.getBoundingClientRect(),    " +
        "  cx = box.left + box.width / 2,         " +
        "  cy = box.top + box.height / 2,         " +
        "  e = document.elementFromPoint(cx, cy); " +
        "return (box.top >= 0 && box.left >= 0 && " +
        "        box.bottom <= (window.innerHeight || document.documentElement.clientHeight) && " +
        "        box.right <= (window.innerWidth || document.documentElement.clientWidth));",
        element);
}
	
	
	}


