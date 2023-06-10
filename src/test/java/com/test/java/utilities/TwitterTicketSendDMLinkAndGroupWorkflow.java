package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwitterTicketSendDMLinkAndGroupWorkflow {

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

	public static void openDetailsButton(WebDriver driver, String channel) throws Exception {
		try {

//Click open details
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(2000);

			checkReplyType(driver, channel);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void checkReplyType(WebDriver driver, String channel) throws Exception {
		try {

// Reply type
			Thread.sleep(4000);

			WebElement replyButton = driver
					.findElement(By.xpath("(//span[@mattooltip='Reply']//mat-icon[contains(.,'reply')])[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", replyButton);
			WebElement replyTypeSelector = driver.findElement(
					By.xpath("(//span[contains(@class,'ng-star-inserted') and contains(text(),'Reply &')])[2]"));

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

			replyWorkFlow(driver, replyCloseButtonValue, channel);

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void replyWorkFlow(WebDriver driver, String replyType, String channel) throws Exception {
		try {

			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			/*
			 * WebElement replyButton = driver .findElement(By.
			 * xpath("(//span[@mattooltip='Reply Post']//mat-icon[contains(.,'reply')])[1]")
			 * ); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("arguments[0].click()", replyButton);
			 */
			WebElement replyTypeSelector = driver.findElement(
					By.xpath("(//span[contains(@class,'ng-star-inserted') and contains(text(),'Reply &')])[2]"));

			js.executeScript("arguments[0].click()", replyTypeSelector);

			Thread.sleep(3000);
			WebElement replyTypeSelect = driver.findElement(
					By.xpath("//span[@class = 'mat-option-text' and contains(text(),'" + replyType + "')]"));
			System.out.println("Text: " + replyTypeSelect.getText());

			js.executeScript("arguments[0].click()", replyTypeSelect);

			Thread.sleep(2000);
			
//send dm link
			WebElement sendDmLink=driver.findElement(By.xpath("//span[contains(text(),'Send DM Link')]"));
			js.executeScript("arguments[0].click()", sendDmLink);
			Thread.sleep(3000);
			
//send to groups
			WebElement sendToGroup=driver.findElement(By.xpath("//span[contains(text(),'Send to Groups')]"));
			js.executeScript("arguments[0].click()", sendToGroup);
			Thread.sleep(3000);
			
			WebElement nextButton=driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);
			
			WebElement emailGroup=driver.findElement(By.xpath("//input[@placeholder='New Group...']"));
			js.executeScript("arguments[0].click()", emailGroup);
			Thread.sleep(3000);
			
			WebElement selectGroup=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' hfgdct ']"));
			js.executeScript("arguments[0].click()", selectGroup);
			Thread.sleep(3000);
			
			WebElement sendButton=driver.findElement(By.xpath("//span[contains(text(),' Send ')]"));
			js.executeScript("arguments[0].click()", sendButton);
			Thread.sleep(3000);
			
			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'Back To Ticket List')]"));
			js.executeScript("arguments[0].click()", newTicketFilter);
			Thread.sleep(3000);
			
			WebElement closeSearchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", closeSearchButton);
			Thread.sleep(3000);
			
			verifyClosedTicket(driver,ticketIDValue);

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
			
//openPost
			WebElement openPost1 = driver.findElement(By.xpath("(//span[contains(text(),'Open Post')])[1]"));
			js.executeScript("arguments[0].click()", openPost1);
			Thread.sleep(3000);

			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			Thread.sleep(5000);
			driver.switchTo().window(newTb.get(0));
			
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
