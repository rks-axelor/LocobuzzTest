package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoInflunserConfigUIVerificationWorkflow {

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
			Thread.sleep(5000);
//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void verifyingInfluenserConfigurationComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv listening settings
			WebElement advListeningSettings = driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			if (advListeningSettings.isDisplayed()) {
			System.out.println("Adv Listening Settings is displayed");
			componentsInformation.add(0, "Present");
			} else {
			System.out.println("Adv Listening Settings is not displayed");
			componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advListeningSettings);
			Thread.sleep(3000);

//Influenser Configuration
			WebElement InfluenserLogo = driver.findElement(By.xpath("//img[@src='assets/account/menu/Influencer_Configuration.svg']"));
			WebElement InfluenserLabel = driver.findElement(By.xpath("//span[contains(text(),'Influencer Configuration')]"));
			if (InfluenserLogo.isDisplayed() && InfluenserLabel.isDisplayed()) {
			System.out.println("Influenser Configuration is displayed");
			componentsInformation.add(1, "Present");
			} else {
			System.out.println("Influenser Configuration is not displayed");
			componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", InfluenserLabel);
			Thread.sleep(3000);

//Influenser Configuration tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement ICTab = driver.findElement(By.xpath("(//span[contains(text(),'Influencer Configuration')])[2]"));
			if (pushpin.isDisplayed() && ICTab.isDisplayed()) {
			System.out.println("Influenser Configuration 1st Tab is displayed");
			componentsInformation.add(2, "Present");
			} else {
			System.out.println("Influenser Configuration 1st Tab is not displayed");
			componentsInformation.add(2, "Not Present");
			}
			Thread.sleep(3000);

//Influenser Configuration Heading & information
			WebElement heading = driver.findElement(By.xpath("(//p[contains(text(),'Influencer Configuration')])"));
			WebElement information = driver.findElement(By.xpath("(//p[contains(text(),'Influencer Configuration')])//following::p[1]"));
			if (heading.isDisplayed() && information.isDisplayed()) {
			System.out.println("Influenser Configuration Heading & information is displayed");
			componentsInformation.add(3, "Present");
			} else {
			System.out.println("Influenser Configuration Heading & information is not displayed");
			componentsInformation.add(3, "Not Present");
			}
			Thread.sleep(3000);

//Filter,CreateCat,Import History ,Add New Influenser Buttons
			WebElement Filter = driver.findElement(By.xpath("(//mat-icon[contains(text(),' filter_alt')])[1]"));
			WebElement ImportHistoryIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'history')])[1]"));
			WebElement ImportHistoryLabel = driver.findElement(By.xpath("(//span[contains(text(),' Import History ')])"));
			WebElement CreateNewCat = driver.findElement(By.xpath("(//span[contains(text(),'Create New Category')])"));
			WebElement AddInflButtonIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[1]"));
			WebElement AddInflButtonLabel = driver.findElement(By.xpath("(//span[contains(text(),'Add Influencers')])"));
			if (Filter.isDisplayed() && ImportHistoryIcon.isDisplayed() && ImportHistoryLabel.isDisplayed() 
			&& CreateNewCat.isDisplayed() && AddInflButtonIcon.isDisplayed() && AddInflButtonLabel.isDisplayed() ) {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are displayed");
			componentsInformation.add(4, "Present");
			} else {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are not displayed");
			componentsInformation.add(4, "Not Present");
			}
			Thread.sleep(3000);

//search field
			WebElement searchField = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement SearchbyScrNm = driver.findElement(By.xpath("//input[@placeholder='Search by Screen Name']"));
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchField.isDisplayed() && symbol.isDisplayed() && SearchbyScrNm.isDisplayed()) {
			System.out.println("Search Field is displayed");
			componentsInformation.add(5, "Present");
			} else {
			System.out.println("Search Field is not displayed");
			componentsInformation.add(5, "Not Present");
			}

