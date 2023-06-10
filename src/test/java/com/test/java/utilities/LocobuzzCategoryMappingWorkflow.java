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

public class LocobuzzCategoryMappingWorkflow {

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

	public static void categoryMappingWorkflow(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//Listening Settings
			WebElement ListeningSettings = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if (ListeningSettings.isDisplayed()) {
				System.out.println("Listening Settings is displayed");
			} else {
				System.out.println("Listening Settings is not displayed");
			}
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);

//category mapping
			WebElement categoryMappingLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Category_Mapping.svg']"));
			WebElement categoryMappingLabel = driver
					.findElement(By.xpath("//span[contains(text(),'Category Mapping')]"));
			if (categoryMappingLogo.isDisplayed() && categoryMappingLabel.isDisplayed()) {
				System.out.println("Category Mapping Logo and Label are displayed");
			} else {
				System.out.println("Category Mapping Logo and Label are not displayed");
			}
			js.executeScript("arguments[0].click()", categoryMappingLabel);
			Thread.sleep(3000);

//category mapping tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement categoryMappingTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Category Mapping')])[2]"));
			if (pushpin.isDisplayed() && categoryMappingTab.isDisplayed()) {
				System.out.println("Category Mapping tab is displayed");
			} else {
				System.out.println("Category Mapping tab is not displayed");
			}

//category mapping (heading,information)
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Category Mapping ')]"));
			WebElement info = driver.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Category mapping heading,information are displayed");
			} else {
				System.out.println("Category mapping heading,information are not displayed");
			}

//select category group
			WebElement categoryGroupSymbol = driver
					.findElement(By.xpath("(//img[@src='assets/images/account/map_gray.svg'])[2]"));
			WebElement categoryGroupName = driver.findElement(By.xpath("//span[contains(text(),'Testing123')]"));
			if (categoryGroupSymbol.isDisplayed()) {
				System.out.println("Category Group Symbol and name are displayed");
			} else {
				System.out.println("Category Group Symbol and name are not displayed");
			}
			js.executeScript("arguments[0].click()", categoryGroupName);
			Thread.sleep(3000);

//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),'Titan')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//select skip strict
			WebElement skipStrictButton = driver
					.findElement(By.xpath("(//label[@class='mat-tooltip-trigger rounded-toggle-switch-label'])[1]"));
			js.executeScript("arguments[0].click()", skipStrictButton);
			Thread.sleep(3000);

//create category name
			WebElement createCategoryButton = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Category ')]"));
			js.executeScript("arguments[0].click()", createCategoryButton);
			Thread.sleep(3000);
			WebElement categoryName = driver.findElement(By.xpath("//input[@formcontrolname='categoryName']"));
			categoryName.sendKeys("kalyantest5");
			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);

//select keyword

			WebElement keywordsTab = driver.findElement(By.xpath("//input[@placeholder='Enter keywords']"));
			keywordsTab.sendKeys("locotesting");
			keywordsTab.sendKeys(Keys.ENTER);
			keywordsTab.sendKeys("locotestteam");
			keywordsTab.sendKeys(Keys.ENTER);
			WebElement saveKeywordsButton = driver.findElement(By.xpath("//span[contains(text(),' Save Keywords ')]"));
			js.executeScript("arguments[0].click()", saveKeywordsButton);
			Thread.sleep(3000);
			
			WebElement confirm=driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", confirm);
			Thread.sleep(3000);
					

			/*WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);*/

//search category
			WebElement searchCategory = driver.findElement(By.xpath("//input[@placeholder='Search Category']"));
			searchCategory.sendKeys("kalyantest5");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search ')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

			WebElement expandPlus = driver.findElement(
					By.xpath("//mat-icon[contains(@class,'mat-icon notranslate colored__sub-text bottom-border')]"));
			js.executeScript("arguments[0].click()", expandPlus);
			Thread.sleep(3000);

//add sub category
			WebElement subCategoryButton = driver
					.findElement(By.xpath("//div[contains(text(), 'Create L2 category')]"));
			js.executeScript("arguments[0].click()", subCategoryButton);
			Thread.sleep(3000);
			WebElement subCategoryName = driver.findElement(By.xpath("//input[@formcontrolname='categoryName']"));
			subCategoryName.sendKeys("test cat");
			WebElement saveButton1 = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(3000);

//select keyword
			/*
			 * WebElement keywordsTab1 =
			 * driver.findElement(By.xpath("//input[@placeholder='Enter keywords']"));
			 * keywordsTab1.sendKeys("locotest"); keywordsTab1.sendKeys(Keys.ENTER);
			 * WebElement saveKeywordsButton1 =
			 * driver.findElement(By.xpath("//span[contains(text(),' Save Keywords ')]"));
			 * js.executeScript("arguments[0].click()", saveKeywordsButton1);
			 * Thread.sleep(3000);
			 */

			WebElement cancelButton1 = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			js.executeScript("arguments[0].click()", cancelButton1);
			Thread.sleep(3000);

//search category
			WebElement searchCategory1 = driver.findElement(By.xpath("//input[@placeholder='Search Category']"));
			searchCategory1.sendKeys("kalyantest5");
			WebElement searchButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search ')]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);

			WebElement expandPlus1 = driver.findElement(
					By.xpath("//mat-icon[contains(@class,'mat-icon notranslate colored__sub-text bottom-border')]"));
			js.executeScript("arguments[0].click()", expandPlus1);
			Thread.sleep(3000);

//download
			WebElement downloadButton = driver.findElement(By.xpath("//span[contains(text(),' Download ')]"));
			js.executeScript("arguments[0].click()", downloadButton);
			Thread.sleep(3000);

			upperCategoryProcess(driver);

