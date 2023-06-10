package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzEscalationEmailsWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void escalationEmailProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv.response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);

//escalation email
			WebElement escalationEmailLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Escalation_Emails.svg']"));
			WebElement escalationEmail = driver.findElement(By.xpath("//span[contains(text(),'Escalation Emails')]"));
			js.executeScript("arguments[0].click()", escalationEmail);
			Thread.sleep(3000);

//escalation email information
			WebElement heading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement escalationEmailInfo = driver
					.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (heading.isDisplayed() && escalationEmailInfo.isDisplayed()) {
				System.out.println("Escalation Email heading and information are displayed");
			} else {
				System.out.println("Escalation Email heading and information are not displayed");
			}

//search brand
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand.sendKeys("auto demo");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),'Auto Demo')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//agent button
			WebElement agentButton = driver.findElement(
					By.xpath("//div[@class='escemail__header--tab tab-active']//span[contains(text(),'Agent')]"));
			if (agentButton.isDisplayed()) {
				System.out.println("Agent Button is displayed");
			} else {
				System.out.println("Agent Button is not displayed");
			}
			js.executeScript("arguments[0].click()", agentButton);
			Thread.sleep(3000);

//configure escalation button for agent
			WebElement configureEscalationButton = driver
					.findElement(By.xpath("//span[contains(text(),' Configure First and Final Escalation Email')]"));
			js.executeScript("arguments[0].click()", configureEscalationButton);
			Thread.sleep(3000);

//configure escalation for agent heading
			WebElement configureEscalationHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			if (configureEscalationHeading.isDisplayed()) {
				System.out.println("Configure Escalation for agent heading is displayed");
			} else {
				System.out.println("Configure Escalation for agent heading is not displayed");
			}

//first escalation process for agent

//First escalation notification email
			WebElement escalationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading.isDisplayed() && escalationInfo.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
			}

//send notification email
			WebElement notificationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			if (notificationHeading.isDisplayed() && notificationInfo.isDisplayed()) {
				System.out.println("Send Notification email heading , information are displayed");
			} else {
				System.out.println("Send Notification email heading ,information are not displayed");
			}

//select hours and minutes time
			WebElement hoursTime = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			hoursTime.sendKeys("1");
			WebElement minutesTime = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			minutesTime.sendKeys("10");

//subject line field for emails
			WebElement subjectLineField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (subjectLineField.isDisplayed()) {
				System.out.println("Subject line field for emails are displayed");
			} else {
				System.out.println("Subject line field for emails are not displayed");
			}

//select emails
			WebElement emails = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", emails);
			Thread.sleep(3000);
			WebElement selectEmail = driver.findElement(By.xpath("//span[contains(text(),' locotest@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", emails);
			Thread.sleep(3000);

			WebElement selectEmail1 = driver
					.findElement(By.xpath("//span[contains(text(),' jignesh.patel@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail1);
			Thread.sleep(3000);

//editor toolbars
			WebElement editorToolBars = driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			if (editorToolBars.isDisplayed()) {
				System.out.println("Editor Tool bars are displayed");
			} else {
				System.out.println("Editor Tool bars are not displayed");
			}
			Thread.sleep(3000);

//personalize
			WebElement personalizeButton = driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton);
			Thread.sleep(3000);
			WebElement selectAgent = driver.findElement(By.xpath("//button[contains(text(),'Agent Name')]"));
			js.executeScript("arguments[0].click()", selectAgent);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", personalizeButton);
			Thread.sleep(3000);
			WebElement selectTime = driver.findElement(By.xpath("//button[contains(text(),'Time')]"));
			js.executeScript("arguments[0].click()", selectTime);
			Thread.sleep(3000);

//next button
			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);

//final escalation process for agent

//Final escalation notification email
			WebElement escalationHeading1 = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo1 = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading1.isDisplayed() && escalationInfo1.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
			}

//send notification email
			WebElement notificationHeading1 = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo1 = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			if (notificationHeading1.isDisplayed() && notificationInfo1.isDisplayed()) {
				System.out.println("Send Notification email heading , information are displayed");
			} else {
				System.out.println("Send Notification email heading ,information are not displayed");
			}

