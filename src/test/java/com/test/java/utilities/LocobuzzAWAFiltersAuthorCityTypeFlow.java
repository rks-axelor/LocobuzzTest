package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzAWAFiltersAuthorCityTypeFlow {

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

			WebElement field = driver.findElement(By.xpath("//button[contains(text(),'Marked Influencer Category')]"));
			js.executeScript("arguments[0].click()", field);
			Thread.sleep(10000);

//adding the x 
			WebElement xattribute = driver.findElement(By.xpath("(//span[@class='position-absolute'])[1]"));
			js.executeScript("arguments[0].click()", xattribute);
			Thread.sleep(5000);

			WebElement attribute = driver.findElement(By.xpath("//li[contains(text(),'Author Type')]"));
			js.executeScript("arguments[0].click()", attribute);
			Thread.sleep(10000);

			WebElement checklist = driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]"));
			js.executeScript("arguments[0].click()", checklist);
			Thread.sleep(5000);

			WebElement addWidgetButton = driver.findElement(By.xpath("(//span[contains(text(),'Add Widget')])"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(15000);

			addSection(driver);

// global filter
			WebElement filter = driver.findElement(
					By.xpath("//img[@src='/static/media/filterIcon.cd81bd08ded36dd8a26ed50656bfed9f.svg']"));
			js.executeScript("arguments[0].click()", filter);
			Thread.sleep(5000);

			WebElement city = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[4]"));
			js.executeScript("arguments[0].click()", city);
			Thread.sleep(4000);

			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search City']"));
			search1.sendKeys("india");
			Thread.sleep(5000);

			WebElement includeButton = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[5]"));
			js.executeScript("arguments[0].click()", includeButton);
			Thread.sleep(5000);

			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(10000);
			
			WebElement dashboardName = driver.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[1]"));
			dashboardName.sendKeys("sectionfilters");
			Thread.sleep(3000);

			WebElement dashboardDescription = driver
					.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[2]"));
			dashboardDescription.sendKeys("this information about filters of section");
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
			
			WebElement plusIcon = driver.findElement(By.xpath("(//span[@class='anticon anticon-plus'])[1]"));
			js.executeScript("arguments[0].click()", plusIcon);
			Thread.sleep(3000);

			WebElement search4 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search4.sendKeys("sectionfilters");



		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void addSection(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//add section
			WebElement addSection = driver.findElement(By.xpath("//span[contains(text(),'+ Add Section')]"));
			js.executeScript("arguments[0].click()", addSection);
			Thread.sleep(5000);

//select from awa
			WebElement selectAwa = driver.findElement(By.xpath("//div[contains(text(),'Select from AWA')]"));
			js.executeScript("arguments[0].click()", selectAwa);
			Thread.sleep(5000);

			WebElement field1 = driver.findElement(By.xpath("//button[contains(text(),'City')]"));
			js.executeScript("arguments[0].click()", field1);
			Thread.sleep(10000);

//select the checklist
			WebElement checklist = driver.findElement(By.xpath("(//span[@class='checklist '])[1]"));
			js.executeScript("arguments[0].click()", checklist);
			Thread.sleep(3000);
			WebElement checklist1 = driver.findElement(By.xpath("(//span[@class='checklist '])[2]"));
			js.executeScript("arguments[0].click()", checklist1);
			Thread.sleep(3000);

			WebElement addSectionButton = driver.findElement(By.xpath("//span[contains(text(),'Add Section')]"));
			js.executeScript("arguments[0].click()", addSectionButton);
			Thread.sleep(3000);

			WebElement sectionName = driver.findElement(By.xpath("//input[@class='ant-input inputFiled']"));
			sectionName.sendKeys("test");

			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(10000);

//filters
			WebElement sectionFilter = driver.findElement(
					By.xpath("//img[@src='/static/media/WidgetFilter.24d56b633185dcf28152a88720015df7.svg']"));
			js.executeScript("arguments[0].click()", sectionFilter);
			Thread.sleep(5000);

			WebElement filterButton = driver.findElement(By.xpath("(//div[contains(text(),'Filters')])[6]"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(10000);

			WebElement city = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[4]"));
			js.executeScript("arguments[0].click()", city);
			Thread.sleep(4000);

			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search City']"));
			search1.sendKeys("chennai");
			Thread.sleep(5000);

			WebElement includeButton = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[9]"));
			js.executeScript("arguments[0].click()", includeButton);
			Thread.sleep(5000);

			WebElement applyButton1 = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton1);
			Thread.sleep(10000);

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
