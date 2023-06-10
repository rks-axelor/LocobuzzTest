package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzActionablenonactionableUIProcess {
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
	
public static void verifyingAutoCannedUIComponents(WebDriver driver) throws Exception {
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
			
//Actionable/Non Actionable Label in Account Section
			WebElement actionableogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Actionable_Nonactionable.svg']"));
			WebElement actionablelabel=driver.findElement(By.xpath("(//span[contains(text(),'Actionable/Non Actionable')])"));
			if(actionableogo.isDisplayed()&&actionablelabel.isDisplayed()) {
				System.out.println("Actionable/Non Actionable Label in Account Section is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Actionable/Non Actionable Label in Account Section is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", actionablelabel);
			Thread.sleep(3000);
			
//Actionable//Non Actionable tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement actionabletab=driver.findElement(By.xpath("(//span[contains(text(),'Actionable/Non Actionable')])[2]"));
			if(pushpin.isDisplayed()&&actionabletab.isDisplayed()) {
				System.out.println("Actionable/Non Actionable Tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Actionable/Non Actionable Tab is not displayed");
				componentsInformation.add(2, "Not Present");
				
			}
			Thread.sleep(3000);
//Select Brand Field
			WebElement selectbrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[2]"));
			if(selectbrand.isDisplayed()) {
				System.out.println("Select Brand Field is present");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Select Brand Field is not present");
				componentsInformation.add(3, "Not Present");
				
			}
			Thread.sleep(3000);
//Actionable Heading and Information	

			WebElement ACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Actionable')])[1]"));
			WebElement ACTInformation=driver.findElement(By.xpath("((//p[contains(text(),'Actionable')])//following::p[1])[1]"));
			if(ACTHeading.isDisplayed()&&ACTInformation.isDisplayed()) {
				System.out.println("Actionable/Non Actionable Tab name and Information is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Actionable/Non Actionable Tab name and Information is not displayed");
				componentsInformation.add(4, "Not Present");
				
			}
			Thread.sleep(3000);

//Non Actionable Heading  and Information	

			WebElement NACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Actionable')])[2]"));
			WebElement NACTInformation=driver.findElement(By.xpath("((//p[contains(text(),'Actionable')])//following::p[1])[2]"));
			if(ACTHeading.isDisplayed()&&ACTInformation.isDisplayed()) {
				System.out.println("Non Actionable Headingand Information is displayed");
				componentsInformation.add(5, "Present");
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", NACTHeading);
				Thread.sleep(3000);
			}
			else {
				System.out.println("Non Actionable Heading and Information is not displayed");
				componentsInformation.add(5, "Not Present");
				
			}
			Thread.sleep(3000);
//Customized Heading and Information	

			WebElement CustomHeading=driver.findElement(By.xpath("(//p[contains(text(),'Actionable')])[3]"));
			WebElement CustomInformation=driver.findElement(By.xpath("((//p[contains(text(),'Actionable')])//following::p[1])[3]"));
			if(CustomHeading.isDisplayed()&& CustomInformation.isDisplayed()) {
				System.out.println("Non Actionable Tab name and Information is displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Non Actionable Tab name and Information is not displayed");
				componentsInformation.add(6, "Not Present");
				
			}
			Thread.sleep(3000);
//Edit field
			WebElement editlogo=driver.findElement(By.xpath("(//img[@src='assets/images/common/edit.svg'])[1]"));
			WebElement editlabel=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[1]"));
			if(editlogo.isDisplayed()&&editlabel.isDisplayed()) {
				System.out.println("Edit field is Present");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Edit field is not Present");
				componentsInformation.add(7, "Not Present");
				
			}
			Thread.sleep(3000);
			
//Add field
			WebElement addlogo=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])"));
			WebElement addlabel=driver.findElement(By.xpath("(//span[contains(text(),'Add')])"));
			
			if(addlogo.isDisplayed()&&addlabel.isDisplayed()) {
				System.out.println("Add field is Present");
				componentsInformation.add(8, "Present");
			    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addlogo);
			    Thread.sleep(3000);
			}
			else {
				System.out.println("Add field is not  Present");
				componentsInformation.add(8, "Not Present");
				
			}
			js.executeScript("arguments[0].click()", addlogo);
			Thread.sleep(3000);
// Customize  Rules for Selected Channels Heading
			WebElement customrule=driver.findElement(By.xpath("//h3[contains(@class,'modal__title')]"));
			if(customrule.isDisplayed()) {
				System.out.println("Customize  Rules for Selected Channels Heading is displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Customize  Rules for Selected Channels Heading is not displayed");
				componentsInformation.add(9, "Not Present");
			}
			Thread.sleep(3000);
