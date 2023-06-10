package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzLanguageFilterUIComponents {

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

	public static void verifyingLanguageFilterComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			if (advResponseManagement.isDisplayed()) {
				System.out.println("Adv Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Adv Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);

//language filter
			WebElement languageFilterLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Language_Filter.svg']"));
			WebElement languageFilter = driver.findElement(By.xpath("//span[contains(text(),'Language Filter')]"));
			if (languageFilterLogo.isDisplayed() && languageFilter.isDisplayed()) {
				System.out.println("Language Filter is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Language Filter is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", languageFilter);
			Thread.sleep(3000);

//language filter tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement languageFilterTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Language Filter')])[2]"));
			if (pushpin.isDisplayed() && languageFilterTab.isDisplayed()) {
				System.out.println("Lnaguage Filter tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Lnaguage Filter tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//language filter information
			WebElement languageFilterHeading = driver.findElement(By.xpath("//p[contains(text(),'Language Filter ')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (languageFilterHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Language Filter Information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Language Filter Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//select brand
			WebElement selectbrand = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])"));
			if (selectbrand.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Select brand field is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Select brand field is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//search keyword
			WebElement searchKeyword = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement searchSymbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchKeyword.isDisplayed() && searchSymbol.isDisplayed()) {
				System.out.println("Search Keyword Field is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Search Keyword Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//add new keywords or phrases heading
			WebElement newKeywordHeading = driver
					.findElement(By.xpath("(//h4[contains(@class,'text__label colored__blue--dark mb-14')])"));
			if (newKeywordHeading.isDisplayed()) {
				System.out.println("Add New Keyword/Phrases Heading is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Add New Keyword/Phrases Heading is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//add keyword field
			WebElement addKeywordField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (addKeywordField.isDisplayed()) {
				System.out.println("Add Keyword Field is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Add Keyword Field is not displayed");
				componentsInformation.add(7, "Not Present");
			}

//save keyword
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save Keywords')]"));
			if (saveButton.isDisplayed()) {
				System.out.println("Save Keyword button is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Save Keyword button is not displayed");
				componentsInformation.add(8, "Not Present");
			}

//keywords present field
			WebElement keywordsPresentField = driver
					.findElement(By.xpath("//div[@class='border__light-grey border-radius-4 pr-5 pl-10']"));
			if (keywordsPresentField.isDisplayed()) {
				System.out.println("Keywords Present field is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Keywords Present field is not displayed");
				componentsInformation.add(9, "Not Present");
			}

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			componentsInformation.add(10, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "LanguageFilterUIComponents");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
