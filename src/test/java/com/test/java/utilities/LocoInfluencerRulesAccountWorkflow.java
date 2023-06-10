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

public class LocoInfluencerRulesAccountWorkflow {

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

public static void verifyingInfluenserRulesFunction(WebDriver driver) throws Exception {
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
			

//Influencer Rule 2nd Tab
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
			Actions actionskk = new Actions(driver);
			Action actionkk = actionskk.sendKeys(SearchbyRule, "Infudemo rule 2").sendKeys(Keys.ENTER).build();
	        actionkk.perform();
	        Thread.sleep(3000);
	        SearchbyRule.clear();
	        Thread.sleep(3000);
	        Actions actionsk2 = new Actions(driver);
			Action actionk2 = actionsk2.sendKeys(SearchbyRule, "rule 1").sendKeys(Keys.ENTER).build();
	        actionk2.perform();
	        Thread.sleep(3000);
	        SearchbyRule.clear();
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


//Add New Influencer Rule UI Components
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
			Actions actionsk1 = new Actions(driver);
			Action actionk1 = actionsk1.sendKeys(SearchbyRule, "Infudemo rule 2").sendKeys(Keys.ENTER).build();
	        actionk1.perform();
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
			js.executeScript("arguments[0].click()", Drpdwn);
			Thread.sleep(3000);
			WebElement Cat1 = driver.findElement(By.xpath("(//span[contains(text(),' Content Creator')])"));
			js.executeScript("arguments[0].click()", Cat1);
			Thread.sleep(3000);
		
// Create New Influencer rule Field
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
			WebElement OR = driver.findElement(By.xpath("(//span[contains(text(),'OR')])[1]"));
			js.executeScript("arguments[0].click()", OR);
			Thread.sleep(1000);
			WebElement AND = driver.findElement(By.xpath("(//span[contains(text(),'AND')])[3]"));
			js.executeScript("arguments[0].click()", AND);
			Thread.sleep(1000);
			WebElement attribute = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[1]"));
			js.executeScript("arguments[0].click()", attribute);
			Thread.sleep(1000);
			WebElement attribute1 = driver.findElement(By.xpath("(//span[contains(text(),' Verified User ')])[1]"));
			js.executeScript("arguments[0].click()", attribute1);
			Thread.sleep(1000);
			WebElement Verified = driver.findElement(By.xpath("(//span[contains(text(),'False')])[1]"));
			js.executeScript("arguments[0].click()", Verified);
			Thread.sleep(1000);
//Add Attribute
			WebElement addattribute = driver.findElement(By.xpath("(//a[contains(text(),'+ Add Attribute')])[1]"));
			js.executeScript("arguments[0].click()", addattribute);
			Thread.sleep(1000);
			WebElement Attr1 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[2]"));
			js.executeScript("arguments[0].click()", Attr1);
			Thread.sleep(1000);
			WebElement Biocontent = driver.findElement(By.xpath("(//span[contains(text(),'Bio Content')])[1]"));
			js.executeScript("arguments[0].click()", Biocontent);
			Thread.sleep(1000);
			WebElement Keyword = driver.findElement(By.xpath("(//input[@placeholder='New keyword...'])[1]"));
			js.executeScript("arguments[0].click()", Keyword);
			Thread.sleep(1000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keyword, "True").sendKeys(Keys.ENTER).build();
	        action.perform();
	        Thread.sleep(3000);
			WebElement Keyword2 = driver.findElement(By.xpath("(//input[@placeholder='New keyword...'])[1]"));
			js.executeScript("arguments[0].click()", Keyword2);
			Thread.sleep(1000);
			Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(Keyword2, "False").sendKeys(Keys.ENTER).build();
	        action2.perform();
	        Thread.sleep(3000);
	        
//Add Attribute
			WebElement addattribute2 = driver.findElement(By.xpath("(//a[contains(text(),'+ Add Attribute')])[1]"));
			js.executeScript("arguments[0].click()", addattribute2);
			Thread.sleep(1000);
			WebElement Attr2 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[3]"));
			js.executeScript("arguments[0].click()", Attr2);
			Thread.sleep(1000);
			WebElement TwContent = driver.findElement(By.xpath("(//span[contains(text(),'Twitter Followers Count')])[1]"));
			js.executeScript("arguments[0].click()", TwContent);
			Thread.sleep(1000);
			WebElement Value = driver.findElement(By.xpath("(//mat-label[contains(text(),'Value')])[1]"));
			js.executeScript("arguments[0].click()", Value);
			Thread.sleep(1000);
			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(Value, "4").sendKeys(Keys.ENTER).build();
	        action3.perform();
	        Thread.sleep(3000);
	        
//Add Attribute
			WebElement addattribute4 = driver.findElement(By.xpath("(//a[contains(text(),'+ Add Attribute')])[1]"));
			js.executeScript("arguments[0].click()", addattribute4);
			Thread.sleep(1000);
			WebElement Attr4 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[4]"));
			js.executeScript("arguments[0].click()", Attr4);
			Thread.sleep(1000);
			WebElement Biocontent2 = driver.findElement(By.xpath("(//span[contains(text(),'Bio Content')])[2]"));
			js.executeScript("arguments[0].click()", Biocontent2);
			Thread.sleep(1000);
			WebElement Keyword4 = driver.findElement(By.xpath("(//input[@placeholder='New keyword...'])[2]"));
			js.executeScript("arguments[0].click()", Keyword4);
			Thread.sleep(1000);
			Actions actions4 = new Actions(driver);
			Action action4 = actions4.sendKeys(Keyword4, "Yes").sendKeys(Keys.ENTER).build();
	        action4.perform();
	        Thread.sleep(3000);
			WebElement Keyword6 = driver.findElement(By.xpath("(//input[@placeholder='New keyword...'])[2]"));
			js.executeScript("arguments[0].click()", Keyword6);
			Thread.sleep(1000);
			Actions actions6 = new Actions(driver);
			Action action6 = actions6.sendKeys(Keyword6, "No").sendKeys(Keys.ENTER).build();
	        action6.perform();
	        Thread.sleep(3000);
	        

	        System.out.println("Add Attribute Option Not Displayed:Because all Attributes Used");
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
			js.executeScript("arguments[0].click()", CopyQuery);
			Thread.sleep(3000);
			System.out.println("Query Length is displayed:"+Querylength.getText());
			Thread.sleep(3000);
			
// Cancel & Save Button
			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]"));
			WebElement CancelButton = driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])[1]"));
			if (saveButton.isDisplayed() && CancelButton.isDisplayed()) {
			System.out.println("Cancel & Save Button is displayed");
			} else {
			System.out.println("Cancel & Save Button is not displayed");
			}
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//Edit Rule
			WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[12]"));
			js.executeScript("arguments[0].click()", edit);
			Thread.sleep(3000);
			EditRule(driver);
			Thread.sleep(3000);
			
