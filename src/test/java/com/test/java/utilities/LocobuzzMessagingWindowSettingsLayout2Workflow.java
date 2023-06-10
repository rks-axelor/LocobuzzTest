package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzMessagingWindowSettingsLayout2Workflow {
	
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
	
	public static void verifyingMessagingWindowSettingsWorkflow(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);

//messaging window settings
			WebElement messagingWindowSettingsLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Messaging_Window_Settings.svg']"));
			WebElement messagingWindowSettings = driver
					.findElement(By.xpath("//span[contains(text(),'Messaging Window Settings')]"));
			js.executeScript("arguments[0].click()", messagingWindowSettings);
			Thread.sleep(3000);

//messaging window settings information 
			WebElement messagingWindowSettingsHeading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement information = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (messagingWindowSettingsHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Messaging Window Settings Information is displayed");
			} else {
				System.out.println("Messaging Window Settings Information is not displayed");
			}

//select brand
			WebElement selectBrand = driver.findElement(By.xpath("//div[contains(@class,'mat-select-value')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);
			WebElement searchBrand = driver.findElement(By.xpath("//input[@id='searchTextBrand']"));
			searchBrand.sendKeys("titan");
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(2000);
			
//layout
			WebElement layoutStyleHeading = driver
					.findElement(By.xpath("//span[@class='mr-10' and contains(text(),'Layout Style')]"));
			WebElement Layout = driver
					.findElement(By.xpath("//img[@src='assets/images/account/chat_settings_layout_02.svg']"));
			js.executeScript("arguments[0].click()", Layout);
			Thread.sleep(2000);
			
//select the channel
			WebElement selectChannelHeading = driver
					.findElement(By.xpath("//p[@class='chatwinset__body--left-title']"));
			if (selectChannelHeading.isDisplayed()) {
				System.out.println("Select channel Heading is displayed");
			} else {
				System.out.println("Select channel Heading is not displayed");
			}

//clicking the checkboxes

			WebElement checkbox = driver.findElement(By.xpath(
					"(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]"));
			js.executeScript("arguments[0].click()", checkbox);
			Thread.sleep(2000);

			WebElement checkbox1 = driver.findElement(By.xpath(
					"(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]"));
			js.executeScript("arguments[0].click()", checkbox1);
			Thread.sleep(2000);

			WebElement checkbox2 = driver.findElement(By.xpath(
					"(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]"));
			js.executeScript("arguments[0].click()", checkbox2);
			Thread.sleep(2000);

			WebElement checkbox3 = driver.findElement(By.xpath(
					"(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[4]"));
			js.executeScript("arguments[0].click()", checkbox3);
			Thread.sleep(2000);
			
//preview
			WebElement preview=driver.findElement(By.xpath("//div[contains(@class,'chatwindow bg__white')]"));
			if(preview.isDisplayed()) {
				System.out.println("Preview is displayed");
			}
			else {
				System.out.println("Preview is not displayed");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(2000);
			
			WebElement clickButton=driver.findElement(By.xpath("//span[@class='colored__locobuzz cursor-pointer' and text()='click here']"));
			js.executeScript("arguments[0].click()", clickButton);
			Thread.sleep(7000);
			
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(4000);
			
//select brand
			//driver.navigate().refresh();
			Thread.sleep(10000);
			WebElement brand1 = driver.findElement(By.xpath("(//span[contains(text(),' All ')])[2]"));
			js.executeScript("arguments[0].click()", brand1);
			WebElement unselectAll=driver.findElement(By.xpath("(//span[contains(text(),' All ')])[3]"));
			js.executeScript("arguments[0].click()", unselectAll);
			Thread.sleep(3000);	
			WebElement brandName = driver.findElement(By.xpath("//input[@data-placeholder='Search brand']"));
			brandName.sendKeys("titan");
			WebElement selectBrand1 = driver.findElement(By.xpath("(//span[contains(text(),' Titan ')])"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(2000);
			WebElement applyButton=driver.findElement(By.xpath("(//span[contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(4000);
			
//chatbot 
			WebElement chatbot1 = driver.findElement(By.xpath("//img[@src='/assets/images/common/chat-bubble.svg']"));
			js.executeScript("arguments[0].click()", chatbot1);
			Thread.sleep(4000);
			
			WebElement closeButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'crop_din')]//following::mat-icon[contains(text(),'close')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
