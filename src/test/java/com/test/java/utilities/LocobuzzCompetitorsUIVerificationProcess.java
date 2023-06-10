package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebDriver;

public class LocobuzzCompetitorsUIVerificationProcess {
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

public static void CompetitorsUIVerificationprocess(WebDriver driver) throws Exception {
	try {
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	// Listening Settings
				WebElement ListeningSettings=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
	if(ListeningSettings.isDisplayed()) {
		System.out.println(" Listening Settings is displayed");
		componentsInformation.add(0, "Present");
	}
	else {
		System.out.println(" Listening Settings is not displayed");
		componentsInformation.add(0, "Not Present");
	}
	js.executeScript("arguments[0].click()", ListeningSettings);
	Thread.sleep(3000);
	
//Competitors Label in Account Section
	//WebElement Competitorslogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Competitors_Active.svg']"));
	WebElement Competitorslabel=driver.findElement(By.xpath("(//span[contains(text(),'Competitors')])[1]"));
	if(Competitorslabel.isDisplayed()) {
		System.out.println("Competitors Label in Account Section is displayed");
		componentsInformation.add(1, "Present");
	}
	else {
		System.out.println("Competitors Label in Account Section not displayed");
		componentsInformation.add(1, "Not Present");
	}
	js.executeScript("arguments[0].click()", Competitorslabel);
	Thread.sleep(3000);
	
//Competitors Tab
	WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
	WebElement Logicalgroupingtab=driver.findElement(By.xpath("(//span[contains(text(),'Competitors')])[2]"));
	if(pushpin.isDisplayed()&&Logicalgroupingtab.isDisplayed()) {
		System.out.println("Competitors Tab is displayed");
		componentsInformation.add(2, "Present");
	}
	else {
		System.out.println("Competitors Tab is not displayed");
		componentsInformation.add(2, "Not Present");
	}

//Map Your Competitors Heading and Information	

	WebElement MapHeading=driver.findElement(By.xpath("(//p[contains(text(),'Map Your Competitors')])"));
	WebElement MapInformation=driver.findElement(By.xpath("(//p[contains(text(),'Map Your Competitors')])//following::p[1]"));
	if(MapHeading.isDisplayed()&&MapInformation.isDisplayed()) {
		System.out.println("Map Your Competitors Heading and Information is displayed");
		componentsInformation.add(3, "Present");
	}
	else {
		System.out.println("Map Your Competitors Heading and Information is not displayed");
		componentsInformation.add(3, "Not Present");
	}
	

//search field
	WebElement searchField=driver.findElement(By.xpath("(//input[@data-placeholder='Search by Brand Name'])"));
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

		
//Map New Competitors 
	WebElement MapNewCompetitorslogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle_outline')]"));
	WebElement MapNewCompetitorslabel=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]"));
	if(MapNewCompetitorslogo.isDisplayed() && MapNewCompetitorslabel.isDisplayed()) {
		System.out.println("Map New Competitors Field is displayed");
		componentsInformation.add(5, "Present");
	}
	
	else {
		System.out.println("Map New Competitors Field is not displayed");
		componentsInformation.add(5, "Not Present");
	}
	js.executeScript("arguments[0].click()", MapNewCompetitorslabel);
	Thread.sleep(5000);

//Map New Competitors Field UI Components			
	
//Map New Competitors Heading			
		WebElement MappingHeading=driver.findElement(By.xpath("//h3[contains(text(),'Map New Competitors')]"));
		WebElement MappingInformation=driver.findElement(By.xpath("//h3[contains(text(),'Map New Competitors')]//following::p[1]"));		
		if(MappingHeading.isDisplayed() && MappingInformation.isDisplayed()){
			System.out.println("Map New Competitors Heading and Information is displayed");
			componentsInformation.add(6, "Present");
		}
		else {
			System.out.println("Map New Competitors Heading and Information is not displayed");
			componentsInformation.add(6, "Not Present");
		}
		Thread.sleep(3000);
//Select Your Main Brand Field			
	WebElement Mainbrandselect=driver.findElement(By.xpath("//p[contains(text(),'Select Your Main Brand ')]"));
	WebElement mustselectmain=driver.findElement(By.xpath("//p[contains(text(),'Select Your Main Brand ')]//following::span[1]"));
	if(Mainbrandselect.isDisplayed() &&  mustselectmain.isDisplayed()){
		System.out.println("Select Your Main Brand Field is displayed");
		componentsInformation.add(7, "Present");
	}
	else {
		System.out.println("Select Your Main Brand Field is not displayed");
		componentsInformation.add(7, "Not Present");
	}Thread.sleep(3000);
	
//Select Main Brand TextBox field 			
	WebElement SelectmainTextbox=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns-c')])[1]"));
	WebElement dropdownmain=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[3]"));
	if(SelectmainTextbox.isDisplayed() && dropdownmain.isDisplayed()) {
		System.out.println("Enter groupname field is present");
		componentsInformation.add(8, "Present");
	}
	else {
		System.out.println("Enter groupname field is not present");
		componentsInformation.add(8, "Not Present");
	}
	js.executeScript("arguments[0].click()", dropdownmain);
	Thread.sleep(5000);

//search brand	
	WebElement searchbrand=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
	WebElement symbol1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
	if(searchbrand.isDisplayed() &&  symbol1.isDisplayed()) {
		System.out.println("Search brands  Text Box field is present");
		componentsInformation.add(9, "Present");
	}
	else {
		System.out.println("Search brands  Text Box field is not  present");
		componentsInformation.add(9, "Not Present");
	}
	js.executeScript("arguments[0].click()", searchbrand);
	Thread.sleep(5000);		
	WebElement select1=driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));	
	js.executeScript("arguments[0].click()", select1);
	Thread.sleep(5000);
	System.out.println("Competitors for that brand are Displayed");

