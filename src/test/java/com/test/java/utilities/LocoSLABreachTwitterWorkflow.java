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

public class LocoSLABreachTwitterWorkflow {
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
	
public static void SLABreachTwitterWorkflow(WebDriver driver) throws Exception {
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
			Action action = actions.sendKeys(Mins, "5").sendKeys(Keys.ENTER).build();
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
			Action action2 = actions2.sendKeys(minsfield, "3").sendKeys(Keys.ENTER).build();
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
			js.executeScript("arguments[0].click()", Twitter);
			Thread.sleep(3000);
//Twitter Channel Custom SLA Settings	
			WebElement Twittercustomheading=driver.findElement(By.xpath("//p[contains(text(),'Twitter Channel Custom SLA Settings')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Twittercustomheading);
// Twitter FLR
			WebElement TwitterFLRHeading=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])[2]"));
		    WebElement TwitterFLRHrs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[10]"));
			WebElement TwitterFLRMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[11]"));
//Twitter Ticket Closure			
			WebElement TwitterTC=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", TwitterTC);
			WebElement TwitterTCHrs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[12]"));
			WebElement TwitterTCMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[13]"));
			if(Twittercustomheading.isDisplayed()&&TwitterFLRHeading.isDisplayed()&&TwitterTC.isDisplayed()&&TwitterFLRHrs.isDisplayed()
			&& TwitterFLRMins.isDisplayed() && TwitterTCHrs.isDisplayed() && TwitterTCMins.isDisplayed()) {
			System.out.println("Twitter Channel Custom SLA Settings is Present");
			}
			else {
			System.out.println("Twitter Channel Custom SLA Settings is not Present");
			}
			Thread.sleep(3000);
			
//Twitter Accounts Custom SLA Settings
			WebElement Heading=driver.findElement(By.xpath("//p[contains(text(),'Twitter Handles Custom SLA Settings')]"));
			WebElement ConfiguredTW=driver.findElement(By.xpath("(//span[contains(text(),'(KalyanChinni11)')])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ConfiguredTW);
			WebElement Drpdwn=driver.findElement(By.xpath("(//span[contains(@class,'mat-expansion-indicator ng-tns-c')])[5]"));
			if(ConfiguredTW.isDisplayed() && Drpdwn.isDisplayed() && Heading.isDisplayed()) {
			System.out.println("Twitter Accounts Custom SLA Settings Fieild is Present");
			}
			else {
			System.out.println("Twitter Accounts Custom SLA Settings Fieild is not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Drpdwn);
			Thread.sleep(3000);
		    
// Twitter Account Custom First Level Response SLA
			WebElement CustomTwFLR=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CustomTwFLR);
			WebElement CustomTwFLRHRs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[14]"));
			WebElement CustomTwFLRMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[15]"));
			if(CustomTwFLR.isDisplayed() && CustomTwFLRHRs.isDisplayed() && CustomTwFLRMins.isDisplayed()) {
			System.out.println("Twitter Account Custom First Level Response SLAis displayed");
		    }
			else {
			System.out.println("Twitter Account Custom First Level Response SLA is not displayed");
			}
		    Thread.sleep(3000);
// Twitter Account Custom Ticket Closure SLA.
			WebElement CustomeTWTC=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CustomeTWTC);
			WebElement CustomeTWTCHRs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[16]"));
			WebElement CustomeTWTCMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[17]"));
			if(CustomeTWTC.isDisplayed() && CustomeTWTCHRs.isDisplayed() && CustomeTWTCMins.isDisplayed()) {
			System.out.println("Twitter Account Custom Ticket Closure SLA is Present");
			}
			else {
			System.out.println("Twitter Account Custom Ticket Closure SLA is not Present");
			}
		    Thread.sleep(3000);	

//Save Button
		    WebElement SaveButton=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", SaveButton);
			js.executeScript("arguments[0].click()", SaveButton);
			Thread.sleep(2000);
			
			/*WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);*/
			TitanBrandSLASettings(driver);
			TwitterticketGeneration(driver);
		
}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
public static void TwitterticketGeneration(WebDriver driver)throws Exception{

try {
	 ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));	
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.get("https://twitter.com/");
		Thread.sleep(5000);
		//Login
		WebElement signUp = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
		js.executeScript("arguments[0].click()", signUp);
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.name("text"));
		username.sendKeys("@Komal87224405");
		Thread.sleep(3000);
		WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		js.executeScript("arguments[0].click()", next);
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Loco@123");
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
		js.executeScript("arguments[0].click()", login);
		Thread.sleep(4000);
		System.out.println("Tweet Login Successful");

//Tweet		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
		String strDate = formatter.format(date);

		WebElement messages = driver.findElement(By.xpath("(//span[contains(text(),'Messages')])[2]"));
		js.executeScript("arguments[0].click()", messages);
		Thread.sleep(4000);
		WebElement kalyandm = driver.findElement(By.xpath("(//span[contains(text(),'Kalyan Chinni')])[1]"));
		js.executeScript("arguments[0].click()", kalyandm);
		Thread.sleep(4000);
		WebElement kalyandmarea = driver.findElement(By.xpath("(//div[contains(@class,'public-DraftStyleDefault-block public-DraftStyleDefault-ltr')])"));
		js.executeScript("arguments[0].click()", kalyandmarea);
		Thread.sleep(4000);
		//String twitterDynamicMessage = "   twitter test" + " " + strDate;
		Actions actions2 = new Actions(driver);
		Action action2 = actions2.sendKeys(kalyandmarea, "   twitter test + strDate").sendKeys(Keys.ENTER).build();
        action2.perform();
		Thread.sleep(3000);

		//WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
		//js.executeScript("arguments[0].click()", tweetButton);
		//Thread.sleep(4000);
		System.out.println("Tweet posted Successfully");
		//driver.close();
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
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;	
	    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
		Thread.sleep(30000);
		
		WebElement ticketsTab = driver
				.findElement(By.xpath("//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));
       
		Thread.sleep(30000);

		
		WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		js.executeScript("arguments[0].click()", Brandselect);
		WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrand);
		WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Auto Demo')]"));
		js.executeScript("arguments[0].click()", Selectbrand1);
		WebElement Selectbrand3 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Titan')]"));
		js.executeScript("arguments[0].click()", Selectbrand3);
		WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		js.executeScript("arguments[0].click()", Apply);
		Thread.sleep(60000);
		Thread.sleep(60000);
//Searching ticket and deleting from locobuzz
		WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[1]"));
		js.executeScript("arguments[0].click()", search);
		Thread.sleep(4000);
		WebElement inputbox = driver.findElement(By.id("post-search-input"));
		inputbox.sendKeys("komal");
		Thread.sleep(4000);
		js.executeScript("arguments[0].click()", search);
		Thread.sleep(60000);
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
		WebElement Selectbrandx = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrandx);
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
public static void TitanBrandSLASettings(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
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
			WebElement autodemo=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
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
			/*js.executeScript("arguments[0].click()", checkbox);
			Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(minsfield, "13").sendKeys(Keys.ENTER).build();
	        action2.perform();
			Thread.sleep(3000);*/
			
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
			Action action3 = actions3.sendKeys(cuntdwnmins, "13").sendKeys(Keys.ENTER).build();
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
			js.executeScript("arguments[0].click()", Twitter);
			Thread.sleep(3000);
//Twitter Channel Custom SLA Settings	
			WebElement Twittercustomheading=driver.findElement(By.xpath("//p[contains(text(),'Twitter Channel Custom SLA Settings')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Twittercustomheading);
// Twitter FLR
			WebElement TwitterFLRHeading=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])[2]"));
		    WebElement TwitterFLRHrs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[10]"));
			WebElement TwitterFLRMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[11]"));
//Twitter Ticket Closure			
			WebElement TwitterTC=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", TwitterTC);
			WebElement TwitterTCHrs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[12]"));
			WebElement TwitterTCMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[13]"));
			if(Twittercustomheading.isDisplayed()&&TwitterFLRHeading.isDisplayed()&&TwitterTC.isDisplayed()&&TwitterFLRHrs.isDisplayed()
			&& TwitterFLRMins.isDisplayed() && TwitterTCHrs.isDisplayed() && TwitterTCMins.isDisplayed()) {
			System.out.println("Twitter Channel Custom SLA Settings is Present");
			}
			else {
			System.out.println("Twitter Channel Custom SLA Settings is not Present");
			}
			Thread.sleep(3000);
			
//Twitter Accounts Custom SLA Settings
			WebElement Heading=driver.findElement(By.xpath("//p[contains(text(),'Twitter Handles Custom SLA Settings')]"));
			WebElement ConfiguredTW=driver.findElement(By.xpath("(//span[contains(text(),'(KalyanChinni11)')])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ConfiguredTW);
			WebElement Drpdwn=driver.findElement(By.xpath("(//span[contains(@class,'mat-expansion-indicator ng-tns-c')])[5]"));
			if(ConfiguredTW.isDisplayed() && Drpdwn.isDisplayed() && Heading.isDisplayed()) {
			System.out.println("Twitter Accounts Custom SLA Settings Fieild is Present");
			}
			else {
			System.out.println("Twitter Accounts Custom SLA Settings Fieild is not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Drpdwn);
			Thread.sleep(3000);
		    
// Twitter Account Custom First Level Response SLA
			WebElement CustomTwFLR=driver.findElement(By.xpath("(//p[contains(text(),'First Level Response SLA')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CustomTwFLR);
			WebElement CustomTwFLRHRs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[14]"));
			WebElement CustomTwFLRMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[15]"));
			if(CustomTwFLR.isDisplayed() && CustomTwFLRHRs.isDisplayed() && CustomTwFLRMins.isDisplayed()) {
			System.out.println("Twitter Account Custom First Level Response SLAis displayed");
		    }
			else {
			System.out.println("Twitter Account Custom First Level Response SLA is not displayed");
			}
		    Thread.sleep(3000);
// Twitter Account Custom Ticket Closure SLA.
			WebElement CustomeTWTC=driver.findElement(By.xpath("(//p[contains(text(),'Ticket Closure SLA')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", CustomeTWTC);
			WebElement CustomeTWTCHRs=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[16]"));
			WebElement CustomeTWTCMins=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[17]"));
			if(CustomeTWTC.isDisplayed() && CustomeTWTCHRs.isDisplayed() && CustomeTWTCMins.isDisplayed()) {
			System.out.println("Twitter Account Custom Ticket Closure SLA is Present");
			}
			else {
			System.out.println("Twitter Account Custom Ticket Closure SLA is not Present");
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



