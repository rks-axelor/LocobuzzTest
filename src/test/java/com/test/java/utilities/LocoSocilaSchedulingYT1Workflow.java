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

public class LocoSocilaSchedulingYT1Workflow {
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
	WebElement autodemoselect=driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
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
	WebElement selecttwhandle=driver.findElement(By.xpath("(//span[contains(text(),'@Komal Mali')])[2]"));
	js.executeScript("arguments[0].click()", selecttwhandle);
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
	WebElement decriptionheading=driver.findElement(By.xpath("//P[contains(text(),'Description for:')]"));
	WebElement youtubelogo1=driver.findElement(By.xpath("(//img[@src='assets\\images\\common/yt.svg'])[2]"));

	if(decriptionheading.isDisplayed() && youtubelogo1.isDisplayed()) 
	System.out.println("Description  Post is displayed");
	else 
	System.out.println("Description  Post is not displayed");
	Thread.sleep(3000);
	WebElement decriptionarea=driver.findElement(By.xpath("(//textarea[@formcontrolname='description'])"));
	
	decriptionarea.sendKeys("YouTube allows users to upload videos, view them, rate them with likes and dislikes, share them, add videos to playlists, report, make comments on videos, and subscribe to other users. The slogan \"Broadcast Yourself\" used for several years and the reference to user profiles as \"Channels\" signifies the premise upon which the platform is based, of allowing anyone to operate a personal broadcasting station in resemblance to television with the extension of video on demand.\r\n"
			+ "\r\n"
			+ "As such, the platform offers a wide variety of user-generated and corporate media videos. Available content includes video clips, TV show clips, music videos, short and documentary films, audio recordings, movie trailers, live streams, and other content such as video blogging, short original videos, and educational videos.\r\n"
			+ "\r\n"
			+ "As of February 2017, there were more than 400 hours of content uploaded to YouTube each minute, and one billion hours of content being watched on YouTube every day. As of October 2020, YouTube is the second-most popular website in the world, behind Google, according to Alexa Internet.[1] As of May 2019, more than 500 hours of video content are uploaded to YouTube every minute.[2] Based on reported quarterly advertising revenue, YouTube is estimated to have US$15 billion in annual revenues.\r\n"
			+ "\r\n"
			+ "YouTube has faced criticism over aspects of its operations, including its handling of copyrighted content contained within uploaded videos,[3] its recommendation algorithms perpetuating videos that promote conspiracy theories and falsehoods,[4] hosting videos ostensibly targeting children but containing violent or sexually suggestive content involving popular characters,[5] videos of minors attracting pedophilic activities in their comment sections,[6] and fluctuating policies on the types of content that is eligible to be monetized with advertising.[3]");
	decriptionarea.sendKeys("YouTube allows users to upload videos, view them, rate them with likes and dislikes, share them, add videos to playlists, report, make comments on videos, and subscribe to other users. The slogan \"Broadcast Yourself\" used for several years and the reference to user profiles as \"Channels\" signifies the premise upon which the platform is based, of allowing anyone to operate a personal broadcasting station in resemblance to television with the extension of video on demand.\r\n"
			+ "\r\n"
			+ "As such, the platform offers a wide variety of user-generated and corporate media videos. Available content includes video clips, TV show clips, music videos, short and documentary films, audio recordings, movie trailers, live streams, and other content such as video blogging, short original videos, and educational videos.\r\n"
			+ "\r\n"
			+ "As of February 2017, there were more than 400 hours of content uploaded to YouTube each minute, and one billion hours of content being watched on YouTube every day. As of October 2020, YouTube is the second-most popular website in the world, behind Google, according to Alexa Internet.[1] As of May 2019, more than 500 hours of video content are uploaded to YouTube every minute.[2] Based on reported quarterly advertising revenue, YouTube is estimated to have US$15 billion in annual revenues.\r\n"
			+ "\r\n"
			+ "YouTube has faced criticism over aspects of its operations, including its handling of copyrighted content contained within uploaded videos,[3] its recommendation algorithms perpetuating videos that promote conspiracy theories and falsehoods,[4] hosting videos ostensibly targeting children but containing violent or sexually suggestive content involving popular characters,[5] videos of minors attracting pedophilic activities in their comment sections,[6] and fluctuating policies on the types of content that is eligible to be monetized with advertising.[3]");
	decriptionarea.sendKeys("YouTube allows users to upload videos, view them, rate them with likes and dislikes, share them, add videos to playlists, report, make comments on videos, and subscribe to other users. The slogan \"Broadcast Yourself\" used for several years and the reference to user profiles as \"Channels\" signifies the premise upon which the platform is based, of allowing anyone to operate a personal broadcasting station in resemblance to television with the extension of video on demand.\r\n"
			+ "\r\n"
			+ "As such, the platform offers a wide variety of user-generated and corporate media videos. Available content includes video clips, TV show clips, music videos, short and documentary films, audio recordings, movie trailers, live streams, and other content such as video blogging, short original videos, and educational videos.\r\n"
			+ "\r\n"
			+ "As of February 2017, there were more than 400 hours of content uploaded to YouTube each minute, and one billion hours of content being watched on YouTube every day. As of October 2020, YouTube is the second-most popular website in the world, behind Google, according to Alexa Internet.[1] As of May 2019, more than 500 hours of video content are uploaded to YouTube every minute.[2] Based on reported quarterly advertising revenue, YouTube is estimated to have US$15 billion in annual revenues.");
	Thread.sleep(3000);
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
	
