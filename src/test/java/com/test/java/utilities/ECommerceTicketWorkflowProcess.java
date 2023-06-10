package com.test.java.utilities;

import java.util.ArrayList;
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

public class ECommerceTicketWorkflowProcess {

	public static String ticketIDValue;
	public static List<String> ticketInformation = new ArrayList<String>();

	public static void makeActionableProcess(WebDriver driver, String channel) throws Exception {
		try {

//tickets tab
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Thread.sleep(3000);
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);

			ticketsSearch(driver, channel);
			filter(driver, channel);

//Assigning

			WebElement openDetails = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
			js.executeScript("arguments[0].click()", openDetails);
			Thread.sleep(2000);

			WebElement assigning = driver.findElement(By.xpath("(//mat-label[contains(text(),'Not Assigned')])[1]"));
			js.executeScript("arguments[0].click()", assigning);
			Thread.sleep(2000);

			WebElement assignPerson = driver.findElement(By.xpath(
					"//mat-icon[contains(text(),'person')]//following::span[contains(text(),'Kalyan live chinni')]"));
			js.executeScript("arguments[0].click()", assignPerson);
			Thread.sleep(2000);

			WebElement newTicketFilter = driver
					.findElement(By.xpath("(//span[contains(text(),'New Ticket Filter')])[1]"));
			js.executeScript("arguments[0].click()", newTicketFilter);

			WebElement search = driver.findElement(By.xpath("//mat-icon[contains(text(),' search')]"));
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//ticket information
	
	public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, "E-Commerce Ticket WorkFlow");

//e-commercelogo
			WebElement imageIcon = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[1]//following::img[@src='/assets/images/channel-logos/ecomerce.svg'])[1]"));
			if (imageIcon.isDisplayed()) {
				System.out.println("E-commerce image is displayed");
			} else {
				System.out.println("E-commerce image is not displayed");
			}
			ticketInformation.add(1, "E-commerce");

//imagename
			WebElement ticketName = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[contains(text(),'Comments')])[1]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket Name is displayed");
			} else {
				System.out.println("Ticket Name is not displayed");
			}

//username
			WebElement userName = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//span[contains(text(),'Comments')]//following::a)[1]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed ");
			} else {
				System.out.println("Username is not displayed ");
			}

			ticketInformation.add(2, userName.getText());

//assign
			WebElement assignName = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[1]//mat-icon[contains(text(),'how_to_reg')]//following::span)[1]"));
			if (assignName.isDisplayed()) {
				System.out.println("Assign name is displayed");
			} else {
				System.out.println("Assign name is displayed");
			}

			String assignNameValue = assignName.getText();

//brandname
			WebElement brandName = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::div[@class='post__pill nowrap'])[1]"));
			if (brandName.isDisplayed()) {
				System.out.println("Brand name is dispalyed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			ticketInformation.add(3, brandName.getText());

//time
			WebElement timeScheduleIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'schedule')])[1]"));
			WebElement dateTime = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[1]//following::span[@class='post__head--label text-nowrap'])[1]"));
			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);
			timeInformation(driver);

//ticketid
			WebElement ticketIcon = driver.findElement(By
					.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'local_activity')])[1]"));
			WebElement ticketId = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[@class='post__foot--label'])[1]"));
			ticketIDValue = ticketId.getText();
			System.out.println("Ticket ID: " + ticketIDValue);
			if (ticketIcon.isDisplayed() && ticketId.getText() != "") {
				System.out.println("Ticket ID & Icon are displayed");
			} else {
				System.out.println("Ticket ID & Icon are not displayed");
			}

			ticketInformation.add(7, ticketId.getText());

//ticketStatus
			WebElement ticketStatusIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'folder')])[1]"));
			WebElement ticketStatus = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[@class='post__foot--label'])[3]"));
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
			WebElement priorityIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[@class='post__foot--label'])[4]"));
			if (priorityIcon.isDisplayed() && priority.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			ticketInformation.add(9, priority.getText());

//mention category
			WebElement symbol = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'alternate_email')])[1]"));
			WebElement device = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[@class='post__foot--value'])[1]"));
			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is dispalyed");
			} else {
				System.out.println("Device is not dispalyed");
			}

			ticketInformation.add(10, device.getText());

			ticketInformation.add(11, assignNameValue);
			ticketInformation.add(12, "NA");
			ticketInformation.add(13, "NA");
			ticketInformation.add(14, "NA");
			ticketInformation.add(15, "NA");

//open post
			WebElement openPostIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'open_in_new')])[1]"));
			WebElement openPostButton = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[contains(text(),'Open Post')])[1]"));

			if (openPostButton.isEnabled() && openPostIcon.isDisplayed()) {
				System.out.println("Open post button is displayed and enabled");
			} else {
				System.out.println("Open post button is not displayed and enabled");
			}

