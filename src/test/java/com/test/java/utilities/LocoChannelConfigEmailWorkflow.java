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


public class LocoChannelConfigEmailWorkflow {
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
	
public static void ChannelConfigurationEmailWorkFlow(WebDriver driver) throws Exception {
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
			
// Active Social Profiles/Total : and  Active Other Profiles/Total : Labels	
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
			WebElement Glassdoorlogo=driver.findElement(By.xpath("(//img[@src='assets/images/account/glassdoor.svg'])[1]"));
			if(PremiumHeading.isDisplayed() && Premiumlogo.isDisplayed() && Glassdoorlabel.isDisplayed() && Glassdoorlogo.isDisplayed())
			{
			System.out.println("Social Media Channels Heading and Premium Channels are displayed");
			}
			else {
			System.out.println("Social Media Channels Heading and Premium Channels are not  displayed");
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
		    && voice.isDisplayed() && voice.isDisplayed() && ecommerce.isDisplayed() ){
			System.out.println("Select Brand Heading and Other Channels are displayed");
			}
			else {
			System.out.println("Select Brand Heading and Other Channels are not displayed");
			}
			Thread.sleep(3000);

//Email Channel Configuration			
			WebElement Emailconfi=driver.findElement(By.xpath("(//img[@src='assets/images/account/email.svg'])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Emailconfi);
			js.executeScript("arguments[0].click()", Emailconfi);
			Thread.sleep(5000);
			WebElement Emailconfiadv=driver.findElement(By.xpath("//img[@src='assets/images/account/email_advanced.svg']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Emailconfiadv);
			js.executeScript("arguments[0].click()", Emailconfiadv);
			Thread.sleep(5000);
//Add Email Accounts Window UI Components
			WebElement AddEmailAccheading=driver.findElement(By.xpath("//span[contains(text(),'Email configuration')]"));
			WebElement CloseaddEmailAccWindow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			WebElement IncomingEmail=driver.findElement(By.xpath("(//div[contains(text(),'Incoming Email ')])"));
			WebElement numberlabel=driver.findElement(By.xpath("(//div[contains(text(),'1')])"));
			WebElement IMC=driver.findElement(By.xpath("(//p[contains(text(),'Incoming Email Configuration')])"));
			WebElement IMCIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'file_download')])"));
			WebElement IMCInfo=driver.findElement(By.xpath("(//p[contains(text(),'Incoming Email Configuration')])//following::p[1]"));
			WebElement Forwadiglabel=driver.findElement(By.xpath("(//p[contains(text(),'Forwarding Method')])"));
			WebElement SSLlabel=driver.findElement(By.xpath("(//p[contains(text(),'SSL Enable/Disable')])"));
			if(AddEmailAccheading.isDisplayed() && CloseaddEmailAccWindow.isDisplayed() && IncomingEmail.isDisplayed() && numberlabel.isDisplayed()
			&& IMC.isDisplayed() && IMCIcon.isDisplayed() && IMCInfo.isDisplayed() && Forwadiglabel.isDisplayed() && SSLlabel.isDisplayed())
			{
			System.out.println("Add Email Account Window UI Components are displayed");
			}
			else {
			System.out.println("Add Email Account Window UI Components are not displayed");
			}
			Thread.sleep(3000);
//Incoming Email Configuration Process		
			WebElement name=driver.findElement(By.xpath("(//input[@type='string'])[1]"));
			WebElement email=driver.findElement(By.xpath("(//input[@type='string'])[2]"));
			WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));

