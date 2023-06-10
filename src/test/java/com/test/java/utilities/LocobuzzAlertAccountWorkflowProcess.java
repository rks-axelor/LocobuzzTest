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

public class LocobuzzAlertAccountWorkflowProcess {

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

	
	public static void LocobuzzViralAlertUIVerification(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Listening Setting
			WebElement Listening=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),' Listening Settings')])[1]"));
			WebElement ListeningDrpdwn=driver.findElement(By.xpath("(//span[contains(@class,'mat-expansion-indicator ng-tns-c')])[1]"));
			if(Listening.isDisplayed() && ListeningDrpdwn.isDisplayed()) 
				System.out.println("Listening Setting is displayed");
			else 
				System.out.println("Listening Setting is not displayed");
				js.executeScript("arguments[0].click()", Listening);
			Thread.sleep(5000);
			
// Alert
			
			WebElement Alertlabel=driver.findElement(By.xpath("(//span[contains(text(),'Alert')])[1]"));
			WebElement Alertlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Alerts.svg']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Alertlabel);
			Thread.sleep(5000);
			js.executeScript("arguments[0].click()", Alertlabel);
			Thread.sleep(3000);
			
//Alert Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement ATab=driver.findElement(By.xpath("(//span[contains(text(),'Alert')])[4]"));
			if(pushpin.isDisplayed() && ATab.isDisplayed()) 
				System.out.println(" Alert Tab is displayed");
			else 
				System.out.println("Alert Tab is not displayed");
				
			
// Alert Heading And Information
			WebElement AHeading=driver.findElement(By.xpath("(//p[contains(text(),'Alert')])"));
			WebElement Ainfromation=driver.findElement(By.xpath("(//p[contains(text(),'Alert')])//following::P[1]"));
			if(AHeading.isDisplayed()&&Ainfromation.isDisplayed()) 
				System.out.println(" Alert Heading And Information is displayed");
			else 
				System.out.println(" Alert Heading And Information is not displayed");
				

//search Brand field
			WebElement searchField=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow ng-tns-c')])"));
			js.executeScript("arguments[0].click()", searchField);
			Thread.sleep(3000);
//Search By Brand Name			
			WebElement searchbybrand=driver.findElement(By.xpath("(//input[@data-placeholder='Search brand name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			if(searchbybrand.isDisplayed()&&symbol.isDisplayed()) 
				System.out.println("Search Brand Field is displayed");
			else 
				System.out.println("Search Brand Field is not displayed");
			js.executeScript("arguments[0].click()", searchbybrand);
			Thread.sleep(3000);
			WebElement selectbrand=driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])[1]"));
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(3000);

//Search By Subject Name Field
			
			WebElement searchsubField=driver.findElement(By.xpath("(//input[@placeholder='Search by Subject'])"));
			WebElement subsymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchsubField.isDisplayed()&&subsymbol.isDisplayed()) 
				System.out.println("Search By Subject Name Field is displayed");
			else 
				System.out.println("Search By Subject Name Field is not displayed");
			Thread.sleep(3000);

//create Alert
			WebElement createalert=driver.findElement(By.xpath("(//span[contains(text(),'Create New Alert')])"));
			WebElement alertadd=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])"));
			if(createalert.isDisplayed() && alertadd.isDisplayed()) 
				System.out.println("create Alert Field is displayed");
			else 
				System.out.println("create Alert Field is not  displayed");
			js.executeScript("arguments[0].click()", createalert);
			Thread.sleep(3000);
			
//Create New Alert heading
			WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Create New Alert')]"));
			WebElement arrow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if(heading.isDisplayed()&& arrow.isDisplayed()) 
				System.out.println("Configure Viral Alert heading is displayed");
			else 
				System.out.println("Configure Viral Alert heading is not displayed");
			Thread.sleep(3000);

//Email Alert Subject Field
			WebElement EmailsubHead=driver.findElement(By.xpath("//div[contains(text(),'Email Alert Subject')]"));
			WebElement EmailsubInfo=driver.findElement(By.xpath("//div[contains(text(),'Email Alert Subject ')]//following::p[1]"));
			WebElement submust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[1]"));
			WebElement Subnametxbx=driver.findElement(By.xpath("//mat-label[contains(text(),'Email Subject Name')]"));
            if(EmailsubHead.isDisplayed() && EmailsubInfo.isDisplayed() && submust.isDisplayed() && Subnametxbx.isDisplayed() ) 
				System.out.println("Email Alert Subject Field is displayed");
			else 
				System.out.println("Email Alert Subject Field is not displayed");
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Subnametxbx, "Automation Demo Alert").sendKeys(Keys.ENTER).build();
	        action.perform();
	        Thread.sleep(5000);
