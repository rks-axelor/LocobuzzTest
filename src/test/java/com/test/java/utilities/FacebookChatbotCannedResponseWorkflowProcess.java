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

public class FacebookChatbotCannedResponseWorkflowProcess {

	public static String ticketIDValue;
	public static List<String> ticketInformation = new ArrayList<String>();

	public static void assignProcess(WebDriver driver, String channel) throws Exception {
		try {

//tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);

			CommonFunctions.ticketsSearch(driver, channel);

//Assigning  to agent
			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(2000);
			WebElement assignTo = driver.findElement(By.xpath("(//span[contains(text(),'Assign to')])"));
			js.executeScript("arguments[0].click()", assignTo);
			Thread.sleep(2000);
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
			
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@SuppressWarnings("deprecation")
	public static void agentChatbotTicketProcess(WebDriver driver, String channel) throws Exception {
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
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement ticketsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]")));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);
			Thread.sleep(2000);

// opentab
			WebElement openTickets = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Open')]")));
			js.executeScript("arguments[0].click()", openTickets);
			Thread.sleep(5000);
			WebElement openTab = driver.findElement(By.xpath("//a[contains(text(),'Open')]"));
			js.executeScript("arguments[0].click()", openTab);
			Thread.sleep(3000);

			CommonFunctions.ticketsSearch(driver, channel);

			ticketTabVerification(driver, channel);


// chatbot
			WebElement chatbot = driver.findElement(By.xpath("//img[@src='/assets/images/common/chat-bubble.svg']"));
			js.executeScript("arguments[0].click()", chatbot);
			Thread.sleep(5000);
			System.out.println("Chatbot page is open");

// crop din
			WebElement cropDin = driver.findElement(By.xpath("//mat-icon[contains(text(),'crop_din')]"));
			js.executeScript("arguments[0].click()", cropDin);
			Thread.sleep(2000);
			System.out.println("Crop din is expand");

// Facebook messenger logo
			WebElement facebookMessengerLogo = driver
					.findElement(By.xpath("//img[@src='/assets/images/channel-logos/messanger.svg']"));
			if (facebookMessengerLogo.isDisplayed()) {
				System.out.println("Facebook Messenger logo is displayed");
			} else {
				System.out.println("Facebook Messenger logo is not displayed");
			}
			js.executeScript("arguments[0].click()", facebookMessengerLogo);
			Thread.sleep(2000);

// username
			WebElement username = driver.findElement(By.xpath("//span[contains(text(),'Kalyan Peddireddy')]"));
			js.executeScript("arguments[0].click()", username);
			Thread.sleep(4000);

//canned responses
			WebElement cannedResponse = driver.findElement(By.xpath("//span[contains(text(),' Canned Responses')]"));
			js.executeScript("arguments[0].click()", cannedResponse);
			Thread.sleep(4000);

			WebElement selectArrow = driver.findElement(By.xpath(
					"((//h3[@class='modal__title'])[2]//following::div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", selectArrow);
			Thread.sleep(2000);

			WebElement selectResponseCategory = driver.findElement(By.xpath("(//span[contains(text(),'Test')])[2]"));
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

			WebElement sendButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'send')]"));
			js.executeScript("arguments[0].click()", sendButton);
			Thread.sleep(3000);

//close button
			WebElement closeButton1 = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'crop_din')])//following::a[1]"));
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(2000);

			WebElement moreButton = driver.findElement(By.xpath("//a[contains(text(),'More')]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(2000);
			WebElement awaitingCustomerTickets = driver
					.findElement(By.xpath("//button[contains(text(),' Awaiting From Customer ')]"));
			js.executeScript("arguments[0].click()", awaitingCustomerTickets);
			Thread.sleep(5000);
			checkReplyTypeProcessStatus(driver, ticketIDValue, channel);
			
//logout			
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//ticket information
	public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, "Facebook Ticket Chatbot");

// facebook logo
			WebElement imageIcon = driver
					.findElement(By.xpath("(//img[@src='/assets/images/channel-logos/facebook.svg'])[1]"));
			if (imageIcon.isDisplayed()) {
				System.out.println("Facebook Image displayed successfully");
			} else {
				System.out.println("Facebook Image not displayed");
			}

			ticketInformation.add(1, "Facebook");

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
				System.out.println("assign name is displayed");
			} else {
				System.out.println("assign name is not displayed");
			}

			String assignNameValue = assignName.getText();

