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


public class LocoChannelConfgLinkedINYoutubeWorkflow {
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
	
public static void ChannelConfigLinkedINYoutubeaWorkFlow(WebDriver driver) throws Exception {
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
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Glassdoorlogo);
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
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ecommerce);
			
			if(OtherHeading.isDisplayed() && Email1.isDisplayed() && GoogleAlerts.isDisplayed() && TripAdviser.isDisplayed() 
		    && Booking.isDisplayed() && Expedia.isDisplayed() && GoogleAnalytics.isDisplayed() && Holidayiq.isDisplayed() 
		    && voice.isDisplayed() && voice.isDisplayed() && ecommerce.isDisplayed() ){
			System.out.println("Select Brand Heading and Other Channels are displayed");
			}
			else {
			System.out.println("Select Brand Heading and Other Channels are not displayed");
			}
			Thread.sleep(3000);

//LinkedIN Channel Configuration			
			WebElement LKDINconfig=driver.findElement(By.xpath("//img[@src='assets/images/account/Linkedin_icon.svg']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", LKDINconfig);
			js.executeScript("arguments[0].click()", LKDINconfig);
			Thread.sleep(5000);
//Add LinkedIN Accounts Configuration Open in New Tab
		/*	WebElement AddLKDINAccheading=driver.findElement(By.xpath("//div[contains(@class,'header__logo')]"));
			WebElement CloseaddFAccWindow=driver.findElement(By.xpath("//a[contains(text(),'Cancel')]"));
			WebElement AddLKDINOwnedAcclabel=driver.findElement(By.xpath("//h1[contains(text(),'Welcome Back')]"));
			WebElement AddLKDINOwnedAccinfo=driver.findElement(By.xpath("//h1[contains(text(),'Welcome Back')]//following::p[1]"));
			
			if(AddLKDINAccheading.isDisplayed() && CloseaddFAccWindow.isDisplayed() 
			&& AddLKDINOwnedAcclabel.isDisplayed() && AddLKDINOwnedAccinfo.isDisplayed()
			)
			{
			System.out.println("Add LinkedIN Accounts Configuration Components are displayed");
			}
			else {
			System.out.println("Add LinkedIN Accounts Configuration Window UI Components are not displayed");
			}
			Thread.sleep(3000);*/
			
//Log in With LinkedIN Credentials		
			ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));	
			WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
			js.executeScript("arguments[0].click()", username);
			username.sendKeys("komal.mali@locobuzz.com");
			//username.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			
			
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			js.executeScript("arguments[0].click()", password);
			password.sendKeys("Loco@123");
			password.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			//WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
			//js.executeScript("arguments[0].click()", login);
			//Thread.sleep(3000);
			
//Go To Supervisor Account
			driver.switchTo().window(tabs.get(0));
			WebElement Continue1 = driver.findElement(By.xpath("(//label[contains(@class,'mat-checkbox-layout')])[1]"));
			js.executeScript("arguments[0].click()", Continue1);
			Thread.sleep(3000);
			WebElement addprofiles = driver.findElement(By.xpath("//span[contains(text(),'Add Page')]"));
			js.executeScript("arguments[0].click()", addprofiles);
			Thread.sleep(3000);
			driver.navigate().refresh();
			WebDriverWait wait1 = new WebDriverWait(driver, 40);
			WebElement homepageLocator1 = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Channel')])[2]")));
			Thread.sleep(3000);
//After refreshing Select Komal Brand
			Thread.sleep(8000);
			/*WebDriverWait wait2 = new WebDriverWait(driver, 40);
			WebElement homepageLocator2 = wait2.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Yes')]")));
			Thread.sleep(3000);
			WebElement Closeadd = driver.findElement(By.xpath("//div[contains(@class,'popupTemplateCard-popupCloseButton WFSTGKC')]"));
			js.executeScript("arguments[0].click()", Closeadd);
			Thread.sleep(3000);*/
			WebElement drpdwn1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", drpdwn1);
			Thread.sleep(3000);
			 WebElement selectbrand1 = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
			js.executeScript("arguments[0].click()", selectbrand1);
			Thread.sleep(8000);

//Click on LinkedIN Account		
			WebElement LinkedINprofile = driver.findElement(By.xpath("//a[contains(text(),'LinkedIn')]"));
			LinkedINprofile.click();
			Thread.sleep(5000);		
//Verify All LinkedIn Label Details
			WebElement logo = driver.findElement(By.xpath("//img[@src='assets/images/account/Linkedin_icon.svg']"));
			WebElement label = driver.findElement(By.xpath("//span[contains(text(),'LinkedIn Pages (1)')]"));
			System.out.println("All LinkedIN Heading Details:"+label.getText());
			Thread.sleep(3000);
			

