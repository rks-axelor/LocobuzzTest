package com.test.java.utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocobuzzCategoryMappingTicketWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void categoryMappingTicketWorkflow(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//Listening Settings
			WebElement ListeningSettings = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if (ListeningSettings.isDisplayed()) {
				System.out.println("Listening Settings is displayed");
			} else {
				System.out.println("Listening Settings is not displayed");
			}
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);

//category mapping
			WebElement categoryMappingLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Category_Mapping.svg']"));
			WebElement categoryMappingLabel = driver
					.findElement(By.xpath("//span[contains(text(),'Category Mapping')]"));
			if (categoryMappingLogo.isDisplayed() && categoryMappingLabel.isDisplayed()) {
				System.out.println("Category Mapping Logo and Label are displayed");
			} else {
				System.out.println("Category Mapping Logo and Label are not displayed");
			}
			js.executeScript("arguments[0].click()", categoryMappingLabel);
			Thread.sleep(3000);

//category mapping tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement categoryMappingTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Category Mapping')])[2]"));
			if (pushpin.isDisplayed() && categoryMappingTab.isDisplayed()) {
				System.out.println("Category Mapping tab is displayed");
			} else {
				System.out.println("Category Mapping tab is not displayed");
			}

//category mapping (heading,information)
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Category Mapping ')]"));
			WebElement info = driver.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Category mapping heading,information are displayed");
			} else {
				System.out.println("Category mapping heading,information are not displayed");
			}

//select category group
			WebElement categoryGroupSymbol = driver
					.findElement(By.xpath("(//img[@src='assets/images/account/map_gray.svg'])[2]"));
			WebElement categoryGroupName = driver.findElement(By.xpath("//span[contains(text(),'Testing123')]"));
			if (categoryGroupSymbol.isDisplayed()) {
				System.out.println("Category Group Symbol and name are displayed");
			} else {
				System.out.println("Category Group Symbol and name are not displayed");
			}
			js.executeScript("arguments[0].click()", categoryGroupName);
			Thread.sleep(3000);

//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),'Titan')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//search category
			WebElement searchCategory = driver.findElement(By.xpath("//input[@placeholder='Search Category']"));
			searchCategory.sendKeys("kalyantest5");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search ')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

			WebElement selectCategory = driver.findElement(By.xpath("//span[contains(text(),'kalyantest5 ')]"));
			js.executeScript("arguments[0].click()", selectCategory);
			Thread.sleep(3000);

			goingTwitterAccount(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void goingTwitterAccount(WebDriver driver) throws Exception {
		try {

// Second Child window Handle
			String parent = driver.getWindowHandle();
			System.out.println("Main window handle is " + parent);
			Thread.sleep(2000);
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
// Child window Handle

			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			driver.get("https://twitter.com/");
			Thread.sleep(7000);

//Login
			WebElement signUp = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
			js.executeScript("arguments[0].click()", signUp);
			Thread.sleep(5000);
			WebElement username = driver.findElement(By.name("text"));
			username.sendKeys("KalyanChinni11");
			Thread.sleep(3000);
			WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(5000);
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("Kalyan@976");
			Thread.sleep(1000);
			WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
			js.executeScript("arguments[0].click()", login);
			Thread.sleep(4000);
			System.out.println("Twitter Login Successful");

//Tweet		
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);

			WebElement whatHappening = driver.findElement(By.xpath("//div[@data-testid='tweetTextarea_0']"));
			js.executeScript("arguments[0].click()", whatHappening);
			String twitterDynamicMessage = "@Komal25169281   locotes" + " " + strDate;
			whatHappening.sendKeys(twitterDynamicMessage);
			Thread.sleep(1000);

			WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
			js.executeScript("arguments[0].click()", tweetButton);
			Thread.sleep(4000);
			System.out.println("Tweet posted Successfully");
			Thread.sleep(5000);
			driver.switchTo().window(tabs.get(0));
			gotoAllMentionsTab(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}

	public static void gotoAllMentionsTab(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Thread.sleep(2000);
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			WebElement allmentions = driver.findElement(By.xpath("(//span[contains(text(),'All Mention')])[1]"));
			allmentions.click();
			Thread.sleep(5000);

//useractivity

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement useractivity = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'User Activity ')]")));
			Thread.sleep(3000);
			WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[2]"));
			js.executeScript("arguments[0].click()", Brandselect);
			Thread.sleep(3000);
			WebElement Selectbrand = driver
					.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
			js.executeScript("arguments[0].click()", Selectbrand);
			WebElement Selectbrand1 = driver
					.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and text()=' Titan ']"));
			js.executeScript("arguments[0].scrollIntoView()", Selectbrand1);
			js.executeScript("arguments[0].click()", Selectbrand1);
			WebElement Apply = driver
					.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[3]"));
			js.executeScript("arguments[0].click()", Apply);
			Thread.sleep(5000);

