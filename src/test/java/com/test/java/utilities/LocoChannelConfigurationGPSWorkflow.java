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


public class LocoChannelConfigurationGPSWorkflow {
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
	
public static void ChannelConfigurationGPSWorkFlow(WebDriver driver) throws Exception {
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
			WebElement voice=driver.findElement(By.xpath("(//mat-icon[contains(text(),'call')])"));
			WebElement ecommerce=driver.findElement(By.xpath("(//img[@src='assets/images/account/e-commerce.svg'])[1]"));
			if(OtherHeading.isDisplayed() && Email1.isDisplayed() && GoogleAlerts.isDisplayed() && TripAdviser.isDisplayed() 
		    && Booking.isDisplayed() && Expedia.isDisplayed() && GoogleAnalytics.isDisplayed() && Holidayiq.isDisplayed() 
		    && voice.isDisplayed() && voice.isDisplayed() && ecommerce.isDisplayed() && voice.isDisplayed()){
			System.out.println("Select Brand Heading and Other Channels are displayed");
			}
			else {
			System.out.println("Select Brand Heading and Other Channels are not displayed");
			}
			Thread.sleep(3000);

//GPS Channel Configuration			
			WebElement GPSconfi=driver.findElement(By.xpath("(//img[@src='assets/images/account/playstore_icon.svg'])"));
			js.executeScript("arguments[0].click()", GPSconfi);
			Thread.sleep(5000);
//Add GPS Account Window UI Components
			WebElement AddGPSAccheading=driver.findElement(By.xpath("//p[contains(text(),'How you want to configure play store?')]"));
			WebElement AddGPSAccheadingInfo=driver.findElement(By.xpath("//p[contains(text(),'How you want to configure play store?')]//following::p[1]"));
			WebElement CloseaddGPSAccWindow=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			WebElement AddGPSOwnedAcclabel=driver.findElement(By.xpath("//div[contains(text(),'Upload Json file to configure')]"));
			WebElement AddGPSOwnedAccicon=driver.findElement(By.xpath("//img[@src='assets/images/account/surface.svg']"));
			WebElement AddPublicGPASacc=driver.findElement(By.xpath("//div[contains(text(),'Add Public App')]"));
			WebElement AddPublicGPSAccIcon=driver.findElement(By.xpath("//img[@src='assets/images/account/public-app.svg']"));
			WebElement Cancel=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
			WebElement Next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			if(AddGPSAccheading.isDisplayed() && CloseaddGPSAccWindow.isDisplayed() && AddGPSOwnedAcclabel.isDisplayed() && AddGPSOwnedAccicon.isDisplayed()
			&& AddPublicGPASacc.isDisplayed() && AddPublicGPSAccIcon.isDisplayed() && Cancel.isDisplayed() && Next.isDisplayed() && AddGPSAccheadingInfo.isDisplayed())
			{
			System.out.println("Add GPS Account Window UI Components are displayed");
			}
			else {
			System.out.println("Add GPS Account Window UI Components are not displayed");
			}
			js.executeScript("arguments[0].click()", Next);
			Thread.sleep(5000);
		
//Upload Application JSON File		
			WebElement Heading=driver.findElement(By.xpath("//h3[contains(text(),'Upload Application JSON file')]"));
			WebElement Info=driver.findElement(By.xpath("//h3[contains(text(),'Upload Application JSON file')]//following::p[1]"));
			WebElement Cross=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
			WebElement Uploadfield=driver.findElement(By.xpath("(//p[contains(text(),'Upload JSON file')])"));
			WebElement Packagefield=driver.findElement(By.xpath("(//p[contains(text(),'Package')])"));
			WebElement Cancel2=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])[2]"));
			WebElement Validate=driver.findElement(By.xpath("(//span[contains(text(),'Validate')])[1]"));
			if(Heading.isDisplayed() && Info.isDisplayed() && Cross.isDisplayed() && Info.isDisplayed() && Uploadfield.isDisplayed() && Packagefield.isDisplayed()
			&& Cancel2.isDisplayed() && Validate.isDisplayed())
			{
			System.out.println("Upload Application JSON File field UI Components are displayed");
			}
			else {
			System.out.println("Upload Application JSON File field UI Components are not displayed");
			}
