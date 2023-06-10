package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzKeywordConfigurationUIComponents {

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

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[1]"));
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

	public static void verifyingKeywordConfigurationComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//listening settings
			WebElement listeningSettings = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Listening Settings ')])[1]"));
			if (listeningSettings.isDisplayed()) {
				System.out.println("Listening Settings is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Listening Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", listeningSettings);
			Thread.sleep(3000);

//keyword configuration
			WebElement keywordConfigurationLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Keywords_Configuration.svg']"));
			WebElement keywordConfiguration = driver
					.findElement(By.xpath("//span[contains(text(),'Keywords Configuration')]"));
			if (keywordConfigurationLogo.isDisplayed() && keywordConfiguration.isDisplayed()) {
				System.out.println("Keyword Configuration is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Keyword Configuration is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", keywordConfiguration);
			Thread.sleep(3000);

//real time keyword tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement realTimeTab = driver.findElement(By.xpath("(//span[contains(text(),'Real Time Keywords')])[1]"));
			if (pushpin.isDisplayed() && realTimeTab.isDisplayed()) {
				System.out.println("Real Time Keyword Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Real Time Keyword Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}
			js.executeScript("arguments[0].click()", realTimeTab);
			Thread.sleep(3000);

//brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			if (brandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Brand Field is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Brand Field is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchField.isDisplayed() && searchButton.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//refresh button
			WebElement refreshButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'refresh')])[1]"));
			if (refreshButton.isDisplayed()) {
				System.out.println("Refresh Button is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Refresh Button is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//filter button
			WebElement filterButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt ')])[1]"));
			if (filterButton.isDisplayed()) {
				System.out.println("Filter Button is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Filter Button is not displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);

//filter fields
			WebElement channelField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			WebElement keywordTypeField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement arrow2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			if (channelField.isDisplayed() && arrow1.isDisplayed() && keywordTypeField.isDisplayed()
					&& arrow2.isDisplayed()) {
				System.out.println("Filter Fileds are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Filter Fileds are not displayed");
				componentsInformation.add(7, "Not Present");
			}

//apply button
			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),' Apply ')]"));
			if (applyButton.isDisplayed()) {
				System.out.println("Apply Button is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Apply Button is not displayed");
				componentsInformation.add(8, "Not Present");
			}

//cancel button
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

//active/total keywords
			WebElement activeTotalKeywords = driver
					.findElement(By.xpath("(//p[@class='text__label mt-15 mr-10 ml-20'])[1]"));
			if (activeTotalKeywords.isDisplayed()) {
				System.out.println("Active/Total Keywords is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Active/Total Keywords is not displayed");
				componentsInformation.add(10, "Not Present");
			}

//addkeyword button
			WebElement addKeywordButton = driver
					.findElement(By.xpath("(//span[contains(text(),'Add Keywords/Social Profiles ')])[1]"));
			if (addKeywordButton.isDisplayed()) {
				System.out.println("Add keyword/Social Profile Button is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Add keyword/Social Profile Button is not displayed");
				componentsInformation.add(11, "Not Present");
			}
			js.executeScript("arguments[0].click()", addKeywordButton);
			Thread.sleep(3000);

//realtime heading
			WebElement realTimeHeading = driver.findElement(By.xpath("//h3[contains(@class,'modal__title')]"));
			if (realTimeHeading.isDisplayed()) {
				System.out.println("Real Time Keyword Configuration Heading is displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Real Time Keyword Configuration Heading is not displayed");
				componentsInformation.add(12, "Not Present");
			}

//group name
			WebElement groupNameHeading = driver
					.findElement(By.xpath("(//p[@class='font-weight-600 mb-4 line-height-1.25'])[1]"));
			WebElement info = driver.findElement(By.xpath("(//p[@class='text__light--sm mb-7'])"));
			WebElement groupNameField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (groupNameHeading.isDisplayed() && info.isDisplayed() && groupNameField.isDisplayed()) {
				System.out.println("Group Name Information and Field are displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Group Name Information and Field are not displayed");
				componentsInformation.add(13, "Not Present");
			}

//pick your channels
			WebElement heading = driver
					.findElement(By.xpath("(//p[@class='font-weight-600 mb-4 line-height-1.25'])[2]"));
			WebElement info1 = driver.findElement(By.xpath("(//p[@class='text__light--sm'])[1]"));
			WebElement channels = driver.findElement(By.xpath("(//div[@fxlayout='row wrap'])[3]"));
			if (heading.isDisplayed() && info1.isDisplayed() && channels.isDisplayed()) {
				System.out.println("Pick Your Channels Information and Different channels are displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Pick Your Channels Information and Different channels are not displayed");
				componentsInformation.add(14, "Not Present");
			}

//configure keyword query
			WebElement queryHeading = driver
					.findElement(By.xpath("//div[@class='font-weight-600 mb-4 line-height-1.25']"));
			WebElement queryInfo = driver.findElement(By.xpath("(//p[@class='text__light--sm'])[2]"));
			WebElement note = driver.findElement(By.xpath("//p[contains(@class,'text__light--sm mt-5')]"));
			if (queryHeading.isDisplayed() && queryInfo.isDisplayed() && note.isDisplayed()) {
				System.out.println("Configure Keyword Query Information and note are displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Configure Keyword Query Information and note are not displayed");
				componentsInformation.add(15, "Not Present");
			}

//query builder
			WebElement queryBuilder1 = driver.findElement(By.xpath("//span[contains(text(),'Basic Query Builder')]"));
			WebElement queryBuilder2 = driver.findElement(By.xpath("//span[contains(text(),'Advance Query Builder')]"));
			if (queryBuilder1.isDisplayed() && queryBuilder2.isDisplayed()) {
				System.out.println("Query Builders are displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Query Builders are not displayed");
				componentsInformation.add(16, "Not Present");
			}

//query fields and radio buttons
			WebElement radioButton1 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]"));
			WebElement radioButton2 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]"));
			WebElement queryField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement queryField2 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			WebElement queryField3 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[9]"));
			WebElement queryField4 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[10]"));
			WebElement queryField5 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[11]"));
			if (radioButton1.isDisplayed() && radioButton2.isDisplayed() && queryField1.isDisplayed()
					&& queryField2.isDisplayed() && queryField3.isDisplayed() && queryField4.isDisplayed()
					&& queryField5.isDisplayed()) {
				System.out.println("All Query Fields are displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("All Query Fields are not displayed");
				componentsInformation.add(17, "Not Present");
			}

//keyword query preview
			WebElement queryPreviewHeading = driver
					.findElement(By.xpath("//p[@class='font-weight-600 mb-4 mt-10 line-height-1.25']"));
			WebElement queryPreviewInfo = driver.findElement(By.xpath("//p[@class='text__regular text__sm']"));
			WebElement queryPreviewField = driver
					.findElement(By.xpath("//div[@class='keywordConfig__selectedChannels--textarea']"));
			if (queryPreviewHeading.isDisplayed() && queryPreviewInfo.isDisplayed()
					&& queryPreviewField.isDisplayed()) {
				System.out.println("Keyword Query Preview Information and Field are displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Keyword Query Preview Information and Field are not displayed");
				componentsInformation.add(18, "Not Present");
			}

//copy query and query length
			WebElement copyQuery = driver.findElement(By.xpath("//span[contains(text(),'Copy Query')]"));
			WebElement queryLength = driver.findElement(By.xpath("//span[contains(text(),'Query length:')]"));
			if (copyQuery.isDisplayed() && queryLength.isDisplayed()) {
				System.out.println("Copy Query and Query Length are displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("Copy Query and Query Length are not displayed");
				componentsInformation.add(19, "Not Present");
			}

//cancel button
			WebElement cancelButton1 = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton1.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(20, "Not Present");
			}

//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			if (saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(21, "Not Present");
			}

//Arrow back button
			WebElement arrowBackButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if (arrowBackButton.isDisplayed()) {
				System.out.println("Arrow Back Button is displayed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("Arrow Back Button is not displayed");
				componentsInformation.add(22, "Not Present");
			}
			js.executeScript("arguments[0].click()", arrowBackButton);
			Thread.sleep(3000);

			verifyingHistoricKeywordComponents(driver);
			
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			
			componentsInformation.add(45, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "KeywordConfigurationUIComponent");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void verifyingHistoricKeywordComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//historic keyword tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement historicKeywordTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Historic Keywords')])[1]"));
			if (pushpin.isDisplayed() && historicKeywordTab.isDisplayed()) {
				System.out.println("Historic Keyword Tab is displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Historic Keyword Tab is not displayed");
				componentsInformation.add(23, "Not Present");
			}
			js.executeScript("arguments[0].click()", historicKeywordTab);
			Thread.sleep(3000);

//brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			if (brandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Brand Field is displayed");
				componentsInformation.add(24, "Present");
			} else {
				System.out.println("Brand Field is not displayed");
				componentsInformation.add(24, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			if (searchField.isDisplayed() && searchButton.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(25, "Present");
			} else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(25, "Not Present");
			}

//refresh button
			WebElement refreshButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'refresh')])[2]"));
			if (refreshButton.isDisplayed()) {
				System.out.println("Refresh Button is displayed");
				componentsInformation.add(26, "Present");
			} else {
				System.out.println("Refresh Button is not displayed");
				componentsInformation.add(26, "Not Present");
			}

