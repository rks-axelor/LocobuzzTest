package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAgentAccountSectionProfile {

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

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void verifyingAccountComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//Locobuzzlogo
			WebElement locobuzzLogo = driver.findElement(By.xpath("//img[@src='assets/locobuzz-logo.svg']"));
			if (locobuzzLogo.isDisplayed()) {
				System.out.println("Locobuzz image is dispalyed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Locobuzz image is not dispalyed");
				componentsInformation.add(0, "Not Present");
			}

//AccountSection and Arrow Back
			WebElement accountSessionName = driver.findElement(By.xpath("//span[contains(text(),'Account Section')]"));
			WebElement arrowBackButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			if (accountSessionName.isDisplayed() && arrowBackButton.isDisplayed()) {
				System.out.println("Account Session Name and Arrow Back Button is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Account Session Name and Arrow Back Button is not displayed");
				componentsInformation.add(1, "Not Present");
			}

//search
			WebElement inputBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			WebElement searchSymbol = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			if (inputBox.isDisplayed() && searchSymbol.isDisplayed()) {
				System.out.println("Search Symbol is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Search Symbol is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//your profile
			WebElement profile = driver.findElement(By.xpath("(//span[contains(text(),'Your Profile')])[1]"));
			if (profile.isDisplayed()) {
				System.out.println("Your Profile is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Your Profile is not displayed");
				componentsInformation.add(3, "Not Present");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void verfyingProfileComponents(WebDriver driver) throws Exception {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;

// Profile Tab
			WebElement profilePushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement profileTab = driver.findElement(By.xpath("(//span[contains(text(),'Your Profile')])[2]"));
			if (profilePushpin.isDisplayed() && profileTab.isDisplayed()) {
				System.out.println("Profile Tab is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Profile Tab is not displayed");
				componentsInformation.add(4, "Not Present");
			}

// profile message
			WebElement profile = driver.findElement(By.xpath("(//p[contains(text(),'Your Profile')])"));
			WebElement profileMessage = driver
					.findElement(By.xpath("(//p[@class='mb-0 mt-6 text__light--sm font-weight-400'])"));
			if (profile.isDisplayed() && profileMessage.isDisplayed()) {
				System.out.println("Profile Message is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Profile Message is not displayed");
				componentsInformation.add(5, "Not Present");
			}

			Thread.sleep(2000);
// genderLogo
			WebElement genderLogo = driver
					.findElement(By.xpath("//img[@src='assets/images/account-profile/genders.svg']"));
			if (genderLogo.isDisplayed()) {
				System.out.println("Gender Logo is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Gender Logo is not displayed");
				componentsInformation.add(6, "Not Present");
			}

// email logo
			WebElement emailLogo = driver
					.findElement(By.xpath("(//img[@src='assets/images/account-profile/email.svg'])"));
			if (emailLogo.isDisplayed()) {
				System.out.println("Email Logo is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Email Logo is not displayed");
				componentsInformation.add(7, "Not Present");
			}

// phone logo
			WebElement phoneLogo = driver
					.findElement(By.xpath("(//img[@src='assets/images/account-profile/phone.svg'])"));
			if (phoneLogo.isDisplayed()) {
				System.out.println("Phone Logo is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Phone Logo is not displayed");
				componentsInformation.add(8, "Not Present");
			}

// edit button
			WebElement editLogo = driver
					.findElement(By.xpath("(//img[@src='assets/images/account-profile/Edit_White.svg'])"));
			WebElement editButton = driver.findElement(By.xpath("//span[contains(text(),' Edit ')]"));
			if (editLogo.isDisplayed() && editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Edit Button is not displayed");
				componentsInformation.add(9, "Not Present");
			}

			js.executeScript("arguments[0].click()", editButton);
			editComponents(driver);

// change password
			WebElement lockSymbol = driver
					.findElement(By.xpath("//img[@src='assets/images/account-profile/lock.svg']"));
			WebElement changePassword = driver.findElement(By.xpath("//span[contains(text(),'Change password')]"));
			if (lockSymbol.isDisplayed() && changePassword.isDisplayed()) {
				System.out.println("Change Password is displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Change Password is not displayed");
				componentsInformation.add(18, "Not Present");
			}

			js.executeScript("arguments[0].click()", changePassword);
			changePasswordComponents(driver);

			assignedBrands(driver);

			editProcess(driver);

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			componentsInformation.add(32, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "AgentAccountSectionProfileInfo");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void editComponents(WebDriver driver) throws Exception {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
// photocamera
			WebElement photoCamera = driver.findElement(By.xpath("//mat-icon[contains(text(),'photo_camera')]"));
			if (photoCamera.isDisplayed()) {
				System.out.println("Photo Camera is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Photo Camera is not displayed");
				componentsInformation.add(10, "Not Present");
			}

// firstname
			WebElement firstName = driver.findElement(By.xpath("//mat-label[contains(text(),'First Name')]"));
			if (firstName.isDisplayed()) {
				System.out.println("First Name is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("First Name is not displayed");
				componentsInformation.add(11, "Not Present");
			}

// Last name
			WebElement lastName = driver.findElement(By.xpath("//mat-label[contains(text(),'Last Name')]"));
			if (lastName.isDisplayed()) {
				System.out.println("Last Name is displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Last Name is not displayed");
				componentsInformation.add(12, "Not Present");
			}

// Genders
			WebElement genderLabel = driver.findElement(By.xpath("//label[contains(text(),'Gender')]"));
			WebElement male = driver.findElement(By.xpath("//span[contains(text(),'Male ')]"));
			WebElement female = driver.findElement(By.xpath("//span[contains(text(),'Female ')]"));
			WebElement others = driver.findElement(By.xpath("//span[contains(text(),'Other ')]"));
			if (genderLabel.isDisplayed() && male.isDisplayed() && female.isDisplayed() && others.isDisplayed()) {
				System.out.println("Gender Names is displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Gender Names is not displayed");
				componentsInformation.add(13, "Not Present");
			}

// email
			WebElement email = driver.findElement(By.xpath("//mat-label[contains(text(),'Email')]"));
			if (email.isDisplayed()) {
				System.out.println("Email  is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Email is not displayed");
				componentsInformation.add(14, "Not Present");
			}

// contact number
			WebElement contactNumber = driver.findElement(By.xpath("//mat-label[contains(text(),'Contact Number')]"));
			if (contactNumber.isDisplayed()) {
				System.out.println("Contact Number is displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Contact Number is not displayed");
				componentsInformation.add(15, "Not Present");
			}

// cancel button
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(16, "Not Present");
			}

// savechanges button
			WebElement saveChangesButton = driver.findElement(By.xpath("//span[contains(text(),' Save Changes ')]"));
			if (saveChangesButton.isDisplayed()) {
				System.out.println("Save Changes Button is displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Save Changes Button is not displayed");
				componentsInformation.add(17, "Not Present");
			}

			js.executeScript("arguments[0].click()", cancelButton);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void changePasswordComponents(WebDriver driver) throws Exception {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
// current password
			WebElement currentPassword = driver.findElement(By.xpath("//input[@formcontrolname='currentpassword']"));
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'visibility_off')])[1]"));
			if (currentPassword.isDisplayed() && symbol.isDisplayed()) {
				System.out.println("Current Password is displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("Current Password is not displayed");
				componentsInformation.add(19, "Not Present");
			}

// new password
			WebElement newPassword = driver.findElement(By.xpath("//input[@formcontrolname='newpassword']"));
			WebElement symbol1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'visibility_off')])[2]"));
			if (newPassword.isDisplayed() && symbol1.isDisplayed()) {
				System.out.println("New Password is displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("New Password is not displayed");
				componentsInformation.add(20, "Not Present");
			}

// confirm new password
			WebElement confirmNewPassword = driver.findElement(By.xpath("//input[@formcontrolname='confirmpassword']"));
			WebElement symbol2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'visibility_off')])[3]"));
			if (confirmNewPassword.isDisplayed() && symbol2.isDisplayed()) {
				System.out.println("Confirm New Password is displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Confirm New Password is not displayed");
				componentsInformation.add(21, "Not Present");
			}

