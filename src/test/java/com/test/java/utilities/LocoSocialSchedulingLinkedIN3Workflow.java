package com.test.java.utilities;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocoSocialSchedulingLinkedIN3Workflow {
public static List<String> componentsInformation = new ArrayList<String>();
public static List<String> ticketInformation = new ArrayList<String>();
public static void goingSocialSchedulingSection(WebDriver driver) throws Exception {
try {
			
	Thread.sleep(3000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
    Actions builder = new Actions(driver);
    Action mouseOverHome = builder.moveToElement(sideBar).build();
    mouseOverHome.perform();
    Thread.sleep(2000);
    
//social Scheduling 
    WebElement socialSchedulingLogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule_send')]"));
    js.executeScript("arguments[0].scrollIntoView()", socialSchedulingLogo);
    WebElement socialSchedulingLabel=driver.findElement(By.xpath("//span[contains(text(),' Social Scheduling')]"));
    WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[3]"));
    if(socialSchedulingLogo.isDisplayed()&&socialSchedulingLabel.isDisplayed()&&pushpin.isDisplayed()) {
    System.out.println("Social Scheduling logo and label are displayed");
    componentsInformation.add(0, "Present");
    }
    else {
    System.out.println("Social Scheduling logo and label are not displayed");
    componentsInformation.add(0, "Not Present");
    }
    js.executeScript("arguments[0].click()", socialSchedulingLabel);
    Thread.sleep(3000);		
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
	
public static void SchedulingFunctionality(WebDriver driver) throws Exception {
try {
			
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
//Manage post and PushpinVerification
	WebElement Managepost=driver.findElement(By.xpath("(//span[contains(text(),'Manage Post')])[1]"));
	WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[7]"));
	if(Managepost.isDisplayed() && pushpin.isDisplayed()) 
	System.out.println("Manage post and PushpinVerification is Done");
	else 
	System.out.println("Manage post and PushpinVerification is not done");
	js.executeScript("arguments[0].click()", Managepost);
	Thread.sleep(3000);
	
//Select Brand
	WebElement selectbrandlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
	WebElement Branddrpdwn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
	if(selectbrandlabel.isDisplayed() && Branddrpdwn.isDisplayed()) 
	System.out.println("Select Brand Field is displayed");
	else 
	System.out.println("Select Brand Field is not displayed");
	js.executeScript("arguments[0].click()", Branddrpdwn);
	Thread.sleep(3000);
	WebElement autodemoselect=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
	js.executeScript("arguments[0].click()", autodemoselect);
	Thread.sleep(3000);

//Select Duration Field
	WebElement Durationlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Duration')])"));
	WebElement durationicon=driver.findElement(By.xpath("(//input[@placeholder='Select Duration'])"));
	if(Durationlabel.isDisplayed() && durationicon.isDisplayed()) 
	System.out.println("Select Duration Field is displayed");
	else 
	System.out.println("Select Duration Field is not displayed");

//Compose Post Field
	WebElement composeposticon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drive_file_rename_outline')])"));
	WebElement composepostlabel=driver.findElement(By.xpath("(//span[contains(text(),'Compose Post')])"));
	if(composeposticon.isDisplayed()&&composepostlabel.isDisplayed()) 
	System.out.println("Compose Post Field is present");
	else
	System.out.println("Compose Post Field is not present");
	js.executeScript("arguments[0].click()", composepostlabel);
	Thread.sleep(3000);
	
//Select social profile(s) to post	
    WebElement SSPHeading=driver.findElement(By.xpath("(//h4[contains(text(),'Select social profile(s) to post')])"));
	if(SSPHeading.isDisplayed()) 
	System.out.println("Select social profile(s) to post Heading is Displayed");
	else 
	System.out.println("Select social profile(s) to post Heading is not Displayed");
	Thread.sleep(3000);
	WebElement komal=driver.findElement(By.xpath("(//span[contains(text(),'komal mali')])"));
	js.executeScript("arguments[0].click()", komal);
    Thread.sleep(3000);
	WebElement selecttwhandle1=driver.findElement(By.xpath("(//span[contains(text(),'kalyan chinni')])"));
	js.executeScript("arguments[0].click()", selecttwhandle1);
	Thread.sleep(3000);
	
	WebElement next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	js.executeScript("arguments[0].click()", next);
	Thread.sleep(2000);
	WebElement number1=driver.findElement(By.xpath("//div[contains(text(),'Select social profile')]"));
	if(number1.isDisplayed()) 
	System.out.println("Select social profile is done");
	else 
	System.out.println("Select social profile is not done");
	Thread.sleep(2000);
	
//Compose Your Post	
	WebElement composeheading=driver.findElement(By.xpath("//h4[contains(text(),'Compose your post')]"));
	WebElement LinkedINlogo=driver.findElement(By.xpath("(//img[@src='assets/images/account/Linkedin-sm.svg'])[1]"));
	WebElement decriptionarea=driver.findElement(By.xpath("(//textarea[@formcontrolname='description'])"));
	if(composeheading.isDisplayed() && LinkedINlogo.isDisplayed() && decriptionarea.isDisplayed() ) 
	System.out.println("Compose Your Post is displayed");
	else 
	System.out.println("Compose Your Post is not displayed");
	Thread.sleep(3000);
	Actions actionsa = new Actions(driver);
	Action actiona = actionsa.sendKeys(decriptionarea, "LinkedIn (/lɪŋktˈɪn/) is an American business and employment-oriented online service that operates via websites and mobile apps. Launched on May 5, 2003,[5] the platform is primarily used for professional networking and career development, and allows job seekers to post their CVs and employers to post jobs. From 2015 most of the company's revenue came from selling access to information about its members to recruiters and sales professionals.[6] Since December 2016, it has been a wholly owned subsidiary of Microsoft. As of February 2022, LinkedIn has 830+ million registered members from over 200 countries and territories.[4]\r\n"
			+ "\r\n"
			+ "LinkedIn allows members (both workers and employers) to create profiles and connect with each other in an online social network which may represent real-world professional relationships. Members can invite anyone (whether an existing member or not) to become a connection. LinkedIn can also be used to organize offline events, join groups, write articles, publish job postings, post photos and videos, and more.[7] @Locobuzz").build();
	actiona.perform();
	Thread.sleep(7000);
	WebElement selectuser=driver.findElement(By.xpath("(//span[contains(text(),'Locobuzz')])"));
	js.executeScript("arguments[0].click()", selectuser);
	Thread.sleep(3000);
	Actions actionst = new Actions(driver);
    Action actiont = actionst.sendKeys(Keys.ENTER).build();
    actiont.perform();
    Thread.sleep(3000);

//Adding Emoji
	
    WebElement addemoji=driver.findElement(By.xpath("//mat-icon[contains(text(),'sentiment_satisfied')]"));
    js.executeScript("arguments[0].click()", addemoji);
	Thread.sleep(1000);
	WebElement emoji1=driver.findElement(By.xpath("(//span[@aria-label='👍, +1, thumbsup'])[2]"));
    js.executeScript("arguments[0].click()", emoji1);
    js.executeScript("arguments[0].click()", emoji1);
    js.executeScript("arguments[0].click()", emoji1);
    js.executeScript("arguments[0].click()", emoji1);
	Thread.sleep(1000);
	WebElement addemoji1=driver.findElement(By.xpath("//mat-icon[contains(text(),'sentiment_satisfied')]"));
	js.executeScript("arguments[0].click()", addemoji1);
    Thread.sleep(1000);
    WebElement personalize=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
    js.executeScript("arguments[0].click()", personalize);
    Thread.sleep(3000);
    WebElement phoneno=driver.findElement(By.xpath("//li[contains(text(),' PhoneNumber')]"));
    js.executeScript("arguments[0].click()", phoneno);
    Thread.sleep(3000);
    WebElement personalize2=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
    js.executeScript("arguments[0].click()", personalize2);
    Thread.sleep(3000);
    WebElement gmail=driver.findElement(By.xpath("//li[contains(text(),' EmailAddress')]"));
    js.executeScript("arguments[0].click()", gmail);
    Thread.sleep(3000);
    WebElement personalize3=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
    js.executeScript("arguments[0].click()", personalize3);
    Thread.sleep(3000);
    WebElement demo=driver.findElement(By.xpath("//li[contains(text(),'information')]"));
    js.executeScript("arguments[0].click()", demo);
    Thread.sleep(3000);
   
    WebElement personalize5=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
    js.executeScript("arguments[0].click()", personalize5);
    Thread.sleep(3000);
    WebElement url=driver.findElement(By.xpath("//li[contains(text(),'WebsiteURL')]"));
    js.executeScript("arguments[0].click()", url);
    Thread.sleep(3000);
	WebElement addimages=driver.findElement(By.xpath("(//img[@src='assets/images/common/image.svg'])"));
    js.executeScript("arguments[0].click()", addimages);
	Thread.sleep(3000);

//Select 4 Images	
	Thread.sleep(8000);
	WebElement addimages1=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[1]"));
    js.executeScript("arguments[0].click()", addimages1);
	Thread.sleep(1000);
	WebElement addimages2=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[2]"));
    js.executeScript("arguments[0].click()", addimages2);
	Thread.sleep(1000);
	WebElement addimages3=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[3]"));
    js.executeScript("arguments[0].click()", addimages3);
	Thread.sleep(1000);
	WebElement addimages4=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[4]"));
    js.executeScript("arguments[0].click()", addimages4);
	Thread.sleep(1000);
	WebElement addimages5=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[5]"));
    js.executeScript("arguments[0].click()", addimages5);
	Thread.sleep(1000);
	WebElement attach=driver.findElement(By.xpath("//span[contains(text(),'Attach')]"));
	js.executeScript("arguments[0].click()", attach);
	Thread.sleep(5000);
	System.out.println("LinkedIN does not allow more than 4 images");
	WebElement addimages6=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[1]"));
	js.executeScript("arguments[0].click()", addimages6);
	Thread.sleep(1000);
	WebElement attach2=driver.findElement(By.xpath("//span[contains(text(),'Attach')]"));
	js.executeScript("arguments[0].click()", attach2);
	Thread.sleep(5000);
	System.out.println("LinkedIN Media attachment Done Successfully");
	Thread.sleep(2000);
	
//Publish Workflow
	WebElement nextclick=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
    js.executeScript("arguments[0].click()", nextclick);
	Thread.sleep(1000);	
    WebElement number2=driver.findElement(By.xpath("//div[contains(text(),'Compose post')]"));
	if(number2.isDisplayed()) 
	System.out.println("Compose Post successfully done");
	else 
	System.out.println("Compose Post successfully is not done");
	Thread.sleep(2000);

//Add Labels To Post
    WebElement addlabelheading=driver.findElement(By.xpath("//p[contains(text(),'Add labels to post')]"));
	WebElement tagpostlabel=driver.findElement(By.xpath("//p[contains(text(),'Tag Post')]"));
	WebElement tagpostinfo=driver.findElement(By.xpath("//p[contains(text(),'Tag Post')]//following::p[1]"));
	if(addlabelheading.isDisplayed() && tagpostlabel.isDisplayed() && tagpostinfo.isDisplayed()) 
	System.out.println("Add Labels To Post Fields is displayed");
	else 
	System.out.println("Add Labels To Post field is not displayed");
	Thread.sleep(3000);
	/*WebElement addlabeldrpdwn=driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_arrow_down')]"));
    js.executeScript("arguments[0].click()", addlabeldrpdwn);
	Thread.sleep(1000);
	WebElement testing=driver.findElement(By.xpath("(//span[contains(text(),'images')])"));
    js.executeScript("arguments[0].click()", testing);*/
	Thread.sleep(1000);
	WebElement addnewlabel=driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
    js.executeScript("arguments[0].click()", addnewlabel);
	Thread.sleep(1000);
	Actions actionsW = new Actions(driver);
    Action actionW = actionsW.sendKeys(addnewlabel, "Awaiting Demo Category Post").sendKeys(Keys.ENTER).build();
    actionW.perform();
    Thread.sleep(5000);
    WebElement next3=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
    js.executeScript("arguments[0].click()", next3);
	Thread.sleep(1000);
	WebElement publishlater=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[2]"));
	js.executeScript("arguments[0].click()", publishlater);
    Thread.sleep(1000);
    WebElement asia=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[2]"));
	js.executeScript("arguments[0].click()", asia);
    Thread.sleep(1000);
    WebElement area=driver.findElement(By.xpath(" (//span[contains(text(),'(GMT+05:30) Asia/Kolkata')])[1]"));
   	js.executeScript("arguments[0].click()", area);
    Thread.sleep(1000);
    WebElement choosedate=driver.findElement(By.xpath(" (//input[@data-placeholder='Choose Date'])"));
   	js.executeScript("arguments[0].click()", choosedate);
    Thread.sleep(1000);
    WebElement timepm=driver.findElement(By.xpath("(//td[contains(@class,'available last-day weekend ng-star-inserted')])[2]"));
   	js.executeScript("arguments[0].click()", timepm);
    Thread.sleep(1000);
    WebElement apply=driver.findElement(By.xpath("(//button[contains(text(),'Apply')])[2]"));
   	js.executeScript("arguments[0].click()", apply);
    Thread.sleep(5000);
    WebElement approval=driver.findElement(By.xpath("//span[contains(text(),'Send for approval')]"));
   	js.executeScript("arguments[0].click()", approval);
    Thread.sleep(5000);
//Verify in Awaiting Tab 
    WebElement Awaitingtab=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[2]"));
    Thread.sleep(3000);
  	js.executeScript("arguments[0].click()", Awaitingtab);
    Thread.sleep(5000);    

//Log in with CSD Credentials
// csdlogin
    CSDgoingSocialSchedulingSection(driver);
 	Thread.sleep(5000);
 	
  
//Search By Post Content	
 	WebElement searchbyPC1=driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
    js.executeScript("arguments[0].click()", searchbyPC1);
 	Thread.sleep(1000);
 	Actions actionsc = new Actions(driver);
    Action actionc = actionsc.sendKeys(searchbyPC1, "LinkedIn (/lɪŋktˈɪn/) is an American business and employment-oriented").build();
    actionc.perform();
 	Thread.sleep(3000);
 	WebElement search2=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
    js.executeScript("arguments[0].click()", search2);
 	Thread.sleep(3000);
//Going in Scheduled tab from Awaiting 	
//Verify in Scheduled Tab 
    WebElement scheduledtab=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[5]"));
    Thread.sleep(3000);
  	js.executeScript("arguments[0].click()", scheduledtab);
    Thread.sleep(5000);
    ScheduledPostTabVerification(driver);
    Thread.sleep(3000);

}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
//Post information
public static void AwaitingPostTabVerification(WebDriver driver) throws Exception {
try {
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
//LinkedIN logo
	WebElement imageIcon = driver.findElement(By.xpath("//img[@src='/assets/images/channel-logos/linkedin.svg']"));		
	if (imageIcon.isDisplayed()) {
	System.out.println("LinkedIN Image displayed successfully");
	} else {
	System.out.println("LinkedIN Image not displayed");
	}
	Thread.sleep(3000);			
//Post Status
	WebElement ticketName = driver.findElement(By.xpath("//p[contains(text(),'Awaiting Approval')]"));
	if (ticketName.isDisplayed()) {
    System.out.println("Draft Post Staus is displayed");
    } else {
    System.out.println("Draft Post Staus is not displayed");
    }
    Thread.sleep(3000);
//Post Created By Icon and Name
    WebElement createdbyicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'edit_note')]"));
	WebElement username = driver.findElement(By.xpath("//p[contains(text(),'Komal suplive')]"));
	WebElement label = driver.findElement(By.xpath("//mat-icon[contains(text(),'label')]"));
	if (createdbyicon.isDisplayed() && username.isDisplayed()) {
	System.out.println("Post Created By Icon and Name and label is displayed");
	} else {
	System.out.println("Post Created By Icon and Name and label is not displayed");
    }
	Thread.sleep(3000);
//Delete Icon
	WebElement Delete = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
	if (Delete.isDisplayed()) {
	System.out.println("Delete Icon is displayed");
	} else {
	System.out.println("Delete Icon is not displayed");
    }
	Thread.sleep(3000);

//Activity Log Icon
	WebElement Activitylog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
	if (Activitylog.isDisplayed()) {
	System.out.println("Activity Log Icon is displayed");
	} else {
	System.out.println("Activity Log Icon is not displayed");
    }
	js.executeScript("arguments[0].click()", Activitylog);
	Thread.sleep(3000);
	WebElement CloseActivitylog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
	js.executeScript("arguments[0].click()", CloseActivitylog);
	Thread.sleep(3000);
	
//Preview Icon	
	WebElement Previewicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
	if (Previewicon.isDisplayed()) {
	System.out.println("Preview Icon is displayed");
	} else {
	System.out.println("Preview Icon is not displayed");
    }
	js.executeScript("arguments[0].click()", Previewicon);
	Thread.sleep(3000);
	WebElement closepreview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
	js.executeScript("arguments[0].click()", closepreview);
	Thread.sleep(3000);
//Approve and Reject Button
	WebElement approve = driver.findElement(By.xpath("//mat-icon[contains(text(),'check_circle')]"));
	WebElement reject = driver.findElement(By.xpath("//mat-icon[contains(text(),'cancel')]"));
	if (approve.isDisplayed() && reject.isDisplayed()) {
	System.out.println("Approve and Reject Button are displayed");
	} else {
	System.out.println("Approve and Reject Button are not displayed");
    }
	js.executeScript("arguments[0].click()", approve);
	Thread.sleep(3000);
	WebElement approveconfirm = driver.findElement(By.xpath("//span[contains(text(),'Approve')]"));
	js.executeScript("arguments[0].click()", approveconfirm);
	Thread.sleep(5000);

    


		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
public static void ScheduledPostTabVerification(WebDriver driver) throws Exception {
try {
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
//LinkedIN logo
	WebElement imageIcon = driver.findElement(By.xpath("//img[@src='/assets/images/channel-logos/linkedin.svg']"));		
	if (imageIcon.isDisplayed()) {
	System.out.println("LinkedIN Image displayed successfully");
	} else {
	System.out.println("LinkedIN Image not displayed");
	}
	Thread.sleep(3000);			
//Post Status
   WebElement ticketName1 = driver.findElement(By.xpath("(//p[contains(text(),'Scheduled')])[1]"));
    if (ticketName1.isDisplayed()) {
	
    System.out.println("Scheduled Post Staus is displayed");
    } else {
    System.out.println("Scheduled Post Staus is not displayed");
    }
    Thread.sleep(3000);
    
//Scheduled Time
    WebElement Scheduledtimeicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'update')])"));
   	WebElement Scheduledtimeinfo = driver.findElement(By.xpath("(//span[contains(@class,'text__light font-weight-')])[1]"));
   	if (Scheduledtimeicon.isDisplayed() && Scheduledtimeinfo.isDisplayed()) {
   	System.out.println("Scheduled Time is displayed:" +Scheduledtimeinfo.getText());
   	} else {
   	System.out.println("Scheduled Time is not displayed");
    }
   	Thread.sleep(3000);
//Post Created By Icon and Name
    WebElement createdbyicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'edit_note')]"));
	WebElement username = driver.findElement(By.xpath("//p[contains(text(),'Komal suplive')]"));
	if (createdbyicon.isDisplayed() && username.isDisplayed()) {
	System.out.println("Post Created By Icon and Name is displayed"+username.getText());
	} else {
	System.out.println("Post Created By Icon and Name is not displayed");
    }
	Thread.sleep(3000);

//Label field
	WebElement labelicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'label')])[1]"));
	WebElement labelnames = driver.findElement(By.xpath("(//div[contains(@class,'socialposts__item--foot-credit-item ng-star-inserted')])[1]"));
	if (labelicon.isDisplayed() && labelnames.isDisplayed()) {
	System.out.println("Label field is displayed"+labelnames.getText());
	} else {
	System.out.println("Label field is not displayed");
    }
	Thread.sleep(3000);
	filterFunctionality(driver);	
} catch (Exception e) {
			e.printStackTrace();
			throw e;
}
}

