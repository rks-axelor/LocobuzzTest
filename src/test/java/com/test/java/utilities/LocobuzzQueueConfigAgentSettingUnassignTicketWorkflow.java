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

public class LocobuzzQueueConfigAgentSettingUnassignTicketWorkflow {

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

	public static void queueConfigurationAgentSettingUnassignedTicketProcess(WebDriver driver) throws Exception {
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

//unassigned tickets
			WebElement unassignedHeading = driver
					.findElement(By.xpath("(//p[@class='title' and text()='View/Action Unassigned Ticket'])"));
			WebElement toggleButton = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
			WebElement unassignedInfo = driver
					.findElement(By.xpath("(//div[@class='advanceTicketView__card--body text__sub--sm'])[1]"));
			if (unassignedHeading.isDisplayed() && toggleButton.isDisplayed() && unassignedInfo.isDisplayed()) {
				System.out.println("Unassigned tickets heading,information and toggle button are displayed");
			} else {
				System.out.println("Unassigned tickets heading,information and toggle button are not displayed");
			}

			agentProcess(driver);
			Thread.sleep(3000);

//active the toggle button of unassigned tickets
			WebElement toggleButton1 = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
			js.executeScript("arguments[0].click()", toggleButton1);
			Thread.sleep(3000);

			agentProcess1(driver);
			Thread.sleep(3000);
			
			WebElement toggleButton2 = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
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

//tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver.findElement(By.xpath(
					"//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

//more
			WebElement moreButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_arrow_down')]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(3000);

			System.out.println("Unassigned Ticket option is not present");

			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(3000);

//logout			
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

// agentprocess1
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

// more
			WebElement moreButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_arrow_down')]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(3000);
			
			WebElement unassignedTicket=driver.findElement(By.xpath("//button[contains(text(),' Unassigned Tickets ')]"));
			if(unassignedTicket.isDisplayed()) {
				System.out.println("Unassigned ticket is present");
			}
			else {
				System.out.println("Unassigned ticket is not present");
			}
			js.executeScript("arguments[0].click()", unassignedTicket);
			Thread.sleep(3000);
			
//logout			
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
