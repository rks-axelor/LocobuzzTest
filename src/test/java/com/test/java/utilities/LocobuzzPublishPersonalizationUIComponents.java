package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzPublishPersonalizationUIComponents {

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

	public static void verifyingPublishPersonalizationComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//Listening Settings
			WebElement ListeningSettings = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if (ListeningSettings.isDisplayed()) {
				System.out.println("Listening Settings is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Listening Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);
			
//publish settings
			WebElement publishSettingsLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Publish_Settings.svg']"));
			WebElement publishSettingsLabel=driver.findElement(By.xpath("//span[contains(text(),'Publish Setting')]"));
			if(publishSettingsLogo.isDisplayed()&&publishSettingsLabel.isDisplayed()) {
				System.out.println("Publish settings logo and label are displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Publish settings logo and label are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", publishSettingsLabel);
			Thread.sleep(3000);
			
//personalization
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[3]"));
			WebElement personalizationTab=driver.findElement(By.xpath("(//span[contains(text(),'Personalization')])[1]"));
			if(pushpin.isDisplayed()&&personalizationTab.isDisplayed()) {
				System.out.println("Personalization tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Personalization tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}
			js.executeScript("arguments[0].click()", personalizationTab);
			Thread.sleep(3000);
			
//personalization(heading,information)
			WebElement personalizeHeading=driver.findElement(By.xpath("//p[contains(text(),'Personalization ')]"));
			WebElement personalizeInformation=driver.findElement(By.xpath("(//p[@class='mb-0 mt-6 text__light--sm font-weight-400'])[3]"));
			if(personalizeHeading.isDisplayed()&&personalizeInformation.isDisplayed()) {
				System.out.println("personalization heading and information are displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("personalization heading and information are not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
//brand,search,columns fields
			WebElement brandField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			WebElement searchField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[4]"));
			WebElement columnsField=driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			WebElement downloadField=driver.findElement(By.xpath("//span[contains(text(),' Download ')]"));
			if(brandField.isDisplayed()&&searchField.isDisplayed()&&searchButton.isDisplayed()&&columnsField.isDisplayed()&&downloadField.isDisplayed()) {
				System.out.println("Brand,search,columns fields are displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Brand,search,columns fields are not displayed");
				componentsInformation.add(4, "Not Present");
			}
			
//add new brand
			WebElement addNewBrand=driver.findElement(By.xpath("//span[contains(text(),' Add New Field ')]"));
			if(addNewBrand.isDisplayed()) {
				System.out.println("Add New brand is displayed");
				componentsInformation.add(5, "Present");
			}
			else {
				System.out.println("Add New brand is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", addNewBrand);
			Thread.sleep(3000);
			
//add new brand(heading,infromation) and cross button
			WebElement addNewBrandHeading=driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement addNewBrandInfo=driver.findElement(By.xpath("(//p[contains(@class,'text__light--sm')])[4]"));
			WebElement crossButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if(addNewBrandHeading.isDisplayed()&&addNewBrandInfo.isDisplayed()&&crossButton.isDisplayed()) {
				System.out.println("Add New Brand heading,infromation,cross button are displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Add New Brand heading,infromation,cross button are not displayed");
				componentsInformation.add(6, "Not Present");
			}
			
//field type,field name,character limit fields
			WebElement fieldType=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			WebElement fieldName=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement characterLimitField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			WebElement keywordUp=driver.findElement(By.xpath("//mat-icon[contains(text(),' keyboard_arrow_up')]"));
			WebElement keywordDown=driver.findElement(By.xpath("//mat-icon[contains(text(),' keyboard_arrow_down')]"));
			if(fieldType.isDisplayed()&&arrow.isDisplayed()&&fieldName.isDisplayed()&&characterLimitField.isDisplayed()&&keywordUp.isDisplayed()&&keywordDown.isDisplayed()){
				System.out.println("Field type,Field name,Character limit fields are displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Field type,Field name,Character limit fields are not displayed");
				componentsInformation.add(7, "Not Present");
			}
			
//note message,add new field
			WebElement noteMessage=driver.findElement(By.xpath("//p[@class='text__light--sm mt-2']"));
			WebElement addNewField=driver.findElement(By.xpath("//span[contains(text(),'+Add New Field')]"));
			if(noteMessage.isDisplayed()&&addNewField.isDisplayed()) {
				System.out.println("Note Message and add new field are displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Note Message and add new field are not displayed");
				componentsInformation.add(8, "Not Present");
			}
			
//cancel,save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save Field ')]"));
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(saveButton.isDisplayed()&&cancelButton.isDisplayed()) {
				System.out.println("Save and cancel button are displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Save and cancel button are nopt displayed");
				componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(10, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "PublishPersonalizationUICompone");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
