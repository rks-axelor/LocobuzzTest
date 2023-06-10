package com.test.java.utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzManageBrandWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void manageBrandProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//account settings
			WebElement accountSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Account Settings ')]"));
			js.executeScript("arguments[0].click()", accountSettings);
			Thread.sleep(3000);

//manage brand
			WebElement manageBrandLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Manage_Brands.svg']"));
			WebElement manageBrand = driver.findElement(By.xpath("//span[contains(text(),'Manage Brands')]"));
			js.executeScript("arguments[0].click()", manageBrand);
			Thread.sleep(3000);

//manage brand tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement manageTab = driver.findElement(By.xpath("(//span[contains(text(),'Manage Brands')])[2]"));
			js.executeScript("arguments[0].click()", manageTab);
			Thread.sleep(3000);

//manage brand information
			WebElement heading = driver.findElement(By.xpath("(//p[contains(text(),'Manage Brands')])"));
			WebElement manageInfo = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (heading.isDisplayed() && manageInfo.isDisplayed()) {
				System.out.println("Manage Brand Heading and Information are displayed");
			} else {
				System.out.println("Manage Brand Heading and Information are not displayed");
			}

//add brand button
			WebElement addBrandButton = driver.findElement(By.xpath("//div[contains(text(),'Add Brand ')]"));
			js.executeScript("arguments[0].click()", addBrandButton);
			Thread.sleep(3000);

//brand profile information
			WebElement profileHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--lg font-weight-600 mb-5']"));
			WebElement profileInfo = driver.findElement(By.xpath("//p[@class='text-regular mb-0 line-height-1.5']"));
			if (profileHeading.isDisplayed() && profileInfo.isDisplayed()) {
				System.out.println("Profile heading and information are displayed");
			} else {
				System.out.println("Profile heading and information are not displayed");
			}

//camera button for brandlogo
			WebElement cameraButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'photo_camera')])[1]"));
			cameraButton.click();
			Thread.sleep(4000);
			WebElement fileName = driver.findElement(By.xpath("//input[@type='file']"));
			// driver.switchTo().activeElement().sendKeys("C:\\Users\\admin\\Downloads\\ford.png");
			//fileName.sendKeys("C:\\Users\\admin\\Downloads\\ford.png");

			//Thread.sleep(2000);
			Robot robot = new Robot();
			robot.delay(2000);
			StringSelection ss=new StringSelection("C:\\Users\\admin\\Downloads\\download.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.delay(2000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);
//save logo button
			WebElement savelogo = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", savelogo);
			Thread.sleep(3000);

			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(Keys.ESCAPE).build();
			action3.perform();

//brand name
			WebElement brandName = driver.findElement(By.xpath("//input[@type='string']"));
			brandName.sendKeys("Bajaj");

//select color			
			WebElement arrow = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[2]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);

			WebElement selectColor = driver.findElement(By.xpath("(//span[contains(text(),' crop_square ')])[8]"));
			js.executeScript("arguments[0].click()", selectColor);
			Thread.sleep(3000);

			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);

			Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(Keys.ESCAPE).build();
			action2.perform();

//view other brand colors
			WebElement viewOtherBrandColors = driver
					.findElement(By.xpath("//p[contains(text(),' View other brand colors ')]"));
			js.executeScript("arguments[0].click()", viewOtherBrandColors);
			Thread.sleep(3000);

			Actions at = new Actions(driver);
			at.sendKeys(Keys.PAGE_DOWN).build().perform();

			js.executeScript("arguments[0].click()", viewOtherBrandColors);
			Thread.sleep(3000);

//country name
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement searchCountryName = driver.findElement(By.xpath("//input[@placeholder='Search country']"));
			searchCountryName.sendKeys("india");
			WebElement selectCountry = driver.findElement(By.xpath("//span[contains(text(),'India ')]"));
			js.executeScript("arguments[0].click()", selectCountry);
			Thread.sleep(3000);

