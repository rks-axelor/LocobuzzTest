package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzSupervisorAllMentionsUIComponents {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void verifyingAllMentionsTabUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Allmentionstab
			WebElement allmentionsTab = driver.findElement(By.xpath("(//span[contains(text(),'All Mention')])[1]"));
			js.executeScript("arguments[0].click()", allmentionsTab);
			if(allmentionsTab.isDisplayed()) {
				System.out.println("All Mention tab is displayed");
				componentsInformation.add(0,"Present" );
			}
			else {
				System.out.println("All Mention tab is not displayed");
				componentsInformation.add(0,"Not Present" );
			}
			Thread.sleep(5000);
			
//useractivitybutton
			WebElement userActivityButton=driver.findElement(By.xpath("//a[contains(text(),'User Activity ')]"));
			if(userActivityButton.isDisplayed()) {
				System.out.println("User activity button is displayed");
				componentsInformation.add(1,"Present" );
			}
			else {
				System.out.println("User activity button is not displayed");
				componentsInformation.add(1,"Not Present" );
			}
			
//brandactivitybutton
			WebElement brandActivityButton=driver.findElement(By.xpath("//a[contains(text(),'Brand Activity ')]"));
			if(brandActivityButton.isDisplayed()) {
				System.out.println("Brand Activity button is displayed");
				componentsInformation.add(2,"Present" );
			}
			else {
				System.out.println("Brand Activity button is not displayed");
				componentsInformation.add(2,"Not Present" );
			}
			
//actionablebutton
			WebElement actionableButton=driver.findElement(By.xpath("(//span[contains(text(),' Actionable ')])[1]"));
			if(actionableButton.isDisplayed()) {
				System.out.println("Actionable button is displayed");
				componentsInformation.add(3,"Present" );
			}
			else {
				System.out.println("Actionable button is not displayed");
				componentsInformation.add(3,"Not Present" );
			}
			
//Non-actionablebutton
			WebElement nonactionableButton=driver.findElement(By.xpath("(//span[contains(text(),' Non Actionable ')])"));
			if(nonactionableButton.isDisplayed()) {
				System.out.println("Non-Actionable button is displayed");
				componentsInformation.add(4,"Present" );
			}
			else {
				System.out.println("Non-Actionable button is not displayed");
				componentsInformation.add(4,"Not Present" );
			}
			
//totalticketimage
			WebElement totalTicketImage=driver.findElement(By.xpath("//mat-icon[contains(text(),' question_answer')]"));
			if(totalTicketImage.isDisplayed()) {
				System.out.println("Total ticket image is displayed");
				componentsInformation.add(5,"Present" );
			}
			else {
				System.out.println("Total ticket image is not displayed");
				componentsInformation.add(5,"Not Present" );
			}
			
//searchbutton
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[2]"));
			if(searchButton.isDisplayed()) {
				System.out.println("Search button is displayed");
				componentsInformation.add(6,"Present" );
			}
			else {
				System.out.println("Search button is not displayed");
				componentsInformation.add(6,"Not Present" );
			}
			
//filterbutton
			WebElement filterButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt')])[4]"));
			if(filterButton.isDisplayed()) {
				System.out.println("Filter button is displayed");
				componentsInformation.add(7,"Present" );
			}
			else {
				System.out.println("Filter button is not displayed");
				componentsInformation.add(7,"Not Present" );
			}
			
//sortbutton
			WebElement sortButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'sort')])[2]"));
			if(sortButton.isDisplayed()) {
				System.out.println("Sort button is displayed");
				componentsInformation.add(8,"Present" );
			}
			else {
				System.out.println("Sort button is not  displayed");
				componentsInformation.add(8,"Not Present" );
			}
			
//ticketrenderingbutton
			WebElement ticketRenderingButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_vert')])[2]"));
			if(ticketRenderingButton.isDisplayed()) {
				System.out.println("Ticket Rendering button is displayed");
				componentsInformation.add(9,"Present");
			}
			else {
				System.out.println("Ticket Rendering button is not displayed");
				componentsInformation.add(9,"Not Present");
			}
			
//opentabs
			WebElement openTabs=driver.findElement(By.xpath("//mat-icon[contains(text(),' expand_more')]"));
			if(openTabs.isDisplayed()) {
				System.out.println("Open tabs is displayed");
				componentsInformation.add(10,"Present");
			}
			else {
				System.out.println("Open tabs is not displayed");
				componentsInformation.add(10,"Not Present");
			}
			
//savefilterbutton
			WebElement saveFilterButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'turned_in_not')])"));
			if(saveFilterButton.isDisplayed()) {
				System.out.println("Save Filter button is displayed");
				componentsInformation.add(11,"Present");
			}
			else {
				System.out.println("Save Filter button is not displayed");
				componentsInformation.add(11,"Not Present");
			}
			
//brands
			WebElement brands=driver.findElement(By.xpath("(//span[contains(text(),' Brands')])[2]"));
			if(brands.isDisplayed()) {
				System.out.println("Brands is displayed");
				componentsInformation.add(12,"Present");
			}
			else {
				System.out.println("Brands is not displayed");
				componentsInformation.add(12,"Not Present");
			}
			
//BrandData
			WebElement brandsData=driver.findElement(By.xpath("(//span[contains(@class,'mat-menu-trigger keywords__name')])[3]"));
			if(brandsData.isDisplayed()) {
				System.out.println("Brands data is displayed");
				componentsInformation.add(13,"Present");
			}
			else {
				System.out.println("Brands data is not displayed");
				componentsInformation.add(13,"Not Present");
			}
			
			
//duration
			WebElement duration=driver.findElement(By.xpath("(//span[contains(text(),' Duration')])[2]"));
			if(duration.isDisplayed()) {
				System.out.println("Duration is displayed");
				componentsInformation.add(14,"Present");
			}
			else {
				System.out.println("Duration is not displayed");
				componentsInformation.add(14,"Not Present");
			}
			
//duration data
			WebElement durationData=driver.findElement(By.xpath("(//span[contains(@class,'mat-menu-trigger keywords__name')])[4]"));
			if(durationData.isDisplayed()) {
				System.out.println("Duration Data is displayed");
				componentsInformation.add(15,"Present");
			}
			else {
				System.out.println("Duration Data is not displayed");
				componentsInformation.add(15,"Not Present");
			}
			
//Addsymbol
			WebElement addSymbol=driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]"));
			if(addSymbol.isDisplayed()) {
				System.out.println("Add symbol is displayed");
				componentsInformation.add(16,"Present");
			}
			else {
				System.out.println("Add symbol is not displayed");
				componentsInformation.add(16,"Not Present");
			}
			
			componentsInformation.add(17,CommonFunctions.getDataTime());
			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"SupervisorAllMentionUIComponent");
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