//Schedule Alerts Field
			WebElement Schedulealert=driver.findElement(By.xpath("//div[contains(text(),'Schedule Alert(s)')]"));
			WebElement Scheduleinfo=driver.findElement(By.xpath("//div[contains(text(),'Schedule Alert(s)')]//following::p[1]"));
			WebElement Fromdt=driver.findElement(By.xpath("//div[contains(text(),'From Date ')]"));
			WebElement Enddate=driver.findElement(By.xpath("//span[contains(text(),'End Date')]"));
            if(Schedulealert.isDisplayed() && Scheduleinfo.isDisplayed() && Fromdt.isDisplayed() && Enddate.isDisplayed() ) 
				System.out.println("Schedule Alerts Field is displayed");
			else 
				System.out.println("Schedule Alerts Field is not displayed");
			Thread.sleep(3000);
//Select Start Date       	
        	WebElement Selstrtdate=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[1]"));
        	js.executeScript("arguments[0].click()", Selstrtdate);
			Thread.sleep(3000);
			WebElement date1=driver.findElement(By.xpath("(//button[@aria-label='19 January 2023'])"));
        	js.executeScript("arguments[0].click()", date1);
			Thread.sleep(5000);
//Select End Date
			WebElement Enddtchbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[1]"));
        	js.executeScript("arguments[0].click()", Enddtchbx);
			Thread.sleep(3000);
			WebElement enddate=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[2]"));
        	js.executeScript("arguments[0].click()", enddate);
			Thread.sleep(3000);
			WebElement date2=driver.findElement(By.xpath("(//button[@aria-label='31 January 2023'])"));
        	js.executeScript("arguments[0].click()", date2);
			Thread.sleep(3000);
        	
//Time Duration Field
			WebElement timeduration=driver.findElement(By.xpath("//div[contains(text(),'Time Duration')]"));
			WebElement timedurinfo=driver.findElement(By.xpath("//div[contains(text(),'Time Duration')]//following::p[1]"));
			WebElement starttime=driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-')])[4]"));
			WebElement Endtime=driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-')])[5]"));
            if(timeduration.isDisplayed() && timedurinfo.isDisplayed() && starttime.isDisplayed() && Endtime.isDisplayed() ) 
				System.out.println("Time Duration Field is displayed");
			else 
				System.out.println("Time Duration Field is not displayed");
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
			WebElement selectdays=driver.findElement(By.xpath("(//p[contains(@class,'text__regular font-weight-')])[1]"));
			WebElement seldaysmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[3]"));
			WebElement customtime=driver.findElement(By.xpath("(//span[contains(text(),'Custom Time ')])"));
			WebElement selcutime=driver.findElement(By.xpath("(//span[contains(text(),'Custom Time ')])"));
            if(selectdays.isDisplayed() && seldaysmust.isDisplayed() && customtime.isDisplayed() && selcutime.isDisplayed() ) 
				System.out.println("Days Selection Field is displayed");
			else 
				System.out.println("Days Selection Field is not displayed");
			Thread.sleep(3000);
//1.Select Unselect Days of Week
			WebElement  wed=driver.findElement(By.xpath("(//span[contains(@class,'newalert__left')])[2]"));
        	js.executeScript("arguments[0].click()", wed);
			Thread.sleep(3000);
			WebElement wedon=driver.findElement(By.xpath("(//span[contains(@class,'newalert__left')])[4]"));
        	js.executeScript("arguments[0].click()", wedon);
			Thread.sleep(3000);        	
//2.Custom Time
		
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
			WebElement  dailiydigesttime=driver.findElement(By.xpath("(//mat-icon[contains(text(),'query_builder')])[3]"));
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

