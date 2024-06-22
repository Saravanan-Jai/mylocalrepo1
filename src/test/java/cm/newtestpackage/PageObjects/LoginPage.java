package cm.newtestpackage.PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
		
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "user-name")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(id = "login-button")
	WebElement button;
	
	public void setUserName(String usrname) {
		username.sendKeys(usrname);
		
	}
	
	public void setPassword(String pword) {
		Password.sendKeys(pword);
	}
	
	public void clickButton() {
		button.click();
	}

}
