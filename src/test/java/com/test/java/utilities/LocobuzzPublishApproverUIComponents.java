package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class LocobuzzPublishApproverUIComponents {
	public static List<String> componentsInformation = new ArrayList<String>();

	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//img[@src='assets/images/Locobuzz_Symbol.svg']"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("//mat-icon[contains(text(),'expand_less')]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void verifyingPublishApproverUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Listening Settings
			WebElement ListeningSettings=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if(ListeningSettings.isDisplayed()) {
				System.out.println("Listening Settings is displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Listening Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);
			
//Publish Setting
			WebElement PublishSettinglogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Publish_Settings.svg']"));
			WebElement PublishSetting=driver.findElement(By.xpath("//span[contains(text(),'Publish Setting')]"));
			if(PublishSettinglogo.isDisplayed()&&PublishSetting.isDisplayed()) {
				System.out.println("Publish Setting is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Publish Setting is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", PublishSetting);
			Thread.sleep(3000);
			
//Publish Approver Setting tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement PASTab=driver.findElement(By.xpath("(//span[contains(text(),'Publish Approver Setting')])[1]"));
			if(pushpin.isDisplayed()&&PASTab.isDisplayed()) {
				System.out.println("Publish Approver Setting tab Label is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Publish Approver Setting tab Label is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//Publish Approver Setting tab name	and Information	

			WebElement Publishheading=driver.findElement(By.xpath("(//p[contains(text(),'Publish Approver Settings')])"));
			WebElement PASinfromation=driver.findElement(By.xpath("(//p[contains(text(),'Publish Approver Settings')])//following::p[1]"));
			if(Publishheading.isDisplayed()&&PASinfromation.isDisplayed()) {
				System.out.println("Publish Approver Setting tab name	and Information	 is displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Publish Approver Setting tab name and Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
//search field
			WebElement searchField=driver.findElement(By.xpath("(//input[@placeholder='Search by Brand Name'])[1]"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchField.isDisplayed()&&symbol.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			
//Configure Approvers
			WebElement ConfigureApprovers=driver.findElement(By.xpath("(//span[contains(text(),'Configure Approvers')])"));
			if(ConfigureApprovers.isDisplayed()) {
				System.out.println("Configure Approvers is displayed");
				componentsInformation.add(5, "Present");
			}
			
			else {
				System.out.println("Configure Approvers is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", ConfigureApprovers);
			Thread.sleep(3000);

//Configure Approver Field UI Components			
			
//Select brand & approver(s)			
			
			WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Select brand & approver(s)')]"));
			if(heading.isDisplayed()) {
				System.out.println("Select brand & approver(s) is displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Select brand & approver(s) is not  displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", heading);
			Thread.sleep(3000);
			
//Select Brand Heading and Information
			WebElement BrandHeading=driver.findElement(By.xpath("//p[contains(text(),'Select Brand')]"));
			WebElement BrandInformation=driver.findElement(By.xpath("//p[contains(text(),'Select Brand')]//following::p[1]"));
			if(heading.isDisplayed() &&  BrandInformation.isDisplayed()){
				System.out.println("Select Brand Heading and Information is displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Select Brand Heading and Information is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			
//Select Brand Field
			WebElement SelectBrandField=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[2]"));
			if(SelectBrandField.isDisplayed()) {
				System.out.println("Select Brand Field is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Select Brand Field is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			//js.executeScript("arguments[0].click()", SelectBrandField);
			//Thread.sleep(3000);
			


//Select users for Approval Heading and Information
			WebElement UserHeading=driver.findElement(By.xpath("(//p[contains(text(),'Select users for approval')])"));
			WebElement userInformation=driver.findElement(By.xpath("(//p[contains(text(),'Select users for approval')])//following::p[1]"));
			if(UserHeading.isDisplayed() &&  userInformation.isDisplayed()){
				System.out.println("Select user Heading and Information is displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Select user Heading and Information is not displayed");
				componentsInformation.add(9, "Not Present");
			}			
//Search User Field
			WebElement SearchuserField=driver.findElement(By.xpath("(//p[contains(text(),'Select users for approval')])//following::div[1]"));
			if(SearchuserField.isDisplayed()) {
				System.out.println("Search User Field is displayed");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Search User Field is not displayed");
				componentsInformation.add(10, "Not Present");
			}
			//js.executeScript("arguments[0].click()", SearchuserField);
			//Thread.sleep(3000);

//Save Button
			WebElement Save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			if(Save.isDisplayed()) {
				System.out.println("Save Button is Present");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Save Button is not Present");
				componentsInformation.add(11, "Not Present");
			}

//Cancel Button
			WebElement Cancel=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])"));
			if(Cancel.isDisplayed()) {
				System.out.println("Cancel Button is Present");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Cancel Button is not Present");
				componentsInformation.add(12, "Not Present");
			}			

//cross button
			WebElement crossButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			if(crossButton.isDisplayed()) {
				System.out.println("cross Button is  displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("cross Button is not displayed");
				componentsInformation.add(13, "Not Present");
			}
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(14, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "PublishApproverUIComponent");
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	

}