//Select Competitors Field
				
	WebElement SelectCompetitorsHeading=driver.findElement(By.xpath("(//p[contains(text(),'Select Competitors')])"));
	WebElement SelectCompetitorsmust=driver.findElement(By.xpath("(//p[contains(text(),'Select Competitors')])//following::span[1]"));
	WebElement SelectCompetitorsinformation=driver.findElement(By.xpath("(//p[contains(text(),'Select Competitors')])//following::p[1]"));
	
	if(SelectCompetitorsHeading.isDisplayed() && SelectCompetitorsmust.isDisplayed() && SelectCompetitorsinformation.isDisplayed() ) {
		System.out.println("Select Competitors Field is present");
		componentsInformation.add(10, "Present");
	}
	else {
		System.out.println("Select Competitors Field is not  present");
		componentsInformation.add(10, "Not Present");
	}Thread.sleep(3000);

//Search brands as Competitors Text Box field
	
	WebElement barandsearch=driver.findElement(By.xpath("(//input[@placeholder='Type to search'])"));
	
	
	if(barandsearch.isDisplayed() ) {
		System.out.println("Search brands as Competitors Text Box field is present");
		componentsInformation.add(11, "Present");
	}
	else {
		System.out.println("Search brands as Competitors Text Box field is not  present");
		componentsInformation.add(11, "Not Present");
	}Thread.sleep(3000);
	

		
//Save Button
	WebElement Save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
	if(Save.isDisplayed()) {
		System.out.println("Save Button is Present");
		componentsInformation.add(12, "Present");
	}
	else {
		System.out.println("Save Button is not Present");
		componentsInformation.add(12, "Not Present");
	}Thread.sleep(3000);

//Cancel Button
	WebElement Cancel=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])"));
	if(Cancel.isDisplayed()) {
		System.out.println("Cancel Button is Present");
		componentsInformation.add(13, "Present");
	}
	else {
		System.out.println("Cancel Button is not Present");
		componentsInformation.add(13, "Not Present");
	}Thread.sleep(3000);
	
//cross Button
	WebElement cross=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
	if(cross.isDisplayed()) {
		System.out.println("Cross Button is present");
		componentsInformation.add(14, "Present");
	}
	else {
		System.out.println("Cross Button  is not present");
		componentsInformation.add(14, "Not Present");
	}	
	js.executeScript("arguments[0].click()", cross);
	Thread.sleep(5000);	
		

	
	WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
	js.executeScript("arguments[0].click()", arrowBack1);
	Thread.sleep(3000);
	
	componentsInformation.add(15, CommonFunctions.getDataTime());

	CommonFunctions.writeUIComponentsToExcel(componentsInformation, "CompetitorsUIVerification");
			
		
	
		
	
}
catch(Exception e) {
	e.printStackTrace();
	throw e;
}
}


	
	
	
}

	

	