//direct close
			WebElement directCloseIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'cancel')])[1]"));
			WebElement directCloseButton = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[contains(text(),'Direct Close')])[1]"));
			if (directCloseIcon.isDisplayed() && directCloseButton.isDisplayed()) {
				System.out.println("Direct close button is displayed and enabled");
			} else {
				System.out.println("Direct close button is not displayed and enabled");
			}

//send email
			WebElement sendEmailIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'mail_outline')])[1]"));
			WebElement sendEmailButton = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[contains(text(),'Send Email')])[1]"));
			if (sendEmailIcon.isDisplayed() && sendEmailButton.isDisplayed()) {
				System.out.println("Send email button is displayed and enabled");
			} else {
				System.out.println("Send email button is not displayed and enabled");
			}

//open details
			WebElement openDetailsIcon = driver.findElement(By
					.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'remove_red_eye')])[2]"));
			WebElement openDetailsButton = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[contains(text(),'Open Details')])[1]"));
			if (openDetailsIcon.isDisplayed() && openDetailsButton.isDisplayed()) {
				System.out.println("Open details button is displayed and enabled");
			} else {
				System.out.println("Open details button is not displayed and enabled");
			}

//more
			WebElement moreIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'more_horiz')])[1]"));
			WebElement moreButton = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[contains(text(),'More')])[1]"));
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

	public static void openDetailsButton(WebDriver driver, String channel) throws Exception {
		try {
//Click open details
			WebElement openDetailsButton = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[contains(text(),'Open Details')])[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(5000);
			replyWorkflow(driver, channel);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void replyWorkflow(WebDriver driver, String channel) throws Exception {
		try {

			Thread.sleep(6000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//click on moreicon			
			WebElement moreIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'more_vert')])[2]"));
			js.executeScript("arguments[0].click()", moreIcon);
			WebElement escalateButton = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'escalator_warning')])//following::span"));
			js.executeScript("arguments[0].click()", escalateButton);
			Thread.sleep(3000);
			WebElement escalateTo = driver.findElement(By.xpath("(//mat-label[contains(text(),'Escalate To')])"));
			js.executeScript("arguments[0].click()", escalateTo);
			WebElement customerName = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and contains(.,'kalyan csd')]"));
			js.executeScript("arguments[0].click()", customerName);
			Thread.sleep(1000);
			WebElement escalateNote = driver
					.findElement(By.xpath("(//textarea[@formcontrolname='replyEscalateNote'])"));
			escalateNote.sendKeys("Please check");
			Thread.sleep(2000);

			WebElement replySubmit = driver.findElement(By.xpath("//button[@type='submit']"));
			js.executeScript("arguments[0].click()", replySubmit);
			Thread.sleep(2000);

			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'New Ticket Filter')]"));
			newTicketFilter.click();

			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement closeSearch = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[1]")));
			js.executeScript("arguments[0].click()", closeSearch);
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(7000);

//reply and escalate process

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

			JavascriptExecutor js = (JavascriptExecutor) driver;

// search with ticket
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement search = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
			js.executeScript("arguments[0].click()", search);

			Thread.sleep(2000);
			WebElement inputbox = driver.findElement(By.xpath("(//input[@id='post-search-input'])[1]"));
			inputbox.sendKeys(ticketIDValue);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(5000);

// check ticket status
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

			if (ticketStatus.getText().trim().contains("Escalated to")) {
				System.out.println("Ticket Status is Escalated");
			} else {
				System.out.println("Ticket Status is not Escalated");
			}

//Close search

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(2000);

//open tickets

			WebElement openTickets = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Open')]")));
			js.executeScript("arguments[0].click()", openTickets);
			Thread.sleep(2000);

//csdprocess

			csdTicketProcess(driver, ticketIDValue, channel);

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
			