//Searching and deleting ticket from locobuzz
			WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[2]"));
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(10000);
			WebElement inputbox = driver.findElement(By.id("post-search-input"));
			inputbox.sendKeys("kalyan");
			Thread.sleep(4000);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(10000);
			WebElement ticket1 = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
			js.executeScript("arguments[0].click()", ticket1);
			Thread.sleep(3000);
			WebElement deleteTicket = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
			js.executeScript("arguments[0].click()", deleteTicket);
			Thread.sleep(3000);
			WebElement confirm = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
			js.executeScript("arguments[0].click()", confirm);
			Thread.sleep(3000);
			goingAccountSession(driver);
			skipOffFunctionality(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void skipOffFunctionality(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//Listening Settings
			WebElement ListeningSettings = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if (ListeningSettings.isDisplayed()) {
				System.out.println("Listening Settings is displayed");
			} else {
				System.out.println("Listening Settings is not displayed");
			}
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);

//category mapping
			WebElement categoryMappingLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Category_Mapping.svg']"));
			WebElement categoryMappingLabel = driver
					.findElement(By.xpath("//span[contains(text(),'Category Mapping')]"));
			if (categoryMappingLogo.isDisplayed() && categoryMappingLabel.isDisplayed()) {
				System.out.println("Category Mapping Logo and Label are displayed");
			} else {
				System.out.println("Category Mapping Logo and Label are not displayed");
			}
			js.executeScript("arguments[0].click()", categoryMappingLabel);
			Thread.sleep(3000);

//category mapping tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement categoryMappingTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Category Mapping')])[2]"));
			if (pushpin.isDisplayed() && categoryMappingTab.isDisplayed()) {
				System.out.println("Category Mapping tab is displayed");
			} else {
				System.out.println("Category Mapping tab is not displayed");
			}

//category mapping (heading,information)
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Category Mapping ')]"));
			WebElement info = driver.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Category mapping heading,information are displayed");
			} else {
				System.out.println("Category mapping heading,information are not displayed");
			}

//select category group
			WebElement categoryGroupSymbol = driver
					.findElement(By.xpath("(//img[@src='assets/images/account/map_gray.svg'])[2]"));
			WebElement categoryGroupName = driver.findElement(By.xpath("//span[contains(text(),'Testing123')]"));
			if (categoryGroupSymbol.isDisplayed()) {
				System.out.println("Category Group Symbol and name are displayed");
			} else {
				System.out.println("Category Group Symbol and name are not displayed");
			}
			js.executeScript("arguments[0].click()", categoryGroupName);
			Thread.sleep(3000);

//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),'Titan')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//select skip strict
			WebElement skipStrictButton = driver
					.findElement(By.xpath("(//label[@class='mat-tooltip-trigger rounded-toggle-switch-label'])[1]"));
			js.executeScript("arguments[0].click()", skipStrictButton);
			Thread.sleep(3000);

			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);

			goingTwitterAccount2(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void goingTwitterAccount2(WebDriver driver) throws Exception {
		try {

// Second Child window Handle
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(5000);

//Tweet		
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);

			WebElement whatHappening = driver.findElement(By.xpath("//div[@data-testid='tweetTextarea_0']"));
			js.executeScript("arguments[0].click()", whatHappening);
			String twitterDynamicMessage = "@Komal25169281   locotes" + " " + strDate;
			whatHappening.sendKeys(twitterDynamicMessage);
			Thread.sleep(1000);

			WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
			js.executeScript("arguments[0].click()", tweetButton);
			Thread.sleep(4000);
			System.out.println("Tweet posted Successfully");
			driver.switchTo().window(tabs.get(0));
			gotoAllMentionsTab2(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static void gotoAllMentionsTab2(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Thread.sleep(2000);
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			WebElement allmentions = driver.findElement(By.xpath("(//span[contains(text(),'All Mention')])[1]"));
			allmentions.click();
			Thread.sleep(5000);

//useractivity

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement useractivity = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'User Activity ')]")));
			Thread.sleep(3000);
			WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[2]"));
			js.executeScript("arguments[0].click()", Brandselect);
			Thread.sleep(5000);
			WebElement Selectbrand = driver
					.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
			js.executeScript("arguments[0].click()", Selectbrand);
			WebElement Selectbrand1 = driver
					.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and text()=' Titan ']"));
			js.executeScript("arguments[0].scrollIntoView()", Selectbrand1);
			js.executeScript("arguments[0].click()", Selectbrand1);
			WebElement Apply = driver
					.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[3]"));
			js.executeScript("arguments[0].click()", Apply);
			Thread.sleep(5000);

//Searching and deleting ticket from locobuzz
			WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[2]"));
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(10000);
			WebElement inputbox = driver.findElement(By.id("post-search-input"));
			inputbox.sendKeys("kalyan");
			Thread.sleep(4000);
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(10000);
			WebElement ticket1 = driver.findElement(
					By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
			js.executeScript("arguments[0].click()", ticket1);
			Thread.sleep(3000);
			WebElement deleteTicket = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
			js.executeScript("arguments[0].click()", deleteTicket);
			Thread.sleep(3000);
			WebElement confirm = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
			js.executeScript("arguments[0].click()", confirm);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
