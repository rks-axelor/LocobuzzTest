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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LocoChannelConfigVoiceConfigWorkflow {
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
	
public static void ChannelConfigurationVoiceWorkFlow(WebDriver driver) throws Exception {
	try {
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//Listening Settings
		WebElement ListeningSettings=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
		if(ListeningSettings.isDisplayed()) {
		System.out.println("Listening Settings is displayed");
		}
		else {
		System.out.println("Listening Settings is not displayed");
		}
		js.executeScript("arguments[0].click()", ListeningSettings);
		Thread.sleep(3000);
		
//Channel Configuration label and logo
		WebElement Channelconfigurationlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Channel_Configuration.svg']"));
		WebElement ChannelConfigurationlabel=driver.findElement(By.xpath("//span[contains(text(),'Channel Configuration')]"));
		if(Channelconfigurationlogo.isDisplayed()&&ChannelConfigurationlabel.isDisplayed()) {
		System.out.println("Channel Configuration label and logo is displayed");
		}
		else {
		System.out.println("Channel Configuration label and logo is not displayed");
		}
		js.executeScript("arguments[0].click()", ChannelConfigurationlabel);
		Thread.sleep(3000);
		
//Channel Configuration tab
		WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
		WebElement CCTab=driver.findElement(By.xpath("(//span[contains(text(),'Channel')])[2]"));
		if(pushpin.isDisplayed()&&CCTab.isDisplayed()) {
		System.out.println("Channel Configuration tab Label is displayed");
		}
		else {
		System.out.println("Channel Configuration tab Label is not displayed");
		}
		Thread.sleep(3000);
		
//select Brand
		WebElement selectbrandtxbxlabel = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[1]"));
		WebElement drpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
		WebElement SelectBrandTxbx = driver.findElement(By.xpath(("(//div[contains(@class,'mat-select-trigger')])[1]")));
		js.executeScript("arguments[0].click()", drpdwn);
		Thread.sleep(3000);
		if (selectbrandtxbxlabel.isDisplayed() && drpdwn.isDisplayed() && SelectBrandTxbx.isDisplayed()) 
		{
		System.out.println("select Brand field is displayed");
        } else 
		{
		System.out.println("select Brand field is not displayed");
		}
		Thread.sleep(3000);
		 WebElement selectbrand = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
		js.executeScript("arguments[0].click()", selectbrand);
		Thread.sleep(8000);
		
//Active Social Profiles/Total : and  Active Other Profiles/Total : Labels	
        WebElement socialprofilelabel=driver.findElement(By.xpath("(//p[contains(text(),'Active Social Profiles/Total :')])"));
		WebElement otherprofilelabel=driver.findElement(By.xpath("(//p[contains(text(),'Active Other Profiles/Total :')])"));
		if(socialprofilelabel.isDisplayed()&&otherprofilelabel.isDisplayed()) {
		System.out.println("Active Profiles Label Field is displayed");
		}
		else {
		System.out.println("Active Profiles Label Field is not displayed");
		}
		Thread.sleep(3000);
		
//Add Channel Icon and Label field
		WebElement Addchannelicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[1]"));
		WebElement Addchannellabel=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
		if(Addchannelicon.isDisplayed()&&Addchannellabel.isDisplayed()) {
		System.out.println("Add Channel Icon and Label field is displayed");
		}
		else {
		System.out.println("Add Channel Icon and Label field is not displayed");
		}
		Thread.sleep(3000);
//Add Channel Field
		WebElement addchannel=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
		js.executeScript("arguments[0].click()", addchannel);
		Thread.sleep(3000);

//Social Media Channels	
		WebElement heading=driver.findElement(By.xpath("//div[contains(text(),'Social Media Channels')]"));
		WebElement Twitter1=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/twitter.svg'])[1]"));
		WebElement Facebook1=driver.findElement(By.xpath("(//img[@src='assets/images/account/facebook.svg'])[2]"));
		WebElement Instagram1=driver.findElement(By.xpath("(//img[@src='assets/images/account/instagram.svg'])[2]"));
		WebElement Youtube1=driver.findElement(By.xpath("(//img[@src='assets/images/channelicons/Youtube.svg'])"));
		WebElement LinkedIn1=driver.findElement(By.xpath("(//img[@src='assets/images/account/Linkedin_icon.svg'])"));
		WebElement GPlayS1=driver.findElement(By.xpath("(//img[@src='assets/images/account/playstore_icon.svg'])"));
		WebElement GMB1=driver.findElement(By.xpath("(//img[@src='assets/images/account/gmb.svg'])"));
		if(heading.isDisplayed() && Twitter1.isDisplayed() && Facebook1.isDisplayed() && Instagram1.isDisplayed()
		&& Youtube1.isDisplayed() && LinkedIn1.isDisplayed() && GPlayS1.isDisplayed() && GMB1.isDisplayed()) {
		System.out.println("Social Media Channels Heading and Social Channels are displayed");
		}
		else {
		System.out.println("Social Media Channels Heading and Social Channels are not  displayed");
		}
		Thread.sleep(3000);

//Premium Channels 
		/*WebElement PremiumHeading=driver.findElement(By.xpath("(//div[contains(text(),' Premium Channels ')])[1]"));
		WebElement Premiumlogo=driver.findElement(By.xpath("(//img[@src='assets/images/account/premium.svg'])"));
		WebElement Glassdoorlabel=driver.findElement(By.xpath("(//div[contains(text(),'Glassdoor')])[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Glassdoorlabel);
		WebElement Glassdoorlogo=driver.findElement(By.xpath("(//img[@src='assets/images/account/glassdoor.svg'])[1]"));
		if(PremiumHeading.isDisplayed() && Premiumlogo.isDisplayed() && Glassdoorlabel.isDisplayed() && Glassdoorlogo.isDisplayed())
		{
		System.out.println("Premium Channels Heading and Premium Channels are displayed");
		}
		else {
		System.out.println("Premium  Channels Heading and Premium Channels are not  displayed");
		}
		Thread.sleep(3000);*/
		
//Other Channels
		WebElement OtherHeading=driver.findElement(By.xpath("//div[contains(text(),'Other Channels')] "));
		WebElement Email1=driver.findElement(By.xpath("(//img[@src='assets/images/account/email.svg'])[1]"));
		WebElement GoogleAlerts=driver.findElement(By.xpath("(//img[@src='assets/images/account/google_alert.svg'])[1]"));
		WebElement TripAdviser=driver.findElement(By.xpath("(//img[@src='assets/images/account/tripadvisor.svg'])[1]"));
		WebElement Booking=driver.findElement(By.xpath("(//img[@src='assets/images/account/booking.svg'])[1]"));
		WebElement Expedia=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/expedia.svg'])[1]"));
		WebElement GoogleAnalytics=driver.findElement(By.xpath("(//img[@src='assets/images/account/Google_Analytics_icon.svg'])[1]"));
		WebElement Holidayiq=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/holidayiq.svg'])[1]"));
		//WebElement glassdoor1=driver.findElement(By.xpath("(//img[@src='assets/images/account/glassdoor.svg'])[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Holidayiq);
		WebElement voice=driver.findElement(By.xpath("(//mat-icon[contains(text(),'call')])"));
		WebElement ecommerce=driver.findElement(By.xpath("(//img[@src='assets/images/account/e-commerce.svg'])[1]"));
		if(OtherHeading.isDisplayed() && Email1.isDisplayed() && GoogleAlerts.isDisplayed() && TripAdviser.isDisplayed() 
	    && Booking.isDisplayed() && Expedia.isDisplayed() && GoogleAnalytics.isDisplayed() && Holidayiq.isDisplayed() 
	    && voice.isDisplayed() && voice.isDisplayed() && ecommerce.isDisplayed()){
		System.out.println("Select Brand Heading and Other Channels are displayed");
		}
		else {
		System.out.println("Select Brand Heading and Other Channels are not displayed");
		}
		Thread.sleep(3000);

//Voice Channel Configuration			
		WebElement HolidayIQconfig=driver.findElement(By.xpath("(//mat-icon[contains(text(),'call')])"));
		js.executeScript("arguments[0].click()", HolidayIQconfig);
		Thread.sleep(5000);
//Add Voice Account Window UI Components
		WebElement AddGAaccheading=driver.findElement(By.xpath("(//p[contains(text(),' Select services provider for which you want to configure the VOIP account ')])"));
		WebElement AddGAAccheadingIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'phone_in_talk')])"));
		WebElement AddvoiceQnote=driver.findElement(By.xpath("(//p[contains(text(),' Select services provider for which you want to configure the VOIP account ')])//following::p[1]"));
		WebElement CloseaddGAAccWindow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
		WebElement backlabel=driver.findElement(By.xpath(" (//span[contains(text(),'VOIP configuration')])[1]"));
		WebElement Addlocouzzblock=driver.findElement(By.xpath("//img[@src='assets/images/account/Lcobuzz.svg']"));
		//WebElement AddURLGAMandatory=driver.findElement(By.xpath("//span[contains(text(),'*')]"));
	    WebElement next=driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
		if(AddGAaccheading.isDisplayed() && CloseaddGAAccWindow.isDisplayed() && CloseaddGAAccWindow.isDisplayed() 
		&& backlabel.isDisplayed()  && AddvoiceQnote.isDisplayed() 
		&& Addlocouzzblock.isDisplayed() && next.isDisplayed()  && AddGAAccheadingIcon.isDisplayed())
		{
		System.out.println("Add Voice Account Window UI Components are displayed");
		}
		else {
		System.out.println("Add Voice Account Window UI Components are not displayed");
		}
		js.executeScript("arguments[0].click()", Addlocouzzblock);
		Thread.sleep(5000);
	    WebElement next2=driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
		js.executeScript("arguments[0].click()", next2);
		Thread.sleep(5000);
