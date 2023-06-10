package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class LocoChannelConfigurationUIVerification {
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
	
public static void verifyingChannelConfigurationUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Listening Settings
			WebElement ListeningSettings=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if(ListeningSettings.isDisplayed()) {
			System.out.println("Listening Settings is displayed");
			componentsInformation.add(0, "Present");
			}
			else {
			System.out.println("Listening Settings is not displayed");
			componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);
			
//Channel Configuration label and logo
			WebElement Channelconfigurationlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Channel_Configuration.svg']"));
			WebElement ChannelConfigurationlabel=driver.findElement(By.xpath("//span[contains(text(),'Channel Configuration')]"));
			if(Channelconfigurationlogo.isDisplayed()&&ChannelConfigurationlabel.isDisplayed()) {
			System.out.println("Channel Configuration label and logo is displayed");
			componentsInformation.add(1, "Present");
			}
			else {
			System.out.println("Channel Configuration label and logo is not displayed");
			componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", ChannelConfigurationlabel);
			Thread.sleep(3000);
			
//Channel Configuration tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement CCTab=driver.findElement(By.xpath("(//span[contains(text(),'Channel')])[2]"));
			if(pushpin.isDisplayed()&&CCTab.isDisplayed()) {
			System.out.println("Channel Configuration tab Label is displayed");
			componentsInformation.add(2, "Present");
			}
			else {
			System.out.println("Channel Configuration tab Label is not displayed");
			componentsInformation.add(2, "Not Present");
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
			Thread.sleep(3000);
			componentsInformation.add(3, "Present");
			} else {
			System.out.println("select Brand field is not displayed");
			componentsInformation.add(3, "Not Present");
			}
			Thread.sleep(3000);
		    WebElement selectbrand = driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])"));
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(8000);
			
// Active Social Profiles/Total : and  Active Other Profiles/Total : Labels	

			WebElement socialprofilelabel=driver.findElement(By.xpath("(//p[contains(text(),'Active Social Profiles/Total :')])"));
			WebElement otherprofilelabel=driver.findElement(By.xpath("(//p[contains(text(),'Active Other Profiles/Total :')])"));
			if(socialprofilelabel.isDisplayed()&&otherprofilelabel.isDisplayed()) {
			System.out.println("Active Profiles Label Field is displayed");
			componentsInformation.add(4, "Present");
			}
			else {
			System.out.println("Active Profiles Label Field is displayed is not displayed");
			componentsInformation.add(4, "Not Present");
			}
			Thread.sleep(3000);
			
//Add Channel Icon and Label field
			WebElement Addchannelicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[1]"));
			WebElement Addchannellabel=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
			if(Addchannelicon.isDisplayed()&&Addchannellabel.isDisplayed()) {
			System.out.println("Add Channel Icon and Label field is displayed");
			componentsInformation.add(5, "Present");
			}
			else {
			System.out.println("Add Channel Icon and Label field is not displayed");
			componentsInformation.add(5, "Not Present");
			}
			Thread.sleep(3000);
			
