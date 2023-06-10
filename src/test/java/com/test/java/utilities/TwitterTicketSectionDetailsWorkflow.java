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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwitterTicketSectionDetailsWorkflow {

	public static String ticketIDValue;
	public static List<String> ticketInformation = new ArrayList<String>();

	public static void GotoTicketTab(WebDriver driver, String channel) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

//social inbox
			WebElement socialInboxLogo = driver.findElement(By.xpath("(//mat-icon[contains(text(),'inbox')])[1]"));
			WebElement socialInboxlabel = driver.findElement(By.xpath("//span[contains(text(),' Social Inbox')]"));
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			if (socialInboxLogo.isDisplayed() && socialInboxlabel.isDisplayed() && pushpin.isDisplayed()) {
				System.out.println("Social Inbox logo and label are displayed");
			} else {
				System.out.println("Social Inbox logo and label are not displayed");
			}

			js.executeScript("arguments[0].click()", socialInboxlabel);
			Thread.sleep(6000);

//tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver.findElement(By.xpath(
					"//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);

			CommonFunctions.ticketsSearch(driver, channel);

//Assigning

			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(2000);

			WebElement assignTo = driver.findElement(By.xpath("(//span[contains(text(),'Assign to')])"));
			js.executeScript("arguments[0].click()", assignTo);
			Thread.sleep(2000);

			WebElement selectUser = driver
					.findElement(By.xpath("//mat-label[contains(text(),'Select User')]//preceding::input[1]"));
			js.executeScript("arguments[0].click()", selectUser);
			Thread.sleep(2000);

			WebElement assignUser = driver.findElement(By.xpath("(//span[contains(text(),'Kalyanlive chinni')])[2]"));
			js.executeScript("arguments[0].click()", assignUser);
			Thread.sleep(2000);
			WebElement assignButton = driver.findElement(By.xpath("(//span[contains(text(),'Assign')])[2]"));
			js.executeScript("arguments[0].click()", assignButton);
			Thread.sleep(2000);
			WebElement search = driver.findElement(By.xpath("//mat-icon[contains(text(),' search')]"));
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

// ticket information
	public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, "Twitter  Section Ticket WorkFlow");

// twitterlogo
			WebElement imageIcon = driver
					.findElement(By.xpath("//img[@src='/assets/images/channel-logos/twitter.svg']"));
			if (imageIcon.isDisplayed()) {
				System.out.println("Twitter Image displayed successfully");
			} else {
				System.out.println("Twitter Image not displayed");
			}
			ticketInformation.add(1, "Twitter");

// imagename

			WebElement ticketName = driver
					.findElement(By.xpath("//span[contains(text(),'Found')]//following::span[1]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

// username 

			WebElement username = driver.findElement(By.xpath("//span[contains(text(),'Found')]//following::a[1]"));
			if (username.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

			ticketInformation.add(2, username.getText());

// assign
			WebElement assignName = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'how_to_reg')]//following::span)[3]"));
			if (assignName.isDisplayed()) {
				System.out.println("Assign name is displayed");
			} else {
				System.out.println("Assign name is not displayed");
			}

			String assignNameValue = assignName.getText();

// brandname

			WebElement brandname = driver
					.findElement(By.xpath("(//div[@class='post__pill bg__grey--lighter nowrap'])[2]"));
			if (brandname.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			ticketInformation.add(3, brandname.getText());

// time

			WebElement timeScheduleIcon = driver.findElement(By.xpath("(//mat-icon[contains(.,'schedule')])[2]"));
			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));

			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);
			timeInformation(driver);

// ticketsid
			WebElement ticketIcon = driver
					.findElement(By.xpath("(//div[@id='socialBox']//mat-icon[contains(text(),'local_activity')])[1]"));
			WebElement ticketID = driver.findElement(By.xpath(
					"(//mat-icon[contains(text(),'local_activity')]//following::span[@class='post__foot--label'])[1]"));
			ticketIDValue = ticketID.getText();
			System.out.println("Ticket ID: " + ticketIDValue);
			if (ticketIcon.isDisplayed() && ticketID.getText() != "") {
				System.out.println("Ticket ID & Icon are displayed");
			} else {
				System.out.println("Ticket ID & Icon are not displayed");
			}

			ticketInformation.add(7, ticketID.getText());

