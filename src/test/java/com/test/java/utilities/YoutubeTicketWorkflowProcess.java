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

public class YoutubeTicketWorkflowProcess {

	public static String ticketIDValue;
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

			WebElement assigning = driver.findElement(By.xpath("(//mat-label[contains(text(),'Not Assigned')])[1]"));
			js.executeScript("arguments[0].click()", assigning);

			WebElement assignperson = driver.findElement(By.xpath(
					"//mat-icon[contains(text(),'person')]//following::span[contains(text(),'Kalyan live chinni')]"));
			js.executeScript("arguments[0].click()", assignperson);

			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'New Ticket Filter')]"));
			js.executeScript("arguments[0].click()", newTicketFilter);

			WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[1]"));
			js.executeScript("arguments[0].click()", search);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	//ticket information
	public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, "Youtube Ticket Workflow");
//youtubelogo			
			WebElement imageIcon = driver
					.findElement(By.xpath("//img[@src='/assets/images/channelicons/Youtube.svg']"));
			if (imageIcon.isDisplayed()) {
				System.out.println("Youtube image  is displayed");
			} else {
				System.out.println("Youtube image is not displayed");
			}
			ticketInformation.add(1, "Youtube");

//imagename
			WebElement ticketName = driver.findElement(By.xpath("//span[contains(text(),'Comments')]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket Name is displayed");
			} else {
				System.out.println("Ticket Name is not displayed");
			}

//username
			WebElement userName = driver.findElement(By.xpath("//span[contains(text(),'Comments')]//following::a[1]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed ");
			} else {
				System.out.println("Username is not displayed ");
			}

			ticketInformation.add(2, userName.getText());

//assign
			WebElement assignName = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'how_to_reg')]//following::span[1]"));
			if (assignName.isDisplayed()) {
				System.out.println("Assign name is displayed");
			} else {
				System.out.println("Assign name is displayed");
			}

			String assignNameValue = assignName.getText();

//brandname
			WebElement brandName = driver.findElement(By.xpath("//div[@class='post__pill nowrap']"));
			if (brandName.isDisplayed()) {
				System.out.println("Brand name is dispalyed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			ticketInformation.add(3, brandName.getText());

//time
			WebElement timeScheduleIcon = driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]"));
			WebElement dateTime = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]//following::span[1]"));

			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);
			timeInformation(driver);

//ticketid
			WebElement ticketIcon = driver.findElement(By.xpath(
					"(//div[contains(@class,'post__foot--item')]//following::mat-icon[contains(text(),'local_activity')])[1]"));
			WebElement ticketId = driver.findElement(By.xpath(
					"(//mat-icon[contains(text(),'local_activity')]//following::span[@class='post__foot--label'])[1]"));

			ticketIDValue = ticketId.getText();
			System.out.println("Ticket ID: " + ticketIDValue);
			if (ticketIcon.isDisplayed() && ticketId.getText() != "") {
				System.out.println("Ticket ID & Icon are displayed");
			} else {
				System.out.println("Ticket ID & Icon are not displayed");
			}

			ticketInformation.add(7, ticketId.getText());

//ticketStatus
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

//priority
			WebElement priorityIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[4]"));

			if (priorityIcon.isDisplayed() && priority.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			ticketInformation.add(9, priority.getText());

//mention category
			WebElement symbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'alternate_email')]"));
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--value'])[2]"));

			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is dispalyed");
			} else {
				System.out.println("Device is not dispalyed");
			}

			ticketInformation.add(10, device.getText());

			ticketInformation.add(11, assignNameValue);

//Open post
			WebElement openPostIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'open_in_new')])[1]"));
			WebElement openPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Post')])[1]"));

			if (openPostIcon.isDisplayed() && openPostButton.isDisplayed()) {
				System.out.println("Open post button is displayed and enabled");
			} else {
				System.out.println("Open post button is not displayed and enabled");
			}

