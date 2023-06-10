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


public class LocoChannelConfigTripAdvisorWorkFlow {
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
	
public static void ChannelConfigurationTripadvisorWorkFlow(WebDriver driver) throws Exception {
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

//Google Alert Channel Configuration			
		WebElement TripAdvconfi=driver.findElement(By.xpath("//img[@src='assets/images/account/tripadvisor.svg']"));
		js.executeScript("arguments[0].click()", TripAdvconfi);
		Thread.sleep(5000);
//Add Google Alert Account Window UI Components
		WebElement AddGAaccheading=driver.findElement(By.xpath("//h3[contains(text(),'Add TripAdvisor Profile')]"));
		WebElement AddGAAccheadingIcon=driver.findElement(By.xpath("//img[@src='assets/images/account/tripadvisor.svg']"));
		WebElement CloseaddGAAccWindow=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
		WebElement AddURLtxbx=driver.findElement(By.xpath(" (//div[contains(@class,'mat-form-field-infix ng-tns-c')])[5]"));
		WebElement AddMoreField=driver.findElement(By.xpath("//p[contains(@class,'colored__locobuzz cursor-')]"));
		WebElement AddURLGAMandatory=driver.findElement(By.xpath("//span[contains(text(),'*')]"));
	    WebElement Cancel=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
		WebElement SaveURL=driver.findElement(By.xpath("//span[contains(text(),'Save URL')]"));
		if(AddGAaccheading.isDisplayed() && CloseaddGAAccWindow.isDisplayed() && CloseaddGAAccWindow.isDisplayed() && AddURLtxbx.isDisplayed() && AddURLGAMandatory.isDisplayed()
		&& AddMoreField.isDisplayed() && Cancel.isDisplayed() && SaveURL.isDisplayed() && AddGAAccheadingIcon.isDisplayed())
		{
		System.out.println("Add Tripadvisor Account Window UI Components are displayed");
		}
		else {
		System.out.println("Add Tripadvisor Account Window UI Components are not displayed");
		}
		
	    WebElement AddURL = driver.findElement(By.xpath("//mat-label[contains(text(),'Add URL')]"));
		Actions actions5 = new Actions(driver);
		Action action5 = actions5.sendKeys(AddURL, "https://www.tripadvisor.in/Hotel_Review-g297605-d15236908-Reviews-Hilton_Goa_Resort-Candolim_Bardez_North_Goa_District_Goa.html").build();
        action5.perform();
		Thread.sleep(3000);
		WebElement AddMoreField1=driver.findElement(By.xpath("//p[contains(@class,'colored__locobuzz cursor-')]"));
		js.executeScript("arguments[0].click()", AddMoreField1);
		Thread.sleep(5000);
		WebElement AddURL2 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Add URL')])[2]"));
		Actions actions6 = new Actions(driver);
		Action action6 = actions6.sendKeys(AddURL2, "https://www.tripadvisor.in/Hotel_Review-g297605-d5040374-Reviews-The_Acacia_Hotel_Spa_Goa-Candolim_Bardez_North_Goa_District_Goa.html").build();
        action6.perform();
		Thread.sleep(3000);
		WebElement SaveURL2 = driver.findElement(By.xpath("//span[contains(text(),'Save URL')]"));
		js.executeScript("arguments[0].click()", SaveURL2);
		Thread.sleep(5000);
		
		System.out.println("Tripadvisor Profile Added Successfully");
		
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

//Click on TripAdvisor Account		
		WebElement TripAdvisorprofile = driver.findElement(By.xpath("(//a[contains(text(),'TripAdvisor')])"));
		TripAdvisorprofile.click();
		Thread.sleep(5000);		
//Verify All TripAdvisor Label Details
		WebElement logo = driver.findElement(By.xpath("(//img[@src='assets/images/account/tripadvisor.svg'])[1]"));
		WebElement label = driver.findElement(By.xpath("(//span[contains(text(),'Tripadvisor (2)')])"));
		System.out.println("All GTripadvisor Heading Details:"+label.getText());
		Thread.sleep(3000);
		
//Verify  added Tripadvisor  Account Configuration Details			
		WebElement AccountLabel1 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--head bg__grey--lighter')])[1]"));
		System.out.println("Name of TripAdvisor profile Configuration is:"+AccountLabel1.getText());
		WebElement AccConfTime1 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[1]"));
		System.out.println("Time of TripAdvisor profile Configuration is:"+AccConfTime1.getText());
		WebElement Link1 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[2]"));
		System.out.println("Link of TripAdvisor  profile Configuration is:"+Link1.getText());
		WebElement Delete1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[6]"));
		WebElement pausebutton1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[7]"));
		Thread.sleep(3000);
		if( Delete1.isDisplayed() && pausebutton1.isDisplayed())
		{
		System.out.println("Verify Tripadvisor Account Configuration Details are  displayed");
		}
		else {
		System.out.println("Verify Tripadvisor Account Configuration Details are not displayed");
		}
//Verify Newly added Google Alert Account Configuration Details			
		WebElement AccountLabel = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--head bg__grey--lighter')])[2]"));
		System.out.println("Name of Tripadvisor profile Configuration is:"+AccountLabel.getText());
		WebElement AccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[3]"));
		System.out.println("Time of Tripadvisor profile Configuration is:"+AccConfTime.getText());
		WebElement Link = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[4]"));
		System.out.println("Link of Tripadvisor profile Configuration is:"+Link.getText());
		WebElement Delete = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[8]"));
		WebElement pausebutton = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[9]"));
		Thread.sleep(3000);
		if( Delete.isDisplayed() && pausebutton.isDisplayed())
		{
		System.out.println("Verify Tripadvisor Account Configuration Details are  displayed");
		}
		else {
		System.out.println("Verify Tripadvisor Account Configuration Details are not displayed");
		}
//Stop Fetchiong Mensions
		WebElement Pause2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'pause')])[3]"));
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
		Thread.sleep(3000);
		
		
//Delete Tripadvisor Configured Account			
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
		

//Verify Tripadvisor Account Deleted or not
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


