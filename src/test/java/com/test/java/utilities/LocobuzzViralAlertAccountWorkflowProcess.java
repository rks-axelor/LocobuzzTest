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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LocobuzzViralAlertAccountWorkflowProcess {

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

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[1]"));
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
	
	public static void LocobuzzViralAlertUIVerification(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Premium Features
			WebElement premium=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Premium Features')]"));
			WebElement premiumdrpdwn=driver.findElement(By.xpath("(//span[contains(@class,'mat-expansion-indicator ng-tns-c')])[6]"));
			if(premium.isDisplayed() && premiumdrpdwn.isDisplayed()) {
				System.out.println("Premium Features is displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Premium Features is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", premium);
			Thread.sleep(5000);
			
//Viral Alert
			
			WebElement viralalertlabel=driver.findElement(By.xpath("(//span[contains(text(),'Viral Alerts')])[1]"));
			WebElement ViralAlertlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Viral_Alerts.svg']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", viralalertlabel);
			Thread.sleep(5000);
			if(ViralAlertlogo.isDisplayed()&&viralalertlabel.isDisplayed()) {
				System.out.println("Viral Alert Logo and Label is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Viral Alert Logo and Label is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			
			js.executeScript("arguments[0].click()", viralalertlabel);
			Thread.sleep(3000);
			
//Viral Alert Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement VATab=driver.findElement(By.xpath("(//span[contains(text(),'Viral Alerts')])[2]"));
			if(pushpin.isDisplayed() && VATab.isDisplayed()) {
				System.out.println("Viral Alert Tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Viral Alert Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}
			
//Viral Alert Heading And Information
			WebElement VAHeading=driver.findElement(By.xpath("(//p[contains(text(),'Viral Alert')])"));
			WebElement VAinfromation=driver.findElement(By.xpath("(//p[contains(text(),'Viral Alert')])//following::div[3]"));
			if(VAHeading.isDisplayed()&&VAinfromation.isDisplayed()) {
				System.out.println("Viral Alert Heading And Information is displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Viral Alert Heading And Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//search Brand field
			WebElement searchField=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow ng-tns-c')])"));
			js.executeScript("arguments[0].click()", searchField);
			Thread.sleep(3000);
//Search By Brand Name			
			WebElement searchbybrand=driver.findElement(By.xpath("(//input[@data-placeholder='Search brand name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchbybrand.isDisplayed()&&symbol.isDisplayed()) {
				System.out.println("Search Brand Field is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Search Brand Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			js.executeScript("arguments[0].click()", searchbybrand);
			Thread.sleep(3000);
			WebElement selectbrand=driver.findElement(By.xpath("(//span[contains(text(),'Saurabh Brand1')])[1]"));
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(3000);

//feature Active Field
			WebElement FeatureHeading=driver.findElement(By.xpath("(//p[contains(text(),'Feature Active')])"));
			WebElement Featuretoggle=driver.findElement(By.xpath("(//label[contains(@class,'rounded-toggle-switch-label')])"));
			if(FeatureHeading.isDisplayed() && Featuretoggle.isDisplayed()) {
				System.out.println("feature Active Field is displayed");
				componentsInformation.add(5, "Present");
			}
			else {
				System.out.println("feature Active Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", Featuretoggle);
			Thread.sleep(3000);
			System.out.println("feature Active Field is Disable");
			js.executeScript("arguments[0].click()", Featuretoggle);
			Thread.sleep(3000);
			System.out.println("feature Active Field is Enable");
			Thread.sleep(3000);

//Search By Subject Name Field
			
			WebElement searchsubField=driver.findElement(By.xpath("(//input[@placeholder='Search by Subject'])"));
			WebElement subsymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchsubField.isDisplayed()&&subsymbol.isDisplayed()) {
				System.out.println("Search By Subject Name Field is displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Search By Subject Name Field is not displayed");
				componentsInformation.add(6, "Not Present");
			}
			Thread.sleep(3000);
//create Alert
			WebElement createalert=driver.findElement(By.xpath("(//span[contains(text(),'Create New Alert')])"));
			WebElement alertadd=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])"));
			if(createalert.isDisplayed() && alertadd.isDisplayed()) {
				System.out.println("create Alert Field is displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("create Alert Field is not  displayed");
				componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", createalert);
			Thread.sleep(3000);
			
//Configure Viral Alert heading
			WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Configure Viral Alert')]"));
			WebElement arrow=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			if(heading.isDisplayed()&& arrow.isDisplayed()) {
				System.out.println("Configure Viral Alert heading is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Configure Viral Alert heading is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			Thread.sleep(3000);

//Email Alert Subject Field
			WebElement EmailsubHead=driver.findElement(By.xpath("//p[contains(text(),'Email Alert Subject')]"));
			WebElement EmailsubInfo=driver.findElement(By.xpath("//p[contains(text(),'Email Alert Subject ')]//following::p[1]"));
			WebElement submust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[1]"));
			WebElement Subnametxbx=driver.findElement(By.xpath("//mat-label[contains(text(),'Email Subject Name')]"));
            if(EmailsubHead.isDisplayed() && EmailsubInfo.isDisplayed() && submust.isDisplayed() && Subnametxbx.isDisplayed() ) {
				System.out.println("Email Alert Subject Field is displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Email Alert Subject Field is not displayed");
				componentsInformation.add(9, "Not Present");
			}
            Actions actions = new Actions(driver);
            Action action = actions.sendKeys(Subnametxbx, "Automation Demo Alert").build();
            action.perform();
            Thread.sleep(5000);

//Schedule Alerts Field
			WebElement Schedulealert=driver.findElement(By.xpath("//p[contains(text(),'Schedule Alert(s)')]"));
			WebElement Scheduleinfo=driver.findElement(By.xpath("//p[contains(text(),'Schedule Alert(s)')]//following::p[1]"));
			WebElement Fromdt=driver.findElement(By.xpath("//div[contains(text(),'From Date ')]"));
			WebElement Enddate=driver.findElement(By.xpath("//div[contains(text(),'End Date')]"));
            if(Schedulealert.isDisplayed() && Scheduleinfo.isDisplayed() && Fromdt.isDisplayed() && Enddate.isDisplayed() ) {
				System.out.println("Schedule Alerts Field is displayed");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Schedule Alerts Field is not displayed");
				componentsInformation.add(10, "Not Present");
			}
        	Thread.sleep(3000);
//Select Start Date       	
        	WebElement Selstrtdate=driver.findElement(By.xpath("(//mat-icon[contains(text(),' keyboard_arrow_down')])[1]"));
        	js.executeScript("arguments[0].click()", Selstrtdate);
			Thread.sleep(3000);
			WebElement date1=driver.findElement(By.xpath("(//button[@aria-label='August 17, 2022'])"));
        	js.executeScript("arguments[0].click()", date1);
			Thread.sleep(5000);
//Select End Date
			WebElement Enddtchbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[1]"));
        	js.executeScript("arguments[0].click()", Enddtchbx);
			Thread.sleep(3000);
			WebElement enddate=driver.findElement(By.xpath("(//mat-icon[contains(text(),' keyboard_arrow_down')])[2]"));
        	js.executeScript("arguments[0].click()", enddate);
			Thread.sleep(3000);
			WebElement date2=driver.findElement(By.xpath("(//button[@aria-label='August 30, 2022'])"));
        	js.executeScript("arguments[0].click()", date2);
			Thread.sleep(3000);
//Time Duration Field
			WebElement timeduration=driver.findElement(By.xpath("//div[contains(text(),'Time Duration')]"));
			WebElement timedurinfo=driver.findElement(By.xpath("//div[contains(text(),'Time Duration')]//following::p[1]"));
			WebElement starttime=driver.findElement(By.xpath("//input[@data-placeholder='Select start time']"));
			WebElement Endtime=driver.findElement(By.xpath("//input[@data-placeholder='Select end time']"));
            if(timeduration.isDisplayed() && timedurinfo.isDisplayed() && starttime.isDisplayed() && Endtime.isDisplayed() ) {
				System.out.println("Time Duration Field is displayed");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Time Duration Field is not displayed");
				componentsInformation.add(11, "Not Present");
			}
        	Thread.sleep(3000);
//1.Select Time Duration
        	WebElement timedur=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[2]"));
        	js.executeScript("arguments[0].click()", timedur);
			Thread.sleep(3000);
			WebElement  Sttime=driver.findElement(By.xpath("(//mat-icon[contains(text(),'query_builder')])[1]"));
        	js.executeScript("arguments[0].click()", Sttime);
			Thread.sleep(3000);
			WebElement seltm=driver.findElement(By.xpath("(//span[contains(text(),'10:00 AM')])[1]"));
        	js.executeScript("arguments[0].click()", seltm);
			Thread.sleep(3000);
			WebElement  endtime=driver.findElement(By.xpath("(//mat-icon[contains(text(),'query_builder')])[2]"));
        	js.executeScript("arguments[0].click()", endtime);
			Thread.sleep(3000);
			WebElement seltm1=driver.findElement(By.xpath("(//span[contains(text(),'10:00 PM')])[1]"));
        	js.executeScript("arguments[0].click()", seltm1);
			Thread.sleep(3000);

//Days Selection Field
			WebElement selectdays=driver.findElement(By.xpath("(//div[contains(@class,'text__regular font-weight-500')])[4]"));
			WebElement seldaysmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[3]"));
			WebElement customtime=driver.findElement(By.xpath("(//span[contains(text(),'Custom Time ')])"));
			WebElement selcutime=driver.findElement(By.xpath("(//input[@placeholder='Select custom time'])"));
            if(selectdays.isDisplayed() && seldaysmust.isDisplayed() && customtime.isDisplayed() && selcutime.isDisplayed() ) {
				System.out.println("Days Selection Field is displayed");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Days Selection Field is not displayed");
				componentsInformation.add(12, "Not Present");
			}
        	Thread.sleep(3000);
//1.Select Unselect Days of Week
			WebElement  wed=driver.findElement(By.xpath("(//span[contains(@class,'createviralalert__lef')])[3]"));
        	js.executeScript("arguments[0].click()", wed);
			Thread.sleep(3000);
			WebElement wedon=driver.findElement(By.xpath("(//span[contains(@class,'createviralalert__lef')])[4]"));
        	js.executeScript("arguments[0].click()", wedon);
			Thread.sleep(3000);        	
//2.Custom Time
			WebElement selectchannel=driver.findElement(By.xpath("(//p[contains(text(),'Select Channel(s) For Alert(s)')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selectchannel);
			WebElement  customtm=driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])"));
        	js.executeScript("arguments[0].click()", customtm);
			Thread.sleep(3000);
			WebElement t1=driver.findElement(By.xpath("//span[contains(text(),'11:00 AM')]"));
        	js.executeScript("arguments[0].click()", t1);
			Thread.sleep(3000);
			WebElement t2=driver.findElement(By.xpath("//span[contains(text(),'04:00 PM')]"));
        	js.executeScript("arguments[0].click()", t2);
			Thread.sleep(3000);
			WebElement t3=driver.findElement(By.xpath("//span[contains(text(),'09:00 PM')]"));
        	js.executeScript("arguments[0].click()", t3);
			Thread.sleep(3000);
			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(Keys.ESCAPE).build();
			action3.perform();
			Thread.sleep(3000);
//2.Daily Digest Time 
			WebElement  dailydigesttm=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[2]"));
        	js.executeScript("arguments[0].click()", dailydigesttm);
			Thread.sleep(3000);
			WebElement  dailiydigesttime=driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[1]"));
			js.executeScript("arguments[0].click()", dailiydigesttime);
			Thread.sleep(3000);
			WebElement DDTM1=driver.findElement(By.xpath("//span[contains(text(),'10:00 AM')]"));
        	js.executeScript("arguments[0].click()", DDTM1);
			Thread.sleep(3000); 
//3.Real Time
			WebElement Realtime=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[3]"));
        	js.executeScript("arguments[0].click()", Realtime);
			Thread.sleep(3000);
			WebElement  custome=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[1]"));
        	js.executeScript("arguments[0].click()", custome);
			Thread.sleep(3000);
			WebElement  customtm1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])"));
			js.executeScript("arguments[0].click()", customtm1);
			Thread.sleep(3000);
			WebElement t4=driver.findElement(By.xpath("//span[contains(text(),'11:00 AM')]"));
        	js.executeScript("arguments[0].click()", t4);
			Thread.sleep(3000);
			WebElement t5=driver.findElement(By.xpath("//span[contains(text(),'05:00 PM')]"));
        	js.executeScript("arguments[0].click()", t5);
			Thread.sleep(3000);
			WebElement t6=driver.findElement(By.xpath("//span[contains(text(),'08:00 PM')]"));
        	js.executeScript("arguments[0].click()", t6);
			Thread.sleep(3000);
			Actions actions4 = new Actions(driver);
			Action action4 = actions4.sendKeys(Keys.ESCAPE).build();
			action4.perform();
			Thread.sleep(3000);
//Select Channel Field
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selectchannel);
			WebElement selchansinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select Channel(s) For Alert(s)')])//following::p[1]"));
			WebElement selchamust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[4]"));
			
            if(selectchannel.isDisplayed() && selchansinfo.isDisplayed() && selchamust.isDisplayed() ) {
				System.out.println("Days Selection Field is displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("Days Selection Field is not displayed");
				componentsInformation.add(13, "Not Present");
			}
        	Thread.sleep(3000);
        	WebElement searchchannel=driver.findElement(By.xpath("//input[@placeholder='Search channels']"));
        	js.executeScript("arguments[0].click()", searchchannel);
			Thread.sleep(3000);
			WebElement unch1=driver.findElement(By.xpath("(//span[contains(text(),'App Store')])[2]"));
        	js.executeScript("arguments[0].click()", unch1);
			Thread.sleep(3000);
			WebElement unch2=driver.findElement(By.xpath("(//span[contains(text(),'Blogs')])[2]"));
        	js.executeScript("arguments[0].click()", unch2);
			Thread.sleep(3000);
			WebElement unch3=driver.findElement(By.xpath("(//span[contains(text(),'WhatsApp')])[2]"));
        	js.executeScript("arguments[0].click()", unch3);
			Thread.sleep(3000);
			WebElement unch4=driver.findElement(By.xpath("(//span[contains(text(),'Zomato')])[2]"));
        	js.executeScript("arguments[0].click()", unch4);
			Thread.sleep(3000);
			WebElement unch5=driver.findElement(By.xpath("(//span[contains(text(),'WhatsApp')])[1]"));
        	js.executeScript("arguments[0].click()", unch5);
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			
        	
//Sentiments Field
			WebElement Sentiments=driver.findElement(By.xpath("(//p[contains(text(),'Sentiments')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Sentiments);
			WebElement Sentimentsinfo=driver.findElement(By.xpath("//p[contains(text(),'Schedule Alert(s)')]//following::p[1]"));
			WebElement sentimentsmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[5]"));
			
            if(Sentiments.isDisplayed() && Sentimentsinfo.isDisplayed() && sentimentsmust.isDisplayed() ) {
				System.out.println("Sentiments Field is displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Sentiments Field is not displayed");
				componentsInformation.add(14, "Not Present");
			}
        	Thread.sleep(3000);
        	WebElement positive=driver.findElement(By.xpath("(//div[contains(text(),'Positive')])[1]"));
        	js.executeScript("arguments[0].click()", positive);
			Thread.sleep(3000);
			WebElement negative=driver.findElement(By.xpath("(//div[contains(text(),'Negative')])[1]"));
        	js.executeScript("arguments[0].click()", negative);
			Thread.sleep(3000);
			WebElement newtral=driver.findElement(By.xpath("(//div[contains(text(),'Neutral')])[1]"));
        	js.executeScript("arguments[0].click()", newtral);
			Thread.sleep(3000);
        	
//Select Email ID's For Alert Field
			WebElement selectid=driver.findElement(By.xpath("(//p[contains(text(),'Select Email Id(s) for Alert(s) ')])"));
			WebElement selectidinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select Email Id(s) for Alert(s) ')])//following::p[1]"));
			WebElement totxbxmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[6]"));
			
            if(selectid.isDisplayed() && selectidinfo.isDisplayed() && totxbxmust.isDisplayed() ) {
				System.out.println("Select Email ID's For Alert Field is displayed");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Select Email ID's For Alert Field is not displayed");
				componentsInformation.add(15, "Not Present");
			}
        	Thread.sleep(3000);
//Select Email in To Field        	
        	WebElement to=driver.findElement(By.xpath("(//input[@placeholder='Search emails'])[1]"));
        	js.executeScript("arguments[0].click()", to);
			Thread.sleep(3000);
			WebElement selemailto=driver.findElement(By.xpath("(//span[contains(text(),' komal_adminuat@gmail.com')])"));
        	js.executeScript("arguments[0].click()", selemailto);
			Thread.sleep(3000);
//Select Email in Cc Field        	
        	WebElement cc=driver.findElement(By.xpath("(//input[@placeholder='Search emails'])[2]"));
        	js.executeScript("arguments[0].click()", cc);
			Thread.sleep(3000);
			WebElement selemailcc=driver.findElement(By.xpath("(//span[contains(text(),'komaltl@gmail.com')])"));
        	js.executeScript("arguments[0].click()", selemailcc);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", cc);
			Thread.sleep(3000);
			WebElement selemailcc1=driver.findElement(By.xpath("(//span[contains(text(),'komalbrand@gmail.com')])"));
        	js.executeScript("arguments[0].click()", selemailcc1);
			Thread.sleep(3000);
//Select Email in Bcc Field        	
        	WebElement Bcc=driver.findElement(By.xpath("(//input[@placeholder='Search emails'])[3]"));
        	js.executeScript("arguments[0].click()", Bcc);
			Thread.sleep(3000);
			WebElement selemailbcc=driver.findElement(By.xpath("(//span[contains(text(),'komal@gmail.com')])"));
        	js.executeScript("arguments[0].click()", selemailbcc);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Bcc);
			Thread.sleep(3000);
			WebElement selemailBcc1=driver.findElement(By.xpath("(//span[contains(text(),'komalcsd@gmail.com')])"));
        	js.executeScript("arguments[0].click()", selemailBcc1);
			Thread.sleep(3000);
//Reaceive Alert Field
			WebElement receiveheading=driver.findElement(By.xpath("(//div[contains(text(),'When you want to recieve the alert(s)?')])"));
			WebElement receiveinfo=driver.findElement(By.xpath("(//div[contains(text(),'When you want to recieve the alert(s)?')])//following::p[1]"));
			WebElement volume=driver.findElement(By.xpath("(//span[contains(text(),'Volume')])"));
			WebElement engagement=driver.findElement(By.xpath("(//span[contains(text(),'Engagement')])[2]"));
			WebElement mensioncntbx=driver.findElement(By.xpath("(//mat-label[contains(text(),'Mention Count Reaches')])"));
            if(receiveheading.isDisplayed() && receiveinfo.isDisplayed() && volume.isDisplayed() && engagement.isDisplayed() && mensioncntbx.isDisplayed()) {
				System.out.println("Reaceive Alert Field is displayed");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Reaceive Alert Field is not displayed");
				componentsInformation.add(16, "Not Present");
			}
        	Thread.sleep(3000);
        	WebElement setvolume=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_up')])[1]"));
        	js.executeScript("arguments[0].click()", setvolume);
		    Thread.sleep(5000);
        	
        	
        	
//Set BenchMark Field
        
			WebElement setheading=driver.findElement(By.xpath("(//p[contains(text(),'Set benchmark duration')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", setheading);
			WebElement setbenchinfo=driver.findElement(By.xpath("(//p[contains(text(),'Set benchmark duration')])//following::p[1]"));
			WebElement duration=driver.findElement(By.xpath("(//mat-label[contains(text(),'Duration')])"));
			
            if(setheading.isDisplayed() && setbenchinfo.isDisplayed() && duration.isDisplayed() ) {
				System.out.println("Set BenchMark Field is displayed");
				componentsInformation.add(17, "Present");
			}
			else {
				System.out.println("Set BenchMark Field is not displayed");
				componentsInformation.add(17, "Not Present");
			}
        	Thread.sleep(3000); 
        	WebElement benchdur=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
        	js.executeScript("arguments[0].click()", benchdur);
			Thread.sleep(3000);
			benchdur.sendKeys("4");
			Thread.sleep(3000); 
        	WebElement benchdurmin=driver.findElement(By.xpath("(//input[@type='number'])[3]"));
        	js.executeScript("arguments[0].click()", benchdurmin);
			Thread.sleep(3000);
			benchdurmin.sendKeys("30");
			Thread.sleep(5000);
//Engagement
			WebElement saveButton1=driver.findElement(By.xpath("//span[contains(text(),'Save Alert')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", saveButton1);
			WebElement Engradbutton=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[5]"));
        	js.executeScript("arguments[0].click()", Engradbutton);
			Thread.sleep(3000);
			WebElement mensioncnt=driver.findElement(By.xpath("(//input[@type='number'])[1]"));
        	js.executeScript("arguments[0].click()", mensioncnt);
			Thread.sleep(3000);
			mensioncnt.sendKeys("5");
			WebElement and=driver.findElement(By.xpath("(//span[contains(text(),'AND')])"));
        	js.executeScript("arguments[0].click()", and);
			Thread.sleep(3000);
			
			WebElement retweet=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
        	js.executeScript("arguments[0].click()", retweet);
			Thread.sleep(3000);
			retweet.sendKeys("10");
			WebElement or=driver.findElement(By.xpath("(//span[contains(text(),'OR')])"));
        	js.executeScript("arguments[0].click()", or);
			Thread.sleep(3000);
			
			WebElement like=driver.findElement(By.xpath("(//input[@type='number'])[3]"));
        	js.executeScript("arguments[0].click()", retweet);
			Thread.sleep(3000);
			like.sendKeys("20");
			WebElement and2=driver.findElement(By.xpath("(//span[contains(text(),'AND')])"));
        	js.executeScript("arguments[0].click()", and2);
			Thread.sleep(3000);
			
			WebElement videoviews=driver.findElement(By.xpath("(//input[@type='number'])[4]"));
        	js.executeScript("arguments[0].click()", videoviews);
			Thread.sleep(3000);
			videoviews.sendKeys("6");
			WebElement or2=driver.findElement(By.xpath("(//span[contains(text(),'OR')])"));
        	js.executeScript("arguments[0].click()", or2);
			Thread.sleep(3000);
			
			WebElement Reply=driver.findElement(By.xpath("(//input[@type='number'])[5]"));
        	js.executeScript("arguments[0].click()", Reply);
			Thread.sleep(3000);
			Reply.sendKeys("6");
			Actions actions7 = new Actions(driver);
			Action action7 = actions7.sendKeys(Keys.ESCAPE).build();
			action7.perform();
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(18, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(18, "Not Present");
			}
			
//save alert button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),'Save Alert')]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(19, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(19, "Not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);

			//js.executeScript("arguments[0].click()", arrow);
			//Thread.sleep(3000);
			
			
			
			componentsInformation.add(20, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "LocoViralAlertUIVerification");
//Search Alert by its Name
			
			WebElement searchsubname = driver.findElement(By.xpath("//input[@placeholder='Search by Subject']"));
			js.executeScript("arguments[0].click()", searchsubname);
			Thread.sleep(3000);
			WebElement subsymbol1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", subsymbol1);
			Thread.sleep(5000);
			Actions actions8 = new Actions(driver);
			Action action8 = actions8.sendKeys(searchsubname, "Automation Demo Alert").sendKeys(Keys.ENTER).build();
	        action8.perform();
	        Thread.sleep(5000);
	        WebElement actionper = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])"));
		    js.executeScript("arguments[0].click()", actionper);
		    Thread.sleep(3000);
//Open Activity Log		    
		    WebElement activity = driver.findElement(By.xpath("(//span[contains(text(),'Activity Log')])"));
		    js.executeScript("arguments[0].click()", activity);
		    Thread.sleep(5000);
		    WebElement closeactlog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
		    js.executeScript("arguments[0].click()", closeactlog);
		    Thread.sleep(3000);
//Edit
		    WebElement actionper4 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])"));
		    js.executeScript("arguments[0].click()", actionper4);
		    Thread.sleep(3000);	    
		    WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
		    js.executeScript("arguments[0].click()", edit);
		    Thread.sleep(5000);
		    WebElement cancelemail = driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[37]"));
		    js.executeScript("arguments[0].click()", cancelemail);
		    Thread.sleep(3000);
		    WebElement addWed = driver.findElement(By.xpath("(//span[contains(@class,'createviralalert__left')])[3]"));
		    js.executeScript("arguments[0].click()", addWed);
		    Thread.sleep(3000);
		    WebElement addtue = driver.findElement(By.xpath("(//span[contains(@class,'createviralalert__left')])[4]"));
		    js.executeScript("arguments[0].click()", addtue);
		    Thread.sleep(3000);
		    WebElement  dailydigesttm1=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[2]"));
        	js.executeScript("arguments[0].click()", dailydigesttm1);
			Thread.sleep(3000);
			WebElement  dailiydigesttime1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[1]"));
			js.executeScript("arguments[0].click()", dailiydigesttime1);
			Thread.sleep(3000);
			WebElement DDTM2=driver.findElement(By.xpath("//span[contains(text(),'10:00 AM')]"));
        	js.executeScript("arguments[0].click()", DDTM2);
			Thread.sleep(3000);
			WebElement delch1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[17]"));
        	js.executeScript("arguments[0].click()", delch1);
			Thread.sleep(3000);
			WebElement delch2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[21]"));
        	js.executeScript("arguments[0].click()", delch2);
			Thread.sleep(3000);
			WebElement negative1=driver.findElement(By.xpath("(//div[contains(text(),'Negative')])[1]"));
        	js.executeScript("arguments[0].click()", negative1);
			Thread.sleep(3000);
		    WebElement volumeup=driver.findElement(By.xpath("(//span[contains(text(),'Volume')])"));
		    js.executeScript("arguments[0].click()", volumeup);
		    Thread.sleep(3000);
		    WebElement setvolume1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_up')])[1]"));
        	js.executeScript("arguments[0].click()", setvolume1);
		    Thread.sleep(5000);
		    js.executeScript("arguments[0].click()", setvolume1);
		    js.executeScript("arguments[0].click()", setvolume1);
		    js.executeScript("arguments[0].click()", setvolume1);
		    js.executeScript("arguments[0].click()", setvolume1);
		    Thread.sleep(2000);
		    WebElement benchdur1=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
        	js.executeScript("arguments[0].click()", benchdur1);
			Thread.sleep(3000);
			benchdur1.sendKeys("2");
			Thread.sleep(3000); 
        	WebElement benchdurmin1=driver.findElement(By.xpath("(//input[@type='number'])[3]"));
        	js.executeScript("arguments[0].click()", benchdurmin1);
			Thread.sleep(3000);
			benchdurmin1.sendKeys("45");
			Thread.sleep(5000);
		    WebElement update1 = driver.findElement(By.xpath("(//span[contains(text(),'Update Alert')])"));
		    js.executeScript("arguments[0].click()", update1);
		    Thread.sleep(3000);
//Open Activity Log	
		    WebElement actionper1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])"));
		    js.executeScript("arguments[0].click()", actionper1);
		    Thread.sleep(3000);
		    WebElement activity1 = driver.findElement(By.xpath("(//span[contains(text(),'Activity Log')])"));
		    js.executeScript("arguments[0].click()", activity1);
		    Thread.sleep(5000);
		    WebElement closeactlog1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
		    js.executeScript("arguments[0].click()", closeactlog1);
		    Thread.sleep(3000);	
//delete
		    WebElement actionper2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])"));
		    js.executeScript("arguments[0].click()", actionper2);
		    Thread.sleep(3000);
		    WebElement delete = driver.findElement(By.xpath("(//span[contains(text(),'Delete')])"));
		    js.executeScript("arguments[0].click()", delete);
		    Thread.sleep(5000);
		    WebElement confirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])"));
		    js.executeScript("arguments[0].click()", confirm);
		    Thread.sleep(3000);	
		    js.executeScript("arguments[0].click()", subsymbol1);
			Thread.sleep(5000);
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