// ticketStatus

			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[5]"));
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

			ticketInformation.add(8, ticketStatus.getText());

// priority
			WebElement priorityIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(By.xpath("(//span[contains(@class,'post__foot--label')])[4]"));

			if (priority.isDisplayed() && priorityIcon.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			ticketInformation.add(9, priority.getText());

// mention category

			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate')])[1]"));
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is dispalyed");
			} else {
				System.out.println("Device is not dispalyed");
			}

			ticketInformation.add(10, device.getText());

			ticketInformation.add(11, assignNameValue);

// open post
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

// direct close

			WebElement directCloseIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]//preceding::mat-icon[1]"));
			WebElement directCloseButton = driver.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]"));

			if (directCloseButton.isEnabled() && directCloseIcon.isDisplayed()) {
				System.out.println("Direct close button is displayed and enabled");
			} else {
				System.out.println("Direct close button is not displayed and enabled");
			}

// sendemail
			WebElement sendEmailIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'mail_outline')])[1]"));
			WebElement sendEmailButton = driver.findElement(By.xpath("(//span[contains(text(),'Send Email')])[1]"));
			if (sendEmailIcon.isDisplayed() && sendEmailButton.isDisplayed()) {
				System.out.println("Send email button is displayed and enabled");
			} else {
				System.out.println("Send email button is not displayed and enabled");
			}

// Open details

			WebElement openDetailsIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]//preceding::mat-icon[1]"));
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));

			if (openDetailsButton.isEnabled() && openDetailsIcon.isDisplayed()) {
				System.out.println("Open details button is displayed and enabled");
			} else {
				System.out.println("Open details button is not displayed and enabled");
			}

// Reply post

			WebElement replyPostIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Reply')])[1]//preceding::mat-icon[1]"));
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply')])[1]"));

			if (replyPostButton.isEnabled() && replyPostIcon.isDisplayed()) {
				System.out.println("Reply post button is displayed and enabled");
			} else {
				System.out.println("Reply post button is not displayed and enabled");
			}

// More

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

	public static void replyPostButton(WebDriver driver, String channel) throws Exception {
		try {

//Click reply post
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply')])[1]"));
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
			Thread.sleep(4000);

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
				ticketProcessToOpen(driver, replyType, ticketIDValue);

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

				
				WebElement dateTime = driver.findElement(By.xpath("//span[@class='post__head--label text-nowrap']"));
				Actions actions = new Actions(driver);
				Action action = actions.moveToElement(dateTime).click().build();
				action.perform();
				Thread.sleep(4000);

				WebElement onholdTime = driver.findElement(By.xpath(
						"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));
				
				System.out.println("Modified On: " + onholdTime.getText());
			}

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
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(6000);

//overview
			WebElement overview = driver.findElement(By.xpath("//div[contains(text(),'Overview')]"));
			js.executeScript("arguments[0].click()", overview);
			Thread.sleep(3000);

//Status Change

			if (replyType.equalsIgnoreCase("Reply & On Hold")) {
				WebElement ticketStatusOnHold = driver.findElement(
						By.xpath("(//span[contains(@class,'mat-select-value') and contains(.,'On Hold')])[2]"));
				js.executeScript("arguments[0].click()", ticketStatusOnHold);
			}
			
			Thread.sleep(1000);
			WebElement openTicketStatus = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and contains(.,'Open')]"));
			js.executeScript("arguments[0].click()", openTicketStatus);
			Thread.sleep(6000);
			System.out.println("Ticket Status changed to open");
			
//Close search
			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'Back To Ticket List')]"));
			js.executeScript("arguments[0].click()", newTicketFilter);
			Thread.sleep(2000);
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(2000);

