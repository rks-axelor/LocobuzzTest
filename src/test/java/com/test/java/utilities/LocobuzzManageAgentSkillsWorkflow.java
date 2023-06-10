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

public class LocobuzzManageAgentSkillsWorkflow {
	
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
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void manageAgentSkillsProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//response teams
			WebElement responseTeams = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Response Teams ')]"));
			js.executeScript("arguments[0].click()", responseTeams);
			Thread.sleep(3000);
			
//manage agent skills
			WebElement manageSkillsLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Manage_Agent_Skills.svg']"));
			WebElement manageSkills = driver.findElement(By.xpath("//span[contains(text(),'Manage Agent Skills')]"));
			if (manageSkillsLogo.isDisplayed() && manageSkills.isDisplayed()) {
				System.out.println("Manage Agent Skills logo and label are displayed");
			} else {
				System.out.println("Manage Agent Skills logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", manageSkills);
			Thread.sleep(3000);
			
//manage agent skills(heading&information)
			WebElement heading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-6 text__title--font colored__blue--dark account-option__title']"));
			WebElement inform = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-3 text__light--sm')]"));
			if (heading.isDisplayed() && inform.isDisplayed()) {
				System.out.println("Manage Agent Skills heading and information are displayed");
			} else {
				System.out.println("Manage Agent Skills heading and information are not displayed");
			}
			
//select brand
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			searchBrand.sendKeys("ajio");
			WebElement selectBrand=driver.findElement(By.xpath("//span[contains(text(),'AJIO')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
//feature active button
			WebElement activeHeading = driver.findElement(By.xpath("//p[contains(@class,'text__md mb-4 mr-12')]"));
			WebElement activeButton = driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);
			
//create new skill button
			WebElement createSkillButton = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Skill ')]"));
			js.executeScript("arguments[0].click()", createSkillButton);
			Thread.sleep(3000);
			
//manual tab
			WebElement manualName = driver.findElement(By.xpath("(//p[contains(text(),' Enter Manually ')])[2]"));
			js.executeScript("arguments[0].click()", manualName);
			Thread.sleep(3000);
			
//configure skills heading 
			WebElement configureSkillsHeading = driver
					.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			if (configureSkillsHeading.isDisplayed()) {
				System.out.println("Configure Skill heading is displayed");
			} else {
				System.out.println("Configure Skill heading is not displayed");
			}
			
//skill name
			WebElement skillName=driver.findElement(By.xpath("//input[@formcontrolname='skillName']"));
			skillName.sendKeys("kalyan test");
			
//skill keywords(heading,information)
			WebElement keywordHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[1]"));
			WebElement keywordInfo = driver.findElement(By.xpath("(//p[@class='text__light'])"));
			if (keywordHeading.isDisplayed() && keywordInfo.isDisplayed()) {
				System.out.println("Skill Keyword heading and information are displayed");
			} else {
				System.out.println("Skill Keyword heading and information are not displayed");
			}
			
//select radio button
			WebElement radioButton=driver.findElement(By.xpath("//span[@class='mat-radio-label-content' and text()='OR']"));
			js.executeScript("arguments[0].click()", radioButton);
			Thread.sleep(3000);
			
//keywords
			WebElement keyword=driver.findElement(By.xpath("//input[@placeholder='Enter keywords']"));
			js.executeScript("arguments[0].click()", keyword);
			Thread.sleep(3000);
			keyword.sendKeys("Games");
			keyword.sendKeys(Keys.ENTER);
			js.executeScript("arguments[0].click()", keyword);
			Thread.sleep(3000);
			keyword.sendKeys("Work");
			keyword.sendKeys(Keys.ENTER);
			
			WebElement keyword1=driver.findElement(By.xpath("//input[@id='clearORField']"));
			js.executeScript("arguments[0].click()", keyword1);
			Thread.sleep(3000);
			keyword1.sendKeys("reading books");
			keyword1.sendKeys(Keys.ENTER);
			js.executeScript("arguments[0].click()", keyword1);
			Thread.sleep(3000);
			keyword1.sendKeys("listening music");
			keyword1.sendKeys(Keys.ENTER);
			
			WebElement keyword2=driver.findElement(By.xpath("//input[@id='clearDonotField']"));
			js.executeScript("arguments[0].click()", keyword2);
			Thread.sleep(3000);
			keyword2.sendKeys("wasting time");
			keyword2.sendKeys(Keys.ENTER);
			js.executeScript("arguments[0].click()", keyword2);
			Thread.sleep(3000);
			keyword2.sendKeys("keys");
			keyword2.sendKeys(Keys.ENTER);
			
//language
			WebElement language=driver.findElement(By.xpath("//input[@placeholder='Search Language']"));
			js.executeScript("arguments[0].click()", language);
			Thread.sleep(3000);
			WebElement selectLanguage=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' English ']"));
			js.executeScript("arguments[0].click()", selectLanguage);
			Thread.sleep(3000);
					
			
//keyword preview
			WebElement preview=driver.findElement(By.xpath("//div[@class='mt-10 mb-0 config-skill__preview--textarea border__light-grey textarea-featured__input']"));
			WebElement queryLength=driver.findElement(By.xpath("//span[contains(text(),'Query length')]"));
			if(preview.isDisplayed()&&queryLength.isDisplayed()) {
				System.out.println("Keyword Preview and Query length are displayed");
			}
			else {
				System.out.println("Keyword Preview and Query length are not displayed");
			}
			
//copy query button
			WebElement copyQueryButton=driver.findElement(By.xpath("//span[contains(text(),'Copy Keywords')]"));
			js.executeScript("arguments[0].click()", copyQueryButton);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),'Save Skills')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//search skill name
			WebElement searchSkillName=driver.findElement(By.xpath("//input[@placeholder='Search by Skill Name']"));
			searchSkillName.sendKeys("kalyan test");
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
//tab name
			WebElement skillName1=driver.findElement(By.xpath("//th[contains(@class,'mat-header-cell cdk-header-cell cdk-column-skillName')]"));
			WebElement type=driver.findElement(By.xpath("//th[contains(@class,'mat-header-cell cdk-header-cell cdk-column-type')]"));
			WebElement query=driver.findElement(By.xpath("//th[contains(@class,'mat-header-cell cdk-header-cell cdk-column-keywords-Query')]"));
			WebElement createdOn=driver.findElement(By.xpath("//div[contains(text(),'Created On')]"));
			WebElement actions=driver.findElement(By.xpath("//div[contains(text(),'Actions')]"));
			if(skillName1.isDisplayed()&&type.isDisplayed()&&query.isDisplayed()&&createdOn.isDisplayed()&&actions.isDisplayed()) {
				System.out.println("All Tab Names are displayed");
			}
			else {
				System.out.println("All Tab Names are not displayed");
			}
			
