package com.test.java.utilities;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzManageUserWorkflowForSupervisor {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void manageUserWorkflow(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//account settings
			WebElement accountSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Account Settings ')]"));
			js.executeScript("arguments[0].click()", accountSettings);
			Thread.sleep(3000);

//manage users
			WebElement manageUserLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Manage_Users.svg']"));
			WebElement manageUser = driver.findElement(By.xpath("//span[contains(text(),'Manage Users')]"));
			js.executeScript("arguments[0].click()", manageUser);
			Thread.sleep(3000);

//manage user tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tabName = driver.findElement(By.xpath("(//span[contains(text(),'Manage Users')])[2]"));
			js.executeScript("arguments[0].click()", tabName);
			Thread.sleep(3000);

//manage user information
			WebElement heading = driver.findElement(By.xpath("(//p[contains(text(),'Manage Your Users')])"));
			WebElement inform = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (heading.isDisplayed() && inform.isDisplayed()) {
				System.out.println("Manage User Heading and Information are displayed");
			} else {
				System.out.println("Manage User Heading and Information are not displayed");
			}

//adduserbutton
			WebElement addUserButton = driver.findElement(By.xpath("//span[contains(text(),'Add User ')]"));
			js.executeScript("arguments[0].click()", addUserButton);
			Thread.sleep(3000);

//user profile
			WebElement profileHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mb-4'])[1]"));
			WebElement profileInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-10'])[1]"));
			if (profileHeading.isDisplayed() && profileInfo.isDisplayed()) {
				System.out.println("User Profile Heading and Information are displayed");
			} else {
				System.out.println("User Profile Heading and Information are not displayed");
			}

//camera
			WebElement cameraButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'photo_camera')]"));
			cameraButton.click();
			// js.executeScript("arguments[0].click()", cameraButton);
			Thread.sleep(4000);
			WebElement fileName = driver.findElement(By.xpath("//input[@type='file']"));
			//fileName.sendKeys("C:\\Users\\admin\\Downloads\\image.png");
			//Thread.sleep(2000);
			Robot rb=new Robot();
			rb.delay(2000);
			StringSelection ss=new StringSelection("C:\\Users\\admin\\Downloads\\imageslogo .png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(2000);

//save logo button
			WebElement savelogo = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", savelogo);
			Thread.sleep(3000);

			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();

//Name fields
			WebElement firstName = driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
			firstName.sendKeys("Kalyan");
			Thread.sleep(1000);
			WebElement lastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
			lastName.sendKeys("Hari");
			Thread.sleep(1000);

//gender
			WebElement gender = driver
					.findElement(By.xpath("//span[@class='mat-radio-label-content' and text()='Male ']"));
			js.executeScript("arguments[0].click()", gender);
			Thread.sleep(3000);

//role
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement selectRole = driver.findElement(By.xpath("(//span[contains(text(),'Supervisor Agent')])[6]"));
			js.executeScript("arguments[0].click()", selectRole);
			Thread.sleep(3000);

//username
			WebElement userName = driver.findElement(By.xpath("//input[@formcontrolname='userName']"));
			userName.sendKeys("Automattest_sup1");
			Thread.sleep(1000);

//email
			WebElement email = driver.findElement(By.xpath("//input[@formcontrolname='emailID']"));
			email.sendKeys("kalyan432@gmail.com");
			Thread.sleep(1000);

//country code
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement searchCountryCode = driver.findElement(By.xpath("//input[@placeholder='Search country code']"));
			searchCountryCode.sendKeys("ind");
			WebElement selectCountryCode = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' IND ']"));
			js.executeScript("arguments[0].click()", selectCountryCode);
			Thread.sleep(3000);

//contact number
			WebElement contactNumber = driver.findElement(By.xpath("//input[@formcontrolname='contactNumber']"));
			contactNumber.sendKeys("8778723401");
			Thread.sleep(1000);

//add signature
			WebElement addSignature = driver
					.findElement(By.xpath("//textarea[@formcontrolname='signatureSocialChannels']"));
			addSignature.sendKeys("kalyan746");
			Thread.sleep(1000);