//direct close
			WebElement directCloseIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'cancel')])[1]"));
			WebElement directCloseButton = driver.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]"));

			if (directCloseIcon.isDisplayed() && directCloseButton.isDisplayed()) {
				System.out.println("Direct close button is displayed and enabled");
			} else {
				System.out.println("Direct close button is not displayed and enabled");
			}

//send email
			WebElement sendEmailIcon = driver.findElement(By.xpath("//mat-icon[contains(text(),'mail_outline')]"));
			WebElement sendEmailButton = driver.findElement(By.xpath("//span[contains(text(),'Send Email')]"));

			if (sendEmailIcon.isDisplayed() && sendEmailButton.isDisplayed()) {
				System.out.println("Send email button is displayed and enabled");
			} else {
				System.out.println("Send email button is not displayed and enabled");
			}

//open details
			WebElement openDetailsIcon = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])[2]"));
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));

			if (openDetailsIcon.isDisplayed() && openDetailsButton.isDisplayed()) {
				System.out.println("Open details button is displayed and enabled");
			} else {
				System.out.println("Open details button is not displayed and enabled");
			}

//reply post
			WebElement replyPostIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'reply ')])[1]"));
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply Post')])[1]"));

			if (replyPostIcon.isDisplayed() && replyPostButton.isDisplayed()) {
				System.out.println("Reply post button is displayed and enabled");
			} else {
				System.out.println("Reply post button is not displayed and enabled");
			}