//Perform Drag and Drop Operation
			   Actions builder = new Actions(driver);
			   WebElement toWebElement = driver.findElement(By.xpath("(//span[contains(text(),'Infudemo rule 2')])[1]"));
		    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", toWebElement);
		        Thread.sleep(2000);
		        WebElement fromWebElement = driver.findElement(By.xpath("(//span[contains(text(),'rule 1')])[1]"));
		        Thread.sleep(2000);
	           
		        builder.clickAndHold(fromWebElement).moveToElement(toWebElement).perform();
		        Thread.sleep(2000);// add 2 sec wait
		        builder.release(toWebElement).build().perform();
		        Thread.sleep(5000);
		       
				 Actions builder2 = new Actions(driver);
				WebElement toWebElement1 = driver.findElement(By.xpath("(//span[contains(text(),'Infudemo rule 2')])[1]"));
			    Thread.sleep(2000);
			    WebElement fromWebElement1 = driver.findElement(By.xpath("(//span[contains(text(),'rule 1')])[1]"));
			    Thread.sleep(2000);
			    builder2.clickAndHold(fromWebElement1).moveToElement(toWebElement1).perform();
		        Thread.sleep(2000);// add 2 sec wait
		        builder2.release(toWebElement1).build().perform();
		        Thread.sleep(2000);
		        
