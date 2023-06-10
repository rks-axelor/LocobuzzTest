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

public class LocoSLABreachAccount2WorkFlow {
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
			Thread.sleep(5000);
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
	
public static void SLABreachAccountWorkflow(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Response Management
			WebElement responsemngt=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Response Management')])[1]"));
			if(responsemngt.isDisplayed()) {
			System.out.println("Response Management is displayed");
			}
			else {
			System.out.println("Response Management is not displayed");
			}
			js.executeScript("arguments[0].click()", responsemngt);
			Thread.sleep(3000);
			
//SLA Breach Label in Account Section
			WebElement SLABreachLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/SLA_Breach.svg']"));
			WebElement SLAreachlabel=driver.findElement(By.xpath("(//span[contains(text(),'SLA Breach')])"));
			if(SLABreachLogo.isDisplayed() && SLAreachlabel.isDisplayed()) {
			System.out.println("SLA Breach Label in Account Section is displayed");
			}
			else {
			System.out.println("Personal Details Settings  Label in Account Section is not displayed");
			}
			js.executeScript("arguments[0].click()", SLAreachlabel);
			Thread.sleep(3000);
			
//SLA Breach tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement SLABreachtab=driver.findElement(By.xpath("(//span[contains(text(),'SLA Breach')])[2]"));
			if(pushpin.isDisplayed()&&SLABreachtab.isDisplayed()) {
			System.out.println("SLA Breach tab is displayed");
			}
			else {
			System.out.println("SLA Breach tab is not displayed");
			}
			Thread.sleep(3000);
			
//SLA Breach Heading and Information	
            WebElement SLAHeading=driver.findElement(By.xpath("(//p[contains(text(),'SLA Breach')])[1]"));
			WebElement SLAInformation=driver.findElement(By.xpath("(//p[contains(text(),'SLA Breach')])//following::p[1]"));
			if(SLAHeading.isDisplayed()&&SLAInformation.isDisplayed()) {
			System.out.println("SLA Breach Heading and Information is displayed");
			}
			else {
			System.out.println("SLA Breach Heading and Information is not displayed");
			}
			Thread.sleep(3000);

//Select Brand Field
			WebElement selectBrand=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
			WebElement selectbrandTxbx=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns-c')])"));
			WebElement selectbrdDrpdn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])"));
			if(selectBrand.isDisplayed() && selectbrandTxbx.isDisplayed() && selectbrdDrpdn.isDisplayed()) {
			System.out.println("Select Brand Field is present");
			}
			else {
			System.out.println("Select Brand Field is not present");
			}
		    js.executeScript("arguments[0].click()", selectbrdDrpdn);
			Thread.sleep(2000);
			WebElement searchbrand=driver.findElement(By.xpath("(//input[@data-placeholder='Search brand name'])"));
			WebElement searchicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchbrand);
			WebElement autodemo=driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
			js.executeScript("arguments[0].click()", autodemo);
			Thread.sleep(2000);

//Preview of SLA Breach Notification on the Tickets Field	
            WebElement preview=driver.findElement(By.xpath("(//span[contains(text(),'Preview of SLA Notification on the tickets')])"));
            js.executeScript("arguments[0].click()", preview);
            Thread.sleep(5000);
			WebElement close=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			js.executeScript("arguments[0].click()", close);
			if(preview.isDisplayed() && close.isDisplayed()) {
			System.out.println("Preview of SLA Breach Notification on the Tickets Field is displayed");			}
			else {
			System.out.println("Preview of SLA Breach Notification on the Tickets Field is not displayed");
			}
			Thread.sleep(2000);
		
//First Level Response SLA Heading and Information
            WebElement FLRHeading=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])"));
			WebElement FLRInfo=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])//following::p[1]"));
			WebElement Hours=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-flex ng-tns-c')])[3]"));
			WebElement Mins=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-flex ng-tns-c')])[4]"));
			if(FLRHeading.isDisplayed()&& FLRInfo.isDisplayed() &&  Hours.isDisplayed() && Mins.isDisplayed()) {
			System.out.println("First Level Response SLA Heading and Information is displayed");
			}
			else {
			System.out.println("First Level Response SLA Heading and Information is not displayed");
			}
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Mins, "15").sendKeys(Keys.ENTER).build();
	        action.perform();
			Thread.sleep(3000);
			
	
// Send Alert Notification Before Breach Label and Check
			WebElement sentalertlabel=driver.findElement(By.xpath("//p[contains(text(),'Send Alert Notification before Breach')]"));
			WebElement checkbox=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[1]"));
			WebElement minsfield=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[5]"));
			if(sentalertlabel.isDisplayed() && checkbox.isDisplayed() && minsfield.isDisplayed()) {
			System.out.println(" Send Alert Notification Before Breach Label and Checkbox is displayed");
			}
			else {
			System.out.println(" Send Alert Notification Before Breach Label and Checkbox is not displayed");
			}
			js.executeScript("arguments[0].click()", checkbox);
			Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(minsfield, "5").sendKeys(Keys.ENTER).build();
	        action2.perform();
			Thread.sleep(3000);
			
//Ticket Closure SLA Headings and Information
		    WebElement TCHeading=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])"));
			WebElement TCInfo=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])//following::p[1]"));
			WebElement TCHours=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-flex ng-tns-c')])[6]"));
			WebElement TCMins=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-flex ng-tns-c')])[7]"));
			if(TCHeading.isDisplayed()&& TCInfo.isDisplayed() &&  TCHours.isDisplayed() && TCMins.isDisplayed()) {
			System.out.println("Ticket Closure SLA Headings and Information is displayed");
			}
			else {
			System.out.println("Ticket Closure SLA Headings and Information is not displayed");
			}
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(TCMins, "30").sendKeys(Keys.ENTER).build();
	        action1.perform();
			Thread.sleep(3000);
			
	
			
