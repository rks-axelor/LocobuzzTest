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

public class LocobuzzMakerCheckerWorkflow {

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

	public static void makerCheckerProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//response teams
			WebElement responseTeams = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Response Teams ')]"));
			js.executeScript("arguments[0].click()", responseTeams);
			Thread.sleep(3000);

//maker checker
			WebElement makerCheckerLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Maker_Checker.svg']"));
			WebElement makerCheckerLabel = driver.findElement(By.xpath("//span[contains(text(),'Maker Checker')]"));
			if (makerCheckerLogo.isDisplayed() && makerCheckerLabel.isDisplayed()) {
				System.out.println("Maker Checker label and logo are displayed");
			} else {
				System.out.println("Maker Checker label and logo are not displayed");
			}
			js.executeScript("arguments[0].click()", makerCheckerLabel);
			Thread.sleep(3000);

//maker checker tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tabName = driver.findElement(By.xpath("(//span[contains(text(),'Maker Checker')])[2]"));
			js.executeScript("arguments[0].click()", tabName);
			Thread.sleep(3000);

//select brand
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			search.sendKeys("ajio");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),'AJIO')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//feature active button
			WebElement featureHeading = driver.findElement(By.xpath("//p[contains(@class,'text__md mb-4 mr-12')]"));
			WebElement featureActiveButton = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
			js.executeScript("arguments[0].click()", featureActiveButton);
			Thread.sleep(3000);

//maker checker(heading,information)
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Maker Checker ')]"));
			WebElement inform = driver.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (heading.isDisplayed() && inform.isDisplayed()) {
				System.out.println("Maker Checker heading and information are displayed");
			} else {
				System.out.println("Maker Checker heading and information are not displayed");
			}

//language filter toggle button
			WebElement toggleButton = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[2]"));
			js.executeScript("arguments[0].click()", toggleButton);
			Thread.sleep(3000);

//language filter(heading,information)&total keyword configure
			WebElement languageHeading = driver.findElement(By.xpath("//span[@class='font-weight-600 mb-4 mr-10']"));
			WebElement languageInfo = driver.findElement(By.xpath("//p[@class='text__sub--sm line-height-1.25 mb-0']"));
			WebElement totalKeywordConfigure = driver
					.findElement(By.xpath("//span[contains(@class,'text__label--sm mb-4 ml-15')]"));
			if (languageHeading.isDisplayed() && languageInfo.isDisplayed() && totalKeywordConfigure.isDisplayed()) {
				System.out.println("Language Filter heading,information and total keyword configure are displayed");
			} else {
				System.out.println("Language Filter heading,information and total keyword configure are not displayed");
			}

//create new rules button
			WebElement createNewRulesButton = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Rules ')]"));
			js.executeScript("arguments[0].click()", createNewRulesButton);
			Thread.sleep(3000);

//configure rules for mc heading,arrowback
			WebElement configureHeading = driver.findElement(By.xpath("//h3[contains(@class,'modal__title')]"));
			WebElement arrowBack = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if (configureHeading.isDisplayed() && arrowBack.isDisplayed()) {
				System.out.println("Configure rule heading and arowback button are displayed");
			} else {
				System.out.println("Configure rule heading and arowback button are not displayed");
			}

//rule names(heading,information)
			WebElement ruleNameHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[1]"));
			WebElement ruleInfo = driver.findElement(By.xpath("(//p[@class='text__light mb-5 text__sm'])[1]"));
			if (ruleNameHeading.isDisplayed() && ruleInfo.isDisplayed()) {
				System.out.println("Rule Names heading,information and tab are displayed");
			} else {
				System.out.println("Rule Names heading,information and tab are not displayed");
			}

			WebElement ruleName = driver.findElement(By.xpath("//input[@data-placeholder='Rule Name']"));
			ruleName.sendKeys("Rule5");

//attributes to create rules
			WebElement attributeHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[2]"));
			WebElement attributeInfo = driver.findElement(By.xpath("(//p[@class='text__light mb-5 text__sm'])[2]"));
			if (attributeHeading.isDisplayed() && attributeInfo.isDisplayed()) {
				System.out.println("Attributes to create rules heading and information are displayed");
			} else {
				System.out.println("Attributes to create rules heading and information are not displayed");
			}

//toggles		
			WebElement outsideToggle = driver
					.findElement(By.xpath("//span[@class='mat-button-toggle-label-content' and text()=' AND']"));
			js.executeScript("arguments[0].click()", outsideToggle);
			Thread.sleep(3000);

			WebElement insideToggle = driver
					.findElement(By.xpath("//span[@class='mat-button-toggle-label-content' and text()='OR']"));
			js.executeScript("arguments[0].click()", insideToggle);
			Thread.sleep(3000);

