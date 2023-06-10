package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzDataConsumptionDashboardUIComponents {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void verifyingDataConsumptionDashboardComponents(WebDriver driver) throws Exception {
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
			WebElement logo = driver.findElement(By.xpath("//img[@src='assets/account/menu/Data_Consumption.svg']"));
			WebElement label = driver.findElement(By.xpath("//span[contains(text(),'Data Consumption')]"));
			if (logo.isDisplayed() && label.isDisplayed()) {
				System.out.println("Data Consumption logo and label are displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Data Consumption logo and label are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", label);
			Thread.sleep(3000);

//data consumption tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement tab = driver.findElement(By.xpath("(//span[contains(text(),'Data Consumption')])[2]"));
			if (pushpin.isDisplayed() && tab.isDisplayed()) {
				System.out.println("Data Consumption tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Data Consumption tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//data consumption(heading,information) and email symbol
			WebElement heading = driver
					.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-10 text__title--font')])[1]"));
			WebElement info = driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[1]"));
			WebElement emailSymbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'email')]"));
			if (heading.isDisplayed() && info.isDisplayed() && emailSymbol.isDisplayed()) {
				System.out.println("Data Consumption heading,information and email symbol are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Data Consumption heading,information and email symbol are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//duration field and note
			WebElement durationField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement dateRangeSymbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'date_range')]"));
			WebElement noteMessage = driver
					.findElement(By.xpath("//div[contains(@class,'data-cons__header--note text__regular--sm')]"));
			if (durationField.isDisplayed() && dateRangeSymbol.isDisplayed() && noteMessage.isDisplayed()) {
				System.out.println("Duration field and note message are displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Duration field and note message are not displayed");
				componentsInformation.add(4, "Not Present");
			}

//leftside heading and rightside usage types
			WebElement leftsideHeading = driver.findElement(By.xpath("//div[@class='data-cons__body--head-left']"));
			WebElement usageType = driver
					.findElement(By.xpath("(//div[@class='data-cons__body--head-right-item'])[1]"));
			WebElement usageType1 = driver
					.findElement(By.xpath("(//div[@class='data-cons__body--head-right-item'])[2]"));
			WebElement usageType2 = driver
					.findElement(By.xpath("(//div[@class='data-cons__body--head-right-item'])[3]"));
			if (leftsideHeading.isDisplayed() && usageType.isDisplayed() && usageType1.isDisplayed()
					&& usageType2.isDisplayed()) {
				System.out.println("Left side heading and usage Types headings are displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Left side heading and usage Types headings are not displayed");
				componentsInformation.add(5, "Not Present");
			}

//monthly data consumption(heading,usagelimit,showdetails)
			WebElement monthlyDataHeading = driver
					.findElement(By.xpath("//span[contains(text(),'Monthly Data Consumption')]"));
			WebElement usagelimit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[1]"));
			WebElement showdetails = driver.findElement(By.xpath("//p[contains(text(),' Show Details ')]"));
			if (monthlyDataHeading.isDisplayed() && usagelimit.isDisplayed() && showdetails.isDisplayed()) {
				System.out.println("Monthly data consumption heading ,usage limit and showdetails are displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Monthly data consumption heading ,usage limit and showdetails are not displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", showdetails);
			Thread.sleep(10000);

//monthly data consumption heading and note message
			WebElement monthlyconsumptionHeading = driver
					.findElement(By.xpath("//h3[contains(text(),'Monthly Data Consumption')]"));
			WebElement noteMessage1 = driver
					.findElement(By.xpath("//div[contains(@class,'historic-data-cons__body--note font-size-12')]"));
			if (monthlyconsumptionHeading.isDisplayed() && noteMessage1.isDisplayed()) {
				System.out.println("Monthly data consumption heading and note message are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Monthly data consumption heading and note message are not displayed");
				componentsInformation.add(7, "Not Present");
			}

//fields of monthly consumption
			WebElement field1 = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[1]"));
			WebElement field2 = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[2]"));
			WebElement field3 = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[3]"));
			WebElement field4 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'date_range')])[2]"));
			if (field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed() && field4.isDisplayed()
					&& symbol.isDisplayed()) {
				System.out.println("All fields are displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("All fields are not displayed");
				componentsInformation.add(8, "Not Present");
			}

//show data consumption heading and other fields
			WebElement showDataHeading = driver.findElement(By.xpath("(//p[@class='mb-0 font-weight-700'])[1]"));
			WebElement totalMentions = driver
					.findElement(By.xpath("(//div[@class='historic-data-cons__body--show-body-left-card'])[1]"));
			WebElement billiableMention = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--show-body-left-card')])[2]"));
			WebElement nonbilliableMention = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--show-body-left-card')])[3]"));
			if (showDataHeading.isDisplayed() && totalMentions.isDisplayed() && billiableMention.isDisplayed()
					&& nonbilliableMention.isDisplayed()) {
				System.out.println("show data heaidng and other fields are displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("show data heaidng and other fields are not displayed");
				componentsInformation.add(9, "Not Present");
			}

//graph data brand information,graph data and note message
			WebElement graphDataInformation = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--show-body-right-counts')])[1]"));
			WebElement graphData = driver.findElement(By.xpath("(//div[@class='highcharts-container '])[1]"));
			WebElement noteMessage2 = driver.findElement(By.xpath("(//p[@class='text__light--sm ml-20'])[1]"));
			if (graphDataInformation.isDisplayed() && graphData.isDisplayed() && noteMessage2.isDisplayed()) {
				System.out.println("graph data information,graph data and note message are displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("graph data information,graph data and note message are not displayed");
				componentsInformation.add(10, "Not Present");
			}

//channelwise brand heading,brand field&channel information
			WebElement channelwiseHeading = driver.findElement(By.xpath("(//p[@class='mb-0 font-weight-700'])[2]"));
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			WebElement channelInfomation = driver
					.findElement(By.xpath("//div[@class='historic-data-cons__body--channel-body-left-table']"));
			if (channelwiseHeading.isDisplayed() && brandField.isDisplayed() && channelInfomation.isDisplayed()) {
				System.out.println("channelwise heading,brand field and channel information are displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("channelwise heading,brand field and channel information are not displayed");
				componentsInformation.add(11, "not Present");
			}

//channels mention,usagedata,graph&note message
			WebElement mentions = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--channel-body-right-counts')])[1]"));
			WebElement usageData = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--channel-body-right-counts')])[3]"));
			WebElement graph = driver.findElement(By.xpath("(//div[@class='highcharts-container '])[2]"));
			WebElement noteMessage3 = driver.findElement(By.xpath("(//p[@class='text__light--sm ml-20'])[2]"));
			if (mentions.isDisplayed() && usageData.isDisplayed() && graph.isDisplayed()
					&& noteMessage3.isDisplayed()) {
				System.out.println("Mentions,Usage data,graph and note message are displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Mentions,Usage data,graph and note message are not displayed");
				componentsInformation.add(12, "Not Present");
			}

//arrow back
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back ')]"));
			if (arrowBack.isDisplayed()) {
				System.out.println("Arrow back is displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Arrow back is not displayed");
				componentsInformation.add(13, "Not Present");
			}
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

//increase quota
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[1]"));
			if (increaseQuota.isDisplayed()) {
				System.out.println("Increase Quota for monthly data consumption is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Increase Quota for monthly data consumption is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(15, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +10k ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +25k ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(16, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(17, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

			historicDataUIComponents(driver);
			userLicenseUIComponents(driver);
			socialMediaUIComponents(driver);
			topicKeywordSearchUIComponents(driver);
			brandUIComponents(driver);
			digitCommandCenterUIComponents(driver);
			objectDetectionUIComponents(driver);
			fbLocationUIComponents(driver);
			gmbLocationUIComponents(driver);
			otherChannelURLUIComponents(driver);
			
		
			
			componentsInformation.add(64,CommonFunctions.getDataTime());			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"DataConsumptionDashboardUICompo");

//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[1]"));
			js.executeScript("arguments[0].click()", expand);
			Thread.sleep(2000);

			WebElement logout = driver.findElement(By.xpath("//button[contains(text(),' Logout ')]"));
			js.executeScript("arguments[0].click()", logout);
			Thread.sleep(2000);

			WebElement confirmLogout = driver.findElement(By.xpath("//span[contains(text(),' Logout ')]"));
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

	public static void historicDataUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//historic heading,usagelimit,show details
			WebElement historicHeading = driver
					.findElement(By.xpath("(//p[@class='text__title--font colored__blue--dark line-height-1.25'])[2]"));
			WebElement usageLimit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[2]"));
			WebElement showDetails = driver.findElement(By.xpath("(//p[contains(text(),'Show Details ')])[2]"));
			if (historicHeading.isDisplayed() && usageLimit.isDisplayed() && showDetails.isDisplayed()) {
				System.out.println("Historic heading,usage limit,show details button are displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Historic heading,usage limit,show details button are not displayed");
				componentsInformation.add(18, "Not Present");
			}
			js.executeScript("arguments[0].click()", showDetails);
			Thread.sleep(10000);

//historic consumption heading,fields
			WebElement historicHeading1 = driver.findElement(By.xpath("//h3[contains(@class,'modal__title ml-18')]"));
			WebElement field1 = driver.findElement(By.xpath("//p[@class='font-weight-700 mb-4']"));
			WebElement field2 = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[2]"));
			WebElement field3 = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[3]"));
			if (historicHeading1.isDisplayed() && field1.isDisplayed() && field2.isDisplayed()
					&& field3.isDisplayed()) {
				System.out.println("Historic consumption heading and fields are displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("Historic consumption heading and fields are not displayed");
				componentsInformation.add(19, "Not Present");
			}

//show data heading,fields,brands,graph
			WebElement heading = driver.findElement(By.xpath("(//p[@class='mb-0 font-weight-700'])[1]"));
			WebElement field4 = driver
					.findElement(By.xpath("//div[@class='historic-data-cons__body--show-body-left-card']"));
			WebElement field5 = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--show-body-left-card')])[2]"));
			WebElement brandDataUsage = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--show-body-right-counts')])[1]"));
			WebElement brandUsageInformation = driver.findElement(By.xpath("//div[@class='block-center mt-20']"));
			WebElement brands = driver.findElement(By.xpath("//div[@class='block-center mt-23 mb-10']"));
			if (heading.isDisplayed() && field4.isDisplayed() && field5.isDisplayed() && brandDataUsage.isDisplayed()
					&& brandUsageInformation.isDisplayed() && brands.isDisplayed()) {
				System.out.println("Show data heading,fields,brand data are displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Show data heading,fields,brand data are not displayed");
				componentsInformation.add(20, "Not Present");
			}

//channelwise brand heading,brand field&channel information
			WebElement channelwiseHeading = driver.findElement(By.xpath("(//p[@class='mb-0 font-weight-700'])[2]"));
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement channelInfomation = driver
					.findElement(By.xpath("//div[@class='historic-data-cons__body--channel-body-left-table']"));
			if (channelwiseHeading.isDisplayed() && brandField.isDisplayed() && channelInfomation.isDisplayed()) {
				System.out.println("channelwise heading,brand field and channel information are displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("channelwise heading,brand field and channel information are not displayed");
				componentsInformation.add(21, "not Present");
			}

//historic data count,usagedata,graph&note message
			WebElement historicData = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--channel-body-right-counts')])[1]"));
			WebElement usageData = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--channel-body-right-counts')])[3]"));
			WebElement graph = driver.findElement(By.xpath("(//div[@class='highcharts-container '])"));
			WebElement noteMessage3 = driver.findElement(By.xpath("(//p[@class='text__light--sm ml-20'])"));
			if (historicData.isDisplayed() && usageData.isDisplayed() && graph.isDisplayed()
					&& noteMessage3.isDisplayed()) {
				System.out.println("historicData,Usage data,graph and note message are displayed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("historicData,Usage data,graph and note message are not displayed");
				componentsInformation.add(22, "Not Present");
			}

//arrow back
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back ')]"));
			if (arrowBack.isDisplayed()) {
				System.out.println("Arrow back is displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Arrow back is not displayed");
				componentsInformation.add(23, "Not Present");
			}
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

//increase quota
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[2]"));
			if (increaseQuota.isDisplayed()) {
				System.out.println("Increase Quota for historic data credit is displayed");
				componentsInformation.add(24, "Present");
			} else {
				System.out.println("Increase Quota for historic data credit is not displayed");
				componentsInformation.add(24, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(25, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(25, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +10k ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +25k ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(26, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(26, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(27, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(27, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void userLicenseUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//userlicense
			WebElement userLicenseHeading = driver
					.findElement(By.xpath("(//p[@class='text__title--font colored__blue--dark'])[1]"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[3]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[3]"));
			if (userLicenseHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("User license heading,limit,increase quota are displayed");
				componentsInformation.add(28, "Present");
			} else {
				System.out.println("User license heading,limit,increase quota are not displayed");
				componentsInformation.add(28, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(29, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(29, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(30, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(30, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(31, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(31, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void socialMediaUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//socialmedia
			WebElement socialMediaHeading = driver
					.findElement(By.xpath("(//p[@class='text__title--font colored__blue--dark'])[2]"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[4]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[4]"));
			if (socialMediaHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("Social Media profile heading,limit,increase quota are displayed");
				componentsInformation.add(32, "Present");
			} else {
				System.out.println("Social Media profile heading,limit,increase quota are not displayed");
				componentsInformation.add(32, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(33, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(33, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(34, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(34, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(35, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(35, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void topicKeywordSearchUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//topic/keyword search
			WebElement topicSearchHeading = driver
					.findElement(By.xpath("//span[contains(text(),'Topic/Keyword Search')]"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[5]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[5]"));
			if (topicSearchHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("topic/keyword search heading,limit,increase quota are displayed");
				componentsInformation.add(36, "Present");
			} else {
				System.out.println("topic/keyword search heading,limit,increase quota are not displayed");
				componentsInformation.add(36, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(37, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(37, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(38, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(38, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(39, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(39, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void brandUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//brand
			WebElement brandHeading = driver.findElement(By.xpath("(//span[contains(text(),'Brand')])[2]"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[6]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[6]"));
			if (brandHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("brand heading,limit,increase quota are displayed");
				componentsInformation.add(40, "Present");
			} else {
				System.out.println("brand heading,limit,increase quota are not displayed");
				componentsInformation.add(40, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(41, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(41, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(42, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(42, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(43, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(43, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void digitCommandCenterUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//digit command center
			WebElement digitCommandCenterHeading = driver
					.findElement(By.xpath("(//span[contains(text(),'Digital Command Center')])"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[7]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[7]"));
			if (digitCommandCenterHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("Digit command center heading,limit,increase quota are displayed");
				componentsInformation.add(44, "Present");
			} else {
				System.out.println("Digit command center heading,limit,increase quota are not displayed");
				componentsInformation.add(44, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(45, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(45, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(46, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(46, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(47, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(47, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void objectDetectionUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//objectDetection
			WebElement objectDetectionHeading = driver
					.findElement(By.xpath("(//span[contains(text(),'Object Detection')])[2]"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[8]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[8]"));
			if (objectDetectionHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("objectDetection heading,limit,increase quota are displayed");
				componentsInformation.add(48, "Present");
			} else {
				System.out.println("objectDetection heading,limit,increase quota are not displayed");
				componentsInformation.add(48, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(49, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(49, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(50, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(50, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(51, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(51, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void fbLocationUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//fbLocation
			WebElement fbLocationHeading = driver.findElement(By.xpath("(//span[contains(text(),'FB Location')])"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[9]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[9]"));
			if (fbLocationHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("fbLocation heading,limit,increase quota are displayed");
				componentsInformation.add(52, "Present");
			} else {
				System.out.println("fbLocation heading,limit,increase quota are not displayed");
				componentsInformation.add(52, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(53, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(53, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(54, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(54, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(55, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(55, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void gmbLocationUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//gmbLocation
			WebElement gmbLocationHeading = driver.findElement(By.xpath("(//span[contains(text(),'GMB Location')])"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[10]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[10]"));
			if (gmbLocationHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("GMBLocation heading,limit,increase quota are displayed");
				componentsInformation.add(56, "Present");
			} else {
				System.out.println("GMBLocation heading,limit,increase quota are not displayed");
				componentsInformation.add(56, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(57, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(57, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(58, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(58, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(59, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(59, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void otherChannelURLUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//otherChannelURL
			WebElement otherChannelURLHeading = driver
					.findElement(By.xpath("(//p[@class='text__title--font colored__blue--dark'])[9]"));
			WebElement limit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[11]"));
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[11]"));
			if (otherChannelURLHeading.isDisplayed() && limit.isDisplayed() && increaseQuota.isDisplayed()) {
				System.out.println("otherChannelURL heading,limit,increase quota are displayed");
				componentsInformation.add(60, "Present");
			} else {
				System.out.println("otherChannelURL heading,limit,increase quota are not displayed");
				componentsInformation.add(60, "Not Present");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

//morelimit heading& cross button
			WebElement moreLimitHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (moreLimitHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Morelimit heading and cross button are displayed");
				componentsInformation.add(61, "Present");
			} else {
				System.out.println("Morelimit heading and cross button are not displayed");
				componentsInformation.add(61, "Not Present");
			}

//current limit,extend field,increase limit field,field
			WebElement currentLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement currentLimit = driver.findElement(By.xpath("//p[@class='font-weight-600 font-size-24 mb-22']"));
			WebElement extendFieldHeading = driver.findElement(By.xpath("//p[@class='font-weight-500']"));
			WebElement extendField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement increaseLimitHeading = driver.findElement(By.xpath("//p[@class='font-weight-500 mb-4']"));
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			WebElement field = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			if (currentLimitHeading.isDisplayed() && currentLimit.isDisplayed() && extendFieldHeading.isDisplayed()
					&& extendField.isDisplayed() && increaseLimitHeading.isDisplayed()
					&& increaseLimitButton.isDisplayed() && increaseLimitButton1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Current limit,extend field,increase field and field are displayed");
				componentsInformation.add(62, "Present");
			} else {
				System.out.println("Current limit,extend field,increase field and field are not displayed");
				componentsInformation.add(62, "Not Present");
			}

//send request and cancel button
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (sendRequest.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Send request and cancel button is displayed");
				componentsInformation.add(63, "Present");
			} else {
				System.out.println("Send request and cancel button is not displayed");
				componentsInformation.add(63, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
