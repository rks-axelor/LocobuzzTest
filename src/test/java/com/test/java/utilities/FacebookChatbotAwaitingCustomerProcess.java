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

public class FacebookChatbotAwaitingCustomerProcess {

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

// agentTicketprocess
	@SuppressWarnings("deprecation")
	public static void agentTicketProcess(WebDriver driver, String ticketIDValue, String channel) throws Exception {
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
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);

			CommonFunctions.ticketsSearch(driver, channel);

//selecting brand
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),' All ')])[2]"));
			js.executeScript("arguments[0].click()", brand);
			WebElement brandName = driver.findElement(By.xpath("//input[@data-placeholder='Search brand']"));
			brandName.sendKeys("Kalyan");
			WebElement selectBrand = driver.findElement(By.xpath("(//div[contains(text(),' kalyan ')])[1]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);

			ticketTabVerification(driver, channel);

//chatbot 
			WebElement chatbot = driver.findElement(By.xpath("//img[@src='/assets/images/common/chat-bubble.svg']"));
			js.executeScript("arguments[0].click()", chatbot);
			Thread.sleep(5000);
			System.out.println("Chatbot page is open");

//crop din 
			WebElement cropDin = driver.findElement(By.xpath("//mat-icon[contains(text(),'crop_din')]"));
			js.executeScript("arguments[0].click()", cropDin);
			Thread.sleep(2000);

			System.out.println("Crop din is expand");

//DateTime			
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);

//white space
			WebElement whiteSpace = driver
					.findElement(By.xpath("//input[@type='text' and contains(@class,'p-0 bg__white')]"));
			whiteSpace.sendKeys("Workflow processed" + " " + strDate);

			WebElement sendButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'send')]"));
			js.executeScript("arguments[0].click()", sendButton);

//close button
			WebElement closeButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[5]"));
			js.executeScript("arguments[0].click()", closeButton);

			WebElement backArrow = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", backArrow);

//awaitingCustomerTickets
			WebElement moreButton = driver.findElement(By.xpath("//a[contains(text(),'More')]"));
			js.executeScript("arguments[0].click()", moreButton);

			WebElement awaitingCustomerTickets = driver
					.findElement(By.xpath("//button[contains(text(),' Awaiting From Customer ')]"));
			js.executeScript("arguments[0].click()", awaitingCustomerTickets);
			checkReplyTypeProcessStatus(driver, ticketIDValue, channel);

// logout
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

			ticketInformation.add(0, "Chatbot Facebook Ticket");

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
					.findElement(By.xpath("(//mat-icon[contains(text(),'how_to_reg')]//following::span)[1]"));
			if (assignName.isDisplayed()) {
				System.out.println("assign name is displayed");
			} else {
				System.out.println("assign name is not displayed");
			}

			String assignNameValue = assignName.getText();

// brandname

			WebElement brandname = driver.findElement(By.xpath("(//div[@class='post__pill nowrap'])[1]"));
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

			WebElement directCloseIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'cancel')])"));
			WebElement directCloseButton = driver.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]"));

			if (directCloseButton.isEnabled() && directCloseIcon.isDisplayed()) {
				System.out.println("Direct close button is displayed and enabled");
			} else {
				System.out.println("Direct close button is not displayed and enabled");
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

//check ticket status			
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[3]"));

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

			ticketInformation.add(14, "NA");
			ticketInformation.add(15, "NA");

//chatbot 
			WebElement chatbot = driver.findElement(By.xpath("//img[@src='/assets/images/common/chat-bubble.svg']"));
			js.executeScript("arguments[0].click()", chatbot);
			Thread.sleep(2000);
//closed ticket
			WebElement closedTicket = driver.findElement(By.xpath("(//span[contains(text(),' Close Ticket')])"));
			js.executeScript("arguments[0].click()", closedTicket);

//close button
			WebElement closeButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[5]"));
			js.executeScript("arguments[0].click()", closeButton1);

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
