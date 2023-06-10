package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzMessagingWindowSettingsUIComponents {

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

	public static void verifyingMessagingWindowSettingsComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			if (advResponseManagement.isDisplayed()) {
				System.out.println("Adv Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Adv Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);

//messaging window settings
			WebElement messagingWindowSettingsLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Messaging_Window_Settings.svg']"));
			WebElement messagingWindowSettings = driver
					.findElement(By.xpath("//span[contains(text(),'Messaging Window Settings')]"));
			if (messagingWindowSettingsLogo.isDisplayed() && messagingWindowSettings.isDisplayed()) {
				System.out.println("Messaging Window Settings is displayed");
				componentsInformation.add(1, "Present");
			} 
			else {
				System.out.println("Messaging Window Settings is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", messagingWindowSettings);
			Thread.sleep(3000);

//messaging window settings tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement messagingWindowSettingsTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Messaging Window Settings')])[2]"));
			if (pushpin.isDisplayed() && messagingWindowSettingsTab.isDisplayed()) {
				System.out.println("Messaging Window Settings Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Messaging Window Settings Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//messaging window settings information 
			WebElement messagingWindowSettingsHeading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement information = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (messagingWindowSettingsHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Messaging Window Settings Information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Messaging Window Settings Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//select brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			if (brandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Select Brand Field is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Select Brand Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//layout style &types
			WebElement layoutStyleHeading = driver
					.findElement(By.xpath("//span[@class='mr-10' and contains(text(),'Layout Style')]"));
			WebElement layoutStyle1 = driver
					.findElement(By.xpath("//img[@src='assets/images/account/chat_settings_layout_01.svg']"));
			WebElement layoutStyle2 = driver
					.findElement(By.xpath("//img[@src='assets/images/account/chat_settings_layout_02.svg']"));
			if (layoutStyleHeading.isDisplayed() && layoutStyle1.isDisplayed() && layoutStyle2.isDisplayed()) {
				System.out.println("Layout Style Heading and Types are displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Layout Style Heading and Types are not  displayed");
				componentsInformation.add(5, "Not Present");
			}

//select channel heading
			WebElement selectChannelHeading = driver
					.findElement(By.xpath("//p[@class='chatwinset__body--left-title']"));
			if (selectChannelHeading.isDisplayed()) {
				System.out.println("Select channel Heading is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Select channel Heading is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//fb messenger
			WebElement fbMessengerLogo = driver
					.findElement(By.xpath("//img[@src='assets/images/account/chat_settings_messenger.svg']"));
			WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Messenger')]"));
			WebElement checkbox = driver.findElement(By.xpath(
					"(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]"));
			if (fbMessengerLogo.isDisplayed() && name.isDisplayed() && checkbox.isDisplayed()) {
				System.out.println("Facebook Messenger is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Facebook Messenger is not displayed");
				componentsInformation.add(7, "Not Present");
			}

//chatbot messenger
			WebElement chatbotLogo = driver
					.findElement(By.xpath("//img[@src='assets/images/account/chat_settings_chatbot.svg']"));
			WebElement name1 = driver.findElement(By.xpath("//span[contains(text(),'Chatbot')]"));
			WebElement checkbox1 = driver.findElement(By.xpath(
					"(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]"));
			if (chatbotLogo.isDisplayed() && name1.isDisplayed() && checkbox1.isDisplayed()) {
				System.out.println("Chatbot Messenger is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Chatbot Messenger is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			
//whatsapp messenger
			WebElement whatsappLogo=driver.findElement(By.xpath("//img[@src='assets/images/account/chat_settings_whatsapp.svg']"));
			WebElement name2=driver.findElement(By.xpath("//span[contains(text(),'Whatsapp')]"));
			WebElement checkbox2=driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]"));
			if(whatsappLogo.isDisplayed()&&name2.isDisplayed()&&checkbox2.isDisplayed()) {
				System.out.println("Whatsapp Messenger is displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Whatsapp Messenger is not displayed");
				componentsInformation.add(9, "Not Present");
			}
			
//instagram messenger
			WebElement instagramLogo=driver.findElement(By.xpath("//img[@src='assets/images/account/chat_settings_instagram_dm.svg']"));
			WebElement name3=driver.findElement(By.xpath("//span[contains(text(),'Instagram')]"));
			WebElement checkbox3=driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[4]"));
			if(instagramLogo.isDisplayed()&& name3.isDisplayed()&& checkbox3.isDisplayed()) {
				System.out.println("Instagram Messenger is displayed");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Instagram Messenger is not displayed");
				componentsInformation.add(10, "Not Present");
			}
			
//preview
			WebElement previewHeading=driver.findElement(By.xpath("//p[@class='chatwinset__body--right-title']"));
			if(previewHeading.isDisplayed()) {
				System.out.println("Preview Heading is displayed");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Preview Heading is not displayed");
				componentsInformation.add(11, "Not Present");
			}
			
//chatbot
			WebElement chatbot=driver.findElement(By.xpath("//img[@src='/assets/images/common/chat-bubble.svg']"));
			if(chatbot.isDisplayed()) {
				System.out.println("Chatbot Button is displayed");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Chatbot Button is not displayed");
				componentsInformation.add(12, "Not Present");
			}
			
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			componentsInformation.add(13, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "MessagingWindowSettingUICompone");


		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
