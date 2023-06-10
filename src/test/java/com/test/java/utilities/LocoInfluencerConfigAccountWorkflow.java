package com.test.java.utilities;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoInfluencerConfigAccountWorkflow {

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

public static void verifyingInfluenserConfigurationFunction(WebDriver driver) throws Exception {
try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv listening settings
			WebElement advListeningSettings = driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			if (advListeningSettings.isDisplayed()) {
			System.out.println("Adv Listening Settings is displayed");
			} else {
			System.out.println("Adv Listening Settings is not displayed");
			}
			js.executeScript("arguments[0].click()", advListeningSettings);
			Thread.sleep(3000);

//Influenser Configuration
			WebElement InfluenserLogo = driver.findElement(By.xpath("//img[@src='assets/account/menu/Influencer_Configuration.svg']"));
			WebElement InfluenserLabel = driver.findElement(By.xpath("//span[contains(text(),'Influencer Configuration')]"));
			if (InfluenserLogo.isDisplayed() && InfluenserLabel.isDisplayed()) {
			System.out.println("Influenser Configuration is displayed");
			} else {
			System.out.println("Influenser Configuration is not displayed");
			}
			js.executeScript("arguments[0].click()", InfluenserLabel);
			Thread.sleep(3000);

//Influenser Configuration tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement ICTab = driver.findElement(By.xpath("(//span[contains(text(),'Influencer Configuration')])[2]"));
			if (pushpin.isDisplayed() && ICTab.isDisplayed()) {
			System.out.println("Influenser Configuration 1st Tab is displayed");
			} else {
			System.out.println("Influenser Configuration 1st Tab is not displayed");
			}
			Thread.sleep(3000);

//Influenser Configuration Heading & information
			WebElement heading = driver.findElement(By.xpath("(//p[contains(text(),'Influencer Configuration')])"));
			WebElement information = driver.findElement(By.xpath("(//p[contains(text(),'Influencer Configuration')])//following::p[1]"));
			if (heading.isDisplayed() && information.isDisplayed()) {
			System.out.println("Influenser Configuration Heading & information is displayed");
			} else {
			System.out.println("Influenser Configuration Heading & information is not displayed");
			}
			Thread.sleep(3000);
			
//Select Brand
			WebElement Brandtxbx = driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-wrapper ng')])[2]"));
			WebElement SelectAutodemo = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-')])[1]"));
			if (Brandtxbx.isDisplayed() && SelectAutodemo.isDisplayed()) {
			System.out.println("Select Brand Field is displayed");
			} else {
			System.out.println("Select Brand Field is not displayed");
			}
			js.executeScript("arguments[0].click()", SelectAutodemo);
			Thread.sleep(5000);
			WebElement searchAutodemo = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
			js.executeScript("arguments[0].click()", searchAutodemo);
			Thread.sleep(5000);
			
//search field
			WebElement searchField = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement SearchbyScrNm = driver.findElement(By.xpath("//input[@placeholder='Search by Screen Name']"));
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchField.isDisplayed() && symbol.isDisplayed() && SearchbyScrNm.isDisplayed()) {
			System.out.println("Search Field is displayed");
			} else {
			System.out.println("Search Field is not displayed");
			}
			js.executeScript("arguments[0].click()", SearchbyScrNm);
			Thread.sleep(3000);
			Actions actionsc = new Actions(driver);
			Action actionc = actionsc.sendKeys(SearchbyScrNm, "Papilopapita").sendKeys(Keys.ENTER).build();
	        actionc.perform();
	        Thread.sleep(3000);
	        SearchbyScrNm.clear();
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", SearchbyScrNm);
			Actions actionsD = new Actions(driver);
			Action actionD = actionsD.sendKeys(SearchbyScrNm, "Tshrivatri").sendKeys(Keys.ENTER).build();
	        actionD.perform();
	        Thread.sleep(5000);
	        SearchbyScrNm.clear();
	        Thread.sleep(5000);
	        

//Filter,CreateCat,Import History ,Add New Influencer Buttons
			WebElement Filter = driver.findElement(By.xpath("(//mat-icon[contains(text(),' filter_alt')])[1]"));
			WebElement ImportHistoryIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'history')])[1]"));
			WebElement ImportHistoryLabel = driver.findElement(By.xpath("(//span[contains(text(),' Import History ')])"));
			WebElement CreateNewCat = driver.findElement(By.xpath("(//span[contains(text(),'Create New Category')])"));
			WebElement AddInflButtonIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[1]"));
			WebElement AddInflButtonLabel = driver.findElement(By.xpath("(//span[contains(text(),'Add Influencers')])"));
			if (Filter.isDisplayed() && ImportHistoryIcon.isDisplayed() && ImportHistoryLabel.isDisplayed() 
			&& CreateNewCat.isDisplayed() && AddInflButtonIcon.isDisplayed() && AddInflButtonLabel.isDisplayed() ) {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are displayed");
			} else {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are not displayed");
			}
			js.executeScript("arguments[0].click()", CreateNewCat);
			Thread.sleep(3000);
			WebElement searchcatg = driver.findElement(By.xpath("//input[@data-placeholder='Search Category']"));
			js.executeScript("arguments[0].click()", searchcatg);
			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(searchcatg, "Automation Demo").sendKeys(Keys.ENTER).build();
	        action3.perform();
			Thread.sleep(5000);
			searchcatg.clear();
			Thread.sleep(5000);
			WebElement TypeCategoryname = driver.findElement(By.xpath("//input[@data-placeholder='Type Category Name']"));
			js.executeScript("arguments[0].click()", TypeCategoryname);
			Thread.sleep(5000);
			Actions actionst = new Actions(driver);
			Action actiont = actionst.sendKeys(TypeCategoryname, "Au").build();
	        actiont.perform();
	        Thread.sleep(5000);
	        WebElement AddCatGButton = driver.findElement(By.xpath("//span[contains(text(),'Add Category')]"));
	        AddCatGButton.click();
			Thread.sleep(5000);
			Actions actionsz = new Actions(driver);
			Action actionz = actionsz.sendKeys(TypeCategoryname, "tomation Demo Category").build();
			actionz.perform();
			Thread.sleep(5000);
			TypeCategoryname.clear();
			Thread.sleep(5000);
			TypeCategoryname.sendKeys("Automation Demo");
			Thread.sleep(3000);
			WebElement addcategorybutton = driver.findElement(By.xpath("//span[contains(text(),'Add Category')]"));
			addcategorybutton.click();
			Thread.sleep(5000);
			WebElement CloseCatWind = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			js.executeScript("arguments[0].click()", CloseCatWind);
			Thread.sleep(5000);



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
			} else {
			System.out.println("Import History UI Components are not displayed");
			}
			Actions actionsI = new Actions(driver);
			Action actionI = actionsI.sendKeys(SearchTxbx, "Influencer Demo").sendKeys(Keys.ENTER).build();
	        actionI.perform();
	        WebElement SearchSymbol1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[4]"));
	        js.executeScript("arguments[0].click()", SearchSymbol1);
            Thread.sleep(3000);
	        Thread.sleep(5000);
	        WebElement CloseImportWindow1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			js.executeScript("arguments[0].click()", CloseImportWindow1);
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
			} else {
			System.out.println("Add Influneser Window UI components is not displayed");
			}
		    WebElement TwScreenField1 = driver.findElement(By.xpath("(//input[@placeholder='Twitter Screen Name'])[1]"));
			js.executeScript("arguments[0].click()", TwScreenField1);
			Thread.sleep(3000);
			Actions actionsk = new Actions(driver);
			Action actionk = actionsk.sendKeys(TwScreenField1, "Papilopapita").sendKeys(Keys.ENTER).build();
	        actionk.perform();
	        Thread.sleep(3000);
	        WebElement SelectCatg = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			js.executeScript("arguments[0].click()", SelectCatg);
			Thread.sleep(3000);
			WebElement Automobile = driver.findElement(By.xpath("(//span[contains(text(),' Automation Demo')])[1]"));
			js.executeScript("arguments[0].click()", Automobile);
			Thread.sleep(3000);
			WebElement AddScreename1 = driver.findElement(By.xpath("(//span[contains(text(),'+Add Screen Name')])"));
			js.executeScript("arguments[0].click()", AddScreename1);
			Thread.sleep(3000);
			WebElement TwScreenField2 = driver.findElement(By.xpath("(//input[@placeholder='Twitter Screen Name'])[2]"));
			js.executeScript("arguments[0].click()", TwScreenField2);
			Thread.sleep(3000);
	       
			Actions actionskk = new Actions(driver);
			Action actionkk = actionskk.sendKeys(TwScreenField2, "TShrivatri").sendKeys(Keys.ENTER).build();
	        actionkk.perform();
	        Thread.sleep(3000);
	        WebElement SelectCatg2 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])[2]"));
			js.executeScript("arguments[0].click()", SelectCatg2);
			Thread.sleep(3000);
			WebElement Automobile2 = driver.findElement(By.xpath("(//span[contains(text(),'Automobile')])[2]"));
			js.executeScript("arguments[0].click()", Automobile2);
			Thread.sleep(3000);
			WebElement TwScreenField3 = driver.findElement(By.xpath("(//input[@placeholder='Twitter Screen Name'])[2]"));
			js.executeScript("arguments[0].click()", TwScreenField3);
			Thread.sleep(3000);
			Actions actionsk1 = new Actions(driver);
			Action actionk1 = actionsk1.sendKeys(TwScreenField2, "@Kalyanchinni11").sendKeys(Keys.ENTER).build();
	        actionk1.perform();
	        Thread.sleep(3000);
	        
