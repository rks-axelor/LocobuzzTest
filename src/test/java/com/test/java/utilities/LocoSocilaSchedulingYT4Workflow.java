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

public class LocoSocilaSchedulingYT4Workflow {
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
    WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[12]"));
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
	WebElement Managepost=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[14]"));
	WebElement pushpin=driver.findElement(By.xpath("(//span[contains(text(),'Manage Post')])[1]"));
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
	WebElement autodemoselect=driver.findElement(By.xpath("(//span[contains(text(),'TestBrand2017')])"));
	js.executeScript("arguments[0].click()", autodemoselect);
	Thread.sleep(3000);

//Select Duration Field
	WebElement Durationlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Duration')])"));
	WebElement durationicon=driver.findElement(By.xpath("(//input[@placeholder='Select Duration'])"));
	if(Durationlabel.isDisplayed() && durationicon.isDisplayed()) 
	System.out.println("Select Duration Field is displayed");
	else 
	System.out.println("Select Duration Field is not displayed");
	Thread.sleep(3000);
    WebElement awaiting=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[2]"));
    js.executeScript("arguments[0].click()", awaiting);
	Thread.sleep(2000);
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
	WebElement komal=driver.findElement(By.xpath("(//span[contains(text(),'Sejal Chorge')])[1]"));
	js.executeScript("arguments[0].click()", komal);
    Thread.sleep(3000);
	WebElement selecttwhandle1=driver.findElement(By.xpath("(//span[contains(text(),'@shakuntalashinde001')])[1]"));
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
	WebElement heading2=driver.findElement(By.xpath("//p[contains(text(),'Enter title for YouTube')]"));
	WebElement youtubelogo=driver.findElement(By.xpath("(//img[@src='assets\\images\\common/yt.svg'])[1]"));
	WebElement title=driver.findElement(By.xpath("(//input[@data-placeholder='Enter Youtube title here...'])[1]"));
	if(composeheading.isDisplayed() && heading2.isDisplayed() && youtubelogo.isDisplayed() && title.isDisplayed() ) 
	System.out.println("Compose Your Post is displayed");
	else 
	System.out.println("Compose Your Post is not displayed");
	Thread.sleep(3000);
	Actions actions = new Actions(driver);
    Action action = actions.sendKeys(title, "Automation Demo Post").sendKeys(Keys.ENTER).build();
    action.perform();
	Thread.sleep(3000);
	
//Description For
	WebElement decriptionheading=driver.findElement(By.xpath("//h4[contains(text(),'Compose your post')]"));
	WebElement youtubelogo1=driver.findElement(By.xpath("//p[contains(text(),'Enter title for YouTube')]"));

	if(decriptionheading.isDisplayed() && youtubelogo1.isDisplayed()) 
	System.out.println("Compose Your Post is displayed");
	else 
	System.out.println("Compose Your Post is not displayed");
	Thread.sleep(3000);
	Actions actionsa = new Actions(driver);
	Action actiona = actionsa.sendKeys(title, "Automation Demo  Testing Category Post like and share").sendKeys(Keys.ENTER).build();
	actiona.perform();
	
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
	
	WebElement addimages=driver.findElement(By.xpath("(//img[@src='assets/images/common/video.svg'])"));
    js.executeScript("arguments[0].click()", addimages);
	Thread.sleep(3000);

//Select 1 video	
	WebElement addimages1=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[7]"));
    js.executeScript("arguments[0].click()", addimages1);
	Thread.sleep(1000);
	WebElement attach=driver.findElement(By.xpath("//span[contains(text(),'Attach')] "));
	js.executeScript("arguments[0].click()", attach);
	Thread.sleep(1000);
	System.out.println("Youtube does not allow more than 1 video/GIF");
	Thread.sleep(2000);
	WebElement addimages2=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[3]"));
    js.executeScript("arguments[0].click()", addimages2);
	Thread.sleep(1000);
    WebElement attach1=driver.findElement(By.xpath("//span[contains(text(),'Attach')] "));
	js.executeScript("arguments[0].click()", attach1);
	Thread.sleep(3000);

//Publish Workflow
	WebElement nextclick=driver.findElement(By.xpath("//span[contains(text(),'Next')] "));
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
	WebElement addlabeldrpdwn=driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_arrow_down')]"));
    js.executeScript("arguments[0].click()", addlabeldrpdwn);
	Thread.sleep(1000);
	WebElement testing=driver.findElement(By.xpath("//span[contains(text(),' automation demo post')]"));
    js.executeScript("arguments[0].click()", testing);
	Thread.sleep(1000);
	WebElement addnewlabel=driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
    js.executeScript("arguments[0].click()", addnewlabel);
	Thread.sleep(1000);
	Actions actionsw = new Actions(driver);
    Action actionw = actionsw.sendKeys(addnewlabel, "Scheduling Testing Category").sendKeys(Keys.ENTER).build();
    actionw.perform();
    Thread.sleep(5000);
    WebElement next3=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
    js.executeScript("arguments[0].click()", next3);
	Thread.sleep(1000);
	WebElement publish=driver.findElement(By.xpath("(//span[contains(text(),'Publish')])[3]"));
	js.executeScript("arguments[0].click()", publish);
    Thread.sleep(1000); 
    WebElement searchbyPC1=driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
    js.executeScript("arguments[0].click()", searchbyPC1);
	Thread.sleep(1000);
	Actions actionsc = new Actions(driver);
    Action actionc = actionsc.sendKeys(searchbyPC1, "Demo Post on Tool and Social Media").build();
    actionc.perform();
	Thread.sleep(3000);
	WebElement search2=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
    js.executeScript("arguments[0].click()", search2);
	Thread.sleep(3000);
    
//Verify in Scheduled Tab
    WebElement scheduledtab=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[5]"));
    Thread.sleep(3000);
  	js.executeScript("arguments[0].click()", scheduledtab);
    Thread.sleep(10000);

//Verify in Failure Tab
    Thread.sleep(5000);
    WebElement Failure=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[8]"));
   	js.executeScript("arguments[0].click()", Failure);
    Thread.sleep(5000);
    WebElement search1=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
    js.executeScript("arguments[0].click()", search1);
	Thread.sleep(5000);

  