//Select Email ID's For Alert Field
			WebElement selectid=driver.findElement(By.xpath("(//p[contains(text(),'Select Email Id(s) for Alert(s)')])"));
			WebElement selectidinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select Email Id(s) for Alert(s)')])//following::p[1]"));
			WebElement totxbxmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[4]"));
			
            if(selectid.isDisplayed() && selectidinfo.isDisplayed() && totxbxmust.isDisplayed() ) 
				System.out.println("Select Email ID's For Alert Field is displayed");
			else 
				System.out.println("Select Email ID's For Alert Field is not displayed");
			Thread.sleep(3000);       	
//Select Email in To Field        	
        	WebElement to=driver.findElement(By.xpath("(//input[@placeholder='Search Emails'])[1]"));
        	js.executeScript("arguments[0].click()", to);
			Thread.sleep(3000);
			WebElement selemailto=driver.findElement(By.xpath("(//span[contains(text(),' komal_adminuat@gmail.com')])"));
        	js.executeScript("arguments[0].click()", selemailto);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", to);
			WebElement selemailto1=driver.findElement(By.xpath("(//span[contains(text(),'komalbrand@gmail.com')])"));
        	js.executeScript("arguments[0].click()", selemailto1);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", to);
			WebElement selemailto2=driver.findElement(By.xpath("(//span[contains(text(),'komaltl@gmail.com')])"));
        	js.executeScript("arguments[0].click()", selemailto2);
			Thread.sleep(3000);
