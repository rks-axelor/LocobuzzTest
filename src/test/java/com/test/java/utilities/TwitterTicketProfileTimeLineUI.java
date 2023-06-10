package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TwitterTicketProfileTimeLineUI {

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

	public static void profileDetails(WebDriver driver, String channel) throws Exception {
		try {

//Click open details
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(5000);

//profile details

//profile heading
			WebElement profile = driver.findElement(By.xpath("//div[contains(text(),'Profile')]"));
			if (profile.isDisplayed()) {
				System.out.println("Profile tab label is displayed");
			} else {
				System.out.println("Profile tab label is not  displayed");
			}

//username
			WebElement userLogo = driver.findElement(By.xpath("//div[@class='post-profile__info--profileimg']"));
			WebElement userName = driver.findElement(By.xpath("//div[@class='post-profile__info--profilecontent']"));
			if (userLogo.isDisplayed() && userName.isDisplayed()) {
				System.out.println("UserName and logo are displayed");
			} else {
				System.out.println("UserName and logo are not displayed");
			}

//protrait
			WebElement protrait = driver.findElement(By.xpath("//mat-icon[contains(text(),'portrait')]"));
			if (protrait.isDisplayed()) {
				System.out.println("Protrait is displayed");
			} else {
				System.out.println("Protrait is not  displayed");
			}
			js.executeScript("arguments[0].click()", protrait);
			Thread.sleep(5000);

//more vert
			WebElement morevert = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_vert')])[12]"));
			js.executeScript("arguments[0].click()", morevert);
			Thread.sleep(5000);

//more details
			WebElement followsLogo = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'follow_the_signs')])[2]"));
			WebElement follows = driver.findElement(By.xpath("(//span[contains(text(),'Follow/Unfollow')])[2]"));
			WebElement muteLogo = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'do_not_disturb_on_total_silence')])[2]"));
			WebElement mute = driver.findElement(By.xpath("(//span[contains(text(),'Mute/Unmute')])[2]"));
			WebElement blockLogo = driver.findElement(By.xpath("(//mat-icon[contains(text(),'block')])[2]"));
			WebElement block = driver.findElement(By.xpath("(//span[contains(text(),'Block/UnBlock')])[2]"));
			if (followsLogo.isDisplayed() && follows.isDisplayed() && muteLogo.isDisplayed() && mute.isDisplayed()
					&& blockLogo.isDisplayed() && block.isDisplayed()) {
				System.out.println("Follows,mute,block are displayed");
			} else {
				System.out.println("Follows,mute,block are not  displayed");
			}

//influencer
			WebElement influencerHeading = driver
					.findElement(By.xpath("(//label[contains(text(),'Influencer: ')])[2]"));
			WebElement influencerName = driver
					.findElement(By.xpath("(//span[contains(text(),'Banking Services')])[2]"));
			WebElement editButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			if (influencerHeading.isDisplayed() && influencerName.isDisplayed() && editButton.isDisplayed()) {
				System.out.println("Influencer heading,name are displayed");
			} else {
				System.out.println("Influencer heading,name are not displayed");
			}
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);

			WebElement markInfluenceHeading = driver.findElement(By.xpath("//h3[contains(text(),'Mark Influencer')]"));
			WebElement categoryField = driver.findElement(By.xpath(
					"//h3[contains(text(),'Mark Influencer')]//following::div[contains(@class,'mat-form-field-wrapper')]"));
			WebElement removeInfluencer = driver
					.findElement(By.xpath("//span[contains(text(),' Remove Influencer ')]"));
			WebElement updateInfluencer = driver
					.findElement(By.xpath("//span[contains(text(),' Update Influencer ')]"));
			if (markInfluenceHeading.isDisplayed() && categoryField.isDisplayed() && removeInfluencer.isDisplayed()
					&& updateInfluencer.isDisplayed()) {
				System.out.println("MarkInfluencer heading,category field,remove&update buttons are displayed");
			} else {
				System.out.println("MarkInfluencer heading,category field,remove&update buttons are not displayed");
			}

			WebElement closeButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[4]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);

//sentiment uplift score
			WebElement sentimentHeading = driver
					.findElement(By.xpath("(//div[@class='post-profile__score--labelmain d-flex-items-center'])[2]"));
			WebElement sentimentDate = driver
					.findElement(By.xpath("(//span[contains(@class,'post-profile__score--labelsub')])[3]"));
			WebElement refreshButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'refresh ')])[2]"));
			if (sentimentHeading.isDisplayed() && sentimentDate.isDisplayed() && refreshButton.isDisplayed()) {
				System.out.println("Sentiment Uplift score details are displayed");
			} else {
				System.out.println("Sentiment Uplift score details are not displayed");
			}

//nps score
			WebElement npsScoreHeading = driver.findElement(By.xpath("(//span[contains(text(),'NPS Score')])[2]"));
			WebElement npsInfo = driver
					.findElement(By.xpath("(//div[contains(@class,'post-profile__score--labelsub')])[2]"));
			if (npsScoreHeading.isDisplayed() && npsInfo.isDisplayed()) {
				System.out.println("Nps Score heading,information are displayed");
			} else {
				System.out.println("Nps Score heading,information are not displayed");
			}

