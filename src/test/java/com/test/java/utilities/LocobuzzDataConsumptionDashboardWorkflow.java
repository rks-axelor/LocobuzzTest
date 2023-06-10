package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzDataConsumptionDashboardWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void dataConsumptionDashboardProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//account settings
			WebElement accountSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Account Settings ')]"));
			js.executeScript("arguments[0].click()", accountSettings);
			Thread.sleep(3000);

//data consumption
			WebElement logo = driver.findElement(By.xpath("//img[@src='assets/account/menu/Data_Consumption.svg']"));
			WebElement label = driver.findElement(By.xpath("//span[contains(text(),'Data Consumption')]"));
			if (logo.isDisplayed() && label.isDisplayed()) {
				System.out.println("Data Consumption logo and label are displayed");
			} else {
				System.out.println("Data Consumption logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", label);
			Thread.sleep(3000);

//data consumption tab
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement tab = driver.findElement(By.xpath("(//span[contains(text(),'Data Consumption')])[2]"));
			if (pushpin.isDisplayed() && tab.isDisplayed()) {
				System.out.println("Data Consumption tab is displayed");
			} else {
				System.out.println("Data Consumption tab is not displayed");
			}
			js.executeScript("arguments[0].click()", tab);
			Thread.sleep(3000);

//data consumption(heading,information) and email symbol
			WebElement heading = driver
					.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-10 text__title--font')])[1]"));
			WebElement info = driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[1]"));
			WebElement noteMessage = driver
					.findElement(By.xpath("//div[contains(@class,'data-cons__header--note text__regular--sm')]"));
			WebElement emailSymbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'email')]"));
			if (heading.isDisplayed() && info.isDisplayed() && emailSymbol.isDisplayed() && noteMessage.isDisplayed()) {
				System.out.println("Data Consumption heading,information,note message and email symbol are displayed");
			} else {
				System.out.println(
						"Data Consumption heading,information,note message and email symbol are not displayed");
			}

//monthly data consumption(heading,usagelimit,showdetails)
			WebElement monthlyDataHeading = driver
					.findElement(By.xpath("//span[contains(text(),'Monthly Data Consumption')]"));
			WebElement usagelimit = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[1]"));
			WebElement showdetails = driver.findElement(By.xpath("//p[contains(text(),' Show Details ')]"));
			if (monthlyDataHeading.isDisplayed() && usagelimit.isDisplayed() && showdetails.isDisplayed()) {
				System.out.println("Monthly data consumption heading ,usage limit and showdetails are displayed");
			} else {
				System.out.println("Monthly data consumption heading ,usage limit and showdetails are not displayed");
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
			} else {
				System.out.println("Monthly data consumption heading and note message are not displayed");
			}

//fields of monthly consumption
			WebElement field1 = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[1]"));
			WebElement field2 = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[2]"));
			WebElement field3 = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[3]"));
			if (field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed()) {
				System.out.println("All fields are displayed");
			} else {
				System.out.println("All fields are not displayed");
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
			} else {
				System.out.println("show data heaidng and other fields are not displayed");
			}

//graph data brand information,graph data and note message
			WebElement graphDataInformation = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--show-body-right-counts')])[1]"));
			WebElement graphData = driver.findElement(By.xpath("(//div[@class='highcharts-container '])[1]"));
			WebElement noteMessage2 = driver.findElement(By.xpath("(//p[@class='text__light--sm ml-20'])[1]"));
			if (graphDataInformation.isDisplayed() && graphData.isDisplayed() && noteMessage2.isDisplayed()) {
				System.out.println("graph data information,graph data and note message are displayed");
			} else {
				System.out.println("graph data information,graph data and note message are not displayed");
			}

//other brand
			WebElement arrowButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'play_circle_filled')]"));
			js.executeScript("arguments[0].click()", arrowButton);
			Thread.sleep(3000);

			WebElement heading1 = driver.findElement(By.xpath("//h3[contains(text(),'Other Brands')]"));
			WebElement otherBrands = driver.findElement(By.xpath("(//mat-table[@class='mat-table cdk-table'])[2]"));
			if (heading1.isDisplayed() && otherBrands.isDisplayed()) {
				System.out.println("other brand heading and list are displayed");
			} else {
				System.out.println("other brand heading and list are not displayed");
			}

			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);

