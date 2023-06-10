package com.test.java.classes;

import org.testng.annotations.Test;

import com.test.java.utilities.CommonFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;

public class FacebookTicketGeneration {
	WebDriver driver;
	public String testName, className, dateTime, status;

	@BeforeTest
	public void beforeTest(ITestContext testContext) throws InterruptedException {

		testName = testContext.getName();
		className = this.getClass().getSimpleName();
		dateTime = CommonFunctions.getDataTime();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}

	@Test
	public void FacebookLoginFunctionality() throws Exception {
		try {
//Login
			WebElement username = driver.findElement(By.id("email"));
			username.sendKeys("kalyan.chinni@locobuzz.com");
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("Kalyan@#24");
			WebElement login = driver.findElement(By.name("login"));
			login.click();

			System.out.println("Facebook login successful");

//Message  
			WebElement messengerButton = driver.findElement(
					By.xpath("(//div[@aria-label='Messenger' and @role='button'])[1]"));
			messengerButton.click();
			Thread.sleep(3000);
			WebElement messengers = driver.findElement(By.xpath("//a[contains(text(),'See all in Messenger')]"));
			messengers.click();
			Thread.sleep(3000);
			
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement userMessenger = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Kalyan page')])[1]")));

			userMessenger.click();
			if (userMessenger.isDisplayed()) {
				System.out.println("User messenger is displayed");
			} else {
				System.out.println("User messenger is not displayed");
			}
			Thread.sleep(2000);
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);

			WebElement messenges = driver.findElement(By.xpath("//div[@aria-label='Message']"));
			String facebookDynamicMessage = "facebook test" + " " + strDate;
			messenges.sendKeys(facebookDynamicMessage);
			WebElement send = driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']"));
			send.click();
			System.out.println("Message sent successful");

//Logout

			WebElement account = driver.findElement(By.xpath("//div[@aria-label='Your profile']"));
			account.click();
			Thread.sleep(1000);
			WebElement logout = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
			logout.click();
			System.out.println("Facebook logout successful");

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
