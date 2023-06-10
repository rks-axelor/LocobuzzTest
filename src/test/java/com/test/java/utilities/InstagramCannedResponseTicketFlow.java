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

public class InstagramCannedResponseTicketFlow {

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

			WebElement assignUser = driver.findElement(By.xpath("(//span[contains(text(),'Kalyan live chinni')])[2]"));
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

//ticket information
	public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, "Instagram Ticket Canned Response");

// instagram logo
			WebElement imageIcon = driver
					.findElement(By.xpath("(//img[@src='/assets/images/channel-logos/instagram.svg'])[1]"));
			if (imageIcon.isDisplayed()) {
				System.out.println("Instagram Image displayed successfully");
			} else {
				System.out.println("Instagram Image not displayed");
			}

			ticketInformation.add(1, "Instagram");

// imagename
			WebElement ticketName = driver
					.findElement(By.xpath("//span[contains(text(),'Found')]//following::span[1]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

// username
			WebElement userName = driver.findElement(By.xpath("//span[contains(text(),'Found')]//following::a[1]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

			ticketInformation.add(2, userName.getText());

// assign
			WebElement assignName = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'how_to_reg')]//following::span)[3]"));
			if (assignName.isDisplayed()) {
				System.out.println("assign name is displayed");
			} else {
				System.out.println("assign name is not displayed");
			}

			String assignNameValue = assignName.getText();

// brandname
			WebElement brandName = driver.findElement(By.xpath("(//div[@class='post__pill nowrap'])[2]"));
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
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--value'])[2]"));
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
			ticketInformation.add(16, "NA");
			ticketInformation.add(17, "NA");
			ticketInformation.add(18, "NA");
			ticketInformation.add(19, "NA");
			ticketInformation.add(20, "NA");
			
//open post
			WebElement openPostIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'open_in_new')])"));
			WebElement openPostButton=driver.findElement(By.xpath("(//span[contains(text(),'Open Post')])"));
			if(openPostIcon.isDisplayed() && openPostButton.isDisplayed()) {
				System.out.println("Open Post button is displayed");
			}else {
				System.out.println("Open Post button is not displayed");
			}

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
					.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])[1]"));
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

			replyWorkFlow(driver, replyCloseButtonValue, channel);

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@SuppressWarnings("deprecation")
	public static void replyWorkFlow(WebDriver driver, String replyType, String channel) throws Exception {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement replyTypeSelect = driver.findElement(
					By.xpath("//span[@class = 'mat-option-text' and contains(text(),'" + replyType + "')]"));
			replyTypeSelect.click();
			Thread.sleep(2000);

//canned response process
			WebElement cannedResponseButton = driver.findElement(By.xpath("//a[contains(text(),'Canned Response')]"));
			js.executeScript("arguments[0].click()", cannedResponseButton);
			Thread.sleep(3000);

			WebElement selectArrow = driver.findElement(By.xpath(
					"((//h3[@class='modal__title'])[2]//following::div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", selectArrow);
			Thread.sleep(2000);

			WebElement selectResponseCategory = driver
					.findElement(By.xpath("(//span[contains(text(),'Response SSRE')])[2]"));
			js.executeScript("arguments[0].click()", selectResponseCategory);
			Thread.sleep(2000);

			WebElement arrow = driver.findElement(By.xpath(
					"((//h3[@class='modal__title'])[2]//following::div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(1000);

			WebElement selectResponseName = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]"));
			js.executeScript("arguments[0].click()", selectResponseName);
			Thread.sleep(2000);

			WebElement selectButton = driver.findElement(By.xpath("//span[contains(text(),' Select ')]"));
			js.executeScript("arguments[0].click()", selectButton);
			Thread.sleep(2000);

			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			js.executeScript("arguments[0].click()", submit);
			Thread.sleep(3000);

			WebDriverWait wait1 = new WebDriverWait(driver, 10);
			WebElement closeSearch = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//mat-icon[contains(text(),'arrow_back')]")));
			js.executeScript("arguments[0].click()", closeSearch);
			Thread.sleep(2000);

			if (replyType.trim().equalsIgnoreCase("Reply & Close")
					|| replyType.trim().equalsIgnoreCase("Reply & Awaiting response from Customer")) {
				WebElement moreButton = driver.findElement(By.xpath("//a[contains(text(),'More')]"));
				js.executeScript("arguments[0].click()", moreButton);

				if (replyType.trim().equalsIgnoreCase("Reply & Close")) {
					WebElement closedTickets = driver
							.findElement(By.xpath("//button[contains(text(),' Closed Tickets ')]"));
					js.executeScript("arguments[0].click()", closedTickets);
					Thread.sleep(2000);

					verifyClosedTicket(driver, ticketIDValue);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@SuppressWarnings("deprecation")
	public static void verifyClosedTicket(WebDriver driver, String ticketIDValue) throws Exception {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
// search for ticket
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
			
//open post
			WebElement openPost=driver.findElement(By.xpath("//span[contains(text(),'Open Post')]"));
			js.executeScript("arguments[0].click()", openPost);
			Thread.sleep(3000);
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			Thread.sleep(5000);
			driver.switchTo().window(newTb.get(0));

		} catch (Exception e) {
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
