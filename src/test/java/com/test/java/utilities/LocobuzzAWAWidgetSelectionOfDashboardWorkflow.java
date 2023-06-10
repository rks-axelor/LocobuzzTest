package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzAWAWidgetSelectionOfDashboardWorkflow {

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

	public static void WidgetSelection(WebDriver driver) throws Exception {
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
			WebElement widget1 = driver.findElement(By.xpath("(//span[@class='checklist '])[2]"));
			js.executeScript("arguments[0].click()", widget1);
			Thread.sleep(3000);
			WebElement widget2 = driver.findElement(By.xpath("(//span[@class='checklist '])[3]"));
			js.executeScript("arguments[0].click()", widget2);
			Thread.sleep(3000);

			WebElement addWidgetButton = driver.findElement(By.xpath("(//span[contains(text(),'Add Widget')])"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(15000);

			addWidget(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void addWidget(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement widget = driver.findElement(By.xpath("//span[contains(text(),'+ Add Widget')]"));
			js.executeScript("arguments[0].scrollIntoView();", widget);

			js.executeScript("arguments[0].click()", widget);
			Thread.sleep(5000);

			WebElement widget1 = driver.findElement(By.xpath("(//span[@class='checklist '])[4]"));
			js.executeScript("arguments[0].click()", widget1);
			Thread.sleep(3000);
			WebElement widget2 = driver.findElement(By.xpath("(//span[@class='checklist '])[5]"));
			js.executeScript("arguments[0].click()", widget2);
			Thread.sleep(3000);
			WebElement widget3 = driver.findElement(By.xpath("(//span[@class='checklist '])[4]"));
			js.executeScript("arguments[0].click()", widget3);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", widget3);
			Thread.sleep(3000);

			WebElement addWidgetButton = driver.findElement(By.xpath("(//span[contains(text(),'Add Widget')])"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(15000);

			WebElement widget4 = driver.findElement(By.xpath("//span[contains(text(),'+ Add Widget')]"));
			js.executeScript("arguments[0].scrollIntoView();", widget4);

			js.executeScript("arguments[0].click()", widget4);
			Thread.sleep(5000);

			WebElement baseWidget = driver.findElement(By.xpath("//div[contains(text(),'Base Widgets')]"));
			js.executeScript("arguments[0].click()", baseWidget);
			Thread.sleep(5000);

			WebElement checkbox = driver.findElement(By.xpath("(//span[@class='checklist '])[1]"));
			js.executeScript("arguments[0].click()", checkbox);
			Thread.sleep(3000);

			WebElement checkbox1 = driver.findElement(By.xpath("(//span[@class='checklist '])[2]"));
			js.executeScript("arguments[0].click()", checkbox1);
			Thread.sleep(3000);

			WebElement addWidgetButton1 = driver.findElement(By.xpath("//span[contains(text(),'Add Widget')]"));
			js.executeScript("arguments[0].click()", addWidgetButton1);
			Thread.sleep(5000);

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

			WebElement reorderWidget = driver.findElement(By.xpath("(//span[contains(@class,'checklist')])[1]"));
			js.executeScript("arguments[0].click()", reorderWidget);
			Thread.sleep(3000);
			WebElement addnumber=driver.findElement(By.xpath("(//input[@class='ant-input checklist p-0 m-0 text-center text_regular border-0'])[1]"));
			js.executeScript("arguments[0].click()", addnumber);
			addnumber.clear();
			addnumber.sendKeys("2");
			Thread.sleep(1000);
			WebElement rightButton = driver.findElement(
					By.xpath("(//button[@class='ant-btn checklist active p-0 m-0 border-0 border-radius-0'])[1]"));
			js.executeScript("arguments[0].click()", rightButton);
			Thread.sleep(3000);

			WebElement dashboardName = driver.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[1]"));
			dashboardName.sendKeys("valid test");
			Thread.sleep(3000);

			WebElement dashboardDescription = driver
					.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[2]"));
			dashboardDescription.sendKeys("this information about widget");
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
			WebElement filter = driver.findElement(
					By.xpath("//span[@class='ant-avatar ant-avatar-sm ant-avatar-square ant-avatar-image']"));
			if (brandName.isDisplayed() && duration.isDisplayed() && filter.isDisplayed()) {
				System.out.println("Brand name,duration,filter are displayed");
			} else {
				System.out.println("Brand name,duration,filter are not displayed");
			}

			WebElement plusIcon = driver.findElement(By.xpath("(//span[@class='anticon anticon-plus'])[1]"));
			js.executeScript("arguments[0].click()", plusIcon);
			Thread.sleep(3000);

			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search.sendKeys("valid test");

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