//graph data for brand
			WebElement deltaAirLine = driver.findElement(By.xpath("(//*[contains(text(),'Delta Air Lines')])[2]"));
			Actions ac = new Actions(driver);
			ac.moveToElement(deltaAirLine).build().perform();
			Thread.sleep(3000);

			WebElement sumitbrand = driver.findElement(By.xpath("(//*[contains(text(),'Sumit New Brand')])[1]"));
			Actions ac1 = new Actions(driver);
			ac1.moveToElement(sumitbrand).build().perform();
			Thread.sleep(3000);

			WebElement saurabhBrand = driver.findElement(By.xpath("(//*[contains(text(),'Saurabh Brand1')])[2]"));
			Actions ac2 = new Actions(driver);
			ac2.moveToElement(saurabhBrand).click().build().perform();
			Thread.sleep(3000);
			ac2.moveToElement(saurabhBrand).click().build().perform();
			Thread.sleep(3000);

//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			arrow.click();
			//js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand = driver.findElement(By.xpath("//input[@id='searchBrand']"));
			searchBrand.sendKeys("delta air lines");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),'Delta Air Lines')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//channel information,mentions,usage data ,note message
			WebElement channelInfomation = driver
					.findElement(By.xpath("//div[@class='historic-data-cons__body--channel-body-left-table']"));
			WebElement mentions = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--channel-body-right-counts')])[1]"));
			WebElement usageData = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--channel-body-right-counts')])[3]"));
			WebElement graph = driver.findElement(By.xpath("(//div[@class='highcharts-container '])[2]"));
			WebElement noteMessage3 = driver.findElement(By.xpath("(//p[@class='text__light--sm ml-20'])[2]"));
			if (channelInfomation.isDisplayed() && mentions.isDisplayed() && usageData.isDisplayed()
					&& graph.isDisplayed() && noteMessage3.isDisplayed()) {
				System.out.println("Mentions,Usage data,graph,channel information and note message are displayed");
			} else {
				System.out.println("Mentions,Usage data,graph,channel information and note message are not displayed");
			}

//usage data for channels
			WebElement twitter = driver.findElement(By.xpath("(//*[contains(text(),'Twitter')])[2]"));
			Actions ac3 = new Actions(driver);
			ac3.moveToElement(twitter).build().perform();
			Thread.sleep(3000);

			WebElement facebook = driver.findElement(By.xpath("(//*[contains(text(),'Facebook')])[2]"));
			Actions ac4 = new Actions(driver);
			ac4.moveToElement(facebook).click().build().perform();
			Thread.sleep(3000);
			ac4.moveToElement(facebook).click().build().perform();
			Thread.sleep(3000);

//duration
			WebElement durationButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'date_range')])[2]"));
			js.executeScript("arguments[0].click()", durationButton);
			Thread.sleep(3000);
			WebElement selectMonth = driver.findElement(By.xpath("//span[contains(text(),'Aug 2022')]"));
			js.executeScript("arguments[0].click()", selectMonth);
			Thread.sleep(30000);

			WebElement consumption = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[1]"));
			WebElement usage = driver.findElement(
					By.xpath("(//div[contains(@class,'border-right__light-grey d-flex-items-center')])[2]"));
			if (consumption.isDisplayed() && usage.isDisplayed()) {
				System.out.println("Consumption and usage are displayed");
			} else {
				System.out.println("Consumption and usage are not displayed");
			}

//arrow back
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back ')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

//increase quota
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[1]"));
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +10k ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton);
			Thread.sleep(3000);
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +25k ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton1);
			Thread.sleep(3000);

			WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area.sendKeys("please increase");

//send request 
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest);
			Thread.sleep(3000);

			historicDataProcess(driver);
			increaseQuotaForLicenses(driver);
			remainingIncreaseQuotaForLicenses(driver);
			
