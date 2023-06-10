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

public class AllMentionTwitterWorkflowProcess {
	
	public static List<String> ticketInformation =new ArrayList<String>();  

	@SuppressWarnings("deprecation")
	public static void allMentionsWorkFlow(WebDriver driver, String channel) throws Exception {

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

			
			ticketInformation.add(0,"AllMentions Twitter WorkFlow");
			
			
			WebElement allmentions = driver.findElement(By.xpath("(//span[contains(text(),'All Mention')])[1]"));
			allmentions.click();

// useractivity

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement useractivity = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'User Activity ')]")));

			//JavascriptExecutor js = (JavascriptExecutor) driver;
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

			WebElement brandReply = driver.findElement(By.xpath("//span[@class='mat-checkbox-label' and text()='Brand ']"));

			WebElement brandPost = driver.findElement(By.xpath("//span[contains(text(),'Brand Post ')]"));

			if (brandReply.isDisplayed() && brandPost.isDisplayed()) {
				System.out.println("Brandreply & Brandpost are displayed");
			} else {
				System.out.println("Brandreply & Brandpost are not displayed");
			}

			js.executeScript("arguments[0].click()", useractivity);

			CommonFunctions.ticketsSearch(driver, channel);

//make actionable

		
			if(channel.equalsIgnoreCase("twitter")) {
				WebElement makeActionable = driver.findElement(By.xpath("(//span[contains(text(),'Make Actionable')])[1]"));
				js.executeScript("arguments[0].click()", makeActionable);
				Thread.sleep(2000);
				WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'Back To Ticket List')]"));
				js.executeScript("arguments[0].click()", newTicketFilter);
				
				Thread.sleep(4000);
				//CommonFunctions.ticketsSearch(driver, channel);
			}
			
			

			WebElement imageIcon = driver
					.findElement(By.xpath("(//img[@src='/assets/images/channel-logos/" + channel + ".svg'])[1]"));

// facebooklogo
			if (channel.equalsIgnoreCase("facebook")) {
				if (imageIcon.isDisplayed()) {
					System.out.println("Facebook Image displayed successfully");
				} else {
					System.out.println("Facebook Image not displayed");
				}
				
				ticketInformation.add(1,"Facebook");

			}
			
// instagram logo
			else if (channel.equalsIgnoreCase("instagram")) {
				if (imageIcon.isDisplayed()) {
					System.out.println("Instagram Image displayed successfully");
				} else {
					System.out.println("Instagram Image not displayed");
				}
				ticketInformation.add(1,"Instagram");
			}
			
// twitter logo
			else if (channel.equalsIgnoreCase("twitter")) {
				if (imageIcon.isDisplayed()) {
					System.out.println("Twitter Image displayed successfully");
				} else {
					System.out.println("Twitter Image not displayed");
				}
				ticketInformation.add(1,"Twitter");
			}

// imagename

			WebElement ticketName = driver
					.findElement(By.xpath("(//span[contains(text(),'Found')])[2]//following::span[1]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

// username & userID

			WebElement username = driver.findElement(By.xpath("(//span[contains(text(),'Found')])[2]//following::a[1]"));
			if (username.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}
			
			ticketInformation.add(2, username.getText());
			
		
// brandname

			WebElement brandname = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::div[@class='post__pill bg__grey--lighter nowrap'])[2]"));
			if (brandname.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}
			
			ticketInformation.add(3, brandname.getText());

//time

			WebElement timeScheduleIcon = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::mat-icon[contains(.,' schedule')])[1]"));
			WebElement dateTime = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//span[@class='post__head--label text-nowrap'])[1]"));

			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}
		
			Thread.sleep(2000);
			timeInformation(driver);
			