	WebElement addimages=driver.findElement(By.xpath("(//img[@src='assets/images/common/video.svg'])"));
    js.executeScript("arguments[0].click()", addimages);
	Thread.sleep(8000);

//Select 4 Images
	Thread.sleep(8000);
	WebElement addimages1=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[1]"));
    js.executeScript("arguments[0].click()", addimages1);
	Thread.sleep(1000);
	WebElement addimages2=driver.findElement(By.xpath("(//span[contains(@class,'media-gallery')])[2]"));
    js.executeScript("arguments[0].click()", addimages2);
	Thread.sleep(1000);
	WebElement attach=driver.findElement(By.xpath("//span[contains(text(),'Attach')]"));
	js.executeScript("arguments[0].click()", attach);
	Thread.sleep(5000);
	System.out.println("Youtube does not allow more than 1 video/GIF");
	js.executeScript("arguments[0].click()", addimages1);
	Thread.sleep(1000);
	WebElement attach2=driver.findElement(By.xpath("//span[contains(text(),'Attach')]"));
	js.executeScript("arguments[0].click()", attach2);
	Thread.sleep(5000);
	System.out.println("Youtube Media attachment Done Successfully");
	Thread.sleep(4000);
	
  
	
//Checking Draft Workflow
	WebElement savedraft=driver.findElement(By.xpath("//span[contains(text(),'Save Draft')]"));
    js.executeScript("arguments[0].click()", savedraft);
	Thread.sleep(2000);
	WebElement searchbyPC=driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
    js.executeScript("arguments[0].click()", searchbyPC);
	Thread.sleep(1000);
	Actions actionsb = new Actions(driver);
    Action actionb = actionsb.sendKeys(searchbyPC, "YouTube allows users to upload videos, view them").build();
    actionb.perform();
	Thread.sleep(1000);
	WebElement search=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
    js.executeScript("arguments[0].click()", search);
	Thread.sleep(5000);

//Draft Workflow
	WebElement draft=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[3]"));
    js.executeScript("arguments[0].click()", draft);
	Thread.sleep(1000);
	PostTabVerification(driver);
	
//Publish Workflow
	WebElement editicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
	js.executeScript("arguments[0].click()", editicon);
    Thread.sleep(3000);
    WebElement nextclick=driver.findElement(By.xpath("//span[contains(text(),'Next')] "));
    js.executeScript("arguments[0].click()", nextclick);
	Thread.sleep(1000);	
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
	WebElement testing=driver.findElement(By.xpath("//span[contains(text(),'testing')]"));
    js.executeScript("arguments[0].click()", testing);
	Thread.sleep(1000);*/
	WebElement addnewlabel=driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
    js.executeScript("arguments[0].click()", addnewlabel);
	Thread.sleep(1000);
	Actions actionsW = new Actions(driver);
    Action actionW = actionsW.sendKeys(addnewlabel, "Automation Demo Post").sendKeys(Keys.ENTER).build();
    actionW.perform();
    Thread.sleep(5000);
    WebElement next3=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
    js.executeScript("arguments[0].click()", next3);
	Thread.sleep(1000);
	WebElement publish=driver.findElement(By.xpath("(//span[contains(text(),'Publish')])[3]"));
	js.executeScript("arguments[0].click()", publish);
    Thread.sleep(1000);
//Verify in Scheduled Tab 
    WebElement scheduledtab=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[5]"));
    Thread.sleep(3000);
  	js.executeScript("arguments[0].click()", scheduledtab);
    Thread.sleep(3000);
//Verify in All Post Tab 
    WebElement allposttab=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[1]"));
    Thread.sleep(10000);
  	js.executeScript("arguments[0].click()", allposttab);
    Thread.sleep(10000);
//youtube logo1
    Thread.sleep(10000);
  	WebElement youtube = driver.findElement(By.xpath("//img[@src='/assets/images/channelicons/Youtube.svg']"));		
  	if (youtube.isDisplayed()) {
  	System.out.println("youtube Image displayed successfully");
  	} else {
  	System.out.println("youtube Image not displayed");
  	}
  	Thread.sleep(5000);			

//Published Time
    WebElement Scheduletimeicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'update')])"));
 	WebElement Scheduletimeinfo = driver.findElement(By.xpath("(//span[contains(@class,'text__light font-weight-')])[1]"));
 	if (Scheduletimeicon.isDisplayed() && Scheduletimeinfo.isDisplayed()) {
 	System.out.println("Scheduled Time is displayed:" +Scheduletimeinfo.getText());
 	} else {
 	System.out.println("Scheduled Time is not displayed");
    }
    Thread.sleep(5000);

