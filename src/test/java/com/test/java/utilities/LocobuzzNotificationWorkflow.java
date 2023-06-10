package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzNotificationWorkflow {

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

	public static void notificationProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv listening settings
			WebElement advListeningSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			js.executeScript("arguments[0].click()", advListeningSettings);
			Thread.sleep(3000);

//notification
			WebElement notificationLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Notification.svg']"));
			WebElement notification = driver.findElement(By.xpath("//span[contains(text(),'Notification')]"));
			js.executeScript("arguments[0].click()", notification);
			Thread.sleep(3000);

//campagin tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement campaginNotificationTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Campaign Notification')])[1]"));
			js.executeScript("arguments[0].click()", campaginNotificationTab);
			Thread.sleep(3000);

//campagin information
			WebElement campaginHeading = driver
					.findElement(By.xpath("(//p[contains(text(),'Campaign Notification')])"));
			WebElement information = driver
					.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[1]"));
			if (campaginHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Campagin Notification information is displayed");
			} else {
				System.out.println("Campagin Notification information is not displayed");
			}

//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			searchBrand.sendKeys("titan");
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);

//Email Address To
			WebElement emailAddressTo = driver.findElement(By.xpath("(//input[@placeholder='Search Email Id'])[1]"));
			js.executeScript("arguments[0].click()", emailAddressTo);
			Thread.sleep(3000);
			WebElement emailTo = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' locotest@locobuzz.com ']"));
			js.executeScript("arguments[0].click()", emailTo);
			Thread.sleep(3000);

//Email Address Cc
			WebElement emailAddressCc = driver.findElement(By.xpath("(//input[@placeholder='Search Email Id'])[2]"));
			js.executeScript("arguments[0].click()", emailAddressCc);
			Thread.sleep(3000);
			WebElement emailCc = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' ekta.joshi@locobuzz.com ']"));
			js.executeScript("arguments[0].click()", emailCc);
			Thread.sleep(3000);

//Email Address Bcc
			WebElement emailAddressBcc = driver.findElement(By.xpath("(//input[@placeholder='Search Email Id'])[3]"));
			js.executeScript("arguments[0].click()", emailAddressBcc);
			Thread.sleep(3000);
			WebElement emailBcc = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' kkkkktp@locobuzz.com ']"));
			js.executeScript("arguments[0].click()", emailBcc);
			Thread.sleep(3000);
			
//note
			WebElement noteMessage = driver.findElement(By.xpath("//p[@class='text__sm font-weight-500 mt-5 mb-14']"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note message is displayed");
			} else {
				System.out.println("Note message is not displayed");
			}
			
//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
			System.out.println("Emails saved Successfully");
			
//copy emails
			WebElement copyButton=driver.findElement(By.xpath("(//span[contains(text(),'Copy Emails')])[1]"));
			js.executeScript("arguments[0].click()", copyButton);
			Thread.sleep(3000);
			
			WebElement searchBrands=driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
			searchBrands.sendKeys("auto demo");
			//js.executeScript("arguments[0].click()", searchBrands);
			Thread.sleep(3000);
			
			WebElement selectBrand=driver.findElement(By.xpath("//span[@class='ml-11 font-weight-500' and text()='Auto Demo']"));
			selectBrand.click();
			//js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
			WebElement save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", save);
			Thread.sleep(3000);
			
			System.out.println("Copied Emails  Successfully");
			
//select brand
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement searchBrand1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			searchBrand1.sendKeys("auto demo");
			WebElement brand1 = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
			js.executeScript("arguments[0].click()", brand1);
			Thread.sleep(5000);
			
			brandpostProcess(driver);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void brandpostProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//brandpost notification tab
			WebElement pushpin1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement brandPostTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Brand Post Notification')])[1]"));
			js.executeScript("arguments[0].click()", brandPostTab);
			Thread.sleep(3000);
			
//brandpost information
			WebElement heading = driver.findElement(By.xpath(
					"(//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title'])[2]"));
			WebElement information1 = driver
					.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[2]"));
			if (heading.isDisplayed() && information1.isDisplayed()) {
				System.out.println("Brand Post Information is displayed");
			} else {
				System.out.println("Brand Post Information is not displayed");
			}
			
//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			searchBrand.sendKeys("titan");
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			
//Email Address To
			WebElement emailAddressTo = driver.findElement(By.xpath("(//input[@placeholder='Search Email Id'])[4]"));
			js.executeScript("arguments[0].click()", emailAddressTo);
			Thread.sleep(3000);
			WebElement emailTo = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' saima.khan@locobuzz.com ']"));
			js.executeScript("arguments[0].click()", emailTo);
			Thread.sleep(3000);

//Email Address Cc
			WebElement emailAddressCc = driver.findElement(By.xpath("(//input[@placeholder='Search Email Id'])[5]"));
			js.executeScript("arguments[0].click()", emailAddressCc);
			Thread.sleep(3000);
			WebElement emailCc = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' smeet.par@gmail.com ']"));
			js.executeScript("arguments[0].click()", emailCc);
			Thread.sleep(3000);

//Email Address Bcc
			WebElement emailAddressBcc = driver.findElement(By.xpath("(//input[@placeholder='Search Email Id'])[6]"));
			js.executeScript("arguments[0].click()", emailAddressBcc);
			Thread.sleep(3000);
			WebElement emailBcc = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' kkkkktp@locobuzz.com ']"));
			js.executeScript("arguments[0].click()", emailBcc);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
			System.out.println("Emails saved Successfully");
			
//copy emails
			WebElement copyButton=driver.findElement(By.xpath("(//span[contains(text(),'Copy Emails')])[2]"));
			js.executeScript("arguments[0].click()", copyButton);
			Thread.sleep(3000);
			
			WebElement searchBrands=driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
			searchBrands.sendKeys("auto demo");
			//js.executeScript("arguments[0].click()", searchBrands);
			Thread.sleep(3000);
			
			WebElement selectBrand=driver.findElement(By.xpath("//span[@class='ml-11 font-weight-500' and text()='Auto Demo']"));
			selectBrand.click();
			//js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
			WebElement save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", save);
			Thread.sleep(3000);
			
			System.out.println("Copied Emails  Successfully");
			
//select brand
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement searchBrand1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			searchBrand1.sendKeys("auto demo");
			WebElement brand1 = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
			js.executeScript("arguments[0].click()", brand1);
			Thread.sleep(5000);
			
			

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
