package com.test.java.utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewMentionInstagramEscalateCreateTicketProcess {

	public static String ticketIDValue, ticketStatusValue;
	public static List<String> ticketInformation = new ArrayList<String>();

	public static void makeActionableProcess(WebDriver driver, String channel) throws Exception {
		try {

//tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);

			CommonFunctions.ticketsSearch(driver, channel);

//Assigning

			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(1000);

			WebElement assigning = driver.findElement(By.xpath("(//mat-label[contains(text(),'Not Assigned')])"));
			js.executeScript("arguments[0].click()", assigning);
			Thread.sleep(1000);

			WebElement assignperson = driver.findElement(By.xpath(
					"//mat-icon[contains(text(),'person')]//following::span[contains(text(),'Kalyan live chinni')]"));
			js.executeScript("arguments[0].click()", assignperson);
			Thread.sleep(1000);

			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'New Ticket Filter')]"));
			js.executeScript("arguments[0].click()", newTicketFilter);
			Thread.sleep(1000);

			WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[1]"));
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//ticket information
	public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, "Instagram Ticket WorkFlow");

// instagram logo
			WebElement imageIcon = driver
					.findElement(By.xpath("//img[@src='/assets/images/channel-logos/insta_dm.svg']"));
			if (imageIcon.isDisplayed()) {
				System.out.println("Instagram Image displayed successfully");
			} else {
				System.out.println("Instagram Image not displayed");
			}

			ticketInformation.add(1, "Instagram");

// imagename
			WebElement ticketName = driver.findElement(By.xpath("//span[contains(text(),'Instagram Messages')]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

// username
			WebElement userName = driver
					.findElement(By.xpath("//span[contains(text(),'Instagram Messages')]//following::a[1]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

			ticketInformation.add(2, userName.getText());

// assign
			WebElement assignName = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'how_to_reg')]//following::span[1]"));
			if (assignName.isDisplayed()) {
				System.out.println("assign name is displayed");
			} else {
				System.out.println("assign name is not displayed");
			}

			String assignNameValue = assignName.getText();

// brandname
			WebElement brandName = driver.findElement(By.xpath("//div[@class='post__pill nowrap']"));
			if (brandName.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			ticketInformation.add(3, brandName.getText());

// time
			WebElement timeScheduleIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])"));
			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])"));
			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);
			timeInformation(driver);

// ticketid
			WebElement ticketIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'local_activity')])[4]"));
			WebElement ticketId = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[1]"));
			ticketIDValue = ticketId.getText();
			System.out.println("Ticket ID: " + ticketIDValue);
			if (ticketIcon.isDisplayed() && ticketId.getText() != "") {
				System.out.println("Ticket ID & Icon are displayed");
			} else {
				System.out.println("Ticket ID & Icon are not displayed");
			}

			ticketInformation.add(7, ticketId.getText());

// ticketStatus
			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[5]"));
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));
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

			ticketInformation.add(8, ticketStatus.getText());

// priority
			WebElement priorityIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[4]"));

			if (priorityIcon.isDisplayed() && priority.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			ticketInformation.add(9, priority.getText());

// mention category
			WebElement symbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'alternate_email')]"));
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--value'])"));
			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is displayed");
			} else {
				System.out.println("Device is not displayed");
			}

			ticketInformation.add(10, device.getText());

			ticketInformation.add(11, assignNameValue);
			ticketInformation.add(12, "NA");
			ticketInformation.add(13, "NA");
			ticketInformation.add(14, "NA");
			ticketInformation.add(15, "NA");

// direct close
			WebElement directCloseIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'cancel')])[2]"));
			WebElement directCloseButton = driver.findElement(By.xpath("//span[contains(text(),'Direct Close')]"));
			if (directCloseButton.isEnabled() && directCloseIcon.isDisplayed()) {
				System.out.println("Direct close button is displayed and enabled");
			} else {
				System.out.println("Direct close button is not displayed and enabled");
			}

// send email
			WebElement sendEmailIcon = driver.findElement(By.xpath("//mat-icon[contains(text(),'mail_outline')]"));
			WebElement sendEmailButton = driver.findElement(By.xpath("//span[contains(text(),'Send Email')]"));
			if (sendEmailIcon.isDisplayed() && sendEmailButton.isDisplayed()) {
				System.out.println("Send email button is displayed and enabled");
			} else {
				System.out.println("Send email button is not displayed and enabled");
			}