//more
			WebElement moreIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])[1]"));
			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));

			if (moreIcon.isDisplayed() && moreButton.isDisplayed()) {
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

	public static void replyPostButton(WebDriver driver, String channel) throws Exception {
		try {
//Click reply post
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply Post')])[1]"));
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

//reply type

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

			 replyWorkFlow(driver, replyAwaitingButtonValue, channel);

			 replyWorkFlow(driver, replyCloseButtonValue, channel);

			 replyWorkFlow(driver, replyOnHoldButtonValue, channel);

			 replyWorkFlow(driver, replyEscalateButtonValue, channel);

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

//Escalate

			if (replyType.trim().equalsIgnoreCase("Reply & Escalate")) {
				WebElement nextBtnReplyEscalate = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", nextBtnReplyEscalate);

				Thread.sleep(2000);
				WebElement escalateTo = driver.findElement(By.xpath("//mat-label[contains(text(),'Escalate To')]"));
				js.executeScript("arguments[0].click()", escalateTo);
				WebElement customerName = driver
						.findElement(By.xpath("//span[@class='mat-option-text' and contains(.,'kalyan csd')]"));
				js.executeScript("arguments[0].click()", customerName);
				Thread.sleep(1000);
				WebElement escalateNote = driver
						.findElement(By.xpath("//textarea[@formcontrolname='replyEscalateNote']"));
				escalateNote.sendKeys("please check");
				Thread.sleep(2000);
			}

			WebElement replySubmit = driver.findElement(By.xpath("//button[@type='submit']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", replySubmit);

			Thread.sleep(4000);

			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement closeSearch = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[1]")));
			js.executeScript("arguments[0].click()", closeSearch);
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			if (replyType.trim().equalsIgnoreCase("Reply & Close")
					|| replyType.trim().equalsIgnoreCase("Reply & Awaiting response from Customer")) {
				WebElement moreButton = driver.findElement(By.xpath("//a[contains(text(),'More')]"));
				js.executeScript("arguments[0].click()", moreButton);

				if (replyType.trim().equalsIgnoreCase("Reply & Close")) {
					WebElement closedTickets = driver
							.findElement(By.xpath("//button[contains(text(),' Closed Tickets ')]"));
					js.executeScript("arguments[0].click()", closedTickets);
					Thread.sleep(2000);
					checkReplyTypeProcessStatus(driver, replyType, ticketIDValue, channel);
					ticketProcessToOpen(driver, replyType, ticketIDValue);

				} else if (replyType.trim().equalsIgnoreCase("Reply & Awaiting response from Customer")) {
					WebElement awaitingCustomerTickets = driver
							.findElement(By.xpath("//button[contains(text(),' Awaiting From Customer ')]"));
					js.executeScript("arguments[0].click()", awaitingCustomerTickets);
					Thread.sleep(2000);
					checkReplyTypeProcessStatus(driver, replyType, ticketIDValue, channel);
					ticketProcessToOpen(driver, replyType, ticketIDValue);

				}
			}

			else if (replyType.trim().equalsIgnoreCase("Reply & On Hold")) {
				WebElement onHoldTickets = driver.findElement(By.xpath("//a[contains(text(),'On Hold')]"));
				js.executeScript("arguments[0].click()", onHoldTickets);
				Thread.sleep(2000);
				checkReplyTypeProcessStatus(driver, replyType, ticketIDValue, channel);
				ticketProcessToOpen(driver, replyType, ticketIDValue);

			} else if (replyType.trim().equalsIgnoreCase("Reply & Escalate")) {
				WebElement awaitingTickets = driver.findElement(By.xpath("(//a[contains(text(),'Awaiting')])[1]"));
				js.executeScript("arguments[0].click()", awaitingTickets);

				Thread.sleep(2000);
				System.out.println("Tickets goes to awaiting tab");
				checkReplyTypeProcessStatus(driver, replyType, ticketIDValue, channel);

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
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

			if (replyType.trim().equalsIgnoreCase("Reply & Close")) {

				if (ticketStatus.getText().trim().equalsIgnoreCase("Closed")) {
					System.out.println("Ticket Status is Closed");
				} else {
					System.out.println("Ticket Status is not Closed");
				}
			} else if (replyType.trim().equalsIgnoreCase("Reply & Awaiting response from Customer")) {

				if (ticketStatus.getText().trim().equalsIgnoreCase("Awaiting Response From Customer")) {
					System.out.println("Ticket Status is Awaiting Response From Customer");
				} else {
					System.out.println("Ticket Status is not Awaiting Response From Customer");
				}
				
                ticketInformation.add(12, ticketStatus.getText());
				
				WebElement dateTime = driver.findElement(By.xpath("//span[@class='post__head--label text-nowrap']"));
				Actions actions = new Actions(driver);
				Action action = actions.moveToElement(dateTime).click().build();
				action.perform();
				Thread.sleep(4000);
				WebElement awaitingTime = driver.findElement(By.xpath(
						"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));
				ticketInformation.add(13, awaitingTime.getText());
				System.out.println("Modified On: " + awaitingTime.getText());
			} else if (replyType.trim().equalsIgnoreCase("Reply & On Hold")) {

				if (ticketStatus.getText().trim().equalsIgnoreCase("Kept On Hold")) {
					System.out.println("Ticket Status is On Hold");
				} else {
					System.out.println("Ticket Status is not On Hold");
				}
				
				ticketInformation.add(14, ticketStatus.getText());
				WebElement dateTime = driver.findElement(By.xpath("//span[@class='post__head--label text-nowrap']"));
				Actions actions = new Actions(driver);
				Action action = actions.moveToElement(dateTime).click().build();
				action.perform();
				Thread.sleep(4000);

				WebElement onholdTime = driver.findElement(By.xpath(
						"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));
				ticketInformation.add(15, onholdTime.getText());
				System.out.println("Modified On: " + onholdTime.getText());

			} else if (replyType.trim().equalsIgnoreCase("Reply & Escalate")) {
				if (ticketStatus.getText().trim().contains("Escalated to")) {
					System.out.println("Ticket Status is Escalated");
				} else {
					System.out.println("Ticket Status is not Escalated");
				}

// Close search

				WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
				js.executeScript("arguments[0].click()", arrowBack);
				Thread.sleep(2000);

// open tickets

				WebElement openTickets = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Open')]")));
				js.executeScript("arguments[0].click()", openTickets);
				Thread.sleep(2000);

// csdprocess

				csdTicketProcess(driver, ticketIDValue, channel);

// pending Tickets

				WebElement pendingTickets = driver.findElement(By.xpath("//a[contains(text(),'Pending')]"));
				js.executeScript("arguments[0].click()", pendingTickets);

// search with ticket

				WebElement searchBtn = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
				js.executeScript("arguments[0].click()", searchBtn);

				Thread.sleep(2000);
				WebElement inputbox1 = driver.findElement(By.id("post-search-input"));
				inputbox1.sendKeys(ticketIDValue);
				js.executeScript("arguments[0].click()", search);
				Thread.sleep(5000);
				
//ticketStatus
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


				
				

//open details

				WebElement openDetailsButton = driver.findElement(By.xpath("//span[contains(text(),'Open Details')]"));
				js.executeScript("arguments[0].click()", openDetailsButton);
				Thread.sleep(6000);

//Status change
				WebElement ticketStatusOpen = driver.findElement(
						By.xpath("(//span[contains(@class,'mat-select-value-text') and contains(.,'Open')])"));
				ticketStatusOpen.click();
				Thread.sleep(1000);
				WebElement closedTicketStatus = driver
						.findElement(By.xpath("//span[@class='mat-option-text' and contains(.,'Close')]"));
				closedTicketStatus.click();
				Thread.sleep(3000);
				System.out.println("Ticket Status changed to close");

//Close search
				WebElement newTicketFilter = driver
						.findElement(By.xpath("//span[contains(text(),'New Ticket Filter')]"));
				newTicketFilter.click();
				Thread.sleep(2000);
				WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
				js.executeScript("arguments[0].click()", arrowBack1);
				Thread.sleep(2000);

//ticket close 

				verifyClosedTicket(driver, ticketIDValue);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//csdticketprocess

	@SuppressWarnings("deprecation")
	public static void csdTicketProcess(WebDriver driver, String ticketIDValue, String channel) throws Exception {
		try {

// csdlogin
			String mainWindow = driver.getWindowHandle();
			System.out.println("Main Window: " + mainWindow);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://locobuzzng-uat-aws.locobuzz.com/login");

			String childWindow = driver.getWindowHandle();
			System.out.println("Child Window: " + childWindow);

			CommonFunctions.login(driver, "Customer");

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

			

// youtube logo

			WebElement imageIcon = driver
					.findElement(By.xpath("//img[@src='/assets/images/channelicons/Youtube.svg']"));
			if (imageIcon.isDisplayed()) {
				System.out.println("Youtube Image displayed successfully");
			} else {
				System.out.println("Youtube Image not displayed");
			}

			

// imagename

			WebElement ticketName = driver.findElement(By.xpath("//span[contains(text(),'Comments')]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

// username 

			WebElement username = driver.findElement(By.xpath("//span[contains(text(),'Comments')]//following::a[1]"));
			if (username.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

			
//assign
			WebElement assignName = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'escalator_warning')]//following::span[1]"));
			if (assignName.isDisplayed()) {
				System.out.println("assign name is dispalyed");
			} else {
				System.out.println("assign name is not displayed");
			}

			String assignNameValue = assignName.getText();
			ticketInformation.add(16, assignNameValue);

// brandname

			WebElement brandname = driver.findElement(By.xpath("//div[@class='post__pill nowrap']"));
			if (brandname.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			
//time

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

			

//ticketStatus

			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[5]"));
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

			if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
				System.out.println("TicketStatus is displayed");

			} else {
				System.out.println("TicketStatus is not displayed");
			}

			ticketInformation.add(17, ticketStatus.getText());

//priority			
			WebElement priorityIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[4]"));

			if (priority.isDisplayed() && priorityIcon.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			
// mention category

			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate')])[1]"));
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--value'])[2]"));

			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is dispalyed");
			} else {
				System.out.println("Device is not dispalyed");
			}

			

			ticketInformation.add(18, escalatedTimeValue);

//approving the ticket

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

//logout			
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();

			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@SuppressWarnings("deprecation")
	public static void ticketProcessToOpen(WebDriver driver, String replyType, String ticketIDValue) throws Exception {
		try {

//open details
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement openDetailsButton = driver.findElement(By.xpath("//span[contains(text(),'Open Details')]"));
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(6000);

//Status Change

			if (replyType.equalsIgnoreCase("Reply & Close")) {
				WebElement ticketStatusClosed = driver.findElement(
						By.xpath("(//span[contains(@class,'mat-select-value-text') and contains(.,'Close')])[2]"));
				js.executeScript("arguments[0].click()", ticketStatusClosed);
			} else if (replyType.equalsIgnoreCase("Reply & On Hold")) {
				WebElement ticketStatusOnHold = driver.findElement(
						By.xpath("(//span[contains(@class,'mat-select-value') and contains(.,'On Hold')])[2]"));
				js.executeScript("arguments[0].click()", ticketStatusOnHold);
			} else if (replyType.equalsIgnoreCase("Reply & Awaiting response from Customer")) {
				WebElement ticketStatusAwaitFromCustomer = driver.findElement(By.xpath(
						"(//span[contains(@class,'mat-select-value') and contains(.,'Awaiting Response From Customer')])[1]"));
				js.executeScript("arguments[0].click()", ticketStatusAwaitFromCustomer);
			}

			Thread.sleep(1000);
			WebElement openTicketStatus = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and contains(.,'Open')]"));
			js.executeScript("arguments[0].click()", openTicketStatus);
			Thread.sleep(6000);
			System.out.println("Ticket Status changed to open");

//Close search
			WebElement newTicketFilter = driver
					.findElement(By.xpath("(//span[contains(text(),'New Ticket Filter')])[1]"));
			js.executeScript("arguments[0].click()", newTicketFilter);
			Thread.sleep(2000);
			WebElement arrowBack = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[1]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(2000);

//open tickets
			driver.navigate().refresh();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement openTickets = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Open')]")));
			js.executeScript("arguments[0].click()", openTickets);
			Thread.sleep(6000);

//Open tickets search

			WebElement searchOpen = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
			js.executeScript("arguments[0].click()", searchOpen);
			WebElement inputboxOpen = driver.findElement(By.id("post-search-input"));
			inputboxOpen.sendKeys(ticketIDValue);
			js.executeScript("arguments[0].click()", searchOpen);
			Thread.sleep(5000);

//verify Ticket status 
			WebElement openticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));
			if (openticketStatus.getText().trim().equalsIgnoreCase("open")) {
				System.out.println("Ticket status is open");
			} else {
				System.out.println("Ticket status is not open");
			}

			System.out.println(replyType + " " + "process completed");

//Click reply post

			if (!replyType.trim().equalsIgnoreCase("Reply & Escalate")) {
				WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply Post')])[1]"));
				js.executeScript("arguments[0].click()", replyPostButton);
				WebElement replyTypeSelector = driver.findElement(
						By.xpath("//span[contains(@class,'ng-star-inserted') and contains(text(),'Reply &')]"));
				js.executeScript("arguments[0].click()", replyTypeSelector);
			}

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
					System.out.println("Reply & Escalate process completed");
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

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void timeInformation(WebDriver driver) throws Exception {
		try {
			WebElement dateTime = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]//following::span[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

//Created Time
			WebElement createdOnTime = driver.findElement(By.xpath(
					"//span[@class='custom__tooltip--label' and contains(text(),'Created on:')]//following::span[1]"));
			ticketInformation.add(4, createdOnTime.getText());
			System.out.println("Created Time: " + createdOnTime.getText());

//Modified Time
			WebElement modifiedOnTime = driver.findElement(By.xpath(
					"//span[@class='custom__tooltip--label' and contains(text(),'Modified on:')]//following::span[1]"));
			ticketInformation.add(5, modifiedOnTime.getText());
			System.out.println("Created Time: " + modifiedOnTime.getText());

//Mentioned Time
			WebElement mentionedOnTime = driver.findElement(By.xpath(
					"//span[@class='custom__tooltip--label' and contains(text(),'Mentioned on:')]//following::span[1]"));
			ticketInformation.add(6, mentionedOnTime.getText());
			System.out.println("Created Time: " + mentionedOnTime.getText());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