//filter button
			WebElement filterButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt ')])[2]"));
			if (filterButton.isDisplayed()) {
				System.out.println("Filter Button is displayed");
				componentsInformation.add(27, "Present");
			} else {
				System.out.println("Filter Button is not displayed");
				componentsInformation.add(27, "Not Present");
			}
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);

//filter field
			WebElement field = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (field.isDisplayed()) {
				System.out.println("Filter Field is displayed");
				componentsInformation.add(28, "Present");
			} else {
				System.out.println("Filter Field is not displayed");
				componentsInformation.add(28, "Not Present");
			}

//apply button
			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),' Apply ')]"));
			if (applyButton.isDisplayed()) {
				System.out.println("Apply Button is displayed");
				componentsInformation.add(29, "Present");
			} else {
				System.out.println("Apply Button is not displayed");
				componentsInformation.add(29, "Not Present");
			}

//cancel button
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(30, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(30, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

//active/total keywords
			WebElement activeTotalKeywords = driver
					.findElement(By.xpath("(//p[@class='text__label mt-15 mr-10 ml-20'])[2]"));
			if (activeTotalKeywords.isDisplayed()) {
				System.out.println("Active/Total Keywords is displayed");
				componentsInformation.add(31, "Present");
			} else {
				System.out.println("Active/Total Keywords is not displayed");
				componentsInformation.add(31, "Not Present");
			}

//addkeyword button
			WebElement addKeywordButton = driver
					.findElement(By.xpath("(//span[contains(text(),'Add Keywords/Social Profiles ')])[2]"));
			if (addKeywordButton.isDisplayed()) {
				System.out.println("Add keyword/Social Profile Button is displayed");
				componentsInformation.add(32, "Present");
			} else {
				System.out.println("Add keyword/Social Profile Button is not displayed");
				componentsInformation.add(32, "Not Present");
			}
			js.executeScript("arguments[0].click()", addKeywordButton);
			Thread.sleep(3000);

//historic heading
			WebElement historicHeading = driver.findElement(By.xpath("//h3[contains(@class,'modal__title')]"));
			if (historicHeading.isDisplayed()) {
				System.out.println("Historic Keyword Configuration Heading is displayed");
				componentsInformation.add(33, "Present");
			} else {
				System.out.println("Historic Keyword Configuration Heading is not displayed");
				componentsInformation.add(33, "Not Present");
			}

//group name
			WebElement groupNameHeading = driver
					.findElement(By.xpath("(//p[@class='font-weight-600 mb-4 line-height-1.25'])[1]"));
			WebElement info = driver.findElement(By.xpath("(//p[@class='text__light--sm mb-7'])"));
			WebElement groupNameField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (groupNameHeading.isDisplayed() && info.isDisplayed() && groupNameField.isDisplayed()) {
				System.out.println("Group Name Information and Field are displayed");
				componentsInformation.add(34, "Present");
			} else {
				System.out.println("Group Name Information and Field are not displayed");
				componentsInformation.add(34, "Not Present");
			}

//pick your channels
			WebElement heading = driver
					.findElement(By.xpath("(//p[@class='font-weight-600 mb-4 line-height-1.25'])[2]"));
			WebElement info1 = driver.findElement(By.xpath("(//p[@class='text__light--sm'])[1]"));
			WebElement channels = driver.findElement(By.xpath("(//div[@fxlayout='row wrap'])[3]"));
			if (heading.isDisplayed() && info1.isDisplayed() && channels.isDisplayed()) {
				System.out.println("Pick Your Channels Information and Different channels are displayed");
				componentsInformation.add(35, "Present");
			} else {
				System.out.println("Pick Your Channels Information and Different channels are not displayed");
				componentsInformation.add(35, "Not Present");
			}

//configure keyword query
			WebElement queryHeading = driver
					.findElement(By.xpath("//div[@class='font-weight-600 mb-4 line-height-1.25']"));
			WebElement queryInfo = driver.findElement(By.xpath("(//p[@class='text__light--sm'])[2]"));
			WebElement queryBuilder = driver.findElement(By.xpath("//span[contains(text(),'Basic Query Builder')]"));
			if (queryHeading.isDisplayed() && queryInfo.isDisplayed() && queryBuilder.isDisplayed()) {
				System.out.println("Configure Keyword Query Information and query Builder are displayed");
				componentsInformation.add(36, "Present");
			} else {
				System.out.println("Configure Keyword Query Information and query Builder are not displayed");
				componentsInformation.add(36, "Not Present");
			}

//query fields and radio buttons
			WebElement radioButton1 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]"));
			WebElement radioButton2 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]"));
			WebElement queryField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement queryField2 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			WebElement queryField3 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[9]"));
			WebElement queryField4 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[10]"));
			WebElement queryField5 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[11]"));
			if (radioButton1.isDisplayed() && radioButton2.isDisplayed() && queryField1.isDisplayed()
					&& queryField2.isDisplayed() && queryField3.isDisplayed() && queryField4.isDisplayed()
					&& queryField5.isDisplayed()) {
				System.out.println("All Query Fields are displayed");
				componentsInformation.add(37, "Present");
			} else {
				System.out.println("All Query Fields are not displayed");
				componentsInformation.add(37, "Not Present");
			}