// opendetails
			WebElement openDetailsIcon = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			WebElement openDetailsButton = driver.findElement(By.xpath("//span[contains(text(),'Open Details')]"));
			if (openDetailsButton.isEnabled() && openDetailsIcon.isDisplayed()) {
				System.out.println("Open details button is displayed and enabled");
			} else {
				System.out.println("Open details button is not displayed and enabled");
			}

// replypost
			WebElement replyPostIcon = driver.findElement(By.xpath("//mat-icon[contains(text(),'reply ')]"));
			WebElement replyPostButton = driver.findElement(By.xpath("//span[contains(text(),'Reply Post')]"));
			if (replyPostButton.isEnabled() && replyPostIcon.isDisplayed()) {
				System.out.println("Reply post button is displayed and enabled");
			} else {
				System.out.println("Reply post button is not displayed and enabled");
			}

// more
			WebElement moreIcon = driver.findElement(By.xpath("//mat-icon[contains(text(),'more_horiz')]"));
			WebElement moreButton = driver.findElement(By.xpath("//span[contains(text(),'More')]"));
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

	public static void moreButton(WebDriver driver, String channel) throws Exception {
		try {

//Click the more button
			WebElement moreButton = driver.findElement(By.xpath("//span[contains(text(),'More')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(2000);
			WebElement escalateButton = driver.findElement(By.xpath("//span[contains(text(),'Escalate')]"));
			js.executeScript("arguments[0].click()", escalateButton);
			Thread.sleep(2000);
			WebElement escalateTo = driver.findElement(By.xpath("//mat-label[contains(text(),'Escalate To')]"));
			js.executeScript("arguments[0].click()", escalateTo);
			WebElement customerName = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and contains(.,'kalyan brand')]"));
			js.executeScript("arguments[0].click()", customerName);
			Thread.sleep(1000);
			WebElement escalateNote = driver.findElement(By.xpath("//textarea[@formcontrolname='replyEscalateNote']"));
			escalateNote.sendKeys("please check");
			Thread.sleep(2000);
			WebElement replySubmit = driver.findElement(By.xpath("//button[@type='submit']"));
			js.executeScript("arguments[0].click()", replySubmit);
			Thread.sleep(4000);

			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement closeSearch = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//mat-icon[contains(text(),'arrow_back')]")));
			js.executeScript("arguments[0].click()", closeSearch);
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);

			WebElement awaitingTickets = driver.findElement(By.xpath("(//a[contains(text(),'Awaiting')])[1]"));
			js.executeScript("arguments[0].click()", awaitingTickets);
			Thread.sleep(2000);
			System.out.println("Tickets goes to awaiting tab");
			checkReplyTypeProcessStatus(driver, ticketIDValue, channel);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@SuppressWarnings("deprecation")
	public static void checkReplyTypeProcessStatus(WebDriver driver, String ticketIDValue, String channel)
			throws Exception {
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

// assign
			WebElement assignName = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'escalator_warning')]//following::span[1]"));
			if (assignName.isDisplayed()) {
				System.out.println("assign name is displayed");
			} else {
				System.out.println("assign name is not displayed");
			}
			String assignNameValue = assignName.getText();
			ticketInformation.add(16, assignNameValue);

// instagram login
			InstagramLoginFunctionality(driver);
			Thread.sleep(5000);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(2000);

// check ticket status
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));
			if (ticketStatus.getText().trim().contains("Escalated to")) {
				System.out.println("Ticket Status is Escalated");
			} else {
				System.out.println("Ticket Status is not Escalated");
			}
			ticketStatusValue = ticketStatus.getText();
			ticketInformation.add(17, ticketStatusValue);

//open details

			WebElement openDetailsButton = driver.findElement(By.xpath("//span[contains(text(),'Open Details')]"));
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(6000);
			Actions at = new Actions(driver);

			for (int i = 1; i <= 10; i++) {
				at.sendKeys(Keys.PAGE_DOWN).build().perform();
			}

			WebElement moreButton = driver.findElement(By.xpath(
					"((//span[@mattooltip='Reply Post'])[2]//following::mat-icon[contains(text(),'more_vert')])[1]"));
			js.executeScript("arguments[0].click()", moreButton);
			WebElement createTicketButton = driver.findElement(By.xpath("//span[contains(text(),' Create Ticket')]"));
			js.executeScript("arguments[0].click()", createTicketButton);
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(2000);

//Close search
			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'New Ticket Filter')]"));
			js.executeScript("arguments[0].click()", newTicketFilter);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(3000);
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(2000);

