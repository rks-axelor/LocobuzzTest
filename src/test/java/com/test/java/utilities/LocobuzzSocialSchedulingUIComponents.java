package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzSocialSchedulingUIComponents {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void socialSchedulingUIComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

//social Scheduling 
			WebElement socialSchedulingLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'schedule_send')]"));
			js.executeScript("arguments[0].scrollIntoView()", socialSchedulingLogo);
			WebElement socialSchedulingLabel = driver
					.findElement(By.xpath("//span[contains(text(),' Social Scheduling')]"));
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[3]"));
			if (socialSchedulingLogo.isDisplayed() && socialSchedulingLabel.isDisplayed() && pushpin.isDisplayed()) {
				System.out.println("Social Scheduling logo and label are displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Social Scheduling logo and label are not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", socialSchedulingLabel);
			Thread.sleep(3000);

//manage post tab
			WebElement pushpin1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[8]"));
			WebElement managePostTab = driver.findElement(By.xpath("(//span[contains(text(),'Manage Post')])[1]"));
			if (pushpin1.isDisplayed() && managePostTab.isDisplayed()) {
				System.out.println("Manage Post tab is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Manage Post tab is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			
//select brand
			WebElement arrow3 = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow3);
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search.sendKeys("titan");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),' Titan ')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//brand,duration,search fields
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[1]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])"));
			WebElement durationField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement dateRange = driver.findElement(By.xpath("//mat-icon[contains(text(),'date_range ')]"));
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			if (brandField.isDisplayed() && arrow.isDisplayed() && durationField.isDisplayed()
					&& dateRange.isDisplayed() && searchField.isDisplayed() && searchButton.isDisplayed()) {
				System.out.println("Brand,Duration,Search fields are displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Brand,Duration,Search fields are not displayed");
				componentsInformation.add(2, "Not Present");
			}

//filter button
			WebElement filterButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt ')]"));
			if (filterButton.isDisplayed()) {
				System.out.println("Filter button is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Filter button is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);

//filter fields
			WebElement field1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			WebElement field2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement field3 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			WebElement field4 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			if (field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed() && field4.isDisplayed()) {
				System.out.println("Filter fields are displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Filter fields are not displayed");
				componentsInformation.add(4, "Not Present");
			}

//clear all,apply,cancel buttons
			WebElement clearAllButton = driver.findElement(By.xpath("//span[contains(text(),'Clear All')]"));
			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
			if (clearAllButton.isDisplayed() && applyButton.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("ClearAll,Apply,Cancel buttons are displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("ClearAll,Apply,Cancel buttons are not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

//compose post button
			WebElement composePostButton = driver.findElement(By.xpath("//span[contains(text(),' Compose Post ')]"));
			WebElement composePostLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'drive_file_rename_outline')]"));
			if (composePostButton.isDisplayed() && composePostLogo.isDisplayed()) {
				System.out.println("Compose post button is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Compose post button is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//Tab list
			WebElement tab = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			WebElement tab1 = driver.findElement(By.xpath("//div[contains(text(),'Awaiting Approval')]"));
			WebElement tab2 = driver.findElement(By.xpath("//div[contains(text(),'Drafts ')]"));
			WebElement tab3 = driver.findElement(By.xpath("//div[contains(text(),'Rejected ')]"));
			WebElement tab4 = driver.findElement(By.xpath("//div[contains(text(),'Scheduled ')]"));
			WebElement tab5 = driver.findElement(By.xpath("(//div[contains(text(),'Published ')])[1]"));
			WebElement tab6 = driver.findElement(By.xpath("(//div[contains(text(),'Partially Published ')])"));
			WebElement tab7 = driver.findElement(By.xpath("(//div[contains(text(),'Failed ')])"));
			WebElement tab8 = driver.findElement(By.xpath("(//div[contains(text(),'Deleted ')])"));
			if (tab.isDisplayed() && tab1.isDisplayed() && tab2.isDisplayed() && tab3.isDisplayed()
					&& tab4.isDisplayed() && tab5.isDisplayed() && tab6.isDisplayed() && tab7.isDisplayed()
					&& tab8.isDisplayed()) {
				System.out.println("All tabs are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("All tabs are not displayed");
				componentsInformation.add(7, "Not Present");
			}
			
//sort button
			WebElement sortButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'sort')]"));
			if(sortButton.isDisplayed()) {
				System.out.println("Sort button is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Sort button is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			js.executeScript("arguments[0].click()", sortButton);
			Thread.sleep(3000);
			
//sort fields
			WebElement sortBy=driver.findElement(By.xpath("//p[contains(text(),'Sort By')]"));
			WebElement sortByFields=driver.findElement(By.xpath("(//mat-radio-group[@role='radiogroup'])[1]"));
			WebElement sortOrder=driver.findElement(By.xpath("//p[contains(text(),'Sort Order')]"));
			WebElement sortOrderFields=driver.findElement(By.xpath("(//mat-radio-group[@role='radiogroup'])[2]"));
			if(sortBy.isDisplayed()&&sortByFields.isDisplayed()&&sortOrder.isDisplayed()&&sortOrderFields.isDisplayed()) {
				System.out.println("Sortby heading,fields and sortorder heading,fields are displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Sortby heading,fields and sortorder heading,fields are not displayed");
				componentsInformation.add(9, "Not Present");
			}
			
			WebElement sortButton1=driver.findElement(By.xpath("//mat-icon[contains(text(),'sort')]"));
			js.executeScript("arguments[0].click()", sortButton1);
			Thread.sleep(3000);
			
		
			
			componentsInformation.add(10, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "SocialSchedulingUIComponents");
			
//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			//JavascriptExecutor js = (JavascriptExecutor) driver;
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

}
