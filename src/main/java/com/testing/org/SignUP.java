package com.testing.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUP {
	WebDriver driver;
	By sign_in_butn_locator=By.xpath("//a[@title='Log in to your customer account']");
	By userName_locator=By.xpath("//input[@id='email_create']");
	By passWord_locator=By.name("passwd");
	By loginButton_locator=By.id("SubmitLogin");
	By passwd_locator=By.name("passwd");
	By email_locator=By.xpath("//input[@data-validate='isEmail'][@id='email']");
	By createAcc_locator=By.xpath("//i[@class='icon-user left']");
	
	
	
	
	public SignUP(WebDriver driver2) {
		driver=driver2;
	}

	public void clickSign() {
		WebElement signInBut = driver.findElement(sign_in_butn_locator);
		signInBut.click();

		
	}
	
	public void sigIn() {

		
		WebElement userName = driver.findElement(userName_locator);
		userName.sendKeys("sagarsagar@gmail.com");

		WebElement passWord = driver.findElement(passWord_locator);
		passWord.sendKeys("1234");

		WebElement loginButton = driver.findElement(loginButton_locator);
		loginButton.click();

	}
	
	public void sigInNegativ_User() {

		WebElement signInBut = driver.findElement(sign_in_butn_locator);
		signInBut.click();

		WebElement userName = driver.findElement(userName_locator);
		userName.sendKeys("sagarsachin@gmail.com");

		WebElement passWord = driver.findElement(passwd_locator);
		passWord.sendKeys("1234");

		WebElement loginButton = driver.findElement(loginButton_locator);
		loginButton.click();

	}
	
	public void sigInNagtive_Pass() {

		WebElement signInBut = driver.findElement(sign_in_butn_locator);
		signInBut.click();

		WebElement userName = driver.findElement(userName_locator);
		userName.sendKeys("sagarsagar@gmail.com");

		WebElement passWord = driver.findElement(passwd_locator);
		passWord.sendKeys("sagar");

		WebElement loginButton = driver.findElement(loginButton_locator);
		loginButton.click();

	}
	
	public void sigInNeg_UserPass() {

		WebElement signInBut = driver.findElement(sign_in_butn_locator);
		signInBut.click();

		WebElement userName = driver.findElement(userName_locator);
		userName.sendKeys("sagarxyz@gmail.com");

		WebElement passWord = driver.findElement(passwd_locator);
		passWord.sendKeys("sachin");

		WebElement loginButton = driver.findElement(loginButton_locator);
		loginButton.click();

	}
	
	public void createAcc() {

		WebElement emailId = driver.findElement(userName_locator);

		emailId.sendKeys("sssaggarsagarsagarsagar@gamil.com");

		 WebElement createAcc = driver.findElement(createAcc_locator);
		 createAcc.click();

	}
	
	
}
