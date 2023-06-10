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

public class LocobuzzLanguageFilterWorkProcess {

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

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),' Accounts')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void languageFilterProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);
			
//language filter
			WebElement languageFilter = driver.findElement(By.xpath("//span[contains(text(),'Language Filter')]"));
			js.executeScript("arguments[0].click()", languageFilter);
			Thread.sleep(3000);
			
//language filter information
			WebElement languageFilterHeading = driver.findElement(By.xpath("//p[contains(text(),'Language Filter ')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (languageFilterHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Language Filter Information is displayed");
			} else {
				System.out.println("Language Filter Information is not displayed");
			}
			
//select brand
			WebElement selectBrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[1]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);
			WebElement searchBrand=driver.findElement(By.xpath("//input[@id='searchTextBrand']"));
			searchBrand.sendKeys("titan");
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(2000);
			
//add keyword
			WebElement keyword=driver.findElement(By.xpath("//input[@id='clearInputKeywords']"));
			keyword.sendKeys("viagra");
			keyword.sendKeys(Keys.ENTER);
			keyword.sendKeys("son of bitch");
			keyword.sendKeys(Keys.ENTER);
			
//save keyword
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save Keywords')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(2000);
			
			System.out.println("Adding Keywords Successfully");
			
//keywords and phrases add heading
			WebElement keywordsorPhrasesHeading=driver.findElement(By.xpath("//h4[@class='text__label mb-0 colored__blue--dark']"));
			if(keywordsorPhrasesHeading.isDisplayed()) {
				System.out.println("Keywords and Phrases Added Heading is displayed");
			}
			else {
				System.out.println("Keywords and Phrases Added Heading is not  displayed");
			}
			
//sort
			WebElement sortIcon=driver.findElement(By.xpath("//mat-icon[contains(text(),'sort ')]"));
			if(sortIcon.isDisplayed()) {
				System.out.println("Sort Icon is displayed");
			}
			else {
				System.out.println("Sort Icon is not  displayed");
			}
			
//delete
			WebElement deleteIcon=driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]"));
			WebElement deleteButton=driver.findElement(By.xpath("//span[contains(text(),'Delete All')]"));
			if(deleteIcon.isDisplayed()&& deleteButton.isDisplayed()) {
				System.out.println("Delete button is displayed");
			}
			else {
				System.out.println("Delete button is not displayed");
			}
			
//rows
			WebElement rowsHeading=driver.findElement(By.xpath("//p[@class='text__light mb-0']"));
			WebElement rowsField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement arrow1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			if(rowsHeading.isDisplayed()&&rowsField.isDisplayed()&&arrow1.isDisplayed()) {
				System.out.println("Rows field is displayed");
			}
			else {
				System.out.println("Rows field is not displayed");
			}
			
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
