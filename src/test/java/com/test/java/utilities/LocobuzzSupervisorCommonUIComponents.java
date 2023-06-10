package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzSupervisorCommonUIComponents {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void verifyingCommonUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//tickets tab
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));
			js.executeScript("arguments[0].click()", ticketsTab);
			
//doublearrow
			WebElement doubleArrow=driver.findElement(By.xpath("//mat-icon[contains(text(),'double_arrow')]"));
			if(doubleArrow.isDisplayed()) {
				System.out.println("Double Arrow is displayed");
				componentsInformation.add(0,"Present" );
			}
			else {
				System.out.println("Double Arrow is not displayed");
				componentsInformation.add(0,"Not Present" );
			}
			
//daterange
			WebElement dateRange=driver.findElement(By.xpath("//span[@class='hover align-center']"));
			if(dateRange.isDisplayed()) {
				System.out.println("Date range is displayed");
				componentsInformation.add(1,"Present" );
			}
			else {
				System.out.println("Date range is not displayed");
				componentsInformation.add(1,"Not Present" );
			}
			
//refreshbutton
			WebElement refreshButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]"));
			if(refreshButton.isDisplayed()) {
				System.out.println("Refresh button is displayed");
				componentsInformation.add(2,"Present" );
			}
			else {
				System.out.println("Refresh button is not displayed");
				componentsInformation.add(2,"Not Present" );
			}
			
//totaltickets
			WebElement totalTickets=driver.findElement(By.xpath("//span[contains(text(),'Total Tickets ')]"));
			if(totalTickets.isDisplayed()) {
				System.out.println("Total tickets is displayed");
				componentsInformation.add(3,"Present" );
			}
			else {
				System.out.println("Total tickets is not displayed");
				componentsInformation.add(3,"Not Present" );
			}
			
//unassigned
			WebElement unassigned=driver.findElement(By.xpath("//span[contains(text(),'Un-Assigned ')]"));
			if(unassigned.isDisplayed()) {
				System.out.println("Unassigned is displayed");
				componentsInformation.add(4,"Present" );
			}
			else {
				System.out.println("Unassigned is not displayed");
				componentsInformation.add(4,"Not Present" );
			}
			
//workinprogress
			WebElement workInProgress=driver.findElement(By.xpath("//span[contains(text(),'Work In Progress ')]"));
			if(workInProgress.isDisplayed()) {
				System.out.println("Work in progress is displayed");
				componentsInformation.add(5,"Present" );
			}
			else {
				System.out.println("Work in progress is not displayed");
				componentsInformation.add(5,"Not Present" );
			}
			
//closed
			WebElement closed=driver.findElement(By.xpath("(//span[contains(text(),'Closed ')])[1]"));
			if(closed.isDisplayed()) {
				System.out.println("Closed is displayed");
				componentsInformation.add(6,"Present" );
			}
			else {
				System.out.println("Closed is not displayed");
				componentsInformation.add(6,"Not Present" );
			}
			
//FLR
			WebElement flr=driver.findElement(By.xpath("(//span[contains(text(),'FLR ')])"));
			if(flr.isDisplayed()) {
				System.out.println("FLR is displayed");
				componentsInformation.add(7,"Present" );
			}
			else {
				System.out.println("FLR is not displayed");
				componentsInformation.add(7,"Not Present" );
			}
			
//SLA
			WebElement sla=driver.findElement(By.xpath("(//span[contains(text(),'SLA ')])"));
			if(sla.isDisplayed()) {
				System.out.println("SLA is displayed");
				componentsInformation.add(8,"Present" );
			}
			else {
				System.out.println("SLA is not displayed");
				componentsInformation.add(8,"Not Present" );
			}
			
//about to breach
			WebElement aboutToBreach=driver.findElement(By.xpath("(//span[contains(text(),'About To Breach ')])"));
			if(aboutToBreach.isDisplayed()) {
				System.out.println("About to breach is displayed");
				componentsInformation.add(9,"Present" );
			}
			else {
				System.out.println("About to breach is not displayed");
				componentsInformation.add(9,"Not Present" );
			}
			
//already breached
			WebElement alreadyBreached=driver.findElement(By.xpath("(//span[contains(text(),'Already Breached ')])[1]"));
			if(alreadyBreached.isDisplayed()) {
				System.out.println("Already  breached is displayed");
				componentsInformation.add(10,"Present" );
			}
			else {
				System.out.println("Already  breached is not displayed");
				componentsInformation.add(10,"Not Present" );
			}
			