//change month
			WebElement changeMonth=driver.findElement(By.xpath("//mat-icon[contains(text(),'date_range')]"));
			js.executeScript("arguments[0].click()", changeMonth);
			Thread.sleep(3000);
			WebElement selectMonth1=driver.findElement(By.xpath("//span[contains(text(),'Aug 2022')]"));
			js.executeScript("arguments[0].click()", selectMonth1);
			Thread.sleep(5000);
			WebElement monthData=driver.findElement(By.xpath("//span[contains(text(),'Monthly Data Consumption')]"));
			WebElement usagelimit2 = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[1]"));
			if(monthData.isDisplayed()&&usagelimit2.isDisplayed()) {
				System.out.println("Monthdata and usage limit of aug are displayed");
			}
			else {
				System.out.println("Monthdata and usage limit of aug are not displayed");
			}

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

	public static void historicDataProcess(WebDriver driver) throws Exception {
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
			} else {
				System.out.println("Historic heading,usage limit,show details button are not displayed");
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
			} else {
				System.out.println("Historic consumption heading and fields are not displayed");
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
			} else {
				System.out.println("Show data heading,fields,brand data are not displayed");
			}

//other brands
			WebElement arrowButton = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'play_circle_filled')])[1]"));
			js.executeScript("arguments[0].click()", arrowButton);
			Thread.sleep(3000);

			WebElement heading1 = driver.findElement(By.xpath("//h3[contains(text(),'Other Engagements')]"));
			WebElement otherBrands = driver.findElement(By.xpath("(//mat-table[@class='mat-table cdk-table'])[2]"));
			if (heading1.isDisplayed() && otherBrands.isDisplayed()) {
				System.out.println("other engagements heading and list are displayed");
			} else {
				System.out.println("other engagements heading and list are not displayed");
			}

			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);

//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			arrow.click();
			//js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand = driver.findElement(By.xpath("//input[@id='searchBrand1']"));
			searchBrand.sendKeys("medlife bot");
			WebElement selectBrand = driver.findElement(By.xpath("(//span[contains(text(),'Medlife Bot')])"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//channel information,mentions,usage data ,note message
			WebElement channelInfomation = driver
					.findElement(By.xpath("//div[@class='historic-data-cons__body--channel-body-left-table']"));
			WebElement historicData = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--channel-body-right-counts')])[1]"));
			WebElement usageData = driver.findElement(
					By.xpath("(//div[contains(@class,'historic-data-cons__body--channel-body-right-counts')])[3]"));
			WebElement graph = driver.findElement(By.xpath("(//div[@class='highcharts-container '])"));
			WebElement noteMessage3 = driver.findElement(By.xpath("(//p[@class='text__light--sm ml-20'])"));
			if (channelInfomation.isDisplayed() && historicData.isDisplayed() && usageData.isDisplayed()
					&& graph.isDisplayed() && noteMessage3.isDisplayed()) {
				System.out.println("channel information,historicData,Usage data,graph and note message are displayed");
			} else {
				System.out.println(
						"channel information,historicData,Usage data,graph and note message are not displayed");
			}

//other brands
			WebElement arrowButton1 = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'play_circle_filled')])[2]"));
			js.executeScript("arguments[0].click()", arrowButton1);
			Thread.sleep(3000);

			WebElement heading2 = driver.findElement(By.xpath("//h3[contains(text(),' Other Channels')]"));
			WebElement otherBrands1 = driver.findElement(By.xpath("(//mat-table[@class='mat-table cdk-table'])[2]"));
			if (heading2.isDisplayed() && otherBrands1.isDisplayed()) {
				System.out.println("other channels heading and list are displayed");
			} else {
				System.out.println("other channels heading and list are not displayed");
			}

			WebElement crossButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", crossButton1);
			Thread.sleep(3000);

