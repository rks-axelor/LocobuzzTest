package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzTeamManagementUIComponents {
	
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
	
	public static void verifyingTeamManagementComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//response teams
			WebElement responseTeam=driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Response Teams ')]"));
			if(responseTeam.isDisplayed()) {
				System.out.println("Response Team is displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Response Team is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", responseTeam);
			Thread.sleep(3000);
			
//team management
			WebElement teamManagementLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Team_Management.svg']"));
			WebElement teamManagement=driver.findElement(By.xpath("//span[contains(text(),'Team Management')]"));
			if(teamManagementLogo.isDisplayed()&&teamManagement.isDisplayed()) {
				System.out.println("Team Management is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Team Management is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", teamManagement);
			Thread.sleep(3000);
			
//TM tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tmTab=driver.findElement(By.xpath("(//span[contains(text(),'Team Management')])[2]"));
			if(pushpin.isDisplayed()&&tmTab.isDisplayed()) {
				System.out.println("Team Management Tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Team Management Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}
			
//TM information
			WebElement tmHeading=driver.findElement(By.xpath("(//p[contains(text(),'Team Management')])"));
			WebElement infromation=driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])"));
			if(tmHeading.isDisplayed()&&infromation.isDisplayed()) {
				System.out.println("Team Management Infromation is displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Team Management Infromation is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
//search field
			WebElement searchField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchField.isDisplayed()&&symbol.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			
//filter
			WebElement filter=driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt ')])"));
			if(filter.isDisplayed()) {
				System.out.println("Filter is displayed");
				componentsInformation.add(5, "Present");
			}
			else {
				System.out.println("Filter is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			
//create team
			WebElement createTeam=driver.findElement(By.xpath("(//span[contains(text(),'Create Team ')])"));
			if(createTeam.isDisplayed()) {
				System.out.println("Create Team is displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Create Team is not  displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", createTeam);
			Thread.sleep(3000);
			
//add team heading
			WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Add Team')]"));
			if(heading.isDisplayed()) {
				System.out.println("Add Team Heading is displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Add Team Heading is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			
//Team Name Field
			WebElement teamNameField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if(teamNameField.isDisplayed()) {
				System.out.println("Team Name Field is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Team Name Field is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			
//team types field
			WebElement teamTypesField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if(teamTypesField.isDisplayed()) {
				System.out.println("Team Types Field is displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Team Types Field is not displayed");
				componentsInformation.add(9, "Not Present");
			}
			
//team leader field
			WebElement teamLeaderField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			if(teamLeaderField.isDisplayed()) {
				System.out.println("Team Leader Field is displayed");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Team Leader Field is not displayed");
				componentsInformation.add(10, "Not Present");
			}
			
//note
			WebElement note=driver.findElement(By.xpath("//p[@class='text__sm font-weight-500 mt-5 mb-20']"));
			if(note.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(11, "Not Present");
			}
			
//team members list field
			WebElement teamMembersField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			if(teamMembersField.isDisplayed()) {
				System.out.println("Team Members List Field is displayed");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Team Members List Field is not  displayed");
				componentsInformation.add(12, "Not Present");
			}
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(13, "Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save Team ')]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			
//close button
			WebElement closeButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if(closeButton.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(16, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "TeamManagementUIComponent");
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
