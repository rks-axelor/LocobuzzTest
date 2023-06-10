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


public class LocoChannelConfigurationInstaWorkflow {
public static List<String> componentsInformation = new ArrayList<String>();

public static void goingAccountSession(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//img[@src='assets/images/New_Year_Logo.svg']"));
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
	
public static void ChannelConfigurationInstaWorkFlow(WebDriver driver) throws Exception {
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
			//WebElement Holidayiq=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/holidayiq.svg'])[1]"));
			//WebElement glassdoor1=driver.findElement(By.xpath("(//img[@src='assets/images/account/glassdoor.svg'])[1]"));
			//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Holidayiq);
			WebElement voice=driver.findElement(By.xpath("(//mat-icon[contains(text(),'call')])"));
			WebElement ecommerce=driver.findElement(By.xpath("(//img[@src='assets/images/account/e-commerce.svg'])[1]"));
			if(OtherHeading.isDisplayed() && Email1.isDisplayed() && GoogleAlerts.isDisplayed() && TripAdviser.isDisplayed() 
		    && Booking.isDisplayed() && Expedia.isDisplayed() && GoogleAnalytics.isDisplayed() 
		    && voice.isDisplayed() && voice.isDisplayed() && ecommerce.isDisplayed()){
			System.out.println("Select Brand Heading and Other Channels are displayed");
			}
			else {
			System.out.println("Select Brand Heading and Other Channels are not displayed");
			}
			Thread.sleep(3000);

//Facebook Channel Configuration			
			WebElement Instaconfi=driver.findElement(By.xpath("(//img[@src='assets/images/account/instagram.svg'])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Instaconfi);
			js.executeScript("arguments[0].click()", Instaconfi);
			Thread.sleep(5000);
//Add Facebook or Instagram Accounts Window UI Components
			WebElement AddFBAccheading=driver.findElement(By.xpath("(//h3[contains(text(),'Add Facebook or Instagram Accounts')])"));
			WebElement CloseaddFAccWindow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			WebElement AddTWOwnedAcclabel=driver.findElement(By.xpath("(//p[contains(text(),'Add Owned Accounts')])"));
			WebElement AddTWOwnedAccinfo=driver.findElement(By.xpath("(//p[contains(text(),'Add Owned Accounts')])//following::p[1]"));
			WebElement OR=driver.findElement(By.xpath("(//span[contains(text(),'OR')])"));
			WebElement AddPublicacc=driver.findElement(By.xpath("(//div[contains(text(),'Add Public Accounts')])"));
			WebElement AddPublicaccinfo=driver.findElement(By.xpath("(//div[contains(text(),'Add Public Accounts')])//following::p[1]"));
			WebElement AddPublicTWHdtxbx=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix')])[5]"));
			WebElement Arrow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'east')])"));
			if(AddFBAccheading.isDisplayed() && CloseaddFAccWindow.isDisplayed() && AddTWOwnedAcclabel.isDisplayed() && AddTWOwnedAccinfo.isDisplayed()
			&& OR.isDisplayed() && AddPublicacc.isDisplayed() && AddPublicaccinfo.isDisplayed() && AddPublicTWHdtxbx.isDisplayed() && Arrow.isDisplayed())
			{
			System.out.println("Add Facebook Account Window UI Components are displayed");
			}
			else {
			System.out.println("Add Facebook Account Window UI Components are not displayed");
			}
			Thread.sleep(3000);
//Log in With Facebook	and Insta		
			WebElement LoginWithFacebokLabel=driver.findElement(By.xpath("(//span[contains(text(),'Login With Facebook')])"));
			WebElement Facebooklogo=driver.findElement(By.xpath("(//img[@src='assets/images/account/facbook_white.svg'])"));
			WebElement Instalogo=driver.findElement(By.xpath("(//img[@src='assets/images/account/insta_white.svg'])"));

			if(LoginWithFacebokLabel.isDisplayed() && Instalogo.isDisplayed() && Facebooklogo.isDisplayed() )
			{
			System.out.println("Log in With Facebook and Insta Label is  displayed");
			}
			else {
			System.out.println("Log in With Facebook and Insta Label is not displayed");
			}
			js.executeScript("arguments[0].click()", LoginWithFacebokLabel);
			Thread.sleep(5000);
			ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));	
			WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
			username.sendKeys("shubhangini.shrivatri@locobuzz.com");
			Thread.sleep(3000);
			
			WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password.sendKeys("Newday@2407");
			Thread.sleep(1000);
			WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
			js.executeScript("arguments[0].click()", login);
			Thread.sleep(3000);
			WebElement Continue = driver.findElement(By.xpath("//span[contains(text(),'Continue as Tinny Shrivatri')]"));
			js.executeScript("arguments[0].click()", Continue);
			Thread.sleep(5000);
			
			