//mentionid
			
			

			WebElement mentionIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'message')])[4]"));
			WebElement mentionID = driver.findElement(By
					.xpath("((//mat-icon[contains(text(),'message')])[4]//following::span[@class='post__foot--label'])[1]"));
			String mentionIDValue = mentionID.getText();
			System.out.println("Mention ID: " + mentionIDValue);
			if (mentionIcon.isDisplayed() && mentionID.getText() != "") {
				System.out.println("Mention ID & Icon are displayed");
			} else {
				System.out.println("Mention ID & Icon are not displayed");
			}

//total mention

			WebElement totalMentions = driver
					.findElement(By.xpath("((//div[@id='socialBox'])[2]//mat-icon[contains(text(),'question_answer')])[1]"));
			WebElement mentions = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//span[@class='post__foot--label'])[3]"));

			if (totalMentions.isDisplayed() && mentions.getText() != "") {
				System.out.println("Total Mentions value is displayed");
			} else {
				System.out.println("Total Mentions value is not displayed");
			}
			
//ticket id
			WebElement ticketIcon = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[2]//mat-icon[contains(text(),'local_activity')])[1]"));
			WebElement ticketID = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[2]//span[@class='post__foot--label'])[2]"));
			
			if (ticketIcon.isDisplayed() && ticketID.getText() != "") {
				System.out.println("Ticket ID & Icon are displayed");
			} else {
				System.out.println("Ticket ID & Icon are not displayed");
			}
			
			System.out.println("Ticket id:"+ticketID.getText());
			
			ticketInformation.add(7, ticketID.getText());
			
			
//ticketstatus

			WebElement ticketStatusIcon = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//mat-icon[contains(text(),'folder')])[1]"));
			WebElement ticketStatus = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//span[@class='post__foot--label ticketstatus__blue colored__locobuzz'])[1]"));

			if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
				System.out.println("TicketStatus is displayed");
			} else {
				System.out.println("TicketStatus is not displayed");
			}
			
			System.out.println("Ticket status:"+ticketStatus.getText());
			
			ticketInformation.add(8, ticketStatus.getText());

// priority
			WebElement priorityIcon = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//span[@class='post__foot--label colored__main-text'])[1]"));

			if (priority.isDisplayed() && priorityIcon.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}
			
			ticketInformation.add(9, priority.getText());

// translate
			WebElement translateIcon = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//mat-icon[contains(text(),'translate')])[1]"));
			WebElement languageName = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//span[@class='post__foot--label'])[4]"));

			if (translateIcon.isDisplayed() && languageName.getText() != "") {
				System.out.println("Language is displayed");
			} else {
				System.out.println("Language is not displayed");
			}
// mention category

			WebElement symbol = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//mat-icon[contains(text(),'alternate_email')])[1]"));
			WebElement device = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//span[@class='post__foot--label'])[5]"));

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
			Thread.sleep(5000);
			//driver.navigate().refresh();
			
			Thread.sleep(2000);
			
			CommonFunctions.writeStatusInformationToExcel(ticketInformation);
			
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void timeInformation(WebDriver driver) throws Exception {
		try {

			WebElement dateTime = driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//span[@class='post__head--label text-nowrap'])[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.moveToElement(dateTime).click().build();
			action.perform();
			Thread.sleep(4000);

//Created Time			

			WebElement createdOnTime = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[2]//span[@class='custom__tooltip--label' and contains(.,'Created on:')]//following::span)[1]"));
			ticketInformation.add(4, createdOnTime.getText());
			System.out.println("Created Time: " + createdOnTime.getText());

//Modified Time

			WebElement modifiedOnTime = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[2]//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

			ticketInformation.add(5, modifiedOnTime.getText());
			System.out.println("Modified On: " + modifiedOnTime.getText());

//Mentioned Time

			WebElement mentionedOnTime = driver.findElement(By.xpath(
					"((//div[@id='socialBox'])[2]//span[@class='custom__tooltip--label' and contains(.,'Mentioned on:')]//following::span)[1]"));
			ticketInformation.add(6, mentionedOnTime.getText());
			System.out.println("Mentioned On: " + mentionedOnTime.getText());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	

}
