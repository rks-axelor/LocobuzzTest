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

public class LocobuzzAdvanceTicketSettingsWorkflow {
	
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
	
	public static void advanceTicketSettingProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//adv.response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);
			
//advance ticket settings
			WebElement advTicketSettingLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Advanced Ticket Setting.svg']"));
			WebElement advTicketSetting = driver
					.findElement(By.xpath("//span[contains(text(),'Advance Ticket Setting')]"));		
			js.executeScript("arguments[0].scrollIntoView()", advTicketSetting);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", advTicketSetting);
			Thread.sleep(3000);
			
//advance ticket settings tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement advTicketSettingTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Advance Email Ticket Setting')])[1]"));
			js.executeScript("arguments[0].click()", advTicketSettingTab);
			Thread.sleep(3000);
			
//advance ticket settings information
			WebElement advTicketSettingHeading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement advTicketSettingInfo = driver
					.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (advTicketSettingHeading.isDisplayed() && advTicketSettingInfo.isDisplayed()) {
				System.out.println("Advance Ticket Setting Heading and Information are displayed");
			} else {
				System.out.println("Advance Ticket Setting Heading and Information are not displayed");
			}
			
//select brand
			WebElement arrow=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			arrow.click();
			//js.executeScript("arguments[0].click()", advTicketSettingTab);
			Thread.sleep(3000);
			WebElement searchBrand=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand.sendKeys("auto demo");
			WebElement selectBrand=driver.findElement(By.xpath("//span[contains(text(),'Auto Demo')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
//reopen ticket button
			WebElement reopenButton = driver.findElement(By.xpath("//div[contains(text(),' Reopen Ticket ')]"));
			js.executeScript("arguments[0].click()", reopenButton);
			Thread.sleep(3000);
			
//feature active button
			WebElement featureHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4 mr-12']"));
			WebElement activeButton = driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);
			
//ticket is closed reopen ticket
			WebElement ticketHeading = driver.findElement(By.xpath("(//p[@class='emailticket__body--title'])[1]"));
			WebElement ticketInfo = driver.findElement(By.xpath("(//p[@class='emailticket__body--subtitle'])[1]"));
			if (ticketHeading.isDisplayed() && ticketInfo.isDisplayed()) {
				System.out.println("Ticket is closed reopen ticket heading and information are displayed");
			} else {
				System.out.println("Ticket is closed reopen ticket heading and information are not displayed");
			}
			
//set time 
			WebElement setHours=driver.findElement(By.xpath("(//input[@type='number'])[1]"));
			setHours.clear();
			setHours.sendKeys("1");
			WebElement setMinutes=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			setMinutes.clear();
			setMinutes.sendKeys("5");
			
//reopen ticket directly closed ticket
			WebElement reopenTicketHeading = driver
					.findElement(By.xpath("(//p[@class='emailticket__body--title'])[2]"));
			WebElement reopenTicketInfo = driver
					.findElement(By.xpath("(//p[@class='emailticket__body--subtitle mb-15'])"));
			if (reopenTicketHeading.isDisplayed() && reopenTicketInfo.isDisplayed()) {
				System.out.println(
						"Reopen Ticket directly closed ticket heading,information  are displayed");	
			} else {
				System.out.println(
						"Reopen Ticket directly closed ticket heading,information  are not displayed");			
			}
			
			WebElement radioButton=driver.findElement(By.xpath("//span[contains(text(),'Yes ')]"));
			js.executeScript("arguments[0].click()", radioButton);
			Thread.sleep(3000);
			
//custom settings
			WebElement customSettingsHeading=driver.findElement(By.xpath("(//p[@class='emailticket__body--title'])[3]"));
			WebElement customSettingsInfo=driver.findElement(By.xpath("(//p[@class='emailticket__body--subtitle'])[2]"));
			if(customSettingsHeading.isDisplayed()&&customSettingsInfo.isDisplayed()) {
				System.out.println("Custom Settings heading and information are displayed");
			}
			else {
				System.out.println("Custom Settings heading and information are not displayed");
			}
			
//customize button
			WebElement customizeButton=driver.findElement(By.xpath("//span[contains(text(),' Customize ')]"));
			js.executeScript("arguments[0].click()", customizeButton);
			Thread.sleep(3000);
			
//select channels
			WebElement selectChannelsHeading=driver.findElement(By.xpath("//h4[@class='text__label mb-0']"));
			WebElement selectChannelsInfo=driver.findElement(By.xpath("//p[contains(@class,'text__light--sm mb-7')]"));
			if(selectChannelsHeading.isDisplayed()&&selectChannelsInfo.isDisplayed()) {
				System.out.println("Select Channels information  are displayed");
			}
			else {
				System.out.println("Select Channels information  are not displayed");
			}
			
			WebElement arrow1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[3]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement channelName=driver.findElement(By.xpath("(//span[contains(text(),'Twitter')])[3]"));
			js.executeScript("arguments[0].click()", channelName);
			Thread.sleep(3000);
			WebElement channelName1=driver.findElement(By.xpath("(//span[contains(text(),'Facebook')])[2]"));
			js.executeScript("arguments[0].click()", channelName1);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//change the time  for twitter channel
			WebElement selectMinutes=driver.findElement(By.xpath("(//input[@type='number'])[6]"));
			selectMinutes.clear();
			selectMinutes.sendKeys("7");
			
			WebElement selectMinutes1=driver.findElement(By.xpath("(//input[@type='number'])[10]"));
			selectMinutes1.clear();
			selectMinutes1.sendKeys("7");
			
//change the time for facebook channel
			WebElement selectMinutes2=driver.findElement(By.xpath("(//input[@type='number'])[16]"));
			selectMinutes2.clear();
			selectMinutes2.sendKeys("7");
					
			WebElement selectMinutes3=driver.findElement(By.xpath("(//input[@type='number'])[20]"));
			selectMinutes3.clear();
			selectMinutes3.sendKeys("7");
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),' Done ')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			
//channels
			WebElement channels=driver.findElement(By.xpath("//div[@class='card__body grid']"));
			if(channels.isDisplayed()) {
				System.out.println("All channels are displayed");
			}
			else {
				System.out.println("All channels are not displayed");
			}
			
