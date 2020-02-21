package com.testing.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationForm  {

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
		Map<String, Object> customer = ref.exceldata();
		System.out.println("sagar"+customer);

	

		
		


		WebElement gender= driver.findElement(gender_locator);
		gender.click();

		WebElement fName= driver.findElement(fName_locator);
		String name=(String) customer.get("FirstName");
		System.out.println(name);
		fName.sendKeys((String) customer.get("FirstName"));


		WebElement lName= driver.findElement(lName_locator); 		  
		lName.sendKeys((String)customer.get("LastName"));

		WebElement pass =driver.findElement(pass_locator);		 
		pass.sendKeys((String)customer.get("Pass"));

		//WebElement days =driver.findElement(By.xpath("//select[@id='days']/option[1]"));		 
		//pass.sendKeys("");

		Select days = new Select(driver.findElement(days_locator));
		days.selectByValue((String)customer.get("Date"));

		Select month = new Select(driver.findElement(months_locator));
		month.selectByValue((String)customer.get("Month"));

		Select years = new Select(driver.findElement(years_locator));
		years.selectByValue((String)customer.get("Year"));

		WebElement newsletter =driver.findElement(newsletter_locator);		 
		newsletter.click();

		WebElement company =driver.findElement(company_locator);		 
		company.sendKeys((String)customer.get("Company"));

		WebElement address1 =driver.findElement(address1_locator);		 
		address1.sendKeys((String)customer.get("Address"));

		WebElement address2 =driver.findElement(address1_locator);		 
		address2.sendKeys((String)customer.get("City"));

		WebElement city =driver.findElement(city_locator);		 
		city.sendKeys((String)customer.get("Location"));

		Select id_state = new Select(driver.findElement(id_state_locator));
		id_state.selectByValue((String)customer.get("Post"));


		WebElement postcode =driver.findElement(postcode_locator);		 
		postcode.sendKeys((String)customer.get("Num"));

		Select id_country = new Select(driver.findElement(id_country_locator));
		id_country.selectByValue((String)customer.get("Test"));
		//*[@id="other"]
		WebElement other =driver.findElement(other_locator);		 
		other.sendKeys((String)customer.get("Mobile1"));

		WebElement phone =driver.findElement(phone_locator);		 
		phone.sendKeys((String)customer.get("Mobile2"));

		//*[@id="other"]		  

		WebElement phone2 =driver.findElement(phone_mobile_locator);		 
		phone2.sendKeys((String)customer.get("Mobile3"));

		WebElement alias11 =driver.findElement(alias_locator);	//*[@id="alias"]	 
		alias11.sendKeys((String)customer.get("City"));

		WebElement submitAccount =driver.findElement(submitAccount_locator);	//*[@id="alias"]	 
		submitAccount.click();

		//Link to database cannot be established: SQLSTATE[HY000] [1203] User automa37_pr595 already has more than 'max_user_connections' active connections


	}



}
