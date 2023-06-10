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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LocobuzzAgentQueueManagementAgentWorkflow {
	private static final String[] String[] = null;
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
				} else {
				System.out.println(" Adv. Response Management is not displayed");
				}
			js.executeScript("arguments[0].click()", Management);
			Thread.sleep(3000);

//Agent Queue Management
			
			WebElement AgentManagement = driver.findElement(By.xpath("(//span[contains(text(),'Agent Queue Management')])[1]"));
			WebElement AgentManagementlogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Agent_Queue_Management.svg']"));			
			if (AgentManagement.isDisplayed() && AgentManagementlogo.isDisplayed()) {
				System.out.println("Agent Queue Management Field is displayed");
				} else {
				System.out.println("Agent Queue Management Field  is not displayed");
	                   }
			js.executeScript("arguments[0].click()", AgentManagement);
			Thread.sleep(3000);
			

//Agent Queue Management tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement AgentManagementTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Agent Queue Management')])[2]"));
			if (pushpin.isDisplayed() && AgentManagementTab.isDisplayed()) {
				System.out.println("Agent Queue Management tab is displayed");
				
			} else {
				System.out.println("Agent Queue Management tab is not displayed");
				
			}

//Agent Queue Management Heading and  information
			WebElement agentqueueHeading = driver.findElement(By.xpath("//p[contains(text(),'Agent Queue Management')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(text(),'Agent Queue Management')]//following::P[1]"));
			if (agentqueueHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Agent Queue Management Heading and  information is displayed");
			} else {
				System.out.println("Agent Queue Management Heading and  information is not displayed");
			       }
			
//select User
			WebElement selectuser= driver
					.findElement(By.xpath("//input[@data-placeholder='Search by User Name']"));
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			
			if (selectuser.isDisplayed() && symbol.isDisplayed()) {
				System.out.println("select User field is displayed");
				Thread.sleep(3000);
			} else {
				System.out.println("select User field is not displayed");
		           }
			selectuser.sendKeys("komal");
			js.executeScript("arguments[0].click()",symbol );
			Thread.sleep(5000);
			