//Show Countdown before Closure checkbox and label
			WebElement closurecntdwnlabel=driver.findElement(By.xpath("//p[contains(text(),'Show Countdown Before Closure')]"));
			WebElement closurecntdwnchbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[2]"));
			WebElement cuntdwnmins=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-flex ng-tns-c')])[8]"));
			WebElement cuntdwnsec=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-flex ng-tns-c')])[9]"));
			if(closurecntdwnlabel.isDisplayed()&&closurecntdwnchbx.isDisplayed()&&cuntdwnmins.isDisplayed()&&cuntdwnsec.isDisplayed()) {
			System.out.println("Show Countdown before Closure checkbox and label Field is Present");
			}
			else {
			System.out.println("Show Countdown before Closure checkbox and label is not  Present");
			}
			js.executeScript("arguments[0].click()", closurecntdwnchbx);
			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(cuntdwnmins, "10").sendKeys(Keys.ENTER).build();
	        action3.perform();
			Thread.sleep(3000);
			
//Custome Settings Heading and its Information
			WebElement customheading=driver.findElement(By.xpath("//p[contains(text(),'Custom Settings')]"));
			WebElement custominfo=driver.findElement(By.xpath("//p[contains(text(),'Custom Settings')]//following::p[1]"));
			if(customheading.isDisplayed()&&custominfo.isDisplayed()) {
			System.out.println("Custome Settings Heading and its Information is Present");
			}
			else {
			System.out.println("Custome Settings Heading and its Information is not Present");
			}
			Thread.sleep(3000);
			
//Channels Present			
			WebElement Email=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[1]"));
			WebElement Twitter=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[2]"));
			WebElement Facebook=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[3]"));
			WebElement LinkedIN=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[4]"));
			WebElement Instagram=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[5]"));
			WebElement Youtube=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[6]"));
			if(Email.isDisplayed()&&Twitter.isDisplayed() &&Facebook.isDisplayed() &&LinkedIN.isDisplayed() 
			&&Instagram.isDisplayed() &&Youtube.isDisplayed()) {
			System.out.println("All Channels ara Present");
			}
			else {
			System.out.println("All Channels are not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Email);
			Thread.sleep(3000);
//Email Channel Custom SLA Settings	
			WebElement emailcustomheading=driver.findElement(By.xpath("//p[contains(text(),'Email Channel Custom SLA Settings')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", emailcustomheading);
// Email FLR
			WebElement EmailFLRHeading=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])[2]"));
		    WebElement EmailFLRHrs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[10]"));
			WebElement EmailFLRMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[11]"));
//Email Ticket Closure			
			WebElement EmailTC=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", EmailTC);
			WebElement EmailTCHrs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[12]"));
			WebElement EmailTCMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[13]"));
			if(emailcustomheading.isDisplayed()&&EmailFLRHeading.isDisplayed()&&EmailTC.isDisplayed()&&EmailFLRHrs.isDisplayed()
			&& EmailFLRMins.isDisplayed() && EmailTCHrs.isDisplayed() && EmailTCMins.isDisplayed()		) {
			System.out.println("Email Channel Custom SLA Settings is Present");
			}
			else {
			System.out.println("Email Channel Custom SLA Settings is not Present");
			}
			Thread.sleep(3000);
			
//Email Accounts Custom SLA Settings
			WebElement Heading=driver.findElement(By.xpath("//p[contains(text(),'Email Accounts Custom SLA Settings')]"));
			WebElement logo=driver.findElement(By.xpath("(//img[@src='assets/images/account/Email_account_icon.svg'])[1]"));
			WebElement ConfiguredEmail=driver.findElement(By.xpath("(//span[contains(text(),'(testing.komal2612@gmail.com)')])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ConfiguredEmail);
			WebElement Drpdwn=driver.findElement(By.xpath("(//span[contains(@class,'mat-expansion-indicator ng-tns-c')])[2]"));
			if(logo.isDisplayed() && ConfiguredEmail.isDisplayed() && Drpdwn.isDisplayed() && Heading.isDisplayed()) {
			System.out.println("Email Accounts Custom SLA Settings Fieild is Present");
			}
			else {
			System.out.println("Email Accounts Custom SLA Settings Fieild is not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Drpdwn);
			Thread.sleep(3000);
		    
// Email Account Custom First Level Response SLA
			WebElement CustomEmailFLR=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CustomEmailFLR);
			WebElement CustomEmailFLRHRs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[14]"));
			WebElement CustomEmailFLRMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[15]"));
			if(CustomEmailFLR.isDisplayed() && CustomEmailFLRHRs.isDisplayed() && CustomEmailFLRMins.isDisplayed()) {
			System.out.println("Email Account Custom First Level Response SLAis displayed");
		    }
			else {
			System.out.println("Email Account Custom First Level Response SLA is not displayed");
			}
		    Thread.sleep(3000);
// Email Account Custom Ticket Closure SLA.
			WebElement CustomeEmailTC=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CustomeEmailTC);
			WebElement CustomeEmailTCHRs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[16]"));
			WebElement CustomeEmailTCMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[17]"));
			if(CustomeEmailTC.isDisplayed() && CustomeEmailTCHRs.isDisplayed() && CustomeEmailTCMins.isDisplayed()) {
			System.out.println("Email Account Custom Ticket Closure SLA is Present");
			}
			else {
			System.out.println("Email Account Custom Ticket Closure SLA is not Present");
			}
		    Thread.sleep(3000);	

//Save Button
		    WebElement SaveButton=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", SaveButton);
			js.executeScript("arguments[0].click()", SaveButton);
			Thread.sleep(2000);
			
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


