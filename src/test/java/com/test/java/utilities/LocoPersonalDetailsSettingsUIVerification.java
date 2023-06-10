package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoPersonalDetailsSettingsUIVerification {
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
			if(responsemngt.isDisplayed()) {
				System.out.println("Response Management is displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", responsemngt);
			Thread.sleep(3000);
			
//Personal Details Settings  Label in Account Section
			WebElement PersonalLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Personal_Details_Settings.svg']"));
			WebElement Personallabel=driver.findElement(By.xpath("(//span[contains(text(),'Personal Details Settings')])"));
			if(PersonalLogo.isDisplayed()&&Personallabel.isDisplayed()) {
				System.out.println("Personal Details Settings  Label in Account Section is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Personal Details Settings  Label in Account Section is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", Personallabel);
			Thread.sleep(3000);
			
//Personal Details Settings tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement Personaltab=driver.findElement(By.xpath("(//span[contains(text(),'Personal Details Settings')])[2]"));
			if(pushpin.isDisplayed()&&Personaltab.isDisplayed()) {
				System.out.println("Personal Details Settings tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Personal Details Settings tab is not displayed");
				componentsInformation.add(2, "Not Present");
				
			}
			Thread.sleep(3000);
			
//Personal Details Settings Heading and Information	

			WebElement PDSHeading=driver.findElement(By.xpath("(//p[contains(text(),'Personal Details Settings')])[1]"));
			WebElement PDSInformation=driver.findElement(By.xpath("(//p[contains(text(),'Personal Details Settings')])//following::p[1]"));
			if(PDSHeading.isDisplayed()&&PDSInformation.isDisplayed()) {
				System.out.println("Personal Details Settings Heading and Information is displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Personal Details Settings Heading and Information is not displayed");
				componentsInformation.add(3, "Not Present");
				
			}
			Thread.sleep(3000);

//Select Category Field
			WebElement selectCatHead=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category Group')])"));
			WebElement selectCatTxbx=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[2]"));
			WebElement selectCatDrpdn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
			if(selectCatHead.isDisplayed() && selectCatTxbx.isDisplayed() && selectCatDrpdn.isDisplayed()) {
				System.out.println("Select Category Field is present");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Select Category Field is not present");
				componentsInformation.add(4, "Not Present");
				
			}
			Thread.sleep(3000);

//Search by Field Name Field	
            WebElement Searchbyfieldtx=driver.findElement(By.xpath("//input[@placeholder='Search by Field Name']"));
			WebElement Searchsymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(Searchbyfieldtx.isDisplayed() && Searchsymbol.isDisplayed()) {
			System.out.println("Search by Field Name Field is displayed");
			componentsInformation.add(5, "Present");
				
			Thread.sleep(3000);
			}
			else {
				System.out.println("Search by Field Name Field is not displayed");
				componentsInformation.add(5, "Not Present");
				
			}
			Thread.sleep(3000);

//Add New Field Label and Icon 	
            WebElement Addicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])"));
			WebElement Addlabel=driver.findElement(By.xpath("(//span[contains(text(),'Add New Field')])[1]"));
			if(Addicon.isDisplayed()&& Addlabel.isDisplayed()) {
				System.out.println("Add New Field Label and Icon is displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Add New Field Label and Icon  is not displayed");
				componentsInformation.add(6, "Not Present");
				
			}
			js.executeScript("arguments[0].click()", Addicon);
			Thread.sleep(5000);
			

// Add New Field Heading
			WebElement Addnewheading=driver.findElement(By.xpath("//h3[contains(text(),'Add New Field')]"));
			WebElement crossbutton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if(Addnewheading.isDisplayed() && crossbutton.isDisplayed()) {
			System.out.println("Add New Field Heading is displayed");
			componentsInformation.add(7, "Present");
			}
			else {
			System.out.println("Add New Field Heading is not displayed");
			componentsInformation.add(7, "Not Present");
			}
			Thread.sleep(3000);
			
//Field Type Textbox Field
			WebElement Fieldtypeheading=driver.findElement(By.xpath("(//mat-label[contains(text(),'Field Type')])"));
			WebElement Fieldtypetxbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[4]"));
			WebElement drpdwn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-')])[2]"));
			if(Fieldtypeheading.isDisplayed()&&Fieldtypetxbx.isDisplayed()&&drpdwn.isDisplayed()) {
			System.out.println("Field Type Textbox Field is Present");
			componentsInformation.add(8, "Present");
			}
			else {
			System.out.println("Rule name is not  Present");
			componentsInformation.add(8, "Not Present");
			}
			Thread.sleep(3000);
			
// Enter a Field name 
			WebElement enterfieldname=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[5]"));
			WebElement fieldnamemust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])"));
			if(enterfieldname.isDisplayed()&&fieldnamemust.isDisplayed()) {
			System.out.println("Enter a Field name is Present");
			componentsInformation.add(9, "Present");
			}
			else {
			System.out.println("Enter a Field name is not Present");
			componentsInformation.add(9, "Not Present");
			}
			Thread.sleep(3000);

