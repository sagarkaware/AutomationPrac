package com.testing.org;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	
	@Parameters("xyz")
	@BeforeTest
	public void setup(String mycomingbrowserName) {
		
		System.out.println(mycomingbrowserName);
		
		if (mycomingbrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(mycomingbrowserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "resource/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else if(mycomingbrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "resource/geckodriver.exe");
			driver = new FirefoxDriver();
		}
				
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@Test
	public void loginMethod() {
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		
		
	}
	@AfterTest
	public void tearDown() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();	
	}

}
