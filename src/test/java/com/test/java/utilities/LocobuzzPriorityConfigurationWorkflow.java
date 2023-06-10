package com.test.java.utilities;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzPriorityConfigurationWorkflow {

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

	@SuppressWarnings("unused")
	public static void priorityConfigurationProcess(WebDriver driver, String priority) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);

//priority configuration
			WebElement priorityConfigurationLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Priority_Configuration.svg']"));
			WebElement prioriyConfiguration = driver
					.findElement(By.xpath("//span[contains(text(),'Priority Configuration')]"));
			js.executeScript("arguments[0].click()", prioriyConfiguration);
			Thread.sleep(3000);

//priority configuration information
			WebElement priorityConfigurationHeading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement information = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (priorityConfigurationHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Priority Configuration information is displayed");
			} else {
				System.out.println("Priority Configuration information is not displayed");
			}

//select the brand
			WebElement selectBrand = driver.findElement(By.xpath("//div[contains(@class,'mat-select-value')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);
			WebElement searchBrand = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand.sendKeys("titan");
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(2000);

//configure new priority button
			WebElement configureNewPriority = driver
					.findElement(By.xpath("//span[contains(text(),'Configure New Priority ')]"));
			js.executeScript("arguments[0].click()", configureNewPriority);
			Thread.sleep(6000);

//adding the priority rule name
			WebElement priorityRuleName = driver.findElement(By.xpath("//input[@formcontrolname='priorityName']"));
			priorityRuleName.sendKeys("Test5");

//select priority
			WebElement selectPriority = driver
					.findElement(By.xpath("//span[@class='mat-radio-label-content' and text()='" + priority + "']"));
			js.executeScript("arguments[0].click()", selectPriority);
			Thread.sleep(3000);

//outside toggles
			WebElement outsideToggleButton = driver
					.findElement(By.xpath("//span[@class='mat-button-toggle-label-content' and text()=' AND']"));
			js.executeScript("arguments[0].click()", outsideToggleButton);
			Thread.sleep(3000);

//inside toggles
			WebElement insideToggleButton = driver
					.findElement(By.xpath("//span[@class='mat-button-toggle-label-content' and text()='AND']"));
			js.executeScript("arguments[0].click()", insideToggleButton);
			Thread.sleep(3000);

//select the first attribute
			WebElement attributeField = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[2]"));
			js.executeScript("arguments[0].click()", attributeField);
			Thread.sleep(3000);
			WebElement selectAttribute = driver.findElement(By.xpath("//span[contains(text(),' Channels ')]"));
			js.executeScript("arguments[0].click()", selectAttribute);
			Thread.sleep(3000);
			WebElement operator = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", operator);
			Thread.sleep(3000);
			WebElement selectOperator = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]"));
			js.executeScript("arguments[0].click()", selectOperator);
			Thread.sleep(3000);
			WebElement channel = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", channel);
			Thread.sleep(3000);
			WebElement selectChannel = driver.findElement(By.xpath("(//span[contains(text(),'Twitter')])[1]"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);

			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
			WebElement subChannel=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
			js.executeScript("arguments[0].click()", subChannel);
			Thread.sleep(3000);
			
			WebElement selectSubChannel=driver.findElement(By.xpath("//span[contains(text(),' All ')]"));
			js.executeScript("arguments[0].click()", selectSubChannel);
			Thread.sleep(3000);
			
			
			Action action1 = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//select other attribute
			WebElement addAttribute=driver.findElement(By.xpath("//a[contains(text(),'+ Add Attribute')]"));
			js.executeScript("arguments[0].click()", addAttribute);
			Thread.sleep(3000);
			
			WebElement attributeField1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[6]"));
			js.executeScript("arguments[0].click()", attributeField1);
			Thread.sleep(3000);
			
			WebElement selectAttribute1=driver.findElement(By.xpath("//span[contains(text(),' Ratings ')]"));
			js.executeScript("arguments[0].click()", selectAttribute1);
			Thread.sleep(3000);
			
			WebElement operator1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[7]"));
			js.executeScript("arguments[0].click()", operator1);
			Thread.sleep(3000);
			
			WebElement selectOperator1=driver.findElement(By.xpath("(//span[@class='mat-option-text'])[1]"));
			js.executeScript("arguments[0].click()", selectOperator1);
			Thread.sleep(3000);
			
			WebElement value=driver.findElement(By.xpath("//input[@type='number']"));
			value.sendKeys("10");
			Thread.sleep(3000);
			
			WebElement preview=driver.findElement(By.xpath("//span[contains(@class,'textarea-featured__input')]"));
			if(preview.isDisplayed()) {
				System.out.println("Preview is displayed");
			}
			else {
				System.out.println("Preview is not displayed");
			}
			
//submit button
			WebElement sumbitButton=driver.findElement(By.xpath("//span[contains(text(),'Save Rule')]"));
			js.executeScript("arguments[0].click()", sumbitButton);
			Thread.sleep(3000);
			
//searching with priority name
			WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search.sendKeys("Test5");
			WebElement searchIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchIcon);
			Thread.sleep(3000);
			
//edit button
			WebElement editButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
			if(editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			
//delete button
			WebElement deleteButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline ')])"));
			if(deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
//copied button
			WebElement copyButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])"));
			if(copyButton.isDisplayed()) {
				System.out.println("Copy Button is displayed");
			}
			else {
				System.out.println("Copy Button is not displayed");
			}
			
			editProcess(driver,priority);
			copyProcess(driver,priority);
			
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void editProcess(WebDriver driver, String priority) throws Exception {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//edit button
			WebElement editButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
//add group
			WebElement addGroupButton=driver.findElement(By.xpath("//span[contains(text(),' + Add Group ')]"));
			js.executeScript("arguments[0].click()", addGroupButton);
			Thread.sleep(3000);
			
			Actions at = new Actions(driver);
			at.sendKeys(Keys.PAGE_DOWN).build().perform();
			
//inside toggles
			WebElement insideToggleButton = driver
					.findElement(By.xpath("(//span[@class='mat-button-toggle-label-content' and text()='OR'])"));
			js.executeScript("arguments[0].click()", insideToggleButton);
			Thread.sleep(3000);
			
//select attribute
			WebElement attribute=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[8]"));
			js.executeScript("arguments[0].click()", attribute);
			Thread.sleep(3000);
			
			WebElement selectAttribute=driver.findElement(By.xpath("//span[contains(text(),' Followers ')]"));
			js.executeScript("arguments[0].click()", selectAttribute);
			Thread.sleep(3000);
			
			WebElement operator=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[9]"));
			js.executeScript("arguments[0].click()", operator);
			Thread.sleep(3000);
			
			WebElement selectOperator=driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]"));
			js.executeScript("arguments[0].click()", selectOperator);
			Thread.sleep(3000);
			
			WebElement value=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			value.sendKeys("5");
			Thread.sleep(3000);
			
//preview
			WebElement preview=driver.findElement(By.xpath("//span[contains(@class,'textarea-featured__input')]"));
			if(preview.isDisplayed()) {
				System.out.println("Preview is displayed");
			}
			else {
				System.out.println("Preview is not displayed");
			}
			
//update button
			WebElement updateButton=driver.findElement(By.xpath("//span[contains(text(),'Update')]"));
			js.executeScript("arguments[0].click()", updateButton);
			Thread.sleep(3000);
			
			WebElement searchIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchIcon);
			Thread.sleep(3000);
			

			

		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void copyProcess(WebDriver driver, String priority) throws Exception {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//copied button
			WebElement copyButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])"));
			js.executeScript("arguments[0].click()", copyButton);
			Thread.sleep(3000);
			
//select brand
			WebElement searchBrand=driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
			searchBrand.sendKeys("auto demo");
			//js.executeScript("arguments[0].click()", searchBrand);
			Thread.sleep(3000);
			
			WebElement selectBrand=driver.findElement(By.xpath("//span[@class='ml-11 font-weight-500' and text()='Auto Demo']"));
			selectBrand.click();
			//js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
			WebElement copyRuleButton=driver.findElement(By.xpath("//span[contains(text(),' Copy Rules')]"));
			copyRuleButton.click();
			//js.executeScript("arguments[0].click()", copyRuleButton);
			Thread.sleep(3000);
			
//search
			WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search.clear();
			
//select the brand
			WebElement selectBrand1 = driver.findElement(By.xpath("//div[contains(@class,'mat-select-value')]"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(2000);
			WebElement searchBrand1 = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand1.sendKeys("auto demo");
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(2000);
			
//searching with priority name
			WebElement search1=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search1.sendKeys("Test5");
			WebElement searchIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchIcon);
			Thread.sleep(3000);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