// brandname

			WebElement brandname = driver.findElement(By.xpath("(//div[@class='post__pill nowrap'])[2]"));
			if (brandname.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			ticketInformation.add(3, brandname.getText());

// time

			WebElement timeScheduleIcon = driver.findElement(By.xpath("(//mat-icon[contains(.,'schedule')])[1]"));
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
			WebElement ticketID = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[1]"));
			ticketIDValue = ticketID.getText();
			System.out.println("Ticket ID: " + ticketIDValue);
			if (ticketIcon.isDisplayed() && ticketID.getText() != "") {
				System.out.println("Ticket ID & Icon are displayed");
			} else {
				System.out.println("Ticket ID & Icon are not displayed");
			}

			ticketInformation.add(7, ticketID.getText());

// ticketStatus

			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[1]"));
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

			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate')])[1]"));
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--value'])[1]"));

			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is displayed");
			} else {
				System.out.println("Device is not displayed");
			}

			ticketInformation.add(10, device.getText());

			ticketInformation.add(11, assignNameValue);

// direct close

			WebElement directCloseIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'cancel')])[1]"));
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
					.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])[1]"));
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));

			if (openDetailsButton.isEnabled() && openDetailsIcon.isDisplayed()) {
				System.out.println("Open details button is displayed and enabled");
			} else {
				System.out.println("Open details button is not displayed and enabled");
			}

// Reply post

			WebElement replyPostIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'reply ')])[1]"));
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply Post')])[1]"));

			if (replyPostButton.isEnabled() && replyPostIcon.isDisplayed()) {
				System.out.println("Reply post button is displayed and enabled");
			} else {
				System.out.println("Reply post button is not displayed and enabled");
			}

// More

			WebElement moreIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])[1]"));
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

// ticket Status
			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[1]"));
			WebElement ticketStatus1 = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));
			if (ticketStatusIcon.isDisplayed() && ticketStatus1.getText() != "") {
				System.out.println("TicketStatus is displayed");

			} else {
				System.out.println("TicketStatus is not displayed");
			}

			ticketInformation.add(12, ticketStatus1.getText());

			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

			WebElement approvedTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

			ticketInformation.add(13, approvedTime.getText());
			System.out.println("Modified On: " + approvedTime.getText());

			ticketInformation.add(14, "NA");
			ticketInformation.add(15, "NA");
			ticketInformation.add(16, "NA");
			ticketInformation.add(17, "NA");
			ticketInformation.add(18, "NA");
			ticketInformation.add(19, "NA");
			ticketInformation.add(20, "NA");

// chatbot
			WebElement chatbot = driver.findElement(By.xpath("//img[@src='/assets/images/common/chat-bubble.svg']"));
			js.executeScript("arguments[0].click()", chatbot);
			Thread.sleep(5000);
			System.out.println("Chatbot page is open");
			
//Facebook messenger logo
			WebElement facebookMessengerLogo = driver
					.findElement(By.xpath("//img[@src='/assets/images/channel-logos/messanger.svg']"));
			js.executeScript("arguments[0].click()", facebookMessengerLogo);
			Thread.sleep(2000);

// username
			WebElement username = driver.findElement(By.xpath("//span[contains(text(),'Kalyan Peddireddy')]"));
			js.executeScript("arguments[0].click()", username);
			Thread.sleep(4000);

//closed ticket
			WebElement closedTicket = driver.findElement(By.xpath("(//span[contains(text(),' Close Ticket')])"));
			js.executeScript("arguments[0].click()", closedTicket);
			Thread.sleep(2000);

			WebElement confrimclose = driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", confrimclose);
			Thread.sleep(3000);

//close button
			WebElement closeButton1 = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'crop_din')])//following::a[1]"));
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(2000);

			verifyClosedTicket(driver, ticketIDValue);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@SuppressWarnings("deprecation")
	public static void verifyClosedTicket(WebDriver driver, String ticketIDValue) throws Exception {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement awaitingCustomerTickets = driver
					.findElement(By.xpath("//a[contains(text(),'Awaiting From Customer ')]"));
			js.executeScript("arguments[0].click()", awaitingCustomerTickets);

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
			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[1]"));
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

			if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
				System.out.println("TicketStatus is displayed");
				if (ticketStatus.getText().trim().equalsIgnoreCase("closed")) {
					System.out.println("Ticket  is closed");
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
