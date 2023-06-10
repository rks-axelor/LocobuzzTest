package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAgentCommonUIComponents {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void verifyingCommonUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//tickets tab
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));
			js.executeScript("arguments[0].click()", ticketsTab);
			
//take a break
			WebElement cafeSymbol=driver.findElement(By.xpath("//mat-icon[contains(text(),'local_cafe')]"));
			WebElement takeABreak=driver.findElement(By.xpath("//span[contains(text(),'Take a Break')]"));
			if(cafeSymbol.isDisplayed() && takeABreak.isDisplayed()) {
				System.out.println("Take a Break is displayed");
				componentsInformation.add(0,"Present" );
			}
			else {
				System.out.println("Take a Break is not displayed");
				componentsInformation.add(0,"Not Present" );
			}
			
//doublearrow
			WebElement doubleArrow=driver.findElement(By.xpath("//mat-icon[contains(text(),'double_arrow')]"));
			if(doubleArrow.isDisplayed()) {
				System.out.println("Double Arrow is displayed");
				componentsInformation.add(1,"Present" );
			}
			else {
				System.out.println("Double Arrow is not displayed");
				componentsInformation.add(1,"Not Present" );
			}
			
//daterange
			WebElement dateRange=driver.findElement(By.xpath("//span[@class='hover align-center']"));
			if(dateRange.isDisplayed()) {
				System.out.println("Date range is displayed");
				componentsInformation.add(2,"Present" );
			}
			else {
				System.out.println("Date range is not displayed");
				componentsInformation.add(2,"Not Present" );
			}
			
//refreshbutton
			WebElement refreshButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]"));
			if(refreshButton.isDisplayed()) {
				System.out.println("Refresh button is displayed");
				componentsInformation.add(3,"Present" );
			}
			else {
				System.out.println("Refresh button is not displayed");
				componentsInformation.add(3,"Not Present" );
			}
			
//tickets
			WebElement tickets=driver.findElement(By.xpath("(//span[contains(text(),'Tickets')])[1]"));
			if(tickets.isDisplayed()) {
				System.out.println("Tickets is displayed");
				componentsInformation.add(4,"Present" );
			}
			else {
				System.out.println("Tickets is not displayed");
				componentsInformation.add(4,"Not Present" );
			}
			
//open
			WebElement open=driver.findElement(By.xpath("(//span[contains(text(),'Open')])[1]"));
			if(open.isDisplayed()) {
				System.out.println("Open is displayed");
				componentsInformation.add(5,"Present" );
			}
			else {
				System.out.println("Open is not displayed");
				componentsInformation.add(5,"Not Present" );
			}
			
//pending
			WebElement pending=driver.findElement(By.xpath("(//span[contains(text(),'Pending')])[1]"));
			if(pending.isDisplayed()) {
				System.out.println("Pending is displayed");
				componentsInformation.add(6,"Present" );
			}
			else {
				System.out.println("Pending is not displayed");
				componentsInformation.add(6,"Not Present" );
			}
			
//awaiting
			WebElement awaiting=driver.findElement(By.xpath("(//span[contains(text(),'Awaiting')])[1]"));
			if(awaiting.isDisplayed()) {
				System.out.println("Awaiting is displayed");
				componentsInformation.add(7,"Present" );
			}
			else {
				System.out.println("Awaiting is not displayed");
				componentsInformation.add(7,"Not Present" );
			}
			
//unassigned tickets
			WebElement unassignedTickets=driver.findElement(By.xpath("(//span[contains(text(),'Unassigned Tickets')])"));
			if(unassignedTickets.isDisplayed()) {
				System.out.println("Unassigned Tickets is displayed");
				componentsInformation.add(8,"Present" );
			}
			else {
				System.out.println("Unassigned Tickets is not displayed");
				componentsInformation.add(8,"Not Present" );
			}
			
//FLR
			WebElement flr=driver.findElement(By.xpath("(//span[contains(text(),'FLR')])"));
			if(flr.isDisplayed()) {
				System.out.println("FLR is displayed");
				componentsInformation.add(9,"Present" );
			}
			else {
				System.out.println("FLR is not displayed");
				componentsInformation.add(9,"Not Present" );
			}
			
//SLA
			WebElement sla=driver.findElement(By.xpath("(//span[contains(text(),'SLA')])"));
			if(sla.isDisplayed()) {
				System.out.println("SLA is displayed");
				componentsInformation.add(10,"Present" );
			}
			else {
				System.out.println("SLA is not displayed");
				componentsInformation.add(10,"Not Present" );
			}
			
//about to breach
			WebElement aboutToBreach=driver.findElement(By.xpath("(//span[contains(text(),'About To Breach')])[1]"));
			if(aboutToBreach.isDisplayed()) {
				System.out.println("About To Breach is displayed");
				componentsInformation.add(11,"Present" );
			}
			else {
				System.out.println("About To Breach is not displayed");
				componentsInformation.add(11,"Not Present" );
			}
			
//Already Breached
			WebElement alreadyBreached=driver.findElement(By.xpath("(//span[contains(text(),'Already Breached')])[1]"));
			if(alreadyBreached.isDisplayed()) {
				System.out.println("Already Breached is displayed");
				componentsInformation.add(12,"Present" );
			}
			else {
				System.out.println("Already Breached is not displayed");
				componentsInformation.add(12,"Not Present" );
			}
			
//max assignment limit
			WebElement maxAssignmentLimit=driver.findElement(By.xpath("(//span[contains(text(),'Max Assignment Limit')])"));
			if(maxAssignmentLimit.isDisplayed()) {
				System.out.println("Max Assignment Limit is displayed");
				componentsInformation.add(13,"Present" );
			}
			else {
				System.out.println("Max Assignment Limit is not displayed");
				componentsInformation.add(13,"Not Present" );
			}
			