//open tickets
			//driver.navigate().refresh();
			WebDriverWait wait = new WebDriverWait(driver, 10);
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
			WebElement openticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label ticketstatus__blue colored__locobuzz'])[1]"));
			if (openticketStatus.getText().trim().equalsIgnoreCase("open")) {
				System.out.println("Ticket status is open");
			} else {
				System.out.println("Ticket status is not open");
			}

			System.out.println(replyType + " " + "process completed");



		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	
	public static void opendetails(WebDriver driver) throws Exception {
		try {
			
//open details
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(6000);
			
//expandable feature
			WebElement expandableFeature=driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_double_arrow_right')]"));
			js.executeScript("arguments[0].click()", expandableFeature);
			Thread.sleep(5000);
			
			Actions at = new Actions(driver);
			at.sendKeys(Keys.PAGE_DOWN).build().perform();
			
			js.executeScript("arguments[0].click()", expandableFeature);
			Thread.sleep(5000);
			
//add note
			WebElement addNote=driver.findElement(By.xpath("//span[contains(text(),' Add Note ')]"));
			js.executeScript("arguments[0].click()", addNote);
			Thread.sleep(3000);
			WebElement textarea=driver.findElement(By.xpath("//textarea[contains(@class,'mat-input-element mat-form-field-autofill-control resize')]"));
			textarea.sendKeys("please check");
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
			Actions at1 = new Actions(driver);
			at1.sendKeys(Keys.PAGE_DOWN).build().perform();
			
//sorting
			WebElement sort=driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_vert')])[2]"));
			js.executeScript("arguments[0].click()", sort);
			Thread.sleep(3000);
			WebElement option=driver.findElement(By.xpath("//span[contains(text(),'All Conversations')]"));
			js.executeScript("arguments[0].click()", option);
			Thread.sleep(3000);
			WebElement option1=driver.findElement(By.xpath("//span[contains(text(),'Simple View')]"));
			js.executeScript("arguments[0].click()", option1);
			Thread.sleep(3000);
			WebElement sort1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_vert')])[2]"));
			js.executeScript("arguments[0].click()", sort1);
			Thread.sleep(3000);
			
//subscribe
			WebElement more=driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_vert')])[13]"));
			js.executeScript("arguments[0].click()", more);
			Thread.sleep(3000);
			WebElement subscribe=driver.findElement(By.xpath("//span[contains(text(),' Subscribe')]"));
			js.executeScript("arguments[0].click()", subscribe);
			Thread.sleep(3000);
			WebElement allActivity=driver.findElement(By.xpath("//span[contains(text(),'All Activity')]"));
			js.executeScript("arguments[0].click()", allActivity);
			Thread.sleep(3000);
			WebElement subscribeButton=driver.findElement(By.xpath("//span[contains(text(),' Subscribe ')]"));
			js.executeScript("arguments[0].click()", subscribeButton);
			Thread.sleep(3000);
			
//DateTime			
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);

			WebElement replyTextArea = driver.findElement(By.xpath("//textarea[@placeholder='Write Reply']"));

			replyTextArea.sendKeys("Workflow processed" + " " + strDate);
			WebElement replySubmit = driver.findElement(By.xpath("//button[@type='submit']"));

			js.executeScript("arguments[0].click()", replySubmit);
			
//Close search
			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'Back To Ticket List')]"));
			js.executeScript("arguments[0].click()", newTicketFilter);
			Thread.sleep(2000);
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(2000);
			
//ticket close 

			verifyClosedTicket(driver, ticketIDValue);

			
			
					
					

			
		}
		catch(Exception e) {
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
			js.executeScript("arguments[0].click()", closedTickets);
			//closedTickets.click();
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
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[contains(@class,'post__foot--label')])[3]"));

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
			
            
			
			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);
			
			WebElement modifiedOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

			
			System.out.println("Modified On: " + modifiedOnTime.getText());
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
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
