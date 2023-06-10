package com.test.java.utilities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocoSLABreachLinkedINWorkflow {
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
	
public static void SLABreachLinkedINWorkflow(WebDriver driver) throws Exception {
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
			Action action = actions.sendKeys(Mins, "4").sendKeys(Keys.ENTER).build();
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
			Action action2 = actions2.sendKeys(minsfield, "2").sendKeys(Keys.ENTER).build();
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
			Action action1 = actions1.sendKeys(TCMins, "5").sendKeys(Keys.ENTER).build();
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
			Action action3 = actions3.sendKeys(cuntdwnmins, "3").sendKeys(Keys.ENTER).build();
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
			js.executeScript("arguments[0].click()", LinkedIN);
			Thread.sleep(3000);
//LinkedIN Channel Custom SLA Settings	
			WebElement LinkedINcustomheading=driver.findElement(By.xpath("//p[contains(text(),'LinkedIn Channel Custom SLA Settings')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", LinkedINcustomheading);
//LinkedIN FLR
			WebElement LinkedINFLRHeading=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])[2]"));
		    WebElement LinkedINFLRHrs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[10]"));
			WebElement LinkedINFLRMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[11]"));
//LinkedIN Ticket Closure			
			WebElement LinkedINTC=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", LinkedINTC);
			WebElement LinkedINTCHrs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[12]"));
			WebElement LinkedINTCMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[13]"));
			if(LinkedINFLRHeading.isDisplayed()&&LinkedINFLRHrs.isDisplayed()&&LinkedINFLRMins.isDisplayed()&&LinkedINTCHrs.isDisplayed()
			&& LinkedINTCMins.isDisplayed() && LinkedINcustomheading.isDisplayed() && LinkedINFLRHrs.isDisplayed()		) {
			System.out.println("LinkedIN Channel Custom SLA Settings is Present");
			}
			else {
			System.out.println("LinkedIN Channel Custom SLA Settings is not Present");
			}
			Thread.sleep(3000);
			
//LinkedIN Accounts Custom SLA Settings
			WebElement Heading=driver.findElement(By.xpath("//p[contains(text(),'LinkedIn Accounts Custom SLA Settings')]"));
			WebElement ConfiguredLN=driver.findElement(By.xpath("(//span[contains(text(),'(Test solutions pvt)')])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ConfiguredLN);
			js.executeScript("arguments[0].click()", ConfiguredLN);
			Thread.sleep(5000);
			if(ConfiguredLN.isDisplayed()  && Heading.isDisplayed()) {
			System.out.println("LinkedIN Accounts Custom SLA Settings Fieild is Present");
			}
			else {
			System.out.println("LinkedIN Accounts Custom SLA Settings Fieild is not Present");
			}
			Thread.sleep(3000);
			
		    
// LinkedIN Account Custom First Level Response SLA
			WebElement CustomLNFLR=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CustomLNFLR);
			WebElement CustomLNFLRHRs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[14]"));
			WebElement CustomLNFLRMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[15]"));
			if(CustomLNFLR.isDisplayed() && CustomLNFLRHRs.isDisplayed() && CustomLNFLRMins.isDisplayed()) {
			System.out.println("LinkedIN Account Custom First Level Response SLAis displayed");
		    }
			else {
			System.out.println("LinkedIN Account Custom First Level Response SLA is not displayed");
			}
		    Thread.sleep(3000);
// LinkedIN Account Custom Ticket Closure SLA.
			WebElement CustomeLNTC=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CustomeLNTC);
			WebElement CustomeLNTCHRs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[16]"));
			WebElement CustomeLNTCMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[17]"));
			if(CustomeLNTC.isDisplayed() && CustomeLNTCHRs.isDisplayed() && CustomeLNTCMins.isDisplayed()) {
			System.out.println("LinkedIN Account Custom Ticket Closure SLA is Present");
			}
			else {
			System.out.println("LinkedIN Account Custom Ticket Closure SLA is not Present");
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
			LinkedInticketGeneration(driver);
		
}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
public static void LinkedInticketGeneration(WebDriver driver)throws Exception{

try {
	//Second  Child window Handle
		 String parent = driver.getWindowHandle();
		    System.out.println("Main window handle is " + parent);
		    Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
	//Child window Handle
		    
		    ((JavascriptExecutor)driver).executeScript("window.open()");
		    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));  
		
			driver.get("https://www.linkedin.com/login");
			Thread.sleep(5000);

	//Login
			//Login
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("komal.mali@locobuzz.com");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("Loco@123");
			Thread.sleep(3000);
			WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
			js.executeScript("arguments[0].click()", login);
			Thread.sleep(3000);
			try {
			WebElement notificationPopUp = driver.findElement(By.xpath("//button[contains(text(),'Skip')]"));
			if (notificationPopUp.isDisplayed()) {
					notificationPopUp.click();
			}
			} catch (Exception e) {
				//instagramLogo.click();
			}
			
			System.out.println("LinkedIN login successful");
			Thread.sleep(3000);
	//Message  
			//WebElement messengerButton = driver.findElement(
					//By.xpath("//span[contains(text(),'Messaging')]"));
			//js.executeScript("arguments[0].click()", messengerButton);
			Thread.sleep(3000);
			
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement userMessenger = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'msg-conversation-card__row')])[3]")));
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", userMessenger);
			if (userMessenger.isDisplayed()) {
				System.out.println("User messenger is displayed");
			} else {
				System.out.println("User messenger is not displayed");
			}
			Thread.sleep(2000);
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate = formatter.format(date);

			WebElement messenges = driver.findElement(By.xpath("//div[@aria-label='Write a message…']"));
			String facebookDynamicMessage = "LinkedIN test" + " " + strDate;
			messenges.sendKeys(facebookDynamicMessage);
			Thread.sleep(3000);
			WebElement send = driver.findElement(By.xpath("//button[@type='submit']"));
			js.executeScript("arguments[0].click()", send);
			Thread.sleep(5000);
			System.out.println("Message sent successful");
			
