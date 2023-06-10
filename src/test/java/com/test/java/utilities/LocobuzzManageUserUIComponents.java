package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzManageUserUIComponents {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void verifyingManageUserComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//account settings
			WebElement accountSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Account Settings ')]"));
			if (accountSettings.isDisplayed()) {
				System.out.println("Account Settings is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Account Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", accountSettings);
			Thread.sleep(3000);

//manage users
			WebElement manageUserLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Manage_Users.svg']"));
			WebElement manageUser = driver.findElement(By.xpath("//span[contains(text(),'Manage Users')]"));
			if (manageUserLogo.isDisplayed() && manageUser.isDisplayed()) {
				System.out.println("Manage User logo and name are displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Manage User logo and name are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", manageUser);
			Thread.sleep(3000);

//manage user tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tabName = driver.findElement(By.xpath("(//span[contains(text(),'Manage Users')])[2]"));
			if (pushpin.isDisplayed() && tabName.isDisplayed()) {
				System.out.println("Manage User Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Manage User Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//manage user information
			WebElement heading = driver.findElement(By.xpath("(//p[contains(text(),'Manage Your Users')])"));
			WebElement inform = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (heading.isDisplayed() && inform.isDisplayed()) {
				System.out.println("Manage User Heading and Information are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Manage User Heading and Information are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement searchSymbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchField.isDisplayed() && searchSymbol.isDisplayed()) {
				System.out.println("Search symbol and Field are displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Search symbol and Field are not displayed");
				componentsInformation.add(4, "Not Present");
			}

//active/total users
			WebElement usersCount = driver
					.findElement(By.xpath("(//div[contains(text(),' Active Users / Total Users : ')])"));
			if (usersCount.isDisplayed()) {
				System.out.println("Active/Total users count is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Active/Total users count is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//MFA button
			WebElement adminPanelLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'admin_panel_settings')]"));
			WebElement adminPanel = driver.findElement(By.xpath("//span[contains(text(),'MFA')]"));
			if (adminPanel.isDisplayed() && adminPanelLogo.isDisplayed()) {
				System.out.println("Admin Panel Settings Logo and button are displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Admin Panel Settings Logo and button are not displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", adminPanel);
			Thread.sleep(3000);

//multi factor authentication options
			WebElement multiFactorHeading = driver
					.findElement(By.xpath("//p[contains(text(),' Multi Factor Authentication ')]"));
			WebElement multiFactorOptionsList = driver.findElement(By.xpath("//mat-radio-group[@role='radiogroup']"));
			if (multiFactorHeading.isDisplayed() && multiFactorOptionsList.isDisplayed()) {
				System.out.println("Multi Factor Authentication Heading and Options are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Multi Factor Authentication Heading and Options are not displayed");
				componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", adminPanelLogo);
			Thread.sleep(3000);

//filter button
			WebElement filterButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt')]"));
			if (filterButton.isDisplayed()) {
				System.out.println("Filter Button is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Filter Button is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);

//filter options
			WebElement TeamField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			WebElement userField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement roleField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			if (TeamField.isDisplayed() && brandField.isDisplayed() && userField.isDisplayed()
					&& roleField.isDisplayed()) {
				System.out.println("Filter Options are displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Filter Options are not displayed");
				componentsInformation.add(9, "Not Present");
			}

//apply button
			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),' Apply ')]"));
			if (applyButton.isDisplayed()) {
				System.out.println("Apply Button is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Apply Button is not displayed");
				componentsInformation.add(10, "Not Present");
			}

//cancel Button
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(11, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

//manage columns
			WebElement manageColumnsLogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'view_week')]"));
			WebElement manageColumns = driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			WebElement arrow = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[2]"));
			if (manageColumnsLogo.isDisplayed() && manageColumns.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Manage Columns Logo and name are displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Manage Columns Logo and name are not displayed");
				componentsInformation.add(12, "Not Present");
			}
			js.executeScript("arguments[0].click()", manageColumns);
			Thread.sleep(3000);

//manage columns list
			WebElement manageColumnsList = driver.findElement(By.xpath(
					"//ul[contains(@class,'managebrands__headnavigationband--columnbtn-menu border-bottom__light-grey')]"));
			if (manageColumnsList.isDisplayed()) {
				System.out.println("Manage Columns are displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Manage Columns are not displayed");
				componentsInformation.add(13, "Not Present");
			}

//apply button
			WebElement applyButton1 = driver.findElement(By.xpath("//span[contains(text(),' Apply ')]"));
			if (applyButton1.isDisplayed()) {
				System.out.println("Apply Button is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Apply Button is not displayed");
				componentsInformation.add(14, "Not Present");
			}

//cancel button
			WebElement cancelButton1 = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton1.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton1);
			Thread.sleep(3000);

//add user button
			WebElement addUserButton = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]"));
			if (addUserButton.isDisplayed()) {
				System.out.println("Add User Button is displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Add User Button is not displayed");
				componentsInformation.add(16, "Not Present");
			}
			js.executeScript("arguments[0].click()", addUserButton);
			Thread.sleep(3000);

//add user heading
			WebElement addUserHeading = driver.findElement(By.xpath("//h3[contains(text(),'Add User')]"));
			if (addUserHeading.isDisplayed()) {
				System.out.println("Add User Heading is displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Add User Heading is not displayed");
				componentsInformation.add(17, "Not Present");
			}

//arrow back
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			if (arrowBack.isDisplayed()) {
				System.out.println("Arrow Back is displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Arrow Back is not displayed");
				componentsInformation.add(18, "Not Present");
			}

//user profile
			WebElement profileHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mb-4'])[1]"));
			WebElement profileInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-10'])[1]"));
			if (profileHeading.isDisplayed() && profileInfo.isDisplayed()) {
				System.out.println("User Profile Heading and Information are displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("User Profile Heading and Information are not displayed");
				componentsInformation.add(19, "Not Present");
			}

//photo/camera
			WebElement photo = driver.findElement(By.xpath("//img[@src='assets/images/agentimages/sample-image.svg']"));
			WebElement camera = driver.findElement(By.xpath("//mat-icon[contains(text(),'photo_camera')]"));
			if (photo.isDisplayed() && camera.isDisplayed()) {
				System.out.println("Photo and camera are displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Photo and camera are not displayed");
				componentsInformation.add(20, "Not Present");
			}

//name fields
			WebElement firstNameField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement lastNameField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (firstNameField.isDisplayed() && lastNameField.isDisplayed()) {
				System.out.println("Name Fields are displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Name Fields are not displayed");
				componentsInformation.add(21, "Not Present");
			}

//gender types
			WebElement genderHeading = driver.findElement(By.xpath("//label[@class='pb-10 text__md font-weight-600']"));
			WebElement type1 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]"));
			WebElement type2 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]"));
			WebElement type3 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[3]"));
			if (genderHeading.isDisplayed() && type1.isDisplayed() && type2.isDisplayed() && type3.isDisplayed()) {
				System.out.println("Gender Types are displayed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("Gender Types are not displayed");
				componentsInformation.add(22, "Not Present");
			}

//profile fields
			WebElement roleField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement userNameField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			WebElement emailField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[9]"));
			WebElement countryCodeField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[10]"));
			WebElement contactNumberField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[11]"));
			if (roleField1.isDisplayed() && userNameField.isDisplayed() && emailField.isDisplayed()
					&& countryCodeField.isDisplayed() && contactNumberField.isDisplayed()) {
				System.out.println("Profile Fields are displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Profile Fields are not displayed");
				componentsInformation.add(23, "Not Present");
			}

//add signature
			WebElement addSignatureHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mb-4'])[2]"));
			WebElement signatureInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-10'])[2]"));
			WebElement signatureField = driver
					.findElement(By.xpath("//textarea[@placeholder='Signature for Social Channels']"));
			if (addSignatureHeading.isDisplayed() && signatureInfo.isDisplayed() && signatureField.isDisplayed()) {
				System.out.println("Add Signature Information and Field are displayed");
				componentsInformation.add(24, "Present");
			} else {
				System.out.println("Add Signature Information and Field are not displayed");
				componentsInformation.add(24, "Not Present");
			}

//assign brands
			WebElement assignBrandHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mb-4'])[3]"));
			WebElement assignBrandInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-10'])[3]"));
			WebElement assignBrandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[12]"));
			if (assignBrandHeading.isDisplayed() && assignBrandInfo.isDisplayed() && assignBrandField.isDisplayed()) {
				System.out.println("Assign Brand Information and Field are displayed");
				componentsInformation.add(25, "Present");
			} else {
				System.out.println("Assign Brand Information and Field are not displayed");
				componentsInformation.add(25, "Not Present");
			}

//team name
			WebElement teamNameHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mb-4'])[4]"));
			WebElement teamNameInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-10'])[4]"));
			WebElement teamNameField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[13]"));
			if (teamNameHeading.isDisplayed() && teamNameInfo.isDisplayed() && teamNameField.isDisplayed()) {
				System.out.println("Team Name Information and Field are displayed");
				componentsInformation.add(26, "Present");
			} else {
				System.out.println("Team Name Information and Field are not displayed");
				componentsInformation.add(26, "Not Present");
			}

//channels and sub-channels
			WebElement channelsHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mb-4'])[5]"));
			WebElement channelsInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-10'])[5]"));
			WebElement channelsField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[14]"));
			if (channelsHeading.isDisplayed() && channelsInfo.isDisplayed() && channelsField.isDisplayed()) {
				System.out.println("Channels and Sub-channels information & field are displayed");
				componentsInformation.add(27, "Present");
			} else {
				System.out.println("Channels and Sub-channels information & field are not displayed");
				componentsInformation.add(27, "Not Present");
			}

//platform access
			WebElement platformHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mt-10 mb-4'])[1]"));
			WebElement platformInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-10'])[6]"));
			WebElement platformField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[15]"));
			if (platformHeading.isDisplayed() && platformInfo.isDisplayed() && platformField.isDisplayed()) {
				System.out.println("Platform Access Information and Field are displayed");
				componentsInformation.add(28, "Present");
			} else {
				System.out.println("Platform Access Information and Field are not displayed");
				componentsInformation.add(28, "Not Present");
			}

//platform properties
			WebElement platformPropertiesHeading = driver
					.findElement(By.xpath("(//p[@class='text__md font-weight-600 mt-10 mb-4'])[2]"));
			WebElement platformPropertiesInfo = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.50 mb-0'])"));
			WebElement platformPropertiesSearchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[16]"));
			if (platformPropertiesHeading.isDisplayed() && platformPropertiesInfo.isDisplayed()
					&& platformPropertiesSearchField.isDisplayed()) {
				System.out.println("Platform Properties information and field are displayed");
				componentsInformation.add(29, "Present");
			} else {
				System.out.println("Platform Properties information and field are not displayed");
				componentsInformation.add(29, "Not Present");
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
				componentsInformation.add(30, "Present");
			}
			else {
				System.out.println("Response Dashboard heading and options are not displayed");
				componentsInformation.add(30, "Not Present");
			}
			
//account settings options
			WebElement accountSettingsHeading=driver.findElement(By.xpath("(//p[contains(@class,'text__md font-weight-600 mb-0 mt-10 pb-3 border-bottom__light-grey')])[2]"));
			WebElement accountSettingsOption1=driver.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][1]"));
			WebElement accountSettingsOption2=driver.findElement(By.xpath("//p[text()=' Account Settings']//following:: div[@fxlayout='row wrap'][2]"));
			if(accountSettingsHeading.isDisplayed()&&accountSettingsOption1.isDisplayed()&&accountSettingsOption2.isDisplayed()) {
				System.out.println("Account Settings heading and options are displayed");
				componentsInformation.add(31, "Present");
			}
			else {
				System.out.println("Account Settings heading and options are not displayed");
				componentsInformation.add(31, "Not Present");
			}
			
//save user button
			WebElement saveUserButton=driver.findElement(By.xpath("//span[contains(text(),' Save User ')]"));
			if(saveUserButton.isDisplayed()) {
				System.out.println("Save User Button is displayed");
				componentsInformation.add(32, "Present");
			}
			else {
				System.out.println("Save User Button is not displayed");
				componentsInformation.add(32, "Not Present");
			}
			
//cancel button
			WebElement cancelButton2=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton2.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(33, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(33, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton2);
			Thread.sleep(3000);
			
			
			componentsInformation.add(34,CommonFunctions.getDataTime());			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"ManageUserUIComponents");
			
//logout
			WebElement expand=driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[1]"));
			js.executeScript("arguments[0].click()", expand);
			Thread.sleep(2000);
			
			WebElement logout=driver.findElement(By.xpath("//button[contains(text(),' Logout ')]"));
			js.executeScript("arguments[0].click()", logout);
			Thread.sleep(2000);
			
			WebElement confirmLogout=driver.findElement(By.xpath("//span[contains(text(),' Logout ')]"));
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