//Upload	
			WebElement upload=driver.findElement(By.xpath("(//img[@src='assets/images/account/surface.svg'])[2]"));
			upload.click();
			Thread.sleep(4000);	
			Robot rb = new Robot();
			rb.delay(2000);
			StringSelection ss = new StringSelection("C:\\Users\\admin\\Downloads\\File.json");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(2000);
			WebElement Packagename = driver.findElement(By.xpath("(//mat-label[contains(text(),'App Package Name')])"));
			Actions actions5 = new Actions(driver);
			Action action5 = actions5.sendKeys(Packagename, "com.locobuzz.locobuzzapp").build();
	        action5.perform();
			Thread.sleep(3000);
			
			WebElement Friendly = driver.findElement(By.xpath("(//mat-label[contains(text(),'App Friendly Name')])"));
			Actions actions6 = new Actions(driver);
			Action action6 = actions6.sendKeys(Friendly, "Locobuzz").sendKeys(Keys.ENTER).build();
	        action6.perform();
			Thread.sleep(7000);
			System.out.println("GPS JSON File Upload Successfully");
			
            driver.navigate().refresh();
			WebDriverWait wait1 = new WebDriverWait(driver, 40);
			WebElement homepageLocator1 = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Channel')])[2]")));
			
//After refreshing Select Komal Brand			
			WebElement drpdwn1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", drpdwn1);
			Thread.sleep(3000);
			 WebElement selectbrand1 = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
			js.executeScript("arguments[0].click()", selectbrand1);
			Thread.sleep(8000);