//Filter Field
			WebElement filter = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt')])"));
			if (filter.isDisplayed()) {
				System.out.println("Filter Field is displayed");
		       }else {
				System.out.println("Filter Field is not displayed");
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
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[1]"));
			if (Userroleheading.isDisplayed() && dropdown.isDisplayed()) 
				System.out.println("Filter UI Components are displayed");
			 else 
				System.out.println(" Filter UI Components are not displayed");
				
			Thread.sleep(3000);

//Brand Textbox
			 
			WebElement Brandheading = driver.findElement(By.xpath("(//mat-label[contains(text(),'Brands')])"));
			Thread.sleep(3000);
			WebElement dropdown1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[2]"));
			if (Brandheading.isDisplayed() && dropdown1.isDisplayed()) 
				System.out.println("Brand Textbox  field is displayed");
			 else 
				System.out.println("Brand Textbox  field is not displayed");
				
						
//Apply Button
			WebElement Apply = driver
					.findElement(By.xpath("(//span[contains(text(),'Apply')])"));
			if (Brandheading.isDisplayed() && dropdown1.isDisplayed()) 
				System.out.println("Apply Button is Present");
			 else 
				System.out.println("Apply Button is not Present");
	        js.executeScript("arguments[0].click()",Apply );
			Thread.sleep(3000);	
			
			verifyuserdetails(driver);



			
}                       catch (Exception e) {
						e.printStackTrace();
						throw e;}
}
public static void verifyuserdetails(WebDriver driver) throws Exception {
try {
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
//Verify all coloumns			
			
//1.Username
	
			WebElement Username = driver.findElement(By.xpath("(//div[contains(text(),'Username')])"));			
			js.executeScript("arguments[0].click()",Username );
			Thread.sleep(3000);
			WebElement sortuser = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-pointer-right ng-tns-c')])[1]"));	
			if (Username.isDisplayed() && sortuser.isDisplayed() ) {
				System.out.println("Username and Filter Option is Present");
		      } else {
				System.out.println("Username and Filter Option is not Present");
				}
			js.executeScript("arguments[0].click()",sortuser );
			Thread.sleep(7000);		
			System.out.println("Filter Option is Working");
			WebElement AgentUser = driver.findElement(By.xpath("(//span[contains(text(),'komal_agent')])"));
			System.out.println("Selected user:" +AgentUser.getText());

//Role Coloumn
			
			WebElement role = driver.findElement(By.xpath("(//th[contains(text(),'Role')])"));
			if (role.isDisplayed()) 
				System.out.println("Role of particular user  is Present");
			else 
				System.out.println("Role of particular user is not Present");
			WebElement Userrole = driver.findElement(By.xpath("(//span[contains(text(),'Agent')])[6]"));
			System.out.println("Selected user:" +Userrole.getText());
			
	
//Selected Brands
			
			WebElement Selectedbrands = driver.findElement(By.xpath("(//th[contains(text(),' Selected Brands ')])"));
			if (Selectedbrands.isDisplayed()) 
				System.out.println("Selected brands for that user field is Present");
			 else 
				System.out.println("Selected brands for that user field is  not Present");
			
			

//Assignments
			
			WebElement Assignments = driver.findElement(By.xpath("(//div[contains(text(),'Assignment')])"));			
			js.executeScript("arguments[0].click()",Assignments );
			Thread.sleep(3000);
			WebElement sortassignments = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-pointer-right ng-tns-c')])[2]"));	
			if (Assignments.isDisplayed() && sortassignments.isDisplayed() ) 
				System.out.println("Assignments and Filter Option is Present");
		    else 
				System.out.println("Assignments and Filter Option is not Present");
			js.executeScript("arguments[0].click()",sortassignments );
			Thread.sleep(5000);		
			System.out.println("Filter Option is Working");

//Tickets Assigned
			
			WebElement TicketsAssignments = driver.findElement(By.xpath("(//th[contains(text(),'Tickets Assigned')])"));
			if (TicketsAssignments.isDisplayed()) 
				System.out.println("Tickets Assigned for that user field is Present");
			 else 
				System.out.println("Tickets Assigned for that user field is  not Present");
				
			

//Log in Status
			
			WebElement loginstatus = driver.findElement(By.xpath("(//div[contains(text(),'Login Status')])"));			
			js.executeScript("arguments[0].click()",loginstatus );
			Thread.sleep(3000);
			WebElement sortloginstatus = driver.findElement(By.xpath("(//div[contains(@class,'mat-sort-header-pointer-right ng-tns-c')])[3]"));	
			if (loginstatus.isDisplayed() && sortloginstatus.isDisplayed() ) 
				System.out.println("Log in Status is Present");
			else 
				System.out.println("Log in Status is not Present");
			js.executeScript("arguments[0].click()",sortloginstatus );
			Thread.sleep(5000);		
			System.out.println("Filter Option is Working");

//Action
			
			WebElement Action = driver.findElement(By.xpath("(//div[contains(text(),'Action')])"));
			if (Action.isDisplayed()) 
				System.out.println("Action for that user field is Present");
			else 
				System.out.println("Action for that user field is  not Present");

}		  
catch (Exception e) 
{
e.printStackTrace();
throw e;}
}
public static void Verifyingactionafterlogin(Class<java.lang.String[]> class1,WebDriver driver) throws Exception {
try {
    Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;

// Agentlogin
// To handle parent window
	
    String parent = driver.getWindowHandle();
    System.out.println("Main window handle is " + parent);
    Thread.sleep(2000);
 
  //Child window Handle
    
    ((JavascriptExecutor)driver).executeScript("window.open()");
    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    driver.get("https://locobuzzng-uat-aws.locobuzz.com/login");
	Thread.sleep(5000);
	CommonFunctions.login(driver, "Agent");
	Thread.sleep(7000);
    driver.switchTo().window(tabs.get(0)); 
	Thread.sleep(5000);
  
//Back to parent tab and verifying details
	WebElement selectuser= driver.findElement(By.xpath("//input[@data-placeholder='Search by User Name']")); 
	selectuser.clear();
	selectuser.sendKeys("komal_agent");
	Thread.sleep(5000);
	WebElement filter = driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt')])"));
	js.executeScript("arguments[0].click()",filter );
    Thread.sleep(3000);
	WebElement dropdown = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[1]"));
    js.executeScript("arguments[0].click()",dropdown );
	Thread.sleep(3000);
	WebElement AgentRoleSelect = driver.findElement(By.xpath("(//span[contains(text(),'Agent')])[8]"));
    js.executeScript("arguments[0].click()",AgentRoleSelect );
	Thread.sleep(3000);
	WebElement Apply = driver.findElement(By.xpath("(//span[contains(text(),'Apply')])"));
	js.executeScript("arguments[0].click()",Apply );
	Thread.sleep(3000);

//Click on Search Symbol
	
		
     WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
     if (symbol.isDisplayed()) 
	 System.out.println("select User field is displayed");
	 else 
	 System.out.println("select User field is not displayed");
     js.executeScript("arguments[0].click()",symbol );
     Thread.sleep(5000);  

//get count of assigned tickets
	/*WebElement getcount = driver.findElement(By.xpath("//span[contains(text(),' Get Count ')]"));
	js.executeScript("arguments[0].click()",getcount );
	Thread.sleep(3000);
	WebElement getcountexact = driver.findElement(By.xpath("(//span[contains(@class,'font-weight-')])[3]"));
	System.out.println("No.of Assigned Tickets:" + getcountexact.getText());
	Thread.sleep(1000);*/

//Force logout Action
	WebElement forcelogout = driver.findElement(By.xpath("(//mat-icon[contains(text(),' logout')])"));
	js.executeScript("arguments[0].click()",forcelogout );
	System.out.println("logout action:" + forcelogout.getText());
	Thread.sleep(7000);
	
//Verifying in Agent Account
	driver.switchTo().window(tabs.get(1)); 
	Thread.sleep(5000);
	WebElement backtologin = driver.findElement(By.xpath("(//a[contains(@class,'back-login hoverBtn')])"));
	js.executeScript("arguments[0].click()",backtologin );
	Thread.sleep(5000);
	
	
//Verifying in Supervisor Account	
	driver.switchTo().window(tabs.get(0));
	WebElement symbol1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
	js.executeScript("arguments[0].click()",symbol1 );
	Thread.sleep(5000);

//login from child tab 
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(2000);
	CommonFunctions.login(driver, "Agent");
    Thread.sleep(7000);
	
	
    driver.switchTo().window(tabs.get(0)); 
	Thread.sleep(5000);
	//WebElement symbol1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
	js.executeScript("arguments[0].click()",symbol1 );
	Thread.sleep(5000);
//Log Out From Supervisor Account	
	WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
	js.executeScript("arguments[0].click()", arrowBack);
	Thread.sleep(3000);			

}                       
catch (Exception e) 
{
e.printStackTrace();
throw e;}
}     
       			
	
}
