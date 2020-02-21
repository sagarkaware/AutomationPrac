package com.testing.org;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

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
		//Assert.assertEquals("http://automationpractice.com/index", driver.getCurrentUrl());
		
		//SoftAssert so=new SoftAssert();
		//so.assertEquals("http://automationpractice.com/.php", driver.getCurrentUrl());
		
		//so.assertAll();
		
	
		

	}

	@Test(enabled=false)
	public void creatAccnt() {	
		SignUP sin= new SignUP(driver);
		sin.clickSign();
		sin.createAcc();

		System.out.println("Saurab Code");
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