//save button
			WebElement saveButton1=driver.findElement(By.xpath("(//span[contains(text(),' Save ')])"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(3000);
			
//force read email button
			WebElement readEmailButton=driver.findElement(By.xpath("//div[contains(text(),' Force Read Email ')]"));
			js.executeScript("arguments[0].click()", readEmailButton);
			Thread.sleep(3000);
			
//feature active button for emails
			WebElement featureActiveButton=driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
			js.executeScript("arguments[0].click()", featureActiveButton);
			Thread.sleep(3000);
			
//selected channel for ticket actions
			WebElement selectedChannelHeading=driver.findElement(By.xpath("(//p[@class='emailticket__body--title'])[1]"));
			WebElement selectedChannelInfo=driver.findElement(By.xpath("(//p[@class='emailticket__body--subtitle'])[1]"));
			WebElement selectedChannel=driver.findElement(By.xpath("//div[@class='d-flex-items-center mt-8']"));
			if(selectedChannelHeading.isDisplayed()&&selectedChannelInfo.isDisplayed()&&selectedChannel.isDisplayed()) {
				System.out.println("Selected Channels information and channel are displayed");
			}
			else {
				System.out.println("Selected Channels information and channel are not displayed");
			}
			
//role wise
			WebElement rolewiseHeading=driver.findElement(By.xpath("(//p[@class='emailticket__body--title'])[2]"));
			WebElement rolewiseInfo=driver.findElement(By.xpath("(//p[@class='emailticket__body--subtitle'])[2]"));
			if(rolewiseHeading.isDisplayed()&&rolewiseInfo.isDisplayed()) {
				System.out.println("Role Wise heading and information are displayed");
			}
			else {
				System.out.println("Role Wise heading and information are not displayed");
			}
			
//role&active heading
			WebElement roleHeading=driver.findElement(By.xpath("//th[contains(text(),'Role')]"));
			WebElement activeHeading=driver.findElement(By.xpath("//th[contains(text(),' Active/Inactive ')]"));
			if(roleHeading.isDisplayed()&&activeHeading.isDisplayed()) {
				System.out.println("Role and Active/Inactive heading are displayed");
			}
			else {
				System.out.println("Role and Active/Inactive heading are not displayed");
			}
			
//active the csd
			WebElement csdActiveButton=driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[2]"));
			js.executeScript("arguments[0].click()", csdActiveButton);
			Thread.sleep(3000);
			
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
