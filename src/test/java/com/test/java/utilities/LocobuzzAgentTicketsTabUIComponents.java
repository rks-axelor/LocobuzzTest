package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocobuzzAgentTicketsTabUIComponents {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void verifyingTicketTabUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//tickets tab
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));
			js.executeScript("arguments[0].click()", ticketsTab);
			if(ticketsTab.isDisplayed()) {
				System.out.println("Tickets Tab is displayed");
				componentsInformation.add(0,"Present" );
			}
			else {
				System.out.println("Tickets Tab is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			
//Addsymbol
			WebElement addSymbol=driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]"));
			if(addSymbol.isDisplayed()) {
				System.out.println("Add symbol is displayed");
				componentsInformation.add(1,"Present");
			}
			else {
				System.out.println("Add symbol is not displayed");
				componentsInformation.add(1,"Not Present");
			}
			
//opentabs
			WebElement openTabs=driver.findElement(By.xpath("//mat-icon[contains(text(),' expand_more')]"));
			if(openTabs.isDisplayed()) {
				System.out.println("Open tabs is displayed");
				componentsInformation.add(2,"Present");
			}
			else {
				System.out.println("Open tabs is not displayed");
				componentsInformation.add(2,"Not Present");
			}
			
//savefilter
			WebElement saveFilterButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'turned_in_not')])"));
			if(saveFilterButton.isDisplayed()) {
				System.out.println("Save Filter button is displayed");
				componentsInformation.add(3,"Present");
			}
			else {
				System.out.println("Save Filter button is not displayed");
				componentsInformation.add(3,"Not Present");
			}
			
//open button
			WebElement openButton=driver.findElement(By.xpath("//a[contains(text(),'Open')]"));
			if(openButton.isDisplayed()) {
				System.out.println("Open tab is displayed");
				componentsInformation.add(4,"Present");
			}
			else {
				System.out.println("Open tab is displayed");
				componentsInformation.add(4,"Not Present");
			}
			
//onhold button
			WebElement onHoldButton=driver.findElement(By.xpath("//a[contains(text(),'On Hold ')]"));
			if(onHoldButton.isDisplayed()) {
				System.out.println("Onhold tab is displayed");
				componentsInformation.add(5,"Present");
			}
			else {
				System.out.println("Onhold tab is not displayed");
				componentsInformation.add(5,"Not Present");
			}
			
//pending button
			WebElement pendingButton=driver.findElement(By.xpath("//a[contains(text(),'Pending ')]"));
			if(pendingButton.isDisplayed()) {
				System.out.println("Pending tab is displayed");
				componentsInformation.add(6,"Present");
			}
			else {
				System.out.println("Pending tab is not displayed");
				componentsInformation.add(6,"Not Present");
			}
			
//awaiting for csd/brand button
			WebElement awaitingButton=driver.findElement(By.xpath("(//a[contains(text(),'Awaiting For CSD/Brand ')])"));
			if(awaitingButton.isDisplayed()) {
				System.out.println("Awaiting tab is displayed");
				componentsInformation.add(7,"Present");
			}
			else {
				System.out.println("Awaiting tab is not displayed");
				componentsInformation.add(7,"Not Present");
			}
			
//awaiting TL approval button
			WebElement awaitingTLApprovalButton=driver.findElement(By.xpath("(//a[contains(text(),'Awaiting TL Approval ')])"));
			if(awaitingTLApprovalButton.isDisplayed()) {
				System.out.println("Awaiting TL approval tab is displayed");
				componentsInformation.add(8,"Present");
			}
			else {
				System.out.println("Awaiting TL approval tab is not displayed");
				componentsInformation.add(8,"Not Present");
			}
			
//morebutton
			WebElement moreButton=driver.findElement(By.xpath("(//a[contains(text(),'More ')])"));
			if(moreButton.isDisplayed()) {
				System.out.println("More Button is displayed");
				componentsInformation.add(9,"Present");
			}
			else {
				System.out.println("More Button is not displayed");
				componentsInformation.add(9,"Not Present");
			}
			
//searchbutton
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])"));
			if(searchButton.isDisplayed()) {
				System.out.println("Search button is displayed");
				componentsInformation.add(10,"Present");
			}
			else {
				System.out.println("Search button is not displayed");
				componentsInformation.add(10,"Not Present");
			}
			
//manualticketbutton
			WebElement manualTicketButton=driver.findElement(By.xpath("//img[@src='assets/images/common/Manual_Ticket.svg']"));
			if(manualTicketButton.isDisplayed()) {
				System.out.println("Manual ticket button is displayed");
				componentsInformation.add(11,"Present");
			}
			else {
				System.out.println("Manual ticket button is not displayed");
				componentsInformation.add(11,"Not Present");
			}
			
//filterbutton
			WebElement filterButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt')])[1]"));
			if(filterButton.isDisplayed()) {
				System.out.println("Filter button is displayed");
				componentsInformation.add(12,"Present");
			}
			else {
				System.out.println("Filter button is not displayed");
				componentsInformation.add(12,"Not Present");
			}
			
//sortbutton
			WebElement sortButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'sort')])"));
			if(sortButton.isDisplayed()) {
				System.out.println("Sort button is displayed");
				componentsInformation.add(13,"Present");
			}
			else {
				System.out.println("Sort button is not displayed");
				componentsInformation.add(13,"Not Present");
			}
			
//ticketrenderingbutton
			WebElement ticketRenderingButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_vert')])"));
			if(ticketRenderingButton.isDisplayed()) {
				System.out.println("Ticket Rendering button is displayed");
				componentsInformation.add(14,"Present");
			}
			else {
				System.out.println("Ticket Rendering button is not displayed");
				componentsInformation.add(14,"Not Present");
			}
			
//brands
			WebElement brands=driver.findElement(By.xpath("(//span[contains(text(),' Brands')])"));
			if(brands.isDisplayed()) {
				System.out.println("Brands is displayed");
				componentsInformation.add(15,"Present");
			}
			else {
				System.out.println("Brands is not displayed");
				componentsInformation.add(15,"Not Present");
			}
			
//BrandData
			WebElement brandsData=driver.findElement(By.xpath("(//span[contains(@class,'mat-menu-trigger keywords__name')])[1]"));
			if(brandsData.isDisplayed()) {
				System.out.println("Brands data is displayed");
				componentsInformation.add(16,"Present");
			}
			else {
				System.out.println("Brands data is not displayed");
				componentsInformation.add(16,"Not Present");
			}
			
//duration
			WebElement duration=driver.findElement(By.xpath("(//span[contains(text(),' Duration')])"));
			if(duration.isDisplayed()) {
				System.out.println("Duration is displayed");
				componentsInformation.add(17,"Present");
			}
			else {
				System.out.println("Duration is not displayed");
				componentsInformation.add(17,"Not Present");
			}
			
//duration data
			WebElement durationData=driver.findElement(By.xpath("(//span[contains(@class,'mat-menu-trigger keywords__name')])[2]"));
			if(durationData.isDisplayed()) {
				System.out.println("Duration Data is displayed");
				componentsInformation.add(18,"Present");
			}
			else {
				System.out.println("Duration Data is not displayed");
				componentsInformation.add(18,"Not Present");
			}
			
            componentsInformation.add(19,CommonFunctions.getDataTime());
			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"AgentTicketTabUIComponent");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