//Import History UI Components
			WebElement ImportHistoryLabel1 = driver.findElement(By.xpath("(//span[contains(text(),' Import History ')])"));
			js.executeScript("arguments[0].click()", ImportHistoryLabel1);
			Thread.sleep(7000);
			WebElement Heading = driver.findElement(By.xpath("(//h3[contains(text(),'Import History')])"));
			WebElement CloseImportWindow = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			WebElement SearchSymbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[4]"));
			WebElement SearchTxbx = driver.findElement(By.xpath("(//input[@placeholder='Search File Name'])"));
			WebElement Close = driver.findElement(By.xpath("//span[contains(text(),'Close')]"));
			WebElement ImportCSV = driver.findElement(By.xpath("//p[contains(text(),'Import CVS Files History')]"));
			if (Heading.isDisplayed() && CloseImportWindow.isDisplayed() && SearchSymbol.isDisplayed() && SearchTxbx.isDisplayed()
			&& Close.isDisplayed() && ImportCSV.isDisplayed()) {
			System.out.println("Import History UI Components are displayed");
			componentsInformation.add(6, "Present");
			} else {
			System.out.println("Import History UI Components are not displayed");
			componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", CloseImportWindow);
            Thread.sleep(3000);
            
//create New Category Window UI 
			WebElement CreateCat = driver.findElement(By.xpath("(//span[contains(text(),'Create New Category')])"));
			js.executeScript("arguments[0].click()", CreateCat);
			Thread.sleep(7000);
			WebElement CreateHeading = driver.findElement(By.xpath("//h3[contains(text(),'Create New Category')]"));
			WebElement CategoryNmtxbx = driver.findElement(By.xpath("//h3[contains(text(),'Create New Category')]//following::p[1]"));
			WebElement AddCatg = driver.findElement(By.xpath("//span[contains(text(),'Add Category')]"));
			WebElement SearchCatg = driver.findElement(By.xpath("(//input[@placeholder='Search Category'])"));
			WebElement Cancel = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
			WebElement CloseCatWind = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if (CreateHeading.isDisplayed() && CategoryNmtxbx.isDisplayed() && AddCatg.isDisplayed() && SearchCatg.isDisplayed()
			&& Cancel.isDisplayed() && CloseCatWind.isDisplayed()) {
			System.out.println("create New Category Window UI is displayed");
			componentsInformation.add(7, "Present");
			} else {
			System.out.println("create New Category Window UI is not displayed");
			componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", CloseCatWind);
			Thread.sleep(3000);

//Add Influneser Window UI components			
			WebElement AddIn = driver.findElement(By.xpath("(//span[contains(text(),'Add Influencers')])"));
			js.executeScript("arguments[0].click()", AddIn);
			Thread.sleep(7000);
			WebElement AddInfHeading = driver.findElement(By.xpath("//h3[contains(text(),'Add Influencer')]"));
			WebElement Arrowbackinf = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			WebElement TwScreenField = driver.findElement(By.xpath("(//p[contains(text(),'Twitter Screen Name')])"));
			WebElement SelectCatField = driver.findElement(By.xpath("(//p[contains(text(),'Select the Influencer Category')])"));
			WebElement AddScreename = driver.findElement(By.xpath("(//span[contains(text(),'+Add Screen Name')])"));
			WebElement Note = driver.findElement(By.xpath("(//div[contains(@class,'modal__foot add-influencer__foot')])"));
			WebElement downloadSample = driver.findElement(By.xpath("(//span[contains(text(),'Download sample excel')])"));
			WebElement CancelAddInf = driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])"));
			WebElement Save = driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			if (AddInfHeading.isDisplayed() && TwScreenField.isDisplayed() && SelectCatField.isDisplayed() && AddScreename.isDisplayed()
			&& Note.isDisplayed() && CancelAddInf.isDisplayed() && Arrowbackinf.isDisplayed() 
			&& downloadSample.isDisplayed() && Save.isDisplayed()) {
			System.out.println("Add Influneser Window UI components	is displayed");
			componentsInformation.add(8, "Present");
			} else {
			System.out.println("Add Influneser Window UI components is not displayed");
			componentsInformation.add(8, "Not Present");
			}
			js.executeScript("arguments[0].click()", Arrowbackinf);
			Thread.sleep(3000);

//Influenser Rule 2nd Tab
			WebElement pushpin2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement ICTab2 = driver.findElement(By.xpath("(//span[contains(text(),'Influencer Rules')])[1]"));
			if (pushpin2.isDisplayed() && ICTab2.isDisplayed()) {
			System.out.println("Influenser Configuration 2nd Tab is displayed");
			componentsInformation.add(9, "Present");
			} else {
			System.out.println("Influenser Configuration 2nd Tab is not displayed");
			componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", ICTab2);
			Thread.sleep(5000);
			
//search field
			WebElement searchField2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[6]"));
			WebElement SearchbyRule = driver.findElement(By.xpath("//input[@data-placeholder='Search By Rule Name, Query']"));
			WebElement symbol2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			if (searchField2.isDisplayed() && SearchbyRule.isDisplayed() && symbol2.isDisplayed()) {
			System.out.println("Search Field is displayed");
			componentsInformation.add(10, "Present");
			} else {
			System.out.println("Search Field is not displayed");
			componentsInformation.add(10, "Not Present");
			}
			Thread.sleep(3000);
			
//Filter,CreateCat,Overwritten ,Add New Influenser Buttons
			WebElement Filter2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' filter_alt')])[2]"));
			WebElement Overwritterlabel = driver.
			findElement(By.xpath("(//span[contains(text(),'Overwrite rule-based category of existing influencer in database')])"));
			WebElement Overwritterlogo = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[12]"));
			
			if (Filter2.isDisplayed() && Overwritterlabel.isDisplayed() && Overwritterlogo.isDisplayed() ) {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are displayed");
			componentsInformation.add(11, "Present");
			} else {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are not displayed");
			componentsInformation.add(11, "Not Present");
			}
			Thread.sleep(3000);


