package com.testing.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationForm {

	WebDriver driver;


	By gender_locator= By.xpath("//input[@name='id_gender'][@id='id_gender1']");
	By fName_locator=By.xpath("//input[@name='customer_firstname'][@type='text']");
	By lName_locator=By.xpath("//input[@name='customer_lastname'][@type='text']");
	By pass_locator=By.xpath("//input[@name='passwd']");
	By days_locator=By.name("days");
	By months_locator=By.name("months");
	By years_locator=By.name("years");
	By newsletter_locator=By.xpath("//input[@name='newsletter']");
	By company_locator=By.xpath("//input[@name='company']");
	By address1_locator=By.xpath("//input[@name='address1']");
	By address2_locator=By.xpath("//input[@name='address2']");
	By city_locator=By.xpath("//input[@name='city']");
	By id_state_locator=By.xpath("//select[@name='id_state']");
	By postcode_locator=By.xpath("//*[@id='postcode']");
	By id_country_locator=By.xpath("//*[@id='id_country']");
	By other_locator=By.xpath("//*[@id='other']");
	By phone_locator=By.xpath("//*[@id='phone']");
	By phone_mobile_locator=By.xpath("//*[@id='phone_mobile']");
	By alias_locator=By.xpath("//*[@id='alias']");
	By submitAccount_locator=By.xpath("//*[@id='submitAccount']/span");

	public AccountCreationForm(WebDriver driver2) {

		driver=driver2;
	}

	//Create an object of File class to open xlsx file
	
	
	
	public void accountCreation()  {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		UtilitiClass ref = new UtilitiClass();
		ref.excelData();
		
		
		


	/*	WebElement gender= driver.findElement(gender_locator);
		gender.click();

		WebElement fName= driver.findElement(fName_locator);		
		fName.sendKeys("Sagar");


		WebElement lName= driver.findElement(lName_locator); 		  
		lName.sendKeys("Kaware");

		WebElement pass =driver.findElement(pass_locator);		 
		pass.sendKeys("sagar@12345");

		//WebElement days =driver.findElement(By.xpath("//select[@id='days']/option[1]"));		 
		//pass.sendKeys("");

		Select days = new Select(driver.findElement(days_locator));
		days.selectByValue("26");

		Select month = new Select(driver.findElement(months_locator));
		month.selectByValue("4");

		Select years = new Select(driver.findElement(years_locator));
		years.selectByValue("1991");

		WebElement newsletter =driver.findElement(newsletter_locator);		 
		newsletter.click();

		WebElement company =driver.findElement(company_locator);		 
		company.sendKeys("RelyonSoftech");

		WebElement address1 =driver.findElement(address1_locator);		 
		address1.sendKeys("Shivne");

		WebElement address2 =driver.findElement(address1_locator);		 
		address2.sendKeys("Pune");

		WebElement city =driver.findElement(city_locator);		 
		city.sendKeys("Pune");

		Select id_state = new Select(driver.findElement(id_state_locator));
		id_state.selectByValue("4");


		WebElement postcode =driver.findElement(postcode_locator);		 
		postcode.sendKeys("00000");

		Select id_country = new Select(driver.findElement(id_country_locator));
		id_country.selectByValue("21");
		//*[@id="other"]
		WebElement other =driver.findElement(other_locator);		 
		other.sendKeys("9595507502");

		WebElement phone =driver.findElement(phone_locator);		 
		phone.sendKeys("9595507502");

		//*[@id="other"]		  

		WebElement phone2 =driver.findElement(phone_mobile_locator);		 
		phone2.sendKeys("9595507502");

		WebElement alias11 =driver.findElement(alias_locator);	//*[@id="alias"]	 
		alias11.sendKeys("Pune");

		WebElement submitAccount =driver.findElement(submitAccount_locator);	//*[@id="alias"]	 
		submitAccount.click();

		//Link to database cannot be established: SQLSTATE[HY000] [1203] User automa37_pr595 already has more than 'max_user_connections' active connections

*/
	}



}
