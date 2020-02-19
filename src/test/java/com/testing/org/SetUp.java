package com.testing.org;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class SetUp {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println("Sagar Push");
	}

	@Test(enabled=false)
	public void creatAccnt() {	
		SignUP sin= new SignUP(driver);
		sin.clickSign();
		sin.createAcc();

		
	}

	@Test(enabled=false)
	public void signUp() {	
		SignUP sin= new SignUP(driver);		
		sin.clickSign();
		//sin.sigIn();
		//shopping

	}
	
	@Test
	public void accountCreation() throws IOException {	
		
		SignUP sin= new SignUP(driver);		
		sin.clickSign();
		
		
		sin.createAcc();
		
		AccountCreationForm actf=new AccountCreationForm(driver);
		actf.accountCreation();

	}


	@AfterMethod
	public void beforeA() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
