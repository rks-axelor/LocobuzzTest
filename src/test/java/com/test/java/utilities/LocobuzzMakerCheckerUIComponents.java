package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzMakerCheckerUIComponents {

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

	public static void verifyingMakerCheckerComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//response teams
			WebElement responseTeams = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Response Teams ')]"));
			if (responseTeams.isDisplayed()) {
				System.out.println("Response Teams is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Response Teams is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", responseTeams);
			Thread.sleep(3000);

//maker checker
			WebElement makerCheckerLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Maker_Checker.svg']"));
			WebElement makerCheckerLabel = driver.findElement(By.xpath("//span[contains(text(),'Maker Checker')]"));
			if (makerCheckerLogo.isDisplayed() && makerCheckerLabel.isDisplayed()) {
				System.out.println("Maker Checker label and logo are displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Maker Checker label and logo are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", makerCheckerLabel);
			Thread.sleep(3000);

//maker checker tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tabName = driver.findElement(By.xpath("(//span[contains(text(),'Maker Checker')])[2]"));
			if (pushpin.isDisplayed() && tabName.isDisplayed()) {
				System.out.println("Maker Checker tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Maker Checker tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//select brand
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
			search.sendKeys("ajio");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),'AJIO')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//maker checker(heading,information)
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Maker Checker ')]"));
			WebElement inform = driver.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (heading.isDisplayed() && inform.isDisplayed()) {
				System.out.println("Maker Checker heading and information are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Maker Checker heading and information are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//feature active button
			WebElement featureHeading = driver.findElement(By.xpath("//p[contains(@class,'text__md mb-4 mr-12')]"));
			WebElement featureActiveButton = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
			if (featureHeading.isDisplayed() && featureActiveButton.isDisplayed()) {
				System.out.println("Feature Active button is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Feature Active button is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			js.executeScript("arguments[0].click()", featureActiveButton);
			Thread.sleep(3000);

//brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow1 = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			if (brandField.isDisplayed() && arrow1.isDisplayed()) {
				System.out.println("Brand Field is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Brand Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//search field & total rules
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			WebElement totalRules = driver.findElement(By.xpath("//p[contains(text(),'Total Rules:')]"));
			if (searchField.isDisplayed() && searchButton.isDisplayed() && totalRules.isDisplayed()) {
				System.out.println("Search Field and Total rules are displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Search Field and Total rules are not displayed");
				componentsInformation.add(6, "Not Present");
			}

//settings,cloud download buttons
			WebElement settingsButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]"));
			WebElement cloudDownloadButton = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'cloud_download')]"));
			if (settingsButton.isDisplayed() && cloudDownloadButton.isDisplayed()) {
				System.out.println("Settings and Download button are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Settings and Download button are not displayed");
				componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", cloudDownloadButton);
			Thread.sleep(3000);
			
//import rules
			WebElement importRulesHeading=driver.findElement(By.xpath("//p[@class='modal__title mb-0']"));
			if(importRulesHeading.isDisplayed()) {
				System.out.println("Import Rule heading is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Import Rule heading is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			
//destination brand(heading,information,tab)
			WebElement destinationHeading=driver.findElement(By.xpath("(//p[contains(@class,'mb-4 font-weight-600')])[1]"));
			WebElement destinationInfo=driver.findElement(By.xpath("(//p[contains(@class,'text__sub--sm mb-0 line-height-1.50')])[1]"));
			WebElement destinationTab=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if(destinationHeading.isDisplayed()&&destinationInfo.isDisplayed()&&destinationTab.isDisplayed()) {
				System.out.println("Destination brand heading,information,tab are displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Destination brand heading,information,tab are not displayed");
				componentsInformation.add(9, "Not Present");
			}
			
//keyboard double arrow
			WebElement keyboardArrow=driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_double_arrow_down')]"));
			if(keyboardArrow.isDisplayed()) {
				System.out.println("Keyboard double arrow down is displayed");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Keyboard double arrow down is not displayed");
				componentsInformation.add(10, "Not Present");
			}
			
//source brand(heading,tab,information)
			WebElement sourceHeading=driver.findElement(By.xpath("(//p[contains(@class,'mb-4 font-weight-600')])[2]"));
			WebElement sourceInfo=driver.findElement(By.xpath("(//p[contains(@class,'text__sub--sm mb-0 line-height-1.50')])[2]"));
			WebElement sourceTab=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			if(sourceHeading.isDisplayed()&&sourceInfo.isDisplayed()&&sourceTab.isDisplayed()) {
				System.out.println("Source brand heading,information,tab are displayed");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Source brand heading,information,tab are not displayed");
				componentsInformation.add(11, "Not Present");
			}
			
//import rule button
			WebElement importRuleButton=driver.findElement(By.xpath("//span[contains(text(),'Import rules')]"));
			if(importRuleButton.isDisplayed()) {
				System.out.println("Import rule button is displayed");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Import rule button is not displayed");
				componentsInformation.add(12, "Not Present");
			}
			
//close button
			WebElement crossButton4=driver.findElement(By.xpath("//mat-icon[contains(text(),'close ')]"));
			if(crossButton4.isDisplayed()) {
				System.out.println("Cross button is displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("Cross button is not displayed");
				componentsInformation.add(13, "Not Present");
			}
			js.executeScript("arguments[0].click()", crossButton4);
			Thread.sleep(3000);
			

//create new rules button
			WebElement createNewRulesButton = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Rules ')]"));
			if (createNewRulesButton.isDisplayed()) {
				System.out.println("Create New Rule button is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Create New Rule button is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			js.executeScript("arguments[0].click()", createNewRulesButton);
			Thread.sleep(3000);

//configure rules for mc heading,arrowback
			WebElement configureHeading = driver.findElement(By.xpath("//h3[contains(@class,'modal__title')]"));
			WebElement arrowBack = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if (configureHeading.isDisplayed() && arrowBack.isDisplayed()) {
				System.out.println("Configure rule heading and arowback button are displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Configure rule heading and arowback button are not displayed");
				componentsInformation.add(15, "Not Present");
			}

//rule names(heading,information,tab)
			WebElement ruleNameHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[1]"));
			WebElement ruleInfo = driver.findElement(By.xpath("(//p[@class='text__light mb-5 text__sm'])[1]"));
			WebElement ruleTab = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (ruleNameHeading.isDisplayed() && ruleInfo.isDisplayed() && ruleTab.isDisplayed()) {
				System.out.println("Rule Names heading,information and tab are displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Rule Names heading,information and tab are not displayed");
				componentsInformation.add(16, "Not Present");
			}

//attributes to create rules
			WebElement attributeHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[2]"));
			WebElement attributeInfo = driver.findElement(By.xpath("(//p[@class='text__light mb-5 text__sm'])[2]"));
			if (attributeHeading.isDisplayed() && attributeInfo.isDisplayed()) {
				System.out.println("Attributes to create rules heading and information are displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Attributes to create rules heading and information are not displayed");
				componentsInformation.add(17, "Not Present");
			}

//attributes tabs
			WebElement outerSideToggles = driver.findElement(By.xpath("(//mat-button-toggle-group[@role='group'])[1]"));
			WebElement deleteGroupButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Delete Group']"));
			WebElement insideToggles = driver.findElement(By.xpath("(//mat-button-toggle-group[@role='group'])[2]"));
			WebElement deleteAttributeButton = driver
					.findElement(By.xpath("//mat-icon[@mattooltip='Delete Attribute']"));
			WebElement attributeTab = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement addAttributeButton = driver.findElement(By.xpath("//a[contains(text(),'+ Add Attribute')]"));
			WebElement addGroupButton = driver.findElement(By.xpath("//span[contains(text(),' + Add Group ')]"));
			if (outerSideToggles.isDisplayed() && deleteGroupButton.isDisplayed() && insideToggles.isDisplayed()
					&& deleteAttributeButton.isDisplayed() && attributeTab.isDisplayed()
					&& addAttributeButton.isDisplayed() && addGroupButton.isDisplayed()) {
				System.out.println("All Attributes tabs are displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("All Attributes tabs are not displayed");
				componentsInformation.add(18, "Not Present");
			}

//query preview(heading,information,tab,copy&length query)
			WebElement queryHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[3]"));
			WebElement queryInfo = driver.findElement(By.xpath("(//p[@class='text__dark--sm'])"));
			WebElement queryTab = driver
					.findElement(By.xpath("//span[contains(@class,'textarea-featured__input h-260')]"));
			WebElement copyQuery = driver.findElement(By.xpath("//span[contains(text(),'Copy Query')]"));
			WebElement queryLength = driver.findElement(By.xpath("//span[contains(text(),'Query length')]"));
			if (queryHeading.isDisplayed() && queryInfo.isDisplayed() && queryTab.isDisplayed()
					&& copyQuery.isDisplayed() && queryLength.isDisplayed()) {
				System.out.println("Query preview heading,information,tab,copy query and query length are displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out
						.println("Query preview heading,information,tab,copy query and query length are not displayed");
				componentsInformation.add(19, "Not Present");
			}

//reset button
			WebElement resetButton = driver.findElement(By.xpath("//span[contains(text(),' Reset Query ')]"));
			if (resetButton.isDisplayed()) {
				System.out.println("Reset button is displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Reset button is not displayed");
				componentsInformation.add(20, "Not Present");
			}

//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save Rule')]"));
			if (saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(21, "Not Present");
			}

//cancel button
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(22, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

//language filter toggle button
			WebElement toggleButton = driver
					.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[2]"));
			if (toggleButton.isDisplayed()) {
				System.out.println("Toggle Button for language filter is displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Toggle Button for language filter is not displayed");
				componentsInformation.add(23, "Not Present");
			}
			js.executeScript("arguments[0].click()", toggleButton);
			Thread.sleep(3000);

//language filter(heading,information)&total keyword configure
			WebElement languageHeading = driver.findElement(By.xpath("//span[@class='font-weight-600 mb-4 mr-10']"));
			WebElement languageInfo = driver.findElement(By.xpath("//p[@class='text__sub--sm line-height-1.25 mb-0']"));
			WebElement totalKeywordConfigure = driver
					.findElement(By.xpath("//span[contains(@class,'text__label--sm mb-4 ml-15')]"));
			if (languageHeading.isDisplayed() && languageInfo.isDisplayed() && totalKeywordConfigure.isDisplayed()) {
				System.out.println("Language Filter heading,information and total keyword configure are displayed");
				componentsInformation.add(24, "Present");
			} else {
				System.out.println("Language Filter heading,information and total keyword configure are not displayed");
				componentsInformation.add(24, "Not Present");
			}

//enabled language filter button
			WebElement enabledLanguageButton = driver
					.findElement(By.xpath("//span[@class='cursor-pointer link-hover mr-8']"));
			if (enabledLanguageButton.isDisplayed()) {
				System.out.println("Enabled language filter button is displayed");
				componentsInformation.add(25, "Present");
			} else {
				System.out.println("Enabled language filter button is not displayed");
				componentsInformation.add(25, "Not Present");
			}
			js.executeScript("arguments[0].click()", enabledLanguageButton);
			Thread.sleep(3000);

//enabled language filter(heading,information)&cross button
			WebElement enabledlanguageHeading = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement enabledLanguageInfo = driver.findElement(By.xpath("//p[@class='text__light--sm mb-0']"));
			WebElement crossButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if (enabledlanguageHeading.isDisplayed() && enabledLanguageInfo.isDisplayed()
					&& crossButton.isDisplayed()) {
				System.out.println("Enabled languge filter heading,information and cross button are displayed");
				componentsInformation.add(26, "Present");
			} else {
				System.out.println("Enabled languge filter heading,information and cross button are not displayed");
				componentsInformation.add(26, "Not Present");
			}

//maker checker brand body&alert
			WebElement brandsBody = driver.findElement(By.xpath("//div[@class='makerchecker-brand__body']"));
			WebElement alertMessage = driver.findElement(By.xpath("//div[@class='makerchecker-brand__alert']"));
			if (brandsBody.isDisplayed() && alertMessage.isDisplayed()) {
				System.out.println("Maker checker brand body and alert message are displayed");
				componentsInformation.add(27, "Present");
			} else {
				System.out.println("Maker checker brand body and alert message are not displayed");
				componentsInformation.add(27, "Not Present");
			}

//close button
			WebElement closeButton = driver.findElement(By.xpath("//span[contains(text(),' Close ')]"));
			if (closeButton.isDisplayed()) {
				System.out.println("Close  button is displayed");
				componentsInformation.add(28, "Present");
			} else {
				System.out.println("Close  button is not displayed");
				componentsInformation.add(28, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);

//view keyword button
			WebElement viewKeywordButton = driver
					.findElement(By.xpath("//span[contains(@class,'cursor-pointer link-hover ml-8')]"));
			if (viewKeywordButton.isDisplayed()) {
				System.out.println("View Keyword button is displayed");
				componentsInformation.add(29, "Present");
			} else {
				System.out.println("View Keyword button is not displayed");
				componentsInformation.add(29, "Not Present");
			}
			js.executeScript("arguments[0].click()", viewKeywordButton);
			Thread.sleep(3000);

//language filter heading,cross button
			WebElement languageFilterHeading = driver
					.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			WebElement crossButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if (languageFilterHeading.isDisplayed() && crossButton1.isDisplayed()) {
				System.out.println("Language filter heading and cross button are displayed");
				componentsInformation.add(30, "Present");
			} else {
				System.out.println("Language filter heading and cross button are not displayed");
				componentsInformation.add(30, "Not Present");
			}

//language filter tab&save button
			WebElement filterTab = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			WebElement saveButton1 = driver.findElement(By.xpath("//span[contains(text(),'Save Keywords')]"));
			if (filterTab.isDisplayed() && saveButton1.isDisplayed()) {
				System.out.println("Language filter tab and save button are displayed");
				componentsInformation.add(31, "Present");
			} else {
				System.out.println("Language filter tab and save button are not displayed");
				componentsInformation.add(31, "Not Present");
			}

//keyword phrases heading,sort,delete buttons
			WebElement keywordPhrasesHeading = driver
					.findElement(By.xpath("//h4[@class='text__label mb-0 colored__blue--dark']"));
			WebElement sortButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'sort ')]"));
			WebElement deleteLogo = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])[11]"));
			WebElement deleteButton = driver.findElement(By.xpath("//span[contains(text(),'Delete All')]"));
			if (keywordPhrasesHeading.isDisplayed() && sortButton.isDisplayed() && deleteLogo.isDisplayed()
					&& deleteButton.isDisplayed()) {
				System.out.println("Keyword phrases heading,sort & delete buttons are displayed");
				componentsInformation.add(32, "Present");
			} else {
				System.out.println("Keyword phrases heading,sort & delete buttons are not displayed");
				componentsInformation.add(32, "Not Present");
			}

//foul keywords,rows,countlist
			WebElement foulKeywords = driver.findElement(By.xpath(
					"//div[contains(@class,'foulkeyword__container--keywords account-profile__fullmatchips ')]"));
			WebElement rows = driver.findElement(By
					.xpath("//div[contains(@class,'h-60 bg__white pl-2 d-flex-items-center grid-row-size-dropdown')]"));
			WebElement countList = driver.findElement(By.xpath("(//div[@class='mat-paginator-range-actions'])[2]"));
			if (foulKeywords.isDisplayed() && rows.isDisplayed() && countList.isDisplayed()) {
				System.out.println("Foul keywords,rows ,countlist are displayed");
				componentsInformation.add(33, "Present");
			} else {
				System.out.println("Foul keywords,rows ,countlist are not displayed");
				componentsInformation.add(33, "Not Present");
			}

//foul alert message
			WebElement foulAlertMessage = driver.findElement(By.xpath("//div[@class='foulkeyword__foot--alert']"));
			if (foulAlertMessage.isDisplayed()) {
				System.out.println("Foul alert message is displayed");
				componentsInformation.add(34, "Present");
			} else {
				System.out.println("Foul alert message is not displayed");
				componentsInformation.add(34, "Not Present");
			}

//close button
			WebElement closeButton1 = driver.findElement(By.xpath("//span[contains(text(),' Close ')]"));
			if (closeButton1.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(35, "Present");
			} else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(35, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);

			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

			componentsInformation.add(36, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "MakerCheckerUIComponents");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