//open tickets

			WebElement openTickets = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Open')]")));
			js.executeScript("arguments[0].click()", openTickets);
			Thread.sleep(2000);

//brandprocess

			brandTicketProcess(driver, ticketIDValue, channel);

//pending Tickets

			WebElement pendingTickets = driver.findElement(By.xpath("//a[contains(text(),'Pending')]"));
			js.executeScript("arguments[0].click()", pendingTickets);

//search with ticket

			WebElement searchBtn = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
			js.executeScript("arguments[0].click()", searchBtn);

			Thread.sleep(2000);
			WebElement inputbox1 = driver.findElement(By.id("post-search-input"));
			inputbox1.sendKeys(ticketIDValue);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(5000);

//ticket Status
			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[5]"));
			WebElement ticketStatus1 = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));
			if (ticketStatusIcon.isDisplayed() && ticketStatus1.getText() != "") {
				System.out.println("TicketStatus is displayed");

			} else {
				System.out.println("TicketStatus is not displayed");
			}

			ticketInformation.add(19, ticketStatus1.getText());

			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

			WebElement approvedTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

			ticketInformation.add(20, approvedTime.getText());
			System.out.println("Modified On: " + approvedTime.getText());

//direct close
			WebElement directCloseButton = driver.findElement(By.xpath("//span[contains(text(),'Direct Close')]"));
			js.executeScript("arguments[0].click()", directCloseButton);
			Thread.sleep(1000);
			WebElement closeWithoutNote = driver.findElement(By.xpath("//span[contains(text(),'Close Without Note')]"));
			js.executeScript("arguments[0].click()", closeWithoutNote);
			Thread.sleep(1000);
			WebElement close = driver.findElement(
					By.xpath("//div[@class='alert-modal__actions']//following::span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(2000);

//Close search

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(2000);

//ticket close

			verifyClosedTicket(driver, ticketIDValue);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void InstagramLoginFunctionality(WebDriver driver) throws Exception {
		try {

			String mainWindow = driver.getWindowHandle();
			System.out.println("Main Window: " + mainWindow);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");

			String childWindow = driver.getWindowHandle();
			System.out.println("Child Window: " + childWindow);

//Login
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Thread.sleep(5000);
			WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys("kalyan.peddireddy");
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("Kalyan@$04");
			WebElement loginButton = driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
			loginButton.click();
			Thread.sleep(3000);
			WebElement instagramLogo = driver.findElement(By.xpath("//img[@alt='Instagram']"));
			instagramLogo.click();
			Thread.sleep(3000);

			try {
				WebElement notificationPopUp = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
				if (notificationPopUp.isDisplayed()) {
					js.executeScript("arguments[0].click()", notificationPopUp);

				}
			} catch (Exception e) {
				js.executeScript("arguments[0].click()", instagramLogo);

			}
			System.out.println("Instagram login succesful");
//message 
			WebElement messenger = driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Messenger']"));
			messenger.click();
			Thread.sleep(3000);
			WebElement bittuUser = driver
					.findElement(By.xpath("//div[@class='N9abW']//div[contains(text(),'dipa_locobuzz_test')]"));
			bittuUser.click();
			Thread.sleep(1000);
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);
			WebElement message = driver.findElement(By.xpath("//textarea[contains(@placeholder,'Message')]"));
			String instagramDynamicMessage = "instagram test" + " " + strDate;
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

			driver.switchTo().window(childWindow).close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

// brandTicketprocess
	@SuppressWarnings("deprecation")
	public static void brandTicketProcess(WebDriver driver, String ticketIDValue, String channel) throws Exception {
		try {

// brandlogin
			String mainWindow = driver.getWindowHandle();
			System.out.println("Main Window: " + mainWindow);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://locobuzzng-uat-aws.locobuzz.com/login");

			String childWindow = driver.getWindowHandle();
			System.out.println("Child Window: " + childWindow);

			CommonFunctions.login(driver, "Brand");

// search with ticket

			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement search = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[contains(text(),' search')]")));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", search);

			Thread.sleep(2000);
			WebElement inputbox = driver.findElement(By.id("post-search-input"));
			inputbox.sendKeys(ticketIDValue);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(5000);

// instagramlogo
			WebElement imageIcon = driver
					.findElement(By.xpath("//img[@src='/assets/images/channel-logos/insta_dm.svg']"));
			if (imageIcon.isDisplayed()) {
				System.out.println("Instagram Image displayed successfully");
			} else {
				System.out.println("Instagram Image not displayed");
			}

// imagename
			WebElement ticketName = driver.findElement(By.xpath("//span[contains(text(),'Instagram Messages')]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

// username
			WebElement userName = driver
					.findElement(By.xpath("//span[contains(text(),'Instagram Messages')]//following::a[1]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

// assign
			/*
			 * WebElement assignName = driver .findElement(By.xpath(
			 * "(//mat-icon[contains(text(),'escalator_warning')]//following::span)[1]"));
			 * if (assignName.isDisplayed()) {
			 * System.out.println("assign name is dispalyed"); } else {
			 * System.out.println("assign name is not displayed"); }
			 * 
			 * String assignNameValue = assignName.getText();
			 */

// brandname

			WebElement brandname = driver.findElement(By.xpath("(//div[@class='post__pill nowrap'])"));
			if (brandname.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

// time

			WebElement timeScheduleIcon = driver.findElement(By.xpath("(//mat-icon[contains(.,'schedule')])"));
			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])"));

			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);

			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

			WebElement escalatedTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

			System.out.println("Modified On: " + escalatedTime.getText());
			String escalatedTimeValue = escalatedTime.getText();
			ticketInformation.add(18, escalatedTimeValue);

// ticketid
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

// ticketStatus

			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[5]"));
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

			if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
				System.out.println("TicketStatus is displayed");

			} else {
				System.out.println("TicketStatus is not displayed");
			}

// priority
			WebElement priorityIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[4]"));

			if (priority.isDisplayed() && priorityIcon.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

// mention category

			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate')])[1]"));
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--value'])[1]"));

			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is displayed");
			} else {
				System.out.println("Device is not displayed");
			}

// approving the ticket

			WebElement approveTicket = driver.findElement(By.xpath("//span[contains(text(),'Approve')]"));
			js.executeScript("arguments[0].click()", approveTicket);
			Thread.sleep(1000);
			WebElement textarea = driver.findElement(By.xpath("//textarea[@placeholder='Enter note here']"));
			textarea.sendKeys("Approved by me");
			Thread.sleep(1000);

			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(1000);
			System.out.println("Ticket is Approved");

// logout
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void verifyClosedTicket(WebDriver driver, String ticketIDValue) throws Exception {
		try {
			
			WebElement moreButton = driver.findElement(By.xpath("//a[contains(text(),'More')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", moreButton);

			WebElement closedTickets = driver.findElement(By.xpath("//button[contains(text(),' Closed Tickets ')]"));
			closedTickets.click();
			Thread.sleep(2000);
//search for ticket			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement search = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[contains(text(),' search')]")));
			js.executeScript("arguments[0].click()", search);

			Thread.sleep(2000);
			WebElement inputbox = driver.findElement(By.id("post-search-input"));
			inputbox.sendKeys(ticketIDValue);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(5000);

// ticketclosed status
			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[5]"));
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

			if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
				System.out.println("TicketStatus is displayed");
				if (ticketStatus.getText().trim().equalsIgnoreCase("closed")) {
					System.out.println("Ticket  is closed");
					System.out.println("Escalated process completed");
				} else {
					System.out.println("Ticket  is not closed");
				}

			} else {
				System.out.println("Ticket Status is not displayed");
			}

			ticketInformation.add(21, ticketStatus.getText());

			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

			WebElement modifiedOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

			ticketInformation.add(22, modifiedOnTime.getText());
			System.out.println("Modified On: " + modifiedOnTime.getText());

			CommonFunctions.writeStatusInformationToExcel(ticketInformation);

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void timeInformation(WebDriver driver) throws Exception {
		try {

			WebElement dateTime = driver.findElement(By.xpath("//span[@class='post__head--label text-nowrap']"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

//Created Time			

			WebElement createdOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Created on:')]//following::span)[1]"));
			ticketInformation.add(4, createdOnTime.getText());
			System.out.println("Created Time: " + createdOnTime.getText());

//Modified Time

			WebElement modifiedOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

			ticketInformation.add(5, modifiedOnTime.getText());
			System.out.println("Modified On: " + modifiedOnTime.getText());

//Mentioned Time

			WebElement mentionedOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Mentioned on:')]//following::span)[1]"));
			ticketInformation.add(6, mentionedOnTime.getText());
			System.out.println("Mentioned On: " + mentionedOnTime.getText());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