//Configured no for Inbound & Outbound Calls page
		WebElement configurednoheding=driver.findElement(By.xpath("(//p[contains(text(),'Configured numbers for inbound and outbound calls')])"));
		WebElement Backarrow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
		WebElement ConfiguredInfo=driver.findElement(By.xpath("(//p[contains(text(),'Configured numbers for inbound and outbound calls')])//following::p[1]"));
		WebElement selectagents2=driver.findElement(By.xpath("(//li[contains(@class,'active')])[2]"));
		WebElement headingconfigureicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'phone_in_talk')])[1]"));
		WebElement Label1=driver.findElement(By.xpath("(//li[contains(@class,'active complete')])"));
		WebElement totalrecords=driver.findElement(By.xpath("(//p[contains(@class,'voip__numbers--label font-weight-')])[1]"));
	    WebElement next1=driver.findElement(By.xpath("//span[contains(text(),'Back')]"));
	    WebElement back=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		if(configurednoheding.isDisplayed() && Backarrow.isDisplayed() && ConfiguredInfo.isDisplayed() 
		&& selectagents2.isDisplayed()  && headingconfigureicon.isDisplayed() && Label1.isDisplayed() 
		&& totalrecords.isDisplayed() && next1.isDisplayed()  && back.isDisplayed())
		{
		System.out.println("Add Voice Account Window UI Components are displayed");
		}
		else {
		System.out.println("Add Voice Account Window UI Components are not displayed");
		}