//select hours and minutes time
			WebElement hoursTime1 = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			hoursTime1.sendKeys("1");
			WebElement minutesTime1 = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			minutesTime1.sendKeys("10");

//subject line field for emails
			WebElement subjectLineField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (subjectLineField1.isDisplayed()) {
				System.out.println("Subject line field for emails are displayed");
			} else {
				System.out.println("Subject line field for emails are not displayed");
			}

//select emails
			WebElement email = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email);
			Thread.sleep(3000);
			WebElement selectEmail2 = driver
					.findElement(By.xpath("//span[contains(text(),' locotest@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail2);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", email);
			Thread.sleep(3000);

			WebElement selectEmail3 = driver
					.findElement(By.xpath("//span[contains(text(),' jignesh.patel@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail3);
			Thread.sleep(3000);

//editor toolbars
			WebElement editorToolBars1 = driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			if (editorToolBars1.isDisplayed()) {
				System.out.println("Editor Tool bars are displayed");
			} else {
				System.out.println("Editor Tool bars are not displayed");
			}
			Thread.sleep(3000);

//personalize
			WebElement personalizeButton1 = driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton1);
			Thread.sleep(3000);
			WebElement selectAgent1 = driver.findElement(By.xpath("//button[contains(text(),'Agent Name')]"));
			js.executeScript("arguments[0].click()", selectAgent1);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", personalizeButton1);
			Thread.sleep(3000);
			WebElement selectTime1 = driver.findElement(By.xpath("//button[contains(text(),'Time')]"));
			js.executeScript("arguments[0].click()", selectTime1);
			Thread.sleep(3000);

//next button
			WebElement nextButton1 = driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);

//first escalation process for agent(after ticket approval)

//Configure escalation for Social Agent After ticket Approval from CSD or Brand
			WebElement approvalHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement approvalInfo = driver
					.findElement(By.xpath("(//p[@class='text__regular--sm font-weight-500 mb-5'])"));
			WebElement checkbox = driver.findElement(By.xpath("//span[@class='mat-checkbox-label']"));
			if (approvalHeading.isDisplayed() && approvalInfo.isDisplayed() && checkbox.isDisplayed()) {
				System.out.println(
						"Configure escalation for Social Agent After ticket Approval from CSD or Brand information and checkbox is displayed");
			} else {
				System.out.println(
						"Configure escalation for Social Agent After ticket Approval from CSD or Brand information and checkbox is displayed");
			}

//select hours and minutes time
			WebElement hoursTime2 = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			hoursTime2.sendKeys("2");
			WebElement minutesTime2 = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			minutesTime2.sendKeys("10");

//subject line field for emails
			WebElement subjectLineField2 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (subjectLineField2.isDisplayed()) {
				System.out.println("Subject line field for emails are displayed");
			} else {
				System.out.println("Subject line field for emails are not displayed");
			}

//select emails
			WebElement email3 = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email3);
			Thread.sleep(3000);
			WebElement selectEmail4 = driver
					.findElement(By.xpath("//span[contains(text(),' locotest@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail4);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", email3);
			Thread.sleep(3000);

			WebElement selectEmail5 = driver
					.findElement(By.xpath("//span[contains(text(),' jignesh.patel@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail5);
			Thread.sleep(3000);

//editor toolbars
			WebElement editorToolBars2 = driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			if (editorToolBars2.isDisplayed()) {
				System.out.println("Editor Tool bars are displayed");
			} else {
				System.out.println("Editor Tool bars are not displayed");
			}
			Thread.sleep(3000);

//personalize
			WebElement personalizeButton3 = driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton3);
			Thread.sleep(3000);
			WebElement selectAgent2 = driver.findElement(By.xpath("//button[contains(text(),'Agent Name')]"));
			js.executeScript("arguments[0].click()", selectAgent2);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", personalizeButton3);
			Thread.sleep(3000);
			WebElement selectTime2 = driver.findElement(By.xpath("//button[contains(text(),'Time')]"));
			js.executeScript("arguments[0].click()", selectTime2);
			Thread.sleep(3000);

//next button
			WebElement nextButton2 = driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			js.executeScript("arguments[0].click()", nextButton2);
			Thread.sleep(3000);

//final escalation process for agent(after ticket approval)

//Configure escalation for Social Agent After ticket Approval from CSD or Brand
			WebElement approvalHeading1 = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement approvalInfo1 = driver
					.findElement(By.xpath("(//p[@class='text__regular--sm font-weight-500 mb-5'])"));
			WebElement checkbox1 = driver.findElement(By.xpath("//span[@class='mat-checkbox-label']"));
			if (approvalHeading1.isDisplayed() && approvalInfo1.isDisplayed() && checkbox1.isDisplayed()) {
				System.out.println(
						"Configure escalation for Social Agent After ticket Approval from CSD or Brand information and checkbox is displayed");
			} else {
				System.out.println(
						"Configure escalation for Social Agent After ticket Approval from CSD or Brand information and checkbox is displayed");
			}
			js.executeScript("arguments[0].click()", checkbox1);
			Thread.sleep(5000);

//email preview
			WebElement emailPreviewHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--md font-weight-600 mb-5']"));
			WebElement emailPreview = driver
					.findElement(By.xpath("//img[@src='assets/images/account/Escalation_Preview.svg']"));
			if (emailPreviewHeading.isDisplayed()) {
				System.out.println("Email Preview is displayed");
			} else {
				System.out.println("Email Preview is not displayed");
			}

//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(5000);
			


//first escalation process for agent
			WebElement information = driver.findElement(
					By.xpath("(//div[@class='escemail__ticket-escalation--container border__light-grey'])[1]"));
			WebElement editButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[1]"));
			if (information.isDisplayed() && editButton.isDisplayed() && deleteButton.isDisplayed()) {
				System.out
						.println("First escalation process for agent of information,edit&delete button is displayed ");
			} else {
				System.out.println(
						"First escalation process for agent of information,edit&delete button is not  displayed ");
			}

//final escalation process for agent
			WebElement information1 = driver.findElement(
					By.xpath("(//div[@class='escemail__ticket-escalation--container border__light-grey'])[2]"));
			WebElement editButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			WebElement deleteButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[2]"));
			if (information1.isDisplayed() && editButton1.isDisplayed() && deleteButton1.isDisplayed()) {
				System.out
						.println("Final escalation process for agent of information,edit&delete button is displayed ");
			} else {
				System.out.println(
						"Final escalation process for agent of information,edit&delete button is not  displayed ");
			}
			
			js.executeScript("arguments[0].click()", editButton1);
			Thread.sleep(3000);
			
//edit process
			WebElement email4 = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email4);
			Thread.sleep(3000);
			WebElement selectEmail7 = driver
					.findElement(By.xpath("//span[contains(text(),' Abhijeet.Mathure@ril.co.in ')]"));
			js.executeScript("arguments[0].click()", selectEmail7);
			Thread.sleep(3000);
			
//next button
			WebElement nextButton3 = driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			js.executeScript("arguments[0].click()", nextButton3);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", nextButton3);
			Thread.sleep(3000);
//save button
			WebElement saveButton1 = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(5000);

//first escalation process for agent(after ticket approval)
			WebElement information2 = driver.findElement(
					By.xpath("(//div[@class='escemail__ticket-escalation--container border__light-grey'])[3]"));
			WebElement editButton2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[3]"));
			WebElement deleteButton2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[3]"));
			if (information2.isDisplayed() && editButton2.isDisplayed() && deleteButton2.isDisplayed()) {
				System.out.println(
						"First escalation process for agent after ticket approval of information,edit&delete button is displayed ");
			} else {
				System.out.println(
						"First escalation process for agent after ticket approval of information,edit&delete button is not  displayed ");
			}
			
			

//final escalation process for agent(after ticket approval)
			WebElement information3 = driver.findElement(
					By.xpath("(//div[@class='escemail__ticket-escalation--container border__light-grey'])[4]"));
			WebElement editButton3 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[4]"));
			WebElement deleteButton3 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[4]"));
			if (information3.isDisplayed() && editButton3.isDisplayed() && deleteButton3.isDisplayed()) {
				System.out.println(
						"Final escalation process for agent after ticket approval of information,edit&delete button is displayed ");
			} else {
				System.out.println(
						"Final escalation process for agent after ticket approval of information,edit&delete button is not  displayed ");
			}

//activity log button
			WebElement activityLogButton = driver.findElement(By.xpath("//span[contains(text(),'Activity Log')]"));
			js.executeScript("arguments[0].click()", activityLogButton);
			Thread.sleep(3000);

//activity log information 
			WebElement activityLogHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement activityInfo = driver.findElement(By.xpath("//p[contains(@class,'text__light text__sm mb-0')]"));
			if (activityLogHeading.isDisplayed() && activityInfo.isDisplayed()) {
				System.out.println("Activity Log heading and information are displayed");
			} else {
				System.out.println("Activity Log heading and information are not displayed");
			}

//activity log list
			WebElement activityLog = driver.findElement(By.xpath("//div[@class='activitylog']"));
			if (activityLog.isDisplayed()) {
				System.out.println("Activity Log list is displayed");
			} else {
				System.out.println("Activity Log list is not displayed");
			}

//cross/close button
			WebElement crossButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);

			escalationCsdWorkflow(driver);

			escalationBrandWorkflow(driver);

			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void escalationCsdWorkflow(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//csd button
			WebElement csdButton = driver.findElement(By.xpath("//span[contains(text(),'CSD')]"));
			js.executeScript("arguments[0].click()", csdButton);
			Thread.sleep(3000);

//configuration escalation button for csd
			WebElement escalationButton = driver
					.findElement(By.xpath("//span[contains(text(),' Configure First and Final Escalation Email')]"));
			js.executeScript("arguments[0].click()", escalationButton);
			Thread.sleep(3000);

//configure escalation for csd heading
			WebElement heading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			if (heading.isDisplayed()) {
				System.out.println("Configuration escalation for csd heading are displayed");
			} else {
				System.out.println("Configuration escalation for csd heading are not displayed");
			}

//first escalation process for csd

//escalation notification email
			WebElement escalationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading.isDisplayed() && escalationInfo.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
			}