//edit and delete buttons
			WebElement editButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			WebElement deleteButton=driver.findElement(By.xpath("//mat-icon[contains(text(),' delete_outline ')]"));
			if(editButton.isDisplayed()&&deleteButton.isDisplayed()) {
				System.out.println("edit and delete button are displayed");
			}
			else {
				System.out.println("edit and delete button are not displayed");
			}
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
			WebElement deleteKeyword=driver.findElement(By.xpath("(//mat-icon[contains(text(),'cancel')])[6]"));
			js.executeScript("arguments[0].click()", deleteKeyword);
			Thread.sleep(3000);
			
			WebElement updateButton=driver.findElement(By.xpath("//span[contains(text(),'Update')]"));
			js.executeScript("arguments[0].click()", updateButton);
			Thread.sleep(3000);
			
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);
			
			WebElement searchSkillName1=driver.findElement(By.xpath("//input[@placeholder='Search by Skill Name']"));
			searchSkillName1.clear();
			
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);
			
			linkExistingCategoryProcess(driver);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public static void linkExistingCategoryProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//create new skill button
			WebElement createSkillButton = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Skill ')]"));
			js.executeScript("arguments[0].click()", createSkillButton);
			Thread.sleep(3000);
			
//link existing category button
			WebElement categoryButton=driver.findElement(By.xpath("//p[contains(text(),' Link existing Categories ')]"));
			js.executeScript("arguments[0].click()", categoryButton);
			Thread.sleep(3000);
			