//keyword query preview
			WebElement queryPreviewHeading = driver
					.findElement(By.xpath("//p[@class='font-weight-600 mb-4 mt-10 line-height-1.25']"));
			WebElement queryPreviewInfo = driver.findElement(By.xpath("//p[@class='text__regular text__sm']"));
			WebElement queryPreviewField = driver
					.findElement(By.xpath("//div[@class='keywordConfig__selectedChannels--textarea']"));
			if (queryPreviewHeading.isDisplayed() && queryPreviewInfo.isDisplayed()
					&& queryPreviewField.isDisplayed()) {
				System.out.println("Keyword Query Preview Information and Field are displayed");
				componentsInformation.add(38, "Present");
			} else {
				System.out.println("Keyword Query Preview Information and Field are not displayed");
				componentsInformation.add(38, "Not Present");
			}

//copy query and query length
			WebElement copyQuery = driver.findElement(By.xpath("//span[contains(text(),'Copy Query')]"));
			WebElement queryLength = driver.findElement(By.xpath("//span[contains(text(),'Query length:')]"));
			if (copyQuery.isDisplayed() && queryLength.isDisplayed()) {
				System.out.println("Copy Query and Query Length are displayed");
				componentsInformation.add(39, "Present");
			} else {
				System.out.println("Copy Query and Query Length are not displayed");
				componentsInformation.add(39, "Not Present");
			}

