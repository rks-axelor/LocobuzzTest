package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAWAFiltersUserLocation {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void LoginFunctionality(WebDriver driver, String user) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement loginButton = driver
					.findElement(By.xpath("//button[@class='btn btn-primary mt-3' and text()='Login with Locobuzz']"));
			js.executeScript("arguments[0].click()", loginButton);
			Thread.sleep(3000);

			String[] loginData = CommonFunctions.readDataFromExcel(user);

			WebElement username = driver.findElement(By.xpath("//input[@class='username']"));
			username.sendKeys(loginData[0]);

			WebElement password = driver.findElement(By.xpath("//input[@class='password']"));
			password.sendKeys(loginData[1]);

			WebElement loginButton1 = driver.findElement(By.xpath("//button[@class='btn-login']"));
			loginButton1.click();
			Thread.sleep(7000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void Filters(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement alldashboards = driver.findElement(By.xpath("//span[contains(text(),'All Dashboards')]"));
			js.executeScript("arguments[0].click()", alldashboards);
			Thread.sleep(3000);
			WebElement createDashboard = driver
					.findElement(By.xpath("(//div[contains(@class,'text_heading-Slab')])[2]"));
			js.executeScript("arguments[0].click()", createDashboard);
			Thread.sleep(3000);
			WebElement addWidget = driver.findElement(By.xpath("//div[contains(text(),'Click to add widget')]"));
			js.executeScript("arguments[0].click()", addWidget);
			Thread.sleep(5000);

			WebElement widgetTab = driver.findElement(By.xpath("//div[contains(text(),'Select from AWA')]"));
			js.executeScript("arguments[0].click()", widgetTab);
			Thread.sleep(5000);

			WebElement field = driver.findElement(By.xpath("//button[contains(text(),'User Location')]"));
			js.executeScript("arguments[0].click()", field);
			Thread.sleep(5000);

//checklist
			WebElement checklist = driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]"));
			js.executeScript("arguments[0].click()", checklist);
			Thread.sleep(5000);

			WebElement addWidgetButton = driver.findElement(By.xpath("(//span[contains(text(),'Add Widget')])"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(15000);

//global filter
			WebElement filter = driver.findElement(
					By.xpath("//img[@src='/static/media/filterIcon.cd81bd08ded36dd8a26ed50656bfed9f.svg']"));
			js.executeScript("arguments[0].click()", filter);
			Thread.sleep(5000);

			WebElement userlocation = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[3]"));
			js.executeScript("arguments[0].click()", userlocation);
			Thread.sleep(5000);

			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search User Location']"));
			search.sendKeys("navi mumbai");
			Thread.sleep(5000);

			WebElement excludeButton = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[4]"));
			js.executeScript("arguments[0].click()", excludeButton);
			Thread.sleep(5000);

			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(10000);

//local filter
			Actions action = new Actions(driver);
			WebElement actionButton = driver
					.findElement(By.xpath("(//span[contains(@class,'ant-dropdown-trigger ant-dropdown-link')])[1]"));
			//js.executeScript("arguments[0].scrollIntoView();", actionButton);
			//action.click(actionButton).build().perform();
			action.moveToElement(actionButton).click();
			action.build().perform();
			//js.executeScript("arguments[0].click()", actionButton);
			//actionButton.click();
			Thread.sleep(10000);
			
			//WebElement shadowElement;
			//shadowElement=(WebElement) js.executeScript("return document.querySelector(\'#root > div > section > div:nth-child(2) > div > div:nth-child(4) > div > div.p-10.border-bottom.border-color.d-flex.justify-content-between.align-items-center > div.d-flex.align-items-center > div > span > i\')", "");
			//shadowElement.click();
			
			
			

			WebElement editButton =driver.findElement(By.xpath("(//img[@alt='Edit Widget' and @class='mr-2'])"));
			//js.executeScript("arguments[0].scrollIntoView();", editButton);
			//action.clickAndHold(actionButton).moveToElement(editButton).click().build().perform();
			//action.build().perform();
			editButton.click();
			Thread.sleep(3000);

			WebElement filterButton = driver.findElement(By.xpath("(//div[contains(text(),'Filters')])[4]"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(4000);
			
			WebElement sentiment=driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[28]"));
			js.executeScript("arguments[0].scrollIntoView();", sentiment);
			js.executeScript("arguments[0].click()", sentiment);
			Thread.sleep(4000);

			/*WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search User Location']"));
			search1.sendKeys("chennai");
			Thread.sleep(5000);*/

			WebElement includeButton = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[7]"));
			js.executeScript("arguments[0].click()", includeButton);
			Thread.sleep(5000);

			WebElement applyButton1 = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton1);
			Thread.sleep(10000);

			WebElement dashboardName = driver.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[1]"));
			dashboardName.sendKeys("filters test1");
			Thread.sleep(3000);

			WebElement dashboardDescription = driver
					.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[2]"));
			dashboardDescription.sendKeys("this information about filters of user location");
			Thread.sleep(3000);

			WebElement saveDashboard = driver.findElement(By.xpath("//span[contains(text(),'Save Dashboard')]"));
			js.executeScript("arguments[0].click()", saveDashboard);
			Thread.sleep(3000);

			WebElement saveDashboard1 = driver.findElement(By.xpath("(//span[contains(text(),'Save Dashboard')])[2]"));
			js.executeScript("arguments[0].click()", saveDashboard1);
			Thread.sleep(10000);

			WebElement brandName = driver.findElement(By.xpath(
					"//div[@class='border-color border text_regular cursor-pointer d-flex align-items-center justify-content-between']"));
			WebElement duration = driver
					.findElement(By.xpath("//div[@class='from-group floating-label-group d-flex']"));
			WebElement filter2 = driver.findElement(
					By.xpath("//span[@class='ant-avatar ant-avatar-sm ant-avatar-square ant-avatar-image']"));
			if (brandName.isDisplayed() && duration.isDisplayed() && filter2.isDisplayed()) {
				System.out.println("Brand name,duration,filter are displayed");
			} else {
				System.out.println("Brand name,duration,filter are not displayed");
			}

//apply the filter after dashboard is created
			WebElement filter3 = driver.findElement(
					By.xpath("//span[@class='ant-avatar ant-avatar-sm ant-avatar-square ant-avatar-image']"));
			js.executeScript("arguments[0].click()", filter3);
			Thread.sleep(10000);

			WebElement userlocation1 = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[3]"));
			js.executeScript("arguments[0].click()", userlocation1);
			Thread.sleep(5000);

			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search User Location']"));
			search2.sendKeys("India");
			Thread.sleep(5000);

			WebElement includeButton1 = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[6]"));
			js.executeScript("arguments[0].click()", includeButton1);
			Thread.sleep(5000);

			WebElement applyButton2 = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton2);
			Thread.sleep(10000);

			js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

			WebElement plusIcon = driver.findElement(By.xpath("(//span[@class='anticon anticon-plus'])[1]"));
			js.executeScript("arguments[0].click()", plusIcon);
			Thread.sleep(3000);

			WebElement search4 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search4.sendKeys("filters test1");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

// logout
	public static void logout(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			String URL="https://awa-staging.locobuzz.com/";
			driver.navigate().to(URL);
			driver.manage().deleteAllCookies();
			
			driver.navigate().refresh();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
