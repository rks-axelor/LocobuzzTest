package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzAWACreationOfDashboard {

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

	public static void createDashboard(WebDriver driver) throws Exception {
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

//verify the 3 buttons list
			/*
			 * WebElement threeButton=driver.findElement(By.
			 * xpath("//span[@class='ant-dropdown-trigger ant-dropdown-link fontSize-18 cursor-pointer']"
			 * )); js.executeScript("arguments[0].click()", threeButton);
			 * Thread.sleep(3000);
			 * 
			 * WebElement
			 * editButton=driver.findElement(By.xpath("//li[contains(text(),'Edit Widget')]"
			 * )); WebElement duplicateButton=driver.findElement(By.
			 * xpath("//li[contains(text(),'Duplicate Widget')]")); WebElement
			 * deleteButton=driver.findElement(By.
			 * xpath("//li[contains(text(),'Delete Widget')]"));
			 * if(editButton.isDisplayed()&&duplicateButton.isDisplayed()&&deleteButton.
			 * isDisplayed()) {
			 * System.out.println("Edit,Duplicate.Delete buttons are displayed"); } else {
			 * System.out.println("Edit,Duplicate.Delete buttons are not  displayed"); }
			 */

			//addSection(driver);
			
			addWidget(driver);

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

			WebElement field1 = driver.findElement(By.xpath("//button[contains(text(),'User Location')]"));
			js.executeScript("arguments[0].click()", field1);
			Thread.sleep(5000);

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
			sectionName.sendKeys("test6");

			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(5000);

			WebElement addsectionButton1 = driver.findElement(By.xpath("//div[contains(text(),'+ Add New Section')]"));
			if (addsectionButton1.isDisplayed()) {
				System.out.println("Add section button is displayed");
			} else {
				System.out.println("Add section button is not displayed");
			}

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

			WebElement baseWidget = driver.findElement(By.xpath("//div[contains(text(),'Base Widgets')]"));
			js.executeScript("arguments[0].click()", baseWidget);
			Thread.sleep(5000);

			WebElement checkbox = driver.findElement(By.xpath("(//span[@class='checklist '])[1]"));
			js.executeScript("arguments[0].click()", checkbox);
			Thread.sleep(3000);

			WebElement addWidgetButton = driver.findElement(By.xpath("//span[contains(text(),'Add Widget')]"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(5000);

			WebElement dashboardName = driver.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[1]"));
			dashboardName.sendKeys("test2");
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

			/*
			 * WebElement
			 * dots=driver.findElement(By.xpath("//span[@class='ant-dropdown-trigger']"));
			 * js.executeScript("arguments[0].click()", dots); Thread.sleep(3000);
			 * 
			 * WebElement
			 * pdf=driver.findElement(By.xpath("//li[contains(text(),'Download PDF')]"));
			 * WebElement
			 * ppt=driver.findElement(By.xpath("//span[contains(text(),'Download PPT')]"));
			 * WebElement
			 * share=driver.findElement(By.xpath("//li[contains(text(),'Share')]"));
			 * WebElement
			 * edit=driver.findElement(By.xpath("//div[contains(text(),'Edit')]"));
			 * WebElement delete=driver.findElement(By.
			 * xpath("(//li[contains(@class,'ant-menu-item text-Darkgray')])[3]"));
			 * if(pdf.isDisplayed()&&ppt.isDisplayed()&&share.isDisplayed()&&edit.
			 * isDisplayed()&&delete.isDisplayed()) {
			 * System.out.println("PPT,PDF,Share,Edit,Delete are displayed"); } else {
			 * System.out.println("PPT,PDF,Share,Edit,Delete are not displayed"); }
			 */

			WebElement plusIcon = driver.findElement(By.xpath("(//span[@class='anticon anticon-plus'])[1]"));
			js.executeScript("arguments[0].click()", plusIcon);
			Thread.sleep(3000);

			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search.sendKeys("test2");

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
