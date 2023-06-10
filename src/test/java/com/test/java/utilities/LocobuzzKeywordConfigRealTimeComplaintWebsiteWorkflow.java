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

public class LocobuzzKeywordConfigRealTimeComplaintWebsiteWorkflow {

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

	public static void keywordConfigurationComplaintWebsiteProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//listening settings
			WebElement listeningSettings = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Listening Settings ')])[1]"));
			js.executeScript("arguments[0].click()", listeningSettings);
			Thread.sleep(3000);

//keyword configuration
			WebElement keywordConfigurationLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Keywords_Configuration.svg']"));
			WebElement keywordConfiguration = driver
					.findElement(By.xpath("//span[contains(text(),'Keywords Configuration')]"));
			js.executeScript("arguments[0].click()", keywordConfiguration);
			Thread.sleep(3000);

//real time keyword tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement realTimeTab = driver.findElement(By.xpath("(//span[contains(text(),'Real Time Keywords')])[1]"));
			js.executeScript("arguments[0].click()", realTimeTab);
			Thread.sleep(3000);

//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand.sendKeys("kalyan");
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),'kalyan')])[2]"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(6000);

//addkeyword button
			WebElement addKeywordButton = driver
					.findElement(By.xpath("(//span[contains(text(),'Add Keywords/Social Profiles ')])[1]"));
			js.executeScript("arguments[0].click()", addKeywordButton);
			Thread.sleep(3000);

//realtime heading
			WebElement realTimeHeading = driver.findElement(By.xpath("//h3[contains(@class,'modal__title')]"));
			if (realTimeHeading.isDisplayed()) {
				System.out.println("Real Time Keyword Configuration Heading is displayed");
			} else {
				System.out.println("Real Time Keyword Configuration Heading is not displayed");
			}

//group name
			WebElement groupName = driver.findElement(By.xpath("//input[@type='string']"));
			groupName.sendKeys("SiteReviews");
			Thread.sleep(2000);

//select channel
			WebElement selectChannel = driver
					.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[8]"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);

//configure keyword query
			WebElement queryHeading = driver
					.findElement(By.xpath("//div[@class='font-weight-600 mb-4 line-height-1.25']"));
			WebElement queryInfo = driver.findElement(By.xpath("(//p[@class='text__light--sm'])[2]"));
			WebElement note = driver.findElement(By.xpath("//p[contains(@class,'text__light--sm mt-5')]"));
			if (queryHeading.isDisplayed() && queryInfo.isDisplayed() && note.isDisplayed()) {
				System.out.println("Configure Keyword Query Information and note are displayed");
			} else {
				System.out.println("Configure Keyword Query Information and note are not displayed");
			}

//query builder
			WebElement queryBuilder = driver.findElement(By.xpath("//span[contains(text(),'Basic Query Builder')]"));
			js.executeScript("arguments[0].click()", queryBuilder);
			Thread.sleep(3000);

//alert message
			WebElement alertMessage = driver.findElement(By.xpath("//p[@class='alertnote']"));
			if (alertMessage.isDisplayed()) {
				System.out.println("Alert Message is displayed");
			} else {
				System.out.println("Alert Message is  not displayed");
			}

			WebElement radioButton = driver.findElement(By.xpath("(//span[contains(text(),'OR ')])[2]"));

// adding keywords
			WebElement queryKeyword = driver.findElement(By.xpath("(//input[@placeholder='Add new keyword'])[1]"));
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(queryKeyword, "action").sendKeys(Keys.ENTER)
					.sendKeys(queryKeyword, "BrandQuery").sendKeys(Keys.ENTER).build();
			action.perform();

			WebElement queryKeyword1 = driver.findElement(By.xpath("(//input[@placeholder='Add new keyword'])[2]"));
			queryKeyword1.sendKeys("site information");
			queryKeyword1.sendKeys(Keys.ENTER);
			queryKeyword1.sendKeys("views list");
			queryKeyword1.sendKeys(Keys.ENTER);

			WebElement queryKeyword2 = driver.findElement(By.xpath("(//input[@placeholder='Add new keyword'])[3]"));
			queryKeyword2.sendKeys("no views");
			queryKeyword2.sendKeys(Keys.ENTER);