//assigned
			WebElement assigned=driver.findElement(By.xpath("(//span[contains(text(),'Assigned')])"));
			if(assigned.isDisplayed()) {
				System.out.println("Assigned is displayed");
				componentsInformation.add(14,"Present" );
			}
			else {
				System.out.println("Assigned is not displayed");
				componentsInformation.add(14,"Not Present" );
			}
			
//total tickets
			WebElement totalTickets=driver.findElement(By.xpath("(//span[contains(text(),'Total Tickets')])"));
			if(totalTickets.isDisplayed()) {
				System.out.println("Total Tickets is displayed");
				componentsInformation.add(15,"Present" );
			}
			else {
				System.out.println("Total Tickets is not displayed");
				componentsInformation.add(15,"Not Present" );
			}
			
//Alltickets
			WebElement allTickets=driver.findElement(By.xpath("(//span[contains(text(),'All Tickets')])"));
			if(allTickets.isDisplayed()) {
				System.out.println("All Tickets is displayed");
				componentsInformation.add(16,"Present" );
			}
			else {
				System.out.println("All Tickets is not  displayed");
				componentsInformation.add(16,"Not Present" );
			}
			
//closedtickets
			WebElement closedTickets=driver.findElement(By.xpath("(//span[contains(text(),'Closed Tickets')])[1]"));
			if(closedTickets.isDisplayed()) {
				System.out.println("Closed Tickets is displayed");
				componentsInformation.add(17,"Present" );
			}
			else {
				System.out.println("Closed Tickets is not displayed");
				componentsInformation.add(17,"Not Present" );
			}
			
//unassigned about to breached
			WebElement unassignedBreached=driver.findElement(By.xpath("(//span[contains(text(),'Unassigned About To Breached')])"));
			if(unassignedBreached.isDisplayed()) {
				System.out.println("Unassigned About to Breached is displayed");
				componentsInformation.add(18,"Present" );
			}
			else {
				System.out.println("Unassigned About to Breached is notdisplayed");
				componentsInformation.add(18,"Not Present" );
			}
			
//unassigned already breached
			WebElement unassignedAlreadyBreached=driver.findElement(By.xpath("(//span[contains(text(),'Unassigned Already Breached')])"));
			if(unassignedAlreadyBreached.isDisplayed()) {
				System.out.println("Unassigned Already Breached is displayed");
				componentsInformation.add(19,"Present" );
			}
			else {
				System.out.println("Unassigned Already Breached is not displayed");
				componentsInformation.add(19,"Not Present" );
			}
			
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
			
		}
	}
	
	public static void locobuzzTabs(WebDriver driver)  throws Exception {
		try {
			
			Thread.sleep(5000);
			WebElement sideBar=driver.findElement(By.xpath("//span[@class='sidebar__head--navicon']"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);
			
//Locobuzzlogo
			WebElement locobuzzLogo=driver.findElement(By.xpath("//img[@src='assets/locobuzz-logo.svg']"));
			if(locobuzzLogo.isDisplayed()) {
				System.out.println("Locobuzz image is dispalyed");
				componentsInformation.add(20,"Present" );
			}
			else {
				System.out.println("Locobuzz image is not dispalyed");
				componentsInformation.add(20,"Not Present" );
			}
			
//social inbox
			WebElement inboxSymbol=driver.findElement(By.xpath("//mat-icon[contains(text(),'inbox')]"));
			WebElement socialInbox=driver.findElement(By.xpath("//span[contains(text(),' Social Inbox')]"));
			WebElement socialInboxPin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			if(inboxSymbol.isDisplayed()&&socialInbox.isDisplayed()&&socialInboxPin.isDisplayed()) {
				System.out.println("Social Inbox is displayed");
				componentsInformation.add(21,"Present" );
			}
			else {
				System.out.println("Social Inbox is not displayed");
				componentsInformation.add(21,"Not Present" );
			}
			
//Account
			WebElement account=driver.findElement(By.xpath("(//span[contains(text(), ' Accounts')])"));
			WebElement accountPin=driver.findElement(By.xpath("(//mat-icon[contains(text(), 'push_pin')])[2]"));
			if(account.isDisplayed()&&accountPin.isDisplayed()) {
				System.out.println("Account is displayed");
				componentsInformation.add(22,"Present" );
			}
			else {
				System.out.println("Account is not displayed");
				componentsInformation.add(22,"Not Present" );
			}
			
//compose
			WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			WebElement compose=driver.findElement(By.xpath("(//span[contains(text(),'Compose')])"));
			if(edit.isDisplayed()&&compose.isDisplayed()) {
				System.out.println("Compose is displayed");
				componentsInformation.add(23,"Present" );
			}
			else {
				System.out.println("Compose is not displayed");
				componentsInformation.add(23,"Not Present" );
			}
			
//userlogin name
			WebElement userimage=driver.findElement(By.xpath("//img[@src='https://cdn.pixabay.com/photo/2020/07/01/12/58/icon-5359553_1280.png']"));
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[1]"));
			WebElement agentDashBoard=driver.findElement(By.xpath("//span[contains(text(),'Agent Dashboard')]"));
			if(userimage.isDisplayed()&&expand.isDisplayed()&&agentDashBoard.isDisplayed()) {
				System.out.println("user login name is displayed");
				componentsInformation.add(24,"Present" );
			}
			else {
				System.out.println("user login name is not displayed");
				componentsInformation.add(24,"Not Present" );
			}
			
			componentsInformation.add(25,CommonFunctions.getDataTime());
			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"AgentCommonUIComponents");
		
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
