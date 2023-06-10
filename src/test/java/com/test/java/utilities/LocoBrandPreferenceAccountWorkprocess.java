package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoBrandPreferenceAccountWorkprocess {
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
	
public static void BrandPreferenceFunctionality(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Response Management
			WebElement responsemngt=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Response Management')])[1]"));
			if(responsemngt.isDisplayed()) 
				System.out.println("Response Management is displayed");
			else 
				System.out.println("Response Management is not displayed");
			js.executeScript("arguments[0].click()", responsemngt);
			Thread.sleep(3000);
			
//Actionable/Non Actionable Label in Account Section
			WebElement actionableogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Actionable_Nonactionable.svg']"));
			WebElement actionablelabel=driver.findElement(By.xpath("(//span[contains(text(),'Actionable/Non Actionable')])"));
			if(actionableogo.isDisplayed()&&actionablelabel.isDisplayed()) 
				System.out.println("Actionable/Non Actionable Label in Account Section is displayed");
			else 
				System.out.println("Actionable/Non Actionable Label in Account Section is not displayed");
			js.executeScript("arguments[0].click()", actionablelabel);
			Thread.sleep(3000);
			
//Brand Preference Tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement brandtab=driver.findElement(By.xpath("(//span[contains(text(),'Brand Preference')])[1]"));
			if(pushpin.isDisplayed()&&brandtab.isDisplayed()) 
				System.out.println("Brand Preference Tab is displayed");
			else 
				System.out.println("Brand Preference Tab is not displayed");
				Thread.sleep(3000);
			js.executeScript("arguments[0].click()", brandtab);
			Thread.sleep(3000);

//Information Field
			WebElement info=driver.findElement(By.xpath("//mat-icon[contains(text(),'info')]"));
			WebElement noteinfo=driver.findElement(By.xpath("//span[contains(text(),'Same colors represents the same brand profiles')]"));
			if(info.isDisplayed()&&noteinfo.isDisplayed()) 
				System.out.println("Information Field is present");
			else
				System.out.println("Information Field is not present");
			Thread.sleep(3000);
			
//Brand Preference Heading and Information	
            WebElement ACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Brand Preference ')])[1]"));
			WebElement ACTInformation=driver.findElement(By.xpath("(//p[contains(text(),'Brand Preference ')])[1]//following::p[1]"));
			if(ACTHeading.isDisplayed()&&ACTInformation.isDisplayed()) 
				System.out.println("Brand Preference Heading and Information is displayed");
			else 
				System.out.println("Brand Preference Heading and Information is not displayed");
				Thread.sleep(3000);
			
//Search By Category Group	
            WebElement Searchbycat=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category Group')])"));
			WebElement Dropdown=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[2]"));
			if(Searchbycat.isDisplayed()&&Dropdown.isDisplayed()) 
				System.out.println("Search By Category Name	 is displayed");
			else 
				System.out.println("Search By Category Name	 is not displayed");
				Thread.sleep(3000);
		        js.executeScript("arguments[0].click()", Dropdown);
			    Thread.sleep(3000);

//Select Default2 Category	
            WebElement Default2=driver.findElement(By.xpath("//span[contains(text(),'Default2')]"));
			if(Default2.isDisplayed()) 
				System.out.println("Default2 Category is Present");
			else 
				System.out.println("Default2 Category is not Present");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Default2);
			Thread.sleep(3000);

//Perform Drag and Drop Operation
		   Actions builder = new Actions(driver);
		   WebElement toWebElement = driver.findElement(By.xpath("(//span[contains(text(),'Sejal Chorge')])[1]"));
	    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", toWebElement);
	        Thread.sleep(2000);
	        WebElement fromWebElement = driver.findElement(By.xpath("(//span[contains(text(),'Sejal Chorge')])[2]"));
	        Thread.sleep(2000);
           
	        builder.clickAndHold(fromWebElement).moveToElement(toWebElement).perform();
	        Thread.sleep(2000);// add 2 sec wait
	        builder.release(toWebElement).build().perform();
	        Thread.sleep(2000);
	        WebElement Save = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", Save);
			Thread.sleep(3000);
			 Actions builder2 = new Actions(driver);
			WebElement toWebElement1 = driver.findElement(By.xpath("(//span[contains(text(),'Sejal Chorge')])[1]"));
		    Thread.sleep(2000);
		    WebElement fromWebElement1 = driver.findElement(By.xpath("(//span[contains(text(),'Sejal Chorge')])[2]"));
		    Thread.sleep(2000);
		    builder2.clickAndHold(fromWebElement1).moveToElement(toWebElement1).perform();
	        Thread.sleep(2000);// add 2 sec wait
	        builder2.release(toWebElement1).build().perform();
	        Thread.sleep(2000);
	        WebElement Save2 = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", Save2);
			Thread.sleep(3000);
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