// channel preview
			WebElement channelHeading = driver.findElement(By.xpath("//div[contains(@class,'text__label')]"));
			WebElement channelImage = driver
					.findElement(By.xpath("//div[contains(@class,'text__label')]//following::img"));
			if (channelHeading.isDisplayed() && channelImage.isDisplayed()) {
				System.out.println("Channel heading and image is displayed");
			} else {
				System.out.println("Channel heading and image is not  displayed");
			}

// keyword query preview
			WebElement queryReview = driver.findElement(By.xpath(
					"//div[contains(@class,'textarea-featured__input keywordConfig__selectedChannels--textarea-input')]//span"));
			if (queryReview.isDisplayed()) {
				System.out.println("Query Review is displayed");
			} else {
				System.out.println("Query Review is not displayed");
			}

// copy query and query length
			WebElement copyQuery = driver.findElement(By.xpath("//span[contains(text(),'Copy Query')]"));
			WebElement queryLength = driver.findElement(By.xpath("//span[contains(text(),'Query length:')]"));
			if (copyQuery.isDisplayed() && queryLength.isDisplayed()) {
				System.out.println("Copy Query and Query Length are displayed");
			} else {
				System.out.println("Copy Query and Query Length are not displayed");
			}
			js.executeScript("arguments[0].click()", copyQuery);
			Thread.sleep(3000);

// save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(5000);
			
//search group name
			WebElement searchGroupName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			searchGroupName.sendKeys("SiteReviews");
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(5000);

//keywords group name
			WebElement keywordGroupName = driver
					.findElement(By.xpath("(//div[contains(text(),'Keywords Group Name')])[1]"));
			if (keywordGroupName.isDisplayed()) {
				System.out.println("Keyword Group Name is displayed");
			} else {
				System.out.println("Keyword Group Name is not displayed");
			}

//keywords/keywords query
			WebElement keywordqueryHeading = driver
					.findElement(By.xpath("(//th[contains(text(),'Keywords/Keywords Query ')])[1]"));
			if (keywordqueryHeading.isDisplayed()) {
				System.out.println("Keywords/Keywords Query is displayed");
			} else {
				System.out.println("Keywords/Keywords Query is not displayed");
			}

//channels
			WebElement channels = driver.findElement(By.xpath("(//th[contains(text(),' Channels ')])[1]"));
			if (channels.isDisplayed()) {
				System.out.println("Channels is displayed");
			} else {
				System.out.println("Channels is not displayed");
			}

//created on
			WebElement createdOn = driver.findElement(By.xpath("(//th[contains(text(),'Created On')])[1]"));
			if (createdOn.isDisplayed()) {
				System.out.println("Created On is displayed");
			} else {
				System.out.println("Created On is not displayed");
			}

//status
			WebElement status = driver.findElement(By.xpath("(//div[contains(text(),'Status')])[1]"));
			if (status.isDisplayed()) {
				System.out.println("Status is displayed");
			} else {
				System.out.println("Status is not displayed");
			}

//action
			WebElement action1 = driver.findElement(By.xpath("(//div[contains(text(),'Actions')])[1]"));
			if (action1.isDisplayed()) {
				System.out.println("Action is displayed");
			} else {
				System.out.println("Action is not displayed");
			}
			
//actions button and pause button
			WebElement pauseButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'pause_circle_outline')]"));
			if(pauseButton.isDisplayed()) {
				System.out.println("Pause Button is displayed");
			}
			else {
				System.out.println("Pause Button is not displayed");
			}
			
			
			WebElement actionButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])[1]"));
			js.executeScript("arguments[0].click()", actionButton);
			Thread.sleep(3000);
			
//edit button
			WebElement editSymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
			WebElement edit=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])"));
			if(editSymbol.isDisplayed()&&edit.isDisplayed()) {
				System.out.println("Edit button is displayed");
			}
			else {
				System.out.println("Edit button is not displayed");
			}
			
//duplicate button
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])"));
			WebElement duplicate = driver.findElement(By.xpath("(//span[contains(text(),'Duplicate')])"));
			if (symbol.isDisplayed() && duplicate.isDisplayed()) {
				System.out.println("Duplicate is displayed");
			} else {
				System.out.println("Duplicate is not displayed");
			}
			
//delete button
			WebElement deleteSymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete_outline ')])"));
			WebElement delete=driver.findElement(By.xpath("(//span[contains(text(),'Delete')])"));
			if(deleteSymbol.isDisplayed()&&delete.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not  displayed");
			}
			
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
