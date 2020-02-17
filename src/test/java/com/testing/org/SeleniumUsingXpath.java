package com.testing.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import sun.font.CreatedFontTracker;

public class SeleniumUsingXpath {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		SeleniumUsingXpath ref = new SeleniumUsingXpath();
		ref.setup();
		
		SignUP sin= new SignUP(ref.driver);
		sin.sigIn();
		
		CreatAccnt cacc= new CreatAccnt(ref.driver);
		
		
		ref.accountCreation();
		ref.shoping();
		
	}

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	
	
	
	
	public void accountCreation() throws InterruptedException {
		
		 Thread.sleep(5000);
		WebElement gender= driver.findElement(By.xpath("//input[@name='id_gender'][@id='id_gender1']"));
		gender.click();
		
		WebElement fName= driver.findElement(By.xpath("//input[@name='customer_firstname'][@type='text']"));		
		fName.sendKeys("Sagar");
		
		
		  WebElement lName= driver.findElement(By.xpath("//input[@name='customer_lastname'][@type='text']")); 		  
		  lName.sendKeys("Kaware");
		 
		  WebElement pass =driver.findElement(By.xpath("//input[@name='passwd']"));		 
		  pass.sendKeys("sagar@12345");
		  
		  //WebElement days =driver.findElement(By.xpath("//select[@id='days']/option[1]"));		 
		  //pass.sendKeys("");
		  
		  Select days = new Select(driver.findElement(By.name("days")));
		  days.selectByValue("26");
		  
		  Select month = new Select(driver.findElement(By.name("months")));
		  month.selectByValue("4");
		  
		  Select years = new Select(driver.findElement(By.name("years")));
		  years.selectByValue("1991");
		  
		  WebElement newsletter =driver.findElement(By.xpath("//input[@name='newsletter']"));		 
		  newsletter.click();
		  
		  WebElement company =driver.findElement(By.xpath("//input[@name='company']"));		 
		  company.sendKeys("RelyonSoftech");
		  
		  WebElement address1 =driver.findElement(By.xpath("//input[@name='address1']"));		 
		  address1.sendKeys("Shivne");
		  
		  WebElement address2 =driver.findElement(By.xpath("//input[@name='address2']"));		 
		  address2.sendKeys("Pune");
		  
		  WebElement city =driver.findElement(By.xpath("//input[@name='city']"));		 
		  city.sendKeys("Pune");
		  
		  Select id_state = new Select(driver.findElement(By.xpath("//select[@name='id_state']")));
		  id_state.selectByValue("4");
		
		
		  WebElement postcode =driver.findElement(By.xpath("//*[@id='postcode']"));		 
		  postcode.sendKeys("00000");
		  
		  Select id_country = new Select(driver.findElement(By.xpath("//*[@id='id_country']")));
		  id_country.selectByValue("21");
		//*[@id="other"]
		  WebElement other =driver.findElement(By.xpath("//*[@id='other']"));		 
		  other.sendKeys("9595507502");
		  
		  WebElement phone =driver.findElement(By.xpath("//*[@id='phone']"));		 
		  phone.sendKeys("9595507502");
		  
		//*[@id="other"]		  
		 		  
		  WebElement phone2 =driver.findElement(By.xpath("//*[@id='phone_mobile']"));		 
		  phone2.sendKeys("9595507502");
		  
		  WebElement alias11 =driver.findElement(By.xpath("//*[@id='alias']"));	//*[@id="alias"]	 
		  alias11.sendKeys("Pune");
		  
		  WebElement submitAccount =driver.findElement(By.xpath("//*[@id='submitAccount']/span"));	//*[@id="alias"]	 
		  submitAccount.click();
		  
		  //Link to database cannot be established: SQLSTATE[HY000] [1203] User automa37_pr595 already has more than 'max_user_connections' active connections
		  
		  
	}
	
	public void shoping() throws InterruptedException {
		
		Thread.sleep(5000);		
		WebElement tishrt =driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));	
		tishrt.click();
		
		Thread.sleep(5000);
		//WebElement add_to_cart =driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));	 
		//add_to_cart.click();
		//act.moveToElement(driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"))).perform();
		
		 Actions actions = new Actions(driver);
	        //Retrieve WebElement 'Music' to perform mouse hover 
	     WebElement on_mouse = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
	     //Mouse hover menuOption 'Music'
	     actions.moveToElement(on_mouse).perform();
	     //System.out.println("Done Mouse hover on 'Music' from Menu");
	     WebElement add_to_cart =driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
	     add_to_cart.click();
		
		//*[@id="layer_cart"]/div[1]/div[2]/div[4]/a/span
		Thread.sleep(5000);
		WebElement Proceed_to_checkout =driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));	 
		Proceed_to_checkout.click();
		
		Thread.sleep(5000); 
//		WebElement cart_quantity =driver.findElement(By.xpath("//*[@id='product_1_1_0_248809']/td[5]/input[2]")); 
//		cart_quantity.sendKeys("4");
//		
//		Select id_state = new Select(driver.findElement(By.xpath("//*[@id='product_1_1_0_248809']/td[5]/input[2]")));
//		  id_state.selectByValue("4");
////		
//		Actions actions1 = new Actions(driver);
//		WebElement elementLocator = driver.findElement(By.xpath("//*[@id='cart_quantity_up_1_1_0_248809']"));
//		actions1.doubleClick(elementLocator).perform();
		
		/*Thread.sleep(5000);
		WebElement cart_quantity1 =driver.findElement(By.xpath("//*[@id='cart_quantity_up_1_1_0_248809']"));		 
		cart_quantity1.click(); */
		
		Thread.sleep(5000);
		WebElement cart_quantity2 =driver.findElement(By.xpath("//a[@title='Add']"));	 
		cart_quantity2.click();
		cart_quantity2.click();
		
		Thread.sleep(5000);
		WebElement pro_to_check =driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]"));	
		pro_to_check.click();
		
		Thread.sleep(5000);
		WebElement address =driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span"));	
		address.click();
		
		Thread.sleep(5000);
		WebElement terms =driver.findElement(By.xpath("//*[@id='cgv']"));
		terms.click();
		
		
		WebElement shoping =driver.findElement(By.xpath("//*[@id='form']/p/button"));	 
		shoping.click();
		
		
		WebElement HOOK_PAYMENT =driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[2]/div/p/a"));	 
		HOOK_PAYMENT.click();
		
		
		
		WebElement done =driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span"));	 
		done.click();
		
		
		
	}
	
	
	

	

}