//Download and Delete Operation
		    WebElement Download=driver.findElement(By.xpath("(//span[contains(text(),'Download sample excel')])"));
		    js.executeScript("arguments[0].click()", Download);
		    Thread.sleep(10000);	
//Save Button
			WebElement Save1=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			if(Save.isDisplayed()) {
				System.out.println("Save Button is Present");
			}
			else {
				System.out.println("Save Button is not Present");
			}
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", Save1);
			Thread.sleep(4000);


	        
//Import CSV
			WebElement AddIn2 = driver.findElement(By.xpath("(//span[contains(text(),'Add Influencers')])"));
			js.executeScript("arguments[0].click()", AddIn2);
			Thread.sleep(7000);
			WebElement TwScreenFieldnext = driver.findElement(By.xpath("(//input[@placeholder='Twitter Screen Name'])[1]"));
			js.executeScript("arguments[0].click()", TwScreenFieldnext);
			Thread.sleep(3000);
			Actions actionsk2 = new Actions(driver);
			Action actionk2 = actionsk2.sendKeys(TwScreenFieldnext, "Bittuloco2030").sendKeys(Keys.ENTER).build();
	        actionk2.perform();
	        Thread.sleep(3000);
	        WebElement SelectCatgnext = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			js.executeScript("arguments[0].click()", SelectCatgnext);
			Thread.sleep(3000);
			WebElement Automobile5 = driver.findElement(By.xpath("(//span[contains(text(),' Automation Demo')])[1]"));
			js.executeScript("arguments[0].click()", Automobile5);
			Thread.sleep(3000);
	        WebElement Uploadicon1=driver.findElement(By.xpath("//span[contains(text(),'Import CSV')]"));
	        Uploadicon1.click();
			Thread.sleep(4000);	
			Robot rb = new Robot();
			rb.delay(2000);
			StringSelection ss = new StringSelection("C:\\Users\\admin\\Downloads\\Influencer Demo.csv");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(10000);
			WebElement DiscardCSV=driver.findElement(By.xpath("//span[contains(text(),'Discard')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", DiscardCSV);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", DiscardCSV);
			WebElement DiscardCSVyes=driver.findElement(By.xpath("(//span[contains(text(),'Yes')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", DiscardCSVyes);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", DiscardCSVyes);
			Thread.sleep(5000);
			




//Influenser Rule 2nd Tab
			WebElement pushpin2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement ICTab2 = driver.findElement(By.xpath("(//span[contains(text(),'Influencer Rules')])[1]"));
			if (pushpin2.isDisplayed() && ICTab2.isDisplayed()) {
			System.out.println("Influenser Configuration 2nd Tab is displayed");
			} else {
			System.out.println("Influenser Configuration 2nd Tab is not displayed");
			}
			js.executeScript("arguments[0].click()", ICTab2);
			Thread.sleep(5000);
			
//search field
			WebElement searchField2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[6]"));
			WebElement SearchbyRule = driver.findElement(By.xpath("//input[@data-placeholder='Search By Rule Name, Query']"));
			WebElement symbol2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			if (searchField2.isDisplayed() && SearchbyRule.isDisplayed() && symbol2.isDisplayed()) {
			System.out.println("Search Field is displayed");
			} else {
			System.out.println("Search Field is not displayed");
			}
			Thread.sleep(3000);
			
//Filter,CreateCat,Overwritten ,Add New Influencer Buttons
			WebElement Filter2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' filter_alt')])[2]"));
			WebElement Overwritterlabel = driver.
			findElement(By.xpath("(//span[contains(text(),'Overwrite rule-based category of existing influencer in database')])"));
			WebElement Overwritterlogo = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[12]"));
			
			if (Filter2.isDisplayed() && Overwritterlabel.isDisplayed() && Overwritterlogo.isDisplayed() ) {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are displayed");
			} else {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are not displayed");
			}
			Thread.sleep(3000);


