package com.test.java.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

//status fetched to excel
	@SuppressWarnings("resource")
	public static void writeStatusDataToExcel(String[] statusData) throws Exception {

		try {
			File file = new File("C:\\Locobuzz3.0_Automation\\locobuzz-3-selenium\\Locobuzz\\StatusReport.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Status");

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

			Row row = sheet.getRow(0);

			Row newRow = sheet.createRow(rowCount + 1);

			for (int j = 0; j < row.getLastCellNum(); j++) {

				Cell cell = newRow.createCell(j);

				cell.setCellValue(statusData[j]);

			}

			fis.close();
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			outputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//Read data from Excel

	@SuppressWarnings("resource")
	public static String[] readDataFromExcel(String user) throws IOException {
		String[] loginDetails = new String[2];

		try {

			File file = new File("C:\\Locobuzz3.0_Automation\\locobuzz-3-selenium\\Locobuzz\\LoginDetails.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fis);

			Sheet sheet = workbook.getSheet("LoginDetails");

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

			for (int i = 1; i < rowCount + 1; i++) {

				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++) {

					if (row.getCell(j).toString().equalsIgnoreCase(user)) {
						loginDetails[0] = row.getCell(j + 1).getStringCellValue();
						loginDetails[1] = row.getCell(j + 2).getStringCellValue();
						System.out.println("Username: " + loginDetails[0] + " " + "Password: " + loginDetails[1]);
						break;
					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return loginDetails;
	}

//ticket information fetched to excel
	@SuppressWarnings("resource")
	public static void writeStatusInformationToExcel(List<String> writeTicketDetails) throws Exception {
		try {
			File file = new File("C:\\Locobuzz3.0_Automation\\locobuzz-3-selenium\\Locobuzz\\StatusReport.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("StatusInformation");

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

			Row row = sheet.getRow(0);

			Row newRow = sheet.createRow(rowCount + 1);

			for (int j = 0; j < row.getLastCellNum(); j++) {

				Cell cell = newRow.createCell(j);

				cell.setCellValue(writeTicketDetails.get(j));

			}
			fis.close();
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	//UI components fetched to Excel(Supervisor,Agent,Account Section)
	@SuppressWarnings("resource")
	public static void writeUIComponentsToExcel(List<String> writeUIDetails, String sheetName) throws Exception {
		try {
			
			File file = new File("C:\\Locobuzz3.0_Automation\\locobuzz-3-selenium\\Locobuzz\\StatusReport.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet(sheetName);
			
			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

			Row row = sheet.getRow(0);

			Row newRow = sheet.createRow(rowCount + 1);

			for (int j = 0; j < row.getLastCellNum(); j++) {

				Cell cell = newRow.createCell(j);

				cell.setCellValue(writeUIDetails.get(j));

			}
			fis.close();
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			outputStream.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	

// login details (supervisor,csd,agent,tl,brand)

	@SuppressWarnings("deprecation")
	public static void login(WebDriver driver, String user) throws IOException, InterruptedException {

		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//WebElement popup=driver.findElement(By.xpath("//p[contains(text(),'Okay')]"));
			//js.executeScript("arguments[0].click()", popup);
			//Thread.sleep(2000);
			//popup.click();
			Thread.sleep(2000);

			String[] loginData = CommonFunctions.readDataFromExcel(user);

			WebElement username = driver.findElement(By.xpath("//input[@formcontrolname = 'username']"));
			username.sendKeys(loginData[0]);

			WebElement password = driver.findElement(By.xpath("//input[@formcontrolname = 'password']"));
			password.sendKeys(loginData[1]);

			WebElement loginButton = driver.findElement(By.xpath("//button[@type= 'submit']"));
			loginButton.click();
			Thread.sleep(2000);

			/*
			 * WebElement
			 * skipButton=driver.findElement(By.xpath("//span[contains(text(),' skip ')]"));
			 * skipButton.click();
			 */

			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement homepageLocator = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'expired token list')]")));

			if (homepageLocator.isDisplayed()) {
				System.out.println("Login Successful");
				WebElement closeConfirmation = driver.findElement(By.xpath("(//mat-icon[@type='button'])[2]"));
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", closeConfirmation);
				if(!user.equalsIgnoreCase("TeamLeader")) {
				WebElement closeButton=driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
				js.executeScript("arguments[0].click()", closeButton);
				}
				//WebElement 
			} else {

				System.out.println("Login Failed");

			}

			Thread.sleep(5000);
			if (user.equalsIgnoreCase("Agent")) {
				WebElement select = driver.findElement(By.xpath("(//span[@class='brandselect__image--check'])[1]"));
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", select);

				WebElement submit = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
				js.executeScript("arguments[0].click()", submit);
			}

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

// user  search for ticket

	@SuppressWarnings("deprecation")
	public static void ticketsSearch(WebDriver driver, String channel) throws Exception {

		try {
			//driver.navigate().refresh();

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement search = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", search);

			Thread.sleep(2000);

			WebElement inputbox = driver.findElement(By.id("post-search-input"));
			// inputbox.sendKeys("kalyan");

			if (channel.equalsIgnoreCase("youtube")) {
				inputbox.sendKeys("nishant");
			}
	        else {
				inputbox.sendKeys("kalyan");
			}
			
			js.executeScript("arguments[0].click()", search);
			//search.click();
			Thread.sleep(5000);

			filter(driver, channel);

		}

		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//filter

	@SuppressWarnings("deprecation")
	public static void filter(WebDriver driver, String channel) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement filterButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"(//span[@class='mat-button-wrapper']//following::mat-icon[contains(text(),'filter_alt')])[1]")));
			filterButton.click();

			Thread.sleep(5000);

		/*	if (channel.equalsIgnoreCase("instagram")) {
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				WebElement brand = wait1.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//input[@data-placeholder='Type to search Brand']")));

				brand.sendKeys("Renault");
				WebElement brandName = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", brandName);
				WebElement closeBrand = driver
						.findElement(By.xpath("(//mat-panel-title[contains(text(),'Brand, Date duration')])"));
				js.executeScript("arguments[0].click()", closeBrand);

			}*/

			if (channel.equalsIgnoreCase("GMB")) {
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				WebElement brand = wait1.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//input[@data-placeholder='Type to search Brand'])")));
				brand.sendKeys("Ritz_TestBrand");
				Thread.sleep(1000);
				WebElement brandName = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
				brandName.click();
				Thread.sleep(1000);
				WebElement closeBrand = driver
						.findElement(By.xpath("(//mat-panel-title[contains(text(),'Brand, Date duration')])"));
				closeBrand.click();

			}

		/*	if (channel.equalsIgnoreCase("email")) {
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				WebElement brand = wait1.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//input[@data-placeholder='Type to search Brand'])")));
				brand.sendKeys("AJIO");
				Thread.sleep(1000);
				WebElement brandName = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
				brandName.click();
				Thread.sleep(1000);
				WebElement closeBrand = driver
						.findElement(By.xpath("(//mat-panel-title[contains(text(),'Brand, Date duration')])"));
				closeBrand.click();

			} */
			Thread.sleep(4000);

			List<WebElement> ticketAndMentionList;
			ticketAndMentionList = driver
					.findElements(By.xpath("//mat-panel-title[contains(.,'Tickets and mentions')]"));

			for (WebElement element : ticketAndMentionList) {
				if (element.isDisplayed()) {
					element.click();
					break;
				}
			}

			Thread.sleep(3000);

			List<WebElement> channelSelectorList = driver
					.findElements(By.xpath("//mat-label[contains(.,'Channel')]//preceding::input[1]"));
			for (WebElement element : channelSelectorList) {
				if (element.isDisplayed()) {
					element.click();
					break;
				}
			}
			Thread.sleep(1000);

			WebElement searchButton = driver.findElement(By.xpath("//input[@placeholder='Search channel']"));
			searchButton.sendKeys(channel);
			if (channel.equalsIgnoreCase("GMB")) {
				String channel_Modified = "GoogleMyReview";
				WebElement channelName = driver.findElement(By.xpath(
						"//label[@class='mat-checkbox-layout']//img[contains(@src, '" + channel_Modified + "')]"));
				channelName.click();
			} else if(channel.equalsIgnoreCase("google play store")){
				String channel_Modified="playstore";
				WebElement channelName = driver.findElement(By.xpath(
						"//label[@class='mat-checkbox-layout']//img[contains(@src, '" + channel_Modified + "')]"));
				channelName.click();
				
			}
			else if(channel.equalsIgnoreCase("ChatBot")){
				String channel_Modified="WebsiteChatBot";
				WebElement channelName = driver.findElement(By.xpath(
						"//label[@class='mat-checkbox-layout']//img[contains(@src, '" + channel_Modified + "')]"));
				channelName.click();
			}
				else {
			
				WebElement channelName = driver.findElement(
						By.xpath("//label[@class='mat-checkbox-layout']//img[contains(@src, '" + channel + "')]"));
				channelName.click();
			}
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();

			
			List<WebElement> applyButtonList = driver
					.findElements(By.xpath("//span[@class='mat-button-wrapper' and contains(text(),'Apply')]"));
			for (WebElement element : applyButtonList) {
				if (element.isDisplayed()) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click()", element);
					Thread.sleep(5000);
					//js.executeScript("arguments[0].click()", element);
					//Thread.sleep(5000);
					break;
				}
			}

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			System.out.println("Data Filtered Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

// logout
	public static void logout(WebDriver driver) throws InterruptedException {

		try {

			Thread.sleep(5000);
			WebElement edit = driver.findElement(By.xpath("//mat-icon[contains(text(),'inbox')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(edit).build();
			mouseOverHome.perform();
			Thread.sleep(3000);

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", expand);

			WebElement logout = driver.findElement(By.xpath("//button[contains(text(),'Logout')]"));
			js.executeScript("arguments[0].click()", logout);
			Thread.sleep(4000);

			WebElement confirmLogout = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
			if (confirmLogout.isDisplayed()) {
				js.executeScript("arguments[0].click()", confirmLogout);
				System.out.println("Logout Successful");
			} else {
				System.out.println("Logout Not Successful");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public static String getDataTime() {
		String dateTime = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			dateTime = formatter.format(date);
			return dateTime;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}