//Add New Influenser Rule UI Components
			WebElement AddNewInflButtonIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[2]"));
			WebElement AddNewInflButtonLabel = driver.findElement(By.xpath("(//span[contains(text(),'Add New Influencer Rule')])"));
			if (AddNewInflButtonIcon.isDisplayed() && AddNewInflButtonLabel.isDisplayed() ) {
			System.out.println("Add New Influenser Rule UI Components are displayed");
			componentsInformation.add(12, "Present");
			} else {
			System.out.println("Add New Influenser Rule UI Components are not displayed");
			componentsInformation.add(12, "Not Present");
			}
			js.executeScript("arguments[0].click()", AddNewInflButtonLabel);
			Thread.sleep(3000);
//Heading
			WebElement CreateNewInfRuleHeading = driver.findElement(By.xpath("(//h3[contains(@class,'modal__title')])"));
			WebElement arrowback2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if (CreateNewInfRuleHeading.isDisplayed() && arrowback2.isDisplayed()) {
			System.out.println("Create New Influencer Rule Window Heading is displayed");				
			componentsInformation.add(13, "Present");
			} else {
			System.out.println("Create New Influencer Rule Window Heading is not displayed");
			componentsInformation.add(13, "Not Present");
			}
			Thread.sleep(3000);

//Rule Name Field 
			WebElement Rulenamelabel = driver.findElement(By.xpath("(//p[contains(text(),'Rule Name')])"));
			WebElement RulenameInfo = driver.findElement(By.xpath("(//p[contains(text(),'Rule Name')])//following::p[1]"));
			WebElement RulenameTxbx = driver.findElement(By.xpath("(//mat-label[contains(text(),'Rule Name')])"));
			if (Rulenamelabel.isDisplayed() && RulenameInfo.isDisplayed() && RulenameTxbx.isDisplayed()) {
			System.out.println("Rule Name Field  is displayed");
			componentsInformation.add(14, "Present");
			} else {
			System.out.println("Rule Name Field  is not displayed");
			componentsInformation.add(14, "Not Present");
			}
			Thread.sleep(3000);

//Select Category to Tag
			WebElement SelectLabel = driver.
			findElement(By.xpath("(//p[contains(text(),'Select an Influencer category to tag these twitter users ')])"));
			WebElement Txbx = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			WebElement Drpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
			if (SelectLabel.isDisplayed() && Txbx.isDisplayed() && Drpdwn.isDisplayed()) {
			System.out.println("Select Category to Tag Field is displayed");
			componentsInformation.add(15, "Present");
			} else {
			System.out.println("Select Category to Tag Field is not displayed");
			componentsInformation.add(15, "Not Present");
			}
			Thread.sleep(3000);

// Create New Influenser rule Field
			WebElement CreateLabel = driver.findElement(By.xpath("(//p[contains(text(),'Create New Influencer Rules')])"));
			WebElement Createinfo = driver.findElement(By.xpath("(//p[contains(text(),'Create New Influencer Rules')])//following::p[1]"));
			WebElement AddGroup = driver.findElement(By.xpath("(//span[contains(text(),' + Add Group ')])"));
			WebElement Addattribute = driver.findElement(By.xpath("(//a[contains(text(),'+ Add Attribute')])"));
			if (CreateLabel.isDisplayed() && Createinfo.isDisplayed() && AddGroup.isDisplayed()  && Addattribute.isDisplayed()) {
			System.out.println("Create New Influenser rule Field is displayed");
			componentsInformation.add(16, "Present");
			} else {
			System.out.println("Create New Influenser rule Field is not displayed");
			componentsInformation.add(16, "Not Present");
			}
			Thread.sleep(3000);

//Query Preview
			WebElement Label = driver.findElement(By.xpath("(//p[contains(text(),'Query Preview')])[1]"));
			WebElement info = driver.findElement(By.xpath("(//p[contains(text(),'Query Preview')])//following::p[1]"));
			WebElement CopyQuery = driver.findElement(By.xpath("(//span[contains(text(),'Copy Query')])"));
			WebElement Querylength = driver.findElement(By.xpath("(//span[contains(text(),'Query length')])"));
			if (Label.isDisplayed() && info.isDisplayed() && CopyQuery.isDisplayed()  && Querylength.isDisplayed()) {
			System.out.println("Query Preview is displayed");
			componentsInformation.add(17, "Present");
			} else {
			System.out.println("Query Preview is not  displayed");
			componentsInformation.add(17, "Not Present");
			}
			Thread.sleep(3000);
			
// Cancel & Save Button
			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]"));
			WebElement CancelButton = driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])[1]"));
			if (saveButton.isDisplayed() && CancelButton.isDisplayed()) {
			System.out.println("Cancel & Save Button is displayed");
			componentsInformation.add(18, "Present");
			} else {
			System.out.println("Cancel & Save Button is not displayed");
			componentsInformation.add(18, "Not Present");
			}
			WebElement arrowBack3 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			js.executeScript("arguments[0].click()", arrowBack3);
			Thread.sleep(3000);

			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

			componentsInformation.add(19, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "InfluenserConfigUIComponent");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}

