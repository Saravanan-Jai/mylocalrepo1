package newtestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne 
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
	
	/*System.setProperty("webdriver.chrome.driver","E:\\Workspace\\newtest\\Drivers\\chromedriver.exe\\");
	ChromeOptions options = new ChromeOptions();
	options.setBinary("E:\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
	WebDriver driver = new ChromeDriver(options);*/
	
	System.setProperty("webdriver.msedge.driver","E:\\Workspace\\newtest\\Drivers\\msedgedriver.exe\\");
	WebDriver driver = new EdgeDriver();

	driver.manage().window().maximize();
	driver.get("https://google.com");
	String Title = driver.getTitle();
	System.out.println(Title);
	
	
	/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://google.com");*/

System.out.println("one");
	}

}