//send notification email
			WebElement notificationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			if (notificationHeading.isDisplayed() && notificationInfo.isDisplayed()) {
				System.out.println("Send Notification email heading ,information are displayed");
			} else {
				System.out.println("Send Notification email heading , information  are not displayed");
			}

//select hours and minutes time
			WebElement hoursTime = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			hoursTime.sendKeys("3");
			WebElement minutesTime = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			minutesTime.sendKeys("30");

//subject line field for emails
			WebElement subjectLineField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (subjectLineField.isDisplayed()) {
				System.out.println("Subject line field for emails are displayed");
			} else {
				System.out.println("Subject line field for emails are not displayed");
			}

//select emails
			WebElement email = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email);
			Thread.sleep(3000);
			WebElement selectEmail2 = driver
					.findElement(By.xpath("//span[contains(text(),' vivek.sangale@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail2);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", email);
			Thread.sleep(3000);

			WebElement selectEmail3 = driver
					.findElement(By.xpath("//span[contains(text(),' donica.trivedi@spatialideas.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail3);
			Thread.sleep(3000);

//editor toolbars
			WebElement editorToolBars1 = driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			if (editorToolBars1.isDisplayed()) {
				System.out.println("Editor Tool bars are displayed");
			} else {
				System.out.println("Editor Tool bars are not displayed");
			}
			Thread.sleep(3000);

//personalize
			WebElement personalizeButton1 = driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton1);
			Thread.sleep(3000);
			WebElement selectAgent1 = driver.findElement(By.xpath("//button[contains(text(),'Agent Name')]"));
			js.executeScript("arguments[0].click()", selectAgent1);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", personalizeButton1);
			Thread.sleep(3000);
			WebElement selectTime1 = driver.findElement(By.xpath("//button[contains(text(),'Time')]"));
			js.executeScript("arguments[0].click()", selectTime1);
			Thread.sleep(3000);

//next button
			WebElement nextButton1 = driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);

// final escalation process for csd

// Final escalation notification email
			WebElement escalationHeading1 = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo1 = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading1.isDisplayed() && escalationInfo1.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
			}

