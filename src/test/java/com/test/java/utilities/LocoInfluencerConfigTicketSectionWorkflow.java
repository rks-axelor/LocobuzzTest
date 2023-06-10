package com.test.java.utilities;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocoInfluencerConfigTicketSectionWorkflow {

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
			Action actionc = actionsc.sendKeys(SearchbyScrNm, "Komal87224405").sendKeys(Keys.ENTER).build();
	        actionc.perform();
	        Thread.sleep(3000);
	        SearchbyScrNm.clear();
			Thread.sleep(3000);
			WebElement symbol2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", symbol2);
			Thread.sleep(3000);
			
	        

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
    

//Add Influencer Window UI components			
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
			Action actionk = actionsk.sendKeys(TwScreenField1, "Komal87224405").sendKeys(Keys.ENTER).build();
	        actionk.perform();
	        Thread.sleep(3000);
	        WebElement SelectCatg = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			js.executeScript("arguments[0].click()", SelectCatg);
			Thread.sleep(3000);
			WebElement Automobile = driver.findElement(By.xpath("(//span[contains(text(),' Automation Demo')])[1]"));
			js.executeScript("arguments[0].click()", Automobile);
			Thread.sleep(3000);
			
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
			WebElement symbol3 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			if (searchField2.isDisplayed() && SearchbyRule.isDisplayed() && symbol3.isDisplayed()) {
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
			js.executeScript("arguments[0].click()", Overwritterlabel);
			Thread.sleep(3000);
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
			
			
	        
//Add Attribute
			WebElement attribute = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[1]"));
			js.executeScript("arguments[0].click()", attribute);
			Thread.sleep(1000);
			//WebElement Attr2 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Attribute')])[1]"));
			//js.executeScript("arguments[0].click()", Attr2);
			//Thread.sleep(1000);
			WebElement TwContent = driver.findElement(By.xpath("(//span[contains(text(),'Twitter Followers Count')])[2]"));
			TwContent.click();
			Thread.sleep(3000);
			WebElement Value = driver.findElement(By.xpath("(//mat-label[contains(text(),'Value')])[1]"));
			js.executeScript("arguments[0].click()", Value);
			Thread.sleep(1000);
			Actions actions32 = new Actions(driver);
			Action action32 = actions32.sendKeys(Value, "4").sendKeys(Keys.ENTER).build();
	        action32.perform();
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
			
//Titan Brand Settings
			WebElement SelectTitan = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-')])[1]"));
			js.executeScript("arguments[0].click()", SelectTitan);
			Thread.sleep(5000);
			WebElement searchTitan = driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", searchTitan);
			Thread.sleep(5000);
			WebElement SearchbyScrNmtitan = driver.findElement(By.xpath("//input[@placeholder='Search by Screen Name']"));
			js.executeScript("arguments[0].click()", SearchbyScrNmtitan);
			Thread.sleep(3000);
			Actions actionst1 = new Actions(driver);
			Action actiont1 = actionst1.sendKeys(SearchbyScrNmtitan, "Komal87224405").sendKeys(Keys.ENTER).build();
	        actiont1.perform();
	        Thread.sleep(30000);
			WebElement TitanICTab2 = driver.findElement(By.xpath("(//span[contains(text(),'Influencer Rules')])[1]"));
			js.executeScript("arguments[0].click()", TitanICTab2);
			Thread.sleep(5000);
			WebElement TitanICTab3 = driver.findElement(By.xpath("(//span[contains(text(),'Influencer Configuration')])[2]"));
			js.executeScript("arguments[0].click()", TitanICTab3);
			Thread.sleep(4000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			goingtwitteraccount(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
public static void goingtwitteraccount(WebDriver driver) throws Exception {
try {
	((JavascriptExecutor)driver).executeScript("window.open()");
    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));	
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.get("https://twitter.com/");
	Thread.sleep(5000);
//Login
	WebElement signUp = driver.findElement(By.xpath("(//span[contains(text(),'Sign up')])[1]"));
	signUp.click();
	Thread.sleep(3000);
	WebElement signUp2 = driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]"));
	js.executeScript("arguments[0].click()", signUp2);
	Thread.sleep(5000);
	WebElement username = driver.findElement(By.name("text"));
	username.sendKeys("@Komal87224405");
	Thread.sleep(3000);
	WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	next.click();
	Thread.sleep(1000);
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("Loco@123");
	Thread.sleep(1000);
	WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
	login.click();
	Thread.sleep(4000);
	System.out.println("Tweet Login Successful");

				

//Tweet		
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
	String strDate = formatter.format(date);

	WebElement whatHappening = driver.findElement(By.xpath("//div[@data-testid='tweetTextarea_0']"));
	js.executeScript("arguments[0].click()", whatHappening);
	String twitterDynamicMessage = "@Komal25169281   twitter test" + " " + strDate;
	whatHappening.sendKeys(twitterDynamicMessage);
	Thread.sleep(1000);

	WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
	js.executeScript("arguments[0].click()", tweetButton);
	Thread.sleep(4000);
	System.out.println("Tweet posted Successfully");
	//driver.close();
	Thread.sleep(5000);
	driver.switchTo().window(tabs.get(0));
	gotoallmensionstab(driver);

}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void gotoallmensionstab(WebDriver driver) throws Exception {
try {
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(2000);
	
    WebElement allmentions = driver.findElement(By.xpath("(//span[contains(text(),'All Mention')])[1]"));
	allmentions.click();
	Thread.sleep(5000);

//useractivity

	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement useractivity = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'User Activity ')]")));			
	Thread.sleep(3000);
	WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[2]"));
	js.executeScript("arguments[0].click()", Brandselect);
	Thread.sleep(3000);
	WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
	js.executeScript("arguments[0].click()", Selectbrand);
	WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Auto Demo')]"));
	js.executeScript("arguments[0].click()", Selectbrand1);
	WebElement Selectbrand2 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Titan')]"));
	js.executeScript("arguments[0].click()", Selectbrand2);
	WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[3]"));
	js.executeScript("arguments[0].click()", Apply);
	
//Searching and deleting ticket from locobuzz
	WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
	js.executeScript("arguments[0].click()", search);
	Thread.sleep(10000);
	WebElement inputbox = driver.findElement(By.id("post-search-input"));
	inputbox.sendKeys("komal");
	Thread.sleep(4000);
	js.executeScript("arguments[0].click()", search);
	Thread.sleep(10000);
	WebElement fbticket1=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
	js.executeScript("arguments[0].click()", fbticket1);
	Thread.sleep(3000);
	WebElement deletefb = driver.findElement(By.xpath("//span[contains(text(),'Mark Influencer')]"));
	js.executeScript("arguments[0].click()", deletefb);
	Thread.sleep(3000);
	WebElement yesfb = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[4]"));
	js.executeScript("arguments[0].click()", yesfb);
	Thread.sleep(3000);
	WebElement twticket1=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
	js.executeScript("arguments[0].click()", twticket1);
	Thread.sleep(3000);
	WebElement deletetw = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
	js.executeScript("arguments[0].click()", deletetw);
	Thread.sleep(3000);
	WebElement yestw = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
	js.executeScript("arguments[0].click()", yestw);
	Thread.sleep(3000);
	WebElement fbtickettitan=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
	js.executeScript("arguments[0].click()", fbtickettitan);
	Thread.sleep(3000);
	WebElement deletefbtitan = driver.findElement(By.xpath("//span[contains(text(),'Mark Influencer')]"));
	js.executeScript("arguments[0].click()", deletefbtitan);
	Thread.sleep(3000);
	WebElement titanyes = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[4]"));
	js.executeScript("arguments[0].click()", titanyes);
	Thread.sleep(3000);
	WebElement twtickettitan=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
	js.executeScript("arguments[0].click()", twtickettitan);
	Thread.sleep(3000);
	WebElement deletetitan = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
	js.executeScript("arguments[0].click()", deletetitan);
	Thread.sleep(3000);
	WebElement yestitan = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
	js.executeScript("arguments[0].click()", yestitan);
	Thread.sleep(3000);
	goingAccountSession(driver);
	Thread.sleep(3000);
	VerifyInfluencerconfiguration(driver);
	Thread.sleep(3000);
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void VerifyInfluencerconfiguration(WebDriver driver) throws Exception {
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
			Action actionc = actionsc.sendKeys(SearchbyScrNm, "Komal87224405").sendKeys(Keys.ENTER).build();
	        actionc.perform();
	        Thread.sleep(3000);
	        SearchbyScrNm.clear();
			Thread.sleep(3000);
//Delete Screen name			
			WebElement deletescreenname = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[1]"));
			js.executeScript("arguments[0].click()", deletescreenname);
			Thread.sleep(3000);
			WebElement deletescreennameconfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", deletescreennameconfirm);
			Thread.sleep(3000);
//Delete Influencer Rule
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
			WebElement Filter2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' filter_alt')])[2]"));
			WebElement Overwritterlabel = driver.
			findElement(By.xpath("(//span[contains(text(),'Overwrite rule-based category of existing influencer in database')])"));
			WebElement Overwritterlogo = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[12]"));
			
			if (Filter2.isDisplayed() && Overwritterlabel.isDisplayed() && Overwritterlogo.isDisplayed() ) {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are displayed");
			} else {
			System.out.println("Filter,CreateCat,Import History ,Add New Influenser Buttons are not displayed");
			}
			js.executeScript("arguments[0].click()", Overwritterlabel);
			Thread.sleep(3000);
			Thread.sleep(3000);
			WebElement deleteInflrulename = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[11]"));
			js.executeScript("arguments[0].click()", deleteInflrulename);
			Thread.sleep(3000);
			WebElement deleteInflrulenameconfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", deleteInflrulenameconfirm);
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
			WebElement CreateNewCat3 = driver.findElement(By.xpath("(//span[contains(text(),'Create New Category')])"));
			js.executeScript("arguments[0].click()", CreateNewCat3);
			Thread.sleep(3000);
			WebElement searchcatg3 = driver.findElement(By.xpath("//input[@data-placeholder='Search Category']"));
			js.executeScript("arguments[0].click()", searchcatg3);
			Actions actions33 = new Actions(driver);
			Action action33 = actions33.sendKeys(searchcatg3, "Automation Demo").sendKeys(Keys.ENTER).build();
	        action33.perform();
			Thread.sleep(5000);
			WebElement DeleteCreateNewCat2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[12]"));
			js.executeScript("arguments[0].click()", DeleteCreateNewCat2);
			Thread.sleep(3000);
			WebElement deleteInflrulenameconfirmtitan = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", deleteInflrulenameconfirmtitan);
			Thread.sleep(3000);
			WebElement close = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[1]"));
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(3000);
//Verify Titan Brand Update Category
			WebElement SelectTitan = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-')])[1]"));
			js.executeScript("arguments[0].click()", SelectTitan);
			Thread.sleep(5000);
			WebElement searchTitan = driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", searchTitan);
			Thread.sleep(1000);
			WebElement SearchbyScrNmtitan = driver.findElement(By.xpath("//input[@placeholder='Search by Screen Name']"));
			js.executeScript("arguments[0].click()", SearchbyScrNmtitan);
			Thread.sleep(3000);
			Actions actionst = new Actions(driver);
			Action actiont = actionst.sendKeys(SearchbyScrNmtitan, "Komal87224405").sendKeys(Keys.ENTER).build();
	        actiont.perform();
	        Thread.sleep(30000);
	        WebElement Edit1=driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			js.executeScript("arguments[0].click()", Edit1);
		    Thread.sleep(5000);
		    WebElement SelectCatgedit = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category')])"));
			js.executeScript("arguments[0].click()", SelectCatgedit);
			Thread.sleep(3000);
			WebElement Automobileedit = driver.findElement(By.xpath("(//span[contains(text(),'Cartoonist')])[1]"));
			js.executeScript("arguments[0].click()", Automobileedit);
			Thread.sleep(3000);
			WebElement Saveedit=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			js.executeScript("arguments[0].click()", Saveedit);
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



