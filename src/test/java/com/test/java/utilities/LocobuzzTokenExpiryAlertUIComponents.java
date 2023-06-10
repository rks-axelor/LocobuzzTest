package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzTokenExpiryAlertUIComponents {
	
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
	
	public static void verifyingTokenExpiryAlertComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//adv.listening settings
			WebElement advListeningSettings=driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			if(advListeningSettings.isDisplayed()) {
				System.out.println("Advance Listening Settings is displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Advance Listening Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advListeningSettings);
			Thread.sleep(3000);
			
//token expiry alert
			WebElement tokenExpiryAlertSymbol=driver.findElement(By.xpath("//img[@src='assets/account/menu/Token_Expiry_Alert.svg']"));
			WebElement tokenExpiryAlert=driver.findElement(By.xpath("//span[contains(text(),'Token Expiry Alert')]"));
			if(tokenExpiryAlertSymbol.isDisplayed()&&tokenExpiryAlert.isDisplayed()) {
				System.out.println("Token Expiry Alert Symbol and Name are displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Token Expiry Alert Symbol and Name are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", tokenExpiryAlert);
			Thread.sleep(3000);
			
//token expiry alert tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tokenExpiryAlertTab=driver.findElement(By.xpath("(//span[contains(text(),'Token Expiry Alert')])[2]"));
			if(pushpin.isDisplayed()&&tokenExpiryAlertTab.isDisplayed()) {
				System.out.println("Pushpin and token expiry alert tab are displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Pushpin and token expiry alert tab are not displayed");
				componentsInformation.add(2, "Not Present");
			}
			
//token expiry alert information
			WebElement heading=driver.findElement(By.xpath("(//p[contains(text(),'Token Expiry Alert')])"));
			WebElement info=driver.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if(heading.isDisplayed()&&info.isDisplayed()) {
				System.out.println("Token Expiry Alert Heading and Information are displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Token Expiry Alert Heading and Information are not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
//search field
			WebElement searchField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])"));
			if(searchField.isDisplayed()&&arrow.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			
//email subject line field
			WebElement emailSubjectField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			if(emailSubjectField.isDisplayed()) {
				System.out.println("Email Subject Line Field is displayed");
				componentsInformation.add(5, "Present");
			}
			else {
				System.out.println("Email Subject Line Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			
//send email field
			WebElement sendEmailField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if(sendEmailField.isDisplayed()) {
				System.out.println("Send Email Field is displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Send Email Field is not displayed");
				componentsInformation.add(6, "Not Present");
			}
			
//note message
			WebElement noteMessage=driver.findElement(By.xpath("//p[@class='text__sm font-weight-500 mt-5 mr-15 ml-15 mb-20']"));
			if(noteMessage.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			
//copy email
			WebElement copyEmailButton=driver.findElement(By.xpath("//span[contains(text(),'Copy Emails')]"));
			if(copyEmailButton.isDisplayed()) {
				System.out.println("Copy Email Button is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Copy Email Button is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			
//import email
			WebElement importEmailButton=driver.findElement(By.xpath("//span[contains(text(),'Import Emails')]"));
			if(importEmailButton.isDisplayed()) {
				System.out.println("Import Email Button is displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Import Email Button is not displayed");
				componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", importEmailButton);
			Thread.sleep(3000);
			
//import email information
			WebElement importHeading=driver.findElement(By.xpath("//p[@class='modal__title mb-0']"));
			WebElement importInfo=driver.findElement(By.xpath("//p[@class='mb-0 text__sm text__sub']"));
			if(importHeading.isDisplayed()&&importInfo.isDisplayed()) {
				System.out.println("Import Email Heading and Information are displayed");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Import Email Heading and Information are not displayed");
				componentsInformation.add(10, "Not Present");
			}
			
//cross button
			WebElement crossButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close ')]"));
			if(crossButton.isDisplayed()) {
				System.out.println("Cross Button is displayed");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Cross Button is not displayed");
				componentsInformation.add(11, "Not Present");
			}
			
//source brand
			WebElement sourceHeading=driver.findElement(By.xpath("//p[contains(@class,'mb-4 font-weight-600')]"));
			WebElement sourceInfo=driver.findElement(By.xpath("(//p[contains(@class,'text__sub--sm mb-10 line-height-1.50')])[1]"));
			WebElement sourceField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if(sourceHeading.isDisplayed()&&sourceInfo.isDisplayed()&&sourceField.isDisplayed()) {
				System.out.println("Source Brand Information and Field are displayed");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Source Brand Information and Field are not displayed");
				componentsInformation.add(12, "Not Present");
			}
			
//keyboard double arrow down
			WebElement keyboardDoubleArrow=driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_double_arrow_down')]"));
			if(keyboardDoubleArrow.isDisplayed()) {
				System.out.println("Keyword Double Arrow Down is displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("Keyword Double Arrow Down is not displayed");
				componentsInformation.add(13, "Not Present");
			}
			
//destination brand
			WebElement destinationHeading=driver.findElement(By.xpath("//p[@class='mb-0 font-weight-600 mb-4']"));
			WebElement destinationInfo=driver.findElement(By.xpath("//p[@class='text__sub--sm mb-10 line-height-1.50']"));
			WebElement destinationField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if(destinationHeading.isDisplayed()&&destinationInfo.isDisplayed()&&destinationField.isDisplayed()) {
				System.out.println("Destination Information and Field are displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Destination Information and Field are not displayed");
				componentsInformation.add(14, "Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(16, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton1=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			if(saveButton1.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(17, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(17, "Not Present");
			}
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(18, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "TokenExpiryAlertUIComponents");

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
