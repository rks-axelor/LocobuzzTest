package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAlertUIVerificationProcess {

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
	
	public static void LocobuzzViralAlertUIVerification(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Listening Setting
			WebElement Listening=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),' Listening Settings')])[1]"));
			WebElement ListeningDrpdwn=driver.findElement(By.xpath("(//span[contains(@class,'mat-expansion-indicator ng-tns-c')])[1]"));
			if(Listening.isDisplayed() && ListeningDrpdwn.isDisplayed()) {
				System.out.println("Listening Setting is displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Listening Setting is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", Listening);
			Thread.sleep(5000);
			
// Alert
			
			WebElement Alertlabel=driver.findElement(By.xpath("(//span[contains(text(),'Alert')])[1]"));
			WebElement Alertlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Alerts.svg']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Alertlabel);
			Thread.sleep(5000);
			if(Alertlogo.isDisplayed()&&Alertlabel.isDisplayed()) {
				System.out.println(" Alert Logo and Label is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println(" Alert Logo and Label is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			
			js.executeScript("arguments[0].click()", Alertlabel);
			Thread.sleep(3000);
			
//Alert Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement ATab=driver.findElement(By.xpath("(//span[contains(text(),'Alert')])[4]"));
			if(pushpin.isDisplayed() && ATab.isDisplayed()) {
				System.out.println(" Alert Tab is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Alert Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}
			
// Alert Heading And Information
			WebElement AHeading=driver.findElement(By.xpath("(//p[contains(text(),'Alert')])"));
			WebElement Ainfromation=driver.findElement(By.xpath("(//p[contains(text(),'Alert')])//following::P[1]"));
			if(AHeading.isDisplayed()&&Ainfromation.isDisplayed()) {
				System.out.println(" Alert Heading And Information is displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println(" Alert Heading And Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//search Brand field
			WebElement searchField=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow ng-tns-c')])"));
			js.executeScript("arguments[0].click()", searchField);
			Thread.sleep(3000);
//Search By Brand Name			
			WebElement searchbybrand=driver.findElement(By.xpath("(//input[@data-placeholder='Search brand name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			if(searchbybrand.isDisplayed()&&symbol.isDisplayed()) {
				System.out.println("Search Brand Field is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Search Brand Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			js.executeScript("arguments[0].click()", searchbybrand);
			Thread.sleep(3000);
			WebElement selectbrand=driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])[1]"));
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(3000);


//Search By Subject Name Field
			
			WebElement searchsubField=driver.findElement(By.xpath("(//input[@placeholder='Search by Subject'])"));
			WebElement subsymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchsubField.isDisplayed()&&subsymbol.isDisplayed()) {
				System.out.println("Search By Subject Name Field is displayed");
				componentsInformation.add(5, "Present");
			}
			else {
				System.out.println("Search By Subject Name Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			Thread.sleep(3000);
//create Alert
			WebElement createalert=driver.findElement(By.xpath("(//span[contains(text(),'Create New Alert')])"));
			WebElement alertadd=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])"));
			if(createalert.isDisplayed() && alertadd.isDisplayed()) {
				System.out.println("create Alert Field is displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("create Alert Field is not  displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", createalert);
			Thread.sleep(3000);
			
//Create New Alert heading
			WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Create New Alert')]"));
			WebElement arrow=driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]"));
			if(heading.isDisplayed()&& arrow.isDisplayed()) {
				System.out.println("Configure Viral Alert heading is displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Configure Viral Alert heading is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			Thread.sleep(3000);

//Email Alert Subject Field
			WebElement EmailsubHead=driver.findElement(By.xpath("//div[contains(text(),'Email Alert Subject')]"));
			WebElement EmailsubInfo=driver.findElement(By.xpath("//div[contains(text(),'Email Alert Subject ')]//following::p[1]"));
			WebElement submust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[1]"));
			WebElement Subnametxbx=driver.findElement(By.xpath("//mat-label[contains(text(),'Email Subject Name')]"));
            if(EmailsubHead.isDisplayed() && EmailsubInfo.isDisplayed() && submust.isDisplayed() && Subnametxbx.isDisplayed() ) {
				System.out.println("Email Alert Subject Field is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Email Alert Subject Field is not displayed");
				componentsInformation.add(8, "Not Present");
			}
        	Thread.sleep(3000);

//Schedule Alerts Field
			WebElement Schedulealert=driver.findElement(By.xpath("//div[contains(text(),'Schedule Alert(s)')]"));
			WebElement Scheduleinfo=driver.findElement(By.xpath("//div[contains(text(),'Schedule Alert(s)')]//following::p[1]"));
			WebElement Fromdt=driver.findElement(By.xpath("//div[contains(text(),'From Date ')]"));
			WebElement Enddate=driver.findElement(By.xpath("//span[contains(text(),'End Date')]"));
            if(Schedulealert.isDisplayed() && Scheduleinfo.isDisplayed() && Fromdt.isDisplayed() && Enddate.isDisplayed() ) {
				System.out.println("Schedule Alerts Field is displayed");
				componentsInformation.add(9, "Present");
			}
			else {
				System.out.println("Schedule Alerts Field is not displayed");
				componentsInformation.add(9, "Not Present");
			}
        	Thread.sleep(3000);
        	
//Time Duration Field
			WebElement timeduration=driver.findElement(By.xpath("//div[contains(text(),'Time Duration')]"));
			WebElement timedurinfo=driver.findElement(By.xpath("//div[contains(text(),'Time Duration')]//following::p[1]"));
			WebElement starttime=driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-')])[4]"));
			WebElement Endtime=driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-')])[5]"));
            if(timeduration.isDisplayed() && timedurinfo.isDisplayed() && starttime.isDisplayed() && Endtime.isDisplayed() ) {
				System.out.println("Time Duration Field is displayed");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Time Duration Field is not displayed");
				componentsInformation.add(10, "Not Present");
			}
        	Thread.sleep(3000);
        	
//Days Selection Field
			WebElement selectdays=driver.findElement(By.xpath("(//p[contains(@class,'text__regular font-weight-')])[1]"));
			WebElement seldaysmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[3]"));
			WebElement customtime=driver.findElement(By.xpath("(//span[contains(text(),'Custom Time ')])"));
			WebElement selcutime=driver.findElement(By.xpath("(//input[@placeholder='Select Custom Time'])"));
            if(selectdays.isDisplayed() && seldaysmust.isDisplayed() && customtime.isDisplayed() && selcutime.isDisplayed() ) {
				System.out.println("Days Selection Field is displayed");
				componentsInformation.add(11, "Present");
			}
			else {
				System.out.println("Days Selection Field is not displayed");
				componentsInformation.add(11, "Not Present");
			}
        	Thread.sleep(3000);

//Select Email ID's For Alert Field
			WebElement selectid=driver.findElement(By.xpath("(//p[contains(text(),'Select Email Id(s) for Alert(s)')])"));
			WebElement selectidinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select Email Id(s) for Alert(s)')])//following::p[1]"));
			WebElement totxbxmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[4]"));
			
            if(selectid.isDisplayed() && selectidinfo.isDisplayed() && totxbxmust.isDisplayed() ) {
				System.out.println("Select Email ID's For Alert Field is displayed");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Select Email ID's For Alert Field is not displayed");
				componentsInformation.add(12, "Not Present");
			}
        	Thread.sleep(3000);       	
        	
//Select Channel Field
			WebElement selectchannel=driver.findElement(By.xpath("(//div[contains(text(),'Select Channel(s)')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selectchannel);
			WebElement selchansinfo=driver.findElement(By.xpath("(//div[contains(text(),'Select Channel(s)')])//following::p[1]"));
			WebElement selchamust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[5]"));
			
            if(selectchannel.isDisplayed() && selchansinfo.isDisplayed() && selchamust.isDisplayed() ) {
				System.out.println("Days Selection Field is displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("Days Selection Field is not displayed");
				componentsInformation.add(13, "Not Present");
			}
        	Thread.sleep(3000);
        	
//Select Attributes Field
			WebElement attributes=driver.findElement(By.xpath("(//p[contains(text(),'Select Attribute(s)')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", attributes);
			WebElement Attributeinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select Attribute(s)')])//following::p[1]"));
			WebElement addgroup=driver.findElement(By.xpath("(//span[contains(text(),'+ Add Group')])"));
			
            if(attributes.isDisplayed() && Attributeinfo.isDisplayed() && addgroup.isDisplayed() ) {
				System.out.println("Select Attributes Field is displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Select Attributes Field is not displayed");
				componentsInformation.add(14, "Not Present");
			}
        	Thread.sleep(3000);


        	
     	
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}
			
//save alert button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(16, "Not Present");
			}
			

			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(17, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "AlertUIVerification");
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