//Add New Influenser Rule UI Components
			WebElement AddNewInflButtonIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[2]"));
			WebElement AddNewInflButtonLabel = driver.findElement(By.xpath("(//span[contains(text(),'Add New Influencer Rule')])"));
			if (AddNewInflButtonIcon.isDisplayed() && AddNewInflButtonLabel.isDisplayed() ) {
			System.out.println("Add New Influenser Rule UI Components are displayed");
			} else {
			System.out.println("Add New Influenser Rule UI Components are not displayed");
			}
			js.executeScript("arguments[0].click()", AddNewInflButtonLabel);
			Thread.sleep(3000);
//Heading
			WebElement CreateNewInfRuleHeading = driver.findElement(By.xpath("(//h3[contains(@class,'modal__title')])"));
			WebElement arrowback2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if (CreateNewInfRuleHeading.isDisplayed() && arrowback2.isDisplayed()) {
			System.out.println("Create New Influencer Rule Window Heading is displayed");
			} else {
			System.out.println("Create New Influencer Rule Window Heading is not displayed");
			}
			Thread.sleep(3000);

//Rule Name Field 
			WebElement Rulenamelabel = driver.findElement(By.xpath("(//p[contains(text(),'Rule Name')])"));
			WebElement RulenameInfo = driver.findElement(By.xpath("(//p[contains(text(),'Rule Name')])//following::p[1]"));
			WebElement RulenameTxbx = driver.findElement(By.xpath("(//mat-label[contains(text(),'Rule Name')])"));
			if (Rulenamelabel.isDisplayed() && RulenameInfo.isDisplayed() && RulenameTxbx.isDisplayed()) {
			System.out.println("Rule Name Field  is displayed");
			} else {
			System.out.println("Rule Name Field  is not displayed");
			}
			Thread.sleep(3000);

