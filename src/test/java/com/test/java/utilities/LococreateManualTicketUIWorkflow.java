package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LococreateManualTicketUIWorkflow {
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
catch(Exception e) 
{
		    e.printStackTrace();
			throw e;
}
}
	
public static void CreateManualticketFunctionality(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Adv Response Management
			WebElement advremngt=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Adv. Response Management')]"));
			if(advremngt.isDisplayed()) {
			System.out.println("Adv Response Management is displayed");
			componentsInformation.add(0, "Present");
			}
			else {
			System.out.println("Adv Response Management is not displayed");
			componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advremngt);
			Thread.sleep(3000);
			
//Create Manual Ticket Label in Account Section
			WebElement crmanualticketlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Create_Manual_Ticket.svg']"));
			WebElement crmanualticketlabel=driver.findElement(By.xpath("//span[contains(text(),'Create Manual Ticket')]"));
			if(crmanualticketlogo.isDisplayed()&&crmanualticketlabel.isDisplayed()) {
			System.out.println("Create Manual Ticket Label in Account Section is displayed");
			componentsInformation.add(1, "Present");
			}
			else {
			System.out.println("Create Manual Ticket Label in Account Section is not displayed");
			componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", crmanualticketlabel);
			Thread.sleep(3000);
			
//Create Manual Ticket Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement Createmanualtab=driver.findElement(By.xpath("(//span[contains(text(),'Create Manual Ticket')])[2]"));
			if(pushpin.isDisplayed()&&Createmanualtab.isDisplayed()) {
			System.out.println("Create Manual Ticket Tab is displayed");
			componentsInformation.add(2, "Present");
			}
			else {
			System.out.println("Create Manual Ticket Tab is not displayed");
			componentsInformation.add(2, "Not Present");
			}

//Create Manual Ticket Tab Heading and Information	

			WebElement CMTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Create Manual Ticket Setting')])"));
			WebElement CMTInformation=driver.findElement(By.xpath("(//p[contains(text(),'Create Manual Ticket Setting')])//following::p[1]"));
			if(CMTHeading.isDisplayed()&&CMTInformation.isDisplayed()) {
			System.out.println("Create Manual Ticket Tab Heading and Information is displayed");
			componentsInformation.add(3, "Present");
			}
			else {
			System.out.println("Create Manual Ticket Tab Heading and Information is not displayed");
			componentsInformation.add(3, "Not Present");
			}
			
// Select Brand Field
			WebElement selectbrandlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
			WebElement selectbrdrpdn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])"));
			if(selectbrandlabel.isDisplayed() & selectbrdrpdn.isDisplayed()) {
			System.out.println("Select Brand Field is displayed");
			componentsInformation.add(4, "Present");
			}
			else {
			System.out.println("Select Brand Field is not displayed");
			componentsInformation.add(4, "Not Present");
			}
			Thread.sleep(5000);

//Role and act/inactive label Field
			WebElement Role=driver.findElement(By.xpath("//th[contains(text(),'Role')]"));
			WebElement actinact=driver.findElement(By.xpath("//th[contains(text(),' Active/Inactive')]"));
			if(Role.isDisplayed()&&actinact.isDisplayed()) {
			System.out.println("Role and act/inactive label Field is displayed");
			componentsInformation.add(5, "Present");
			}
			else {
			System.out.println("Role and act/inactive label Field is not displayed");
			componentsInformation.add(5, "Not Present");
			}
			Thread.sleep(3000);	

//Autoacknowledgement Email Field
	        WebElement Autoackwheading=driver.findElement(By.xpath("//p[contains(text(),'Auto Acknowledgement Email')]"));
	        WebElement Autoackwinfo=driver.findElement(By.xpath("//p[contains(text(),'Auto Acknowledgement Email')]//following::p[1]"));				
	        WebElement note=driver.findElement(By.xpath("//span[contains(text(),'Note:')]"));				

			if(Autoackwheading.isDisplayed() && Autoackwinfo.isDisplayed() && note.isDisplayed()) {
			System.out.println("Autoacknowledgement Email Field is displayed");
			componentsInformation.add(6, "Present");
			}
			else {
			System.out.println("Autoacknowledgement Email Field is not displayed");
			componentsInformation.add(6, "Not Present");
			}
			Thread.sleep(3000);	          

//Sent Autoacknowledgement Mail Field
			WebElement Checkbox=driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-inner-container')]"));
			WebElement Sentautoackwlabel=driver.findElement(By.xpath("//label[contains(@class,'mat-checkbox-layout')]"));
		
			if(Checkbox.isDisplayed() && Sentautoackwlabel.isDisplayed() ) {
			System.out.println("Sent Autoacknowledgement Mail Field is present");
			componentsInformation.add(7, "Present");
			}
			else {
			System.out.println("Sent Autoacknowledgement Mail Field is not present");
			componentsInformation.add(7, "Not Present");
			}
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

//Create Manual Ticket Icon		
			WebElement icon=driver.findElement(By.xpath("//img[@src='assets/images/common/Manual_Ticket.svg']"));
			if(icon.isDisplayed()) {			
			System.out.println("Create Manual Ticket Icon field is displayed");
			componentsInformation.add(8, "Present");
			}
			else {
			System.out.println("Create Manual Ticket Icon field is not displayed");
			componentsInformation.add(8, "Not Present");
			}
			js.executeScript("arguments[0].click()", icon);
			Thread.sleep(3000);

//Create Manual Ticket Heading in Ticket Section	
			WebElement Heading=driver.findElement(By.xpath("//h3[contains(text(),'create manual ticket')]"));
			WebElement cross=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
			if(Heading.isDisplayed() && cross.isDisplayed()) {			
			System.out.println("Create Manual Ticket Heading in Ticket Section is displayed");
			componentsInformation.add(9, "Present");
			}
			else {
			System.out.println("Create Manual Ticket Heading in Ticket Section is not displayed");
			componentsInformation.add(9, "Not Present");
			}
			Thread.sleep(3000);