//Rule name
			WebElement ruleheading=driver.findElement(By.xpath("(//p[contains(text(),'Rule Name')])"));
			WebElement ruleinfo=driver.findElement(By.xpath("(//p[contains(text(),'Rule Name')])//following::p[1]"));
			if(ruleheading.isDisplayed()&&ruleinfo.isDisplayed()) {
				System.out.println("Rule name field is Present");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Rule name is not  Present");
				componentsInformation.add(10, "Not Present");
			}
			Thread.sleep(3000);
			
// Enter a rule name 
			WebElement enterrule=driver.findElement(By.xpath("(//input[@data-placeholder='Enter Rule Name'])"));
			WebElement rulemust=driver.findElement(By.xpath("(//span[contains(@class,'mat-placeholder-required')])[1]"));
			if(enterrule.isDisplayed()&&rulemust.isDisplayed()) {
				System.out.println("Enter a rule name is Present");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Enter a rule name is not Present");
				componentsInformation.add(11, "Not Present");
			}
			Thread.sleep(3000);
//Select Channel or Sub Channel to Create Your Customized Rules
			WebElement selectchannel=driver.findElement(By.xpath("(//p[contains(text(),'Select Channel or Sub Channel to Create Your Customized Rules')])"));
			WebElement selectchannelinfo=
					driver.findElement(By.xpath("(//p[contains(text(),'Select Channel or Sub Channel to Create Your Customized Rules')])//following::p[1]"));
			if(selectchannel.isDisplayed()&&selectchannelinfo.isDisplayed()) {
				System.out.println("Select Channel or Sub Channel to Create Your Customized Rules is Present");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Select Channel or Sub Channel to Create Your Customized Rules not  Present");
				componentsInformation.add(12, "Not Present");
			}
			Thread.sleep(3000);
			
//Search Field 
			WebElement search=driver.findElement(By.xpath("(//input[@data-placeholder='Type to search'])"));
			WebElement searchicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(search.isDisplayed()&&searchicon.isDisplayed()) {
				System.out.println("Enter a rule name is Present");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("Enter a rule name is not Present");
				componentsInformation.add(13, "Not Present");
			}
			Thread.sleep(3000);
//Create Super rules
			WebElement superruleheading=driver.findElement(By.xpath("(//p[contains(text(),'Create Super Rules')])"));
			WebElement superinfo=driver.findElement(By.xpath("(//p[contains(text(),'Create Super Rules')])//following::p[1]"));
			if(superruleheading.isDisplayed()&&superinfo.isDisplayed()) {
				System.out.println("Create Super rules heading and information is displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Create Super rules heading and information is not displayed");
				componentsInformation.add(14, "Not Present");
			}
		    Thread.sleep(3000);	
		    
//Create Actionable rules
			WebElement actionruleheading=driver.findElement(By.xpath("(//p[contains(text(),'Create Actionable Rules')])"));
			WebElement actioninfo=driver.findElement(By.xpath("(//p[contains(text(),'Create Actionable Rules')])//following::p[1]"));
			if(actionruleheading.isDisplayed()&&actioninfo.isDisplayed()) {
				System.out.println("Create Actionable rules heading and information is displayed");
				componentsInformation.add(15, "Present");
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", actioninfo);
				Thread.sleep(3000);
			}
			else {
				System.out.println("Create Actionable rules heading and information is not displayed");
				componentsInformation.add(15, "Not Present");
			}
		    Thread.sleep(3000);	
		 
//Create Non Actionable rules
			WebElement nonactruleheading=driver.findElement(By.xpath("(//p[contains(text(),'Create Non Actionable Rules')])"));
			WebElement nonactinfo=driver.findElement(By.xpath("(//p[contains(text(),'Create Non Actionable Rules')])//following::p[1]"));
			if(nonactruleheading.isDisplayed()&&nonactinfo.isDisplayed()) {
				System.out.println("Create Non Actionable heading and information is displayed");
				componentsInformation.add(16, "Present");
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", nonactinfo);
				Thread.sleep(3000);
			}
			else {
				System.out.println("Create Non Actionable heading and information is not displayed");
				componentsInformation.add(16, "Not Present");
			}
		    Thread.sleep(3000);	

//Select Arrow
           WebElement arrow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if(arrow.isDisplayed()) {
				System.out.println("Select Arrow is displayed");
				componentsInformation.add(17, "Present");
			}
			else {
				System.out.println("Select Arrow is not displayed");
				componentsInformation.add(17, "Not Present");
			}
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(5000);          




			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(18, CommonFunctions.getDataTime());
			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "Actonable NonActionableUI");
					
				
			
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}