//Select Category to Tag
			WebElement SelectLabel = driver.
			findElement(By.xpath("(//p[contains(text(),'Select an Influencer category to tag these twitter users ')])"));
			WebElement Txbx = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			WebElement Drpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
			if (SelectLabel.isDisplayed() && Txbx.isDisplayed() && Drpdwn.isDisplayed()) {
			System.out.println("Select Category to Tag Field is displayed");
			} else {
			System.out.println("Select Category to Tag Field is not displayed");
			}
			Thread.sleep(3000);

// Create New Influenser rule Field
			WebElement CreateLabel = driver.findElement(By.xpath("(//p[contains(text(),'Create New Influencer Rules')])"));
			WebElement Createinfo = driver.findElement(By.xpath("(//p[contains(text(),'Create New Influencer Rules')])//following::p[1]"));
			WebElement AddGroup = driver.findElement(By.xpath("(//span[contains(text(),' + Add Group ')])"));
			WebElement Addattribute = driver.findElement(By.xpath("(//a[contains(text(),'+ Add Attribute')])"));
			if (CreateLabel.isDisplayed() && Createinfo.isDisplayed() && AddGroup.isDisplayed()  && Addattribute.isDisplayed()) {
			System.out.println("Create New Influenser rule Field is displayed");
			} else {
			System.out.println("Create New Influenser rule Field is not displayed");
			}
			Thread.sleep(3000);

