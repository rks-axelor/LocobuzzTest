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


public class LocoChanneConfigurationTwitterWorkflow {
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
	
public static void ChannelConfigurationTwitterWorkFlow(WebDriver driver) throws Exception {
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
		/*	WebElement PremiumHeading=driver.findElement(By.xpath("(//div[contains(text(),' Premium Channels ')])[1]"));
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
			WebElement Email1=driver.findElement(By.xpath("(//img[@src='assets/images/account/email.svg'])[2]"));
			WebElement GoogleAlerts=driver.findElement(By.xpath("(//img[@src='assets/images/account/google_alert.svg'])[1]"));
			WebElement TripAdviser=driver.findElement(By.xpath("(//img[@src='assets/images/account/tripadvisor.svg'])[1]"));
			WebElement Booking=driver.findElement(By.xpath("(//img[@src='assets/images/account/booking.svg'])[1]"));
			WebElement Expedia=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/expedia.svg'])[1]"));
			WebElement GoogleAnalytics=driver.findElement(By.xpath("(//img[@src='assets/images/account/Google_Analytics_icon.svg'])[1]"));
			//WebElement Holidayiq=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/holidayiq.svg'])[1]"));
			//WebElement glassdoor1=driver.findElement(By.xpath("(//img[@src='assets/images/account/glassdoor.svg'])[1]"));
			WebElement voice=driver.findElement(By.xpath("(//mat-icon[contains(text(),'call')])"));
			WebElement ecommerce=driver.findElement(By.xpath("(//img[@src='assets/images/account/e-commerce.svg'])[1]"));
			if(OtherHeading.isDisplayed() && Email1.isDisplayed() && GoogleAlerts.isDisplayed() && TripAdviser.isDisplayed() 
		    && Booking.isDisplayed() && Expedia.isDisplayed() && GoogleAnalytics.isDisplayed()  
		    && voice.isDisplayed() && voice.isDisplayed() && ecommerce.isDisplayed() ){
			System.out.println("Select Brand Heading and Other Channels are displayed");
			}
			else {
			System.out.println("Select Brand Heading and Other Channels are not displayed");
			}
			Thread.sleep(3000);

//Twitter Channel Configuration			
			WebElement Twitterconfi=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/twitter.svg'])[2]"));
			js.executeScript("arguments[0].click()", Twitterconfi);
			Thread.sleep(5000);
//Add Twitter Account Window UI Components
			WebElement AddTWAccheading=driver.findElement(By.xpath("(//h3[contains(text(),'Add twitter account')])"));
			WebElement CloseaddTwAccWindow=driver.findElement(By.xpath("(//img[@src='assets/images/account/twitter_white.svg'])"));
			WebElement AddTWOwnedAcclabel=driver.findElement(By.xpath("(//p[contains(text(),'Add Owned Accounts')])"));
			WebElement AddTWOwnedAccinfo=driver.findElement(By.xpath("(//p[contains(text(),'Add Owned Accounts')])//following::p[1]"));
			WebElement OR=driver.findElement(By.xpath("(//span[contains(text(),'OR')])"));
			WebElement AddPublicacc=driver.findElement(By.xpath("(//p[contains(text(),'Add Public Accounts')])"));
			WebElement AddPublicaccinfo=driver.findElement(By.xpath("(//p[contains(text(),'Add Public Accounts')])//following::p[1]"));
			WebElement AddPublicTWHdtxbx=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix')])[5]"));
			WebElement Arrow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'east')])"));
			if(AddTWAccheading.isDisplayed() && CloseaddTwAccWindow.isDisplayed() && AddTWOwnedAcclabel.isDisplayed() && AddTWOwnedAccinfo.isDisplayed()
			&& OR.isDisplayed() && AddPublicacc.isDisplayed() && AddPublicaccinfo.isDisplayed() && AddPublicTWHdtxbx.isDisplayed() && Arrow.isDisplayed())
			{
			System.out.println("Add Twitter Account Window UI Components are displayed");
			}
			else {
			System.out.println("Add Twitter Account Window UI Components are not displayed");
			}
			Thread.sleep(3000);
//Log in With Twitter			
			WebElement LoginWithTwitterLabel=driver.findElement(By.xpath("(//span[contains(text(),'Login With Twitter')])"));
			WebElement Twitterlogo=driver.findElement(By.xpath("(//img[@src='assets/images/account/twitter_white.svg'])"));
			if(LoginWithTwitterLabel.isDisplayed() && Twitterlogo.isDisplayed())
			{
			System.out.println("Log in With Twitter Label is  displayed");
			}
			else {
			System.out.println("Log in With Twitter Label is  displayed not displayed");
			}
			js.executeScript("arguments[0].click()", LoginWithTwitterLabel);
			Thread.sleep(5000);
			ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));	
			WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username or email']"));
			username.sendKeys("Komal25169281");
			Thread.sleep(3000);
			
			WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password.sendKeys("Loco@123");
			password.sendKeys(Keys.ENTER);
			Thread.sleep(50000);
			
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			//WebElement homepageLocator = wait.until(ExpectedConditions
					//.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Redirecting you back to the application. This may take a few moments.')]")));
			
			System.out.println("Tweet Login Successful");
			
//Go To Supervisor Account
			driver.switchTo().window(tabs.get(0));
			driver.navigate().refresh();
			WebDriverWait wait1 = new WebDriverWait(driver, 40);
			WebElement homepageLocator1 = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Channel')])[2]")));
			
//After refreshing Select Komal Brand			
			WebElement drpdwn1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", drpdwn1);
			Thread.sleep(3000);
			 WebElement selectbrand1 = driver.findElement(By.xpath("(//span[contains(text(),'Komal Brand')])"));
			js.executeScript("arguments[0].click()", selectbrand1);
			Thread.sleep(8000);
//Add Public Twitter Account
			WebElement addPublicTw=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
			js.executeScript("arguments[0].click()", addPublicTw);
			Thread.sleep(3000);
			WebElement PublicTWConfiguration=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/twitter.svg'])[2]"));
			js.executeScript("arguments[0].click()", PublicTWConfiguration);
			Thread.sleep(3000);
			WebElement PublicTwitterHandletxbx=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(PublicTwitterHandletxbx, "@KalyanChinni11").sendKeys(Keys.ENTER).build();
	        action.perform();
	        Thread.sleep(5000);
			WebElement LeftArrow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'east')])"));
			js.executeScript("arguments[0].click()", LeftArrow);
			Thread.sleep(15000);
			
//Click on Twitter Account		
			WebElement Twitterprofile = driver.findElement(By.xpath("(//a[contains(text(),'Twitter')])"));
			Twitterprofile.click();
			Thread.sleep(5000);		
//Verify All Twitter Label Details
			WebElement logo = driver.findElement(By.xpath("//img[@src='assets/images/channel-logos/twitter.svg']"));
			WebElement label = driver.findElement(By.xpath("//span[contains(text(),'Twitter (2)')]"));
			System.out.println("All Twitter Heading Details:"+label.getText());
			Thread.sleep(3000);
//Verify Owned Twitter Account Configuration			
			WebElement AccountHandle = driver.findElement(By.xpath("(//div[contains(text(),'@Komal25169281')])"));
			System.out.println("Name of twitter profile Configuration is:"+AccountHandle.getText());
			WebElement AccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'colored__grey--light text__sm')])[3]"));
			System.out.println("Time of twitter profile Configuration is:"+AccConfTime.getText());
			WebElement ConfStatus = driver.findElement(By.xpath("(//span[contains(text(),'Owned')])[3]"));
			System.out.println("Time of twitter profile Configuration is:"+ConfStatus.getText());
			WebElement reathorize = driver.findElement(By.xpath("(//mat-icon[contains(text(),'update')])[3]"));
			WebElement Delete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator channelConfiguration')])"));
			WebElement pausebutton = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-stroked-button mat-button-base channelConfiguration__btnPause')])"));
			Thread.sleep(3000);
			if(reathorize.isDisplayed() && Delete.isDisplayed() && pausebutton.isDisplayed())
			{
			System.out.println("All Buttons for Owned Account are  displayed");
			}
			else {
			System.out.println("All Buttons for Owned Account are not displayed");
			}
			
//Verify Public Twitter Account Configuration			
			WebElement PAccountHandle = driver.findElement(By.xpath("(//div[contains(text(),'@KalyanChinni11')])"));
			System.out.println("Name of twitter profile Configuration is:"+PAccountHandle.getText());
			WebElement PAccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'colored__grey--light text__sm')])[4]"));
			System.out.println("Time of twitter profile Configuration is:"+PAccConfTime.getText());
			WebElement PConfStatus = driver.findElement(By.xpath("(//span[contains(text(),'Public')])[1]"));
			System.out.println("Time of twitter profile Configuration is:"+PConfStatus.getText());
			WebElement PDelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator channelConfiguration')])[2]"));
			WebElement Ppausebutton = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-stroked-button mat-button-base channelConfiguration__btnPause')])[2]"));
			Thread.sleep(3000);
			if(PDelete.isDisplayed() && Ppausebutton.isDisplayed())
			{
			System.out.println("All Buttons for Public Account are  displayed");
			}
			else {
			System.out.println("All Buttons for Public Account are not displayed");
			}
			
//Drag and Drop Operation to Check Priority	
			Actions builder = new Actions(driver);
			WebElement toWebElement = driver.findElement(By.xpath("(//div[contains(text(),'@Komal25169281')])"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", toWebElement);
		    Thread.sleep(2000);
		    WebElement fromWebElement = driver.findElement(By.xpath("(//div[contains(text(),'@KalyanChinni11')])"));
		    Thread.sleep(2000);
	        builder.clickAndHold(fromWebElement).moveToElement(toWebElement).perform();
		    Thread.sleep(2000);// add 2 sec wait
		    builder.release(toWebElement).build().perform();
		    Thread.sleep(5000);
		    Actions builder2 = new Actions(driver);
		    WebElement toWebElement1 = driver.findElement(By.xpath("(//div[contains(text(),'@Komal25169281')])"));
			Thread.sleep(2000);
		    WebElement fromWebElement1 = driver.findElement(By.xpath("(//div[contains(text(),'@KalyanChinni11')])"));
			Thread.sleep(2000);
			builder2.clickAndHold(fromWebElement1).moveToElement(toWebElement1).perform();
		    Thread.sleep(2000);// add 2 sec wait
		    builder2.release(toWebElement1).build().perform();
		    Thread.sleep(2000);
			
//Delete Owned and Public Configured Account			
			WebElement Odelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator channelConfiguration')])[2]"));
			js.executeScript("arguments[0].click()", Odelete);
			Thread.sleep(3000);	
			WebElement OdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", OdeleteConfirm);
			Thread.sleep(15000);
			WebElement Pdelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator channelConfiguration')])[1]"));
			js.executeScript("arguments[0].click()", Pdelete);
			Thread.sleep(3000);	
			WebElement PdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", PdeleteConfirm);
			Thread.sleep(15000);	

//Verify Twitter Account Deleted or not
			WebElement drpdwn2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", drpdwn2);
			Thread.sleep(3000);
			 WebElement selectbrand2 = driver.findElement(By.xpath("(//span[contains(text(),'kalyan')])"));
			js.executeScript("arguments[0].click()", selectbrand2);
			Thread.sleep(8000);
			WebElement drpdwn3 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", drpdwn3);
			Thread.sleep(3000);
			 WebElement selectbrand3 = driver.findElement(By.xpath("(//span[contains(text(),'Komal Brand')])"));
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
