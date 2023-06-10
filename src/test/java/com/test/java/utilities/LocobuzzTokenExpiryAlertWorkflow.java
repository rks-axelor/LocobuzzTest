package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzTokenExpiryAlertWorkflow {
	
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
	
	public static void tokenExpiryAlertProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//adv.listening settings
			WebElement advListeningSettings=driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			js.executeScript("arguments[0].click()", advListeningSettings);
			Thread.sleep(3000);
			
//token expiry alert
			WebElement tokenExpiryAlertSymbol=driver.findElement(By.xpath("//img[@src='assets/account/menu/Token_Expiry_Alert.svg']"));
			WebElement tokenExpiryAlert=driver.findElement(By.xpath("//span[contains(text(),'Token Expiry Alert')]"));
			if(tokenExpiryAlertSymbol.isDisplayed()&&tokenExpiryAlert.isDisplayed()) {
				System.out.println("Token Expiry Alert Symbol and Name are displayed");
			}
			else {
				System.out.println("Token Expiry Alert Symbol and Name are not displayed");
			}
			js.executeScript("arguments[0].click()", tokenExpiryAlert);
			Thread.sleep(3000);
			
//token expiry alert tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tokenExpiryAlertTab=driver.findElement(By.xpath("(//span[contains(text(),'Token Expiry Alert')])[2]"));
			js.executeScript("arguments[0].click()", tokenExpiryAlertTab);
			Thread.sleep(3000);
			
//token expiry alert information
			WebElement heading=driver.findElement(By.xpath("(//p[contains(text(),'Token Expiry Alert')])"));
			WebElement info=driver.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if(heading.isDisplayed()&&info.isDisplayed()) {
				System.out.println("Token Expiry Alert Heading and Information are displayed");
			}
			else {
				System.out.println("Token Expiry Alert Heading and Information are not displayed");
			}
			
//select brand
			WebElement arrow=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand.sendKeys("titan");
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			
//send email
			WebElement sendEmail=driver.findElement(By.xpath("//input[@placeholder='Search Email Id']"));
			js.executeScript("arguments[0].click()", sendEmail);
			Thread.sleep(3000);
			WebElement selectEmail=driver.findElement(By.xpath("//span[contains(text(),' locotest@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail);
			Thread.sleep(3000);
			sendEmail.sendKeys("kalyan75@gmail.com");
			Thread.sleep(2000);
			WebElement selectEmail1=driver.findElement(By.xpath("//span[contains(text(),' kalyan75@gmail.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail1);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//copy email button
			WebElement copyEmailButton=driver.findElement(By.xpath("//span[contains(text(),'Copy Emails')]"));
			js.executeScript("arguments[0].click()", copyEmailButton);
			Thread.sleep(3000);
			
//copyEmail information
			WebElement copyEmailHeading=driver.findElement(By.xpath("//p[@class='modal__title mb-0']"));
			WebElement copyEmailInfo=driver.findElement(By.xpath("//p[@class='mb-0 text__sm text__sub']"));
			if(copyEmailHeading.isDisplayed()) {
				System.out.println("Copy Email Heading and Information are displayed");
			}
			else {
				System.out.println("Copy Email Heading and Information are not  displayed");
			}
			
//cross button
			WebElement crossButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close ')]"));
			if(crossButton.isDisplayed()) {
				System.out.println("Cross button is displayed");
			}
			else {
				System.out.println("Cross button is not displayed");
			}
			
//source brand information
			WebElement sourceHeading=driver.findElement(By.xpath("//p[contains(@class,'mb-4 font-weight-600')]"));
			WebElement sourceInfo=driver.findElement(By.xpath("(//p[contains(@class,'text__sub--sm mb-0 line-height-1.50')])[1]"));
			WebElement sourceField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if(sourceHeading.isDisplayed()&&sourceInfo.isDisplayed()&&sourceField.isDisplayed()) {
				System.out.println("Source Brand Information and Field are displayed");
			}
			else {
				System.out.println("Source Brand Information and Field are not displayed");
			}
			
//keyboard double arrow down
			WebElement keyboardDoubleArrow=driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_double_arrow_down')]"));
			if(keyboardDoubleArrow.isDisplayed()) {
				System.out.println("Keyboard Double Arrow Down is displayed");
			}
			else {
				System.out.println("Keyboard Double Arrow Down is not displayed");
			}
			
//destination brand information
			WebElement destinationHeading=driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement destinationInfo=driver.findElement(By.xpath("(//p[contains(@class,'text__sub--sm mb-0 line-height-1.50')])[2]"));
			WebElement destinationField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if(destinationHeading.isDisplayed()&&destinationInfo.isDisplayed()&&destinationField.isDisplayed()) {
				System.out.println("Destination Information and Field are displayed");
			}
			else {
				System.out.println("Destination Information and Field are not displayed");
			}
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
			}
			else {
				System.out.println("Cancel Button is not displayed");
			}
			
//save button
			WebElement savebutton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			if(savebutton.isDisplayed()) {
				System.out.println("Save Button is displayed");
			}
			else {
				System.out.println("Save Button is not  displayed");
			}
			
//copy email destination process
			WebElement destination=driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
			js.executeScript("arguments[0].click()", destination);
			Thread.sleep(3000);
			destination.sendKeys("auto demo");
			Thread.sleep(2000);
			WebElement selectBrand=driver.findElement(By.xpath("//span[contains(text(),'Auto Demo')]"));
			selectBrand.click();
			//js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
//savebutton
			WebElement saveButton1=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(3000);
			
//select brand
			WebElement arrow1=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement searchBrand1=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand1.sendKeys("auto demo");
			WebElement selectBrand1=driver.findElement(By.xpath("//span[contains(text(),'Auto Demo')]"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(4000);
			
//verifying emails 
			WebElement emails=driver.findElement(By.xpath("(//div[@class='mat-chip-list-wrapper'])"));
			if(emails.isDisplayed()) {
				System.out.println("All emails are copied");
			}
			else {
				System.out.println("All emails are not copied");
			}
			
//select brand
			WebElement arrow2=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow2);
			Thread.sleep(3000);
			WebElement searchBrand2=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand2.sendKeys("titan");
			WebElement selectBrand2=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", selectBrand2);
			Thread.sleep(4000);
			
//import email button
			WebElement importEmailButton=driver.findElement(By.xpath("//span[contains(text(),'Import Emails')]"));
			js.executeScript("arguments[0].click()", importEmailButton);
			Thread.sleep(3000);
			WebElement sourceBrand=driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
			js.executeScript("arguments[0].click()", sourceBrand);
			Thread.sleep(3000);
			sourceBrand.sendKeys("renault");
			Thread.sleep(2000);
			WebElement selectBrand3=driver.findElement(By.xpath("//span[contains(text(),'Renault')]"));
			selectBrand3.click();
			//js.executeScript("arguments[0].click()", selectBrand3);
			Thread.sleep(3000);
			WebElement saveButon2=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButon2);
			Thread.sleep(4000);
			
			System.out.println("Emails are Imported");
			
//select brand
			WebElement arrow3=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow3);
			Thread.sleep(3000);
			WebElement searchBrand3=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand3.sendKeys("renault");
			WebElement selectBrand4=driver.findElement(By.xpath("//span[contains(text(),'Renault')]"));
			js.executeScript("arguments[0].click()", selectBrand4);
			Thread.sleep(4000);
			
//verifying emails 
			WebElement emails1=driver.findElement(By.xpath("(//div[@class='mat-chip-list-wrapper'])"));
			if(emails1.isDisplayed()) {
				System.out.println("Emails are present");
			}
			else {
				System.out.println("Emails are not present");
			}
			
			
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