//Channel Labels 
			WebElement FacebbokInsta=driver.findElement(By.xpath("(//a[contains(text(),'Facebook/Instagram')])[1]"));
			WebElement Twitter=driver.findElement(By.xpath("(//a[contains(text(),'Twitter')])[1]"));
			WebElement Youtube=driver.findElement(By.xpath("(//a[contains(text(),'Youtube')])[1]"));
			WebElement LinkedIN=driver.findElement(By.xpath("(//a[contains(text(),' LinkedIn')])[1]"));
			WebElement GMB=driver.findElement(By.xpath("(//a[contains(text(),'Google My Business')])[1]"));
			WebElement GPS=driver.findElement(By.xpath("(//a[contains(text(),'Google Play Store')])[1]"));
			//WebElement Email=driver.findElement(By.xpath("(//a[contains(text(),' Email')])[1]"));
			WebElement GAnalatycs=driver.findElement(By.xpath("(//a[contains(text(),'Google Analytics')])[1]"));
		    WebElement KeyboardArrowright=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_right')])[1]"));
		    js.executeScript("arguments[0].click()", KeyboardArrowright);
		    Thread.sleep(3000);
			WebElement GA=driver.findElement(By.xpath("(//a[contains(text(),'Google Alerts')])[1]"));
			if(FacebbokInsta.isDisplayed() && Twitter.isDisplayed() && Youtube.isDisplayed() && LinkedIN.isDisplayed() && GA.isDisplayed()
			&& GMB.isDisplayed() && GPS.isDisplayed() && GAnalatycs.isDisplayed() && KeyboardArrowright.isDisplayed()) {
			System.out.println("All Channel Labels are displayed");
			componentsInformation.add(6, "Present");
			}
			else {
			System.out.println("All Channel Labels are not displayed");
			componentsInformation.add(6, "Not Present");
			}
			Thread.sleep(3000);
			WebElement KeyboardArrowleft=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_left')])[1]"));
			js.executeScript("arguments[0].click()", KeyboardArrowleft);
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
			WebElement Email1=driver.findElement(By.xpath("(//img[@src='assets/images/account/email.svg'])[1]"));
			WebElement GoogleAlerts=driver.findElement(By.xpath("(//img[@src='assets/images/account/google_alert.svg'])[1]"));
			WebElement TripAdviser=driver.findElement(By.xpath("(//img[@src='assets/images/account/tripadvisor.svg'])[1]"));
			WebElement Booking=driver.findElement(By.xpath("(//img[@src='assets/images/account/booking.svg'])[1]"));
			WebElement Expedia=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/expedia.svg'])[1]"));
			WebElement GoogleAnalytics=driver.findElement(By.xpath("(//img[@src='assets/images/account/Google_Analytics_icon.svg'])[1]"));
			WebElement Holidayiq=driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/holidayiq.svg'])[1]"));
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

			Thread.sleep(3000);
			WebElement addchannel1=driver.findElement(By.xpath("(//span[contains(text(),'Add Channel')])"));
			js.executeScript("arguments[0].click()", addchannel1);
			Thread.sleep(3000);
			