			if(name.isDisplayed() && email.isDisplayed() && password.isDisplayed() )
			{
			System.out.println("Incoming Email Configuration Process Label is  displayed");
			}
			else {
			System.out.println("Incoming Email Configuration Process Label is not displayed");
			}
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(name,"Komal Mali").sendKeys(Keys.ENTER).build();
	        action.perform();
	        Thread.sleep(3000);
	        Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(email, "testing.komal2612@gmail.com").sendKeys(Keys.ENTER).build();
	        action1.perform();
	        Thread.sleep(3000);
	        Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(password, "bqlrtbkvkljdquku").sendKeys(Keys.ENTER).build();
	        action2.perform();
	        Thread.sleep(3000);
	        WebElement next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(8000);
			
//Outgoing Email Configuration UI Components
			WebElement OutgoingEmailconfiguration=driver.findElement(By.xpath("(//div[contains(text(),'Outgoing Email')])"));
			WebElement Numberlabel=driver.findElement(By.xpath("(//div[contains(text(),' 2')])"));
			WebElement OMC=driver.findElement(By.xpath("(//p[contains(text(),'Outgoing Email Configuration')])"));
			WebElement OMCIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'file_upload')])"));
			WebElement OMCInfo=driver.findElement(By.xpath("(//p[contains(text(),'Outgoing Email Configuration')])//following::p[1]"));
			WebElement Forwadiglabel1=driver.findElement(By.xpath("(//p[contains(text(),'Forwarding Method')])"));
			WebElement SSLlabel1=driver.findElement(By.xpath("(//p[contains(text(),'SSL Enable/Disable')])"));
			if(OutgoingEmailconfiguration.isDisplayed() && Numberlabel.isDisplayed() && OMC.isDisplayed() && OMCIcon.isDisplayed()
			&& OMCInfo.isDisplayed() && Forwadiglabel1.isDisplayed() && SSLlabel1.isDisplayed())
			{
			System.out.println("Add Outgoing Email Account Window UI Components are displayed");
			}
			else {
			System.out.println("Add Outgoing Email Account Window UI Components are not displayed");
			}
			
//ADD Email in CC and BCC Field ,Footer
			WebElement CC=driver.findElement(By.xpath("(//input[@placeholder='Enter email id'])[1]"));
			WebElement BCC=driver.findElement(By.xpath("(//input[@placeholder='Enter email id'])[2]"));
			WebElement Footer=driver.findElement(By.xpath("(//p[contains(text(),'Footer Configuration')])"));
		    if(CC.isDisplayed() && BCC.isDisplayed() && Footer.isDisplayed() )
			{
			System.out.println("CC & BCC,Footer Email txbx Label is  displayed");
			}
			else {
			System.out.println("CC & BCC,Footer Email txbx Label is not displayed");
			}
		   
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Footer);
		    Thread.sleep(5000);
		    WebElement TextArea = driver.findElement(By.xpath("(//iframe[@class='cke_wysiwyg_frame cke_reset'])"));
	        driver.switchTo().frame(TextArea);
	         Thread.sleep(2000);

	         WebElement framedata = driver.
	        findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p"));

	         Actions builder = new Actions(driver);
	         Action act = builder.moveToElement(framedata).click().
	        		 sendKeys(framedata, " Incoming/Outgoing Email Configuration Footer\r\n"
	                 	+ "QA Testing.\r\n"
	                 	+ "Pass.").build();	         
	         act.perform();
            driver.switchTo().defaultContent();
            Thread.sleep(3000);
	        Thread.sleep(3000);
	        Actions actions4 = new Actions(driver);
			Action action4 = actions4.sendKeys(CC, "komal@gmail.com").sendKeys(Keys.ENTER).build();
	        action4.perform();
	        Thread.sleep(3000);
	        Actions actions5 = new Actions(driver);
			Action action5 = actions5.sendKeys(BCC, "malikomal123@gmail.com").sendKeys(Keys.ENTER).build();
	        action5.perform();
	        Thread.sleep(3000);
	        WebElement next2=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()", next2);
			Thread.sleep(5000);
			
