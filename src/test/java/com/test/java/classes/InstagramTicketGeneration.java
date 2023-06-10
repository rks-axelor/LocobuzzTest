package com.test.java.classes;

import org.testng.annotations.Test;

import com.test.java.utilities.CommonFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;

public class InstagramTicketGeneration {
	WebDriver driver;
	public String testName,className,dateTime,status;
	@BeforeTest
	public void beforeTest(ITestContext testContext) throws InterruptedException {
		
		testName = testContext.getName();
		className = this.getClass().getSimpleName();
		dateTime = CommonFunctions.getDataTime();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
	}

	@Test
	public void InstagramLoginFunctionality() throws Exception {
		try {
//Login
			WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys("kalyan.peddireddy");
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("Kalyan@$04");
			Thread.sleep(2000);
			WebElement loginButton = driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", loginButton);
			//loginButton.click();
			Thread.sleep(3000);
			WebElement instagramLogo = driver.findElement(By.xpath("//img[@alt='Instagram']"));
			instagramLogo.click();
			Thread.sleep(3000);

			try {
				WebElement notificationPopUp = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
				if (notificationPopUp.isDisplayed()) {
					notificationPopUp.click();
				}
			} catch (Exception e) {
				instagramLogo.click();
			}
			System.out.println("Instagram login succesful");
//message 
			WebElement messenger = driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Messenger']"));
			messenger.click();
			Thread.sleep(3000);
			WebElement bittuUser = driver.findElement(By.xpath("//div[@class='N9abW']//div[contains(text(),'dipa_locobuzz_test')]"));
			bittuUser.click();
			Thread.sleep(1000);
			Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
		    String strDate = formatter.format(date); 
			WebElement message = driver.findElement(By.xpath("//textarea[contains(@placeholder,'Message')]"));
			String instagramDynamicMessage="instagram test"+" "+strDate;
			message.sendKeys(instagramDynamicMessage);
			Thread.sleep(1000);
			message.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			System.out.println("Message sent successful");
//Logout
			
			WebElement userLogo = driver.findElement(
					By.xpath("//*[local-name()='svg' and @aria-label='Activity Feed']//following::img[1]"));
			userLogo.click();

			WebElement logoutButton = driver.findElement(By.xpath("//div[contains(text(),'Log out')]"));
			logoutButton.click();

			Thread.sleep(2000);
			System.out.println("Instagram logout Successful");
			
//status
			status = "Pass";
			String[] statusData = {testName,className,status,dateTime};
			CommonFunctions.writeStatusDataToExcel(statusData);
			
			

		} catch (Exception e) {
			status = "Fail";
			String[] statusData = {testName,className,status,dateTime};
			CommonFunctions.writeStatusDataToExcel(statusData);
			throw e;
		}
	}

	@AfterTest
	public void afterTest() {
		 driver.close();
		 driver.quit();
	}

}