//camera button for brand symbol
			WebElement camera = driver.findElement(By.xpath(
					"//div[@class='addbrands__body--left-card mt-20 pt-25 pb-25 pr-30 bg__white']//following::mat-icon[contains(text(),'photo_camera')]"));
			camera.click();
			WebElement fileName1 = driver.findElement(By.xpath("//input[@id='file1']"));
			fileName1.sendKeys("C:\\Users\\admin\\Downloads\\download.png");
			Thread.sleep(2000);
			
			/*Robot rb=new Robot();
			rb.delay(2000);
			StringSelection ss1=new StringSelection("‪‪‪‪C:\\Users\\admin\\Downloads\\fordimages.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(2000);*/

//save logo button
			WebElement savelogo1 = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", savelogo1);
			Thread.sleep(3000);

			Actions actions4 = new Actions(driver);
			Action action4 = actions4.sendKeys(Keys.ESCAPE).build();
			action4.perform();

//category group
			WebElement categoryHeading = driver.findElement(By.xpath("//p[@class='text__md font-weight-600 mb-7']"));
			WebElement categoryInfo = driver
					.findElement(By.xpath("(//p[@class='text__light--sm line-height-1.50 mb-14'])[1]"));
			if (categoryHeading.isDisplayed() && categoryInfo.isDisplayed()) {
				System.out.println("Cateory Group Heading and Information are displayed");
			} else {
				System.out.println("Cateory Group Heading and Information are not displayed");
			}

//add category
			WebElement addCategory = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[1]"));
			js.executeScript("arguments[0].click()", addCategory);
			Thread.sleep(3000);
			WebElement categoryName = driver.findElement(By.xpath("//input[@formcontrolname='newCategoryGroup']"));
			categoryName.sendKeys("Defaulttest2");
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);

//add sub-category
			WebElement addSubCategory = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[2]"));
			js.executeScript("arguments[0].click()", addSubCategory);
			Thread.sleep(3000);
			WebElement subCategoryName = driver.findElement(By.xpath("//input[@formcontrolname='newSubCategory']"));
			subCategoryName.sendKeys("Brands");
			WebElement saveButton1 = driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(3000);

//assign user infomation
			WebElement assignUserHeading = driver
					.findElement(By.xpath("//p[@class='text__md font-weight-600 mb-7 mt-18']"));
			WebElement assignUserInfo = driver
					.findElement(By.xpath("(//p[@class='text__light--sm line-height-1.50 mb-14'])[2]"));
			if (assignUserHeading.isDisplayed() && assignUserInfo.isDisplayed()) {
				System.out.println("Assign User Information are displayed");
			} else {
				System.out.println("Assign User Information are not displayed");
			}

//assign users
			WebElement searchUsers = driver.findElement(By.xpath("//input[@placeholder='Search users']"));
			js.executeScript("arguments[0].click()", searchUsers);
			Thread.sleep(3000);
			searchUsers.sendKeys("kalyan");
			WebElement selectUser = driver.findElement(By.xpath(
					"//span[@class='mat-checkbox-label' and text()=' kalyan_adminuat (Account Configurator) ']"));
			js.executeScript("arguments[0].click()", selectUser);
			Thread.sleep(3000);
			WebElement selectUser1 = driver
					.findElement(By.xpath("//span[@class='mat-checkbox-label' and text()=' kalyan_agent1 (Agent) ']"));
			js.executeScript("arguments[0].click()", selectUser1);
			Thread.sleep(3000);
			WebElement selectUser2 = driver.findElement(
					By.xpath("//span[@class='mat-checkbox-label' and text()=' kalyan_brand (Brand Account) ']"));
			js.executeScript("arguments[0].click()", selectUser2);
			Thread.sleep(3000);
			WebElement selectUser3 = driver.findElement(
					By.xpath("//span[@class='mat-checkbox-label' and text()=' kalyan_csd (Customer Care) ']"));
			js.executeScript("arguments[0].click()", selectUser3);
			Thread.sleep(3000);
			WebElement selectUser4 = driver.findElement(
					By.xpath("//span[@class='mat-checkbox-label' and text()=' kalyan_live_sup (Supervisor Agent) ']"));
			js.executeScript("arguments[0].click()", selectUser4);
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();

