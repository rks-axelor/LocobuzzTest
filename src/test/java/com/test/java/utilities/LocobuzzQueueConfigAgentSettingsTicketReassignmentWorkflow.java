package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocobuzzQueueConfigAgentSettingsTicketReassignmentWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void queueConfigurationAgentSettingTicketReassignmentProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//response management
			WebElement responseManagement = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Response Management ')])[1]"));
			js.executeScript("arguments[0].click()", responseManagement);
			Thread.sleep(3000);

//queue management
			WebElement queueManagementLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Queue_Configuration.svg']"));
			WebElement queueManagement = driver.findElement(By.xpath("//span[contains(text(),'Queue Configuration')]"));
			if (queueManagementLogo.isDisplayed() && queueManagement.isDisplayed()) {
				System.out.println("Queue Management is displayed");
			} else {
				System.out.println("Queue Management is not displayed");
			}
			js.executeScript("arguments[0].click()", queueManagement);
			Thread.sleep(3000);

//advance settings viewing option tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement advanceSettings = driver
					.findElement(By.xpath("(//span[contains(text(),'Advance Ticket Viewing Options')])[1]"));
			if (pushpin.isDisplayed() && advanceSettings.isDisplayed()) {
				System.out.println("Advance Settings viewing option tab is displayed");
			} else {
				System.out.println("Advance Settings viewing option tab is not displayed");
			}
			js.executeScript("arguments[0].click()", advanceSettings);
			Thread.sleep(3000);

//advance settings viewing option heading
			WebElement heading = driver.findElement(By.xpath(
					"(//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title'])[2]"));
			WebElement info = driver
					.findElement(By.xpath("(//p[@class='mb-0 mt-6 text__light--sm font-weight-400'])[2]"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Heading and information are displayed");
			} else {
				System.out.println("Heading and information are not displayed");
			}

//ticket reassignment
			WebElement reassignHeading = driver
					.findElement(By.xpath("(//p[@class='title' and text()='Agent Ticket Reassignment'])"));
			WebElement toggleButton = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[2]"));
			WebElement reassignInfo = driver
					.findElement(By.xpath("(//div[@class='advanceTicketView__card--body text__sub--sm'])[2]"));
			if (reassignHeading.isDisplayed() && toggleButton.isDisplayed() && reassignInfo.isDisplayed()) {
				System.out.println("Reassignment heading,information and toggle button are displayed");
			} else {
				System.out.println("Reassignment heading,information and toggle button are not displayed");
			}

			agentProcess(driver);
			Thread.sleep(3000);

//active the toggle button of ticket reassignment
			WebElement toggleButton1 = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[2]"));
			js.executeScript("arguments[0].click()", toggleButton1);
			Thread.sleep(3000);

			agentProcess1(driver);
			Thread.sleep(3000);
			
			WebElement toggleButton2 = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[2]"));
			js.executeScript("arguments[0].click()", toggleButton2);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

// agentprocess
	@SuppressWarnings("deprecation")
	public static void agentProcess(WebDriver driver) throws Exception {
		try {

// Agentlogin
			String mainWindow = driver.getWindowHandle();
			System.out.println("Main Window: " + mainWindow);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://locobuzzng-atest.locobuzz.com/login");

			String childWindow = driver.getWindowHandle();
			System.out.println("Child Window: " + childWindow);

			CommonFunctions.login(driver, "Agent");

// tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver.findElement(By.xpath(
					"//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

//select brand
			// Thread.sleep(10000);
			WebElement brand1 = driver.findElement(By.xpath("(//span[contains(text(),' All ')])[2]"));
			js.executeScript("arguments[0].click()", brand1);
			WebElement unselectAll = driver.findElement(By.xpath("(//span[contains(text(),' All ')])[3]"));
			js.executeScript("arguments[0].click()", unselectAll);
			Thread.sleep(3000);
			WebElement brandName = driver.findElement(By.xpath("//input[@data-placeholder='Search brand']"));
			brandName.sendKeys("auto demo");
			WebElement selectBrand1 = driver.findElement(By.xpath("(//span[contains(text(),' Auto Demo ')])"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(2000);
			WebElement applyButton = driver.findElement(By.xpath("(//span[contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(7000);

//More

			WebElement moreIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'More')])[1]//preceding::mat-icon[1]"));
			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(4000);

			System.out.println("Assign option is not present");

			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(4000);

//logout			
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

// agentprocess
	@SuppressWarnings("deprecation")
	public static void agentProcess1(WebDriver driver) throws Exception {
		try {

// Agentlogin
			String mainWindow = driver.getWindowHandle();
			System.out.println("Main Window: " + mainWindow);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://locobuzzng-atest.locobuzz.com/login");

			String childWindow = driver.getWindowHandle();
			System.out.println("Child Window: " + childWindow);

			CommonFunctions.login(driver, "Agent");

// tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver.findElement(By.xpath(
					"//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

// select brand
			// Thread.sleep(10000);
			WebElement brand1 = driver.findElement(By.xpath("(//span[contains(text(),' All ')])[2]"));
			js.executeScript("arguments[0].click()", brand1);
			WebElement unselectAll = driver.findElement(By.xpath("(//span[contains(text(),' All ')])[3]"));
			js.executeScript("arguments[0].click()", unselectAll);
			Thread.sleep(3000);
			WebElement brandName = driver.findElement(By.xpath("//input[@data-placeholder='Search brand']"));
			brandName.sendKeys("auto demo");
			WebElement selectBrand1 = driver.findElement(By.xpath("(//span[contains(text(),' Auto Demo ')])"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(2000);
			WebElement applyButton = driver.findElement(By.xpath("(//span[contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(7000);
			
//More

			WebElement moreIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'More')])[1]//preceding::mat-icon[1]"));
			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(4000);

			System.out.println("Assign option is not present");

			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(4000);
			
//assign to
			WebElement assignTo=driver.findElement(By.xpath("(//span[contains(text(),'Assign to')])"));
			if(assignTo.isDisplayed()) {
				System.out.println("Assign To is displayed");
			}
			else {
				System.out.println("Assign To is not displayed");
			}
			js.executeScript("arguments[0].click()", assignTo);
			Thread.sleep(5000);
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])[2]"));
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(4000);
			
//logout			
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();


		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
