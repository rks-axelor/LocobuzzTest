package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzManageBrandUIComponents {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void verifyingManageBrandComponents(WebDriver driver) throws Exception {
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

//manage brand
			WebElement manageBrandLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Manage_Brands.svg']"));
			WebElement manageBrand = driver.findElement(By.xpath("//span[contains(text(),'Manage Brands')]"));
			if (manageBrandLogo.isDisplayed() && manageBrand.isDisplayed()) {
				System.out.println("Manage Brand Logo and name are displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Manage Brand Logo and name are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", manageBrand);
			Thread.sleep(3000);

//manage brand tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement manageTab = driver.findElement(By.xpath("(//span[contains(text(),'Manage Brands')])[2]"));
			if (pushpin.isDisplayed() && manageTab.isDisplayed()) {
				System.out.println("Pushpin and manage tab are displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Pushpin and manage tab are not displayed");
				componentsInformation.add(2, "Not Present");
			}

//manage brand information
			WebElement heading = driver.findElement(By.xpath("(//p[contains(text(),'Manage Brands')])"));
			WebElement manageInfo = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (heading.isDisplayed() && manageInfo.isDisplayed()) {
				System.out.println("Manage Brand Heading and Information are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Manage Brand Heading and Information are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchField.isDisplayed() && searchButton.isDisplayed()) {
				System.out.println("Search Field and Button are displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Search Field and Button are not displayed");
				componentsInformation.add(4, "Not Present");
			}

//add brand button
			WebElement addBrandButton = driver.findElement(By.xpath("//div[contains(text(),'Add Brand ')]"));
			if (addBrandButton.isDisplayed()) {
				System.out.println("Add Brand Button is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Add Brand Button is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", addBrandButton);
			Thread.sleep(3000);

//arrow back
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			if (arrowBack.isDisplayed()) {
				System.out.println("Arrow Back is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Arrow Back is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//add brand heading
			WebElement addBrandHeading = driver.findElement(By.xpath("//h3[contains(text(),'Add Brand')]"));
			if (addBrandHeading.isDisplayed()) {
				System.out.println("Add Brand Heading is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Add Brand Heading is not displayed");
				componentsInformation.add(7, "Not Present");
			}

//brand profile information
			WebElement profileHeading = driver
					.findElement(By.xpath("//p[@class='text__regular--lg font-weight-600 mb-5']"));
			WebElement profileInfo = driver.findElement(By.xpath("//p[@class='text-regular mb-0 line-height-1.5']"));
			if (profileHeading.isDisplayed() && profileInfo.isDisplayed()) {
				System.out.println("Profile heading and information are displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Profile heading and information are not displayed");
				componentsInformation.add(8, "Not Present");
			}

//photo&camera and information
			WebElement photo = driver
					.findElement(By.xpath("(//img[@src='/assets/social-mention/post/default_brand.svg'])[1]"));
			WebElement camera = driver.findElement(By.xpath("(//mat-icon[contains(text(),'photo_camera')])[1]"));
			WebElement heading1 = driver
					.findElement(By.xpath("(//p[@class='font-weight-600 mt-8 line-height-1.25 mb-4'])[1]"));
			WebElement imageTypes = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.25'])[1]"));
			WebElement limit = driver
					.findElement(By.xpath("(//p[@class='mat-tooltip-trigger text__light text__sm'])[1]"));
			if (photo.isDisplayed() && camera.isDisplayed() && heading1.isDisplayed() && imageTypes.isDisplayed()
					&& limit.isDisplayed()) {
				System.out.println("Photo,Camera and information are displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Photo,Camera and information are not displayed");
				componentsInformation.add(9, "Not Present");
			}

//brand name field
			WebElement brandNameField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (brandNameField.isDisplayed()) {
				System.out.println("Brand Name Field is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Brand Name Field is not displayed");
				componentsInformation.add(10, "Not Present");
			}

//brand color
			WebElement colorArrow = driver.findElement(By.xpath(
					"//div[contains(@class,'mat-menu-trigger block-center cursor-pointer addbrands__body--left-selectbrandcolorwrapper')]"));
			WebElement colorHeading = driver
					.findElement(By.xpath("//p[@class='font-weight-600 mb-6 mt-8 ml-10 line-height-1.25']"));
			WebElement viewsothers = driver.findElement(By.xpath(
					"//p[@class='mat-menu-trigger colored__locobuzz ml-auto mb-6 mt-10 cursor-pointer line-height-1.25 font-weight-500']"));
			WebElement information = driver
					.findElement(By.xpath("//p[@class='mb-0 font-weight-500 text__sm line-height-1.5']"));
			if (colorArrow.isDisplayed() && colorHeading.isDisplayed() && viewsothers.isDisplayed()
					&& information.isDisplayed()) {
				System.out.println("Brand Colors Information are displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Brand Colors Information are not displayed");
				componentsInformation.add(11, "Not Present");
			}

//country field
			WebElement countryField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (countryField.isDisplayed()) {
				System.out.println("Country Field is displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Country Field is not displayed");
				componentsInformation.add(12, "Not Present");
			}

//brand symbol
			WebElement brandHeading = driver
					.findElement(By.xpath("//p[@class='mt-25 mb-10 text__md font-weight-600 line-height-1.25']"));
			WebElement brandInfo = driver
					.findElement(By.xpath("//p[@class='text__sm font-weight-500 mb-25 line-height-1.25']"));
			WebElement brandPhoto = driver
					.findElement(By.xpath("(//img[@src='/assets/social-mention/post/default_brand.svg'])[2]"));
			WebElement camera1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'photo_camera')])[2]"));
			WebElement brandHead = driver
					.findElement(By.xpath("(//p[@class='font-weight-600 mt-8 line-height-1.25 mb-4'])[2]"));
			WebElement imageTypes1 = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.25'])[2]"));
			WebElement limit1 = driver
					.findElement(By.xpath("(//p[@class='mat-tooltip-trigger text__light text__sm'])[2]"));
			if (brandHeading.isDisplayed() && brandInfo.isDisplayed() && brandPhoto.isDisplayed()
					&& camera1.isDisplayed() && brandHead.isDisplayed() && imageTypes1.isDisplayed()) {
				System.out.println("Brand Symbol information ,photo and camera are displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Brand Symbol information,photo  and camera are not displayed");
				componentsInformation.add(13, "Not Present");
			}
			
//category group
			WebElement categoryHeading=driver.findElement(By.xpath("//p[@class='text__md font-weight-600 mb-7']"));
			WebElement categoryInfo=driver.findElement(By.xpath("(//p[@class='text__light--sm line-height-1.50 mb-14'])[1]"));
			if(categoryHeading.isDisplayed()&&categoryInfo.isDisplayed()) {
				System.out.println("Cateory Group Heading and Information are displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Cateory Group Heading and Information are not displayed");
				componentsInformation.add(14, "Not Present");
			}
			
//category group field
			WebElement categoryGroupField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement categoryAddButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[1]"));
			if(categoryGroupField.isDisplayed()&&categoryAddButton.isDisplayed()) {
				System.out.println("Category Group Field and Add button are displayed");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Category Group Field and Add button are not displayed");
				componentsInformation.add(15, "Not Present");
			}
			js.executeScript("arguments[0].click()", categoryAddButton);
			Thread.sleep(3000);
			
//category group name 
			WebElement groupNameField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[10]"));
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			WebElement cancelButton=driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])[2]"));
			if(groupNameField.isDisplayed()&&saveButton.isDisplayed()&&cancelButton.isDisplayed()) {
				System.out.println("Group Name Field,Save and Cancel Button are displayed");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Group Name Field,Save and Cancel Button are not displayed");
				componentsInformation.add(16, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);
			
//catch-all category field
			WebElement catchAllCategoryField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			WebElement catchAllCategoryButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[2]"));
			if(catchAllCategoryField.isDisplayed()&&catchAllCategoryButton.isDisplayed()) {
				System.out.println("Catch-All Category field and button are displayed");
				componentsInformation.add(17, "Present");
			}
			else {
				System.out.println("Catch-All Category field and button are not displayed");
				componentsInformation.add(17, "Not Present");
			}
			js.executeScript("arguments[0].click()", catchAllCategoryButton);
			Thread.sleep(3000);
			
//catch-all category name 
			WebElement catchAllCategoryNameField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[10]"));
			WebElement saveButton1=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			WebElement cancelButton1=driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])[2]"));
			if(catchAllCategoryNameField.isDisplayed()&&saveButton1.isDisplayed()&&cancelButton1.isDisplayed()) {
				System.out.println("Catch-all category field,save and cancel button are displayed");
				componentsInformation.add(18, "Present");
			}
			else {
				System.out.println("Catch-all category field,save and cancel button are not displayed");
				componentsInformation.add(18, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton1);
			Thread.sleep(3000);
			
//assign user
			WebElement assignUserHeading=driver.findElement(By.xpath("//p[@class='text__md font-weight-600 mb-7 mt-18']"));
			WebElement assignUserInfo=driver.findElement(By.xpath("(//p[@class='text__light--sm line-height-1.50 mb-14'])[2]"));
			WebElement assignUserField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[9]"));
			if(assignUserHeading.isDisplayed()&&assignUserInfo.isDisplayed()&&assignUserField.isDisplayed()) {
				System.out.println("Assign User Information and field are displayed");
				componentsInformation.add(19, "Present");
			}
			else {
				System.out.println("Assign User Information and field are not displayed");
				componentsInformation.add(19, "Not Present");
			}
			
//ticket creation
			WebElement ticketCreationHeading=driver.findElement(By.xpath("//p[@class='text__md font-weight-600 mb-7 mt-10']"));
			WebElement ticketCreationInfo=driver.findElement(By.xpath("//p[@class='text__light--sm line-height-1.50']"));
			WebElement ticketCreationButton=driver.findElement(By.xpath("//div[@class='d-flex-items-center mt-15']"));
			if(ticketCreationHeading.isDisplayed()&&ticketCreationInfo.isDisplayed()&&ticketCreationButton.isDisplayed()) {
				System.out.println("Ticket Creation Information and Active Button are displayed");
				componentsInformation.add(20, "Present");
			}
			else {
				System.out.println("Ticket Creation Information and Active Button are not displayed");
				componentsInformation.add(20, "Not Present");
			}
			
//save brand button
			WebElement saveBrandButton=driver.findElement(By.xpath("//span[contains(text(),'Save Brand')]"));
			if(saveBrandButton.isDisplayed()) {
				System.out.println("Save Brand Button is displayed");
				componentsInformation.add(21, "Present");
			}
			else {
				System.out.println("Save Brand Button is not displayed");
				componentsInformation.add(21, "Not Present");
			}
			
//cancel button
			WebElement cancelButton2=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton2.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(22, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(22, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton2);
			Thread.sleep(3000);
			
			
			componentsInformation.add(23,CommonFunctions.getDataTime());			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"ManageBrandUIComponents");
			
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