//ticket creation
			WebElement ticketCreationHeading = driver
					.findElement(By.xpath("//p[@class='text__md font-weight-600 mb-7 mt-10']"));
			WebElement ticketCreationInfo = driver
					.findElement(By.xpath("//p[@class='text__light--sm line-height-1.50']"));
			if (ticketCreationHeading.isDisplayed() && ticketCreationInfo.isDisplayed()) {
				System.out.println("Ticket Creation Information are displayed");
			} else {
				System.out.println("Ticket Creation Information  are not displayed");
			}

//ticket active button
			WebElement activeButton = driver.findElement(By.xpath(
					"//p[contains(text(),'Ticket Creation')]//following::label[@class='rounded-toggle-switch-label']"));
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);
			
			Actions at1 = new Actions(driver);
			at1.sendKeys(Keys.PAGE_DOWN).build().perform();

//save button
			WebElement saveBrandButton = driver.findElement(By.xpath("//span[contains(text(),'Save Brand')]"));
			js.executeScript("arguments[0].click()", saveBrandButton);
			//Thread.sleep(60000);
			TimeUnit.MINUTES.sleep(1);

//search brand name
			WebElement searchBrand = driver
					.findElement(By.xpath("//input[@placeholder='Search by Brand Name, Users']"));
			searchBrand.sendKeys("Bajaj");
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(5000);

//verifying the fields
			WebElement brandName1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[1]"));
			if (brandName1.isDisplayed()) {
				System.out.println("Brand Name is displayed");
			} else {
				System.out.println("Brand Name is not displayed");
			}

			WebElement users = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[2]"));
			if (users.isDisplayed()) {
				System.out.println("Users is displayed");
			} else {
				System.out.println("Users is not displayed");
			}

			WebElement channelConfigured = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[3]"));
			if (channelConfigured.isDisplayed()) {
				System.out.println("Channel Configured is displayed");
			} else {
				System.out.println("Channel Configured is not displayed");
			}

			WebElement keywords = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[4]"));
			if (keywords.isDisplayed()) {
				System.out.println("Keywords/Topics is displayed");
			} else {
				System.out.println("Keywords/Topics is not displayed");
			}

			WebElement createdOn = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[5]"));
			if (createdOn.isDisplayed()) {
				System.out.println("Created On is displayed");
			} else {
				System.out.println("Created On is not displayed");
			}

			WebElement ticketCreation = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[6]"));
			if (ticketCreation.isDisplayed()) {
				System.out.println("Ticket Creation is displayed");
			} else {
				System.out.println("Ticket Creation is not displayed");
			}

			WebElement action = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[7]"));
			if (action.isDisplayed()) {
				System.out.println("Action is displayed");
			} else {
				System.out.println("Action is not displayed");
			}

//edit 
			WebElement editSymbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			WebElement editButton = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
			if (editSymbol.isDisplayed() && editButton.isDisplayed()) {
				System.out.println("Edit symbol and button are displayed");
			} else {
				System.out.println("Edit symbol and button are not displayed");
			}
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(5000);

//ticket creation
			WebElement activeButton1 = driver
					.findElement(By.xpath("//p[contains(text(),'Ticket Creation')]//following::label[@class='rounded-toggle-switch-label']"));
			js.executeScript("arguments[0].click()", activeButton1);
			Thread.sleep(5000);

//update button
			WebElement updateButton = driver.findElement(By.xpath("//span[contains(text(),'Update Brand')]"));
			js.executeScript("arguments[0].click()", updateButton);
			Thread.sleep(5000);

			WebElement searchButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);

//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);
			Thread.sleep(2000);

			WebElement logout = driver.findElement(By.xpath("//button[contains(text(),' Logout ')]"));
			js.executeScript("arguments[0].click()", logout);
			Thread.sleep(2000);

			WebElement confirmLogout = driver.findElement(By.xpath("//span[contains(text(),' Logout ')]"));
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

}
