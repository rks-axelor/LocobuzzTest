package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAWAShareWithTeamMembersWorkflow {

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

	public static void shareWithTeam(WebDriver driver) throws Exception {
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
			dashboardName.sendKeys("testing5");
			Thread.sleep(3000);

			WebElement dashboardDescription = driver
					.findElement(By.xpath("(//input[@class='ant-input border-radius-4'])[2]"));
			dashboardDescription.sendKeys("Testing for sharing with team members");
			Thread.sleep(3000);

			WebElement saveDashboard = driver.findElement(By.xpath("//span[contains(text(),'Save Dashboard')]"));
			js.executeScript("arguments[0].click()", saveDashboard);
			Thread.sleep(3000);

			WebElement saveDashboard1 = driver.findElement(By.xpath("(//span[contains(text(),'Save Dashboard')])[2]"));
			js.executeScript("arguments[0].click()", saveDashboard1);
			Thread.sleep(10000);

			sharingProcess(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void sharingProcess(WebDriver driver) throws Exception {
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

//add people
			Actions action2 = new Actions(driver);
			WebElement addPeople = driver.findElement(By.xpath("//span[@class='ant-select-selection-placeholder']"));
			action2.moveToElement(addPeople).click();
			action2.build().perform();
			Thread.sleep(5000);
			action2.sendKeys(addPeople, "shifa shaikh").build().perform();
			action2.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(5000);

			WebElement optionButton = driver.findElement(By.xpath("//div[contains(text(),'View Only')]"));
			js.executeScript("arguments[0].click()", optionButton);
			Thread.sleep(5000);

			WebElement selectOption = driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[1]"));
			js.executeScript("arguments[0].click()", selectOption);
			Thread.sleep(5000);

			WebElement textarea = driver.findElement(By.xpath("//textarea[@placeholder='Write Message']"));
			textarea.sendKeys("please check");
			Thread.sleep(2000);

			WebElement sendButton = driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
			js.executeScript("arguments[0].click()", sendButton);
			Thread.sleep(7000);

			WebElement plusIcon = driver.findElement(By.xpath("(//span[@class='anticon anticon-plus'])[1]"));
			js.executeScript("arguments[0].click()", plusIcon);
			Thread.sleep(3000);

			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search.sendKeys("testing5");

			WebElement dashboard = driver.findElement(By.xpath("(//div[contains(@class,'text_heading-Slab')])[3]"));
			js.executeScript("arguments[0].click()", dashboard);
			Thread.sleep(5000);

//share
			Actions action1 = new Actions(driver);
			WebElement actionButton1 = driver.findElement(By.xpath("//span[@class='ant-dropdown-trigger']"));
			action1.moveToElement(actionButton1).click();
			action1.build().perform();
			Thread.sleep(4000);

			WebElement shareButton1 = driver.findElement(
					By.xpath("//img[@src='/static/media/Share_Dashboard.cb8005bbe0cbcec2f629b4e62f498427.svg']"));
			shareButton1.click();
			Thread.sleep(4000);

//removing the team members
			WebElement viewOption = driver.findElement(By.xpath("//div[contains(text(),'View Only')]"));
			js.executeScript("arguments[0].click()", viewOption);
			Thread.sleep(5000);

			WebElement removeButton = driver.findElement(By.xpath("//li[contains(text(),'Remove')]"));
			js.executeScript("arguments[0].click()", removeButton);
			Thread.sleep(5000);

			WebElement newdashboard = driver
					.findElement(By.xpath("(//div[@class='text_regular d-flex align-items-center'])[2]"));
			js.executeScript("arguments[0].click()", newdashboard);
			Thread.sleep(5000);

			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search1.sendKeys("testing5");

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