//Verify in Published Tab
    Thread.sleep(9000);
    WebElement published=driver.findElement(By.xpath("(//div[contains(@class,'mat-tab-label-content')])[6]"));
   	js.executeScript("arguments[0].click()", published);
    Thread.sleep(5000);
    WebElement search1=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
    js.executeScript("arguments[0].click()", search1);
	Thread.sleep(3000);
     publishPostTabVerification(driver);
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
public static void PostTabVerification(WebDriver driver) throws Exception {
try {
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
//Youtube logo
	WebElement imageIcon = driver.findElement(By.xpath("//img[@src='/assets/images/channelicons/Youtube.svg']"));		
	if (imageIcon.isDisplayed()) {
	System.out.println("Youtube Image displayed successfully");
	} else {
	System.out.println("Youtube Image not displayed");
	}
	Thread.sleep(3000);			
//Post Status
	WebElement ticketName = driver.findElement(By.xpath("//p[contains(text(),'Draft')]"));
	if (ticketName.isDisplayed()) {
    System.out.println("Draft Post Staus is displayed");
    } else {
    System.out.println("Draft Post Staus is not displayed");
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
public static void publishPostTabVerification(WebDriver driver) throws Exception {
try {
Thread.sleep(5000);
JavascriptExecutor js = (JavascriptExecutor) driver;
WebDriverWait wait = new WebDriverWait(driver, 20);
WebElement search = wait.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//img[@src='/assets/images/channelicons/Youtube.svg']")));
//Youtube logo
	WebElement imageIcon = driver.findElement(By.xpath("//img[@src='/assets/images/channelicons/Youtube.svg']"));		
	if (imageIcon.isDisplayed()) {
	System.out.println("Youtube Image displayed successfully");
	} else {
	System.out.println("Youtube Image not displayed");
	}
	Thread.sleep(3000);			
//Post Status
   WebElement ticketName1 = driver.findElement(By.xpath("//p[contains(text(),'Published')]"));
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
//Youtube logo1
	WebElement imageIcon = driver.findElement(By.xpath("//img[@src='/assets/images/channelicons/Youtube.svg']"));		
	if (imageIcon.isDisplayed()) {
	System.out.println("Youtube Image displayed successfully");
	} else {
	System.out.println("Youtube Image not displayed");
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
 filterFunctionality(driver);
		} catch (Exception e) {
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
Thread.sleep(5000);
WebElement selectbrandlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
WebElement Branddrpdwn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
if(selectbrandlabel.isDisplayed() && Branddrpdwn.isDisplayed()) 
System.out.println("Select Brand Field is displayed");
else 
System.out.println("Select Brand Field is not displayed");
js.executeScript("arguments[0].click()", Branddrpdwn);
Thread.sleep(3000);
WebElement autodemoselect=driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
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
WebElement selectTw=driver.findElement(By.xpath("//span[contains(text(),'YouTube')]"));
js.executeScript("arguments[0].click()", selectTw);
Thread.sleep(3000);

Actions actionst = new Actions(driver);
Action actiont = actionst.sendKeys(Keys.ESCAPE).build();
actiont.perform();

//Social Profiles

WebElement socialprofile=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[3]"));
js.executeScript("arguments[0].click()", socialprofile);
Thread.sleep(3000);
WebElement selectTM=driver.findElement(By.xpath("(//span[contains(text(),'Komal Mali')])[1]"));
js.executeScript("arguments[0].click()", selectTM);
Thread.sleep(3000);
Actions actionsz = new Actions(driver);
Action actionz = actionsz.sendKeys(Keys.ESCAPE).build();
actionz.perform();

//Team Member

WebElement teammember=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[4]"));
js.executeScript("arguments[0].click()", teammember);
Thread.sleep(3000);
WebElement selectTM1=driver.findElement(By.xpath("(//span[contains(text(),'Komal suplive')])[2]"));
js.executeScript("arguments[0].click()", selectTM1);
Thread.sleep(3000);
Actions actionsx = new Actions(driver);
Action actionx = actionsx.sendKeys(Keys.ESCAPE).build();
actionx.perform();

//Post Labels
WebElement postlabels=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[5]"));
js.executeScript("arguments[0].click()", postlabels);
Thread.sleep(3000);
WebElement selectTPL1=driver.findElement(By.xpath("(//span[contains(text(),' Automation Demo Post ')])[1]"));
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



