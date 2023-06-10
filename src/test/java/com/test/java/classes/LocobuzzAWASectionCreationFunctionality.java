package com.test.java.classes;

import org.testng.annotations.Test;

import com.test.java.utilities.CommonFunctions;
import com.test.java.utilities.LocobuzzAWASectionCreation;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;

public class LocobuzzAWASectionCreationFunctionality {
	public static WebDriver driver;
	public String testName, className, dateTime, status;

	@BeforeTest
	public void loadingURL(ITestContext testContext) throws InterruptedException {
		testName = testContext.getName();
		className = this.getClass().getSimpleName();
		dateTime = CommonFunctions.getDataTime();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awa-staging.locobuzz.com/");
		Thread.sleep(2000);
	}

	@Test
	@Parameters({ "user" })
	public void AWA(String user) throws Exception	 {

		try {
			
			
			LocobuzzAWASectionCreation.LoginFunctionality(driver,user);
			LocobuzzAWASectionCreation.SelectionCreation(driver);
			LocobuzzAWASectionCreation.logout(driver);
			
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
	public void tearDown() {

		driver.close();
		driver.quit();
	}


}
