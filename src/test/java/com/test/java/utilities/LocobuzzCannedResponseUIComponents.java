package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzCannedResponseUIComponents {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar=driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);
			
			
//account session Button
			WebElement accountSession=driver.findElement(By.xpath("//span[contains(text(),' Accounts')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void verifyingCannedResponseComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//response management
			WebElement responseManagement=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),' Response Management ')])[1]"));
			if(responseManagement.isDisplayed()) {
				System.out.println("Response Management is displayed");
				componentsInformation.add(0,"Present");
			}
			else {
				System.out.println("Response Management is not displayed");
				componentsInformation.add(0,"Not Present");
			}
			js.executeScript("arguments[0].click()", responseManagement);
			Thread.sleep(3000);
			
//canned Response
			WebElement cannedResponseLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Canned_Responses.svg']"));
			WebElement cannedResponse=driver.findElement(By.xpath("(//span[contains(text(),'Canned Responses')])[1]"));
			if(cannedResponseLogo.isDisplayed() && cannedResponse.isDisplayed()) {
				System.out.println("Canned Response is displayed");
				componentsInformation.add(1,"Present");
			}
			else {
				System.out.println("Canned Response is not  displayed");
				componentsInformation.add(1,"Not Present");
			}
			js.executeScript("arguments[0].click()", cannedResponse);
			Thread.sleep(3000);
			
//canned Response tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])"));
			WebElement cannedResponseTab=driver.findElement(By.xpath("(//span[contains(text(),'Canned Responses')])[3]"));
			if(pushpin.isDisplayed() && cannedResponseTab.isDisplayed()) {
				System.out.println("Canned Response Tab is displayed");
				componentsInformation.add(2,"Present");
			}
			else {
				System.out.println("Canned Response Tab is not  displayed");
				componentsInformation.add(2,"Not Present");
			}
			
//Canned Response Information
			WebElement cannedResponseHeading=driver.findElement(By.xpath("//p[contains(text(),'Canned Responses ')]"));
			WebElement information=driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if(cannedResponseHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Setup Canned Response Information is displayed");
				componentsInformation.add(3,"Present");
			}
			else {
				System.out.println("Setup Canned Response Information is not displayed");
				componentsInformation.add(3,"Not Present");
			}
			
//select brand
			WebElement selectBrandField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			if(selectBrandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Select Brand is displayed");
				componentsInformation.add(4,"Present");
			}
			else {
				System.out.println("Select Brand is not  displayed");
				componentsInformation.add(4,"Not Present");
			}
			
//select brand
			WebElement selectBrand = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[1]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);
			WebElement searchBrand = driver.findElement(By.xpath("(//input[@id='brandSearchText'])"));
			searchBrand.sendKeys("ajio");
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(2000);
			
//add responses button
			WebElement addResponses=driver.findElement(By.xpath("//span[contains(text(),' Add Responses ')]"));
			if(addResponses.isDisplayed()) {
				System.out.println("Add Responses Button is displayed");
				componentsInformation.add(5,"Present");
			}
			else {
				System.out.println("Add Responses Button is not displayed");
				componentsInformation.add(5,"Not Present");
			}
			js.executeScript("arguments[0].click()", addResponses);
			Thread.sleep(3000);
			
//add response heading
			WebElement addResponseHeading=driver.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			if(addResponseHeading.isDisplayed()) {
				System.out.println("Add Response Heading is displayed");
				componentsInformation.add(6,"Present");
			}
			else {
				System.out.println("Add Response Heading is not displayed");
				componentsInformation.add(6,"Not Present");
			}
			
//response category field
			WebElement responseCategoryField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement arrow1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			if(responseCategoryField.isDisplayed() && arrow1.isDisplayed()) {
				System.out.println("Response Category Field is displayed");
				componentsInformation.add(7,"Present");
			}
			else {
				System.out.println("Response Category Field is not displayed");
				componentsInformation.add(7,"Not Present");
			}
			
//add response category button
			WebElement addResponseCategory=driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle_outline')]"));
			if(addResponseCategory.isDisplayed()) {
				System.out.println("Add Response Category Button is displayed");
				componentsInformation.add(8,"Present");
			}
			else {
				System.out.println("Add Response Category Button is not displayed");
				componentsInformation.add(8,"Not Present");
			}
			js.executeScript("arguments[0].click()", addResponseCategory);
			Thread.sleep(2000);
			
