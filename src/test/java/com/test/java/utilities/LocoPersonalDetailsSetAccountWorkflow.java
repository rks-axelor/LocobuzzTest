package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoPersonalDetailsSetAccountWorkflow {
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
	
public static void PersonalDetailsSettingsUIVerification(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Response Management
			WebElement responsemngt=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Response Management')])[1]"));
			js.executeScript("arguments[0].click()", responsemngt);
			Thread.sleep(3000);
			
//Personal Details Settings  Label in Account Section
			WebElement PersonalLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Personal_Details_Settings.svg']"));
			WebElement Personallabel=driver.findElement(By.xpath("(//span[contains(text(),'Personal Details Settings')])"));
			js.executeScript("arguments[0].click()", Personallabel);
			Thread.sleep(3000);
			
//Personal Details Settings tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement Personaltab=driver.findElement(By.xpath("(//span[contains(text(),'Personal Details Settings')])[2]"));
			if(pushpin.isDisplayed()&&Personaltab.isDisplayed()) 
			System.out.println("Personal Details Settings tab is displayed");
			else 
			System.out.println("Personal Details Settings tab is not displayed");
			Thread.sleep(3000);
			
//Personal Details Settings Heading and Information	
            WebElement PDSHeading=driver.findElement(By.xpath("(//p[contains(text(),'Personal Details Settings')])[1]"));
			WebElement PDSInformation=driver.findElement(By.xpath("(//p[contains(text(),'Personal Details Settings')])//following::p[1]"));
			if(PDSHeading.isDisplayed()&&PDSInformation.isDisplayed()) 
			System.out.println("Personal Details Settings Heading and Information is displayed");
			else 
			System.out.println("Personal Details Settings Heading and Information is not displayed");
			Thread.sleep(3000);

//Select Category Field
			WebElement selectCatHead=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category Group')])"));
			WebElement selectCatTxbx=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[2]"));
			WebElement selectCatDrpdn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
			if(selectCatHead.isDisplayed() && selectCatTxbx.isDisplayed() && selectCatDrpdn.isDisplayed()) 
			System.out.println("Select Category Field is present");
			else 
			System.out.println("Select Category Field is not present");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", selectCatDrpdn);
			Thread.sleep(3000);
			WebElement default2=driver.findElement(By.xpath("(//span[contains(text(),'Default2')])"));
			js.executeScript("arguments[0].click()", default2);
			Thread.sleep(3000);

//Search by Field Name Field	
            WebElement Searchbyfieldtx=driver.findElement(By.xpath("//input[@placeholder='Search by Field Name']"));
			WebElement Searchsymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(Searchbyfieldtx.isDisplayed() && Searchsymbol.isDisplayed()) 
			System.out.println("Search by Field Name Field is displayed");
			else 
			System.out.println("Search by Field Name Field is not displayed");
			Searchbyfieldtx.sendKeys("Kdemo");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Searchsymbol);
			Thread.sleep(3000);

//Add New Field Label and Icon 	
            WebElement Addicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])"));
			WebElement Addlabel=driver.findElement(By.xpath("(//span[contains(text(),'Add New Field')])[1]"));
			js.executeScript("arguments[0].click()", Addicon);
			Thread.sleep(5000);
			

// Add New Field Heading
			WebElement Addnewheading=driver.findElement(By.xpath("//h3[contains(text(),'Add New Field')]"));
			WebElement crossbutton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if(Addnewheading.isDisplayed() && crossbutton.isDisplayed()) 
			System.out.println("Add New Field Heading is displayed");
			else 
			System.out.println("Add New Field Heading is not displayed");
			Thread.sleep(3000);
			
//Field Type Textbox Field
			WebElement Fieldtypeheading=driver.findElement(By.xpath("(//mat-label[contains(text(),'Field Type')])"));
			WebElement Fieldtypetxbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[4]"));
			WebElement drpdwn=driver.findElement(By.xpath("(//span[contains(text(),'Contact Number')])"));
			js.executeScript("arguments[0].click()", drpdwn);
			Thread.sleep(3000);
			WebElement selfieldtype=driver.findElement(By.xpath("(//mat-option[contains(@class,'mat-option mat')])[4]"));
			js.executeScript("arguments[0].click()", selfieldtype);
			Thread.sleep(3000);
			
			
// Enter a Field name 
			WebElement enterfieldname=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[6]"));
			WebElement fieldnamemust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[43]"));
			if(enterfieldname.isDisplayed()&&fieldnamemust.isDisplayed()) 
			System.out.println("Enter a Field name is Present");
			else 
			System.out.println("Enter a Field name is not Present");
			Actions actions = new Actions(driver);
	        Action action = actions.sendKeys(enterfieldname, "Kdemo Text Demo").build();
	        action.perform();
	        Thread.sleep(3000);

//Character Limit Textbox			
			WebElement charlimitheading=driver.findElement(By.xpath("(//mat-label[contains(text(),'Character Limit')])"));
			WebElement charlimittxbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[7]"));
			WebElement drpdwnm=driver.findElement(By.xpath("(//mat-icon[contains(text(),' keyboard_arrow_up')])"));
			WebElement note=driver.findElement(By.xpath("(//p[contains(@class,'text__light--sm mt-')])"));
			if(charlimitheading.isDisplayed()&&charlimittxbx.isDisplayed()&&drpdwnm.isDisplayed()&&note.isDisplayed()) 
			System.out.println("Character Limit Textbox	is Present");
			else 
			System.out.println("Character Limit Textbox	is not Present");
			Actions actions1 = new Actions(driver);
	        Action action1 = actions1.sendKeys(charlimittxbx, "30").build();
	        action1.perform();
	        Thread.sleep(3000);
			
