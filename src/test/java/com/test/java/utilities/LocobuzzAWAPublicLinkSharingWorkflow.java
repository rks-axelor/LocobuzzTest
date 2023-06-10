package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAWAPublicLinkSharingWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();
	public static String linkIDValue;

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

	public static void publicLinkSharing(WebDriver driver) throws Exception {
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

			WebElement addWidgetButton = driver.findElement(By.xpath("(//span[contains(text(),'Add Widget')])"));
			js.executeScript("arguments[0].click()", addWidgetButton);
			Thread.sleep(15000);

			WebElement dashboardName = driver.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[1]"));
			dashboardName.sendKeys("testing2");
			Thread.sleep(3000);

			WebElement dashboardDescription = driver
					.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[2]"));
			dashboardDescription.sendKeys("Testing for public link");
			Thread.sleep(3000);

			WebElement saveDashboard = driver.findElement(By.xpath("//span[contains(text(),'Save Dashboard')]"));
			js.executeScript("arguments[0].click()", saveDashboard);
			Thread.sleep(3000);

			WebElement saveDashboard1 = driver.findElement(By.xpath("(//span[contains(text(),'Save Dashboard')])[2]"));
			js.executeScript("arguments[0].click()", saveDashboard1);
			Thread.sleep(10000);

			linkSharingProcess(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void linkSharingProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//share
			Actions action = new Actions(driver);
			WebElement actionButton = driver.findElement(By.xpath("//span[@class='ant-dropdown-trigger']"));
			action.moveToElement(actionButton).click();
			action.build().perform();
			Thread.sleep(4000);

			WebElement shareButton = driver.findElement(
					By.xpath("//img[@src='/static/media/Share_Dashboard.cb8005bbe0cbcec2f629b4e62f498427.svg']"));
			shareButton.click();
			Thread.sleep(4000);

//open link generator
			WebElement openLinkButton = driver.findElement(By.xpath("//span[contains(text(),'Open Link Generator')]"));
			js.executeScript("arguments[0].click()", openLinkButton);
			Thread.sleep(5000);

//openanyone
			WebElement openAnyone = driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[1]"));
			js.executeScript("arguments[0].click()", openAnyone);
			Thread.sleep(5000);

			WebElement shareLinkButton = driver
					.findElement(By.xpath("//span[contains(text(),'Generate Shareable Link')]"));
			js.executeScript("arguments[0].click()", shareLinkButton);
			Thread.sleep(5000);

			WebElement copyButton = driver.findElement(By.xpath("//button[contains(text(),'Copy')]"));
			js.executeScript("arguments[0].click()", copyButton);
			Thread.sleep(5000);
			
			Alert alert = driver.switchTo().alert();
			driver.switchTo().alert().accept();

			WebElement shareid = driver
					.findElement(By.xpath("//input[@id='SharedWith']"));
			linkIDValue = shareid.getAttribute("value");
			System.out.println("value:"+linkIDValue);
			Thread.sleep(5000);
			
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String>newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			driver.get(linkIDValue);
			Thread.sleep(10000);
			driver.switchTo().window(newTb.get(0));

			WebElement crossButton = driver
					.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']"));
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(5000);

			WebElement plusIcon = driver.findElement(By.xpath("(//span[@class='anticon anticon-plus'])[1]"));
			js.executeScript("arguments[0].click()", plusIcon);
			Thread.sleep(3000);

			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search.sendKeys("testing2");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static String getlinkIDValue() {
		return linkIDValue;
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
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