//profile
			WebElement profileHeading = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),'Profile')])[2]"));
			WebElement profileInfo = driver.findElement(By.xpath("(//ul[@class='post-profile__info--social'])[2]"));
			if (profileHeading.isDisplayed() && profileInfo.isDisplayed()) {
				System.out.println("Profile information are displayed");
			} else {
				System.out.println("Profile information are not displayed");
			}

//Bio ,traits,crm
			WebElement bio = driver.findElement(By.xpath("(//div[contains(@class,'post-profile__info--bio')])[2]"));
			WebElement traits = driver.findElement(By.xpath("(//div[@class='post-profile__info--traits'])[2]"));
			WebElement crm = driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'CRM Details')])[2]"));
			if (bio.isDisplayed() && traits.isDisplayed() && crm.isDisplayed()) {
				System.out.println("Bio,traits,crm are displayed");
			} else {
				System.out.println("Bio,traits,crm are not displayed");
			}

//user overview
			WebElement overviewHeading = driver.findElement(By.xpath("//h3[contains(text(),'User Overview')]"));
			WebElement overviewField = driver.findElement(By.xpath("(//div[@class='stat'])[1]"));
			WebElement overviewField1 = driver.findElement(By.xpath("(//div[@class='stat'])[2]"));
			WebElement overviewField2 = driver.findElement(By.xpath("(//div[@class='stat'])[3]"));
			WebElement overviewField3 = driver.findElement(By.xpath("(//div[@class='stat'])[4]"));
			WebElement overviewField4 = driver.findElement(By.xpath("(//div[@class='stat'])[5]"));
			WebElement overviewField5 = driver.findElement(By.xpath("(//div[@class='stat'])[6]"));
			if (overviewHeading.isDisplayed() && overviewField.isDisplayed() && overviewField1.isDisplayed()
					&& overviewField2.isDisplayed() && overviewField3.isDisplayed() && overviewField4.isDisplayed()
					&& overviewField5.isDisplayed()) {
				System.out.println("Overview heading and fields are displayed");
			} else {
				System.out.println("Overview heading and fields are not displayed");
			}

//sentiment trend
			WebElement sentimentTrend = driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[6]"));
			WebElement sentimentGraph = driver.findElement(By.xpath("(//div[@class='highcharts-container '])"));
			if (sentimentTrend.isDisplayed() && sentimentGraph.isDisplayed()) {
				System.out.println("Sentiment trend heading,graph are displayed");
			} else {
				System.out.println("Sentiment trend heading,graph are not displayed");
			}

//user interaction
			WebElement userInteractionHeading = driver
					.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[7]"));
			js.executeScript("arguments[0].click()", userInteractionHeading);
			Thread.sleep(3000);
			WebElement userInteractionGraph = driver.findElement(By.xpath("(//div[@class='highcharts-container '])"));
			if (userInteractionGraph.isDisplayed()) {
				System.out.println("User Interaction heading,graph are displayed");
			} else {
				System.out.println("User Interaction heading,graph are not displayed");
			}

//user activity
			WebElement userActivityHeading = driver.findElement(By.xpath("//h3[contains(text(),'User Activities')]"));
			WebElement userActivityField = driver
					.findElement(By.xpath("(//div[@class='user-activities__summary--item'])[1]"));
			WebElement userActivityField1 = driver
					.findElement(By.xpath("(//div[@class='user-activities__summary--item'])[2]"));
			WebElement ActivityForm = driver.findElement(By.xpath(
					"//h3[contains(text(),'User Activities')]//following::div[contains(@class,'mat-form-field-wrapper')]"));
			WebElement userTimeLine = driver.findElement(By.xpath("//div[@class='user-activities__timeline']"));
			if (userActivityHeading.isDisplayed() && userActivityField.isDisplayed() && userActivityField1.isDisplayed()
					&& ActivityForm.isDisplayed() && userTimeLine.isDisplayed()) {
				System.out.println("User Activity heading,field,timeline are displayed");
			} else {
				System.out.println("User Activity heading,field,timeline are  not displayed");
			}
			
			WebElement userEnrichView=driver.findElement(By.xpath("//span[contains(text(),'User Enrich View')]"));
			js.executeScript("arguments[0].click()", userEnrichView);
			Thread.sleep(3000);
			
			timelineDetails(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	
	public static void timelineDetails(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//timeline
			WebElement timelineHeading=driver.findElement(By.xpath("//div[contains(text(),'Timeline')]"));
			js.executeScript("arguments[0].click()", timelineHeading);
			Thread.sleep(3000);
			
//ticket id
			WebElement ticketIdHeading=driver.findElement(By.xpath("//label[contains(text(),'Ticket ID')]"));
			WebElement ticketId=driver.findElement(By.xpath("//label[contains(text(),'Ticket ID')]//following::div[contains(@class,'mat-form-field-wrapper')]"));
			WebElement postTimeLine=driver.findElement(By.xpath("//ul[@class='post-timeline']"));
			if(ticketIdHeading.isDisplayed()&&ticketId.isDisplayed()&&postTimeLine.isDisplayed()) {
				System.out.println("Ticket id heading and posttimeline are displayed");
			}
			else {
				System.out.println("Ticket id heading and posttimeline are not displayed");
			}
			
			WebElement newTicketFilter = driver.findElement(By.xpath("//span[contains(text(),'Back To Ticket List')]"));
			js.executeScript("arguments[0].click()", newTicketFilter);
			Thread.sleep(2000);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