public static void CSDgoingSocialSchedulingSection(WebDriver driver) throws Exception {
try {
	 String mainWindow = driver.getWindowHandle();
	 System.out.println("Main Window: " + mainWindow);
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://locobuzzng-atest.locobuzz.com/login");
	 String childWindow = driver.getWindowHandle();
	 System.out.println("Child Window: " + childWindow);
	 CommonFunctions.login(driver, "Customer");
	 Thread.sleep(5000);		
	 Thread.sleep(3000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
     Actions builder = new Actions(driver);
     Action mouseOverHome = builder.moveToElement(sideBar).build();
     mouseOverHome.perform();
     Thread.sleep(2000);
    
//social Scheduling 
    WebElement socialSchedulingLogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule_send')]"));
    js.executeScript("arguments[0].scrollIntoView()", socialSchedulingLogo);
    WebElement socialSchedulingLabel=driver.findElement(By.xpath("//span[contains(text(),' Social Scheduling')]"));
    WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
    if(socialSchedulingLogo.isDisplayed()&&socialSchedulingLabel.isDisplayed()&&pushpin.isDisplayed()) {
    System.out.println("Social Scheduling logo and label are displayed");
    componentsInformation.add(0, "Present");
    }
    else {
    System.out.println("Social Scheduling logo and label are not displayed");
    componentsInformation.add(0, "Not Present");
    }
    js.executeScript("arguments[0].click()", socialSchedulingLabel);
    Thread.sleep(3000);	
//Select Brand
  	WebElement selectbrandlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
  	WebElement Branddrpdwn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
  	if(selectbrandlabel.isDisplayed() && Branddrpdwn.isDisplayed()) 
  	System.out.println("Select Brand Field is displayed");
  	else 
  	System.out.println("Select Brand Field is not displayed");
  	js.executeScript("arguments[0].click()", Branddrpdwn);
  	Thread.sleep(3000);
  	WebElement autodemoselect=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
  	js.executeScript("arguments[0].click()", autodemoselect);
  	Thread.sleep(3000);
//Search by Post Content
  	 WebElement searchbyPC1=driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
     js.executeScript("arguments[0].click()", searchbyPC1);
 	 Thread.sleep(1000);
 	 Actions actionsc = new Actions(driver);
     Action actionc = actionsc.sendKeys(searchbyPC1, "LinkedIn (/lɪŋktˈɪn/) is an American business and employment-oriented").build();
     actionc.perform();
 	 Thread.sleep(3000);
 	 WebElement search2=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
     js.executeScript("arguments[0].click()", search2);
 	 Thread.sleep(3000);
//Going to Awaiting Tab
 	WebElement awaiting=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[2]"));
    js.executeScript("arguments[0].click()", awaiting);
	Thread.sleep(2000);
	AwaitingPostTabVerification(driver);
//Log out
	WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
    js.executeScript("arguments[0].click()", expand);
    WebElement logout = driver.findElement(By.xpath("//button[contains(text(),'Logout')]"));
    js.executeScript("arguments[0].click()", logout);
    Thread.sleep(4000);

    WebElement confirmLogout = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
    if (confirmLogout.isDisplayed()) {
    js.executeScript("arguments[0].click()", confirmLogout);
    System.out.println("Logout Successful");
    } else {
    System.out.println("Logout Not Successful");
    }
    driver.switchTo().window(childWindow).close();
	Thread.sleep(5000);
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void filterFunctionality(WebDriver driver) throws Exception {
try {
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement allpost=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[1]"));
js.executeScript("arguments[0].click()", allpost);
Thread.sleep(5000);
WebElement searchbyPC1=driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
js.executeScript("arguments[0].click()", searchbyPC1);
Thread.sleep(1000);
searchbyPC1.clear();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(6000);
WebElement selectbrandlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
WebElement Branddrpdwn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
if(selectbrandlabel.isDisplayed() && Branddrpdwn.isDisplayed()) 
System.out.println("Select Brand Field is displayed");
else 
System.out.println("Select Brand Field is not displayed");
js.executeScript("arguments[0].click()", Branddrpdwn);
Thread.sleep(3000);
WebElement autodemoselect=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
js.executeScript("arguments[0].click()", autodemoselect);
Thread.sleep(3000);
WebElement search1=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
js.executeScript("arguments[0].click()", search1);
Thread.sleep(5000);
//Filter Functionality

WebElement filter=driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt')]"));
js.executeScript("arguments[0].click()", filter);
Thread.sleep(5000);

//Channels

WebElement channels=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[2]"));
js.executeScript("arguments[0].click()", channels);
Thread.sleep(3000);
WebElement selectTw=driver.findElement(By.xpath("//span[contains(text(),'LinkedIn')]"));
js.executeScript("arguments[0].click()", selectTw);
Thread.sleep(3000);
Actions actionst = new Actions(driver);
Action actiont = actionst.sendKeys(Keys.ESCAPE).build();
actiont.perform();

//Social Profiles

WebElement socialprofile=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[3]"));
js.executeScript("arguments[0].click()", socialprofile);
Thread.sleep(3000);
WebElement selectTM=driver.findElement(By.xpath("(//span[contains(text(),'Sw test solutions')])[1]"));
js.executeScript("arguments[0].click()", selectTM);
Thread.sleep(3000);
WebElement selectTM2=driver.findElement(By.xpath("(//span[contains(text(),'Test solutions pvt')])[1]"));
js.executeScript("arguments[0].click()", selectTM2);
Thread.sleep(3000);
Actions actionsz = new Actions(driver);
Action actionz = actionsz.sendKeys(Keys.ESCAPE).build();
actionz.perform();

//Team Member

WebElement teammember=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[4]"));
js.executeScript("arguments[0].click()", teammember);
Thread.sleep(3000);
WebElement selectTM1=driver.findElement(By.xpath("(//span[contains(text(),' Komal suplive ')])[1]"));
js.executeScript("arguments[0].click()", selectTM1);
Thread.sleep(3000);
Actions actionsx = new Actions(driver);
Action actionx = actionsx.sendKeys(Keys.ESCAPE).build();
actionx.perform();

//Post Labels
WebElement postlabels=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[5]"));
js.executeScript("arguments[0].click()", postlabels);
Thread.sleep(3000);
WebElement selectTPL1=driver.findElement(By.xpath("(//span[contains(text(),'Awaiting Demo Category Post')])[1]"));
js.executeScript("arguments[0].click()", selectTPL1);
Thread.sleep(3000);
Actions actionsp = new Actions(driver);
Action actionp = actionsp.sendKeys(Keys.ESCAPE).build();
actionp.perform();

//Apply Filter

WebElement apply=driver.findElement(By.xpath("(//span[contains(text(),'Apply')])"));
js.executeScript("arguments[0].click()", apply);
Thread.sleep(10000);

		
} catch (Exception e) 
{
e.printStackTrace();
throw e;
}
}
}