//response category name field
			WebElement responseCategoryNameField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			if(responseCategoryNameField.isDisplayed()) {
				System.out.println("Response Category Name Field is displayed");
				componentsInformation.add(9,"Present");
			}
			else {
				System.out.println("Response Category Name Field is not displayed");
				componentsInformation.add(9,"Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(10,"Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(10,"Not Present");
			}
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])[2]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(11,"Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(11,"Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(2000);
			
//response name field
			WebElement responseNameField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if(responseNameField.isDisplayed()) {
				System.out.println("Response Name Field is displayed");
				componentsInformation.add(12,"Present");
			}
			else {
				System.out.println("Response Name Field is not displayed");
				componentsInformation.add(12,"Not Present");
			}
			
//response type
			WebElement responseType=driver.findElement(By.xpath("(//span[contains(text(),'Response Type:')])"));
			if(responseType.isDisplayed()) {
				System.out.println("Response Type is displayed");
				componentsInformation.add(13,"Present");
			}
			else {
				System.out.println("Response Type is not displayed");
				componentsInformation.add(13,"Not Present");
			}
			
//text
			WebElement text=driver.findElement(By.xpath("(//span[@class='mat-radio-label-content' and contains(text(),'Text')])"));
			if(text.isDisplayed()) {
				System.out.println("Text is displayed");
				componentsInformation.add(14,"Present");
			}
			else {
				System.out.println("Text is not displayed");
				componentsInformation.add(14,"Not Present");
			}
			
//html
			WebElement html=driver.findElement(By.xpath("(//span[@class='mat-radio-label-content' and contains(text(),'HTML')])"));
			if(html.isDisplayed()) {
				System.out.println("Html is displayed");
				componentsInformation.add(15,"Present");
			}
			else {
				System.out.println("Html is not displayed");
				componentsInformation.add(15,"Not Present");
			}
			
//personalize
			WebElement personalize=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			if(personalize.isDisplayed()) {
				System.out.println("Personalize is displayed");
				componentsInformation.add(16,"Present");
			}
			else {
				System.out.println("Personalize is not displayed");
				componentsInformation.add(16,"Not Present");
			}
			js.executeScript("arguments[0].click()", personalize);
			Thread.sleep(2000);
			
//fullname
			WebElement fullName=driver.findElement(By.xpath("//button[contains(text(),'Full Name')]"));
			if(fullName.isDisplayed()) {
				System.out.println("Full Name is displayed");
				componentsInformation.add(17,"Present");
			}
			else {
				System.out.println("Full Name is not displayed");
				componentsInformation.add(17,"Not Present");
			}
			
//Screen name
			WebElement screenName=driver.findElement(By.xpath("//button[contains(text(),'Screen Name')]"));
			if(screenName.isDisplayed()) {
				System.out.println("Screen Name is displayed");
				componentsInformation.add(18,"Present");
			}
			else {
				System.out.println("Screen Name is not displayed");
				componentsInformation.add(18,"Not Present");
			}
			js.executeScript("arguments[0].click()", personalize);
			Thread.sleep(2000);
			
//save response button
			WebElement saveResponseButton=driver.findElement(By.xpath("//span[contains(text(),' Save Response ')]"));
			if(saveResponseButton.isDisplayed()) {
				System.out.println("Save Response Button is displayed");
				componentsInformation.add(19,"Present");
			}
			else {
				System.out.println("Save Response Button is not displayed");
				componentsInformation.add(19,"Not Present");
			}
			
//cancel button
			WebElement cancelButton1=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton1.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(20,"Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(20,"Not Present");
			}
			
//close button
			WebElement closeButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if(closeButton.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(21,"Present");
			}
			else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(21,"Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);
			
//search response name
			WebElement searchButton=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement searchIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchButton.isDisplayed() && searchIcon.isDisplayed()) {
				System.out.println("Search Button is displayed");
				componentsInformation.add(22,"Present");
			}
			else {
				System.out.println("Search Button is not displayed");
				componentsInformation.add(22,"Not Present");
			}
			
//filter
			WebElement filter=driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt ')])"));
			if(filter.isDisplayed()) {
				System.out.println("Filter Button is displayed");
				componentsInformation.add(23,"Present");
			}
			else {
				System.out.println("Filter Button is not displayed");
				componentsInformation.add(23,"Not Present");
			}
			js.executeScript("arguments[0].click()", filter);
			Thread.sleep(2000);
			
//response type
			WebElement responseTypeField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if(responseTypeField.isDisplayed()) {
				System.out.println("Response Type Field is displayed");
				componentsInformation.add(24,"Present");
			}
			else {
				System.out.println("Response Type Field is not displayed");
				componentsInformation.add(24,"Not Present");
			}
			js.executeScript("arguments[0].click()", filter);
			Thread.sleep(2000);
			
//manage response category
			WebElement manageResponseCategoryButton=driver.findElement(By.xpath("(//span[contains(text(),' Manage Response Categories ')])"));
			if(manageResponseCategoryButton.isDisplayed()) {
				System.out.println("Manage Response Category is displayed");
				componentsInformation.add(25,"Present");
			}
			else {
				System.out.println("Manage Response Category is not displayed");
				componentsInformation.add(25,"Not Present");
			}
			
			js.executeScript("arguments[0].click()", manageResponseCategoryButton);
			Thread.sleep(2000);
			
//manage response category heading
			WebElement responseCategoryHeading=driver.findElement(By.xpath("//h3[@class='modal__title']"));
			if(responseCategoryHeading.isDisplayed()) {
				System.out.println("Manage Response Category Heading is displayed");
				componentsInformation.add(26,"Present");
			}
			else {
				System.out.println("Manage Response Category Heading is not displayed");
				componentsInformation.add(26,"Not Present");
			}
			
//close
			WebElement close=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if(close.isDisplayed()) {
				System.out.println("Close/Cross is displayed");
				componentsInformation.add(27,"Present");
			}
			else {
				System.out.println("Close/Cross is not displayed");
				componentsInformation.add(27,"Not Present");
			}
			
//search
			WebElement search=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if(search.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(28,"Present");
			}
			else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(28,"Not Present");
			}
			