//Add Accounts Tab2
			WebElement pushpin2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement CCTab2=driver.findElement(By.xpath("(//span[contains(text(),'Ad Accounts')])[1]"));
			if(pushpin2.isDisplayed()&&CCTab2.isDisplayed()) {
			System.out.println("Channel Configuration tab2 Label is displayed");
			componentsInformation.add(7, "Present");
			}
			else {
			System.out.println("Channel Configuration tab2 Label is not displayed");
			componentsInformation.add(7, "Not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", CCTab2);
			Thread.sleep(3000);
			
//Select Brand
			WebElement selectbrandtxbxlabel2 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[2]"));
			WebElement drpdwn2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			WebElement SelectBrandTxbx2 = driver.findElement(By.xpath(("(//div[contains(@class,'mat-select-trigger')])[2]")));
			if (selectbrandtxbxlabel2.isDisplayed() && drpdwn2.isDisplayed() && SelectBrandTxbx2.isDisplayed()) {
			System.out.println("select Brand field is displayed");
			Thread.sleep(3000);
			componentsInformation.add(8, "Present");
			} else {
			System.out.println("select Brand field is not displayed");
			componentsInformation.add(8, "Not Present");
			}
			Thread.sleep(3000);

			
//Active Profiles Field
			WebElement Activeprofilelabel=driver.findElement(By.xpath(" //p[contains(text(),'Active Profiles :')]"));
			if(Activeprofilelabel.isDisplayed()) {
			System.out.println("/Active Profiles Field is displayed");
			componentsInformation.add(9, "Present");
			}
			else {
			System.out.println("/Active Profiles Field is not displayed");
			componentsInformation.add(9, "Not Present");
			}
			Thread.sleep(3000);
			


//Add Accounts Field and Channels
			WebElement AddAccountlabel=driver.findElement(By.xpath(" (//span[contains(text(),'Add Accounts')])[1]"));
			WebElement Addaccounticon1=driver.findElement(By.xpath(" (//mat-icon[contains(text(),'add_circle_outline')])[2]"));
			js.executeScript("arguments[0].click()", Addaccounticon1);
			WebElement Channelslabel=driver.findElement(By.xpath(" (//div[contains(text(),' Select Social Media Channel')])[1]"));
			WebElement Twitter2=driver.findElement(By.xpath(" (//img[@src='assets/images/channel-logos/twitter.svg'])"));
			WebElement Instafacebbok2=driver.findElement(By.xpath(" (//img[@src='assets/images/account/instagram.svg'])[2]"));
			js.executeScript("arguments[0].click()", Addaccounticon1);
			if(AddAccountlabel.isDisplayed() &&  Addaccounticon1.isDisplayed() && Twitter2.isDisplayed() && Instafacebbok2.isDisplayed()
			&& Channelslabel.isDisplayed()){
			System.out.println("Add Accounts Field and Channels are displayed");
			componentsInformation.add(10, "Present");
			}
			else {
			System.out.println("Add Accounts Field and Channels are not displayed");
			componentsInformation.add(10, "Not Present");
			}
			Thread.sleep(3000);
			
//Historic Data Tab(Channel Configuration Tab3)
			WebElement pushpin3=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[3]"));
			WebElement CCTab3=driver.findElement(By.xpath("(//span[contains(text(),'Historic Data')])[1]"));
			if(pushpin3.isDisplayed()&&CCTab3.isDisplayed()) {
			System.out.println("Channel Configuration tab3 Label is displayed");
			componentsInformation.add(11, "Present");
			}
			else {
			System.out.println("Channel Configuration tab3 Label is not displayed");
			componentsInformation.add(11, "Not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", CCTab3);
			Thread.sleep(3000);
			
//Select Brand
			WebElement selectbrandtxbxlabel3 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[3]"));
			WebElement drpdwn3 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			WebElement SelectBrandTxbx3 = driver.findElement(By.xpath(("(//div[contains(@class,'mat-select-trigger')])[3]")));
			if (selectbrandtxbxlabel3.isDisplayed() && drpdwn3.isDisplayed() && SelectBrandTxbx3.isDisplayed()) {
			System.out.println("select Brand field is displayed");
			Thread.sleep(3000);
			componentsInformation.add(12, "Present");
			} else {
			System.out.println("select Brand field is not displayed");
			componentsInformation.add(12, "Not Present");
			}
			Thread.sleep(3000);

//Historic Data Consumed/Total :
			WebElement Label=driver.findElement(By.xpath("(//p[contains(text(),' Historic Data Consumed/Total : ')])[1]"));
			WebElement Profiles=driver.findElement(By.xpath("//th[contains(text(),'Profiles')]"));
			WebElement Channel=driver.findElement(By.xpath("//th[contains(text(),' Channels')]"));
			WebElement Duration=driver.findElement(By.xpath("//th[contains(text(),'Duration')]"));
			WebElement Action=driver.findElement(By.xpath("//div[contains(text(),'Action')]"));
			if(Label.isDisplayed() && Profiles.isDisplayed() && Channel.isDisplayed() && Duration.isDisplayed() && Action.isDisplayed()) {
			System.out.println("Historic Data Consumed/Total :label is Present");
			componentsInformation.add(13, "Present");
			}
			else {
			System.out.println("Historic Data Consumed/Total :label is not Present");
			componentsInformation.add(13, "Not Present");
			}
			Thread.sleep(3000);
			
//Select Profiles for Collect Data Button  
			WebElement Button=driver.findElement(By.xpath("(//span[contains(text(),'Select Profiles for Collect Data')])[1]"));
			if(Button.isDisplayed()) {
			System.out.println("Select Profiles for Collect Data Button is Present");
			componentsInformation.add(14, "Present");
			}
			else {
			System.out.println("Select Profiles for Collect Data Button is not Present");
			componentsInformation.add(14, "Not Present");
			}
			js.executeScript("arguments[0].click()", Button);
			Thread.sleep(3000);
			
//Select Profiles for Collect Historic Data UI Components
			WebElement Heading=driver.findElement(By.xpath("//h3[contains(text(),'Select Profiles for Collect Historic Data')]"));
			WebElement Searchbybrand=driver.findElement(By.xpath("//input[@Placeholder='Search by Profile']"));
			WebElement Searchsymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			WebElement Channeltxbxlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Channels')])[1]"));
			WebElement AllChannels=driver.findElement(By.xpath("(//span[contains(text(),'All channels')])[1]"));
			WebElement Channelsdrpdwn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			WebElement crossbutton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			WebElement Cancel=driver.findElement(By.xpath(" //span[contains(text(),'Cancel')] "));
			WebElement Continue=driver.findElement(By.xpath(" //span[contains(text(),' Continue')] "));
			if(Heading.isDisplayed() && Searchbybrand.isDisplayed() && Searchsymbol.isDisplayed() && Channeltxbxlabel.isDisplayed() 
			&& AllChannels.isDisplayed() && Channelsdrpdwn.isDisplayed() && crossbutton.isDisplayed() && Cancel.isDisplayed() && Continue.isDisplayed()) {
			System.out.println("cross Button is  displayed");
			componentsInformation.add(15, "Present");
			}
			else {
			System.out.println("cross Button is not displayed");
			componentsInformation.add(15, "Not Present");
			}
			WebElement crossbutton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			js.executeScript("arguments[0].click()", crossbutton1);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(16, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "ChannelConfigurationUIComponent");
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	

}