//attributes
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement selectAttribute = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Channels ']"));
			js.executeScript("arguments[0].click()", selectAttribute);
			Thread.sleep(3000);
			WebElement arrow2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
			js.executeScript("arguments[0].click()", arrow2);
			Thread.sleep(3000);
			WebElement selectOperator = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' in ']"));
			js.executeScript("arguments[0].click()", selectOperator);
			Thread.sleep(3000);
			WebElement arrow3 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[6]"));
			js.executeScript("arguments[0].click()", arrow3);
			Thread.sleep(3000);
			WebElement selectChannel = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='Twitter']"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			WebElement selectChannel1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='Facebook']"));
			js.executeScript("arguments[0].click()", selectChannel1);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			WebElement arrow4 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[7]"));
			js.executeScript("arguments[0].click()", arrow4);
			Thread.sleep(3000);
			WebElement selectSubChannel = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='Public Tweets']"));
			js.executeScript("arguments[0].click()", selectSubChannel);
			Thread.sleep(3000);
			WebElement selectSubChannel1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='Direct Messages']"));
			js.executeScript("arguments[0].click()", selectSubChannel1);
			Thread.sleep(3000);
			WebElement selectSubChannel2 = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='FB Messages']"));
			js.executeScript("arguments[0].click()", selectSubChannel2);
			Thread.sleep(3000);
			Actions action1 = new Actions(driver);
			Action action2 = action1.sendKeys(Keys.ESCAPE).build();
			action.perform();

//add attributes
			WebElement addAttribute = driver.findElement(By.xpath("//a[contains(text(),'+ Add Attribute')]"));
			js.executeScript("arguments[0].click()", addAttribute);
			Thread.sleep(3000);
			WebElement arrow5 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[8]"));
			js.executeScript("arguments[0].click()", arrow5);
			Thread.sleep(3000);
			WebElement selectAttribute1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Skills ']"));
			js.executeScript("arguments[0].click()", selectAttribute1);
			Thread.sleep(3000);
			WebElement arrow6 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[9]"));
			js.executeScript("arguments[0].click()", arrow6);
			Thread.sleep(3000);
			WebElement selectOperator1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' in ']"));
			js.executeScript("arguments[0].click()", selectOperator1);
			Thread.sleep(3000);
			WebElement arrow7 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[10]"));
			js.executeScript("arguments[0].click()", arrow7);
			Thread.sleep(3000);
			WebElement selectSkill = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='Akhil 441']"));
			js.executeScript("arguments[0].click()", selectSkill);
			Thread.sleep(3000);
			WebElement selectSkill1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='manage skill']"));
			js.executeScript("arguments[0].click()", selectSkill1);
			Thread.sleep(3000);
			Actions action3 = new Actions(driver);
			Action action4 = action3.sendKeys(Keys.ESCAPE).build();
			action.perform();

//add attribute
			WebElement addAttribute1 = driver.findElement(By.xpath("//a[contains(text(),'+ Add Attribute')]"));
			js.executeScript("arguments[0].click()", addAttribute1);
			Thread.sleep(3000);
			WebElement arrows = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[11]"));
			js.executeScript("arguments[0].click()", arrows);
			Thread.sleep(3000);
			WebElement selectAttribute2 = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Category ']"));
			js.executeScript("arguments[0].click()", selectAttribute2);
			Thread.sleep(3000);
			WebElement arrows1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[12]"));
			js.executeScript("arguments[0].click()", arrows1);
			Thread.sleep(3000);
			WebElement selectOperator2 = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Equal ']"));
			js.executeScript("arguments[0].click()", selectOperator2);
			Thread.sleep(3000);
			WebElement arrows2 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[13]"));
			js.executeScript("arguments[0].click()", arrows2);
			Thread.sleep(3000);
			WebElement selectCategory = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='14th March']"));
			js.executeScript("arguments[0].click()", selectCategory);
			Thread.sleep(3000);
			WebElement selectCategory1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='AAAA']"));
			js.executeScript("arguments[0].click()", selectCategory1);
			Thread.sleep(3000);
			Actions action5 = new Actions(driver);
			Action action6 = action5.sendKeys(Keys.ESCAPE).build();
			action.perform();
			WebElement arrows3 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[14]"));
			js.executeScript("arguments[0].click()", arrows3);
			Thread.sleep(3000);
			WebElement selectSubCategory = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='14th Sub Category']"));
			js.executeScript("arguments[0].click()", selectSubCategory);
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			Action action7 = actions1.sendKeys(Keys.ESCAPE).build();
			action.perform();
			WebElement arrows4 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[15]"));
			js.executeScript("arguments[0].click()", arrows4);
			Thread.sleep(3000);
			WebElement subCategory = driver
					.findElement(By.xpath("//span[@class='mat-option-text']//div[text()='hahkd']"));
			js.executeScript("arguments[0].click()", subCategory);
			Thread.sleep(3000);
			Actions actions2 = new Actions(driver);
			Action action8 = actions2.sendKeys(Keys.ESCAPE).build();
			action.perform();

