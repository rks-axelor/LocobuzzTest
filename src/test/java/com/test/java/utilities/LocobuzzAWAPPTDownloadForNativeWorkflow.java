package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAWAPPTDownloadForNativeWorkflow {

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

	public static void pptDownloadNative(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement alldashboards = driver.findElement(By.xpath("//span[contains(text(),'All Dashboards')]"));
			js.executeScript("arguments[0].click()", alldashboards);
			Thread.sleep(3000);
			WebElement createDashboard = driver
					.findElement(By.xpath("//span[contains(text(),'Create New Dashboard')]"));
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

			WebElement widget1 = driver.findElement(By.xpath("(//span[@class='checklist '])[1]"));
			js.executeScript("arguments[0].click()", widget1);
			Thread.sleep(3000);

			WebElement widget2 = driver.findElement(By.xpath("(//span[@class='checklist '])[2]"));
			js.executeScript("arguments[0].click()", widget2);
			Thread.sleep(3000);

			WebElement widget3 = driver.findElement(By.xpath("(//span[@class='checklist '])[3]"));
			js.executeScript("arguments[0].click()", widget3);
			Thread.sleep(3000);

			WebElement addWidgetButton = driver.findElement(By.xpath("(//span[contains(text(),'Add Widget')])"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(15000);

			WebElement dashboardName = driver.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[1]"));
			dashboardName.sendKeys("test for native ppt1");
			Thread.sleep(3000);

			WebElement dashboardDescription = driver
					.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[2]"));
			dashboardDescription.sendKeys("Testing for ppt download for native");
			Thread.sleep(3000);

			WebElement saveDashboard = driver.findElement(By.xpath("//span[contains(text(),'Save Dashboard')]"));
			js.executeScript("arguments[0].click()", saveDashboard);
			Thread.sleep(3000);

			WebElement saveDashboard1 = driver.findElement(By.xpath("(//span[contains(text(),'Save Dashboard')])[2]"));
			js.executeScript("arguments[0].click()", saveDashboard1);
			Thread.sleep(10000);

			pptDownloadProcess(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void pptDownloadProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//filters
			WebElement filterButton=driver.findElement(By.xpath("//img[@src='/static/media/filterIcon.cd81bd08ded36dd8a26ed50656bfed9f.svg']"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(5000);
			
			WebElement markinfluencer = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[1]"));
			js.executeScript("arguments[0].click()", markinfluencer);
			Thread.sleep(5000);
			
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Marked Influencer Category']"));
			search.sendKeys("abc");
			Thread.sleep(5000);

			WebElement excludeButton = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[3]"));
			js.executeScript("arguments[0].click()", excludeButton);
			Thread.sleep(5000);
			
			WebElement markinfluencer1 = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[1]"));
			js.executeScript("arguments[0].click()", markinfluencer1);
			Thread.sleep(5000);
			
			WebElement influencer = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[4]"));
			js.executeScript("arguments[0].click()", influencer);
			Thread.sleep(5000);
			
			WebElement excludeButton1 = driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[3]"));
			js.executeScript("arguments[0].click()", excludeButton1);
			Thread.sleep(5000);
			
			WebElement influencer1 = driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[4]"));
			js.executeScript("arguments[0].click()", influencer1);
			Thread.sleep(5000);
			
			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(10000);

//ppt
			Actions action = new Actions(driver);
			WebElement actionButton = driver.findElement(By.xpath("//span[@class='ant-dropdown-trigger']"));
			action.moveToElement(actionButton).click();
			action.build().perform();
			Thread.sleep(4000);

			WebElement pptButton = driver.findElement(
					By.xpath("//img[@src='/static/media/PPT_Icon-gray.072eea0b685ea576472645c934315216.svg']"));
			pptButton.click();
			Thread.sleep(4000);

			WebElement nativeButton = driver.findElement(By.xpath("//div[contains(text(),'Download as Native')]"));
			js.executeScript("arguments[0].click()", nativeButton);
			Thread.sleep(3000);

			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);

			WebElement selectPreview = driver.findElement(By
					.xpath("(//div[contains(@class,'border mb-15 cursor-pointer overflow-hidden border_width2')])[2]"));
			js.executeScript("arguments[0].click()", selectPreview);
			Thread.sleep(3000);

			WebElement previewButton = driver.findElement(By.xpath("(//span[contains(text(),'Preview')])[2]"));
			js.executeScript("arguments[0].click()", previewButton);
			Thread.sleep(3000);

			WebElement sideBar = driver
					.findElement(By.xpath("//i[@class='fa slide-btn fa-angle-right cursor-pointer']"));
			js.executeScript("arguments[0].click()", sideBar);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", sideBar);
			Thread.sleep(3000);

			WebElement downloadPPT = driver.findElement(By.xpath("(//span[contains(text(),'Download PPT')])[3]"));
			js.executeScript("arguments[0].click()", downloadPPT);
			//Thread.sleep(10000);
			TimeUnit.MINUTES.sleep(1);

			WebElement plusIcon = driver.findElement(By.xpath("(//span[@class='anticon anticon-plus'])[1]"));
			js.executeScript("arguments[0].click()", plusIcon);
			Thread.sleep(3000);

			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search1.sendKeys("test for native ppt1");

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
