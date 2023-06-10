package com.test.java.utilities;

import java.util.ArrayList;
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

public class AllMentionECommerceWorkflowProcess {

	public static List<String> ticketInformation = new ArrayList<String>();

	@SuppressWarnings("deprecation")
	public static void allMentionsWorkFlow(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, "AllMentions E-Commerce WorkFlow");

			WebElement allmentions = driver.findElement(By.xpath("(//span[contains(text(),'All Mention')])[1]"));
			allmentions.click();

// useractivity

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement useractivity = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'User Activity ')]")));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", useractivity);

			if (useractivity.isDisplayed()) {
				System.out.println("User activity tab is displayed");
			} else {
				System.out.println("User activity tab not displayed");
			}

			WebElement actionable = driver.findElement(By
					.xpath("//a[contains(text(),'User Activity')]//following::span[contains(text(),'Actionable')][1]"));

			WebElement nonactionable = driver.findElement(By.xpath(
					"//a[contains(text(),'User Activity')]//following::span[contains(text(),'Non Actionable')][1]"));

			if (actionable.isDisplayed() && nonactionable.isDisplayed()) {
				System.out.println("Actionable & Non Actionable Tickets are displayed");
			} else {
				System.out.println("Actionable & Non Actionable Tickets are not displayed");
			}

// brand activity

			WebElement brandActivity = driver.findElement(By.xpath("//a[contains(text(),'Brand Activity')]"));
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].click()", brandActivity);
			Thread.sleep(1000);

			if (brandActivity.isDisplayed()) {
				System.out.println("Brand activity tab is displayed");
			} else {
				System.out.println("Brand activity tab not displayed");
			}

			WebElement brandReply = driver.findElement(By.xpath("//span[contains(text(),'Brand Reply ')]"));

			WebElement brandPost = driver.findElement(By.xpath("//span[contains(text(),'Brand Post ')]"));

			if (brandReply.isDisplayed() && brandPost.isDisplayed()) {
				System.out.println("Brandreply & Brandpost are displayed");
			} else {
				System.out.println("Brandreply & Brandpost are not displayed");
			}

			js.executeScript("arguments[0].click()", useractivity);

			filter(driver, channel);

			ticketsSearch(driver, channel);

//make actionable

			WebDriverWait wait1 = new WebDriverWait(driver,30);
			WebElement makeActionable = wait1.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Make Actionable')])[1]")));

			//WebElement makeActionable = driver.findElement(By.xpath("(//span[contains(text(),'Make Actionable')])[1]"));
			js.executeScript("arguments[0].click()", makeActionable);
			Thread.sleep(2000);
			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'New Ticket Filter')]"));
			js.executeScript("arguments[0].click()", newTicketFilter);

			Thread.sleep(4000);

//e-commercelogo
			WebElement imageIcon = driver
					.findElement(By.xpath("(//div[@id='socialBox'])[2]//following::img[@src='/assets/images/channel-logos/ecomerce.svg']"));
			if (imageIcon.isDisplayed()) {
				System.out.println("E-commerce image is displayed");
			} else {
				System.out.println("E-commerce image is not displayed");
			}

			ticketInformation.add(1, "E-commerce");

//imagename
			WebElement ticketName = driver
					.findElement(By.xpath("(//div[@id='socialBox'])[2]//following::span[contains(text(),'Comments')]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

//username
			WebElement userName = driver.findElement(
					By.xpath("(//div[@id='socialBox'])[2]//span[contains(text(),'Comments')]//following::a[1]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username is not displayed");
			}

			ticketInformation.add(2, userName.getText());

//brandname
			WebElement brandName = driver
					.findElement(By.xpath("(//div[@id='socialBox'])[2]//following::div[@class='post__pill nowrap']"));
			if (brandName.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			ticketInformation.add(3, brandName.getText());

//time
			WebElement timeScheduleIcon = driver.findElement(
					By.xpath("(//div[@id='socialBox'])[2]//following::mat-icon[contains(text(),'schedule')]"));
			WebElement dateTime = driver.findElement(
					By.xpath("(//div[@id='socialBox'])[2]//following::span[@class='post__head--label text-nowrap']"));
			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);
			timeInformation(driver);

//mention id
			WebElement mentionIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::mat-icon[contains(text(),'message')])[1]"));
			WebElement mentionId = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[@class='post__foot--label'])[1]"));
			if (mentionIcon.isDisplayed() && mentionId.getText() != "") {
				System.out.println("Mention id is displayed");
			} else {
				System.out.println("Mention id is not displayed");
			}