//select email category
			WebElement selectEmailCategory = driver.findElement(By.xpath("(//span[@class='text__light--sm'])[2]"));
			js.executeScript("arguments[0].click()", selectEmailCategory);
			Thread.sleep(3000);

//ticket category tagging
			WebElement ticketTaggingButton = driver
					.findElement(By.xpath("(//label[@class='mat-tooltip-trigger rounded-toggle-switch-label'])[2]"));
			js.executeScript("arguments[0].click()", ticketTaggingButton);
			Thread.sleep(3000);

//sentiment postive keywords
			WebElement postiveKey = driver.findElement(By.xpath("(//input[@placeholder='Enter keywords here...'])[1]"));
			postiveKey.sendKeys("locotestpro");
			postiveKey.sendKeys(Keys.ENTER);

//sentiment negative keyword
			WebElement negativeKey = driver
					.findElement(By.xpath("(//input[@placeholder='Enter keywords here...'])[2]"));
			negativeKey.sendKeys("locotest");
			negativeKey.sendKeys(Keys.ENTER);

//save button
			WebElement saveButton2 = driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton2);
			Thread.sleep(3000);

//activity log
			WebElement activityLog = driver.findElement(By.xpath("//span[contains(text(),' Activity Log ')]"));
			js.executeScript("arguments[0].scrollIntoView()", activityLog);
			js.executeScript("arguments[0].click()", activityLog);
			Thread.sleep(3000);

			WebElement activityLogHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement activityLogData = driver.findElement(By.xpath("//div[@class='activitylog']"));
			WebElement pagination = driver
					.findElement(By.xpath("//mat-paginator[@class='mat-paginator gird-pagination']"));
			if (activityLogHeading.isDisplayed() && searchField.isDisplayed() && activityLogData.isDisplayed()
					&& pagination.isDisplayed()) {
				System.out.println("Activity log heading,data,search field,pagination are displayed");
			} else {
				System.out.println("Activity log heading,data,search field,pagination are not displayed");
			}

			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);

//copy to
			WebElement copyToButton = driver.findElement(By.xpath("//span[contains(text(),' Copy To ')]"));
			js.executeScript("arguments[0].click()", copyToButton);
			Thread.sleep(3000);
			WebElement destinationBrand = driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
			destinationBrand.sendKeys("auto demo");
			WebElement selectDestinationBrand = driver.findElement(By.xpath("//span[contains(text(),'Auto Demo')]"));
			selectDestinationBrand.click();
			//js.executeScript("arguments[0].click()", selectDestinationBrand);
			Thread.sleep(3000);
			WebElement saveButton3 = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			js.executeScript("arguments[0].click()", saveButton3);
			Thread.sleep(3000);

//select another brand
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement selectBrand1 = driver.findElement(By.xpath("//span[contains(text(),'Auto Demo')]"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(3000);

			WebElement categoriesData = driver.findElement(By.xpath("//div[@class='categorymap__tree bg__white']"));
			WebElement uppercategory = driver.findElement(By.xpath("//span[contains(text(),'Upper Categories')]"));
			js.executeScript("arguments[0].click()", uppercategory);
			Thread.sleep(3000);
			WebElement uppercategoryData = driver.findElement(By.xpath("//div[@class='categorymap__tree bg__white']"));
			if (uppercategory.isDisplayed() && uppercategoryData.isDisplayed()) {
				System.out.println("Categories data and upper category data are displayed");
			} else {
				System.out.println("Categories data and upper category data are not displayed");
			}
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void upperCategoryProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//upper category
			WebElement upperCategoryButton = driver
					.findElement(By.xpath("//span[contains(text(),'Upper Categories')]"));
			if (upperCategoryButton.isDisplayed()) {
				System.out.println("Upper Category button is displayed");
			} else {
				System.out.println("Upper Category button is not displayed");
			}
			js.executeScript("arguments[0].click()", upperCategoryButton);
			Thread.sleep(3000);

//create upper category
			WebElement createUpperCategoryButton = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Upper Category ')]"));
			js.executeScript("arguments[0].click()", createUpperCategoryButton);
			Thread.sleep(3000);
			WebElement upperCategoryName = driver
					.findElement(By.xpath("//input[@formcontrolname='upperCategoryName']"));
			upperCategoryName.sendKeys("kalyan catest");
			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);

//add keywords
			/*
			 * WebElement keywordsTab=driver.findElement(By.
			 * xpath("//input[@placeholder='Enter keywords']"));
			 * keywordsTab.sendKeys("testtan"); keywordsTab.sendKeys(Keys.ENTER);
			 * 
			 * WebElement saveKeywordsButton =
			 * driver.findElement(By.xpath("//span[contains(text(),' Save Keywords ')]"));
			 * js.executeScript("arguments[0].click()", saveKeywordsButton);
			 * Thread.sleep(3000);
			 */

			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

//search upper category
			WebElement searchUpperCategory = driver
					.findElement(By.xpath("//input[@placeholder='Search Upper Category']"));
			searchUpperCategory.sendKeys("kalyan catest");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search ')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

			WebElement category = driver.findElement(By.xpath("(//span[contains(text(),'Categories')])[1]"));
			js.executeScript("arguments[0].click()", category);
			Thread.sleep(3000);

//select catch call category
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].scrollIntoView()", arrow);
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchCategory = driver.findElement(By.xpath("(//input[@placeholder='Search Category'])"));
			searchCategory.sendKeys("Accounts");
			WebElement selectCatchallCategory = driver
					.findElement(By.xpath("(//span[contains(text(),'Accounts')])"));
			js.executeScript("arguments[0].click()", selectCatchallCategory);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