//assign brand
			WebElement assignBrand = driver.findElement(By.xpath("//input[@placeholder='Search brands']"));
			js.executeScript("arguments[0].click()", assignBrand);
			Thread.sleep(3000);
			WebElement selectBrands = driver.findElement(By.xpath("//span[contains(text(),'Select All')]"));
			js.executeScript("arguments[0].click()", selectBrands);
			Thread.sleep(3000);

			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();

//platform access
			WebElement platformHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mt-10 mb-4'])[1]"));
			WebElement platformInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-10'])[4]"));
			WebElement platformField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[13]"));
			if (platformHeading.isDisplayed() && platformInfo.isDisplayed() && platformField.isDisplayed()) {
				System.out.println("Platform Access Information and Field are displayed");
			} else {
				System.out.println("Platform Access Information and Field are not displayed");
			}

//platform properties
			WebElement platformPropertiesHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mt-10 mb-4'])[2]"));
			WebElement platformPropertiesInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-0'])"));
			WebElement platformPropertiesSearchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[14]"));
			if (platformPropertiesHeading.isDisplayed() && platformPropertiesInfo.isDisplayed()
					&& platformPropertiesSearchField.isDisplayed()) {
				System.out.println("Platform Properties information and field are displayed");
			} else {
				System.out.println("Platform Properties information and field are not displayed");
			}

//response dashboard options
			WebElement responseDashBoardHeading = driver.findElement(By.xpath(
					"(//p[contains(@class,'text__md font-weight-600 mb-0 mt-10 pb-3 border-bottom__light-grey')])[1]"));
			WebElement responseDashboardOption1 = driver.findElement(
					By.xpath("//p[text()=' Response Dashboard']//following:: div[@fxlayout='row wrap'][1]"));
			WebElement responseDashboardOption2 = driver.findElement(
					By.xpath("//p[text()=' Response Dashboard']//following:: div[@fxlayout='row wrap'][2]"));
			WebElement responseDashboardOption3 = driver.findElement(
					By.xpath("//p[text()=' Response Dashboard']//following:: div[@fxlayout='row wrap'][3]"));
			if (responseDashBoardHeading.isDisplayed() && responseDashboardOption1.isDisplayed()
					&& responseDashboardOption2.isDisplayed() && responseDashboardOption3.isDisplayed()) {
				System.out.println("Response Dashboard heading and options are displayed");
			} else {
				System.out.println("Response Dashboard heading and options are not displayed");
			}

//account settings options
			WebElement accountSettingsHeading = driver.findElement(By.xpath(
					"(//p[contains(@class,'text__md font-weight-600 mb-0 mt-10 pb-3 border-bottom__light-grey')])[2]"));
			WebElement accountSettingsOption1 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][1]"));
			WebElement accountSettingsOption2 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][2]"));
			WebElement accountSettingsOptions3 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][3]"));
			WebElement accountSettingsOptions4 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][4]"));
			WebElement accountSettingsOptions5 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][5]"));
			WebElement accountSettingsOptions6 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][6]"));
			WebElement accountSettingsOptions7 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][7]"));
			WebElement accountSettingsOptions8 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][8]"));
			WebElement accountSettingsOptions9 = driver
					.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][9]"));
			WebElement accountSettingsOptions10 = driver.findElement(
					By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][10]"));
			WebElement accountSettingsOptions11 = driver.findElement(
					By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][11]"));
			WebElement accountSettingsOptions12 = driver.findElement(
					By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][12]"));
			if (accountSettingsHeading.isDisplayed() && accountSettingsOption1.isDisplayed()
					&& accountSettingsOption2.isDisplayed() && accountSettingsOptions3.isDisplayed()
					&& accountSettingsOptions4.isDisplayed() && accountSettingsOptions5.isDisplayed()
					&& accountSettingsOptions6.isDisplayed() && accountSettingsOptions7.isDisplayed()
					&& accountSettingsOptions8.isDisplayed() && accountSettingsOptions9.isDisplayed()
					&& accountSettingsOptions10.isDisplayed() && accountSettingsOptions11.isDisplayed()
					&& accountSettingsOptions12.isDisplayed()) {
				System.out.println("Account Settings heading and options are displayed");
			} else {
				System.out.println("Account Settings heading and options are not displayed");
			}

