package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzEscalationEmailsUIComponents {

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

	public static void verifyingEscalationEmailComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv.response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			if (advResponseManagement.isDisplayed()) {
				System.out.println("Advance Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Advance Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);

//escalation email
			WebElement escalationEmailLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Escalation_Emails.svg']"));
			WebElement escalationEmail = driver.findElement(By.xpath("//span[contains(text(),'Escalation Emails')]"));
			if (escalationEmailLogo.isDisplayed() && escalationEmail.isDisplayed()) {
				System.out.println("Escalation Email image and label are displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Escalation Email image and label are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", escalationEmail);
			Thread.sleep(3000);

//escalation email tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement escalationEmailTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Escalation Emails')])[2]"));
			if (pushpin.isDisplayed() && escalationEmailTab.isDisplayed()) {
				System.out.println("Escalation Email tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Escalation Email tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//escalation email information
			WebElement heading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement escalationEmailInfo = driver
					.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (heading.isDisplayed() && escalationEmailInfo.isDisplayed()) {
				System.out.println("Escalation Email heading and information are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Escalation Email heading and information are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])"));
			if (searchField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			
//select the brand
			WebElement arrow1=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement searchBrand=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand.sendKeys("titan");
			WebElement brand=driver.findElement(By.xpath("//span[contains(text(),'Titan')]"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);

//agent button
			WebElement agentButton = driver.findElement(
					By.xpath("//div[@class='escemail__header--tab tab-active']//span[contains(text(),'Agent')]"));
			if (agentButton.isDisplayed()) {
				System.out.println("Agent Button is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Agent Button is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", agentButton);
			Thread.sleep(3000);

//configure escalation for agent information
			WebElement image = driver.findElement(By.xpath("//img[@src='assets/images/account/Escalation_image.svg']"));
			WebElement configureHeading = driver
					.findElement(By.xpath("//p[@class='text__title--fontxl colored__blue--dark mb-8 mt-18']"));
			WebElement configureInfo = driver
					.findElement(By.xpath("//p[@class='line-height-1.5 mb-22 font-weight-500']"));
			if (image.isDisplayed() && configureHeading.isDisplayed() && configureInfo.isDisplayed()) {
				System.out.println("Configuration Escalation Email Information for agent is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Configuration Escalation Email Information for agent is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//configure escalation button for agent
			WebElement configureEscalationButton = driver
					.findElement(By.xpath("//span[contains(text(),' Configure First and Final Escalation Email')]"));
			if (configureEscalationButton.isDisplayed()) {
				System.out.println("Configuration Escalation Button for Agent is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Configuration Escalation Button for Agent is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", configureEscalationButton);
			Thread.sleep(3000);

//arrow back
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back ')]"));
			if (arrowBack.isDisplayed()) {
				System.out.println("Arrow Back is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Arrow Back is not displayed");
				componentsInformation.add(8, "Not Present");
			}

//configure escalation for agent heading
			WebElement configureEscalationHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			if (configureEscalationHeading.isDisplayed()) {
				System.out.println("Configure Escalation for agent heading is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Configure Escalation for agent heading is not displayed");
				componentsInformation.add(9, "Not Present");
			}

//steppers
			WebElement steppers = driver.findElement(By.xpath("//div[@class='stepper']"));
			if (steppers.isDisplayed()) {
				System.out.println("Steppers are displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Steppers are not displayed");
				componentsInformation.add(10, "Not Present");
			}

//escalation notification email
			WebElement escalationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading.isDisplayed() && escalationInfo.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
				componentsInformation.add(11, "Not Present");
			}

//send notification email
			WebElement notificationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			WebElement hoursField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement minutesField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (notificationHeading.isDisplayed() && notificationInfo.isDisplayed()&&hoursField.isDisplayed()&&minutesField.isDisplayed()) {
				System.out.println("Send Notification email heading , information and fields are displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Send Notification email heading ,information and fields are not displayed");
				componentsInformation.add(12, "Not Present");
			}

//fields for emails
			WebElement subjectLineField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement sendEmailField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (subjectLineField.isDisplayed() && sendEmailField.isDisplayed()) {
				System.out.println("All Fields for emails are displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("All Fields for emails are not displayed");
				componentsInformation.add(13, "Not Present");
			}

//editor toolbars
			WebElement editorToolBars = driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			if (editorToolBars.isDisplayed()) {
				System.out.println("Editor Tool bars are displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Editor Tool bars are not displayed");
				componentsInformation.add(14, "Not Present");
			}
			Thread.sleep(3000);

//content field and personalize button
			WebElement contentField = driver.findElement(By.xpath("//div[@class='cke_contents cke_reset']"));
			WebElement personalize = driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			if (contentField.isDisplayed() && personalize.isDisplayed()) {
				System.out.println("Content field and personalize button are displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Content field and personalize button are not displayed");
				componentsInformation.add(15, "Not Present");
			}

//email preview
			WebElement emailPreviewHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--md font-weight-600 mb-5']"));
			WebElement emailPreview = driver
					.findElement(By.xpath("//img[@src='assets/images/account/Escalation_Preview.svg']"));
			if (emailPreviewHeading.isDisplayed()) {
				System.out.println("Email Preview is displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Email Preview is not displayed");
				componentsInformation.add(16, "Not Present");
			}

//next button
			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			if (nextButton.isDisplayed()) {
				System.out.println("Next Button is displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Next Button is not displayed");
				componentsInformation.add(17, "Not Present");
			}

//close button
			WebElement closeButton = driver.findElement(By.xpath("//span[contains(text(),'Close')]"));
			if (closeButton.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(18, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);

//csd button
			WebElement csdButton = driver.findElement(By.xpath("//span[contains(text(),'CSD')]"));
			if (csdButton.isDisplayed()) {
				System.out.println("CSD Button is displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("CSD Button is not displayed");
				componentsInformation.add(19, "Not Present");
			}
			js.executeScript("arguments[0].click()", csdButton);
			Thread.sleep(3000);

			verifyingCSDComponents(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void verifyingCSDComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//configuration escalation for csd information
			WebElement image = driver.findElement(By.xpath("//img[@src='assets/images/account/Escalation_image.svg']"));
			WebElement configureHeading = driver
					.findElement(By.xpath("//p[@class='text__title--fontxl colored__blue--dark mb-8 mt-18']"));
			WebElement configureInfo = driver
					.findElement(By.xpath("//p[@class='line-height-1.5 mb-22 font-weight-500']"));
			if (image.isDisplayed() && configureHeading.isDisplayed() && configureInfo.isDisplayed()) {
				System.out.println("Configuration Escalation for csd information is displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Configuration Escalation for csd information is not displayed");
				componentsInformation.add(20, "Not Present");
			}

//configuration escalation button for csd
			WebElement escalationButton = driver
					.findElement(By.xpath("//span[contains(text(),' Configure First and Final Escalation Email')]"));
			if (escalationButton.isDisplayed()) {
				System.out.println("Escalation Button for csd is displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Escalation Button for csd is not displayed");
				componentsInformation.add(21, "Not Present");
			}
			js.executeScript("arguments[0].click()", escalationButton);
			Thread.sleep(3000);

//arrowback and heading
			WebElement arrowBack = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			WebElement heading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			if (arrowBack.isDisplayed() && heading.isDisplayed()) {
				System.out.println("Arrow back and Configuration escalation for csd heading are displayed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("Arrow back and Configuration escalation for csd heading are not displayed");
				componentsInformation.add(22, "Not Present");
			}

//steppers
			WebElement steppers = driver.findElement(By.xpath("//div[@class='stepper']"));
			if (steppers.isDisplayed()) {
				System.out.println("Steppers are displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Steppers are not displayed");
				componentsInformation.add(23, "Not Present");
			}

//escalation notification email
			WebElement escalationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading.isDisplayed() && escalationInfo.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
				componentsInformation.add(24, "Present");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
				componentsInformation.add(24, "Not Present");
			}

//send notification email
			WebElement notificationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			WebElement hoursField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement minutesField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (notificationHeading.isDisplayed() && notificationInfo.isDisplayed()&&hoursField.isDisplayed()&&minutesField.isDisplayed()) {
				System.out.println("Send Notification email heading ,information and fields are displayed");
				componentsInformation.add(25, "Present");
			} else {
				System.out.println("Send Notification email heading , information and fields are not displayed");
				componentsInformation.add(25, "Not Present");
			}
			
//fields for emails
			WebElement subjectLineField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement sendEmailField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (subjectLineField.isDisplayed() && sendEmailField.isDisplayed()) {
				System.out.println("All Fields for emails are displayed");
				componentsInformation.add(26, "Present");
			} else {
				System.out.println("All Fields for emails are not displayed");
				componentsInformation.add(26, "Not Present");
			}
			
//editortools,content field amd personalize
			WebElement editorTools=driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			WebElement contentField=driver.findElement(By.xpath("//div[@class='cke_contents cke_reset']"));
			WebElement personalizeButton=driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			if(editorTools.isDisplayed()&&contentField.isDisplayed()&&personalizeButton.isDisplayed()) {
				System.out.println("Editor tool,content field and personalize button are displayed");
				componentsInformation.add(27, "Present");
			}
			else {
				System.out.println("Editor tool,content field and personalize button are not displayed");
				componentsInformation.add(27, "Not Present");
			}
			
//email preview
			WebElement emailPreviewHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--md font-weight-600 mb-5']"));
			WebElement emailPreview = driver
					.findElement(By.xpath("//img[@src='assets/images/account/Escalation_Preview.svg']"));
			if (emailPreviewHeading.isDisplayed()) {
				System.out.println("Email Preview is displayed");
				componentsInformation.add(28, "Present");
			} else {
				System.out.println("Email Preview is not displayed");
				componentsInformation.add(28, "Not Present");
			}
			
//next , skip&save button
			WebElement nextButton=driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			WebElement skipSaveButton=driver.findElement(By.xpath("//span[contains(text(),'Skip & Save')]"));
			if(nextButton.isDisplayed()&&skipSaveButton.isDisplayed()) {
				System.out.println("Next and Skip&Save buttons are displayed");
				componentsInformation.add(29, "Present");
			}
			else {
				System.out.println("Next and Skip&Save buttons are not displayed");
				componentsInformation.add(29, "Not Present");
			}
			
//close button
			WebElement closeButton = driver.findElement(By.xpath("//span[contains(text(),'Close')]"));
			if (closeButton.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(30, "Present");
			} else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(32, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);
			
//brand button
			WebElement brandButton=driver.findElement(By.xpath("//span[contains(text(),'Brand')]"));
			if(brandButton.isDisplayed()) {
				System.out.println("Brand Button is displayed");
				componentsInformation.add(31, "Present");
			}
			else {
				System.out.println("Brand Button is not displayed");
				componentsInformation.add(31, "Not Present");
			}
			js.executeScript("arguments[0].click()", brandButton);
			Thread.sleep(3000);
			
			verifyingBrandComponents(driver);
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void verifyingBrandComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//configuration escalation for brand information
			WebElement image = driver.findElement(By.xpath("//img[@src='assets/images/account/Escalation_image.svg']"));
			WebElement configureHeading = driver
					.findElement(By.xpath("//p[@class='text__title--fontxl colored__blue--dark mb-8 mt-18']"));
			WebElement configureInfo = driver
					.findElement(By.xpath("//p[@class='line-height-1.5 mb-22 font-weight-500']"));
			if (image.isDisplayed() && configureHeading.isDisplayed() && configureInfo.isDisplayed()) {
				System.out.println("Configuration Escalation for brand information is displayed");
				componentsInformation.add(32, "Present");
			} else {
				System.out.println("Configuration Escalation for brand information is not displayed");
				componentsInformation.add(32, "Not Present");
			}

//configuration escalation button for brand
			WebElement escalationButton = driver
					.findElement(By.xpath("//span[contains(text(),' Configure First and Final Escalation Email')]"));
			if (escalationButton.isDisplayed()) {
				System.out.println("Escalation Button for brand is displayed");
				componentsInformation.add(33, "Present");
			} else {
				System.out.println("Escalation Button for brand is not displayed");
				componentsInformation.add(33, "Not Present");
			}
			js.executeScript("arguments[0].click()", escalationButton);
			Thread.sleep(3000);

//arrowback and heading
			WebElement arrowBack = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			WebElement heading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			if (arrowBack.isDisplayed() && heading.isDisplayed()) {
				System.out.println("Arrow back and Configuration escalation for brand heading are displayed");
				componentsInformation.add(34, "Present");
			} else {
				System.out.println("Arrow back and Configuration escalation for brand heading are not displayed");
				componentsInformation.add(34, "Not Present");
			}

//steppers
			WebElement steppers = driver.findElement(By.xpath("//div[@class='stepper']"));
			if (steppers.isDisplayed()) {
				System.out.println("Steppers are displayed");
				componentsInformation.add(35, "Present");
			} else {
				System.out.println("Steppers are not displayed");
				componentsInformation.add(35, "Not Present");
			}

//escalation notification email
			WebElement escalationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[1]"));
			WebElement escalationInfo = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])"));
			if (escalationHeading.isDisplayed() && escalationInfo.isDisplayed()) {
				System.out.println("Escalation Notification email heading and information are displayed");
				componentsInformation.add(36, "Present");
			} else {
				System.out.println("Escalation Notification email heading and information are not displayed");
				componentsInformation.add(36, "Not Present");
			}

//send notification email
			WebElement notificationHeading = driver.findElement(
					By.xpath("(//p[@class='text__regular--md font-weight-600 mb-2 line-height-1.25'])[2]"));
			WebElement notificationInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-15'])"));
			WebElement hoursField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement minutesField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (notificationHeading.isDisplayed() && notificationInfo.isDisplayed()&&hoursField.isDisplayed()&&minutesField.isDisplayed()) {
				System.out.println("Send Notification email heading ,information and fields are displayed");
				componentsInformation.add(37, "Present");
			} else {
				System.out.println("Send Notification email heading , information and fields are not displayed");
				componentsInformation.add(37, "Not Present");
			}
			
//fields for emails
			WebElement subjectLineField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement sendEmailField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (subjectLineField.isDisplayed() && sendEmailField.isDisplayed()) {
				System.out.println("All Fields for emails are displayed");
				componentsInformation.add(38, "Present");
			} else {
				System.out.println("All Fields for emails are not displayed");
				componentsInformation.add(38, "Not Present");
			}
			
//editortools,content field amd personalize
			WebElement editorTools=driver.findElement(By.xpath("//span[@class='cke_top cke_reset_all']"));
			WebElement contentField=driver.findElement(By.xpath("//div[@class='cke_contents cke_reset']"));
			WebElement personalizeButton=driver.findElement(By.xpath("//span[contains(text(),' Personalize')]"));
			if(editorTools.isDisplayed()&&contentField.isDisplayed()&&personalizeButton.isDisplayed()) {
				System.out.println("Editor tool,content field and personalize button are displayed");
				componentsInformation.add(39, "Present");
			}
			else {
				System.out.println("Editor tool,content field and personalize button are not displayed");
				componentsInformation.add(39, "Not Present");
			}
			
//email preview
			WebElement emailPreviewHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--md font-weight-600 mb-5']"));
			WebElement emailPreview = driver
					.findElement(By.xpath("//img[@src='assets/images/account/Escalation_Preview.svg']"));
			if (emailPreviewHeading.isDisplayed()) {
				System.out.println("Email Preview is displayed");
				componentsInformation.add(40, "Present");
			} else {
				System.out.println("Email Preview is not displayed");
				componentsInformation.add(40, "Not Present");
			}
			
//next , skip&save button
			WebElement nextButton=driver.findElement(By.xpath("//span[contains(text(),'Next ')]"));
			WebElement skipSaveButton=driver.findElement(By.xpath("//span[contains(text(),'Skip & Save')]"));
			if(nextButton.isDisplayed()&&skipSaveButton.isDisplayed()) {
				System.out.println("Next and Skip&Save buttons are displayed");
				componentsInformation.add(41, "Present");
			}
			else {
				System.out.println("Next and Skip&Save buttons are not displayed");
				componentsInformation.add(41, "Not Present");
			}
			
//close button
			WebElement closeButton = driver.findElement(By.xpath("//span[contains(text(),'Close')]"));
			if (closeButton.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(42, "Present");
			} else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(42, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);
			
//activity log button
			WebElement activityLogButton=driver.findElement(By.xpath("//span[contains(text(),'Activity Log')]"));
			if(activityLogButton.isDisplayed()) {
				System.out.println("Activity Log Button is displayed");
				componentsInformation.add(43, "Present");
			}
			else {
				System.out.println("Activity Log Button is not displayed");
				componentsInformation.add(43, "Not Present");
			}
			js.executeScript("arguments[0].click()", activityLogButton);
			Thread.sleep(3000);
			
//activity log information 
			WebElement activityLogHeading=driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement activityInfo=driver.findElement(By.xpath("//p[contains(@class,'text__light text__sm mb-0')]"));
			if(activityLogHeading.isDisplayed()&&activityInfo.isDisplayed()) {
				System.out.println("Activity Log heading and information are displayed");
				componentsInformation.add(44, "Present");
			}
			else {
				System.out.println("Activity Log heading and information are not displayed");
				componentsInformation.add(44, "Not Present");
			}
			
//search field
			WebElement searchField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchField.isDisplayed()&&searchButton.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(45, "Present");
			}
			else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(45, "Not Present");
			}
			
//cross/close button
			WebElement crossButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			if(crossButton.isDisplayed()) {
				System.out.println("Cross/Closed is displayed");
				componentsInformation.add(46, "Present");
			}
			else {
				System.out.println("Cross/Closed is not displayed");
				componentsInformation.add(46, "Not Present");
			}
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
						
			componentsInformation.add(47, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "EscalationEmailUIComponents");
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