//total categories count
			WebElement totalCount=driver.findElement(By.xpath("(//span[contains(@class,'font-weight-600 ml-10 ')])"));
			if(totalCount.isDisplayed()) {
				System.out.println("Total Count of Categories is displayed");
				componentsInformation.add(29,"Present");
			}
			else {
				System.out.println("Total Count of Categories is not displayed");
				componentsInformation.add(29,"Not Present");
			}
			
//add response categories
			WebElement addResponseIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])"));
			WebElement addResponseCategory1=driver.findElement(By.xpath("(//span[contains(text(),'Add Response Categories')])"));
			if(addResponseIcon.isDisplayed() && addResponseCategory1.isDisplayed()) {
				System.out.println("Add Response Category Button is displayed");
				componentsInformation.add(30,"Present");
			}
			else {
				System.out.println("Add Response Category Button is not displayed");
				componentsInformation.add(30,"Not Present");
			}
			js.executeScript("arguments[0].click()", addResponseCategory1);
			Thread.sleep(2000);
			
//search field
			WebElement searchField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if(searchField.isDisplayed()) {
				System.out.println("Response Category Name Search Field is displayed");
				componentsInformation.add(31,"Present");
			}
			else {
				System.out.println("Response Category Name Search Field is not displayed");
				componentsInformation.add(31,"Not Present");
			}
			
//save button
			WebElement saveButton1=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			if(saveButton1.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(32,"Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(32,"Not Present");
			}
			
//cancel button
			WebElement cancelButton2=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])"));
			if(cancelButton2.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(33,"Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(33,"Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton2);
			Thread.sleep(2000);
			
//edit button
			WebElement editButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			if(editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
				componentsInformation.add(34,"Present");
			}
			else {
				System.out.println("Edit Button is not displayed");
				componentsInformation.add(34,"Not Present");
			}
			
//delete button
			WebElement deleteButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete_outline ')])[1]"));
			if(deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
				componentsInformation.add(35,"Present");
			}
			else {
				System.out.println("Delete Button is not displayed");
				componentsInformation.add(35,"Not Present");
			}
			
//close button
			WebElement closeButton1=driver.findElement(By.xpath("//span[contains(text(),' Close ')]"));
			if(closeButton1.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(36,"Present");
			}
			else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(36,"Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(2000);
			
            componentsInformation.add(37,CommonFunctions.getDataTime());			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"CannedResponseUIComponents");
			
//logout
			WebElement expand=driver.findElement(By.xpath("//mat-icon[contains(text(),'expand_less')]"));
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
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