//query preview(heading,information,tab,copy&length query)
			WebElement queryHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[3]"));
			WebElement queryInfo = driver.findElement(By.xpath("(//p[@class='text__dark--sm'])"));
			WebElement queryTab = driver.findElement(By.xpath("//span[contains(@class,'textarea-featured__input ')]"));
			WebElement copyQuery = driver.findElement(By.xpath("//span[contains(text(),'Copy Query')]"));
			WebElement queryLength = driver.findElement(By.xpath("//span[contains(text(),'Query length')]"));
			if (queryHeading.isDisplayed() && queryInfo.isDisplayed() && queryTab.isDisplayed()
					&& copyQuery.isDisplayed() && queryLength.isDisplayed()) {
				System.out.println("Query preview heading,information,tab,copy query and query length are displayed");
			} else {
				System.out
						.println("Query preview heading,information,tab,copy query and query length are not displayed");
			}
			js.executeScript("arguments[0].click()", copyQuery);
			Thread.sleep(3000);

//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save Rule')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);

//search field
			WebElement searchName = driver.findElement(By.xpath("//input[@placeholder='Search by Rule Name']"));
			searchName.sendKeys("Rule5");
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

//columns headings
			WebElement checkbox = driver.findElement(By.xpath("(//mat-checkbox[@class='mat-checkbox mat-accent'])[1]"));
			WebElement heading1 = driver.findElement(By.xpath("(//th[@role='columnheader'])//div[text()='Rule Name']"));
			WebElement heading2 = driver
					.findElement(By.xpath("(//th[@role='columnheader'])//div[text()='Keywords / Query']"));
			WebElement heading3 = driver.findElement(By.xpath("(//th[@role='columnheader' and text()='Created On'])"));
			WebElement heading4 = driver.findElement(By.xpath("(//th[@role='columnheader'])//div[text()='Actions']"));
			if (checkbox.isDisplayed() && heading1.isDisplayed() && heading2.isDisplayed() && heading3.isDisplayed()
					&& heading4.isDisplayed()) {
				System.out.println("All headings are displayed");
			} else {
				System.out.println("All headings are not displayed");
			}
			
//actions types
			WebElement copy=driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])[1]"));
			WebElement edit=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			WebElement delete=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[1]"));
			if(copy.isDisplayed()&&edit.isDisplayed()&&delete.isDisplayed()) {
				System.out.println("Actions types are displayed");
			}
			else {
				System.out.println("Actions types are not displayed");
			}
			
			editProcess(driver);
			
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);
			
			copyProcess(driver);
			
			WebElement searchName1 = driver.findElement(By.xpath("//input[@placeholder='Search by Rule Name']"));
			searchName1.clear();
			
			WebElement searchButton2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton2);
			Thread.sleep(3000);
			
			importRulesProcess(driver);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
	
	public static void editProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//edit button
			WebElement editButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
//add group
			WebElement addGroup=driver.findElement(By.xpath("//span[contains(text(),' + Add Group ')]"));
			js.executeScript("arguments[0].click()", addGroup);
			Thread.sleep(3000);
//add attribute
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[13]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement selectAttribute=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Ratings ']"));
			js.executeScript("arguments[0].click()", selectAttribute);
			Thread.sleep(3000);
			WebElement arrow1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[14]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement selectOperator=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Greater ']"));
			js.executeScript("arguments[0].click()", selectOperator);
			Thread.sleep(3000);
			WebElement rating=driver.findElement(By.xpath("//input[@type='number']"));
			rating.sendKeys("4");
			
//edit rule button
			WebElement editRuleButton=driver.findElement(By.xpath("//span[contains(text(),'Edit Rule')]"));
			js.executeScript("arguments[0].click()", editRuleButton);
			Thread.sleep(3000);
			WebElement confirm=driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", confirm);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void copyProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//copy button
			WebElement copyButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])[1]"));
			js.executeScript("arguments[0].click()", copyButton);
			Thread.sleep(3000);
			
//select brand
			WebElement brand=driver.findElement(By.xpath("//input[@placeholder='Search brands']"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			brand.sendKeys("renault");
			WebElement selectBrand=driver.findElement(By.xpath("//span[contains(text(),'Renault')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
			WebElement copyRuleButton=driver.findElement(By.xpath("//span[contains(text(),'Copy Rule')]"));
			js.executeScript("arguments[0].click()", copyRuleButton);
			Thread.sleep(3000);
			
//select brand
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			search.sendKeys("renault");
			WebElement selectBrand1 = driver.findElement(By.xpath("//span[contains(text(),'Renault')]"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public static void importRulesProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//select brand
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			search.sendKeys("medlife bot");
			WebElement selectBrand1 = driver.findElement(By.xpath("//span[contains(text(),'Medlife Bot')]"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(3000);
			
//import 
			WebElement importButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'cloud_download')]"));
			js.executeScript("arguments[0].click()", importButton);
			Thread.sleep(3000);
			WebElement brand=driver.findElement(By.xpath("//input[@placeholder='Search brands']"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			brand.sendKeys("medlife test");
			WebElement selectBrand=driver.findElement(By.xpath("//span[contains(text(),'Medlife test')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
			WebElement importRuleButton=driver.findElement(By.xpath("//span[contains(text(),'Import rules')]"));
			js.executeScript("arguments[0].click()", importRuleButton);
			Thread.sleep(5000);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
