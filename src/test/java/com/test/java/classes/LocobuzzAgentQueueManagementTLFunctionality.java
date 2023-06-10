package com.test.java.classes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import com.test.java.utilities.CommonFunctions;
import com.test.java.utilities.LocobuzzAgentQueueManagementTLWorkflow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
public class LocobuzzAgentQueueManagementTLFunctionality {
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
		driver.get("https://locobuzzng-atest.locobuzz.com/login");
		Thread.sleep(2000);
	}

	@Test
	@Parameters({ "user" })
	public void AgentQueueTLWorkFlow(String user) throws Exception	 {

		try {
			
			CommonFunctions.login(driver, user);
			
			LocobuzzAgentQueueManagementTLWorkflow.goingAccountSession(driver);
			LocobuzzAgentQueueManagementTLWorkflow.AgentQueueManagementUIVerificationprocess(driver);
			LocobuzzAgentQueueManagementTLWorkflow.Verifyingactionafterlogin(String[].class,driver);
			CommonFunctions.logout(driver);
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

	

  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