//search platform properties
			WebElement searchProperties = driver
					.findElement(By.xpath("//input[@placeholder='Search platform properties']"));
			searchProperties.sendKeys("create");
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

			searchProperties.clear();
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

//saveuser
			WebElement saveUserButton = driver.findElement(By.xpath("//span[contains(text(),' Save User ')]"));
			js.executeScript("arguments[0].click()", saveUserButton);
			Thread.sleep(3000);

//manage columns
			WebElement manageColumns = driver.findElement(By.xpath("(//div[contains(text(),' Columns ')])"));
			js.executeScript("arguments[0].click()", manageColumns);
			Thread.sleep(3000);

			WebElement column = driver.findElement(By.xpath("//span[contains(text(),'First Name ')]"));
			js.executeScript("arguments[0].click()", column);
			Thread.sleep(3000);
			WebElement column1 = driver.findElement(By.xpath("//span[contains(text(),'Last Name ')]"));
			js.executeScript("arguments[0].click()", column1);
			Thread.sleep(3000);
			WebElement column2 = driver.findElement(By.xpath("//span[contains(text(),'Contact Number')]"));
			js.executeScript("arguments[0].click()", column2);
			Thread.sleep(3000);
			WebElement column3 = driver.findElement(By.xpath("//span[contains(text(),'Brands ')]"));
			js.executeScript("arguments[0].click()", column3);
			Thread.sleep(3000);
			WebElement column4 = driver.findElement(By.xpath("//span[contains(text(),'Signature (Social Media)')]"));
			js.executeScript("arguments[0].click()", column4);
			Thread.sleep(3000);
			WebElement column5 = driver.findElement(By.xpath("//span[contains(text(),'Skills ')]"));
			js.executeScript("arguments[0].click()", column5);
			Thread.sleep(3000);
			WebElement column6 = driver.findElement(By.xpath("//span[contains(text(),' Channels')]"));
			js.executeScript("arguments[0].click()", column6);
			Thread.sleep(3000);
			WebElement column7 = driver.findElement(By.xpath("//span[contains(text(),'Multi Factor Authentication')]"));
			js.executeScript("arguments[0].click()", column7);
			Thread.sleep(3000);
			WebElement column8 = driver.findElement(By.xpath("//span[contains(text(),'Ticket Re-Assignment')]"));
			js.executeScript("arguments[0].click()", column8);
			Thread.sleep(3000);

			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),' Apply ')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);

//search the username
			WebElement search = driver
					.findElement(By.xpath("//input[@placeholder='Search by User Name, First/Last Name, Email']"));
			search.sendKeys("Automattest_sup1");
			WebElement searchButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);
			
//scroll right
			WebElement scrollRight=driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[14]"));
			js.executeScript("arguments[0].scrollIntoView()", scrollRight);
			Thread.sleep(3000);

//verfying the fields
			WebElement checkbox = driver.findElement(By.xpath(
					"(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]"));
			WebElement username = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[1]"));
			if (checkbox.isDisplayed() && username.isDisplayed()) {
				System.out.println("CheckBox and Username are displyed");
			} else {
				System.out.println("CheckBox and Username are not displyed");
			}

			WebElement firstName1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[2]"));
			if (firstName1.isDisplayed()) {
				System.out.println("First Name is displayed");
			} else {
				System.out.println("First Name is not displayed");
			}

			WebElement lastName1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[3]"));
			if (lastName1.isDisplayed()) {
				System.out.println("Last Name is displayed");
			} else {
				System.out.println("Last Name is not displayed");

			}

			WebElement role = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[4]"));
			if (role.isDisplayed()) {
				System.out.println("Role is displayed");
			} else {
				System.out.println("Role is not displayed");
			}

			WebElement email1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[5]"));
			if (email1.isDisplayed()) {
				System.out.println("Email is displayed");
			} else {
				System.out.println("Email is not displayed");
			}

			WebElement contactNumber1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[6]"));
			if (contactNumber1.isDisplayed()) {
				System.out.println("Contact Number is displayed");
			} else {
				System.out.println("Contact Number is not displayed");
			}

			WebElement brands = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[7]"));
			if (brands.isDisplayed()) {
				System.out.println("Brands is displayed");
			} else {
				System.out.println("Brands is not displayed");
			}

			WebElement signature = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[8]"));
			if (signature.isDisplayed()) {
				System.out.println("Signature for Social media is displayed");
			} else {
				System.out.println("Signature for Social media is not displayed");
			}

			WebElement teamName = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[9]"));
			if (teamName.isDisplayed()) {
				System.out.println("Team Name is displayed");
			} else {
				System.out.println("Team Name is not displayed");
			}

			WebElement skills = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[10]"));
			if (skills.isDisplayed()) {
				System.out.println("Skills is displayed");
			} else {
				System.out.println("Skills is not displayed");
			}

			WebElement channels = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[11]"));
			if (channels.isDisplayed()) {
				System.out.println("Channels is displayed");
			} else {
				System.out.println("Channels is not displayed");
			}

			WebElement mfa = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[12]"));
			if (mfa.isDisplayed()) {
				System.out.println("MFA is displayed");
			} else {
				System.out.println("MFA is not displayed");
			}

			WebElement ticketReassignment = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[13]"));
			if (ticketReassignment.isDisplayed()) {
				System.out.println("Ticket Re-Assignment is displayed");
			} else {
				System.out.println("Ticket Re-Assignment is not displayed");
			}

			WebElement actions3 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-content')])[14]"));
			if (actions3.isDisplayed()) {
				System.out.println("Actions is displayed");
			} else {
				System.out.println("Actions is not displayed");
			}