//Voice Configuration New Page
		WebElement Voiceconfigurebacklabel=driver.findElement(By.xpath("(//p[contains(text(),'Select agents')])[1]"));
		WebElement Backarrow2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
		WebElement YourVOIPNumber=driver.findElement(By.xpath("(//li[contains(@class,'active complete')])[1]"));
		WebElement selectagents2label=driver.findElement(By.xpath("(//li[contains(@class,'active')])[2]"));
		WebElement headingconfigureicon1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'phone_in_talk')])[1]"));
		WebElement headingconfigure=driver.findElement(By.xpath("(//li[contains(@class,'active complete')])"));
		WebElement Configureinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select agents')])[1]//following::p[1]"));
		WebElement selectagenttxbx=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Agent')])"));
	    WebElement agentdrpdwn=driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])"));
	    WebElement addagentlist=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[4]"));
	    WebElement back3=driver.findElement(By.xpath("(//span[contains(text(),'Back')])[1]"));
	    WebElement save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]"));
		if(Voiceconfigurebacklabel.isDisplayed() && Backarrow2.isDisplayed() && YourVOIPNumber.isDisplayed() 
		&& selectagents2label.isDisplayed()  && headingconfigure.isDisplayed() && headingconfigureicon1.isDisplayed() 
		&& Configureinfo.isDisplayed() && selectagenttxbx.isDisplayed()  && agentdrpdwn.isDisplayed() && addagentlist.isDisplayed()
		&& back3.isDisplayed()  && save.isDisplayed())
		{
		System.out.println("Add Voice Account Window UI Components are displayed");
		}
		else {
		System.out.println("Add Voice Account Window UI Components are not displayed");
		}
		 WebElement agentdrpdwn1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])"));
		 js.executeScript("arguments[0].click()", agentdrpdwn1);
		 Thread.sleep(5000);
		 WebElement komalagent=driver.findElement(By.xpath("(//span[contains(text(),' komal maliagent ')])[1]"));
		 js.executeScript("arguments[0].click()", komalagent);
		 Thread.sleep(5000);
		 WebElement addagent=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[4]"));
		 js.executeScript("arguments[0].click()", addagent);
		 Thread.sleep(5000);
		 WebElement addpersonamno=driver.findElement(By.xpath("(//span[contains(text(),'+ Add Personal Number')])[1]"));
		 js.executeScript("arguments[0].click()", addpersonamno);
		 Thread.sleep(5000);
		 WebElement countrycode=driver.findElement(By.xpath("(//mat-label[contains(text(),'Country Code')])"));
		 js.executeScript("arguments[0].click()", countrycode);
		 Thread.sleep(5000);
		 WebElement IND=driver.findElement(By.xpath("(//span[contains(text(),'IND')])"));
		 js.executeScript("arguments[0].click()", IND);
		 Thread.sleep(5000);
		 WebElement contactno=driver.findElement(By.xpath("(//mat-label[contains(text(),'Contact Number')])"));
		 js.executeScript("arguments[0].click()", contactno);
		 Thread.sleep(5000);
		 Actions actions6 = new Actions(driver);
		 Action action6 = actions6.sendKeys(contactno, "8787878787").build();
	     action6.perform();
		 Thread.sleep(3000);
		 WebElement SAVENO=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
		 js.executeScript("arguments[0].click()", SAVENO);
		 Thread.sleep(5000);
		 WebElement SAVEinfo=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
		 js.executeScript("arguments[0].click()", SAVEinfo);
		 Thread.sleep(5000);
		
