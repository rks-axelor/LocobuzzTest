package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzNotificationUIComponents {

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

	public static void verifyingNotificationComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv listening settings
			WebElement advListeningSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			if (advListeningSettings.isDisplayed()) {
				System.out.println("Adv Listening Settings is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Adv Listening Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advListeningSettings);
			Thread.sleep(3000);

//notification
			WebElement notificationLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Notification.svg']"));
			WebElement notification = driver.findElement(By.xpath("//span[contains(text(),'Notification')]"));
			if (notificationLogo.isDisplayed() && notification.isDisplayed()) {
				System.out.println("Notification is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Notification is not displayed");
				componentsInformation.add(1, "Not Present");
			}		
			js.executeScript("arguments[0].click()", notification);
			Thread.sleep(3000);

//campagin tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement campaginNotificationTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Campaign Notification')])[1]"));
			if (pushpin.isDisplayed() && campaginNotificationTab.isDisplayed()) {
				System.out.println("Campagin Notification Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Campagin Notification Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//campagin information
			WebElement campaginHeading = driver
					.findElement(By.xpath("(//p[contains(text(),'Campaign Notification')])"));
			WebElement information = driver
					.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[1]"));
			if (campaginHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Campagin Notification information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Campagin Notification information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			if (brandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Brand Field is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Brand Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//subject line
			WebElement subjectLine = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			if (subjectLine.isDisplayed()) {
				System.out.println("Email Subject Line is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Email Subject Line is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//email address setup information
			WebElement emailSetupHeading = driver.findElement(By.xpath("(//p[@class='font-weight-600 mb-4'])[1]"));
			WebElement emailInformation = driver.findElement(By.xpath("(//p[@class='text__light--sm mb-10'])[1]"));
			if (emailSetupHeading.isDisplayed() && emailInformation.isDisplayed()) {
				System.out.println("Email Address Setup Information is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Email Address Setup Information is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//email To
			WebElement emailTo = driver.findElement(By.xpath("(//label[@class='font-weight-600'])[1]"));
			WebElement emailBox = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (emailTo.isDisplayed() && emailBox.isDisplayed()) {
				System.out.println("Email To Field is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Email To Field is not displayed");
				componentsInformation.add(7, "Not Present");
			}

//email Cc
			WebElement emailCc = driver.findElement(By.xpath("(//label[@class='font-weight-600'])[2]"));
			WebElement emailBox1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (emailCc.isDisplayed() && emailBox1.isDisplayed()) {
				System.out.println("Email Cc Field is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Email Cc Field is not displayed");
				componentsInformation.add(8, "Not Present");
			}

//email Bcc
			WebElement emailBcc = driver.findElement(By.xpath("(//label[@class='font-weight-600'])[3]"));
			WebElement emailBox2 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (emailBcc.isDisplayed() && emailBox2.isDisplayed()) {
				System.out.println("Email Bcc Field is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Email Bcc Field is not displayed");
				componentsInformation.add(9, "Not Present");
			}

//note
			WebElement noteMessage = driver.findElement(By.xpath("//p[@class='text__sm font-weight-500 mt-5 mb-14']"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note message is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Note message is not displayed");
				componentsInformation.add(10, "Not Present");
			}

//copy emails
			WebElement copyEmails = driver.findElement(By.xpath("(//span[contains(text(),'Copy Emails')])[1]"));
			if (copyEmails.isDisplayed()) {
				System.out.println("Copy Emails Button is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Copy Emails Button is not displayed");
				componentsInformation.add(11, "Not Present");
			}

//email preview
			WebElement emailPreviewHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--md font-weight-600 mt-10 ml-20']"));
			WebElement emailPreviewPage = driver
					.findElement(By.xpath("//img[@src='assets/images/common/email_preview_notification.svg']"));
			if (emailPreviewHeading.isDisplayed() && emailPreviewPage.isDisplayed()) {
				System.out.println("Email Preview Page is displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Email Preview Page is not displayed");
				componentsInformation.add(12, "Not Present");
			}

//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			if (saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(13, "Not Present");
			}

//brandpost notification tab
			WebElement pushpin1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement brandPostTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Brand Post Notification')])[1]"));
			if (pushpin1.isDisplayed() && brandPostTab.isDisplayed()) {
				System.out.println("Brand Post Notification Tab is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Brand Post Notification Tab is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			js.executeScript("arguments[0].click()", brandPostTab);
			Thread.sleep(3000);

//brandpost information
			WebElement heading = driver.findElement(By.xpath(
					"(//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title'])[2]"));
			WebElement information1 = driver
					.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[2]"));
			if (heading.isDisplayed() && information1.isDisplayed()) {
				System.out.println("Brand Post Information is displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Brand Post Information is not displayed");
				componentsInformation.add(15, "Not Present");
			}
			
//brand field
			WebElement brandField1=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement arrow1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			if(brandField1.isDisplayed()&&arrow1.isDisplayed()) {
				System.out.println("Brand Field is displayed");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Brand Field is not displayed");
				componentsInformation.add(16, "Not Present");
			}
			
//subject line
			WebElement subjectLine1=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			if(subjectLine1.isDisplayed()) {
				System.out.println("Subject Line for BrandPost is displayed");
				componentsInformation.add(17, "Present");
			}
			else {
				System.out.println("Subject Line for BrandPost is not displayed");
				componentsInformation.add(17, "Not Present");
			}
			
//email address setup information
			WebElement emailSetupHeading1=driver.findElement(By.xpath("(//p[@class='font-weight-600 mb-4'])[2]"));
			WebElement information2=driver.findElement(By.xpath("(//p[@class='text__light--sm mb-10'])[2]"));
			if(emailSetupHeading1.isDisplayed()&&information2.isDisplayed()) {
				System.out.println("Email Setup Information is displayed");
				componentsInformation.add(18, "Present");
			}
			else {
				System.out.println("Email Setup Information is not displayed");
				componentsInformation.add(18, "Not Present");
			}
			
//email To
			WebElement emailTo1 = driver.findElement(By.xpath("(//label[@class='font-weight-600'])[4]"));
			WebElement emailBox4 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[9]"));
			if (emailTo1.isDisplayed() && emailBox4.isDisplayed()) {
				System.out.println("Email To Field is displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("Email To Field is not displayed");
				componentsInformation.add(19, "Not Present");
			}

//email Cc
			WebElement emailCc1 = driver.findElement(By.xpath("(//label[@class='font-weight-600'])[5]"));
			WebElement emailBox5 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[10]"));
			if (emailCc1.isDisplayed() && emailBox5.isDisplayed()) {
				System.out.println("Email Cc Field is displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Email Cc Field is not displayed");
				componentsInformation.add(20, "Not Present");
			}

//email Bcc
			WebElement emailBcc1 = driver.findElement(By.xpath("(//label[@class='font-weight-600'])[6]"));
			WebElement emailBox6 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[11]"));
			if (emailBcc1.isDisplayed() && emailBox6.isDisplayed()) {
				System.out.println("Email Bcc Field is displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Email Bcc Field is not displayed");
				componentsInformation.add(21, "Not Present");
			}

//note
			WebElement noteMessage1 = driver.findElement(By.xpath("//p[@class='text__sm font-weight-500 mb-14']"));
			if (noteMessage1.isDisplayed()) {
				System.out.println("Note message is displayed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("Note message is not displayed");
				componentsInformation.add(22, "Not Present");
			}

//copy emails
			WebElement copyEmails1 = driver.findElement(By.xpath("(//span[contains(text(),'Copy Emails')])[2]"));
			if (copyEmails1.isDisplayed()) {
				System.out.println("Copy Emails Button is displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Copy Emails Button is not displayed");
				componentsInformation.add(23, "Not Present");
			}
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			
			componentsInformation.add(24, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "NotificationUIComponent");
			
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