//Filter Functionality
		        WebElement Filter = driver.findElement(By.xpath(" (//mat-icon[contains(text(),'filter_alt')])[2]"));
				js.executeScript("arguments[0].click()", Filter);
				Thread.sleep(3000);
				WebElement AllCatg = driver.findElement(By.xpath(" (//span[contains(text(),'All')])[1]"));
				js.executeScript("arguments[0].click()", AllCatg);
				Thread.sleep(3000);
				WebElement AnchorCatg = driver.findElement(By.xpath(" (//span[contains(text(),' Anchor')])[1]"));
				js.executeScript("arguments[0].click()", AnchorCatg);
				Thread.sleep(3000);
				WebElement Allattr = driver.findElement(By.xpath(" (//span[contains(text(),'All')])[1]"));
				js.executeScript("arguments[0].click()", Allattr);
				Thread.sleep(3000);
				WebElement attributeapp = driver.findElement(By.xpath(" (//span[contains(text(),'Twitter Followers Count')])[1]"));
				js.executeScript("arguments[0].click()", attributeapp);
				Thread.sleep(3000);
				WebElement apply = driver.findElement(By.xpath(" (//span[contains(text(),'Apply')])[1]"));
				js.executeScript("arguments[0].click()", apply);
				Thread.sleep(3000);
				WebElement Filterreset = driver.findElement(By.xpath(" (//mat-icon[contains(text(),'filter_alt')])[2]"));
			    js.executeScript("arguments[0].click()", Filterreset);
				Thread.sleep(3000);
				WebElement reset = driver.findElement(By.xpath(" (//span[contains(text(),'Reset')])[1]"));
				js.executeScript("arguments[0].click()", reset);
				Thread.sleep(3000);
				WebElement apply2 = driver.findElement(By.xpath(" (//span[contains(text(),'Apply')])[1]"));
				js.executeScript("arguments[0].click()", apply2);
				Thread.sleep(3000);
				WebElement Filtercancel = driver.findElement(By.xpath(" (//mat-icon[contains(text(),'filter_alt')])[2]"));
			    js.executeScript("arguments[0].click()", Filtercancel);
				Thread.sleep(3000);
				WebElement reset1 = driver.findElement(By.xpath(" (//span[contains(text(),'All')])[1]"));
				js.executeScript("arguments[0].click()", reset1);
				Thread.sleep(3000);
				WebElement ContentCreator = driver.findElement(By.xpath(" (//span[contains(text(),' Content Creator')])[1]"));
				js.executeScript("arguments[0].click()", ContentCreator);
				Thread.sleep(3000);
				WebElement Cancel = driver.findElement(By.xpath(" (//span[contains(text(),'Cancel')])[1]"));
				js.executeScript("arguments[0].click()", Cancel);
				Thread.sleep(3000);
				
		       
