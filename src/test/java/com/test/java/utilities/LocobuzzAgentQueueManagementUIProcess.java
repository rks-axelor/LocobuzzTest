package com.test.java.utilities;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAgentQueueManagementUIProcess {
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

	

	public static void AgentQueueManagementUIVerificationprocess(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//  Adv. Response Management 
			WebElement Management=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),' Adv. Response Management ')])[1]"));
			if (Management.isDisplayed()) {
				System.out.println(" Adv. Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println(" Adv. Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", Management);
			Thread.sleep(3000);

//Agent Queue Management
			
			WebElement AgentManagement = driver.findElement(By.xpath("(//span[contains(text(),'Agent Queue Management')])[1]"));
			WebElement AgentManagementlogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Agent_Queue_Management.svg']"));			
			if (AgentManagement.isDisplayed() && AgentManagementlogo.isDisplayed()) {
				System.out.println("Agent Queue Management Field is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Agent Queue Management Field  is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", AgentManagement);
			Thread.sleep(3000);
			

//Agent Queue Management tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement AgentManagementTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Agent Queue Management')])[2]"));
			if (pushpin.isDisplayed() && AgentManagementTab.isDisplayed()) {
				System.out.println("Agent Queue Management tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Agent Queue Management tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//Agent Queue Management Heading and  information
			WebElement agentqueueHeading = driver.findElement(By.xpath("//p[contains(text(),'Agent Queue Management')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(text(),'Agent Queue Management')]//following::P[1]"));
			if (agentqueueHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Agent Queue Management Heading and  information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Agent Queue Management Heading and  information is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
//select User
			WebElement selectbrand = driver
					.findElement(By.xpath("//input[@data-placeholder='Search by User Name']"));
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			
			if (selectbrand.isDisplayed() && symbol.isDisplayed()) {
				System.out.println("select User field is displayed");
				Thread.sleep(3000);
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("select User field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			js.executeScript("arguments[0].click()",symbol );
			Thread.sleep(5000);
			
//Filter Field
			WebElement filter = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt')])"));
			if (filter.isDisplayed()) {
				System.out.println("Filter Field is displayed");
				componentsInformation.add(5, "Present");
			}else {
				System.out.println("Filter Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}
				js.executeScript("arguments[0].click()",filter );
				Thread.sleep(5000);
				System.out.println("Filter Field UI Is displayed");





//Filter UI Components
//User role textbox 
			WebElement Userroleheading = driver
					.findElement(By.xpath("(//mat-label[contains(text(),'User Role')])"));
			Thread.sleep(3000);
			WebElement dropdown = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[3]"));
			if (Userroleheading.isDisplayed() && dropdown.isDisplayed()) {
				System.out.println("User role textbox  field is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("User role textbox  field is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//Brand Textbox
			 
			WebElement Brandheading = driver
					.findElement(By.xpath("(//mat-label[contains(text(),'Brands')])"));
			Thread.sleep(3000);
			WebElement dropdown1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[4]"));
			if (Brandheading.isDisplayed() && dropdown1.isDisplayed()) {
				System.out.println("Brand Textbox  field is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Brand Textbox  field is not displayed");
				componentsInformation.add(7, "Not Present");
			}			
//Clear All Button
			WebElement clearall = driver.findElement(By.xpath("(//span[contains(text(),'Clear All')])"));
			if (clearall.isDisplayed()) {
				System.out.println("Clear All Button is Present");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Clear All Button is not Present");
				componentsInformation.add(8, "Not Present");
			}
			

			
//Apply Button
			WebElement Apply = driver
					.findElement(By.xpath("(//span[contains(text(),'Apply')])"));
			if (Apply.isDisplayed()) {
				System.out.println("Apply Button is Present");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Apply Button is not Present");
				componentsInformation.add(9, "Not Present");
			}
			
//Cancel Button
			WebElement Cancel = driver
					.findElement(By.xpath("(//span[contains(text(),'Cancel')])"));
			if (Cancel.isDisplayed()) {
				System.out.println("Cancel Button is Present");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Cancel Button is not Present");
				componentsInformation.add(10, "Not Present");
			}
			js.executeScript("arguments[0].click()",Cancel );
			Thread.sleep(3000);			

//select on user 			
					
		    js.executeScript("arguments[0].click()",selectbrand );
			Thread.sleep(3000);
			selectbrand.sendKeys("komal");
			js.executeScript("arguments[0].click()",symbol );
			Thread.sleep(3000);
			
//User data UI Components			
			
//1.Username			
			WebElement Username = driver.findElement(By.xpath("(//div[contains(text(),'Username')])"));			
			js.executeScript("arguments[0].click()",Username );
			Thread.sleep(3000);
			WebElement sortuser = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-pointer-right ng-tns-c')])[1]"));	
			if (Username.isDisplayed() && sortuser.isDisplayed() ) {
				System.out.println("Username and Filter Option is Present");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Username and Filter Option is not Present");
				componentsInformation.add(11, "Not Present");
			}
			js.executeScript("arguments[0].click()",sortuser );
			Thread.sleep(7000);		
			System.out.println("Filter Option is Working");

//Role Coloumn
			WebElement role = driver.findElement(By.xpath("(//th[contains(text(),'Role')])"));
			if (role.isDisplayed()) {
				System.out.println("Role of particular user  is Present");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Role of particular user is not Present");
				componentsInformation.add(12, "Not Present");
			}
	
//Selected Brands
			WebElement Selectedbrands = driver.findElement(By.xpath("(//th[contains(text(),' Selected Brands ')])"));
			if (Selectedbrands.isDisplayed()) {
				System.out.println("Selected brands for that user field is Present");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Selected brands for that user field is  not Present");
				componentsInformation.add(13, "Not Present");
			}

//Assignments			
			WebElement Assignments = driver.findElement(By.xpath("(//div[contains(text(),'Assignment')])"));			
			js.executeScript("arguments[0].click()",Assignments );
			Thread.sleep(3000);
			WebElement sortassignments = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-pointer-right ng-tns-c')])[2]"));	
			if (Assignments.isDisplayed() && sortassignments.isDisplayed() ) {
				System.out.println("Assignments and Filter Option is Present");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Assignments and Filter Option is not Present");
				componentsInformation.add(14, "Not Present");
			}
			js.executeScript("arguments[0].click()",sortassignments );
			Thread.sleep(5000);		
			System.out.println("Filter Option is Working");

//Tickets Assigned
			WebElement TicketsAssignments = driver.findElement(By.xpath("(//th[contains(text(),'Tickets Assigned')])"));
			if (TicketsAssignments.isDisplayed()) {
				System.out.println("Tickets Assigned for that user field is Present");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Tickets Assigned for that user field is  not Present");
				componentsInformation.add(15, "Not Present");
			}

//Log in Status
			
			WebElement loginstatus = driver.findElement(By.xpath("(//div[contains(text(),'Login Status')])"));			
			js.executeScript("arguments[0].click()",loginstatus );
			Thread.sleep(3000);
			WebElement sortloginstatus = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-pointer-right ng-tns-c')])[3]"));	
			if (loginstatus.isDisplayed() && sortloginstatus.isDisplayed() ) {
				System.out.println("Log in Status is Present");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Log in Status is not Present");
				componentsInformation.add(16, "Not Present");
			}
			js.executeScript("arguments[0].click()",sortloginstatus );
			Thread.sleep(5000);		
			System.out.println("Filter Option is Working");

//Action
			WebElement Action = driver.findElement(By.xpath("(//div[contains(text(),'Action')])"));
			if (Action.isDisplayed()) {
				System.out.println("Action for that user field is Present");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Action for that user field is  not Present");
				componentsInformation.add(17, "Not Present");
			}

			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			componentsInformation.add(18, CommonFunctions.getDataTime());
			
		
	
	
				
			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "Agentqueuemanagement");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
}
}

