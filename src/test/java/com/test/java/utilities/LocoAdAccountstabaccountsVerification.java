package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class LocoAdAccountstabaccountsVerification {
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
	
public static void verifyingChannelConfigAdaccountsFunction(WebDriver driver) throws Exception {
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
			
//Channel Configuration Ad Accounts tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement CCTab=driver.findElement(By.xpath("(//span[contains(text(),'Ad Accounts')])[1]"));
			if(pushpin.isDisplayed()&&CCTab.isDisplayed()) {
			System.out.println("Channel Configuration tab Label is displayed");
			componentsInformation.add(2, "Present");
			}
			else {
			System.out.println("Channel Configuration tab Label is not displayed");
			componentsInformation.add(2, "Not Present");
			}
			js.executeScript("arguments[0].click()", CCTab);
			Thread.sleep(3000);
			Thread.sleep(3000);
			
//select Brand
			WebElement selectbrandtxbxlabel = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[2]"));
			WebElement drpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			WebElement SelectBrandTxbx = driver.findElement(By.xpath(("(//div[contains(@class,'mat-select-trigger')])[2]")));
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
		    WebElement selectbrand = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(8000);
			
// Active Social Profiles/Total : and  Active Other Profiles/Total : Labels	

			WebElement socialprofilelabel=driver.findElement(By.xpath("(//p[contains(text(),' Active Profiles : ')])"));
			//WebElement otherprofilelabel=driver.findElement(By.xpath("(//p[contains(text(),'Active Other Profiles/Total :')])"));
			if(socialprofilelabel.isDisplayed()) {
			System.out.println("Active Profiles Label Field is displayed");
			componentsInformation.add(4, "Present");
			}
			else {
			System.out.println("Active Profiles Label Field is displayed is not displayed");
			componentsInformation.add(4, "Not Present");
			}
			Thread.sleep(3000);
			
//Add Accounts Icon and Label field
			WebElement Addchannelicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])[1]"));
			WebElement Addchannellabel=driver.findElement(By.xpath("(//span[contains(text(),'Add Accounts')])"));
			if(Addchannelicon.isDisplayed()&&Addchannellabel.isDisplayed()) {
			System.out.println("Add Channel Icon and Label field is displayed");
			componentsInformation.add(5, "Present");
			}
			else {
			System.out.println("Add Channel Icon and Label field is not displayed");
			componentsInformation.add(5, "Not Present");
			}
			Thread.sleep(5000);
			WebElement Addchannellabel1=driver.findElement(By.xpath("(//span[contains(text(),'Add Accounts')])"));
			js.executeScript("arguments[0].click()", Addchannellabel1);
			Thread.sleep(8000);
			
//Channel Labels
			WebElement Adaccountslabel=driver.findElement(By.xpath("(//div[contains(text(),'Select Social Media Channel')])"));
			WebElement FacebbokInsta=driver.findElement(By.xpath("(//p[contains(text(),'Facebook & Instagram')])[1]"));
			WebElement Twitter=driver.findElement(By.xpath("(//p[contains(text(),'Twitter')])[1]"));
		    Thread.sleep(3000);
			if(FacebbokInsta.isDisplayed() && Twitter.isDisplayed() && Adaccountslabel.isDisplayed()) {
			System.out.println("All Channel Labels are displayed");
			componentsInformation.add(6, "Present");
			}
			else {
			System.out.println("All Channel Labels are not displayed");
			componentsInformation.add(6, "Not Present");
			}
			Thread.sleep(3000);
			WebElement Twitter1=driver.findElement(By.xpath("(//p[contains(text(),'Twitter')])[1]"));
			js.executeScript("arguments[0].click()", Twitter1);
			Thread.sleep(3000);

//Add Channel Field
			WebElement adTWAccount=driver.findElement(By.xpath("(//h3[contains(text(),'Twitter Business Accounts')])"));
			js.executeScript("arguments[0].click()", adTWAccount);
			Thread.sleep(3000);

//Twitter Buissness Accounts
			WebElement heading=driver.findElement(By.xpath("(//h3[contains(text(),'Twitter Business Accounts')])"));
			WebElement selectlabel=driver.findElement(By.xpath("//span[contains(text(),'Select All Accounts')]"));
			WebElement selectcheckbox=driver.findElement(By.xpath(" (//span[contains(@class,'mat-checkbox-inner-container')])[5]"));
			WebElement selectedaccount=driver.findElement(By.xpath("//span[contains(text(),'Account Selected')]"));
			WebElement cancel=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
			WebElement Addacc=driver.findElement(By.xpath("(//span[contains(text(),'Add Account')])[2]"));
			WebElement closewindow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[1]"));
			
			if(heading.isDisplayed() && selectlabel.isDisplayed() && selectcheckbox.isDisplayed() && selectedaccount.isDisplayed()
			&& cancel.isDisplayed() && Addacc.isDisplayed() && closewindow.isDisplayed()) {
			System.out.println("Social Media Channels Heading and all Channels are displayed");
			componentsInformation.add(7, "Present");
			}
			else {
			System.out.println("Social Media Channels Heading and all Channels are not  displayed");
			componentsInformation.add(7, "Not Present");
			}
			Thread.sleep(3000);
//Add Twitter account
			WebElement selectallaccount1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[5]"));
			js.executeScript("arguments[0].click()", selectallaccount1);
			Thread.sleep(5000);
			WebElement unselectallaccount1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[5]"));
			js.executeScript("arguments[0].click()", unselectallaccount1);
			Thread.sleep(5000);
			WebElement twaccount1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[3]"));
			js.executeScript("arguments[0].click()", twaccount1);
			Thread.sleep(3000);
			WebElement addtwaccount1 = driver.findElement(By.xpath("(//span[contains(text(),'Add Account')])[2]"));
			js.executeScript("arguments[0].click()", addtwaccount1);
			Thread.sleep(3000);
//Twitter Ad Account Info
			WebElement adaccountlogo = driver.findElement(By.xpath("(//img[@src='assets/images/channel-logos/twitter.svg'])"));
			System.out.println("Ad Accounts logo displayed on UI");
			WebElement adaccountlabel = driver.findElement(By.xpath("(//span[contains(text(),'Twitter Ad Accounts')])"));
			System.out.println("Ad Accounts label is:" +adaccountlabel.getText());
			WebElement adaccountuser = driver.findElement(By.xpath("(//div[contains(@class,'line-height-')])"));
			System.out.println("Ad accounts username displayed:"+adaccountuser.getText());
			WebElement adaccountuserdeleteicon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])"));
			System.out.println("Delete icon & Label are displayed");
			
			WebElement deleteaccount = driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[1]"));
			js.executeScript("arguments[0].click()", deleteaccount);
			Thread.sleep(3000);
			WebElement deleteaccountconfirm = driver.findElement(By.xpath("(//span[contains(text(),'Yes')])[1]"));
			js.executeScript("arguments[0].click()", deleteaccountconfirm);
			Thread.sleep(5000);
			

			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(8, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "AdAccountsuiverification");
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	

}


