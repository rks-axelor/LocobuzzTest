package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzQueueConfigAgentSettingsUIComponents {
	
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
	
	public static void verifyingQueueConfigurationAgentSettingsComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//response management
			WebElement responseManagement = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Response Management ')])[1]"));
			if (responseManagement.isDisplayed()) {
				System.out.println("Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", responseManagement);
			Thread.sleep(3000);
			
//queue management
			WebElement queueManagementLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Queue_Configuration.svg']"));
			WebElement queueManagement = driver.findElement(By.xpath("//span[contains(text(),'Queue Configuration')]"));
			if (queueManagementLogo.isDisplayed() && queueManagement.isDisplayed()) {
				System.out.println("Queue Management is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Queue Management is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", queueManagement);
			Thread.sleep(3000);
			
//advance settings viewing option tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement advanceSettings=driver.findElement(By.xpath("(//span[contains(text(),'Advance Ticket Viewing Options')])[1]"));
			if(pushpin.isDisplayed()&&advanceSettings.isDisplayed()) {
				System.out.println("Advance Settings viewing option tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Advance Settings viewing option tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}
			js.executeScript("arguments[0].click()", advanceSettings);
			Thread.sleep(3000);
			
//advance settings viewing option heading
			WebElement heading=driver.findElement(By.xpath("(//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title'])[2]"));
			WebElement info=driver.findElement(By.xpath("(//p[@class='mb-0 mt-6 text__light--sm font-weight-400'])[2]"));
			if(heading.isDisplayed()&&info.isDisplayed()) {
				System.out.println("Heading and information are displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Heading and information are not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
//unassigned tickets
			WebElement unassignedHeading=driver.findElement(By.xpath("(//p[@class='title' and text()='View/Action Unassigned Ticket'])"));
			WebElement toggleButton=driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
			WebElement unassignedInfo=driver.findElement(By.xpath("(//div[@class='advanceTicketView__card--body text__sub--sm'])[1]"));
			if(unassignedHeading.isDisplayed()&&toggleButton.isDisplayed()&&unassignedInfo.isDisplayed()) {
				System.out.println("Unassigned tickets heading,information and toggle button are displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Unassigned tickets heading,information and toggle button are not displayed");
				componentsInformation.add(4, "Not Present");
			}
			
//ticket reassignment
			WebElement reassignHeading=driver.findElement(By.xpath("(//p[@class='title' and text()='Agent Ticket Reassignment'])"));
			WebElement toggleButton1=driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[2]"));
			WebElement reassignInfo=driver.findElement(By.xpath("(//div[@class='advanceTicketView__card--body text__sub--sm'])[2]"));
			if(reassignHeading.isDisplayed()&&toggleButton1.isDisplayed()&&reassignInfo.isDisplayed()) {
				System.out.println("Reassignment heading,information and toggle button are displayed");
				componentsInformation.add(5, "Present");
			}
			else {
				System.out.println("Reassignment heading,information and toggle button are not displayed");
				componentsInformation.add(5, "Not Present");
			}
			
//ticket viewing
			WebElement ticketViewingHeading=driver.findElement(By.xpath("(//p[@class='title' and text()='Advance Ticket Viewing Options'])"));
			WebElement toggleButton2=driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[3]"));
			WebElement ticketVewingInfo=driver.findElement(By.xpath("(//div[@class='advanceTicketView__card--body text__sub--sm'])[3]"));
			if(ticketViewingHeading.isDisplayed()&&toggleButton2.isDisplayed()&&ticketVewingInfo.isDisplayed()) {
				System.out.println("Ticket Vewing heading,information and toggle button are displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Ticket Vewing heading,information and toggle button are not displayed");
				componentsInformation.add(6, "Not Present");
			}
			
			
			componentsInformation.add(7, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "QueueConfigAgentSettingUICompon");
			
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