//duration
			WebElement durationHeading = driver.findElement(By.xpath("//p[@class='font-weight-600']"));
			WebElement info3 = driver.findElement(By.xpath("//p[@class='text__light--sm mt-3 mb-10']"));
			WebElement field2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[12]"));
			WebElement arrow2 = driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_arrow_down ')]"));
			WebElement durationCheckbox = driver
					.findElement(By.xpath("(//mat-checkbox[@class='mat-checkbox mat-accent'])[3]"));
			if (durationHeading.isDisplayed() && info3.isDisplayed() && field2.isDisplayed() && arrow2.isDisplayed()
					&& durationCheckbox.isDisplayed()) {
				System.out.println("Duration Information and Field are displayed");
				componentsInformation.add(40, "Present");
			}
			else {
				System.out.println("Duration Information and Field are not displayed");
				componentsInformation.add(40, "Not Present");
			}
			
//available credits
			WebElement credits=driver.findElement(By.xpath("//p[contains(@class,'ml-auto mr-20')]"));
			if(credits.isDisplayed()) {
				System.out.println("Available Credits is displayed");
				componentsInformation.add(41, "Present");
			}
			else {
				System.out.println("Available Credits is not displayed");
				componentsInformation.add(41, "Not Present");
			}
			
//cancel button
			WebElement cancelButton1 = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton1.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(42, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(42, "Not Present");
			}

//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			if (saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(43, "Present");
			} else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(43, "Not Present");
			}

//Arrow back button
			WebElement arrowBackButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if (arrowBackButton.isDisplayed()) {
				System.out.println("Arrow Back Button is displayed");
				componentsInformation.add(44, "Present");
			} else {
				System.out.println("Arrow Back Button is not displayed");
				componentsInformation.add(44, "Not Present");
			}
			js.executeScript("arguments[0].click()", arrowBackButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