//Message  
			WebElement messengerButton1 = driver.findElement(
					By.xpath("//span[contains(text(),'Messaging')]"));
			js.executeScript("arguments[0].click()", messengerButton1);
			Thread.sleep(3000);
			
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			WebElement userMessenger2 = wait2.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Shifa Shaikh')]")));
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", userMessenger2);
			if (userMessenger.isDisplayed()) {
				System.out.println("User messenger is displayed");
			} else {
				System.out.println("User messenger is not displayed");
			}
			Thread.sleep(2000);
			Date date2 = new Date();
			SimpleDateFormat formatter2 = new SimpleDateFormat("ddMMyyyyhhmmss");
			String strDate2 = formatter2.format(date2);

			WebElement messenges2 = driver.findElement(By.xpath("//div[@aria-label='Message']"));
			String facebookDynamicMessage2 = "LinkedIN test" + " " + strDate2;
			messenges.sendKeys(facebookDynamicMessage2);
			Thread.sleep(3000);
			WebElement send2= driver.findElement(By.xpath("//button[@type='submit']"));
			js.executeScript("arguments[0].click()", send2);
			Thread.sleep(5000);
			System.out.println("Message sent successful");
			Thread.sleep(5000);
		driver.switchTo().window(tabs.get(0));
		gototicketstab(driver);
	
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void gototicketstab(WebDriver driver) throws Exception {
	try {

//tickets tab
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
	    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
		WebElement ticketsTab = driver
				.findElement(By.xpath("//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));
       
		Thread.sleep(5000);
        WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		js.executeScript("arguments[0].click()", Brandselect);
		Thread.sleep(5000);
		WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrand);
		Thread.sleep(5000);
		WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Auto Demo')]"));
		js.executeScript("arguments[0].click()", Selectbrand1);
		Thread.sleep(5000);
		WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		js.executeScript("arguments[0].click()", Apply);
		Thread.sleep(5000);
		
//Searching ticket and deleting from locobuzz
		WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[1]"));
		js.executeScript("arguments[0].click()", search);
		Thread.sleep(5000);
	    WebElement inputbox = driver.findElement(By.id("post-search-input"));
		inputbox.sendKeys("komal");
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", search);
		Thread.sleep(60000);
		Thread.sleep(60000);
		Thread.sleep(65000);
		WebElement TWticket1=driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
		js.executeScript("arguments[0].click()", TWticket1);
		Thread.sleep(3000);
		WebElement deleteTW = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
		js.executeScript("arguments[0].click()", deleteTW);
		Thread.sleep(10000);
		WebElement yesTW = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		js.executeScript("arguments[0].click()", yesTW);
		Thread.sleep(3000);
//Unselect XYZ Brand
		WebElement Brandselect1 = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		js.executeScript("arguments[0].click()", Brandselect1);
		WebElement Selectbrand2 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrand2);
		Thread.sleep(3000);
		WebElement Apply3 = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		js.executeScript("arguments[0].click()", Apply3);
		Thread.sleep(3000);
		WebElement arrow = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
		js.executeScript("arguments[0].click()", arrow);
		Thread.sleep(3000);
//Filter
		WebElement Filter=driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt')])"));
		js.executeScript("arguments[0].click()", Filter);
		Thread.sleep(3000);
		WebElement Tktsmens=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Tickets and mentions')])"));
		js.executeScript("arguments[0].click()", Tktsmens);
		Thread.sleep(3000);
		WebElement SLA=driver.findElement(By.xpath("(//mat-label[contains(text(),'SLA')])"));
		js.executeScript("arguments[0].click()", SLA);
		Thread.sleep(3000);
		WebElement AlreadBreached=driver.findElement(By.xpath("(//span[contains(text(),' SLA Already Breached ')])"));
		js.executeScript("arguments[0].click()", AlreadBreached);
		Thread.sleep(3000);
		WebElement Apply1=driver.findElement(By.xpath("(//span[contains(text(),'Apply')])"));
		js.executeScript("arguments[0].click()", Apply1);
		Thread.sleep(10000);
		WebElement Filter1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'filter_alt')])"));
		js.executeScript("arguments[0].click()", Filter1);
		Thread.sleep(3000);
		WebElement Tktsmens1=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Tickets and mentions')])"));
		js.executeScript("arguments[0].click()", Tktsmens1);
		Thread.sleep(3000);
		WebElement SLA1=driver.findElement(By.xpath("(//mat-label[contains(text(),'SLA')])"));
		js.executeScript("arguments[0].click()", SLA1);
		Thread.sleep(3000);
		WebElement AlreadBreached1=driver.findElement(By.xpath("(//span[contains(text(),' SLA About To Breached ')])"));
		js.executeScript("arguments[0].click()", AlreadBreached1);
		Thread.sleep(3000);
		WebElement Apply11=driver.findElement(By.xpath("(//span[contains(text(),'Apply')])"));
		js.executeScript("arguments[0].click()", Apply11);
		Thread.sleep(10000);
}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
		}
		}
}