//After refreshing Select Burberry Brand			
		WebElement drpdwn1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
		js.executeScript("arguments[0].click()", drpdwn1);
		Thread.sleep(3000);
		 WebElement selectbrand1 = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
		js.executeScript("arguments[0].click()", selectbrand1);
		Thread.sleep(8000);

//Click on Holiday IQ Account		
		WebElement HolidayIQProfile = driver.findElement(By.xpath("(//a[contains(text(),'HolidayIQ')])"));
		HolidayIQProfile.click();
		Thread.sleep(5000);		
//Verify All Holiday IQ Label Details
		WebElement logo = driver.findElement(By.xpath("//img[@src='assets/images/channel-logos/holidayiq.svg']"));
		WebElement label = driver.findElement(By.xpath("(//span[contains(text(),'HolidayIQ (2)')])"));
		System.out.println("All Holiday IQ Heading Details:"+label.getText());
		Thread.sleep(3000);
		
//Verify  added Holiday IQ  Account Configuration Details			
		WebElement AccountLabel1 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--head bg__grey--lighter')])[1]"));
		System.out.println("Name of Holiday IQ profile Configuration is:"+AccountLabel1.getText());
		WebElement AccConfTime1 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[1]"));
		System.out.println("Time of Holiday IQ profile Configuration is:"+AccConfTime1.getText());
		WebElement Link1 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[2]"));
		System.out.println("Link of Holiday IQ  profile Configuration is:"+Link1.getText());
		WebElement Delete1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[6]"));
		WebElement pausebutton1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[7]"));
		Thread.sleep(3000);
		if( Delete1.isDisplayed() && pausebutton1.isDisplayed())
		{
		System.out.println("Verify Holiday IQ Account Configuration Details are  displayed");
		}
		else {
		System.out.println("Verify Holiday IQ Account Configuration Details are not displayed");
		}