//activeagents
			WebElement activeAgents=driver.findElement(By.xpath("(//span[contains(text(),'No Of Active Agents ')])"));
			if(activeAgents.isDisplayed()) {
				System.out.println("Active agents is displayed");
				componentsInformation.add(11,"Present" );
			}
			else {
				System.out.println("Active agents is not  displayed");
				componentsInformation.add(11,"Not Present" );
			}
			
//on break
			WebElement onBreak=driver.findElement(By.xpath("//span[contains(text(),'On Break ')]"));
			if(onBreak.isDisplayed()) {
				System.out.println("On break is displayed");
				componentsInformation.add(12,"Present" );
			}
			else {
				System.out.println("On break is not displayed");
				componentsInformation.add(12,"Not Present" );
			}
			
//avg AHT
			WebElement avgAHT=driver.findElement(By.xpath("//span[contains(text(),'Avg AHT ')]"));
			if(avgAHT.isDisplayed()) {
				System.out.println("Avg AHT is displayed");
				componentsInformation.add(13,"Present" );
			}
			else {
				System.out.println("Avg AHT is not displayed");
				componentsInformation.add(13,"Not Present" );
			}
			
//unassigned about to breached
			WebElement unassignedBreach=driver.findElement(By.xpath("//span[contains(text(),'Unassigned About To Breached ')]"));
			if(unassignedBreach.isDisplayed()) {
				System.out.println("Unassigned about to breached is displayed");
				componentsInformation.add(14,"Present" );
			}
			else {
				System.out.println("Unassigned about to breached is not displayed");
				componentsInformation.add(14,"Not Present" );
			}
			
//unassigned already breached
			WebElement unassignedAlreadyBreached=driver.findElement(By.xpath("//span[contains(text(),'Unassigned Already Breached ')]"));
			if(unassignedAlreadyBreached.isDisplayed()) {
				System.out.println("Unassigned already breached is displayed");
				componentsInformation.add(15,"Present" );
			}
			else {
				System.out.println("Unassigned already breached is not displayed");
				componentsInformation.add(15,"Not Present" );
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
				componentsInformation.add(16,"Present" );
			}
			else {
				System.out.println("Locobuzz image is not dispalyed");
				componentsInformation.add(16,"Not Present" );
			}
			
//social inbox
			WebElement inboxSymbol=driver.findElement(By.xpath("//mat-icon[contains(text(),'inbox')]"));
			WebElement socialInbox=driver.findElement(By.xpath("//span[contains(text(),' Social Inbox')]"));
			WebElement socialInboxPin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			if(inboxSymbol.isDisplayed()&&socialInbox.isDisplayed()&&socialInboxPin.isDisplayed()) {
				System.out.println("Social Inbox is displayed");
				componentsInformation.add(17,"Present" );
			}
			else {
				System.out.println("Social Inbox is not displayed");
				componentsInformation.add(17,"Not Present" );
			}
			
//Account
			WebElement account=driver.findElement(By.xpath("(//span[contains(text(), ' Accounts')])"));
			WebElement accountPin=driver.findElement(By.xpath("(//mat-icon[contains(text(), 'push_pin')])[2]"));
			if(account.isDisplayed()&&accountPin.isDisplayed()) {
				System.out.println("Account is displayed");
				componentsInformation.add(18,"Present" );
			}
			else {
				System.out.println("Account is not displayed");
				componentsInformation.add(18,"Not Present" );
			}
			
//compose
			WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			WebElement compose=driver.findElement(By.xpath("(//span[contains(text(),'Compose')])"));
			if(edit.isDisplayed()&&compose.isDisplayed()) {
				System.out.println("Compose is displayed");
				componentsInformation.add(19,"Present" );
			}
			else {
				System.out.println("Compose is not displayed");
				componentsInformation.add(19,"Not Present" );
			}
			
//userlogin name
			WebElement userimage=driver.findElement(By.xpath("//img[@src='https://cdn.pixabay.com/photo/2020/07/01/12/58/icon-5359553_1280.png']"));
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[1]"));
			WebElement supervisorDashBoard=driver.findElement(By.xpath("//span[contains(text(),'Supervisor Dashboard')]"));
			if(userimage.isDisplayed()&&expand.isDisplayed()&&supervisorDashBoard.isDisplayed()) {
				System.out.println("user login name is displayed");
				componentsInformation.add(20,"Present" );
			}
			else {
				System.out.println("user login name is not displayed");
				componentsInformation.add(20,"Not Present" );
			}
			
			componentsInformation.add(21,CommonFunctions.getDataTime());
			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"SupervisorCommonUIComponents");
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