// password must contains
			WebElement upperCase = driver.findElement(By.xpath("//span[contains(text(),'Upper case letter')]"));
			WebElement lowerCase = driver.findElement(By.xpath("//span[contains(text(),'Lower case letter')]"));
			WebElement specialCharacters = driver
					.findElement(By.xpath("//span[contains(text(),'Special character ')]"));
			WebElement numbers = driver.findElement(By.xpath("//span[contains(text(),'Number')]"));
			WebElement minimum = driver.findElement(By.xpath("//span[contains(text(),'Minimum')]"));
			if (upperCase.isDisplayed() && lowerCase.isDisplayed() && specialCharacters.isDisplayed()
					&& numbers.isDisplayed() && minimum.isDisplayed()) {
				System.out.println("Password must contains options is dispalyed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("Password must contains options is not dispalyed");
				componentsInformation.add(22, "Not Present");
			}

// cancel button
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(23, "Not Present");
			}

// save password button
			WebElement savePasswordButton = driver.findElement(By.xpath("//span[contains(text(),' Save Password ')]"));
			if (savePasswordButton.isDisplayed()) {
				System.out.println("Save Password Button is displayed");
				componentsInformation.add(24, "Present");
			} else {
				System.out.println("Save Password Button is not displayed");
				componentsInformation.add(24, "Not Present");
			}