//Verify Newly added Holiday IQ Account Configuration Details			
		WebElement AccountLabel = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--head bg__grey--lighter')])[2]"));
		System.out.println("Name of Holiday IQ profile Configuration is:"+AccountLabel.getText());
		WebElement AccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[3]"));
		System.out.println("Time of Holiday IQ profile Configuration is:"+AccConfTime.getText());
		WebElement Link = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[4]"));
		System.out.println("Link of Holiday IQ profile Configuration is:"+Link.getText());
		WebElement Delete = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[8]"));
		WebElement pausebutton = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[9]"));
		Thread.sleep(3000);
		if( Delete.isDisplayed() && pausebutton.isDisplayed())
		{
		System.out.println("Verify Holiday IQ Account Configuration Details are  displayed");
		}
		else {
		System.out.println("Verify Holiday IQ Account Configuration Details are not displayed");
		}
//Stop Fetchiong Mensions
		/*WebElement Pause2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'pause')])[3]"));
		js.executeScript("arguments[0].click()", Pause2);
		Thread.sleep(3000);	
		WebElement Pauseconfirm2 = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
		js.executeScript("arguments[0].click()", Pauseconfirm2);
		Thread.sleep(3000);
		WebElement Pause1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'pause')])[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Pause1);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Pause1);
		Thread.sleep(3000);	
		WebElement Pauseconfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
		js.executeScript("arguments[0].click()", Pauseconfirm);
		Thread.sleep(3000);*/
		
		
//Delete Holiday IQ Configured Account			
		WebElement AddedAccountDelete = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])[3]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", AddedAccountDelete);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", AddedAccountDelete);
		Thread.sleep(3000);	
		WebElement AdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
		js.executeScript("arguments[0].click()", AdeleteConfirm);
		Thread.sleep(5000);
		WebElement delete = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", delete);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", delete);
		Thread.sleep(3000);	
		WebElement deleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
		js.executeScript("arguments[0].click()", deleteConfirm);
		Thread.sleep(5000);
		

//Verify Holiday IQ Account Deleted or not
		WebElement drpdwn2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
		js.executeScript("arguments[0].click()", drpdwn2);
		Thread.sleep(3000);
		 WebElement selectbrand2 = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
		js.executeScript("arguments[0].click()", selectbrand2);
		Thread.sleep(8000);
		WebElement drpdwn3 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
		js.executeScript("arguments[0].click()", drpdwn3);
		Thread.sleep(3000);
		 WebElement selectbrand3 = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
		js.executeScript("arguments[0].click()", selectbrand3);
		Thread.sleep(8000);
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