//Verify Owned LINKDIN Account Configuration			
			WebElement AccountPage = driver.findElement(By.xpath("(//span[contains(text(),'Sw test solutions')])"));
			System.out.println("Name of LinkedIN profile Configuration is:"+AccountPage.getText());
			WebElement AccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'colored__grey--light text__sm')])[2]"));
			System.out.println("Time of LinkedIN profile Configuration is:"+AccConfTime.getText());
			WebElement ConfStatus = driver.findElement(By.xpath("(//span[contains(text(),'Owned')])[2]"));
			System.out.println("Status of LinkedIN profile Configuration is:"+ConfStatus.getText());
			WebElement reathorize = driver.findElement(By.xpath("(//mat-icon[contains(text(),'update')])[2]"));
			WebElement Delete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[2]"));
			WebElement pausebutton = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-stroked-button mat-button-base btnPause')])[2]"));
			Thread.sleep(3000);
			if(reathorize.isDisplayed() && Delete.isDisplayed() && pausebutton.isDisplayed())
			{
			System.out.println("All Buttons for Owned Account are  displayed");
			}
			else {
			System.out.println("All Buttons for Owned Account are not displayed");
			}
			Thread.sleep(3000);
			
/*//Add Channel Field
			WebElement addchannel2=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
			js.executeScript("arguments[0].click()", addchannel2);
			Thread.sleep(3000);
			
//Click on YoutubeProfile Account		
			WebElement Youtubeprofile = driver.findElement(By.xpath("//img[@src='assets/images/channelicons/Youtube.svg']"));
			Youtubeprofile.click();
			Thread.sleep(5000);
			
//Add Youtube Accounts Window UI Components
			WebElement AddYTBAccheading=driver.findElement(By.xpath("//h3[contains(text(),'Add YouTube account')]"));
			WebElement CloseaddYTBAccWindow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			WebElement AddTWOwnedAcclabel=driver.findElement(By.xpath("(//p[contains(text(),'Add Owned Accounts')])"));
			WebElement AddTWOwnedAccinfo=driver.findElement(By.xpath("(//p[contains(text(),'Add Owned Accounts')])//following::p[1]"));
			WebElement OR=driver.findElement(By.xpath("(//span[contains(text(),'OR')])"));
			WebElement AddPublicacc=driver.findElement(By.xpath("(//p[contains(text(),'Add Public Accounts')])"));
			WebElement AddPublicaccinfo=driver.findElement(By.xpath("(//p[contains(text(),'Add Public Accounts')])//following::p[1]"));
			WebElement AddPublicTWHdtxbx=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix')])[5]"));
			WebElement Arrow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'east')])"));
			if(AddYTBAccheading.isDisplayed() && CloseaddYTBAccWindow.isDisplayed() && AddTWOwnedAcclabel.isDisplayed() && AddTWOwnedAccinfo.isDisplayed()
			&& OR.isDisplayed() && AddPublicacc.isDisplayed() && AddPublicaccinfo.isDisplayed() && AddPublicTWHdtxbx.isDisplayed() && Arrow.isDisplayed())
			{
			System.out.println("Add Youtube Account Window UI Components are displayed");
			}
			else {
			System.out.println("Add Youtube Account Window UI Components are not displayed");
			}
			Thread.sleep(3000);
//Log in With Youtube		
			WebElement LoginWithYoutubeLabel=driver.findElement(By.xpath("(//span[contains(text(),'Sign in with Google')])"));
			WebElement Googlelogo=driver.findElement(By.xpath("(//img[@src='assets/images/account/google_alert.svg'])"));
		   if(LoginWithYoutubeLabel.isDisplayed() && Googlelogo.isDisplayed())
			{
			System.out.println("Log in With Youtube Label is  displayed");
			}
			else {
			System.out.println("Log in With Youtube Label is not displayed");
			}
			js.executeScript("arguments[0].click()", LoginWithYoutubeLabel);
			Thread.sleep(5000);
			ArrayList<String>tabs1=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs1.get(1));	
			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Email.sendKeys("komalmali121@gmail.com");
			Thread.sleep(3000);
			WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()", Next);
			Thread.sleep(5000);
			
			WebElement passwordYT = driver.findElement(By.xpath("//input[@type='password']"));
			passwordYT.sendKeys("8007422909");
			passwordYT.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			WebElement Allow = driver.findElement(By.xpath("//span[contains(text(),'Allow')]"));
			js.executeScript("arguments[0].click()", Allow);
			Thread.sleep(5000);
			
			
//Go To Supervisor Account
			driver.switchTo().window(tabs.get(0));
			
			driver.navigate().refresh();
			WebDriverWait wait2 = new WebDriverWait(driver, 40);
			WebElement homepageLocator2 = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Channel')])[2]")));
			Thread.sleep(3000);
//After refreshing Select Komal Brand			
			WebElement drpdwn2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", drpdwn2);
			Thread.sleep(3000);
			 WebElement selectbrand2 = driver.findElement(By.xpath("(//span[contains(text(),'Komal Brand')])"));
			js.executeScript("arguments[0].click()", selectbrand2);
			Thread.sleep(8000);*/
			