//usage data for channels
			WebElement twitter = driver.findElement(By.xpath("(//*[contains(text(),'Twitter')])"));
			Actions ac3 = new Actions(driver);
			ac3.moveToElement(twitter).build().perform();
			Thread.sleep(3000);

			WebElement facebook = driver.findElement(By.xpath("(//*[contains(text(),'Facebook')])"));
			Actions ac4 = new Actions(driver);
			ac4.moveToElement(facebook).click().build().perform();
			Thread.sleep(3000);
			ac4.moveToElement(facebook).click().build().perform();
			Thread.sleep(3000);

//arrow back
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back ')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

//increase quota
			WebElement increaseQuota = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[1]"));
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);
			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +10k ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton);
			Thread.sleep(3000);
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +25k ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton1);
			Thread.sleep(3000);

			WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area.sendKeys("please increase");

//send request 
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void increaseQuotaForLicenses(WebDriver driver) throws Exception {
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
			} else {
				System.out.println("User license heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton);
			Thread.sleep(3000);
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton1);
			Thread.sleep(3000);

			WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area.sendKeys("please increase");

//send request 
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest);
			Thread.sleep(3000);

//socialmedia
			WebElement socialMediaHeading = driver
					.findElement(By.xpath("(//p[@class='text__title--font colored__blue--dark'])[2]"));
			WebElement limit1 = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[4]"));
			WebElement increaseQuota1 = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[4]"));
			if (socialMediaHeading.isDisplayed() && limit1.isDisplayed() && increaseQuota1.isDisplayed()) {
				System.out.println("Social Media profile heading,limit,increase quota are displayed");
			} else {
				System.out.println("Social Media profile heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota1);
			Thread.sleep(3000);

			WebElement increaseLimitButton2 = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton2);
			Thread.sleep(3000);
			WebElement increaseLimitButton3 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton3);
			Thread.sleep(3000);

			WebElement area1 = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area1.sendKeys("please increase");

//send request 
			WebElement sendRequest1 = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest1);
			Thread.sleep(3000);

//topic/keyword search
			WebElement topicSearchHeading = driver
					.findElement(By.xpath("//span[contains(text(),'Topic/Keyword Search')]"));
			WebElement limit2 = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[5]"));
			WebElement increaseQuota2 = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[5]"));
			if (topicSearchHeading.isDisplayed() && limit2.isDisplayed() && increaseQuota2.isDisplayed()) {
				System.out.println("topic/keyword search heading,limit,increase quota are displayed");
			} else {
				System.out.println("topic/keyword search heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota2);
			Thread.sleep(3000);

			WebElement increaseLimitButton4 = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton4);
			Thread.sleep(3000);
			WebElement increaseLimitButton5 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton5);
			Thread.sleep(3000);

			WebElement area2 = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area2.sendKeys("please increase");

//send request 
			WebElement sendRequest2 = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest2);
			Thread.sleep(3000);

//brand
			WebElement brandHeading = driver.findElement(By.xpath("(//span[contains(text(),'Brand')])[2]"));
			WebElement limit3 = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[6]"));
			WebElement increaseQuota3 = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[6]"));
			if (brandHeading.isDisplayed() && limit3.isDisplayed() && increaseQuota3.isDisplayed()) {
				System.out.println("brand heading,limit,increase quota are displayed");
			} else {
				System.out.println("brand heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota3);
			Thread.sleep(3000);

			WebElement increaseLimitButton6 = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton6);
			Thread.sleep(3000);
			WebElement increaseLimitButton7 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton7);
			Thread.sleep(3000);

			WebElement area3 = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area3.sendKeys("please increase");

//send request 
			WebElement sendRequest3 = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest3);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void remainingIncreaseQuotaForLicenses(WebDriver driver) throws Exception {
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
			} else {
				System.out.println("Digit command center heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota);
			Thread.sleep(3000);

			WebElement increaseLimitButton = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton);
			Thread.sleep(3000);
			WebElement increaseLimitButton1 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton1);
			Thread.sleep(3000);

			WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area.sendKeys("please increase");

//send request 
			WebElement sendRequest = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest);
			Thread.sleep(3000);