//Enable Auto Detect to Autofill Personal Details Fieild
			WebElement Checkbox=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])"));
			WebElement info=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-label')])"));
			if(Checkbox.isDisplayed()&&info.isDisplayed()) 
			System.out.println("Enable Auto Detect to Autofill Personal Details Fieild is Present");
			else 
			System.out.println("Enable Auto Detect to Autofill Personal Details Fieild is not Present");
			Thread.sleep(3000);

//Enter Regular Expression
			WebElement Heading =driver.findElement(By.xpath("(//p[contains(text(),'Enter the regular')])"));
			WebElement Textbox=driver.findElement(By.xpath("(//input[@placeholder='Enter the Regular Expression'])"));
			if(Heading.isDisplayed()&&Textbox.isDisplayed()) 
			System.out.println("Create Super rules heading and information is displayed");
			else 
			System.out.println("Create Super rules heading and information is not displayed");
			Textbox.sendKeys("[A-Z]{5}[0-9]{4}[A-Z]{1}");
			Thread.sleep(3000);	
			
//Add New Field
			WebElement Label=driver.findElement(By.xpath("(//span[contains(text(),'+Add New Field')])"));
			if(Label.isDisplayed()) 
			System.out.println("Add New Field is displayed");
			else 
			System.out.println("Add New Field is not displayed");
			Thread.sleep(3000);	
		    js.executeScript("arguments[0].click()", Label);
			Thread.sleep(5000); 

//Field Type Textbox Field
		    WebElement drpdwn2=driver.findElement(By.xpath("(//span[contains(text(),'Contact Number')])"));
			js.executeScript("arguments[0].click()", drpdwn2);
			Thread.sleep(3000);
			WebElement selfieldtype1=driver.findElement(By.xpath("(//mat-option[contains(@class,'mat-option mat')])[3]"));
			js.executeScript("arguments[0].click()", selfieldtype1);
			Thread.sleep(3000);
			
// Enter a Field name 
			WebElement enterfieldname2=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[10]"));
			Actions actions2 = new Actions(driver);
	        Action action2 = actions2.sendKeys(enterfieldname2, "Kdemo contact number Demo").build();
	        action2.perform();
	        Thread.sleep(3000);

//Character Limit Textbox			
	        WebElement charlimittxbx1=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[11]"));
			Actions actions3 = new Actions(driver);
	        Action action3 = actions3.sendKeys(charlimittxbx1, "10").build();
	        action3.perform();
	        Thread.sleep(3000);
	        WebElement Checkbox2=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[2]"));
			js.executeScript("arguments[0].click()", Checkbox2);
			Thread.sleep(3000);
//Checking Delete Functionality of add new field
//Add New Field
			WebElement Labela=driver.findElement(By.xpath("(//span[contains(text(),'+Add New Field')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Labela);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Labela);
			Thread.sleep(5000); 
			WebElement delete=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])[2]"));
			js.executeScript("arguments[0].click()", delete);
		    Thread.sleep(5000); 
	        
//Save all  set Details
			WebElement Savefield=driver.findElement(By.xpath("(//span[contains(text(),' Save Field ')])"));
			js.executeScript("arguments[0].click()", Savefield);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Searchsymbol);
			Thread.sleep(3000);
			
//Edit Old Details			
			WebElement edit=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			js.executeScript("arguments[0].click()", edit);
			Thread.sleep(3000);
			WebElement Checkbox1=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])"));
			js.executeScript("arguments[0].click()", Checkbox1);
			Thread.sleep(3000);

//How Character Limit help to identify details
		    WebElement Characterlimitlink=driver.findElement(By.xpath("(//p[contains(text(),'How character limit')])"));
			if(Characterlimitlink.isDisplayed()) 
			System.out.println("How Character Limit help to identify details is displayed");
			else 
			System.out.println("How Character Limit help to identify details is not displayed");
			js.executeScript("arguments[0].click()", Characterlimitlink);
			Thread.sleep(5000);          			  
			WebElement close=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(5000); 
			WebElement Savefield2=driver.findElement(By.xpath("(//span[contains(text(),' Save Field ')])"));
			js.executeScript("arguments[0].click()", Savefield2);
			Thread.sleep(3000);
			
//Edit Second Field Details
			WebElement edit2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			js.executeScript("arguments[0].click()", edit2);
			Thread.sleep(3000);
			WebElement Textbox2=driver.findElement(By.xpath("(//input[@placeholder='Enter the Regular Expression'])"));
			Textbox2.sendKeys("PHNO");
			Thread.sleep(3000);	
			WebElement Savefield3=driver.findElement(By.xpath("(//span[contains(text(),' Save Field ')])"));
			js.executeScript("arguments[0].click()", Savefield3);
			Thread.sleep(3000);
			WebElement includefilter=driver.findElement(By.xpath("(//mat-icon[contains(text(),' brightness_1')])[1]"));
			js.executeScript("arguments[0].click()", includefilter);
			Thread.sleep(3000);

//Delete all Personal Details Field
			WebElement delete1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[1]"));
			js.executeScript("arguments[0].click()", delete1);
			Thread.sleep(3000);
			WebElement confirmdelete1=driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[2]"));
			js.executeScript("arguments[0].click()", confirmdelete1);
			Thread.sleep(5000);
			WebElement delete2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[1]"));
			js.executeScript("arguments[0].click()", delete2);
			Thread.sleep(3000);
			WebElement confirmdelete2=driver.findElement(By.xpath(" (//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", confirmdelete2);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Searchsymbol);
			Thread.sleep(3000);
			
//click on arrow back
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}