//Query Preview
			WebElement Label = driver.findElement(By.xpath("(//p[contains(text(),'Query Preview')])[1]"));
			WebElement info = driver.findElement(By.xpath("(//p[contains(text(),'Query Preview')])//following::p[1]"));
			WebElement CopyQuery = driver.findElement(By.xpath("(//span[contains(text(),'Copy Query')])"));
			WebElement Querylength = driver.findElement(By.xpath("(//span[contains(text(),'Query length')])"));
			if (Label.isDisplayed() && info.isDisplayed() && CopyQuery.isDisplayed()  && Querylength.isDisplayed()) {
			System.out.println("Query Preview is displayed");
			} else {
			System.out.println("Query Preview is not  displayed");
			}
			Thread.sleep(3000);
			
// Cancel & Save Button
			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]"));
			WebElement CancelButton = driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])[1]"));
			if (saveButton.isDisplayed() && CancelButton.isDisplayed()) {
			System.out.println("Cancel & Save Button is displayed");
			} else {
			System.out.println("Cancel & Save Button is not displayed");
			}
			WebElement arrowBack3 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			js.executeScript("arguments[0].click()", arrowBack3);
			Thread.sleep(3000);

			
			
//Switching back to Influencer Configuration tab
			WebElement pushpin3 = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement ICTab3 = driver.findElement(By.xpath("(//span[contains(text(),'Influencer Configuration')])[2]"));
			if (pushpin3.isDisplayed() && ICTab3.isDisplayed()) {
			System.out.println("Influenser Configuration 1st Tab is displayed");
			} else {
			System.out.println("Influenser Configuration 1st Tab is not displayed");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", ICTab3);
			Thread.sleep(10000);
			
//Delete/Edit Added Screen Name
			WebElement Edit1=driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			js.executeScript("arguments[0].click()", Edit1);
		    Thread.sleep(5000);
		    WebElement SelectCatgedit = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			js.executeScript("arguments[0].click()", SelectCatgedit);
			Thread.sleep(3000);
			WebElement Automobileedit = driver.findElement(By.xpath("(//span[contains(text(),' Automation Demo')])[1]"));
			js.executeScript("arguments[0].click()", Automobileedit);
			Thread.sleep(3000);
			WebElement Saveedit=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			js.executeScript("arguments[0].click()", Saveedit);
			Thread.sleep(3000);
			WebElement Edit2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			js.executeScript("arguments[0].click()", Edit2);
		    Thread.sleep(5000);
		    WebElement SelectCatgedit1 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			js.executeScript("arguments[0].click()", SelectCatgedit1);
			Thread.sleep(3000);
			WebElement Automobileedit1 = driver.findElement(By.xpath("(//span[contains(text(),'Automobile')])[1]"));
			js.executeScript("arguments[0].click()", Automobileedit1);
			Thread.sleep(3000);
			WebElement Cancel=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])"));
			js.executeScript("arguments[0].click()", Cancel);
			Thread.sleep(3000);
			
