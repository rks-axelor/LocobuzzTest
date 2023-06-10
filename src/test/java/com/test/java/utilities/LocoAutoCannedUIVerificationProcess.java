package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoAutoCannedUIVerificationProcess {
	public static List<String> componentsInformation = new ArrayList<String>();

	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//img[@src='assets/images/Locobuzz_Symbol.svg']"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("//mat-icon[contains(text(),'expand_less')]"));
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
	
	public static void verifyingAutoCannedUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Premium Features
			WebElement premium=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Premium Features')]"));
			if(premium.isDisplayed()) {
				System.out.println("Premium Features is displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Premium Features is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", premium);
			Thread.sleep(3000);
			
//Automated Canned Response Label in Account Section
			WebElement autocannedlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Automated_Canned_Responses.svg']"));
			WebElement autocannedlabel=driver.findElement(By.xpath("(//span[contains(text(),'Automated Canned Responses')])"));
			if(autocannedlogo.isDisplayed()&&autocannedlabel.isDisplayed()) {
				System.out.println("Automated Canned Response Label in Account Section is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Automated Canned Response Label in Account Section is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", autocannedlabel);
			Thread.sleep(3000);
			
//Automated Canned Response Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement autocannedtabtab=driver.findElement(By.xpath("(//span[contains(text(),'Automated Canned Responses')])[2]"));
			if(pushpin.isDisplayed()&&autocannedtabtab.isDisplayed()) {
				System.out.println("Automated Canned Response Tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Automated Canned Response Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//Automated Canned Response Tab name and Information	

			WebElement ACHeading=driver.findElement(By.xpath("(//p[contains(text(),'Automated Canned Responses')])"));
			WebElement ACInformation=driver.findElement(By.xpath("(//p[contains(text(),'Automated Canned Responses')])//following::p[1]"));
			if(ACHeading.isDisplayed()&&ACInformation.isDisplayed()) {
				System.out.println("Automated Canned Response Tab name and Information is displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Automated Canned Response Tab name and Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
// Select Brand Field
			WebElement selectbrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[2]"));
			if(selectbrand.isDisplayed()) {
				System.out.println("Select Brand Field is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Select Brand Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(5000);

//search field
			WebElement searchField=driver.findElement(By.xpath("(//input[@data-placeholder='Search brand name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchField.isDisplayed()&&symbol.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(5, "Present");
			}
			else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", searchField);
			Thread.sleep(5000);

           Thread.sleep(3000);	

				
//Select Medlife Bot Brand
           WebElement medbot=driver.findElement(By.xpath("(//span[contains(text(),'Medlife Bot')])"));
			if(medbot.isDisplayed()) {
				System.out.println("Selected Medlife Bot Brand is displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Selected Medlife Bot Brand is not displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", medbot);
			Thread.sleep(5000);          

//Feature is active field 			
			WebElement Featurebutton=driver.findElement(By.xpath("(//p[contains(text(),'Feature is active')])"));
			WebElement togglebutton=driver.findElement(By.xpath("	(//label[contains(@class,'rounded-toggle-switch-label')])"));
		
			if(Featurebutton.isDisplayed() && togglebutton.isDisplayed() ) {
				System.out.println("Feature is active field is present");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Feature is active field is not present");
				componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", togglebutton);
			System.out.println("Feature is active field is Disabled Sucessfully");
			Thread.sleep(5000);
			js.executeScript("arguments[0].click()", togglebutton);
			Thread.sleep(5000);
			System.out.println("Feature is active field is Enabled Sucessfully");

//View all conversation			
			WebElement Eyeicon=driver.findElement(By.xpath("//mat-icon[contains(text(),'visibility')]"));
			WebElement Information=driver.findElement(By.xpath("//span[contains(text(),'View all conversation')]"));
			if(Eyeicon.isDisplayed() &&  Information.isDisplayed()){
				System.out.println("View all conversation field is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("View all conversation field is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			


			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(9, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "AutoCannedResponseUIComponents");
					
				
			
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
	