//Character Limit Textbox			
			WebElement charlimitheading=driver.findElement(By.xpath("(//mat-label[contains(text(),'Character Limit')])"));
			WebElement charlimittxbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[6]"));
			WebElement drpdwnm=driver.findElement(By.xpath("(//mat-icon[contains(text(),' keyboard_arrow_up')])"));
			WebElement note=driver.findElement(By.xpath("(//p[contains(@class,'text__light--sm mt-')])"));
			if(charlimitheading.isDisplayed()&&charlimittxbx.isDisplayed()&&drpdwnm.isDisplayed()&&note.isDisplayed()) {
			System.out.println("Character Limit Textbox	is Present");
			componentsInformation.add(10, "Present");
			}
			else {
			System.out.println("Character Limit Textbox	is not Present");
			componentsInformation.add(10, "Not Present");
			}
			Thread.sleep(3000);
			
//Enable Auto Detect to Autofill Personal Details Fieild
			WebElement Checkbox=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])"));
			WebElement info=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-label')])"));
			if(Checkbox.isDisplayed()&&info.isDisplayed()) {
			System.out.println("Enable Auto Detect to Autofill Personal Details Fieild is Present");
			componentsInformation.add(11, "Present");
			}
			else {
			System.out.println("Enable Auto Detect to Autofill Personal Details Fieild is not Present");
			componentsInformation.add(11, "Not Present");
			}
			Thread.sleep(3000);
//Enter Regular Expression
			WebElement Heading =driver.findElement(By.xpath("(//p[contains(text(),'Enter the regular')])"));
			WebElement Textbox=driver.findElement(By.xpath("(//input[@placeholder='Enter the Regular Expression'])"));
			if(Heading.isDisplayed()&&Textbox.isDisplayed()) {
			System.out.println("Create Super rules heading and information is displayed");
			componentsInformation.add(12, "Present");
			}
			else {
			System.out.println("Create Super rules heading and information is not displayed");
			componentsInformation.add(12, "Not Present");
			}
		    Thread.sleep(3000);	
		    
//Add New Field
			WebElement Label=driver.findElement(By.xpath("(//span[contains(text(),'+Add New Field')])"));
			if(Label.isDisplayed()) {
			System.out.println("Add New Field is displayed");
			componentsInformation.add(13, "Present");
		    }
			else {
			System.out.println("Add New Field is not displayed");
			componentsInformation.add(13, "Not Present");
			}
		    Thread.sleep(3000);	
		    js.executeScript("arguments[0].click()", Label);
			Thread.sleep(5000); 
			WebElement delete=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])[22]"));
			js.executeScript("arguments[0].click()", delete);
		    Thread.sleep(5000); 
//Cancel and Save Button
			WebElement cancel=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])"));
			WebElement Savefield=driver.findElement(By.xpath("(//span[contains(text(),' Save Field ')])"));
			if(cancel.isDisplayed()&&Savefield.isDisplayed()) {
			System.out.println("Cancel and Save Button is Present");
			componentsInformation.add(14, "Present");
			}
			else {
			System.out.println("Cancel and Save Button is not Present");
			componentsInformation.add(14, "Not Present");
			}
		    Thread.sleep(3000);	

//How Character Limit help to identify details
		    WebElement Characterlimitlink=driver.findElement(By.xpath("(//p[contains(text(),'How character limit')])"));
			if(Characterlimitlink.isDisplayed()) {
			System.out.println("How Character Limit help to identify details is displayed");
			componentsInformation.add(15, "Present");
			}
			else {
			System.out.println("How Character Limit help to identify details is not displayed");
			componentsInformation.add(15, "Not Present");
		    }
			js.executeScript("arguments[0].click()", Characterlimitlink);
			Thread.sleep(5000);          			  
			WebElement close=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(5000); 
			WebElement closeconfirm=driver.findElement(By.xpath("(//span[contains(text(),' Yes ')])"));
			js.executeScript("arguments[0].click()", closeconfirm);
			Thread.sleep(5000);
//close add Field Window
			WebElement cross1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			js.executeScript("arguments[0].click()", cross1);
			Thread.sleep(5000); 
			WebElement closeconfirm2=driver.findElement(By.xpath("(//span[contains(text(),' Yes ')])"));
			js.executeScript("arguments[0].click()", closeconfirm2);
			Thread.sleep(5000);
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(16, CommonFunctions.getDataTime());
			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "PersonalDetailsSetUIComponents");
					
				
			
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}