//Brand Textbox
			WebElement Brandlabel=driver.findElement(By.xpath("(//label[contains(text(),'Brand')])[2]"));
			WebElement Brandseldrpdwn=driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[6]"));
			WebElement Brandtxbx=driver.findElement(By.xpath("(//button[contains(@class,'custom__selectmenu--trigger select-trigger')])[1]"));
            if(Brandlabel.isDisplayed() && Brandseldrpdwn.isDisplayed() && Brandtxbx.isDisplayed()) {			
			System.out.println("Brand Textbox is displayed");
			componentsInformation.add(10, "Present");
			}
			else {
			System.out.println("Brand Textbox is not displayed");
			componentsInformation.add(10, "Not Present");
			}
			Thread.sleep(3000);

//Channel Textbox
			WebElement Channel=driver.findElement(By.xpath("(//label[contains(text(),'channel')])"));
			WebElement Channeltxbx=driver.findElement(By.xpath("(//button[contains(@class,'custom__selectmenu--trigger select-trigger')])[1]"));
			if(Channel.isDisplayed() && Channeltxbx.isDisplayed()) {			
			System.out.println("Channel Textbox field is displayed");
			componentsInformation.add(11, "Present");
			}
			else {
			System.out.println("Channel Textbox field is not displayed");
			componentsInformation.add(11, "Not Present");
			}
			Thread.sleep(3000);
			
//Username Textbox
			WebElement username=driver.findElement(By.xpath("//mat-label[contains(text(),'User Name')]"));
			if(Channel.isDisplayed()) {			
			System.out.println("Username Textbox field is displayed");
			componentsInformation.add(12, "Present");
			}
			else {
			System.out.println("Username Textbox field is not displayed");
			componentsInformation.add(12, "Not Present");
			}
			Thread.sleep(3000);

//From and To Textbox
			WebElement From=driver.findElement(By.xpath("//mat-label[contains(text(),'From')]"));
			WebElement To=driver.findElement(By.xpath("//mat-label[contains(text(),'To')]"));
			WebElement Frommust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[1]"));
			WebElement Todrpdwn=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])"));
			WebElement CC=driver.findElement(By.xpath("(//a[contains(text(),'+Cc')])"));
			WebElement BCC=driver.findElement(By.xpath("(//a[contains(text(),'+Bcc')])"));
			if(From.isDisplayed() && To.isDisplayed() && Frommust.isDisplayed() && Todrpdwn.isDisplayed()
			&& CC.isDisplayed() && BCC.isDisplayed()) {			
			System.out.println("From and To Textbox field is displayed");
			componentsInformation.add(13, "Present");
			}
			else {
			System.out.println("From and To Textbox field is not displayed");
			componentsInformation.add(13, "Not Present");
			}
			Thread.sleep(3000);
			
//Subject Textbox
			 WebElement Subject=driver.findElement(By.xpath("//mat-label[contains(text(),'Subject')]"));
	         WebElement Subjectmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[3]"));
	         if(Channel.isDisplayed()) {			
	         System.out.println("Subject Textbox field is displayed");
	    	 componentsInformation.add(14, "Present");
	    	 }
	    	 else {
	    	 System.out.println("View all conversation field is not displayed");
	    	 componentsInformation.add(14, "Not Present");
	    	 }
	         Thread.sleep(3000);
            
//Body Field
            WebElement Body=driver.findElement(By.xpath("//h4[contains(text(),'Body')]"));
            WebElement Bodymust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[4]"));
            if(Body.isDisplayed()) {			
    		System.out.println("Body Field is displayed");
    		componentsInformation.add(15, "Present");
    		}
    		else {
    		System.out.println("Body Field is not displayed");
    		componentsInformation.add(15, "Not Present");
    		}
            Thread.sleep(3000);
            
//Attach Media 
            WebElement attachmedia=driver.findElement(By.xpath("//span[contains(text(),'Attach Media')]"));
            WebElement Iconmedia=driver.findElement(By.xpath("(//mat-icon[contains(text(),'insert_photo')])"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Iconmedia);
            Thread.sleep(3000);
            if(attachmedia.isDisplayed() && Iconmedia.isDisplayed()) {			
    		System.out.println("Attach Media field is displayed");
    		componentsInformation.add(16, "Present");
    		}
    		else {
    		System.out.println("Attach Media field is not displayed");
    		componentsInformation.add(16, "Not Present");
    		}
            Thread.sleep(3000);
            
//Cancel
            WebElement Cancel=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])[2]"));
            if(Cancel.isDisplayed()) {			
    		System.out.println("Cancel field is displayed");
    		componentsInformation.add(17, "Present");
    		}
    		else {
    		System.out.println("Cancel field is not displayed");
    		componentsInformation.add(17, "Not Present");
    		}
            Thread.sleep(3000);
            
//Tag and Create
            WebElement Tagcreate=driver.findElement(By.xpath("//span[contains(text(),'Tag & Create Ticket')]"));
            if(Tagcreate.isDisplayed()) {			
    		System.out.println("Tag and Create field is displayed");
    		componentsInformation.add(18, "Present");
    		}
    		else {
    		System.out.println("Tag and Create field is not displayed");
    		componentsInformation.add(18, "Not Present");
    		}
            Thread.sleep(3000);
            WebElement cross1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
            js.executeScript("arguments[0].click()", cross1);
			Thread.sleep(3000);
			componentsInformation.add(19, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "CreatemanualticketUIComponents");
					
				
			
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
	


