package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzDataConsumptionAlertUIComponents {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void verifyingDataConsumptionAlertComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//account settings
			WebElement accountSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Account Settings ')]"));
			if (accountSettings.isDisplayed()) {
				System.out.println("Account Settings is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Account Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", accountSettings);
			Thread.sleep(3000);

//data consumption
			WebElement dataConsumptionLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Data_Consumption.svg']"));
			WebElement dataConsumption = driver.findElement(By.xpath("//span[contains(text(),'Data Consumption')]"));
			if (dataConsumptionLogo.isDisplayed() && dataConsumption.isDisplayed()) {
				System.out.println("Data Consumption Logo and label is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Data Consumption Logo and label is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", dataConsumption);
			Thread.sleep(3000);

//data consumption alert tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement dataConsumptionAlertTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Data Consumption Alert')])[1]"));
			if (pushpin.isDisplayed() && dataConsumptionAlertTab.isDisplayed()) {
				System.out.println("Data Consumption Alert Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Data Consumption Alert Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}
			js.executeScript("arguments[0].click()", dataConsumptionAlertTab);
			Thread.sleep(3000);

//data consumption alert(heading,information)
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Data Consumption Alert ')]"));
			WebElement info = driver
					.findElement(By.xpath("(//p[@class='mb-0 mt-6 text__light--sm font-weight-400'])[2]"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Data Consumption Alert heading,information are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Data Consumption Alert heading,information are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//data consumption emails/alerts heading
			WebElement alertsHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-12']"));
			if (alertsHeading.isDisplayed()) {
				System.out.println("Data Breach Alert/emails heading is displayed ");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Data Breach Alert/emails heading is not displayed ");
				componentsInformation.add(4, "Not Present");
			}

//email tabs
			WebElement subjectLine = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement emailTab = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (subjectLine.isDisplayed() && emailTab.isDisplayed()) {
				System.out.println("Subject line and Email tab are displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Subject line and Email tab are not displayed");
				componentsInformation.add(5, "Not Present");
			}

//note message
			WebElement noteMessage = driver.findElement(By.xpath("//p[@class='text__sm font-weight-500 mb-20 mt-5']"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(6, "Not Present");
			}
			
//usage alert
			WebElement usageAlertHeading=driver.findElement(By.xpath("(//p[@class='font-weight-600 mb-4'])[1]"));
			WebElement usageAlertInfo=driver.findElement(By.xpath("(//p[@class='text__light--sm mb-8'])"));
			WebElement usageAlertTab=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if(usageAlertHeading.isDisplayed()&&usageAlertInfo.isDisplayed()&&usageAlertTab.isDisplayed()) {
				System.out.println("Usage Alert heading,information,tab are displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Usage Alert heading,information,tab are not displayed");
				componentsInformation.add(7, "Not Present");
			}
			
//daily alert heading and toggle button
			WebElement dailyAlertHeading=driver.findElement(By.xpath("//p[@class='font-weight-600 mb-0']"));
			WebElement toggle=driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			if(dailyAlertHeading.isDisplayed()&&toggle.isDisplayed()) {
				System.out.println("Daily Alert Heading & toggle button are displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Daily Alert Heading & toggle button are not displayed");
				componentsInformation.add(8, "Not Present");
			}
			js.executeScript("arguments[0].click()", toggle);
			Thread.sleep(3000);
			
//subject line and email tab
			WebElement subjectLine1=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			WebElement emailTab1=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			if(subjectLine1.isDisplayed()&&emailTab1.isDisplayed()) {
				System.out.println("Subject Line and Email Tab are displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Subject Line and Email Tab are not displayed");
				componentsInformation.add(9, "Not Present");
			}
			
//note message
			WebElement noteMessage1=driver.findElement(By.xpath("//p[@class='text__sm font-weight-500 mt-5 mb-20']"));
			if(noteMessage1.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(10, "Not Present");
			}
			
//daily notification alert
			WebElement dailyNotificationAlertHeading=driver.findElement(By.xpath("(//p[@class='font-weight-600 mb-4'])[2]"));
			WebElement dailyNotificationAlertInfo=driver.findElement(By.xpath("(//p[@class='text__sm text__sub mb-14'])"));
			if(dailyNotificationAlertHeading.isDisplayed()&&dailyNotificationAlertInfo.isDisplayed()) {
				System.out.println("Daily Notification Alert heading and information are displayed");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Daily Notification Alert heading and information are not displayed");
				componentsInformation.add(11, "Not Present");
			}
			
//first notificaion time
			WebElement firstNotificationTime=driver.findElement(By.xpath("(//p[@class='font-weight-600 mb-8 mt-6'])"));
			WebElement firstNotificationTab=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			WebElement timerlogo=driver.findElement(By.xpath("(//mat-icon[contains(text(),' query_builder ')])[1]"));
			if(firstNotificationTime.isDisplayed()&&firstNotificationTab.isDisplayed()&&timerlogo.isDisplayed()) {
				System.out.println("First Notification Time is displayed");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("First Notification Time is not displayed");
				componentsInformation.add(12, "Not Present");
			}
			
//second notication time
			WebElement secondNotificationTime=driver.findElement(By.xpath("//span[contains(text(),'Second Notification Time')]"));
			WebElement secondNotificationTab=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[9]"));
			WebElement timerlogo1=driver.findElement(By.xpath("(//mat-icon[contains(text(),' query_builder ')])[2]"));
			if(secondNotificationTime.isDisplayed()&&secondNotificationTab.isDisplayed()&&timerlogo1.isDisplayed()) {
				System.out.println("Second Notification Time is displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("Second Notification Time is not displayed");
				componentsInformation.add(13, "Not Present");
			}
			
//cancel changes button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel Changes ')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save Settings ')]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}
			//js.executeScript("arguments[0].click()", saveButton);
			//Thread.sleep(3000);
			
			componentsInformation.add(16,CommonFunctions.getDataTime());			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"DataConsumptionAlertUIComponent");
			
//logout
			WebElement expand=driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);
			Thread.sleep(2000);
			
			WebElement logout=driver.findElement(By.xpath("//button[contains(text(),' Logout ')]"));
			js.executeScript("arguments[0].click()", logout);
			Thread.sleep(2000);
			
			WebElement confirmLogout=driver.findElement(By.xpath("//span[contains(text(),' Logout ')]"));
			if (confirmLogout.isDisplayed()) {
				js.executeScript("arguments[0].click()", confirmLogout);
				System.out.println("Logout Successful");
			} else {
				System.out.println("Logout Not Successful");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
