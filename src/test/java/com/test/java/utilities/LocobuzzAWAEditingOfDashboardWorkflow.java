package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAWAEditingOfDashboardWorkflow {

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
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void editingOfDashboard(WebDriver driver) throws Exception {
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

			WebElement widgetLibrary = driver.findElement(By.xpath("(//div[contains(text(),'Widget Library')])[1]"));
			js.executeScript("arguments[0].click()", widgetLibrary);
			Thread.sleep(8000);

			WebElement widget = driver.findElement(By.xpath("(//span[@class='checklist '])[1]"));
			js.executeScript("arguments[0].click()", widget);
			Thread.sleep(3000);

			WebElement addWidgetButton = driver.findElement(By.xpath("(//span[contains(text(),'Add Widget')])"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(15000);

			WebElement dashboardName = driver.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[1]"));
			dashboardName.sendKeys("test21");
			Thread.sleep(3000);

			WebElement dashboardDescription = driver
					.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[2]"));
			dashboardDescription.sendKeys("Editing the  widget");
			Thread.sleep(3000);

			WebElement saveDashboard = driver.findElement(By.xpath("//span[contains(text(),'Save Dashboard')]"));
			js.executeScript("arguments[0].click()", saveDashboard);
			Thread.sleep(3000);

			WebElement saveDashboard1 = driver.findElement(By.xpath("(//span[contains(text(),'Save Dashboard')])[2]"));
			js.executeScript("arguments[0].click()", saveDashboard1);
			Thread.sleep(10000);

			editProcess(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void editProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//edit
			Actions action = new Actions(driver);
			WebElement actionButton = driver.findElement(By.xpath("//span[@class='ant-dropdown-trigger']"));
			//js.executeScript("arguments[0].click()", actionButton);
			action.moveToElement(actionButton).click();
			action.build().perform();
			Thread.sleep(4000);

			WebElement editButton = driver.findElement(By.xpath("//div[@class='text-Darkgray' and text()='Edit']"));
			editButton.click();
			//js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(4000);

			WebElement widget = driver.findElement(By.xpath("//span[contains(text(),'+ Add Widget')]"));
			js.executeScript("arguments[0].scrollIntoView();", widget);

			js.executeScript("arguments[0].click()", widget);
			Thread.sleep(5000);

			WebElement widgetLibrary = driver.findElement(By.xpath("(//div[contains(text(),'Widget Library')])[1]"));
			js.executeScript("arguments[0].click()", widgetLibrary);
			Thread.sleep(8000);

			WebElement widget1 = driver.findElement(By.xpath("(//span[@class='checklist '])[2]"));
			js.executeScript("arguments[0].click()", widget1);
			Thread.sleep(3000);

			WebElement widget2 = driver.findElement(By.xpath("(//span[@class='checklist '])[2]"));
			js.executeScript("arguments[0].click()", widget2);
			Thread.sleep(3000);

			WebElement addWidgetButton = driver.findElement(By.xpath("(//span[contains(text(),'Add Widget')])"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(15000);

			addSection(driver);

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

			WebElement baseWidget = driver.findElement(By.xpath("//div[contains(text(),'Select from AWA')]"));
			js.executeScript("arguments[0].click()", baseWidget);
			Thread.sleep(5000);

			WebElement field1 = driver.findElement(By.xpath("//button[contains(text(),'User Location')]"));
			js.executeScript("arguments[0].click()", field1);
			Thread.sleep(10000);

//select the checklist
			WebElement checklist = driver.findElement(By.xpath("(//span[@class='checklist '])[2]"));
			js.executeScript("arguments[0].click()", checklist);
			Thread.sleep(3000);
			WebElement checklist1 = driver.findElement(By.xpath("(//span[@class='checklist '])[2]"));
			js.executeScript("arguments[0].click()", checklist1);
			Thread.sleep(3000);

			WebElement addSectionButton = driver.findElement(By.xpath("//span[contains(text(),'Add Section')]"));
			js.executeScript("arguments[0].click()", addSectionButton);
			Thread.sleep(3000);

			WebElement sectionName = driver.findElement(By.xpath("//input[@class='ant-input inputFiled']"));
			sectionName.sendKeys("testing");

			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(10000);

//apply filter for section
			WebElement filterButton = driver.findElement(
					By.xpath("//img[@src='/static/media/WidgetFilter.24d56b633185dcf28152a88720015df7.svg']"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(5000);

			WebElement filters = driver.findElement(By.xpath("(//div[contains(text(),'Filters')])[5]"));
			js.executeScript("arguments[0].click()", filters);
			Thread.sleep(5000);

			WebElement userlocation = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[3]"));
			js.executeScript("arguments[0].click()", userlocation);
			Thread.sleep(5000);

			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search User Location']"));
			search.sendKeys("chennai");
			Thread.sleep(5000);

			WebElement excludeButton = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[11]"));
			js.executeScript("arguments[0].click()", excludeButton);
			Thread.sleep(5000);

			WebElement lockFilter = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[11]"));
			js.executeScript("arguments[0].click()", lockFilter);
			Thread.sleep(5000);

			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(10000);

//apply the global filter
			WebElement filter = driver.findElement(
					By.xpath("//img[@src='/static/media/filterIcon.cd81bd08ded36dd8a26ed50656bfed9f.svg']"));
			js.executeScript("arguments[0].click()", filter);
			Thread.sleep(5000);

			WebElement userlocation1 = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[3]"));
			js.executeScript("arguments[0].click()", userlocation1);
			Thread.sleep(5000);

			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search User Location']"));
			search1.sendKeys("bangalore");
			Thread.sleep(5000);

			WebElement includeButton = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[3]"));
			js.executeScript("arguments[0].click()", includeButton);
			Thread.sleep(5000);

			WebElement applyButton1 = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton1);
			Thread.sleep(10000);

			WebElement saveChanges = driver.findElement(By.xpath("//span[contains(text(),'Save Changes')]"));
			js.executeScript("arguments[0].click()", saveChanges);
			Thread.sleep(4000);

			WebElement saveDashboard1 = driver.findElement(By.xpath("(//span[contains(text(),'Save Dashboard')])"));
			js.executeScript("arguments[0].click()", saveDashboard1);
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
