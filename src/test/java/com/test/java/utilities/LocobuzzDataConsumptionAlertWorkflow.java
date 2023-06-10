package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzDataConsumptionAlertWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void dataConsumptionAlertProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//account settings
			WebElement accountSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Account Settings ')]"));
			js.executeScript("arguments[0].click()", accountSettings);
			Thread.sleep(3000);

//data consumption
			WebElement dataConsumptionLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Data_Consumption.svg']"));
			WebElement dataConsumption = driver.findElement(By.xpath("//span[contains(text(),'Data Consumption')]"));
			if (dataConsumptionLogo.isDisplayed() && dataConsumption.isDisplayed()) {
				System.out.println("Data Consumption Logo and label is displayed");
			} else {
				System.out.println("Data Consumption Logo and label is not displayed");
			}
			js.executeScript("arguments[0].click()", dataConsumption);
			Thread.sleep(3000);

//data consumption alert tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement dataConsumptionAlertTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Data Consumption Alert')])[1]"));
			js.executeScript("arguments[0].click()", dataConsumptionAlertTab);
			Thread.sleep(3000);

//data consumption alert(heading,information)
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Data Consumption Alert ')]"));
			WebElement info = driver
					.findElement(By.xpath("(//p[@class='mb-0 mt-6 text__light--sm font-weight-400'])[2]"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Data Consumption Alert heading,information are displayed");
			} else {
				System.out.println("Data Consumption Alert heading,information are not displayed");
			}

//data consumption emails/alerts heading
			WebElement alertsHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-12']"));
			if (alertsHeading.isDisplayed()) {
				System.out.println("Data Breach Alert/emails heading is displayed ");
			} else {
				System.out.println("Data Breach Alert/emails heading is not displayed ");
			}

//subject line tab
			WebElement subjectLine = driver.findElement(By.xpath("(//input[@type='string'])[1]"));
			if (subjectLine.isDisplayed()) {
				System.out.println("Subject line is displayed");
			} else {
				System.out.println("Subject line is not displayed");
			}

//emails
			WebElement emails = driver.findElement(By.xpath("(//input[@placeholder='Search email'])[1]"));
			js.executeScript("arguments[0].click()", emails);
			Thread.sleep(3000);
			WebElement selectEmail = driver.findElement(By.xpath("//span[contains(text(),' locotest@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", emails);
			Thread.sleep(3000);
			WebElement selectEmail1 = driver
					.findElement(By.xpath("//span[contains(text(),' saima.khan@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail1);
			Thread.sleep(3000);

//usage alert
			WebElement selectUsageAlert = driver.findElement(By.xpath(
					"(//input[contains(@class,'mat-autocomplete-trigger mat-chip-input mat-input-element ')])[2]"));
			js.executeScript("arguments[0].click()", selectUsageAlert);
			Thread.sleep(3000);
			WebElement selectUsageLimit = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' 10% ']"));
			js.executeScript("arguments[0].click()", selectUsageLimit);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", selectUsageAlert);
			Thread.sleep(3000);
			WebElement selectUsageLimit1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' 25% ']"));
			js.executeScript("arguments[0].click()", selectUsageLimit1);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", selectUsageAlert);
			Thread.sleep(3000);
			WebElement selectUsageLimit2 = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' 60% ']"));
			js.executeScript("arguments[0].click()", selectUsageLimit2);
			Thread.sleep(3000);

//daily alert heading and toggle button
			WebElement dailyAlertHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-0']"));
			WebElement toggle = driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			if (dailyAlertHeading.isDisplayed() && toggle.isDisplayed()) {
				System.out.println("Daily Alert Heading & toggle button are displayed");
			} else {
				System.out.println("Daily Alert Heading & toggle button are not displayed");
			}
			js.executeScript("arguments[0].click()", toggle);
			Thread.sleep(3000);

//subject line tab
			WebElement subjectLine1 = driver.findElement(By.xpath("(//input[@type='string'])[2]"));
			if (subjectLine1.isDisplayed()) {
				System.out.println("Subject line is displayed");
			} else {
				System.out.println("Subject line is not displayed");
			}

//emails
			WebElement email = driver.findElement(By.xpath("(//input[@placeholder='Search email'])[2]"));
			js.executeScript("arguments[0].click()", email);
			Thread.sleep(3000);
			WebElement selectEmails = driver.findElement(By.xpath("//span[contains(text(),' smeet.par@gmail.com ')]"));
			js.executeScript("arguments[0].click()", selectEmails);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", email);
			Thread.sleep(3000);
			WebElement selectEmails1 = driver
					.findElement(By.xpath("//span[contains(text(),' anuradha.navalkar@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmails1);
			Thread.sleep(3000);

//daily notification alert
			WebElement dailyNotificationAlertHeading = driver
					.findElement(By.xpath("(//p[@class='font-weight-600 mb-4'])[2]"));
			WebElement dailyNotificationAlertInfo = driver
					.findElement(By.xpath("(//p[@class='text__sm text__sub mb-14'])"));
			if (dailyNotificationAlertHeading.isDisplayed() && dailyNotificationAlertInfo.isDisplayed()) {
				System.out.println("Daily Notification Alert heading and information are displayed");
			} else {
				System.out.println("Daily Notification Alert heading and information are not displayed");
			}

//first notificaion time
			WebElement timerlogo = driver.findElement(By.xpath("(//mat-icon[contains(text(),' query_builder ')])[1]"));
			js.executeScript("arguments[0].click()", timerlogo);
			Thread.sleep(3000);
			WebElement selectTime = driver.findElement(
					By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-item') and text()=' 10:00 AM']"));
			js.executeScript("arguments[0].click()", selectTime);
			Thread.sleep(3000);
			
//second notication time
			WebElement secondNotificationTime=driver.findElement(By.xpath("//span[contains(text(),'Second Notification Time')]"));
			js.executeScript("arguments[0].click()", secondNotificationTime);
			Thread.sleep(3000);
			WebElement timerlogo1=driver.findElement(By.xpath("(//mat-icon[contains(text(),' query_builder ')])[2]"));
			js.executeScript("arguments[0].click()", timerlogo1);
			Thread.sleep(3000);
			WebElement selectTime1 = driver.findElement(
					By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-item') and text()=' 06:00 PM ']"));
			js.executeScript("arguments[0].click()", selectTime1);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save Settings ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
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