// send notification email
			WebElement notificationHeading1 = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo1 = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			if (notificationHeading1.isDisplayed() && notificationInfo1.isDisplayed()) {
				System.out.println("Send Notification email heading , information are displayed");
			} else {
				System.out.println("Send Notification email heading ,information are not displayed");
			}

// select hours and minutes time
			WebElement hoursTime1 = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			hoursTime1.sendKeys("4");
			WebElement minutesTime1 = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			minutesTime1.sendKeys("20");

// subject line field for emails
			WebElement subjectLineField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (subjectLineField1.isDisplayed()) {
				System.out.println("Subject line field for emails are displayed");
			} else {
				System.out.println("Subject line field for emails are not displayed");
			}

// select emails
			WebElement email1 = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email1);
			Thread.sleep(3000);
			WebElement selectEmail4 = driver
					.findElement(By.xpath("//span[contains(text(),' vivek.sangale@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail4);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", email1);
			Thread.sleep(3000);

			WebElement selectEmail5 = driver
					.findElement(By.xpath("//span[contains(text(),' donica.trivedi@spatialideas.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail5);
			Thread.sleep(3000);

// editor toolbars
			WebElement editorToolBars2 = driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			if (editorToolBars2.isDisplayed()) {
				System.out.println("Editor Tool bars are displayed");
			} else {
				System.out.println("Editor Tool bars are not displayed");
			}
			Thread.sleep(3000);

// personalize
			WebElement personalizeButton2 = driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton2);
			Thread.sleep(3000);
			WebElement selectAgent2 = driver.findElement(By.xpath("//button[contains(text(),'Agent Name')]"));
			js.executeScript("arguments[0].click()", selectAgent2);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", personalizeButton2);
			Thread.sleep(3000);
			WebElement selectTime2 = driver.findElement(By.xpath("//button[contains(text(),'Time')]"));
			js.executeScript("arguments[0].click()", selectTime2);
			Thread.sleep(3000);

//email preview
			WebElement emailPreviewHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--md font-weight-600 mb-5']"));
			WebElement emailPreview = driver
					.findElement(By.xpath("//img[@src='assets/images/account/Escalation_Preview.svg']"));
			if (emailPreviewHeading.isDisplayed()) {
				System.out.println("Email Preview is displayed");
			} else {
				System.out.println("Email Preview is not displayed");
			}

//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(5000);

//first escalation process for csd
			WebElement information = driver.findElement(
					By.xpath("(//div[@class='escemail__ticket-escalation--container border__light-grey'])[1]"));
			WebElement editButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[1]"));
			if (information.isDisplayed() && editButton.isDisplayed() && deleteButton.isDisplayed()) {
				System.out.println("First escalation process for csd of information,edit&delete button is displayed ");
			} else {
				System.out.println(
						"First escalation process for csd of information,edit&delete button is not  displayed ");
			}

//final escalation process for csd
			WebElement information1 = driver.findElement(
					By.xpath("(//div[@class='escemail__ticket-escalation--container border__light-grey'])[2]"));
			WebElement editButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			WebElement deleteButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[2]"));
			if (information1.isDisplayed() && editButton1.isDisplayed() && deleteButton1.isDisplayed()) {
				System.out.println("Final escalation process for csd of information,edit&delete button is displayed ");
			} else {
				System.out.println(
						"Final escalation process for csd of information,edit&delete button is not  displayed ");
			}
			js.executeScript("arguments[0].click()", editButton1);
			Thread.sleep(3000);
			
//edit process
			WebElement email2= driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email2);
			Thread.sleep(3000);
			WebElement selectEmail = driver
					.findElement(By.xpath("//span[contains(text(),' aishwarya.jugade@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton1 = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(5000);

//activity log button
			WebElement activityLogButton = driver.findElement(By.xpath("//span[contains(text(),'Activity Log')]"));
			js.executeScript("arguments[0].click()", activityLogButton);
			Thread.sleep(3000);

//activity log information 
			WebElement activityLogHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement activityInfo = driver.findElement(By.xpath("//p[contains(@class,'text__light text__sm mb-0')]"));
			if (activityLogHeading.isDisplayed() && activityInfo.isDisplayed()) {
				System.out.println("Activity Log heading and information are displayed");
			} else {
				System.out.println("Activity Log heading and information are not displayed");
			}

//activity log list
			WebElement activityLog = driver.findElement(By.xpath("//div[@class='activitylog']"));
			if (activityLog.isDisplayed()) {
				System.out.println("Activity Log list is displayed");
			} else {
				System.out.println("Activity Log list is not displayed");
			}

//cross/close button
			WebElement crossButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void escalationBrandWorkflow(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//brand button
			WebElement brandButton = driver.findElement(By.xpath("//span[contains(text(),'Brand')]"));
			js.executeScript("arguments[0].click()", brandButton);
			Thread.sleep(3000);

//configuration escalation  button for brand
			WebElement escalationButton = driver
					.findElement(By.xpath("//span[contains(text(),' Configure First and Final Escalation Email')]"));
			js.executeScript("arguments[0].click()", escalationButton);
			Thread.sleep(3000);

//configure escalation for brand heading
			WebElement heading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			if (heading.isDisplayed()) {
				System.out.println("Configuration escalation for brand heading are displayed");
			} else {
				System.out.println("Configuration escalation for brand heading are not displayed");
			}

//first escalation process for brand

//escalation notification email
			WebElement escalationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading.isDisplayed() && escalationInfo.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
			}

//send notification email
			WebElement notificationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			if (notificationHeading.isDisplayed() && notificationInfo.isDisplayed()) {
				System.out.println("Send Notification email heading ,information are displayed");
			} else {
				System.out.println("Send Notification email heading , information  are not displayed");
			}

//select hours and minutes time
			WebElement hoursTime = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			hoursTime.sendKeys("3");
			WebElement minutesTime = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			minutesTime.sendKeys("30");

//subject line field for emails
			WebElement subjectLineField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (subjectLineField.isDisplayed()) {
				System.out.println("Subject line field for emails are displayed");
			} else {
				System.out.println("Subject line field for emails are not displayed");
			}

//select emails
			WebElement email = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email);
			Thread.sleep(3000);
			WebElement selectEmail2 = driver
					.findElement(By.xpath("//span[contains(text(),' chittaranjan.sahoo@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail2);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", email);
			Thread.sleep(3000);

			WebElement selectEmail3 = driver
					.findElement(By.xpath("//span[contains(text(),' Saurabh.nate@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail3);
			Thread.sleep(3000);

//editor toolbars
			WebElement editorToolBars1 = driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			if (editorToolBars1.isDisplayed()) {
				System.out.println("Editor Tool bars are displayed");
			} else {
				System.out.println("Editor Tool bars are not displayed");
			}
			Thread.sleep(3000);

//personalize
			WebElement personalizeButton1 = driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton1);
			Thread.sleep(3000);
			WebElement selectAgent1 = driver.findElement(By.xpath("//button[contains(text(),'Agent Name')]"));
			js.executeScript("arguments[0].click()", selectAgent1);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", personalizeButton1);
			Thread.sleep(3000);
			WebElement selectTime1 = driver.findElement(By.xpath("//button[contains(text(),'Time')]"));
			js.executeScript("arguments[0].click()", selectTime1);
			Thread.sleep(3000);

//next button
			WebElement nextButton1 = driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);

// final escalation process for brand

// Final escalation notification email
			WebElement escalationHeading1 = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo1 = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading1.isDisplayed() && escalationInfo1.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
			}

// send notification email
			WebElement notificationHeading1 = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo1 = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			if (notificationHeading1.isDisplayed() && notificationInfo1.isDisplayed()) {
				System.out.println("Send Notification email heading , information are displayed");
			} else {
				System.out.println("Send Notification email heading ,information are not displayed");
			}

// select hours and minutes time
			WebElement hoursTime1 = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			hoursTime1.sendKeys("4");
			WebElement minutesTime1 = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			minutesTime1.sendKeys("20");

// subject line field for emails
			WebElement subjectLineField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (subjectLineField1.isDisplayed()) {
				System.out.println("Subject line field for emails are displayed");
			} else {
				System.out.println("Subject line field for emails are not displayed");
			}

// select emails
			WebElement email1 = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email1);
			Thread.sleep(3000);
			WebElement selectEmail4 = driver
					.findElement(By.xpath("//span[contains(text(),' chittaranjan.sahoo@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail4);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", email1);
			Thread.sleep(3000);

			WebElement selectEmail5 = driver
					.findElement(By.xpath("//span[contains(text(),' Saurabh.nate@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail5);
			Thread.sleep(3000);

// editor toolbars
			WebElement editorToolBars2 = driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			if (editorToolBars2.isDisplayed()) {
				System.out.println("Editor Tool bars are displayed");
			} else {
				System.out.println("Editor Tool bars are not displayed");
			}
			Thread.sleep(3000);

// personalize
			WebElement personalizeButton2 = driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton2);
			Thread.sleep(3000);
			WebElement selectAgent2 = driver.findElement(By.xpath("//button[contains(text(),'Agent Name')]"));
			js.executeScript("arguments[0].click()", selectAgent2);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", personalizeButton2);
			Thread.sleep(3000);
			WebElement selectTime2 = driver.findElement(By.xpath("//button[contains(text(),'Time')]"));
			js.executeScript("arguments[0].click()", selectTime2);
			Thread.sleep(3000);

// email preview
			WebElement emailPreviewHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--md font-weight-600 mb-5']"));
			WebElement emailPreview = driver
					.findElement(By.xpath("//img[@src='assets/images/account/Escalation_Preview.svg']"));
			if (emailPreviewHeading.isDisplayed()) {
				System.out.println("Email Preview is displayed");
			} else {
				System.out.println("Email Preview is not displayed");
			}

// save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(5000);

// first escalation process for brand
			WebElement information = driver.findElement(
					By.xpath("(//div[@class='escemail__ticket-escalation--container border__light-grey'])[1]"));
			WebElement editButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[1]"));
			if (information.isDisplayed() && editButton.isDisplayed() && deleteButton.isDisplayed()) {
				System.out
						.println("First escalation process for brand of information,edit&delete button is displayed ");
			} else {
				System.out.println(
						"First escalation process for brand of information,edit&delete button is not  displayed ");
			}

// final escalation process for brand
			WebElement information1 = driver.findElement(
					By.xpath("(//div[@class='escemail__ticket-escalation--container border__light-grey'])[2]"));
			WebElement editButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			WebElement deleteButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[2]"));
			if (information1.isDisplayed() && editButton1.isDisplayed() && deleteButton1.isDisplayed()) {
				System.out
						.println("Final escalation process for brand of information,edit&delete button is displayed ");
			} else {
				System.out.println(
						"Final escalation process for brand of information,edit&delete button is not  displayed ");
			}

			js.executeScript("arguments[0].click()", editButton1);
			Thread.sleep(3000);

//edit process
			WebElement email2 = driver.findElement(By.xpath("//input[@placeholder='Type to Search']"));
			js.executeScript("arguments[0].click()", email2);
			Thread.sleep(3000);
			WebElement selectEmail = driver.findElement(By.xpath("//span[contains(text(),' donica3@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail);
			Thread.sleep(3000);

// save button
			WebElement saveButton1 = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(5000);

// activity log button
			WebElement activityLogButton = driver.findElement(By.xpath("//span[contains(text(),'Activity Log')]"));
			js.executeScript("arguments[0].click()", activityLogButton);
			Thread.sleep(3000);

// activity log information
			WebElement activityLogHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement activityInfo = driver.findElement(By.xpath("//p[contains(@class,'text__light text__sm mb-0')]"));
			if (activityLogHeading.isDisplayed() && activityInfo.isDisplayed()) {
				System.out.println("Activity Log heading and information are displayed");
			} else {
				System.out.println("Activity Log heading and information are not displayed");
			}

// activity log list
			WebElement activityLog = driver.findElement(By.xpath("//div[@class='activitylog']"));
			if (activityLog.isDisplayed()) {
				System.out.println("Activity Log list is displayed");
			} else {
				System.out.println("Activity Log list is not displayed");
			}

// cross/close button
			WebElement crossButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