//Add Public GPS Account
			WebElement addPublicGPS=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
			js.executeScript("arguments[0].click()", addPublicGPS);
			Thread.sleep(3000);
			WebElement PublicGPSConfiguration=driver.findElement(By.xpath("(//img[@src='assets/images/account/playstore_icon.svg'])[3]"));
			js.executeScript("arguments[0].click()", PublicGPSConfiguration);
			Thread.sleep(3000);
			WebElement PublicGPStxbx=driver.findElement(By.xpath("(//div[contains(text(),'Add Public App')])"));
			js.executeScript("arguments[0].click()", PublicGPStxbx);
			Thread.sleep(3000);
			WebElement next=driver.findElement(By.xpath("(//span[contains(text(),'Next')])"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(3000);
//Add Public Accout UI Components			
			/*WebElement AddPubAccHeading=driver.findElement(By.xpath("(//h3[contains(text(),'Add Public App')])"));
			WebElement ClosePublicWindow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
			WebElement EnterHeading=driver.findElement(By.xpath("(//p[contains(text(),'Enter app name and an HTTPS or HTTP URL')])"));
			WebElement Appnametxbx=driver.findElement(By.xpath("(//mat-label[contains(text(),'App Name')])"));
			WebElement AppURLTXBX=driver.findElement(By.xpath("(//mat-label[contains(text(),'App URL')])"));
			WebElement CancelPURL=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])[2]"));
			WebElement SavePURL=driver.findElement(By.xpath("(//span[contains(text(),'Save URL')])[1]"));
			if(AddPubAccHeading.isDisplayed() && ClosePublicWindow.isDisplayed() && EnterHeading.isDisplayed() && Appnametxbx.isDisplayed() && Uploadfield.isDisplayed() 
					&& AppURLTXBX.isDisplayed() && CancelPURL.isDisplayed() && SavePURL.isDisplayed())
			{
			System.out.println("Add Public Accout UI Components	 are displayed");
			}
			else {
			System.out.println("Add Public Accout UI Components	 are not displayed");
			}*/
			WebElement Appname = driver.findElement(By.xpath("(//mat-label[contains(text(),'App Name')])"));
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Appname, "Candy Crush").sendKeys(Keys.ENTER).build();
	        action.perform();
			Thread.sleep(3000);
			
			WebElement AppURL = driver.findElement(By.xpath("(//mat-label[contains(text(),'App URL')])"));
			Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(AppURL, "https://play.google.com/store/apps/details?id=com.king.candycrushsaga").sendKeys(Keys.ENTER).build();
	        action2.perform();
			Thread.sleep(3000);
			WebElement SaveURL=driver.findElement(By.xpath("(//span[contains(text(),'Save URL')])"));
			js.executeScript("arguments[0].click()", SaveURL);
			Thread.sleep(8000);
//Click on GPS Account		
			WebElement GPSprofile = driver.findElement(By.xpath("(//a[contains(text(),'Google Play Store')])"));
			GPSprofile.click();
			Thread.sleep(5000);		
//Verify All Twitter Label Details
			WebElement logo = driver.findElement(By.xpath("(//img[@src='assets/images/account/playstore_icon.svg'])[1]"));
			WebElement label = driver.findElement(By.xpath("(//span[contains(text(),'Google Play Store (2)')])"));
			System.out.println("All GPS Heading Details:"+label.getText());
			Thread.sleep(3000);
//Verify Owned GPS Account Configuration			
			WebElement AccountJSONFile = driver.findElement(By.xpath("(//div[contains(text(),'File.json')])"));
			System.out.println("Name of Google PlayStore profile Configuration is:"+AccountJSONFile.getText());
			WebElement AccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'colored__white text__sm')])[1]"));
			System.out.println("Time of Google PlayStore profile Configuration is:"+AccConfTime.getText());
			//WebElement ConfStatus = driver.findElement(By.xpath("(//span[contains(text(),'Owned')])[3]"));
			//System.out.println("Time of twitter profile Configuration is:"+ConfStatus.getText());
			WebElement edit = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[7]"));
			WebElement Delete = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[6]"));
			WebElement pausebutton = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[8]"));
			Thread.sleep(3000);
			if(edit.isDisplayed() && Delete.isDisplayed() && pausebutton.isDisplayed())
			{
			System.out.println("Verify Owned GPS Account Configuration Details are  displayed");
			}
			else {
			System.out.println("Verify Owned GPS Account Configuration Details are not displayed");
			}
			
//Verify Public GPS Account Configuration			
			WebElement PAccountHandle = driver.findElement(By.xpath("(//div[contains(text(),'Candy Crush')])"));
			System.out.println("Name of Google PlayStore profile Configuration is:"+PAccountHandle.getText());
			WebElement PAccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'colored__white text__sm')])[2]"));
			System.out.println("Time of Google PlayStore profile Configuration is:"+PAccConfTime.getText());
			//WebElement PConfStatus = driver.findElement(By.xpath("(//span[contains(text(),'Public')])[1]"));
			//System.out.println("Time of twitter profile Configuration is:"+PConfStatus.getText());
			WebElement PDelete = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[9]"));
			WebElement Edit = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[10]"));
			WebElement Pause = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[11]"));
			Thread.sleep(3000);
			if(PDelete.isDisplayed() && Pause.isDisplayed() && Edit.isDisplayed())
			{
			System.out.println("Verify Public GPS Account Configuration Details are  displayed");
			}
			else {
			System.out.println("Verify Public GPS Account Configuration Details are not displayed");
			}
			

			
//Delete Owned and Public Configured Account			
			WebElement Odelete = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[9]"));
			js.executeScript("arguments[0].click()", Odelete);
			Thread.sleep(3000);	
			WebElement OdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", OdeleteConfirm);
			Thread.sleep(5000);
			WebElement Pdelete = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[6]"));
			js.executeScript("arguments[0].click()", Pdelete);
			Thread.sleep(3000);	
			WebElement PdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", PdeleteConfirm);
			Thread.sleep(5000);	

//Verify Google Play Store Account Deleted or not
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


