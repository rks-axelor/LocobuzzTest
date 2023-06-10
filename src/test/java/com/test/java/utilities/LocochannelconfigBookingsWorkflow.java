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


public class LocochannelconfigBookingsWorkflow {
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
	
public static void ChannelConfigurationBookingsWorkFlow(WebDriver driver) throws Exception {
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

//Booking Channel Configuration			
		WebElement Expediaconfig=driver.findElement(By.xpath("(//img[@src='assets/images/account/booking.svg'])[1]"));
		js.executeScript("arguments[0].click()", Expediaconfig);
		Thread.sleep(5000);
//Add Booking Account Window UI Components
		WebElement AddGAaccheading=driver.findElement(By.xpath("//h3[contains(text(),'Add Booking Profile')]"));
		WebElement AddGAAccheadingIcon=driver.findElement(By.xpath("//img[@src='assets/images/account/booking.svg']"));
		//WebElement AddExpedianote=driver.findElement(By.xpath("//span[contains(text(),' To monitor your reviews on Expedia, please copy paste guest reviews link. ')]"));
		WebElement CloseaddGAAccWindow=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
		WebElement AddURLtxbx=driver.findElement(By.xpath(" (//div[contains(@class,'mat-form-field-infix ng-tns-c')])[5]"));
		WebElement AddMoreField=driver.findElement(By.xpath("//p[contains(@class,'colored__locobuzz cursor-')]"));
		WebElement AddURLGAMandatory=driver.findElement(By.xpath("//span[contains(text(),'*')]"));
	    WebElement Cancel=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
		WebElement SaveURL=driver.findElement(By.xpath("//span[contains(text(),'Save URL')]"));
		if(AddGAaccheading.isDisplayed() && CloseaddGAAccWindow.isDisplayed() && CloseaddGAAccWindow.isDisplayed() 
		&& AddURLtxbx.isDisplayed() && AddURLGAMandatory.isDisplayed() 
		&& AddMoreField.isDisplayed() && Cancel.isDisplayed() && SaveURL.isDisplayed() && AddGAAccheadingIcon.isDisplayed())
		{
		System.out.println("Add Booking Account Window UI Components are displayed");
		}
		else {
		System.out.println("Add Booking Account Window UI Components are not displayed");
		}
		
	    WebElement AddURL = driver.findElement(By.xpath("//mat-label[contains(text(),'Add URL')]"));
		Actions actions5 = new Actions(driver);
		Action action5 = actions5.sendKeys(AddURL, "https://www.booking.com/hotel/in/the-butterfly-luxury-serviced-apartments-visakhapatnam.en-gb.html?aid=1610687&label=in-Wtld16jjnH8x09MiDfXU6gS379630681324%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-330797977871%3Alp9040233%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YfpWGnRw6lOGgfEoJVv7zYo&sid=0148eb4b7bdd132f221229541c60b301&dest_id=-2114520;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=15;hpos=15;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1670389948;srpvid=a37c249d3ff10287;type=total;ucfs=1&#hotelTmpl").build();
        action5.perform();
		Thread.sleep(3000);
		WebElement AddMoreField1=driver.findElement(By.xpath("//p[contains(@class,'colored__locobuzz cursor-')]"));
		js.executeScript("arguments[0].click()", AddMoreField1);
		Thread.sleep(5000);
		WebElement AddURL2 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Add URL')])[2]"));
		Actions actions6 = new Actions(driver);
		Action action6 = actions6.sendKeys(AddURL2, "https://www.booking.com/hotel/in/abhaya-grand-hotels.en-gb.html?aid=1610687&label=in-Wtld16jjnH8x09MiDfXU6gS379630681324%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-330797977871%3Alp9040233%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YfpWGnRw6lOGgfEoJVv7zYo&sid=0148eb4b7bdd132f221229541c60b301&dest_id=-2114520;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1670389948;srpvid=a37c249d3ff10287;type=total;ucfs=1&#hotelTmpl").build();
        action6.perform();
		Thread.sleep(5000);
		WebElement SaveURL2 = driver.findElement(By.xpath("//span[contains(text(),'Save URL')]"));
		js.executeScript("arguments[0].click()", SaveURL2);
		Thread.sleep(5000);
		
		System.out.println("Booking Profile Added Successfully");
		
        driver.navigate().refresh();
		WebDriverWait wait1 = new WebDriverWait(driver, 40);
		WebElement homepageLocator1 = wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Channel')])[2]")));
		
//After refreshing Select Burberry Brand			
		WebElement drpdwn1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
		js.executeScript("arguments[0].click()", drpdwn1);
		Thread.sleep(3000);
		 WebElement selectbrand1 = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
		js.executeScript("arguments[0].click()", selectbrand1);
		Thread.sleep(8000);

//Click on Booking Account		
		WebElement bookingprofile = driver.findElement(By.xpath("(//a[contains(text(),'Booking')])"));
		bookingprofile.click();
		Thread.sleep(5000);		
//Verify All Booking Label Details
		WebElement logo = driver.findElement(By.xpath("//img[@src='assets/images/account/booking.svg']"));
		WebElement label = driver.findElement(By.xpath("(//span[contains(text(),'Booking (2)')])"));
		System.out.println("All Booking Heading Details:"+label.getText());
		Thread.sleep(3000);
		
//Verify  added Booking  Account Configuration Details			
		WebElement AccountLabel1 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--head bg__grey--lighter')])[1]"));
		System.out.println("Name of Booking profile Configuration is:"+AccountLabel1.getText());
		WebElement AccConfdetail1 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[1]"));
		System.out.println("Details of Booking profile Configuration is:"+AccConfdetail1.getText());
		WebElement AccConfigdetail2 = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[2]"));
		System.out.println("Link of Booking  profile Configuration is:"+AccConfigdetail2.getText());
		WebElement Delete1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[6]"));
		WebElement pausebutton1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[7]"));
		Thread.sleep(3000);
		if( Delete1.isDisplayed() && pausebutton1.isDisplayed())
		{
		System.out.println("Verify Booking Account Configuration Details are  displayed");
		}
		else {
		System.out.println("Verify Booking Account Configuration Details are not displayed");
		}
//Verify Newly added Booking Account Configuration Details			
		/*WebElement AccountLabel = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--head bg__grey--lighter')])[2]"));
		System.out.println("Name of Booking profile Configuration is:"+AccountLabel.getText());
		WebElement AccConfTime = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[1]"));
		System.out.println("Time of Booking profile Configuration is:"+AccConfTime.getText());
		WebElement Link = driver.findElement(By.xpath("(//div[contains(@class,'channelConfiguration__booking--body p-')])[4]"));
		System.out.println("Link of Booking profile Configuration is:"+Link.getText());
		WebElement Delete = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[8]"));
		WebElement pausebutton = driver.findElement(By.xpath("(//span[contains(@class,'mat-button-wrapper')])[9]"));
		Thread.sleep(3000);
		if( Delete.isDisplayed() && pausebutton.isDisplayed())
		{
		System.out.println("Verify Booking Account Configuration Details are  displayed");
		}
		else {
		System.out.println("Verify Booking Account Configuration Details are not displayed");
		}*/
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
		
		
//Delete Booking Configured Account			
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
		

//Verify Booking Account Deleted or not
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