//actions fields
			WebElement person = driver.findElement(By.xpath("//mat-icon[contains(text(),' person ')]"));
			WebElement actionButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'more_horiz')]"));
			if (person.isDisplayed() && actionButton.isDisplayed()) {
				System.out.println("PersonImage and Button is displayed");
			} else {
				System.out.println("PersonImage and Button is not displayed");
			}
			js.executeScript("arguments[0].click()", actionButton);
			Thread.sleep(3000);

//delete button
			WebElement deleteSymbol = driver.findElement(By.xpath("//mat-icon[contains(text(),' delete_outline ')]"));
			WebElement delete = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
			if (deleteSymbol.isDisplayed() && delete.isDisplayed()) {
				System.out.println("Delete Symbol and button are displayed");
			} else {
				System.out.println("Delete Symbol and button are not displayed");
			}

//edit button
			WebElement editSymbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			WebElement edit = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
			if (editSymbol.isDisplayed() && edit.isDisplayed()) {
				System.out.println("Edit Symbol and button is displayed");
			} else {
				System.out.println("Edit Symbol and button is not  displayed");
			}
			js.executeScript("arguments[0].click()", edit);
			Thread.sleep(3000);

			editprocess(driver);

//clear the username
			WebElement search1 = driver
					.findElement(By.xpath("//input[@placeholder='Search by User Name, First/Last Name, Email']"));
			search1.clear();
			WebElement searchButton2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton2);
			Thread.sleep(3000);

			filterprocess(driver);

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

	public static void editprocess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//contact number
			WebElement contactNumber = driver.findElement(By.xpath("//input[@formcontrolname='contactNumber']"));
			contactNumber.clear();
			Thread.sleep(1000);
			contactNumber.sendKeys("9751766097");
			Thread.sleep(1000);

//update button
			WebElement updateButton = driver.findElement(By.xpath("//span[contains(text(),' Update User ')]"));
			js.executeScript("arguments[0].click()", updateButton);
			Thread.sleep(3000);

			WebElement searchButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void filterprocess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//filter button
			WebElement filterButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt')]"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);

//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);

			WebElement unselectAll = driver.findElement(
					By.xpath("//span[@class='mat-option-text']//following::span[contains(text(),' All')]"));
			js.executeScript("arguments[0].click()", unselectAll);
			Thread.sleep(3000);

			WebElement selectBrand = driver.findElement(
					By.xpath("//span[@class='mat-option-text']//following::span[contains(text(),' AJIO')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();

//select role
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[6]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);

			WebElement selectRole = driver.findElement(
					By.xpath("(//span[@class='mat-option-text']//span[contains(text(),'Supervisor Agent')])[1]"));
			js.executeScript("arguments[0].click()", selectRole);
			Thread.sleep(3000);

			WebElement applyButton = driver.findElement(By.xpath("(//span[contains(text(),' Apply ')])"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
