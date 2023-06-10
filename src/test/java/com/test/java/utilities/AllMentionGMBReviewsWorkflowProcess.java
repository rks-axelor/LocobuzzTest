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

public class AllMentionGMBReviewsWorkflowProcess {

	public static List<String> ticketInformation = new ArrayList<String>();

	@SuppressWarnings("deprecation")
	public static void allMentionsWorkFlow(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, "AllMentions GMB Reviews WorkFlow");

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

			CommonFunctions.ticketsSearch(driver, channel);
			
			WebElement search=driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[1]"));
			js.executeScript("arguments[0].click()", search);

//GMBlogo
			WebElement imageIcon = driver
					.findElement(By.xpath("(//img[@src='/assets/images/channelicons/GoogleMyReview.svg'])"));
			if (imageIcon.isDisplayed()) {
				System.out.println("GMB review image is displayed");
			} else {
				System.out.println("GMB review image is not  displayed");
			}

			ticketInformation.add(1, "GMB Reviews");

//imagename
			WebElement ticketName = driver.findElement(By.xpath("(//span[contains(text(),'GMB')])[2]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

//username
			WebElement userName = driver
					.findElement(By.xpath("(//span[contains(text(),'GMB')])[2]//following::a[1]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username is not displayed");
			}

			ticketInformation.add(2, userName.getText());

//brandname
			WebElement brandName = driver.findElement(By.xpath("(//div[@class='post__pill nowrap'])"));
			if (brandName.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			ticketInformation.add(3, brandName.getText());

//time
			WebElement timeScheduleIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])"));
			WebElement dateTime = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])//following::span[1]"));
			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);
			timeInformation(driver);

//mention id
			WebElement mentionIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'message')])[4]"));
			WebElement mentionId = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'message')])[4]//following::span[1]"));
			if (mentionIcon.isDisplayed() && mentionId.getText() != "") {
				System.out.println("Mention id is displayed");
			} else {
				System.out.println("Mention id is not displayed");
			}

//totalmentions
			WebElement totalMentionsIcon = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'question_answer')])[1]"));
			WebElement totalMentions = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'question_answer')])[1]//following::span[1]"));
			if (totalMentionsIcon.isDisplayed() && totalMentions.getText() != "") {
				System.out.println("Total mentions is displayed");
			} else {
				System.out.println("Total mentions is not displayed");
			}

//ticket id
			WebElement ticketIcon = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::mat-icon[@aria-label='local activity'])[3]"));
			WebElement ticketId = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[@class='post__foot--label'])[2]"));
			if (ticketIcon.isDisplayed() && ticketId.getText() != "") {
				System.out.println("Ticket id is displayed");
			} else {
				System.out.println("Ticket id is not displayed");
			}

			System.out.println("Ticket id:" + ticketId.getText());

			ticketInformation.add(7, ticketId.getText());

//ticket Status
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
			WebElement priorityIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]//following::span[1]"));
			if (priorityIcon.isDisplayed() && priority.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			ticketInformation.add(9, priority.getText());

//translate
			WebElement translateIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'translate')])[1]"));
			WebElement languageName = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'translate')])[1]//following::span[1]"));
			if (translateIcon.isDisplayed() && languageName.getText() != "") {
				System.out.println("Language is displayed");
			} else {
				System.out.println("Language is not displayed");
			}

//mention category
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate_email')])"));
			WebElement device = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'alternate_email')])//following::span[1]"));
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

			WebElement dateTime = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])//following::span[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

//Created Time
			WebElement createdOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(text(),'Created on:')])//following::span[1]"));
			ticketInformation.add(4, createdOnTime.getText());
			System.out.println("Created Time: " + createdOnTime.getText());

//ModifiedTime
			WebElement modifiedOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(text(),'Modified on:')])//following::span[1]"));
			ticketInformation.add(5, modifiedOnTime.getText());
			System.out.println("Modified On: " + modifiedOnTime.getText());

//Mentioned Time
			WebElement mentionedOnTime = driver.findElement(By.xpath(
					"(//span[@class='custom__tooltip--label' and contains(text(),'Mentioned on:')])//following::span[1]"));
			ticketInformation.add(6, mentionedOnTime.getText());
			System.out.println("Mentioned On: " + mentionedOnTime.getText());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
