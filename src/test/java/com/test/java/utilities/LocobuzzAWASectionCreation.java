package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzAWASectionCreation {

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

	public static void SelectionCreation(WebDriver driver) throws Exception {
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

//add section
			WebElement addSection = driver.findElement(By.xpath("//span[contains(text(),'+ Add Section')]"));
			js.executeScript("arguments[0].click()", addSection);
			Thread.sleep(7000);

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

			WebElement addsection = driver.findElement(By.xpath("//span[contains(text(),'Add Section')]"));
			js.executeScript("arguments[0].click()", addsection);
			Thread.sleep(3000);

			WebElement sectionName = driver.findElement(By.xpath("//input[@class='ant-input inputFiled']"));
			sectionName.sendKeys("Widget test");

			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(10000);

			addSectionForSelectFromAWA(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void addSectionForSelectFromAWA(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//add section
			WebElement addSection = driver.findElement(By.xpath("//div[contains(text(),'+ Add New Section')]"));
			js.executeScript("arguments[0].click()", addSection);
			Thread.sleep(7000);

//select from awa
			WebElement selectAwa = driver.findElement(By.xpath("//div[contains(text(),'Select from AWA')]"));
			js.executeScript("arguments[0].click()", selectAwa);
			Thread.sleep(5000);

			WebElement field1 = driver.findElement(By.xpath("//button[contains(text(),'Marked Influencer Category')]"));
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
			sectionName.sendKeys("Awa test");

			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(10000);

			addSectionFormBaseWidget(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void addSectionFormBaseWidget(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//add section
			WebElement addSection = driver.findElement(By.xpath("//div[contains(text(),'+ Add New Section')]"));
			js.executeScript("arguments[0].click()", addSection);
			Thread.sleep(7000);

			WebElement baseWidget = driver.findElement(By.xpath("//div[contains(text(),'Base Widgets')]"));
			js.executeScript("arguments[0].click()", baseWidget);
			Thread.sleep(5000);

			WebElement checkbox = driver.findElement(By.xpath("(//span[@class='checklist '])[1]"));
			js.executeScript("arguments[0].click()", checkbox);
			Thread.sleep(3000);

			WebElement checkbox1 = driver.findElement(By.xpath("(//span[@class='checklist '])[1]"));
			js.executeScript("arguments[0].click()", checkbox1);
			Thread.sleep(3000);

			WebElement addSectionButton = driver.findElement(By.xpath("//span[contains(text(),'Add Section')]"));
			js.executeScript("arguments[0].click()", addSectionButton);
			Thread.sleep(3000);

			WebElement sectionName = driver.findElement(By.xpath("//input[@class='ant-input inputFiled']"));
			sectionName.sendKeys("base test");

			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(10000);

			WebElement dashboardName = driver.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[1]"));
			dashboardName.sendKeys("Section Test");
			Thread.sleep(3000);

			WebElement dashboardDescription = driver
					.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[2]"));
			dashboardDescription.sendKeys("this information about selection creation");
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
			search.sendKeys("Section Test");

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
