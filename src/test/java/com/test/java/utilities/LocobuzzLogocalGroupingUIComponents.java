package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzLogocalGroupingUIComponents {
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
	
	public static void verifyingLogicalGroupingUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Advance Listening Settings
			WebElement AdvListeningSettings=driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			if(AdvListeningSettings.isDisplayed()) {
				System.out.println("Advance Listening Settings is displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Advance Listening Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", AdvListeningSettings);
			Thread.sleep(3000);
			
//Logical Grouping Label in Account Section
			WebElement Logicalgroupinglogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Logical_Grouping.svg']"));
			WebElement Logicalgroupinglabel=driver.findElement(By.xpath("//span[contains(text(),'Logical Grouping')]"));
			if(Logicalgroupinglogo.isDisplayed()&&Logicalgroupinglabel.isDisplayed()) {
				System.out.println("Publish Setting is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Publish Setting is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", Logicalgroupinglabel);
			Thread.sleep(3000);
			
//Logical Grouping Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement Logicalgroupingtab=driver.findElement(By.xpath("(//span[contains(text(),'Logical Grouping')])[2]"));
			if(pushpin.isDisplayed()&&Logicalgroupingtab.isDisplayed()) {
				System.out.println("Logical Grouping Tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Logical Grouping Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//Create Logical Grouping tab name	and Information	

			WebElement LGHeading=driver.findElement(By.xpath("(//p[contains(text(),'Logical Grouping')])"));
			WebElement LGInformation=driver.findElement(By.xpath("(//p[contains(text(),'Logical Grouping')])//following::p[1]"));
			if(LGHeading.isDisplayed()&&LGInformation.isDisplayed()) {
				System.out.println("Create Logical Grouping tab name and Information is displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Create Logical Grouping tab name and Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			

//search field
			WebElement searchField=driver.findElement(By.xpath("(//input[@data-placeholder='Search by Group Name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchField.isDisplayed()&&symbol.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}


			Thread.sleep(3000);	

				
//Create New Group
			WebElement CreateNewGrouplogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle_outline')]"));
			WebElement CreateNewGrouplabel=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]"));
			if(CreateNewGrouplogo.isDisplayed() && CreateNewGrouplabel.isDisplayed()) {
				System.out.println("Create New Group Field is displayed");
				componentsInformation.add(5, "Present");
			}
			
			else {
				System.out.println("Create New Group Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", CreateNewGrouplabel);
			Thread.sleep(3000);

//Create New Group Field UI Components			
			
//Create New Logical Group Heading			
				WebElement CreateHeading=driver.findElement(By.xpath("//h3[contains(text(),'Create New Logical Group')]"));
				if(CreateHeading.isDisplayed()){
					System.out.println("Create New Logical Group Heading is displayed");
					componentsInformation.add(6, "Present");
				}
				else {
					System.out.println("Create New Logical Group Heading is displayed");
					componentsInformation.add(6, "Not Present");
				}
//Define New Logical Group			
			WebElement DefineHeading=driver.findElement(By.xpath("//p[contains(text(),'Define New Logical Group')]"));
			WebElement DefineInformation=driver.findElement(By.xpath("//p[contains(text(),'Define New Logical Group')]//following::p[1]"));
			if(DefineHeading.isDisplayed() &&  DefineInformation.isDisplayed()){
				System.out.println("Define New Logical Group Information is displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Define New Logical Group Information is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			
//Enter groupname field 			
			WebElement groupname=driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat-form')])[3]"));
			WebElement charlimit=driver.findElement(By.xpath("(//span[contains(@class,'text__light ng-tns-c')])"));
			if(groupname.isDisplayed() && charlimit.isDisplayed()) {
				System.out.println("Enter groupname field is present");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Enter groupname field is not present");
				componentsInformation.add(8, "Not Present");
			}

//Logical Group Logo Field
						
			WebElement logoHeading=driver.findElement(By.xpath("(//p[contains(text(),'Logical Group Logo ')])"));
			WebElement Logomust=driver.findElement(By.xpath("(//p[contains(text(),'Logical Group Logo ')])//following::span[1]"));
			WebElement Logoinformation=driver.findElement(By.xpath("(//p[contains(text(),'Logical Group Logo ')])//following::p[1]"));
			
			if(logoHeading.isDisplayed() && Logoinformation.isDisplayed() && Logomust.isDisplayed() ) {
				System.out.println("Logical Group Logo Field is present");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Logical Group Logo Field is not  present");
				componentsInformation.add(9, "Not Present");
			}

//Upload group logo field
			
			WebElement uploadlogo=driver.findElement(By.xpath("(//mat-icon[contains(text(),'photo_camera')])"));
			WebElement uploadheading=driver.findElement(By.xpath("(//p[contains(text(),'Upload Logical Group Logo')])"));
			WebElement uploadinformation=driver.findElement(By.xpath("(//p[contains(text(),'Only JPG, PNG and JPEG file allowed.')])"));
			
			if(uploadlogo.isDisplayed() && uploadheading.isDisplayed() && uploadinformation.isDisplayed() ) {
				System.out.println("Upload group logo field is present");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Upload group logo field is not  present");
				componentsInformation.add(10, "Not Present");
			}
			
//Logo Image Specification			

			WebElement specificon=driver.findElement(By.xpath("//p[contains(text(),'Select Brand')]"));
			WebElement specification=driver.findElement(By.xpath("(//p[contains(@class,'text__light text__sm')])"));
			if(specificon.isDisplayed() &&  specification.isDisplayed()){
				System.out.println("Logo Image Specification is displayed");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Logo Image Specification is displayed");
				componentsInformation.add(11, "Not Present");
			}
			
//Select Group Colour field
			WebElement colourheading=driver.findElement(By.xpath("(//p[contains(text(),'Group Color ')])[1]"));
			WebElement coloumust=driver.findElement(By.xpath("(//p[contains(text(),'Group Color ')])[1]//following::span[1]"));
			WebElement colourinformation=driver.findElement(By.xpath("(//p[contains(text(),'Group Color ')])[1]//following::p[1]"));
			
			if(colourheading.isDisplayed() && coloumust.isDisplayed() && colourinformation.isDisplayed() ) {
				System.out.println("Select Group Colour field is present");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Select Group Colour is not  present");
				componentsInformation.add(12, "Not Present");
			}			
			
//select Group Colour			
			
			WebElement selectcolourdropdown=driver.findElement(By.xpath("(//span[contains(text(),'crop_square')])"));
			WebElement selectheading=driver.findElement(By.xpath("(//p[contains(text(),' Select Logical Group Color ')])"));
			if(selectcolourdropdown.isDisplayed() && selectheading.isDisplayed()) {
				System.out.println("select Group Colour heading and dropdown is displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("select Group Colour heading and dropdown is not displayed");
				componentsInformation.add(13, "Not Present");
			}
			
			
//View Other Group colours through Scrolling
			WebElement Viewheading=driver.findElement(By.xpath("(//p[contains(text(),' View other group colors ')])"));
			if(Viewheading.isDisplayed()) {
				System.out.println("View Other Group colours thr Scrolling Field is displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("View Other Group colours thr Scrolling Field is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			//js.executeScript("arguments[0].click()", SearchuserField);
			//Thread.sleep(3000);

//Select Brand  field
			WebElement Selectbrandheading=driver.findElement(By.xpath("(//p[contains(text(),'Group Color ')])[1]"));
			WebElement selectbrandmust=driver.findElement(By.xpath("(//p[contains(text(),'Select Brands ')])//following::span[1]"));
			WebElement brandinformation=driver.findElement(By.xpath("(//p[contains(text(),'Select Brands ')])//following::p[1]"));
			
			if(Selectbrandheading.isDisplayed() && selectbrandmust.isDisplayed() && brandinformation.isDisplayed() ) {
				System.out.println("Select Brand  field is present");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Select Brand  field is not  present");
				componentsInformation.add(15, "Not Present");
			}

//Select Brand Textbox
			WebElement searchbrand=driver.findElement(By.xpath("(//input[@placeholder='Type to search'])"));
			if(searchbrand.isDisplayed()) {
				System.out.println("Select Brand Textbox is present");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Select Brand Textbox is not present");
				componentsInformation.add(16, "Not Present");
			}			
//Save Button
			WebElement Save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			if(Save.isDisplayed()) {
				System.out.println("Save Button is Present");
				componentsInformation.add(17, "Present");
			}
			else {
				System.out.println("Save Button is not Present");
				componentsInformation.add(17, "Not Present");
			}

//Cancel Button
			WebElement Cancel=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])"));
			if(Cancel.isDisplayed()) {
				System.out.println("Cancel Button is Present");
				componentsInformation.add(18, "Present");
			}
			else {
				System.out.println("Cancel Button is not Present");
				componentsInformation.add(18, "Not Present");
			}			
//Arrow
			WebElement Arrow=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			if(Arrow.isDisplayed()){
				System.out.println("Arrow is Present");
				componentsInformation.add(19, "Present");
			}
			else {
				System.out.println("Arrow is not Present");
				componentsInformation.add(19, "Not Present");
				}
			js.executeScript("arguments[0].click()", Arrow);
			Thread.sleep(4000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(20, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "LogicalGroupingUIVerification");
					
				
			
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
	