//Add Labels and Advanced Settings	
			WebElement Numberlabel3 = driver.findElement(By.xpath("//div[contains(text(),' 3')]"));
			WebElement Label = driver.findElement(By.xpath("//div[contains(text(),'Add Labels')]"));
			WebElement AdvancedSettings = driver.findElement(By.xpath("//p[contains(text(),'Advanced Settings')]"));
			WebElement advSettingslogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]"));
			WebElement Autoacknw = driver.findElement(By.xpath("//span[contains(text(),'Auto Acknowledge')]"));
			WebElement Asspreviousmailtrail = driver.findElement(By.xpath("//span[contains(text(),'Add Previous Mail Trail')]"));
			if(Numberlabel3.isDisplayed() && Label.isDisplayed() && AdvancedSettings.isDisplayed() && AdvancedSettings.isDisplayed()
			&& advSettingslogo.isDisplayed() && Autoacknw.isDisplayed() && Asspreviousmailtrail.isDisplayed())
		    {
			System.out.println("Advanced Settings UI Components are displayed");
			}
			else {
			System.out.println("Advanced Settings UI Components are not displayed");
			}
			WebElement Autocheck=driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
			js.executeScript("arguments[0].click()", Autocheck);
			Thread.sleep(5000);
			WebElement Forwarded=driver.findElement(By.xpath("//p[contains(text(),'Forwarding Method')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Forwarded);
			Thread.sleep(5000);
			WebElement TextArea2 = driver.findElement(By.xpath("(//iframe[@class='cke_wysiwyg_frame cke_reset'])"));
		    driver.switchTo().frame(TextArea2);
		    Thread.sleep(2000);
		    WebElement framedata2 = driver.
		    findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p"));
		    Actions builder2 = new Actions(driver);
		    Thread.sleep(2000);
		    Action act3 = builder2.moveToElement(framedata2).click().
		    sendKeys(framedata2, "Thanks For Connecting With Us\r\n"
		                 	+ "QA Team.\r\n"
		                 	+ "Reply soon").build();	         
		    act3.perform();
	        driver.switchTo().defaultContent();
	        Thread.sleep(3000);
			WebElement next3=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()", next3);
			Thread.sleep(5000);
			
			
            
//Publish UI Components 
            WebElement Numberlabel4 = driver.findElement(By.xpath("//div[contains(text(),'4')]"));
			WebElement PublishLabel = driver.findElement(By.xpath("//div[contains(text(),'Publish')]"));
			WebElement Preview = driver.findElement(By.xpath("//p[contains(text(),'Preview')]"));
			WebElement Previewicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]"));
			
			if(Numberlabel4.isDisplayed() && PublishLabel.isDisplayed() && Preview.isDisplayed() && Previewicon.isDisplayed())
		    {
			System.out.println("Publish UI Components are displayed");
			} 
			else {
			System.out.println("Publish UI Components are not displayed");
			}
			WebElement Drp1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-content ng-tns-c')])[5]"));
			js.executeScript("arguments[0].click()", Drp1);
			Thread.sleep(3000);
			WebElement Drp2 = driver.findElement(By.xpath("(//span[contains(@class,'mat-content ng-tns-c')])[6]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Drp2);
			js.executeScript("arguments[0].click()", Drp2);
			Thread.sleep(3000);
			WebElement Drp3= driver.findElement(By.xpath("(//span[contains(@class,'mat-content ng-tns-c')])[7]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Drp3);
			js.executeScript("arguments[0].click()", Drp3);
			Thread.sleep(1000);
			WebElement Drp4 = driver.findElement(By.xpath("(//span[contains(@class,'mat-content ng-tns-c')])[8]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Drp4);
			js.executeScript("arguments[0].click()", Drp4);
			Thread.sleep(1000);
			WebElement saveclose = driver.findElement(By.xpath("(//span[contains(text(),'Save & Close')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", saveclose);
			js.executeScript("arguments[0].click()", saveclose);
			Thread.sleep(5000);
//Verify All Email Label Details
			WebElement Email = driver.findElement(By.xpath(" //a[contains(text(),'Email')]"));
			js.executeScript("arguments[0].click()", Email);
			Thread.sleep(5000);
			WebElement EmailIcon = driver.findElement(By.xpath("//img[@src='assets/images/account/email.svg']"));
			WebElement label = driver.findElement(By.xpath("//span[contains(text(),'Email (1)')]"));
			System.out.println("All Email Heading Details:"+label.getText()+EmailIcon.getText());
			Thread.sleep(3000);
//Verify Incoming Email Configuration
			WebElement ConfigStatus = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__email__box--status')])[1]"));
			System.out.println("Status of Email profile Configuration is:"+ConfigStatus.getText());
			Thread.sleep(3000);
			WebElement AccountPage = driver.findElement(By.xpath("(//div[contains(text(),'Komal')])[1]"));
			System.out.println("Name of Email profile Configuration is:"+AccountPage.getText());
			Thread.sleep(3000);
			WebElement AccConfTime = driver.findElement(By.xpath("(//span[contains(@class,'text__sm line-height')])[1]"));
			System.out.println("Time of Email profile Configuration is:"+AccConfTime.getText());
			Thread.sleep(3000);
			WebElement ConfStatus = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__email__box--statusIncoming d-flex-items-center')])"));
			System.out.println("Status of Email profile Configuration is:"+ConfStatus.getText());
			Thread.sleep(3000);
			WebElement IncomingServer = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__email--body')])[1]"));
			System.out.println("Incoming Server of Email profile Configuration is:"+IncomingServer.getText());
			Thread.sleep(3000);
//Verify  Outgoing Email Configuration
			WebElement ConfigStatus2 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__email__box--status')])[2]"));
			System.out.println("Status of Email profile Configuration is:"+ConfigStatus2.getText());
			Thread.sleep(3000);
			WebElement OutAccountUser = driver.findElement(By.xpath("(//div[contains(text(),'Komal')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", OutAccountUser);
			System.out.println("Name of Email profile Configuration is:"+OutAccountUser.getText());
			Thread.sleep(3000);
			WebElement OutAccConfTime = driver.findElement(By.xpath("(//span[contains(@class,'text__sm line-height')])[2]"));
			System.out.println("Time of Email profile Configuration is:"+OutAccConfTime.getText());
			Thread.sleep(3000);
			WebElement PConfStatus = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__email__box--statusOutgoing d-flex-items-center')])"));
			System.out.println("Status of Email profile Configuration is:"+PConfStatus.getText());
			Thread.sleep(3000);
			WebElement OutgoingServer = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__email--body')])[2]"));
			System.out.println("Outgoing Server of Email profile Configuration is:"+OutgoingServer.getText());
			Thread.sleep(3000);
			WebElement Edit = driver.findElement(By.xpath(" (//img[@src='assets/images/account/edit.svg'])[2]"));
			WebElement Delete = driver.findElement(By.xpath(" (//mat-icon[contains(text(),'delete')])[2]"));
			WebElement Reathorize = driver.findElement(By.xpath(" (//mat-icon[contains(text(),'update')])[2]"));
			WebElement Footerbutton = driver.findElement(By.xpath(" //span[contains(text(),'Footer')]"));
			//WebElement Ppausebutton = driver.findElement(By.xpath(" (//mat-icon[contains(text(),'pause')])[2]"));
			Thread.sleep(3000);
			if(Edit.isDisplayed() && Delete.isDisplayed() && Reathorize.isDisplayed()  && Footerbutton.isDisplayed())
			{
			System.out.println("Outgoing Email Configuration Elements are  displayed");
			}
			else {
			System.out.println("Outgoing Email Configuration Elements are not displayed");
			}
			Thread.sleep(3000);	
			
//Delete Incoming and Outgoing Configured Account
			/*WebElement Ppausebutton1 = driver.findElement(By.xpath(" (//mat-icon[contains(text(),'pause')])[2]"));
			js.executeScript("arguments[0].click()", Ppausebutton1);
			Thread.sleep(3000);	
			WebElement PauseConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", PauseConfirm);
			Thread.sleep(5000);*/
			WebElement Odelete = driver.findElement(By.xpath(" (//mat-icon[contains(text(),'delete')])[2]"));
			js.executeScript("arguments[0].click()", Odelete);
			Thread.sleep(3000);	
			WebElement OdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", OdeleteConfirm);
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


