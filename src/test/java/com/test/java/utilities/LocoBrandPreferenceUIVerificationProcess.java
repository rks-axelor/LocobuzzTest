package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoBrandPreferenceUIVerificationProcess {
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
	
public static void BrandPreferenceUIVerificationProcess(WebDriver driver) throws Exception {
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
			
//Brand Preference Tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement brandtab=driver.findElement(By.xpath("(//span[contains(text(),'Brand Preference')])[1]"));
			if(pushpin.isDisplayed()&&brandtab.isDisplayed()) {
				System.out.println("Brand Preference Tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Brand Preference Tab is not displayed");
				componentsInformation.add(2, "Not Present");
				}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", brandtab);
			Thread.sleep(3000);

//Information Field
			WebElement info=driver.findElement(By.xpath("//mat-icon[contains(text(),'info')]"));
			WebElement noteinfo=driver.findElement(By.xpath("//span[contains(text(),'Same colors represents the same brand profiles')]"));
			if(info.isDisplayed()&&noteinfo.isDisplayed()) {
				System.out.println("Information Field is present");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Information Field is not present");
				componentsInformation.add(3, "Not Present");
			}
			Thread.sleep(3000);
			
//Brand Preference Heading and Information	
            WebElement ACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Brand Preference ')])[1]"));
			WebElement ACTInformation=driver.findElement(By.xpath("(//p[contains(text(),'Brand Preference ')])[1]//following::p[1]"));
			if(ACTHeading.isDisplayed()&&ACTInformation.isDisplayed()) {
				System.out.println("Brand Preference Heading and Information is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Brand Preference Heading and Information is not displayed");
				componentsInformation.add(4, "Not Present");
				
			}
			Thread.sleep(3000);
			
//Search By Category Group	
            WebElement Searchbycat=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category Group')])"));
			WebElement Dropdown=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[2]"));
			if(Searchbycat.isDisplayed()&&Dropdown.isDisplayed()) {
				System.out.println("Search By Category Name	 is displayed");
				componentsInformation.add(5, "Present");
				Thread.sleep(3000);
			}
			else {
				System.out.println("Search By Category Name	 is not displayed");
				componentsInformation.add(5, "Not Present");
				
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Dropdown);
			Thread.sleep(3000);

//Select Default2 Category	
            WebElement Default2=driver.findElement(By.xpath("//span[contains(text(),'Default2')]"));
			if(Default2.isDisplayed()) {
				System.out.println("Default2 Category is Present");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Default2 Category is not Present");
				componentsInformation.add(6, "Not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Default2);
			Thread.sleep(3000);



			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(7, CommonFunctions.getDataTime());
			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "BrandPreference UIVerification");
					
				
			
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}