//Delete & Edit  Created Category:
			WebElement CreateNewCat2 = driver.findElement(By.xpath("(//span[contains(text(),'Create New Category')])"));
			js.executeScript("arguments[0].click()", CreateNewCat2);
			Thread.sleep(3000);
			WebElement searchcatg2 = driver.findElement(By.xpath("//input[@data-placeholder='Search Category']"));
			js.executeScript("arguments[0].click()", searchcatg2);
			Actions actions32 = new Actions(driver);
			Action action32 = actions32.sendKeys(searchcatg2, "Automation Demo").sendKeys(Keys.ENTER).build();
	        action32.perform();
			Thread.sleep(5000);
			WebElement EditCateg = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[12]"));
			js.executeScript("arguments[0].click()", EditCateg);
			Thread.sleep(3000);
			WebElement EditCategnew = driver.findElement(By.xpath("(//input[@data-placeholder='Type Category Name'])"));
			js.executeScript("arguments[0].click()", EditCategnew);
			Thread.sleep(3000);
		    Actions actions37 = new Actions(driver);
			Action action37 = actions37.sendKeys(EditCategnew, "Catg").build();
	        action37.perform();
			Thread.sleep(5000);
			WebElement savenewcatg = driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			js.executeScript("arguments[0].click()", savenewcatg);
			Thread.sleep(3000);
			WebElement close = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[1]"));
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(3000);
			WebElement CreateNewCat3 = driver.findElement(By.xpath("(//span[contains(text(),'Create New Category')])"));
			js.executeScript("arguments[0].click()", CreateNewCat3);
			Thread.sleep(3000);
			WebElement searchcatg3 = driver.findElement(By.xpath("//input[@data-placeholder='Search Category']"));
			js.executeScript("arguments[0].click()", searchcatg3);
			Actions actions33 = new Actions(driver);
			Action action33 = actions33.sendKeys(searchcatg3, "Automation DemoCatg").sendKeys(Keys.ENTER).build();
	        action33.perform();
			Thread.sleep(5000);
			WebElement DeleteCreateNewCat2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[12]"));
			js.executeScript("arguments[0].click()", DeleteCreateNewCat2);
			Thread.sleep(3000);
			WebElement tag = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			js.executeScript("arguments[0].click()", tag);
			Thread.sleep(3000);
			WebElement tagname = driver.findElement(By.xpath("(//span[contains(text(),' Telecom')])"));
			js.executeScript("arguments[0].click()", tagname);
			Thread.sleep(3000);
			WebElement DeleteCreateNewCat2Confirm = driver.findElement(By.xpath("(//span[contains(text(),'Delete')])"));
			js.executeScript("arguments[0].click()", DeleteCreateNewCat2Confirm);
			Thread.sleep(5000);
		    WebElement Delete1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[3]"));
			js.executeScript("arguments[0].click()", Delete1);
			Thread.sleep(3000);
			WebElement DeleteConfirm1 = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", DeleteConfirm1);
			Thread.sleep(3000);
			WebElement Delete2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline ')])[2]"));
			js.executeScript("arguments[0].click()", Delete2);
			Thread.sleep(3000);
			WebElement DeleteConfirm2 = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", DeleteConfirm2);
			Thread.sleep(3000);
			WebElement Delete3 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline ')])[1]"));
			js.executeScript("arguments[0].click()", Delete3);
			Thread.sleep(3000);
			WebElement DeleteConfirm3 = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", DeleteConfirm3);
			Thread.sleep(3000);
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}