     Thread.sleep(3000);
     FailPostTabVerification(driver);
//Edit Functionality
     WebElement editicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
 	 js.executeScript("arguments[0].click()", editicon);
     Thread.sleep(3000);
     WebElement addhandle=driver.findElement(By.xpath("(//span[contains(text(),'@Shifa Shaikh')])"));
     js.executeScript("arguments[0].click()", addhandle);
 	 Thread.sleep(1000);	
 	
     WebElement nextclick1=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
     js.executeScript("arguments[0].click()", nextclick1);
 	 Thread.sleep(3000);	
 	 js.executeScript("arguments[0].click()", nextclick1);
 	 Thread.sleep(3000);	
 	 js.executeScript("arguments[0].click()", nextclick1);
 	 Thread.sleep(3000);	
 	 WebElement publish2=driver.findElement(By.xpath("(//span[contains(text(),'Publish')])[3]"));
	 js.executeScript("arguments[0].click()", publish2);
     Thread.sleep(1000);

//Verify in ALL Post Tab 
    WebElement allpost=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[1]"));
    Thread.sleep(10000);
  	js.executeScript("arguments[0].click()", allpost);
    Thread.sleep(30000);    
 
//Verify in  Partially Failure Tab
    Thread.sleep(20000);
    WebElement PartiallyFailure=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[7]"));
   	js.executeScript("arguments[0].click()", PartiallyFailure);
    Thread.sleep(10000);
    PulishPostTabVerification(driver);
	Thread.sleep(5000);
    
//Delete Post
     Thread.sleep(5000);
     WebElement delete=driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
	 js.executeScript("arguments[0].click()", delete);
     Thread.sleep(3000);
     WebElement deletefrmLB=driver.findElement(By.xpath("//span[contains(text(),'Delete from Social Channel')]"));
	 js.executeScript("arguments[0].click()", deletefrmLB);
     Thread.sleep(20000);
     WebElement deletetab=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[9]"));
	 js.executeScript("arguments[0].click()", deletetab);
     Thread.sleep(3000);
     deletetabverification(driver);
     Thread.sleep(5000);
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
//Post information
public static void FailPostTabVerification(WebDriver driver) throws Exception {
try {
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
//twitter logo
	WebElement imageIcon = driver.findElement(By.xpath("//img[@src='/assets/images/channel-logos/twitter.svg']"));		
	if (imageIcon.isDisplayed()) {
	System.out.println("Twitter Image displayed successfully");
	} else {
	System.out.println("Twitter Image not displayed");
	}
	Thread.sleep(3000);			
//Post Status
	WebElement ticketName = driver.findElement(By.xpath("//p[contains(text(),'Failed')]"));
	if (ticketName.isDisplayed()) {
    System.out.println("Failed Post Staus is displayed");
    } else {
    System.out.println("Failed Post Staus is not displayed");
    }
    Thread.sleep(3000);
//Post Created By Icon and Name
    WebElement createdbyicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'edit_note')]"));
	WebElement username = driver.findElement(By.xpath("//p[contains(text(),'Komal suplive')]"));
	if (createdbyicon.isDisplayed() && username.isDisplayed()) {
	System.out.println("Post Created By Icon and Name is displayed");
	} else {
	System.out.println("Post Created By Icon and Name is not displayed");
    }
	Thread.sleep(3000);

//Edit Icon
	WebElement editicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
	if (editicon.isDisplayed()) {
	System.out.println("Edit Icon is displayed");
	} else {
	System.out.println("Edit Icon is not displayed");
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
			

	Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
public static void PulishPostTabVerification(WebDriver driver) throws Exception {
try {
Thread.sleep(5000);
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement sort = driver.findElement(By.xpath("(//mat-icon[contains(text(),'sort')])"));
js.executeScript("arguments[0].click()", sort);
Thread.sleep(5000);
WebElement updated = driver.findElement(By.xpath("(//span[contains(text(),'Last Updated')])"));
js.executeScript("arguments[0].click()", updated);
Thread.sleep(5000);
WebElement sorttime = driver.findElement(By.xpath("(//span[contains(text(),'Ascending')])"));
js.executeScript("arguments[0].click()", sorttime);
Thread.sleep(5000);
WebElement sorttime1 = driver.findElement(By.xpath("(//span[contains(text(),'Descending')])"));
js.executeScript("arguments[0].click()", sorttime1);
Thread.sleep(5000);
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement logo = wait.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//img[@src='/assets/images/channel-logos/twitter.svg']")));
//twitter logo
	WebElement imageIcon = driver.findElement(By.xpath("//img[@src='/assets/images/channel-logos/twitter.svg']"));		
	if (imageIcon.isDisplayed()) {
	System.out.println("Twitter Image displayed successfully");
	} else {
	System.out.println("Twitter Image not displayed");
	}
	Thread.sleep(3000);			
//Post Status
   WebElement ticketName1 = driver.findElement(By.xpath("//p[contains(text(),'Partially Published')]"));
    if (ticketName1.isDisplayed()) {
	
    System.out.println("Published Post Staus is displayed");
    } else {
    System.out.println("Published Post Staus is not displayed");
    }
    Thread.sleep(3000);
    
//Published Time
    WebElement publishtimeicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'update')])"));
   	WebElement publishtimeinfo = driver.findElement(By.xpath("(//span[contains(@class,'text__light font-weight-')])[1]"));
   	if (publishtimeicon.isDisplayed() && publishtimeinfo.isDisplayed()) {
   	System.out.println("Published Time is displayed:" +publishtimeinfo.getText());
   	} else {
   	System.out.println("Published Time is not displayed");
    }
   	Thread.sleep(3000);
//Post Created By Icon and Name
    WebElement createdbyicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'edit_note')]"));
	WebElement username = driver.findElement(By.xpath("//p[contains(text(),'Komal suplive')]"));
	if (createdbyicon.isDisplayed() && username.isDisplayed()) {
	System.out.println("Post Created By Icon and Name is displayed");
	} else {
	System.out.println("Post Created By Icon and Name is not displayed");
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

//Open Post
	WebElement shifa = driver.findElement(By.xpath("(//img[@src='/assets/images/channel-logos/twitter.svg'])[2]"));
	js.executeScript("arguments[0].click()", shifa);
	Thread.sleep(3000);
	WebElement openpost = driver.findElement(By.xpath("(//mat-icon[contains(text(),'open_in_new')])[1]"));
	if (openpost.isDisplayed()) {
	System.out.println("Open post is displayed");
	} else {
	System.out.println("open post is not displayed");
    }
	js.executeScript("arguments[0].click()", openpost);
	Thread.sleep(8000);
    ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(newTb.get(1));
	Thread.sleep(5000);
	driver.switchTo().window(newTb.get(0));
	Thread.sleep(5000);
	
	
//Trend icon
	WebElement Trendicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'trending_up')])[1]"));
	if (Trendicon.isDisplayed()) {
	System.out.println("Trend Icon is displayed");
	} else {
	System.out.println("Trend Icon is not displayed");
    }
	js.executeScript("arguments[0].click()", Trendicon);
	Thread.sleep(5000);
	WebElement arrowback = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
	js.executeScript("arguments[0].click()", arrowback);
	Thread.sleep(5000);
			
} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
public static void deletetabverification(WebDriver driver) throws Exception {
try {
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
//twitter logo
	WebElement imageIcon = driver.findElement(By.xpath("//img[@src='/assets/images/channel-logos/twitter.svg']"));		
	if (imageIcon.isDisplayed()) {
	System.out.println("Twitter Image displayed successfully");
	} else {
	System.out.println("Twitter Image not displayed");
	}
	Thread.sleep(3000);			
//Post Status

	WebElement delete = driver.findElement(By.xpath("//p[contains(text(),'Delete')]"));
	if (delete.isDisplayed()) {
    System.out.println("Deleted Post Staus is displayed");
    } else {
    System.out.println("Deleted Post Staus is not displayed");
    }
    Thread.sleep(3000);
//Post Created By Icon and Name
    WebElement createdbyicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'edit_note')]"));
	WebElement username = driver.findElement(By.xpath("//p[contains(text(),'Komal suplive')]"));
	if (createdbyicon.isDisplayed() && username.isDisplayed()) {
	System.out.println("Post Created By Icon and Name is displayed");
	} else {
	System.out.println("Post Created By Icon and Name is not displayed");
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

//Labels Field
	WebElement labelicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'label')]"));
	WebElement addedlabels = driver.findElement(By.xpath("(//div[contains(@class,'socialposts__item--foot-credit-item ng-star-inserted')])[1]"));
	if (labelicon.isDisplayed() && addedlabels.isDisplayed()) {
	System.out.println("Labels Field is displayed");
    } else {
	System.out.println("Preview Icon is not displayed");
    }
	
 Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}