//ticketStatus
			WebElement ticketStatusIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'folder')])[1]"));
			WebElement ticketStatus1 = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[1]//following::span[@class='post__foot--label'])[3]"));
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
			WebElement close = driver.findElement(By.xpath("//div[@class='alert-modal__actions']//following::span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(2000);

//Close search

			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(2000);

//ticket close 

			verifyClosedTicket(driver, ticketIDValue);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

// csdticketprocess

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

			

//e-commercelogo
			WebElement imageIcon = driver
					.findElement(By.xpath("//img[@src='/assets/images/channel-logos/ecomerce.svg']"));
			if (imageIcon.isDisplayed()) {
				System.out.println("E-Commerce image is displayed");
			} else {
				System.out.println("E-Commerce image is not displayed");
			}

			

//imagename
			WebElement ticketName = driver.findElement(By.xpath("//span[contains(text(),'Comments')]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

//username
			WebElement userName = driver.findElement(By.xpath("//span[contains(text(),'Comments')]//following::a[1]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

			

//assign
			WebElement assignName = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'escalator_warning')]//following::span[1]"));
			if (assignName.isDisplayed()) {
				System.out.println("Assign name is dispalyed");
			} else {
				System.out.println("Assign name is not displayed");
			}

			String assignNameValue = assignName.getText();
			ticketInformation.add(16, assignNameValue);

//brandname
			WebElement brandName = driver.findElement(By.xpath("//div[@class='post__pill nowrap']"));
			if (brandName.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			

//time
			WebElement timeScheduleIcon = driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]"));
			WebElement dateTime = driver.findElement(By.xpath("//span[@class='post__head--label text-nowrap']"));
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


//ticketid
			WebElement ticketIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'local_activity')])[4]"));
			WebElement ticketId = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[1]"));
			ticketIDValue = ticketId.getText();
			System.out.println("Ticket ID: " + ticketIDValue);
			if (ticketIcon.isDisplayed() && ticketId.getText() != "") {
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

			
//mention category
			WebElement symbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'alternate_email')]"));
			WebElement device = driver.findElement(By.xpath("//span[@class='post__foot--value']"));
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

//filter

	@SuppressWarnings("deprecation")
	public static void filter(WebDriver driver, String channel) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement filterButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"(//span[@class='mat-button-wrapper']//following::mat-icon[contains(text(),'filter_alt')])[1]")));
			filterButton.click();

			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement brand = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//input[@data-placeholder='Type to search Brand'])")));

			brand.sendKeys("kalyan");
			WebElement brandName = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", brandName);
			WebElement closeBrand = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),'Brand, Date duration')])"));
			js.executeScript("arguments[0].click()", closeBrand);

			Thread.sleep(4000);

			List<WebElement> ticketAndMentionList;
			ticketAndMentionList = driver
					.findElements(By.xpath("(//mat-panel-title[contains(.,'Tickets and Mentions')])"));

			for (WebElement element : ticketAndMentionList) {
				if (element.isDisplayed()) {
					element.click();
					break;
				}
			}

			Thread.sleep(3000);

			List<WebElement> channelSelectorList = driver
					.findElements(By.xpath("//mat-label[contains(.,'Channel')]//preceding::input[1]"));
			for (WebElement element : channelSelectorList) {
				if (element.isDisplayed()) {
					element.click();
					break;
				}
			}
			Thread.sleep(1000);

			WebElement searchButton = driver.findElement(By.xpath("//input[@placeholder='Search channel']"));
			searchButton.sendKeys(channel);

			if (channel.equalsIgnoreCase("e-commerce")) {
				String channel_Modified = "ecomerce";

				WebElement channelName = driver.findElement(By.xpath(
						"//label[@class='mat-checkbox-layout']//img[contains(@src, '" + channel_Modified + "')]"));
				channelName.click();
			}

			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();

			List<WebElement> applyButtonList = driver
					.findElements(By.xpath("//span[@class='mat-button-wrapper' and contains(text(),'Apply')]"));
			for (WebElement element : applyButtonList) {
				if (element.isDisplayed()) {
					js.executeScript("arguments[0].click()", element);
					Thread.sleep(5000);
					js.executeScript("arguments[0].click()", element);
					Thread.sleep(5000);
					break;
				}
			}

			System.out.println("Data Filtered Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

// user will  search for ticket

	@SuppressWarnings("deprecation")
	public static void ticketsSearch(WebDriver driver, String channel) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement search = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])")));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", search);

			Thread.sleep(2000);

			WebElement inputbox = driver.findElement(By.id("post-search-input"));
			inputbox.sendKeys("Anonymous");

			search.click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//time
	public static void timeInformation(WebDriver driver) throws Exception {
		try {

			WebElement dateTime = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[1]//following::span[@class='post__head--label text-nowrap'])[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

//Created Time
			WebElement createdOnTime = driver.findElement(By
					.xpath("((//div[@id='socialBox'])[1]//span[contains(text(),'Created on:')]//following::span)[1]"));
			ticketInformation.add(4, createdOnTime.getText());
			System.out.println("Created Time: " + createdOnTime.getText());

//modified Time
			WebElement modifiedOnTime = driver.findElement(By
					.xpath("((//div[@id='socialBox'])[1]//span[contains(text(),'Modified on:')]//following::span)[1]"));
			ticketInformation.add(5, modifiedOnTime.getText());
			System.out.println("Modified On: " + modifiedOnTime.getText());

//mentioned Time
			WebElement mentionedOnTime = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[1]//span[contains(text(),'Mentioned on:')]//following::span)[1]"));
			ticketInformation.add(6, mentionedOnTime.getText());
			System.out.println("Mentioned On: " + mentionedOnTime.getText());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