// close
			WebElement close = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if (close.isDisplayed()) {
				System.out.println("Close is displayed");
				componentsInformation.add(25, "Present");
			} else {
				System.out.println("Close is not displayed");
				componentsInformation.add(25, "Not Present");
			}

			js.executeScript("arguments[0].click()", close);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void assignedBrands(WebDriver driver) throws Exception {
		try {

// Assigned Brand
			WebElement assignedBrand = driver.findElement(By.xpath("//p[contains(text(),' Assigned Brands ')]"));
			if (assignedBrand.isDisplayed()) {
				System.out.println("Assigned Brands is displayed");
				componentsInformation.add(26, "Present");
			} else {
				System.out.println("Assigned Brands is not displayed");
				componentsInformation.add(26, "Not Present");
			}

//Assigned Brand Details
			WebElement assignedBrand1 = driver.findElement(By
					.xpath("(//div[contains(@class,'account-profile__right--card-item-body-pills block-center')])[1]"));
			WebElement assignedBrand2 = driver.findElement(By
					.xpath("(//div[contains(@class,'account-profile__right--card-item-body-pills block-center')])[2]"));
			WebElement assignedBrand3 = driver.findElement(By
					.xpath("(//div[contains(@class,'account-profile__right--card-item-body-pills block-center')])[3]"));
			WebElement assignedBrand4 = driver.findElement(By
					.xpath("(//div[contains(@class,'account-profile__right--card-item-body-pills block-center')])[4]"));
			WebElement assignedBrand5 = driver.findElement(By
					.xpath("(//div[contains(@class,'account-profile__right--card-item-body-pills block-center')])[5]"));
			WebElement assignedBrand6 = driver.findElement(By
					.xpath("(//div[contains(@class,'account-profile__right--card-item-body-pills block-center')])[6]"));
			WebElement assignedBrands = driver
					.findElement(By.xpath("//span[@mattooltipclass='custom__tooltip-normal']"));
			if (assignedBrand1.isDisplayed() && assignedBrand2.isDisplayed() && assignedBrand3.isDisplayed()
					&& assignedBrand4.isDisplayed() && assignedBrand5.isDisplayed() && assignedBrand6.isDisplayed()
					&& assignedBrands.isDisplayed()) {
				System.out.println("Assigned Brands Details is displayed");
				componentsInformation.add(27, "Present");
			} else {
				System.out.println("Assigned Brands Details is not displayed");
				componentsInformation.add(27, "Not Present");
			}
			
//assigned channels/subchannels
			WebElement assignedChannels=driver.findElement(By.xpath("//p[contains(@class,'account-profile__right') and contains(text(),' Assigned Channels/Sub-Channels ')]"));
			WebElement assignedInfo=driver.findElement(By.xpath("//p[contains(@class,'textarea-featured__left--emoji font-weight-500')]"));
			if(assignedChannels.isDisplayed()&&assignedInfo.isDisplayed()) {
				System.out.println("Assigned Channels and subchannels ,details are displayed");
				componentsInformation.add(28, "Present");
			}
			else {
				System.out.println("Assigned Channels and subchannels ,details are not displayed");
				componentsInformation.add(28, "Not Present");
			}
			
//assigned teams
			WebElement assignedTeams = driver.findElement(
					By.xpath("//p[contains(@class,'account-profile__right') and contains(text(),' Assigned Teams ')]"));
			WebElement assigned = driver.findElement(By.xpath(
					"(//div[contains(@class,'account-profile__right--card-item-body-pills teamsbg block-center')])[1]"));
			if (assignedTeams.isDisplayed() && assigned.isDisplayed()) {
				System.out.println("Assigned teams and details are displayed");
				componentsInformation.add(29, "Present");
			} else {
				System.out.println("Assigned teams and details are not displayed");
				componentsInformation.add(29, "Not Present");
			}
			
//skills
			WebElement skills=driver.findElement(By.xpath("//p[contains(@class,'account-profile__right') and contains(text(),'Skills')]"));
			WebElement skillsInfo=driver.findElement(By.xpath("(//p[contains(@class,'textarea-featured__left--emoji')])[2]"));
			if(skills.isDisplayed()&&skillsInfo.isDisplayed()) {
				System.out.println("Skills and info are displayed");
				componentsInformation.add(30, "Present");
			}
			else {
				System.out.println("Skills and info are not displayed");
				componentsInformation.add(30, "Not Present");
			}
			
//Permissions
			WebElement title = driver.findElement(
					By.xpath("//p[contains(@class,'account-profile__right') and contains(text(),' Permissions ')]"));
			if (title.isDisplayed()) {
				System.out.println("Permissions Given is displayed");
				componentsInformation.add(31, "Present");
			} else {
				System.out.println("Permissions Given is not displayed");
				componentsInformation.add(31, "Not Present");
			}


		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void editProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement editButton = driver.findElement(By.xpath("//span[contains(text(),' Edit ')]"));
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);

//Genders
			WebElement male = driver.findElement(By.xpath("//span[contains(text(),'Male ')]"));
			js.executeScript("arguments[0].click()", male);
			Thread.sleep(3000);

//contact number
			WebElement contactNumber = driver.findElement(By.xpath("//input[@formcontrolname='contactnumber']"));
			contactNumber.sendKeys("9752648766");
			Thread.sleep(3000);

//savechanges button
			WebElement saveChangesButton = driver.findElement(By.xpath("//span[contains(text(),' Save Changes ')]"));
			js.executeScript("arguments[0].click()", saveChangesButton);
			Thread.sleep(3000);

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
