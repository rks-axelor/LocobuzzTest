package com.test.java.utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocobuzzQueueConfigAgentSettingsAdvanceTicketViewWorkflow {

	public static String ticketIDValue;

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

	public static void queueConfigurationAgentSettingAdvanceTicketViewProcess(WebDriver driver, String channel)
			throws Exception {
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

//ticket viewing
			WebElement ticketViewingHeading = driver
					.findElement(By.xpath("(//p[@class='title' and text()='Advance Ticket Viewing Options'])"));
			WebElement toggleButton2 = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[3]"));
			WebElement ticketVewingInfo = driver
					.findElement(By.xpath("(//div[@class='advanceTicketView__card--body text__sub--sm'])[3]"));
			if (ticketViewingHeading.isDisplayed() && toggleButton2.isDisplayed() && ticketVewingInfo.isDisplayed()) {
				System.out.println("Ticket Vewing heading,information and toggle button are displayed");
			} else {
				System.out.println("Ticket Vewing heading,information and toggle button are not displayed");
			}

//active the toggle button of advance ticket viewing option
			WebElement toggleButton1 = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[3]"));
			js.executeScript("arguments[0].click()", toggleButton1);
			Thread.sleep(3000);

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			Thread.sleep(2000);

			CommonFunctions.ticketsSearch(driver, channel);

//Assigning

			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(2000);

			WebElement assignTo = driver.findElement(By.xpath("(//span[contains(text(),'Assign to')])"));
			js.executeScript("arguments[0].click()", assignTo);
			Thread.sleep(5000);

			WebElement selectUser = driver
					.findElement(By.xpath("//mat-label[contains(text(),'Select User')]//preceding::input[1]"));
			js.executeScript("arguments[0].click()", selectUser);
			Thread.sleep(2000);

			WebElement assignUser = driver.findElement(By.xpath("(//span[contains(text(),'kalyan agent')])"));
			js.executeScript("arguments[0].click()", assignUser);
			Thread.sleep(2000);
			WebElement assignButton = driver.findElement(By.xpath("(//span[contains(text(),'Assign')])[2]"));
			js.executeScript("arguments[0].click()", assignButton);
			Thread.sleep(2000);

			agentProcess(driver, channel);
			Thread.sleep(3000);

			agentProcess1(driver, channel);
			Thread.sleep(3000);
			
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);
			
//response management
			WebElement responseManagement1 = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Response Management ')])[1]"));
			js.executeScript("arguments[0].click()", responseManagement1);
			Thread.sleep(3000);
			
//queue management
			WebElement queueManagement1 = driver.findElement(By.xpath("//span[contains(text(),'Queue Configuration')]"));
			js.executeScript("arguments[0].click()", queueManagement1);
			Thread.sleep(3000);
			
//advance settings viewing option tab
			WebElement advanceSettings1 = driver
					.findElement(By.xpath("(//span[contains(text(),'Advance Ticket Viewing Options')])[1]"));
			js.executeScript("arguments[0].click()", advanceSettings1);
			Thread.sleep(3000);
			
//active the toggle button of advance ticket viewing option
			WebElement toggleButton = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[3]"));
			js.executeScript("arguments[0].click()", toggleButton);
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
	public static void agentProcess(WebDriver driver, String channel) throws Exception {
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
			brandName.sendKeys("titan");
			WebElement selectBrand1 = driver.findElement(By.xpath("(//span[contains(text(),' Titan ')])"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(2000);
			WebElement applyButton = driver.findElement(By.xpath("(//span[contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(7000);

			CommonFunctions.ticketsSearch(driver, channel);
			Thread.sleep(3000);

			ticketTabVerification(driver, channel);
			replyPostButton(driver, channel);

//logout			
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

// ticket information
	public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			WebElement imageIcon = driver
					.findElement(By.xpath("(//img[@src='/assets/images/channel-logos/" + channel + ".svg'])[1]"));

// facebooklogo
			if (channel.equalsIgnoreCase("facebook")) {
				if (imageIcon.isDisplayed()) {
					System.out.println("Facebook Image displayed successfully");
				} else {
					System.out.println("Facebook Image not displayed");
				}

			}

// instagram logo
			else if (channel.equalsIgnoreCase("instagram")) {
				if (imageIcon.isDisplayed()) {
					System.out.println("Instagram Image displayed successfully");
				} else {
					System.out.println("Instagram Image not displayed");
				}

			}

// twitter logo
			else if (channel.equalsIgnoreCase("twitter")) {
				if (imageIcon.isDisplayed()) {
					System.out.println("Twitter Image displayed successfully");
				} else {
					System.out.println("Twitter Image not displayed");
				}

			}

// imagename

			WebElement ticketName = driver
					.findElement(By.xpath("//span[contains(text(),'Found')]//following::span[1]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

// username & userID

			WebElement username = driver.findElement(By.xpath("//span[contains(text(),'Found')]//following::a[1]"));
			if (username.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

//assign
			WebElement assignName = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'how_to_reg')]//following::span)[3]"));
			if (assignName.isDisplayed()) {
				System.out.println("Assign name is displayed");
			} else {
				System.out.println("Assign name is not displayed");
			}

// brandname

			WebElement brandname = driver
					.findElement(By.xpath("(//div[@class='post__pill bg__grey--lighter nowrap'])[2]"));
			if (brandname.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

//time

			WebElement timeScheduleIcon = driver.findElement(By.xpath("(//mat-icon[contains(.,'schedule')])"));
			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));

			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);
			timeInformation(driver);

// ticketsid
			WebElement ticketIcon = driver.findElement(By.xpath(
					"(//div[contains(@class,'post__foot--item')]//following::mat-icon[contains(text(),'local_activity')])[1]"));
			WebElement ticketID = driver.findElement(By.xpath(
					"(//mat-icon[contains(text(),'local_activity')]//following::span[@class='post__foot--label'])[1]"));
			ticketIDValue = ticketID.getText();
			System.out.println("Ticket ID: " + ticketIDValue);
			if (ticketIcon.isDisplayed() && ticketID.getText() != "") {
				System.out.println("Ticket ID & Icon are displayed");
			} else {
				System.out.println("Ticket ID & Icon are not displayed");
			}

//ticketStatus

			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[1]"));
			WebElement ticketStatus = driver.findElement(
					By.xpath("(//span[@class='post__foot--label ticketstatus__blue colored__locobuzz'])[1]"));

			if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
				System.out.println("TicketStatus is displayed");
				if (ticketStatus.getText().trim().equalsIgnoreCase("open")) {
					System.out.println("Ticket Status is open");
				} else {
					System.out.println("Ticket Status is not open");
				}

			} else {
				System.out.println("TicketStatus is not displayed");
			}

//priority			
			WebElement priorityIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(By.xpath("(//span[contains(@class,'post__foot--label')])[4]"));

			if (priority.isDisplayed() && priorityIcon.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

// mention category

			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate')])[1]"));
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is dispalyed");
			} else {
				System.out.println("Device is not dispalyed");
			}

//open post
			if (channel.equalsIgnoreCase("twitter")) {
				WebElement openPostIcon = driver
						.findElement(By.xpath("(//mat-icon[contains(text(),'open_in_new')])[1]"));
				WebElement openPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Post')])[1]"));

				if (openPostButton.isEnabled() && openPostIcon.isDisplayed()) {
					System.out.println("Open post button is displayed and enabled");
				} else {
					System.out.println("Open post button is not displayed and enabled");
				}
			}

//direct close

			WebElement directCloseIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]//preceding::mat-icon[1]"));
			WebElement directCloseButton = driver.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]"));

			if (directCloseButton.isEnabled() && directCloseIcon.isDisplayed()) {
				System.out.println("Direct close button is displayed and enabled");
			} else {
				System.out.println("Direct close button is not displayed and enabled");
			}

//sendemail
			WebElement sendEmailIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'mail_outline')])[1]"));
			WebElement sendEmailButton = driver.findElement(By.xpath("(//span[contains(text(),'Send Email')])[1]"));
			if (sendEmailIcon.isDisplayed() && sendEmailButton.isDisplayed()) {
				System.out.println("Send email button is displayed and enabled");
			} else {
				System.out.println("Send email button is not displayed and enabled");
			}

