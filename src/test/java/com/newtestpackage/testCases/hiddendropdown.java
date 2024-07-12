package com.newtestpackage.testCases;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hiddendropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "/newtest/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		
		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
		
		element.sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).click();
		//driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		
		//input[@placeholder="Username"]
		driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();
		
		//WebElement element1 =mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']")));
		
		//element1.click();
		
		//driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()=\"PIM\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Freelance']")).click();
		
	}

}
