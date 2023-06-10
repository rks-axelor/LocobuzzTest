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

public class LocobuzzAutoClosureSettingsWorkflow {
	
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
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void autoClosureSettingsProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//response management
			WebElement responseManagement = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Response Management ')])[1]"));
			js.executeScript("arguments[0].click()", responseManagement);
			Thread.sleep(3000);
			
//autoclosure settings
			WebElement autoClosureSettingLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Autoclosure_Settings.svg']"));
			WebElement autoClosureSetting = driver
					.findElement(By.xpath("//span[contains(text(),'Autoclosure Settings')]"));
			js.executeScript("arguments[0].click()", autoClosureSetting);
			Thread.sleep(3000);
			
//autoclosure settings tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tab = driver.findElement(By.xpath("(//span[contains(text(),'Autoclosure Settings')])[2]"));
			js.executeScript("arguments[0].click()", tab);
			Thread.sleep(3000);
			

//autoclosure settings information
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Autoclosure Settings ')]"));
			WebElement info = driver.findElement(By.xpath("//p[contains(@class,'mb-0 text__light--sm')]"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("AutoClosure Settings Information is displayed");
			} else {
				System.out.println("AutoClosure Settings Information is not displayed");
			}
			
//select brand
			WebElement arrow=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			searchBrand.sendKeys("renault");
			WebElement brand=driver.findElement(By.xpath("//span[contains(text(),'Renault')]"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			
//Active button
			WebElement activeButton = driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);
			
//set reminder message duration
			WebElement reminderHeading = driver.findElement(By.xpath("(//h4[@class='text__label mb-0'])[1]"));
			WebElement reminderMessageInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[1]"));
			if (reminderHeading.isDisplayed() && reminderMessageInfo.isDisplayed()) {
				System.out.println("Reminder Message Duration Information is displayed");
			} else {
				System.out.println("Reminder Message Duration Information is not displayed");
			}
			
//reminder duration fields
			WebElement hoursField=driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			hoursField.clear();
			hoursField.sendKeys("1");
			WebElement minutesField=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			minutesField.clear();
			minutesField.sendKeys("8");
			
//note message for reminder
			WebElement noteMessage = driver
					.findElement(By.xpath("//p[@class='text__light text__sm mt-10 mb-10 pl-10']"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note Message for Reminder is displayed");
			} else {
				System.out.println("Note Message for Reminder is not displayed");
			}
			
//custom settings
			WebElement customizeButton=driver.findElement(By.xpath("(//span[contains(text(),'Customize')])[1]"));
			js.executeScript("arguments[0].click()", customizeButton);
			Thread.sleep(3000);
			
//select channel
			WebElement arrow1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[5]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			
			WebElement selectChannel=driver.findElement(By.xpath("(//span[contains(text(),'Twitter')])[5]"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
			WebElement selectminutes=driver.findElement(By.xpath("(//input[@type='number'])[8]"));
			selectminutes.clear();
			selectminutes.sendKeys("5");
			
			WebElement selectMinutes=driver.findElement(By.xpath("(//input[@type='number'])[10]"));
			selectMinutes.clear();
			selectMinutes.sendKeys("5");
			
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),' Done ')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//reminder message
			WebElement reminderCheckBox = driver.findElement(By.xpath("//span[contains(text(),'Reminder Messages ')]"));
			js.executeScript("arguments[0].click()", reminderCheckBox);
			Thread.sleep(3000);
			WebElement messageButton = driver.findElement(By.xpath("(//span[contains(text(),'+Add Messages')])[1]"));
			js.executeScript("arguments[0].click()", messageButton);
			Thread.sleep(3000);
			
			
//add reminder messages
			WebElement messageBox=driver.findElement(By.xpath("//textarea[@id='message1']"));
			messageBox.sendKeys("This is 1st reminder message");
			WebElement personalizeButton=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton);
			Thread.sleep(3000);
			WebElement selectPersonalize=driver.findElement(By.xpath("//button[contains(text(),'Full Name')]"));
			js.executeScript("arguments[0].click()", selectPersonalize);
			Thread.sleep(3000);
			WebElement addButton=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
			js.executeScript("arguments[0].click()", addButton);
			Thread.sleep(3000);
			
			WebElement editButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			if(editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			
			WebElement deleteButton=driver.findElement(By.xpath("//mat-icon[contains(text(),' delete')]"));
			if(deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
//add reminder messages for emails
			WebElement messageButton1=driver.findElement(By.xpath("(//span[contains(text(),'+Add Messages')])[2]"));
			js.executeScript("arguments[0].click()", messageButton1);
			Thread.sleep(3000);
			
			WebElement textarea=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
			driver.switchTo().frame(textarea);
			Thread.sleep(2000);
			
			WebElement frameData=driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p"));
			frameData.sendKeys("This is 1st reminder message");
			
			driver.switchTo().defaultContent();
			WebElement personalizeButton1=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton1);
			Thread.sleep(3000);
			WebElement selectPersonalize1=driver.findElement(By.xpath("//button[contains(text(),'Full Name')]"));
			js.executeScript("arguments[0].click()", selectPersonalize1);
			Thread.sleep(3000);
			
			
			
			WebElement addButton1=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
			js.executeScript("arguments[0].click()", addButton1);
			Thread.sleep(3000);
			
			WebElement editButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			if(editButton1.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			
			WebElement deleteButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[2]"));
			if(deleteButton1.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
			autoclosureDurationProcess(driver);
			

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void autoclosureDurationProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//set autoclosure duration
			WebElement autoClosureHeading = driver.findElement(By.xpath("(//h4[@class='text__label mb-0'])[2]"));
			WebElement autoClosureInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[3]"));
			if (autoClosureHeading.isDisplayed() && autoClosureInfo.isDisplayed()) {
				System.out.println("AutoClosure Duration Fields and Information are displayed");
			} else {
				System.out.println("AutoClosure Duration Fields and Information are not displayed");
			}
			
//autoclosure duration fields
			WebElement hoursField=driver.findElement(By.xpath("(//input[@type='number'])[3]"));
			hoursField.clear();
			hoursField.sendKeys("2");
			WebElement minutesField=driver.findElement(By.xpath("(//input[@type='number'])[4]"));
			minutesField.clear();
			minutesField.sendKeys("8");
			
//note message for autoclosure
			WebElement noteMessage = driver
					.findElement(By.xpath("//p[@class='text__light text__sm mt-5 pl-10 mb-10']"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note Message for Autoclosure is displayed");
			} else {
				System.out.println("Note Message for Autoclosure is not displayed");
			}
			
//custom settings
			WebElement customizeButton=driver.findElement(By.xpath("(//span[contains(text(),'Customize')])[2]"));
			js.executeScript("arguments[0].click()", customizeButton);
			Thread.sleep(3000);
			
//select channel
			WebElement arrow1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[5]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			
			WebElement selectChannel=driver.findElement(By.xpath("(//span[contains(text(),'Twitter')])[5]"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
			WebElement selectminutes=driver.findElement(By.xpath("(//input[@type='number'])[8]"));
			selectminutes.sendKeys("5");
			
			WebElement selectMinutes=driver.findElement(By.xpath("(//input[@type='number'])[10]"));
			selectMinutes.sendKeys("5");
			
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),' Done ')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//autoclosure messages
			WebElement autoClosureCheckbox=driver.findElement(By.xpath("(//span[contains(text(),'Autoclosure Messages')])"));
			js.executeScript("arguments[0].click()", autoClosureCheckbox);
			Thread.sleep(3000);
			WebElement addMessagesButton=driver.findElement(By.xpath("(//span[contains(text(),'+Add Messages')])[3]"));
			js.executeScript("arguments[0].click()", addMessagesButton);
			Thread.sleep(3000);
			
//add autoclosure messages
			WebElement messageBox=driver.findElement(By.xpath("//textarea[@id='message1']"));
			messageBox.sendKeys("This is 1st autoclosure message");
			WebElement personalizeButton=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton);
			Thread.sleep(3000);
			WebElement selectPersonalize=driver.findElement(By.xpath("//button[contains(text(),'Full Name')]"));
			js.executeScript("arguments[0].click()", selectPersonalize);
			Thread.sleep(3000);
			WebElement addButton=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
			js.executeScript("arguments[0].click()", addButton);
			Thread.sleep(3000);
			
			WebElement editButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[3]"));
			if(editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			
			WebElement deleteButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[3]"));
			if(deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
//add autoclosure messages for emails
			WebElement messageButton1=driver.findElement(By.xpath("(//span[contains(text(),'+Add Messages')])[4]"));
			js.executeScript("arguments[0].click()", messageButton1);
			Thread.sleep(3000);
			
			WebElement textarea=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
			driver.switchTo().frame(textarea);
			Thread.sleep(2000);
			
			WebElement frameData=driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p"));
			frameData.sendKeys("This is 1st autoclosure message");
			
			driver.switchTo().defaultContent();
			WebElement personalizeButton1=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", personalizeButton1);
			Thread.sleep(3000);
			WebElement selectPersonalize1=driver.findElement(By.xpath("//button[contains(text(),'Full Name')]"));
			js.executeScript("arguments[0].click()", selectPersonalize1);
			Thread.sleep(3000);
			
			
			
			WebElement addButton1=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
			js.executeScript("arguments[0].click()", addButton1);
			Thread.sleep(3000);
			
			WebElement editButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[4]"));
			if(editButton1.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			
			WebElement deleteButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete')])[4]"));
			if(deleteButton1.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
//twitter reply handle
			WebElement twitterReplyHandleHeading=driver.findElement(By.xpath("//h4[@class='text__label mb-1']"));
			WebElement twitterHandleInfo=driver.findElement(By.xpath("//p[@class='text__sub--sm mb-3']"));
			WebElement handleName=driver.findElement(By.xpath("//div[@class='autoclosure__container--handle-profile']"));
			if(twitterReplyHandleHeading.isDisplayed()&&twitterHandleInfo.isDisplayed()&&handleName.isDisplayed()) {
				System.out.println("Twitter Reply Handle Information are displayed");
			}
			else {
				System.out.println("Twitter Reply Handle Information are not displayed");
			}
			
//save button
			WebElement saveButton1=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(3000);
			
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