//Go To Supervisor Account
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(10000);
			WebElement Continue1 = driver.findElement(By.xpath("(//label[contains(@class,'mat-checkbox-layout')])[1]"));
			js.executeScript("arguments[0].click()", Continue1);
			Thread.sleep(3000);
			WebElement Continue2 = driver.findElement(By.xpath("(//label[contains(@class,'mat-checkbox-layout')])[2]"));
			js.executeScript("arguments[0].click()", Continue2);
			Thread.sleep(3000);
			WebElement addprofiles = driver.findElement(By.xpath("//span[contains(text(),'Add Profiles')]"));
			js.executeScript("arguments[0].click()", addprofiles);
			Thread.sleep(8000);
			//driver.navigate().refresh();
		/*	WebDriverWait wait1 = new WebDriverWait(driver, 40);
			WebElement homepageLocator1 = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Channel')])[2]")));
			Thread.sleep(3000);
//After refreshing Select Komal Brand			
			WebElement drpdwn1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", drpdwn1);
			Thread.sleep(3000);
			 WebElement selectbrand1 = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
			js.executeScript("arguments[0].click()", selectbrand1);
			Thread.sleep(8000);*/
//Add Public Twitter Account
			WebElement addPublicInsta=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
			js.executeScript("arguments[0].click()", addPublicInsta);
			Thread.sleep(3000);
			WebElement PublicInstaConfiguration=driver.findElement(By.xpath("(//img[@src='assets/images/account/instagram.svg'])[2]"));
			js.executeScript("arguments[0].click()", PublicInstaConfiguration);
			Thread.sleep(3000);
			WebElement PublicInstaHandletxbx=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(PublicInstaHandletxbx, "https://www.instagram.com/locobuzzsolutions/").sendKeys(Keys.ENTER).build();
	        action.perform();
	        Thread.sleep(5000);
			
//Click on FacebookInsta Account Label		
			WebElement FacebookInstaprofile = driver.findElement(By.xpath("(//a[contains(text(),'Facebook/Instagram')])"));
			FacebookInstaprofile.click();
			Thread.sleep(5000);		
//Verify All Insta Label Details
			WebElement logo = driver.findElement(By.xpath("(//img[@src='assets/images/account/instagram.svg'])[1]"));
			WebElement label = driver.findElement(By.xpath("//span[contains(text(),'Facebook & Instagram Profiles ')]"));
			System.out.println("All Insta Profile Heading Details:"+label.getText());
			Thread.sleep(3000);
//Verify Owned Insta Account Configuration			
			WebElement AccountPage = driver.findElement(By.xpath("(//span[contains(text(),'DemoInsta')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", AccountPage);
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", AccountPage);
			System.out.println("Name of Insta profile Configuration is:"+AccountPage.getText());
			Thread.sleep(3000);
			WebElement AccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'colored__grey--light text__sm')])[3]"));
			System.out.println("Time of Insta profile Configuration is:"+AccConfTime.getText());
			Thread.sleep(3000);
			WebElement ConfStatus = driver.findElement(By.xpath("(//span[contains(text(),'Owned')])[3]"));
			System.out.println("Configured Status  of Insta profile is:"+ConfStatus.getText());
			Thread.sleep(3000);
			
			WebElement Delete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[3]"));
			WebElement pausebutton = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-stroked-button mat-button-base btnPause')])[3]"));
			Thread.sleep(3000);
			if(Delete.isDisplayed() && pausebutton.isDisplayed())
			{
			System.out.println("All Buttons for Owned Account are  displayed");
			}
			else {
			System.out.println("All Buttons for Owned Account are not displayed");
			}
			Thread.sleep(3000);	
			
//Verify Public Twitter Account Configuration			
			WebElement PAccountHandle = driver.findElement(By.xpath("(//span[contains(text(),'Locobuzz')])"));
			System.out.println("Name of twitter profile Configuration is:"+PAccountHandle.getText());
			WebElement PAccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'colored__grey--light text__sm')])[4]"));
			System.out.println("Time of twitter profile Configuration is:"+PAccConfTime.getText());
			WebElement PConfStatus = driver.findElement(By.xpath("(//span[contains(text(),'Public')])[1]"));
			System.out.println("Time of twitter profile Configuration is:"+PConfStatus.getText());
			WebElement PDelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[4]"));
			WebElement Ppausebutton = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-stroked-button mat-button-base btnPause')])[4]"));
			Thread.sleep(3000);
			if(PDelete.isDisplayed() && Ppausebutton.isDisplayed())
			{
			System.out.println("All Buttons for Public Account are  displayed");
			}
			else {
			System.out.println("All Buttons for Public Account are not displayed");
			}
			Thread.sleep(3000);	
			
//Delete Owned and Public Configured Account			
			WebElement Odelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[4]"));
			js.executeScript("arguments[0].click()", Odelete);
			Thread.sleep(3000);	
			WebElement OdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", OdeleteConfirm);
			Thread.sleep(5000);
			WebElement Pdelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Pdelete);
           js.executeScript("arguments[0].click()", Pdelete);
			Thread.sleep(3000);	
			WebElement PdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", PdeleteConfirm);
			Thread.sleep(5000);	
			WebElement fbdelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", fbdelete);
           js.executeScript("arguments[0].click()", fbdelete);
			Thread.sleep(3000);	
			WebElement fbdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", fbdeleteConfirm);
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




