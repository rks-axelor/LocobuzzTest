package com.test.java.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzCannedResponseWorkProcess {

	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),' Accounts')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void cannedResponseProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//response management
			WebElement responseManagement = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Response Management ')])[1]"));
			js.executeScript("arguments[0].click()", responseManagement);
			Thread.sleep(3000);

//canned Response
			WebElement cannedResponseLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Canned_Responses.svg']"));
			WebElement cannedResponse = driver
					.findElement(By.xpath("(//span[contains(text(),'Canned Responses')])[1]"));
			js.executeScript("arguments[0].click()", cannedResponse);
			Thread.sleep(3000);

//Canned Response Information
			WebElement cannedResponseHeading = driver
					.findElement(By.xpath("//p[contains(text(),'Canned Responses ')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (cannedResponseHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Setup Canned Response Information is displayed");
			} else {
				System.out.println("Setup Canned Response Information is not displayed");
			}
			Thread.sleep(2000);

//select brand
			WebElement selectBrand = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[1]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);
			WebElement searchBrand = driver.findElement(By.xpath("(//input[@id='brandSearchText'])"));
			searchBrand.sendKeys("ajio");
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(2000);

//add responses button
			WebElement addResponses = driver.findElement(By.xpath("//span[contains(text(),' Add Responses ')]"));
			js.executeScript("arguments[0].click()", addResponses);
			Thread.sleep(2000);

//add response category button
			WebElement addResponseCategory = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'add_circle_outline')]"));
			js.executeScript("arguments[0].click()", addResponseCategory);
			Thread.sleep(2000);

//response category name field
			WebElement responseCategoryNameField = driver.findElement(
					By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[4]"));
			responseCategoryNameField.sendKeys("Test6");
			Thread.sleep(2000);

//save button
			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			saveButton.click();
			// js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(4000);

//response name field
			WebElement responseNameField = driver.findElement(
					By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[3]"));
			responseNameField.sendKeys("Hey");
			Thread.sleep(2000);

//text area
			WebElement textArea = driver
					.findElement(By.xpath("//textarea[contains(@class,'textarea-featured__input')]"));
			textArea.sendKeys("Hello");
//personalize
			WebElement personalize = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", personalize);
			Thread.sleep(1000);
//fullname
			WebElement fullName = driver.findElement(By.xpath("//button[contains(text(),'Full Name')]"));
			js.executeScript("arguments[0].click()", fullName);
			Thread.sleep(1000);
			textArea.sendKeys("How is your day");

//save response button
			WebElement saveResponseButton = driver.findElement(By.xpath("//span[contains(text(),' Save Response ')]"));
			js.executeScript("arguments[0].click()", saveResponseButton);
			Thread.sleep(2000);

			System.out.println("Response Added Successfully");

//search 
			WebElement searchButton = driver.findElement(By.xpath("//input[@placeholder='Search Response Name']"));
			searchButton.sendKeys("Hey");
			WebElement searchIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchIcon);
			Thread.sleep(2000);

//select category
			WebElement categoryField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (categoryField.isDisplayed()) {
				System.out.println("Select Categories Field is displayed");
			} else {
				System.out.println("Select Categories Field is not displayed");
			}

//edit button
			WebElement editIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
			WebElement edit = driver.findElement(By.xpath("(//span[contains(text(),'Edit')])"));
			if (editIcon.isDisplayed() && edit.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			} else {
				System.out.println("Edit Button is not displayed");
			}

//delete button
			WebElement deleteIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])"));
			WebElement delete = driver.findElement(By.xpath("(//span[contains(text(),'Delete')])"));
			if (deleteIcon.isDisplayed() && delete.isDisplayed()) {
				System.out.println("Delete button is displayed");
			} else {
				System.out.println("Delete button is not displayed");
			}

//manage response category
			WebElement manageResponseCategoryButton = driver
					.findElement(By.xpath("(//span[contains(text(),' Manage Response Categories ')])"));
			js.executeScript("arguments[0].click()", manageResponseCategoryButton);
			Thread.sleep(2000);

//add response category
			WebElement addResponseCategory1 = driver
					.findElement(By.xpath("//span[contains(text(),'Add Response Categories')]"));
			js.executeScript("arguments[0].click()", addResponseCategory1);
			Thread.sleep(2000);
			WebElement responseName = driver.findElement(
					By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[4]"));
			responseName.sendKeys("Test2");
			WebElement saveButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			saveButton1.click();
			// js.executeScript("arguments[0].click()", saveButton1);

//search
			WebElement searchButton1 = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
			searchButton1.sendKeys("Test2");
			WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(1000);

//edit button
			WebElement editButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			if (editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			} else {
				System.out.println("Edit Button is not displayed");
			}

//delete button
			WebElement deleteButton = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),' delete_outline ')])[1]"));
			if (deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			} else {
				System.out.println("Delete Button is not displayed");
			}

//close button
			WebElement closeButton = driver.findElement(By.xpath("//span[contains(text(),' Close ')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