//objectDetection
			WebElement objectDetectionHeading = driver
					.findElement(By.xpath("(//span[contains(text(),'Object Detection')])[2]"));
			WebElement limit1 = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[8]"));
			WebElement increaseQuota1 = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[8]"));
			if (objectDetectionHeading.isDisplayed() && limit1.isDisplayed() && increaseQuota1.isDisplayed()) {
				System.out.println("objectDetection heading,limit,increase quota are displayed");
			} else {
				System.out.println("objectDetection heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota1);
			Thread.sleep(3000);

			WebElement increaseLimitButton2 = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton2);
			Thread.sleep(3000);
			WebElement increaseLimitButton3 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton3);
			Thread.sleep(3000);

			WebElement area1 = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area1.sendKeys("please increase");

//send request 
			WebElement sendRequest1 = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest1);
			Thread.sleep(3000);

//fbLocation
			WebElement fbLocationHeading = driver.findElement(By.xpath("(//span[contains(text(),'FB Location')])"));
			WebElement limit2 = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[9]"));
			WebElement increaseQuota2 = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[9]"));
			if (fbLocationHeading.isDisplayed() && limit2.isDisplayed() && increaseQuota2.isDisplayed()) {
				System.out.println("fbLocation heading,limit,increase quota are displayed");
			} else {
				System.out.println("fbLocation heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota2);
			Thread.sleep(3000);

			WebElement increaseLimitButton4 = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton4);
			Thread.sleep(3000);
			WebElement increaseLimitButton5 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton5);
			Thread.sleep(3000);

			WebElement area2 = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area2.sendKeys("please increase");

//send request 
			WebElement sendRequest2 = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest2);
			Thread.sleep(3000);

//gmbLocation
			WebElement gmbLocationHeading = driver.findElement(By.xpath("(//span[contains(text(),'GMB Location')])"));
			WebElement limit3 = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[10]"));
			WebElement increaseQuota3 = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[10]"));
			if (gmbLocationHeading.isDisplayed() && limit3.isDisplayed() && increaseQuota3.isDisplayed()) {
				System.out.println("GMBLocation heading,limit,increase quota are displayed");
			} else {
				System.out.println("GMBLocation heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota3);
			Thread.sleep(3000);

			WebElement increaseLimitButton6 = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton6);
			Thread.sleep(3000);
			WebElement increaseLimitButton7 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton7);
			Thread.sleep(3000);

			WebElement area3 = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area3.sendKeys("please increase");

//send request 
			WebElement sendRequest3 = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest3);
			Thread.sleep(3000);

//otherChannelURL
			WebElement otherChannelURLHeading = driver
					.findElement(By.xpath("(//p[@class='text__title--font colored__blue--dark'])[9]"));
			WebElement limit4 = driver.findElement(By.xpath("(//div[@class='data-cons__body--card-center'])[11]"));
			WebElement increaseQuota4 = driver.findElement(By.xpath("(//p[contains(text(),' Increase Quota ')])[11]"));
			if (otherChannelURLHeading.isDisplayed() && limit4.isDisplayed() && increaseQuota4.isDisplayed()) {
				System.out.println("otherChannelURL heading,limit,increase quota are displayed");
			} else {
				System.out.println("otherChannelURL heading,limit,increase quota are not displayed");
			}
			js.executeScript("arguments[0].click()", increaseQuota4);
			Thread.sleep(3000);

			WebElement increaseLimitButton8 = driver.findElement(By.xpath("//span[contains(text(),' +5 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton8);
			Thread.sleep(3000);
			WebElement increaseLimitButton9 = driver.findElement(By.xpath("//span[contains(text(),' +10 ')]"));
			js.executeScript("arguments[0].click()", increaseLimitButton9);
			Thread.sleep(3000);

			WebElement area4 = driver.findElement(By.xpath("//textarea[@placeholder='Please add details....']"));
			area4.sendKeys("please increase");

//send request 
			WebElement sendRequest4 = driver.findElement(By.xpath("//span[contains(text(),' Send Request ')]"));
			js.executeScript("arguments[0].click()", sendRequest4);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
