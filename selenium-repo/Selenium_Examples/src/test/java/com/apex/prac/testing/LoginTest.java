package com.apex.prac.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver= null;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chrome\\79\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://ecommerce.saipratap.net/customerlogin.php");}
	
	@AfterMethod
	public void cleanup() {
		driver.close();	
	}
 
  @Test(priority =2)
  public void testInvalidUserNames() throws InterruptedException {
	 
		//Step3: identify the record elements 
			WebElement username = driver.findElement(By.id("email"));
			WebElement password = driver.findElement(By.id("password"));
		//Step4: set data
			 Thread.sleep(2000);
			username.sendKeys("Java.neha@xyz.com");
			Thread.sleep(2000);
			password.sendKeys("123456");
			 Thread.sleep(2000);
		 //Step5: perform the action
			WebElement searchBtn = driver.findElement(By.linkText("Login"));
			searchBtn.click();
			 Thread.sleep(2000);
			driver.navigate().to("http://ecommerce.saipratap.net/products.php");
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
			
			//Step6: Validate the results
			String title = driver.getTitle(); //verify title , url, content, button, data b4 naviagting to next page
			System.out.println(driver.getTitle());
			String currentUrl =driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			Assert.assertEquals("Ez Shop Online", title);

  }
  @Test(priority =3)
  public void testValidUserNames() throws InterruptedException {
	 
		//Step3: identify the record elements 
			WebElement username = driver.findElement(By.id("email"));
			WebElement password = driver.findElement(By.id("password"));
		//Step4: set data
			 Thread.sleep(2000);
			username.sendKeys("neha@xyz.com");
			Thread.sleep(2000);
			boolean check1 = username.isEnabled();
			System.out.println(check1);
			boolean check2 = username.isSelected(); //Applicable for check box and radio buttons
			System.out.println(check2);
			boolean check3 = username.isDisplayed();
			System.out.println(check3);
			password.sendKeys("12345");
			 Thread.sleep(2000);
		 //Step5: perform the action
			WebElement searchBtn = driver.findElement(By.linkText("Login"));
			searchBtn.click();
			 Thread.sleep(2000);
			
			//Step6: Validate the results
			String title = driver.getTitle(); //verify title , url, content, button, data b4 naviagting to next page
			//System.out.println(driver.getTitle());
  		String currentUrl =driver.getCurrentUrl();
			Assert.assertEquals("Ez Shop Online", title);}
  
  @Test(priority =4)
  public void testBlankFields() throws InterruptedException {
	 
		//Step3: identify the record elements 
			WebElement username = driver.findElement(By.id("email"));
			WebElement password = driver.findElement(By.id("password"));
		//Step4: set data
			 Thread.sleep(2000);
			username.sendKeys("");
			Thread.sleep(2000);
			password.sendKeys("");
			 Thread.sleep(2000);
		 //Step5: perform the action
			WebElement searchBtn = driver.findElement(By.linkText("Login"));
			searchBtn.click();
			 Thread.sleep(2000);
			
			//Step6: Validate the results
			String title = driver.getTitle(); //verify title , url, content, button, data b4 naviagting to next page
			//System.out.println(driver.getTitle());
			String currentUrl =driver.getCurrentUrl();
			Assert.assertEquals("Ez Shop Online", title);
  }
  
  @Test(priority =1)
  public void testLostPswdNtRegMail() throws InterruptedException {
	 
		//Step3: identify the record elements 
			driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[4]/td/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("mail_address")).sendKeys("nehasinghal7@yahoo.co.in");
			driver.findElement(By.name("Submit")).click();
			 Thread.sleep(2000);
		
			String title = driver.getTitle(); //verify title , url, content, button, data b4 naviagting to next page
			System.out.println(driver.getTitle());
			String currentUrl =driver.getCurrentUrl();
			Assert.assertEquals("Ez Shop Online", title);}

  @Test(priority =0)
  public void testLostPswdRegMail() throws InterruptedException {
		 
		//Step3: identify the record elements 
			driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[4]/td/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("mail_address")).sendKeys("neha@xyz.com");
			driver.findElement(By.name("Submit")).click();
			 Thread.sleep(2000);
		
			String title = driver.getTitle(); //verify title , url, content, button, data b4 naviagting to next page
			System.out.println(driver.getTitle());
			String currentUrl =driver.getCurrentUrl();
			Assert.assertEquals("Ez Shop Online", title);}


}