//Delete Rule	
				WebElement delete = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[12]"));
				js.executeScript("arguments[0].click()", delete);
				Thread.sleep(3000);			
				WebElement deleteconfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
				js.executeScript("arguments[0].click()", deleteconfirm);
				Thread.sleep(3000);	
				WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
				js.executeScript("arguments[0].click()", arrowBack1);
				Thread.sleep(3000);	
			
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
public static void EditRule(WebDriver driver) throws Exception {
	try {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Add Attribute
		WebElement addgroup = driver.findElement(By.xpath("//span[contains(text(),'+ Add Group')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addgroup);
        Thread.sleep(2000);
		js.executeScript("arguments[0].click()", addgroup);
		Thread.sleep(1000);
	    WebElement Attr1 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[5]"));
		js.executeScript("arguments[0].click()", Attr1);
		Thread.sleep(1000);
		WebElement attribute1 = driver.findElement(By.xpath("(//span[contains(text(),' Verified User ')])[1]"));
		js.executeScript("arguments[0].click()", attribute1);
		Thread.sleep(1000);
		WebElement Verified = driver.findElement(By.xpath("(//span[contains(text(),'True')])[1]"));
		js.executeScript("arguments[0].click()", Verified);
		Thread.sleep(1000);
        
//Add Attribute
		WebElement addattribute2 = driver.findElement(By.xpath("(//a[contains(text(),'+ Add Attribute')])[1]"));
		js.executeScript("arguments[0].click()", addattribute2);
		Thread.sleep(1000);
		WebElement Attr2 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[6]"));
		js.executeScript("arguments[0].click()", Attr2);
		Thread.sleep(1000);
		WebElement TwContent = driver.findElement(By.xpath("(//span[contains(text(),'Twitter Followers Count')])[2]"));
		js.executeScript("arguments[0].click()", TwContent);
		Thread.sleep(1000);
		WebElement operator = driver.findElement(By.xpath("(//span[contains(text(),'Equal')])[2]"));
		js.executeScript("arguments[0].click()", operator);
		Thread.sleep(1000);
		WebElement equalgr = driver.findElement(By.xpath("(//span[contains(text(),' Greater than or Equal ')])[1]"));
		js.executeScript("arguments[0].click()", equalgr);
		Thread.sleep(1000);
		WebElement value = driver.findElement(By.xpath("(//mat-label[contains(text(),'Value')])[2]"));
		js.executeScript("arguments[0].click()", value);
		Thread.sleep(1000);
		Actions actions3 = new Actions(driver);
		Action action3 = actions3.sendKeys(value, "10").sendKeys(Keys.ENTER).build();
        action3.perform();
        Thread.sleep(3000);
        
//Add Attribute
		/*WebElement addattribute4 = driver.findElement(By.xpath("(//a[contains(text(),'+ Add Attribute')])[1]"));
		js.executeScript("arguments[0].click()", addattribute4);
		Thread.sleep(1000);
		WebElement Attr4 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[7]"));
		js.executeScript("arguments[0].click()", Attr4);
		Thread.sleep(1000);
		WebElement Biocontent2 = driver.findElement(By.xpath("(//span[contains(text(),'Bio Content')])[3]"));
		js.executeScript("arguments[0].click()", Biocontent2);
		Thread.sleep(4000);
		WebElement Keyword4 = driver.findElement(By.xpath("(//input[@placeholder='New keyword...'])[3]"));
		js.executeScript("arguments[0].click()", Keyword4);
		Thread.sleep(1000);
		Actions actions4 = new Actions(driver);
		Action action4 = actions4.sendKeys(Keyword4, "Yes").sendKeys(Keys.ENTER).build();
        action4.perform();
        Thread.sleep(3000);
		WebElement Keyword6 = driver.findElement(By.xpath("(//input[@placeholder='New keyword...'])[3]"));
		js.executeScript("arguments[0].click()", Keyword6);
		Thread.sleep(1000);
		Actions actions6 = new Actions(driver);
		Action action6 = actions6.sendKeys(Keyword6, "No").sendKeys(Keys.ENTER).build();
        action6.perform();
        Thread.sleep(3000);*/
        
//Delete Attribute
        WebElement delete = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[14]"));
		js.executeScript("arguments[0].click()", delete);
		Thread.sleep(3000);
		
// Cancel & Save Button
		WebElement Update = driver.findElement(By.xpath("(//span[contains(text(),'Update')])[1]"));
		js.executeScript("arguments[0].click()", Update);
		Thread.sleep(3000);
		

	} catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
}

}