//ticketid
			WebElement ticketIcon = driver.findElement(By
					.xpath("((//div[@id='socialBox'])[2]//following::mat-icon[contains(text(),'local_activity')])[1]"));
			WebElement ticketId = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[@class='post__foot--label'])[2]"));
			if (ticketIcon.isDisplayed() && ticketId.getText() != "") {
				System.out.println("Ticket id is displayed");
			} else {
				System.out.println("Ticket id is not displayed");
			}

			System.out.println("Ticket id:" + ticketId.getText());

			ticketInformation.add(7, ticketId.getText());

//ticketStatus
			WebElement ticketStatusIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::mat-icon[contains(text(),'folder')])[1]"));
			WebElement ticketStatus = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[@class='post__foot--label'])[4]"));
			if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
				System.out.println("Ticket status is displayed");
			} else {
				System.out.println("Ticket status is not  displayed");
			}

			System.out.println("Ticket status:" + ticketStatus.getText());

			ticketInformation.add(8, ticketStatus.getText());

//priority
			WebElement priorityIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[@class='post__foot--label'])[5]"));
			if (priorityIcon.isDisplayed() && priority.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			ticketInformation.add(9, priority.getText());

//translate
			WebElement translateIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::mat-icon[contains(text(),'translate')])[1]"));
			WebElement languageName = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[@class='post__foot--label'])[6]"));
			if (translateIcon.isDisplayed() && languageName.getText() != "") {
				System.out.println("Language is displayed");
			} else {
				System.out.println("Language is not displayed");
			}

//mention category
			WebElement symbol = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::mat-icon[contains(text(),'alternate_email')])"));
			WebElement device = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[@class='post__foot--value'])"));
			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is dispalyed");
			} else {
				System.out.println("Device is not dispalyed");
			}

			ticketInformation.add(10, device.getText());

			ticketInformation.add(11, "NA");
			ticketInformation.add(12, "NA");
			ticketInformation.add(13, "NA");
			ticketInformation.add(14, "NA");
			ticketInformation.add(15, "NA");
			ticketInformation.add(16, "NA");
			ticketInformation.add(17, "NA");
			ticketInformation.add(18, "NA");
			ticketInformation.add(19, "NA");
			ticketInformation.add(20, "NA");
			ticketInformation.add(21, "NA");
			ticketInformation.add(22, "NA");

//close search
			WebElement closeSearch = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click()", closeSearch);
			Thread.sleep(2000);
			driver.navigate().refresh();

			Thread.sleep(2000);

			CommonFunctions.writeStatusInformationToExcel(ticketInformation);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void timeInformation(WebDriver driver) throws Exception {
		try {

			WebElement dateTime = driver.findElement(
					By.xpath("(//div[@id='socialBox'])[2]//following::span[@class='post__head--label text-nowrap']"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

//Created Time
			WebElement createdOnTime = driver.findElement(
					By.xpath("(//div[@id='socialBox'])[2]//span[contains(text(),'Created on:')]//following::span[1]"));
			ticketInformation.add(4, createdOnTime.getText());
			System.out.println("Created Time: " + createdOnTime.getText());

//modified Time
			WebElement modifiedOnTime = driver.findElement(
					By.xpath("(//div[@id='socialBox'])[2]//span[contains(text(),'Modified on:')]//following::span[1]"));
			ticketInformation.add(5, modifiedOnTime.getText());
			System.out.println("Modified On: " + modifiedOnTime.getText());

//mentioned Time
			WebElement mentionedOnTime = driver.findElement(By
					.xpath("(//div[@id='socialBox'])[2]//span[contains(text(),'Mentioned on:')]//following::span[1]"));
			ticketInformation.add(6, mentionedOnTime.getText());
			System.out.println("Mentioned On: " + mentionedOnTime.getText());

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
					"(//span[@class='mat-button-wrapper']//following::mat-icon[contains(text(),'filter_alt')])[4]")));
			filterButton.click();

			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement brand = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//input[@data-placeholder='Type to search Brand'])[2]")));

			brand.sendKeys("kalyan");
			WebElement brandName = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", brandName);
			WebElement closeBrand = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),'Brand, Date duration')])[2]"));
			js.executeScript("arguments[0].click()", closeBrand);

			Thread.sleep(4000);

			List<WebElement> ticketAndMentionList;
			ticketAndMentionList = driver
					.findElements(By.xpath("(//mat-panel-title[contains(.,'Tickets and Mentions')])[2]"));

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

	@SuppressWarnings("deprecation")
	public static void ticketsSearch(WebDriver driver, String channel) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement search = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[2]")));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", search);

			Thread.sleep(2000);

			WebElement inputbox = driver.findElement(By.id("post-search-input"));
			inputbox.sendKeys("Rajat Sahoo");

			search.click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
