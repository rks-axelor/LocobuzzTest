package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzPriorityConfigurationUIComponents {

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

	public static void verifyingPriorityConfigurationComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			if (advResponseManagement.isDisplayed()) {
				System.out.println("Adv Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Adv Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);

//priority configuration
			WebElement priorityConfigurationLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Priority_Configuration.svg']"));
			WebElement prioriyConfiguration = driver
					.findElement(By.xpath("//span[contains(text(),'Priority Configuration')]"));
			if (priorityConfigurationLogo.isDisplayed() && prioriyConfiguration.isDisplayed()) {
				System.out.println("Priority Configuration is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Priority Configuration is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", prioriyConfiguration);
			Thread.sleep(3000);

//priority configuration tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement priorityConfigurationTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Priority Configuration')])[2]"));
			if (pushpin.isDisplayed() && priorityConfigurationTab.isDisplayed()) {
				System.out.println("Priority Configuration Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Priority Configuration Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//priority configuration information
			WebElement priorityConfigurationHeading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement information = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-6 text__light--sm')]"));
			if (priorityConfigurationHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Priority Configuration information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Priority Configuration information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//select brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])"));
			if (brandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Brand Field is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Brand Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchField.isDisplayed() && symbol.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//configure new priority button
			WebElement configureNewPriority = driver
					.findElement(By.xpath("//span[contains(text(),'Configure New Priority ')]"));
			if (configureNewPriority.isDisplayed()) {
				System.out.println("Configure New Priority Button is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Configure New Priority Button is not  displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", configureNewPriority);
			Thread.sleep(6000);

//configure new priority heading
			WebElement heading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			if (heading.isDisplayed()) {
				System.out.println("Configure New Priority Heading is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Configure New Priority Heading is not displayed");
				componentsInformation.add(7, "Not Present");
			}

//priority rule name information and field
			WebElement priorityRuleHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[1]"));
			WebElement information1 = driver.findElement(By.xpath("(//p[@class='text__light mb-5 text__sm'])[1]"));
			WebElement field = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (priorityRuleHeading.isDisplayed() && information1.isDisplayed() && field.isDisplayed()) {
				System.out.println("Priority Rule Field and information is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Priority Rule Field and information is not displayed");
				componentsInformation.add(8, "Not Present");
			}

//priority type information
			WebElement priorityTypeHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[2]"));
			WebElement information2 = driver.findElement(By.xpath("(//p[@class='text__light mb-5 text__sm'])[2]"));
			if (priorityTypeHeading.isDisplayed() && information2.isDisplayed()) {
				System.out.println("Priority Type Information is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Priority Type Information is not displayed");
				componentsInformation.add(9, "Not Present");
			}

//types
			WebElement radioButton = driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[1]"));
			WebElement radioButton1 = driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[2]"));
			WebElement radioButton2 = driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[3]"));
			WebElement radioButton3 = driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[4]"));
			WebElement urgent = driver.findElement(By.xpath("(//span[contains(text(),'Urgent')])"));
			WebElement high = driver.findElement(By.xpath("(//span[contains(text(),'High')])"));
			WebElement medium = driver.findElement(By.xpath("(//span[contains(text(),'Medium')])"));
			WebElement low = driver.findElement(By.xpath("(//span[contains(text(),'Low')])"));
			if (radioButton.isDisplayed() && radioButton1.isDisplayed() && radioButton2.isDisplayed()
					&& radioButton3.isDisplayed() && urgent.isDisplayed() && high.isDisplayed() && medium.isDisplayed()
					&& low.isDisplayed()) {
				System.out.println("All Priority types are displayed ");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("All Priority types are not displayed ");
				componentsInformation.add(10, "Not Present");
			}

//attributes of priority rule information
			WebElement heading1 = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4 mt-20'])"));
			WebElement information3 = driver.findElement(By.xpath("(//p[@class='text__light mb-4 text__sm'])"));
			if (heading1.isDisplayed() && information3.isDisplayed()) {
				System.out.println("Attributes of Priority Rule information is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Attributes of Priority Rule information is not displayed");
				componentsInformation.add(11, "Not Present");
			}

//attributes fields
			WebElement group = driver.findElement(By.xpath(
					"(//mat-button-toggle-group[@class='mat-button-toggle-group filter__toggle mat-button-toggle-group-appearance-standard'])[1]"));
			WebElement delete = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[1]"));
			WebElement subgroup = driver.findElement(By.xpath(
					"(//mat-button-toggle-group[@class='mat-button-toggle-group filter__toggle mat-button-toggle-group-appearance-standard'])[2]"));
			WebElement deleteButton = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[2]"));
			WebElement attributeField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement addAttribute = driver.findElement(By.xpath("//a[contains(text(),'+ Add Attribute')]"));
			WebElement addGroup = driver.findElement(By.xpath("//span[contains(text(),' + Add Group ')]"));
			if (group.isDisplayed() && delete.isDisplayed() && subgroup.isDisplayed() && deleteButton.isDisplayed()
					&& attributeField.isDisplayed() && addAttribute.isDisplayed() && addGroup.isDisplayed()) {
				System.out.println("All Attributes Fields are present");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("All Attributes Fields are not present");
				componentsInformation.add(12, "Not Present");
			}

//query review information
			WebElement queryHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[3]"));
			WebElement queryInformation = driver.findElement(By.xpath("(//p[@class='text__dark--sm'])"));
			if (queryHeading.isDisplayed() && queryInformation.isDisplayed()) {
				System.out.println("Query Review Information is displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Query Review Information is not  displayed");
				componentsInformation.add(13, "Not Present");
			}

//query field&copy query button
			WebElement queryField = driver.findElement(By.xpath(
					"//div[@class='textarea-featured__block mt-10 mb-0 priorityconfig__preview--textarea-input border__light-grey']"));
			WebElement copyQueryButton = driver.findElement(By.xpath("//span[contains(text(),'Copy Query')]"));
			if (queryField.isDisplayed() && copyQueryButton.isDisplayed()) {
				System.out.println("Query Field and Copy Query Button are displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Query Field and Copy Query Button are not displayed");
				componentsInformation.add(14, "Not Present");
			}

//cancel button
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}

//save rule button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save Rule')]"));
			if (saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(16, "Not Present");
			}

//arrow back
			WebElement arrowBack = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if (arrowBack.isDisplayed()) {
				System.out.println("Arrow Back is displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Arrow Back is not displayed");
				componentsInformation.add(17, "Not Present");
			}
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

			componentsInformation.add(18, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "PriorityConfigurationUIComponen");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