//Open details

			WebElement openDetailsIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]//preceding::mat-icon[1]"));
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));

			if (openDetailsButton.isEnabled() && openDetailsIcon.isDisplayed()) {
				System.out.println("Open details button is displayed and enabled");
			} else {
				System.out.println("Open details button is not displayed and enabled");
			}

//Reply post

			WebElement replyPostIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Reply')])[2]//preceding::mat-icon[1]"));
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply')])[2]"));

			if (replyPostButton.isEnabled() && replyPostIcon.isDisplayed()) {
				System.out.println("Reply post button is displayed and enabled");
			} else {
				System.out.println("Reply post button is not displayed and enabled");
			}

//More

			WebElement moreIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'More')])[1]//preceding::mat-icon[1]"));
			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));

			if (moreButton.isEnabled() && moreIcon.isDisplayed()) {
				System.out.println("More button is displayed and enabled");
			} else {
				System.out.println("More button is not displayed and enabled");
			}

			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static String getTicketValueID() {
		return ticketIDValue;
	}

	public static void timeInformation(WebDriver driver) throws Exception {
		try {

			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

//Created Time			

			WebElement createdOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Created on:')]//following::span)[1]"));
			// ticketInformation.add(4, createdOnTime.getText());
			System.out.println("Created Time: " + createdOnTime.getText());

//Modified Time

			WebElement modifiedOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

			// ticketInformation.add(5, modifiedOnTime.getText());
			System.out.println("Modified On: " + modifiedOnTime.getText());

//Mentioned Time

			WebElement mentionedOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Mentioned on:')]//following::span)[1]"));
			// ticketInformation.add(6, mentionedOnTime.getText());
			System.out.println("Mentioned On: " + mentionedOnTime.getText());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void replyPostButton(WebDriver driver, String channel) throws Exception {
		try {

//Click reply post
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply')])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", replyPostButton);
			Thread.sleep(2000);
			checkReplyType(driver, channel);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void checkReplyType(WebDriver driver, String channel) throws Exception {
		try {

//ReplyType 
			Thread.sleep(2000);
			WebElement replyTypeSelector = driver.findElement(
					By.xpath("//span[contains(@class,'ng-star-inserted') and contains(text(),'Reply &')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", replyTypeSelector);
			WebElement replyCloseButton = driver
					.findElement(By.xpath("//span[@class = 'mat-option-text' and contains(text(),'Reply & Close')]"));
			String replyCloseButtonValue = replyCloseButton.getText();
			System.out.println("Reply Type: " + replyCloseButtonValue);
			WebElement replyEscalateButton = driver.findElement(
					By.xpath("//span[@class = 'mat-option-text' and contains(text(),'Reply & Escalate')]"));
			String replyEscalateButtonValue = replyEscalateButton.getText();
			System.out.println("Reply Type: " + replyEscalateButtonValue);
			WebElement replyOnHoldButton = driver
					.findElement(By.xpath("//span[@class = 'mat-option-text' and contains(text(),'Reply & On Hold')]"));

			String replyOnHoldButtonValue = replyOnHoldButton.getText();
			System.out.println("Reply Type: " + replyOnHoldButtonValue);

			WebElement replyAwaitingButton = driver.findElement(By.xpath(
					"//span[@class = 'mat-option-text' and contains(text(),'Reply & Awaiting response from Customer')]"));

			String replyAwaitingButtonValue = replyAwaitingButton.getText();
			System.out.println("Reply Type: " + replyAwaitingButtonValue);

			if (replyCloseButton.isDisplayed() && replyEscalateButton.isDisplayed() && replyOnHoldButton.isDisplayed()
					&& replyAwaitingButton.isDisplayed()) {

				System.out.println("All reply types are displayed");
			} else {
				System.out.println("All reply types are not displayed");
			}

			replyWorkFlow(driver, replyOnHoldButtonValue, channel);

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@SuppressWarnings("deprecation")
	public static void replyWorkFlow(WebDriver driver, String replyType, String channel) throws Exception {
		try {

			WebElement replyTypeSelect = driver.findElement(
					By.xpath("//span[@class = 'mat-option-text' and contains(text(),'" + replyType + "')]"));
			replyTypeSelect.click();
			Thread.sleep(2000);

//DateTime			
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);

			WebElement replyTextArea = driver.findElement(By.xpath("//textarea[@placeholder='Write Reply']"));

			replyTextArea.sendKeys("Workflow processed" + " " + strDate);
			WebElement replySubmit = driver.findElement(By.xpath("//button[@type='submit']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", replySubmit);

			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement closeSearch = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//mat-icon[contains(text(),'arrow_back')]")));
			js.executeScript("arguments[0].click()", closeSearch);
			Thread.sleep(2000);

			if (replyType.trim().equalsIgnoreCase("Reply & On Hold")) {
				WebElement onHoldTickets = driver.findElement(By.xpath("//a[contains(text(),'On Hold')]"));
				js.executeScript("arguments[0].click()", onHoldTickets);
				Thread.sleep(2000);
				checkReplyTypeProcessStatus(driver, replyType, ticketIDValue, channel);
				// ticketProcessToOpen(driver, replyType, ticketIDValue);

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@SuppressWarnings("deprecation")
	public static void checkReplyTypeProcessStatus(WebDriver driver, String replyType, String ticketIDValue,
			String channel) throws Exception {
		try {

// search with ticket
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement search = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", search);

			Thread.sleep(2000);
			WebElement inputbox = driver.findElement(By.id("post-search-input"));
			inputbox.sendKeys(ticketIDValue);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(5000);

//check ticket status			
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[contains(@class,'post__foot--label')])[3]"));
			if (replyType.trim().equalsIgnoreCase("Reply & On Hold")) {

				if (ticketStatus.getText().trim().equalsIgnoreCase("Kept On Hold")) {
					System.out.println("Ticket Status is On Hold");
				} else {
					System.out.println("Ticket Status is not On Hold");
				}

				// ticketInformation.add(14, ticketStatus.getText());
				WebElement dateTime = driver.findElement(By.xpath("//span[@class='post__head--label text-nowrap']"));
				Actions actions = new Actions(driver);
				Action action = actions.moveToElement(dateTime).click().build();
				action.perform();
				Thread.sleep(4000);

				WebElement onholdTime = driver.findElement(By.xpath(
						"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));
				// ticketInformation.add(15, onholdTime.getText());
				System.out.println("Modified On: " + onholdTime.getText());
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

// agentprocess
	@SuppressWarnings("deprecation")
	public static void agentProcess1(WebDriver driver, String channel) throws Exception {
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

			CommonFunctions.login(driver, "Agent1");

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
			brandName.sendKeys("titan");
			WebElement selectBrand1 = driver.findElement(By.xpath("(//span[contains(text(),' Titan ')])"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(2000);
			WebElement applyButton = driver.findElement(By.xpath("(//span[contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(7000);
			
//onhold tab
			WebElement onHoldTab=driver.findElement(By.xpath("//a[contains(text(),'On Hold')]"));
			js.executeScript("arguments[0].click()", onHoldTab);
			Thread.sleep(5000);
			
			CommonFunctions.ticketsSearch(driver, channel);
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
