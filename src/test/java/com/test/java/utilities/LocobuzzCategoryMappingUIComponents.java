package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzCategoryMappingUIComponents {

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

	public static void verifyingCategoryMappingComponents(WebDriver driver) throws Exception {
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

//category mapping
			WebElement categoryMappingLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Category_Mapping.svg']"));
			WebElement categoryMappingLabel = driver
					.findElement(By.xpath("//span[contains(text(),'Category Mapping')]"));
			if (categoryMappingLogo.isDisplayed() && categoryMappingLabel.isDisplayed()) {
				System.out.println("Category Mapping Logo and Label are displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Category Mapping Logo and Label are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", categoryMappingLabel);
			Thread.sleep(3000);

//category mapping tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement categoryMappingTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Category Mapping')])[2]"));
			if (pushpin.isDisplayed() && categoryMappingTab.isDisplayed()) {
				System.out.println("Category Mapping tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Category Mapping tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//category mapping (heading,information)
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Category Mapping ')]"));
			WebElement info = driver.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Category mapping heading,information are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Category mapping heading,information are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//category group
			WebElement groupName = driver
					.findElement(By.xpath("(//div[@class='categorymap__head border-bottom__light-grey'])[1]"));
			WebElement groupList = driver.findElement(By.xpath("(//div[@class='categorymap__menu--body bg__white'])"));
			if (groupName.isDisplayed() && groupList.isDisplayed()) {
				System.out.println("Category group name,list are displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Category group name,list are not displayed");
				componentsInformation.add(4, "Not Present");
			}

//brand&revelant categories heaidng,brand,copy,activity log fields
			WebElement revelantCategoryHeading = driver
					.findElement(By.xpath("(//div[@class='categorymap__head border-bottom__light-grey'])[2]"));
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement copyField = driver
					.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator colored__locobuzz')])[1]"));
			WebElement activityLog = driver.findElement(By.xpath(
					"(//button[contains(@class,'mat-focus-indicator pr-10 pl-5 pt-4 pb-4 mat-stroked-button')])"));
			if (revelantCategoryHeading.isDisplayed() && brandField.isDisplayed() && copyField.isDisplayed()
					&& activityLog.isDisplayed()) {
				System.out.println("Brand&Revelant category heading,brand,copy,activity log fields are displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Brand&Revelant category heading,brand,copy,activity log fields are not displayed");
				componentsInformation.add(5, "Not Present");
			}

//skip strict checking
			WebElement skipStrictHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mr-5']"));
			WebElement button = driver
					.findElement(By.xpath("(//label[@class='mat-tooltip-trigger rounded-toggle-switch-label'])[1]"));
			WebElement info1 = driver
					.findElement(By.xpath("//div[@class='text__regualr text__sm font-weight-500 line-height-1.25']"));
			if (skipStrictHeading.isDisplayed() && button.isDisplayed() && info1.isDisplayed()) {
				System.out.println("Skip Strict checking informarion,button,heading are displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Skip Strict checking informarion,button,heading are not displayed");
				componentsInformation.add(6, "Not Present");
			}

//category heading,list&search field
			WebElement categoryHeading = driver.findElement(By.xpath("(//span[contains(text(),'Categories')])[1]"));
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement categoryList = driver.findElement(By.xpath("//div[@class='categorymap__tree bg__white']"));
			if (categoryHeading.isDisplayed() && searchField.isDisplayed() && categoryList.isDisplayed()) {
				System.out.println("Category heading,list and search field are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Category heading,list and search field are not displayed");
				componentsInformation.add(7, "Not Present");
			}

//create category button
			WebElement createCategory = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Category ')]"));
			if (createCategory.isDisplayed()) {
				System.out.println("Create Category button is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Create Category button is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			js.executeScript("arguments[0].click()", createCategory);
			Thread.sleep(3000);

//category fields
			WebElement categoryField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			WebElement cancelButton = driver.findElement(By.xpath("(//span[contains(text(),' Cancel')])"));
			if (categoryField.isDisplayed() && saveButton.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Category field,save,cancel buttons are displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Category field,save,cancel buttons are not displayed");
				componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

//import,download buttons
			WebElement importButton = driver.findElement(By.xpath("(//span[contains(text(),' Import Excel ')])"));
			WebElement downloadButton = driver.findElement(By.xpath("(//span[contains(text(),' Download ')])"));
			if (importButton.isDisplayed() && downloadButton.isDisplayed()) {
				System.out.println("Import,download buttons are displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Import,download buttons are not displayed");
				componentsInformation.add(10, "Not Present");
			}

//sort button
			WebElement sortButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'sort')]"));
			if (sortButton.isDisplayed()) {
				System.out.println("Sort button is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Sort button is not displayed");
				componentsInformation.add(11, "Not Present");
			}
			js.executeScript("arguments[0].click()", sortButton);
			Thread.sleep(3000);

//sort fields
			WebElement sortField = driver.findElement(By.xpath("(//li[@class='categorymap__body--sortmenu-item'])[1]"));
			WebElement sortField1 = driver
					.findElement(By.xpath("(//li[@class='categorymap__body--sortmenu-item'])[2]"));
			if (sortField.isDisplayed() && sortField1.isDisplayed()) {
				System.out.println("Sort Fields are displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Sort Fields are not displayed");
				componentsInformation.add(12, "Not Present");
			}

			WebElement sortButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'sort')]"));
			js.executeScript("arguments[0].click()", sortButton1);
			Thread.sleep(3000);

//download sample button
			WebElement actionButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'more_vert ')]"));
			js.executeScript("arguments[0].click()", actionButton);
			Thread.sleep(3000);
			WebElement download1 = driver.findElement(By.xpath("//span[contains(text(),'Download Sample Excel ')]"));
			if (actionButton.isDisplayed() && download1.isDisplayed()) {
				System.out.println("Action button,download sample are displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Action button,download sample are not displayed");
				componentsInformation.add(13, "Not Present");
			}
			js.executeScript("arguments[0].click()", actionButton);
			Thread.sleep(3000);

//upper category
			WebElement upperCategoryButton = driver
					.findElement(By.xpath("//span[contains(text(),'Upper Categories')]"));
			if (upperCategoryButton.isDisplayed()) {
				System.out.println("Upper Category button is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Upper Category button is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			js.executeScript("arguments[0].click()", upperCategoryButton);
			Thread.sleep(3000);

//category search field,category list
			WebElement searchCategory = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement upperCategoryList = driver.findElement(By.xpath("//div[@class='categorymap__tree bg__white']"));
			if (searchCategory.isDisplayed() && upperCategoryList.isDisplayed()) {
				System.out.println("Upper category list,search field are displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Upper category list,search field are not displayed");
				componentsInformation.add(15, "Not Present");
			}

//create upper category
			WebElement createUpperCategory = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Upper Category ')]"));
			if (createUpperCategory.isDisplayed()) {
				System.out.println("Create Upper Category button is displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Create Upper Category button is not displayed");
				componentsInformation.add(16, "Not Present");
			}
			js.executeScript("arguments[0].click()", createUpperCategory);
			Thread.sleep(3000);

//upper category field,save,cancel buttons
			WebElement upperCategoryField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement saveButton1 = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			WebElement cancelButton1 = driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])"));
			if (upperCategoryField.isDisplayed() && saveButton1.isDisplayed() && cancelButton1.isDisplayed()) {
				System.out.println("Upper category field,save,cancel buttons are displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Upper category field,save,cancel buttons are not displayed");
				componentsInformation.add(17, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton1);
			Thread.sleep(3000);

//sort button
			WebElement sortButton2 = driver.findElement(By.xpath("//mat-icon[contains(text(),'sort ')]"));
			if (sortButton2.isDisplayed()) {
				System.out.println("Sort Button is displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Sort Button is not displayed");
				componentsInformation.add(18, "Not Present");
			}
			js.executeScript("arguments[0].click()", sortButton2);
			Thread.sleep(3000);

//sort fields
			WebElement sortField2 = driver
					.findElement(By.xpath("(//li[@class='categorymap__body--sortmenu-item'])[1]"));
			WebElement sortField3 = driver
					.findElement(By.xpath("(//li[@class='categorymap__body--sortmenu-item'])[2]"));
			if (sortField2.isDisplayed() && sortField3.isDisplayed()) {
				System.out.println("Sort Fields are displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("Sort Fields are not displayed");
				componentsInformation.add(19, "Not Present");
			}

			js.executeScript("arguments[0].click()", sortButton2);
			Thread.sleep(3000);

//catch all category
			WebElement catchAllHeading = driver.findElement(By.xpath("//div[contains(text(),'Catch all category')]"));
			js.executeScript("arguments[0].scrollIntoView()", catchAllHeading);
			//WebElement info2 = driver.findElement(By.xpath("//div[@class='text__light text__sm line-height-1.5 mt-5']"));
			WebElement catchAllField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (catchAllHeading.isDisplayed() && catchAllField.isDisplayed()) {
				System.out.println("Catch all category heading,information,field are displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Catch all category heading,information,field are not displayed");
				componentsInformation.add(20, "Not Present");
			}

//category email channel
			WebElement categoryEmailHeading = driver
					.findElement(By.xpath("(//p[@class='font-weight-700 mb-5 mr-5'])[1]"));
			WebElement emailLabel = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]"));
			WebElement emalLabel1 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]"));
			if (categoryEmailHeading.isDisplayed() && emailLabel.isDisplayed() && emalLabel1.isDisplayed()) {
				System.out.println("Category Email  heading,labels are displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Category Email  heading,labels are not displayed");
				componentsInformation.add(21, "Not Present");
			}

//ticket category tagging
			WebElement ticketCategoryTaggingHeading = driver
					.findElement(By.xpath("(//p[@class='font-weight-700 mb-5 mr-5'])[2]"));
			WebElement toggleButton = driver
					.findElement(By.xpath("(//label[@class='mat-tooltip-trigger rounded-toggle-switch-label'])[2]"));
			WebElement info3 = driver.findElement(By.xpath("//p[@class='text__light text__sm line-height-1.5 mb-0']"));
			if (ticketCategoryTaggingHeading.isDisplayed() && toggleButton.isDisplayed() && info3.isDisplayed()) {
				System.out.println("Ticket Category Tagging heading,toggle button,inforation are displayed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("Ticket Category Tagging heading,toggle button,inforation are not displayed");
				componentsInformation.add(22, "Not Present");
			}

//sentiment configuration
			WebElement sentimentHeading = driver.findElement(By.xpath("//p[@class='font-weight-700 mb-0']"));
			WebElement sentimentInfo = driver
					.findElement(By.xpath("//p[@class='text__light text__sm line-height-1.5 mt-5']"));
			if (sentimentHeading.isDisplayed() && sentimentInfo.isDisplayed()) {
				System.out.println("Sentiment Configuration heading,information are displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Sentiment Configuration heading,information are not displayed");
				componentsInformation.add(23, "Not Present");
			}

//keywords ,save button
			WebElement postiveKeyword = driver.findElement(By.xpath("(//div[@class='d-flex-items-center mb-3'])[1]"));
			WebElement postiveTab = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement postiveInfo = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])[1]"));
			WebElement negativeKeyword = driver.findElement(By.xpath("(//div[@class='d-flex-items-center mb-3'])[2]"));
			WebElement negativeTab = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			WebElement negativeInfo = driver.findElement(By.xpath("(//p[@class='text__light text__sm'])[2]"));
			WebElement saveButton2 = driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			if (postiveKeyword.isDisplayed() && postiveTab.isDisplayed() && postiveInfo.isDisplayed()
					&& negativeKeyword.isDisplayed() && negativeTab.isDisplayed() && negativeInfo.isDisplayed()
					&& saveButton2.isDisplayed()) {
				System.out.println("Keyword tab,info and save button are displayed");
				componentsInformation.add(24, "Present");
			} else {
				System.out.println("Keyword tab,info and save button are not displayed");
				componentsInformation.add(24, "Not Present");
			}
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			
			componentsInformation.add(25, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "CategoryMappingUIComponents");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
