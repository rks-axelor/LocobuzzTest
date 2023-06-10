package com.test.java.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.java.utilities.CommonFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwitterTicketGeneration {
	public static WebDriver driver;
	public String testName, className, dateTime, status;

	@BeforeTest
	public void beforeTest(ITestContext testContext) throws InterruptedException {
		testName = testContext.getName();
		className = this.getClass().getSimpleName();
		dateTime = CommonFunctions.getDataTime();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		Thread.sleep(30000);
	}

//login	

	@Test
	public void TwitterLoginFunctionality() throws Exception {
		try {
			  JavascriptExecutor js = (JavascriptExecutor) driver;
//Login
			WebElement signUp = driver.findElement(By.xpath("(//span[contains(text(),'Sign up')])[1]"));
			signUp.click();
			Thread.sleep(3000);
			WebElement signUp2 = driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]"));
			js.executeScript("arguments[0].click()", signUp2);
			Thread.sleep(5000);
			WebElement username = driver.findElement(By.name("text"));
			username.sendKeys("@Komal87224405");
			Thread.sleep(3000);
			WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			next.click();
			Thread.sleep(1000);
			/*
			 * WebElement email=driver.findElement(By.name("text"));
			 * email.sendKeys("kalyan.chinni@locobuzz.com"); Thread.sleep(1000); WebElement
			 * next1=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			 * next1.click(); Thread.sleep(1000);
			 */
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("Loco@123");
			Thread.sleep(1000);
			WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
			login.click();
			Thread.sleep(4000);
			System.out.println("Tweet Login Successful");

//Tweet		
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);

			WebElement whatHappening = driver.findElement(By.xpath("//div[@data-testid='tweetTextarea_0']"));
			whatHappening.click();
			String twitterDynamicMessage = "@TShrivatri   twitter test" + " " + strDate;
			whatHappening.sendKeys(twitterDynamicMessage);
			Thread.sleep(1000);

			WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
			tweetButton.click();
			Thread.sleep(4000);
			System.out.println("Tweet posted Successfully");

//logout
			WebElement usernameHomePage = driver
					.findElement(By.xpath("//div[@aria-label='Account menu' and @role='button'] "));
			usernameHomePage.click();
			Thread.sleep(2000);
			WebElement logoutButton = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
			logoutButton.click();
			Thread.sleep(2000);
			WebElement logoutConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Log out')])[2]"));
			logoutConfirm.click();
			System.out.println("Twitter logout Sucessful");

//status
			status = "Pass";
			String[] statusData = { testName, className, status, dateTime };
			CommonFunctions.writeStatusDataToExcel(statusData);

		} catch (Exception e) {
			status = "Fail";
			String[] statusData = { testName, className, status, dateTime };
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