//category heading
			WebElement categoryHeading=driver.findElement(By.xpath("(//h3[@class='modal__title'])[2]"));
			if(categoryHeading.isDisplayed()) {
				System.out.println("Category heading is displayed ");
			}
			else {
				System.out.println("Category heading is not displayed ");
			}
			
//skill name
			WebElement skillName=driver.findElement(By.xpath("//input[@formcontrolname='skillName']"));
			skillName.sendKeys("kalyan65");
			
//select categories
			WebElement category=driver.findElement(By.xpath("//span[contains(text(),'Accounts ')]"));
			js.executeScript("arguments[0].click()", category);
			Thread.sleep(3000);
			
			WebElement category1=driver.findElement(By.xpath("//span[contains(text(),'DMat ')]"));
			js.executeScript("arguments[0].click()", category1);
			Thread.sleep(3000);
			
			WebElement category2=driver.findElement(By.xpath("//span[contains(text(),'Insurance ')]"));
			js.executeScript("arguments[0].click()", category2);
			Thread.sleep(3000);
			
//link button
			WebElement linkButton=driver.findElement(By.xpath("//span[contains(text(),' Link Skills ')]"));
			js.executeScript("arguments[0].click()", linkButton);
			Thread.sleep(3000);
			
//search skill name
			WebElement searchSkillName=driver.findElement(By.xpath("//input[@placeholder='Search by Skill Name']"));
			searchSkillName.sendKeys("kalyan65");
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
//tab name
			WebElement skillName1=driver.findElement(By.xpath("//th[contains(@class,'mat-header-cell cdk-header-cell cdk-column-skillName')]"));
			WebElement type=driver.findElement(By.xpath("//th[contains(@class,'mat-header-cell cdk-header-cell cdk-column-type')]"));
			WebElement query=driver.findElement(By.xpath("//th[contains(@class,'mat-header-cell cdk-header-cell cdk-column-keywords-Query')]"));
			WebElement createdOn=driver.findElement(By.xpath("//div[contains(text(),'Created On')]"));
			WebElement actions=driver.findElement(By.xpath("//div[contains(text(),'Actions')]"));
			if(skillName1.isDisplayed()&&type.isDisplayed()&&query.isDisplayed()&&createdOn.isDisplayed()&&actions.isDisplayed()) {
				System.out.println("All Tab Names are displayed");
			}
			else {
				System.out.println("All Tab Names are not displayed");
			}
			
//edit and delete buttons
			WebElement editButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			WebElement deleteButton=driver.findElement(By.xpath("//mat-icon[contains(text(),' delete_outline ')]"));
			if(editButton.isDisplayed()&&deleteButton.isDisplayed()) {
				System.out.println("edit and delete button are displayed");
			}
			else {
				System.out.println("edit and delete button are not displayed");
			}
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
//search field
			WebElement search=driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
			search.sendKeys("account");
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);
			
			WebElement deletecategory=driver.findElement(By.xpath("//span[contains(text(),'Debit Card ')]"));
			js.executeScript("arguments[0].click()", deletecategory);
			Thread.sleep(3000);
			
//link button
			WebElement linkButton1=driver.findElement(By.xpath("//span[contains(text(),' Link Skills ')]"));
			js.executeScript("arguments[0].click()", linkButton1);
			Thread.sleep(3000);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