//Add Public Youtube Account
			WebElement addPublicFB=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
			js.executeScript("arguments[0].click()", addPublicFB);
			Thread.sleep(3000);
			WebElement PublicYTConfiguration=driver.findElement(By.xpath("//img[@src='assets/images/channelicons/Youtube.svg']"));
			js.executeScript("arguments[0].click()", PublicYTConfiguration);
			Thread.sleep(5000);
			//WebElement Appname = driver.findElement(By.xpath("(//mat-label[contains(text(),'App Package Name')])"));
			//Actions actions = new Actions(driver);
			//Action action = actions.sendKeys(Appname, "https://www.youtube.com/c/LocobuzzIndia").sendKeys(Keys.ENTER).build();
	       // action.perform();
			//Thread.sleep(3000);
			WebElement PublicYTUrltxbx=driver.findElement(By.xpath("(//mat-label[contains(text(),'Add public YouTube link')])"));
		    Actions actions = new Actions(driver);
			Action action = actions.sendKeys(PublicYTUrltxbx, "https://www.youtube.com/c/LocobuzzIndia").build();
			
	        action.perform();
	        Thread.sleep(5000);
	        WebElement PublicYTConfiguration1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'east')])"));
			js.executeScript("arguments[0].click()", PublicYTConfiguration1);
			Thread.sleep(3000);
			WebElement add=driver.findElement(By.xpath("(//button[@type='submit'])"));
			js.executeScript("arguments[0].click()", add);
			Thread.sleep(3000);
			driver.navigate().refresh();
			WebDriverWait wait3 = new WebDriverWait(driver, 40);
			WebElement homepageLocator3 = wait3.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Channel')])[2]")));
			Thread.sleep(3000);
//After refreshing Select Komal Brand	
			Thread.sleep(8000);
			WebElement drpdwn2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", drpdwn2);
			Thread.sleep(3000);
			 WebElement selectbrand2 = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
			js.executeScript("arguments[0].click()", selectbrand2);
			Thread.sleep(8000);

//Verify All Youtube Label Details
			WebElement logo1 = driver.findElement(By.xpath(" //a[contains(text(),'Youtube')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", logo1);
			js.executeScript("arguments[0].click()", logo1);
			Thread.sleep(3000);
			WebElement label1 = driver.findElement(By.xpath("//span[contains(text(),'Youtube (1)')]"));
			System.out.println("All Youtube Heading Details:"+label1.getText());
			Thread.sleep(3000);
//Verify Owned Youtube Account Configuration			
			/*WebElement AccountPage1 = driver.findElement(By.xpath("(//span[contains(text(),'Komal Mali')])"));
			System.out.println("Name of Facebook profile Configuration is:"+AccountPage.getText());
			WebElement AccConfTimeYT = driver.findElement(By.xpath("(//div[contains(@class,'colored__grey--light text__sm')])[3]"));
			System.out.println("Time of twitter profile Configuration is:"+AccConfTimeYT.getText());
			WebElement ConfStatusYT = driver.findElement(By.xpath("(//span[contains(text(),'Owned')])[3]"));
			System.out.println("Time of twitter profile Configuration is:"+ConfStatusYT.getText());
			WebElement reathorizeYT = driver.findElement(By.xpath("(//mat-icon[contains(text(),'update')])[3]"));
			WebElement DeleteYT = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[3]"));
			WebElement pausebuttonYT = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-stroked-button mat-button-base btnPause')])[3]"));
			Thread.sleep(3000);
			if(reathorizeYT.isDisplayed() && DeleteYT.isDisplayed() && pausebuttonYT.isDisplayed())
			{
			System.out.println("All Buttons for Owned Account are  displayed");
			}
			else {
			System.out.println("All Buttons for Owned Account are not displayed");
			}
			Thread.sleep(3000);	*/	
			
//Verify Public Youtube Account Configuration			
			WebElement PAccountHandle = driver.findElement(By.xpath("//span[contains(text(),'Locobuzz')]"));
			System.out.println("Name of Youtube profile Configuration is:"+PAccountHandle.getText());
			Thread.sleep(3000);
			WebElement PAccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'colored__grey--light text__sm')])[2]"));
			System.out.println("Time of Youtube profile Configuration is:"+PAccConfTime.getText());
			Thread.sleep(3000);
			WebElement PConfStatus = driver.findElement(By.xpath("(//span[contains(text(),'Public')])[1]"));
			System.out.println("Status of Youtube profile Configuration is:"+PConfStatus.getText());
			Thread.sleep(3000);
			WebElement PDelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[2]"));
			WebElement Ppausebutton = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator mat-stroked-button mat-button-base btnPause')])[2]"));
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
			WebElement Pdelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Pdelete);
			js.executeScript("arguments[0].click()", Pdelete);
			Thread.sleep(3000);	
			WebElement PdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", PdeleteConfirm);
			Thread.sleep(7000);
			WebElement Odelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Odelete);
			js.executeScript("arguments[0].click()", Odelete);
			Thread.sleep(3000);	
			WebElement OdeleteConfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", OdeleteConfirm);
			Thread.sleep(5000);	
			/*WebElement LKDINdelete = driver.findElement(By.xpath("(//button[contains(@class,'mat-focus-indicator btnDelete')])[3]"));
			js.executeScript("arguments[0].click()", LKDINdelete);
			Thread.sleep(3000);	
			WebElement LKDINdeleteconfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", LKDINdeleteconfirm);
			Thread.sleep(5000);	*/

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