//Select Channel Field
			WebElement selectchannel=driver.findElement(By.xpath("(//div[contains(text(),'Select Channel(s)')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selectchannel);
			WebElement selchansinfo=driver.findElement(By.xpath("(//div[contains(text(),'Select Channel(s)')])//following::p[1]"));
			WebElement selchamust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[5]"));
		    if(selectchannel.isDisplayed() && selchansinfo.isDisplayed() && selchamust.isDisplayed() ) 
				System.out.println("Days Selection Field is displayed");
			else 
				System.out.println("Days Selection Field is not displayed");
			Thread.sleep(3000);
			WebElement searchchannel=driver.findElement(By.xpath("//input[@placeholder='Search channels']"));
        	js.executeScript("arguments[0].click()", searchchannel);
			Thread.sleep(3000);
			WebElement unch1=driver.findElement(By.xpath("(//span[contains(text(),'Videos')])[2]"));
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
			
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();

//Select Attributes Field
			WebElement attributes=driver.findElement(By.xpath("(//p[contains(text(),'Select Attribute(s)')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", attributes);
			WebElement Attributeinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select Attribute(s)')])//following::p[1]"));
			WebElement addgroup=driver.findElement(By.xpath("(//span[contains(text(),'+ Add Group')])"));
			
            if(attributes.isDisplayed() && Attributeinfo.isDisplayed() && addgroup.isDisplayed() ) 
				System.out.println("Select Attributes Field is displayed");
			else 
				System.out.println("Select Attributes Field is not displayed");
			Thread.sleep(3000);
			WebElement attri1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
        	js.executeScript("arguments[0].click()", attri1);
			Thread.sleep(3000);
			WebElement sent1=driver.findElement(By.xpath("(//span[contains(text(),'Sentiment')])[3]"));
        	js.executeScript("arguments[0].click()", sent1);
			Thread.sleep(3000);
			WebElement selsent=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
        	js.executeScript("arguments[0].click()", selsent);
			Thread.sleep(3000);
			WebElement sentp=driver.findElement(By.xpath("(//span[contains(text(),'Positive')])[1]"));
        	js.executeScript("arguments[0].click()", sentp);
			Thread.sleep(3000);
			WebElement sentn=driver.findElement(By.xpath("(//span[contains(text(),'Negative')])[1]"));
        	js.executeScript("arguments[0].click()", sentn);
			Thread.sleep(3000);
			Actions actions5 = new Actions(driver);
			Action action5 = actions5.sendKeys(Keys.ESCAPE).build();
			action5.perform();
			
//Select Locations			
			WebElement Locations=driver.findElement(By.xpath("(//div[contains(text(),'Select GMB Location(s)')])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Locations);
			WebElement locationtxbx=driver.findElement(By.xpath("(//input[@placeholder='Search locations'])[1]"));
			js.executeScript("arguments[0].click()", locationtxbx);
			Thread.sleep(3000);
			WebElement locationselect=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[3]"));
			
            if(Locations.isDisplayed() && locationtxbx.isDisplayed() && locationselect.isDisplayed() ) 
				System.out.println("Select Locations Field is displayed");
			else 
				System.out.println("Select Locations Field is not displayed");
			Thread.sleep(3000);
			WebElement locationselect1=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[3]"));
			js.executeScript("arguments[0].click()", locationselect1);
			Thread.sleep(3000);
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
			if(cancelButton.isDisplayed())
				System.out.println("Cancel Button is displayed");
			else 
				System.out.println("Cancel Button is not displayed");
				
//save alert button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			if(saveButton.isDisplayed()) 
				System.out.println("Save Button is displayed");
			else 
				System.out.println("Save Button is not displayed");
			saveButton.click();
			Thread.sleep(7000);	
			
			
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
//Verify Alert Details
		   /* WebElement chann = driver.findElement(By.xpath("(//span[contains(@class,'ng-star-inserted')])[44]"));
		    js.executeScript("arguments[0].click()", chann);
		    Thread.sleep(5000);
		    WebElement email = driver.findElement(By.xpath("(//div[contains(@class,'alerts__table--count ng-star-inserted')])"));
		    js.executeScript("arguments[0].click()", email);
		    Thread.sleep(3000);*/
//Edit
		    WebElement actionper4 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])"));
		    js.executeScript("arguments[0].click()", actionper4);
		    Thread.sleep(3000);	    
		    WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
		    js.executeScript("arguments[0].click()", edit);
		    Thread.sleep(5000);
		    WebElement cancelemail = driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[2]"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cancelemail);
		    Thread.sleep(3000);
		    js.executeScript("arguments[0].click()", cancelemail);
		    Thread.sleep(3000);
		    WebElement addWed = driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[3]"));
		    js.executeScript("arguments[0].click()", addWed);
		    Thread.sleep(3000);
		    WebElement addtue = driver.findElement(By.xpath("(//span[contains(@class,'newalert__left')])[4]"));
		    js.executeScript("arguments[0].click()", addtue);
		    Thread.sleep(3000);
		    WebElement  dailydigesttm1=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[2]"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dailydigesttm1);
		    Thread.sleep(3000);
        	js.executeScript("arguments[0].click()", dailydigesttm1);
			Thread.sleep(3000);
			WebElement  dailiydigesttime1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'query_builder')])[3]"));
			js.executeScript("arguments[0].click()", dailiydigesttime1);
			Thread.sleep(3000);
			WebElement DDTM2=driver.findElement(By.xpath("//span[contains(text(),'03:00 PM')]"));
        	js.executeScript("arguments[0].click()", DDTM2);
			Thread.sleep(3000);
			WebElement delch1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[17]"));
        	js.executeScript("arguments[0].click()", delch1);
			Thread.sleep(3000);
			WebElement delch2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[21]"));
        	js.executeScript("arguments[0].click()", delch2);
			Thread.sleep(3000);
			WebElement negative1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
        	js.executeScript("arguments[0].click()", negative1);
			Thread.sleep(3000);
		    WebElement volumeup=driver.findElement(By.xpath("(//span[contains(text(),'Neutral')])[1]"));
		    js.executeScript("arguments[0].click()", volumeup);
		    Thread.sleep(3000);
		    Actions actionsa = new Actions(driver);
			Action actiona = actionsa.sendKeys(Keys.ESCAPE).build();
			actiona.perform();
		    WebElement grp1=driver.findElement(By.xpath("(//span[contains(text(),'+ Add Group')])"));
        	js.executeScript("arguments[0].click()", grp1);
		    Thread.sleep(5000);
		    WebElement attriedit=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
        	js.executeScript("arguments[0].click()", attriedit);
			Thread.sleep(3000);
			WebElement veri1=driver.findElement(By.xpath("(//span[contains(text(),'Tweet Type')])[1]"));
        	js.executeScript("arguments[0].click()", veri1);
			Thread.sleep(3000);
			WebElement seletweet=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Tweet Type')])[1]"));
        	js.executeScript("arguments[0].click()", seletweet);
			Thread.sleep(3000);
			WebElement tweet=driver.findElement(By.xpath("(//span[contains(text(),'Tweets')])[1]"));
        	js.executeScript("arguments[0].click()", tweet);
			Thread.sleep(3000);
		    WebElement update1 = driver.findElement(By.xpath("(//span[contains(text(),'Update')])"));
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


