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

public class LocoNPSFeedbackAccountWorkprocess {

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

	

public static void NPSFeedbackWorkprocess(WebDriver driver) throws Exception {
try {
	   Thread.sleep(5000);
	   JavascriptExecutor js = (JavascriptExecutor) driver;
// Premium Features
		WebElement premium=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Premium Features')])[1]"));
		js.executeScript("arguments[0].click()", premium);
		Thread.sleep(3000);

//NPS/Feedback Label and Logo
		
		WebElement NPSLabel = driver.findElement(By.xpath("(//span[contains(text(),'Feedback / NPS')])[1]"));
		WebElement NPSLogo = driver.findElement(By.xpath("//img[@src='assets/account/menu/Feedback_NPS.svg']"));			
		js.executeScript("arguments[0].click()", NPSLabel);
		Thread.sleep(3000);
		

//NPS/Feedback tab
		WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
		WebElement NPSFeedbacktab = driver.findElement(By.xpath("(//span[contains(text(),'Feedback / NPS')])[2]"));
		if (pushpin.isDisplayed() && NPSFeedbacktab.isDisplayed()) 
		System.out.println("NPS/Feedback tab is displayed");
		Thread.sleep(5000);	

//NPS/Feedback Heading and  information
		WebElement NPSFDBHeading = driver.findElement(By.xpath("(//p[contains(text(),'Feedback/NPS')])[1]"));
		WebElement information = driver.findElement(By.xpath("(//p[contains(text(),'Feedback/NPS')])//following::p[2]"));
		if (NPSFDBHeading.isDisplayed() && information.isDisplayed()) 
		System.out.println("NPS/Feedback Heading and  information is displayed");
		Thread.sleep(5000);
		
//Feature Active Field
		WebElement Featureactivelabel = driver.findElement(By.xpath("//p[contains(text(),'Feature is inactive')]"));
		WebElement Featurelogo = driver.findElement(By.xpath("//label[contains(@class,'rounded-toggle-switch-label')]"));
	    js.executeScript("arguments[0].click()",Featurelogo );
		Thread.sleep(5000);
		System.out.println("Feature Active Field is Disabled Successfully");
		js.executeScript("arguments[0].click()",Featurelogo );
		Thread.sleep(5000);
		System.out.println("Feature Active Field is  Enabled Successfully");
		
//Select Brand Field
		WebElement selbrandlabel = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
		WebElement selbrand = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
	    js.executeScript("arguments[0].click()",selbrand );
		Thread.sleep(5000);
		System.out.println("All Brands List Is displayed");


//Brand Selection textbox 
		WebElement SelbyBrName = driver.findElement(By.xpath("(//input[@data-placeholder='Search brand name'])"));
		Thread.sleep(3000);
		WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
		if (SelbyBrName.isDisplayed() && symbol.isDisplayed()) 
		System.out.println("Feedback Rating Details field is displayed");
		WebElement Medlifebotbrand = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
		Thread.sleep(3000);
	    js.executeScript("arguments[0].click()",Medlifebotbrand );
		Thread.sleep(5000);
		System.out.println("Medlifebotbrand is present and Selected for NPS/Feedback");

//Feedback Rating Details
		 
		WebElement Feedbackpreviewheading = driver.findElement(By.xpath("//div[contains(text(),'Feedback Rating form Preview')]"));
		Thread.sleep(3000);
		if (Feedbackpreviewheading.isDisplayed()) 
		System.out.println("Feedback Rating Details field is displayed");
		Thread.sleep(3000);

//Upload  Brand Logo Deatils			
		WebElement BrlogoHeading = driver.findElement(By.xpath("(//p[contains(text(),'Brand Logo')])[1]"));
		WebElement uploadheading = driver.findElement(By.xpath("//p[contains(text(),'Upload Brand Logo')]"));
		WebElement uploaddetails = driver.findElement(By.xpath("//p[contains(text(),'Upload Brand Logo')]//following::p[1]"));
		WebElement Cameralogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'photo_camera')]"));
		WebElement uploadmust = driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[1]"));
		if (BrlogoHeading.isDisplayed() && uploadheading.isDisplayed() && uploaddetails.isDisplayed() && 
		Cameralogo.isDisplayed()&& uploadmust.isDisplayed()) 
		System.out.println("Upload  Brand Logo Deatils field is displayed");
		Thread.sleep(3000);	
		Cameralogo.click();
        Thread.sleep(2000);
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\admin\\Downloads\\butterfly.jpg");
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
		
//Save logo After crop operation	
		WebElement savelogo=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]"));
		js.executeScript("arguments[0].click()", savelogo);
		Thread.sleep(4000);	
		
		
//Select Feedback Type Field Details
		WebElement selfeedback = driver.findElement(By.xpath("(//p[contains(text(),'Select Feedback Type')])[1]"));
		WebElement selfeedbackinfo = driver.findElement(By.xpath("(//p[contains(text(),'Select Feedback Type')])//following::p[1]"));
		if (selfeedback.isDisplayed() && selfeedbackinfo.isDisplayed()) 
		System.out.println("Select Feedback Type Field Details is Present");
		Thread.sleep(3000);

//Feedback Rating
		WebElement FDBTXBX = driver.findElement(By.xpath("(//p[contains(text(),'Feedback Rating')])"));
		WebElement FDBINFO = driver.findElement(By.xpath("(//p[contains(text(),'Feedback Rating')])//following::p[1]"));
		WebElement FDBCHBX = driver.findElement(By.xpath("(//mat-icon[contains(text(),'check_circle')])"));
		if (FDBTXBX.isDisplayed() && FDBINFO.isDisplayed() && FDBCHBX.isDisplayed()) 
		System.out.println("Feedback Rating is Present");
		Thread.sleep(3000);	
		
//NPS Rating
		WebElement NPStxbx = driver.findElement(By.xpath("(//p[contains(text(),'NPS rating')])"));
		WebElement NPSInfo = driver.findElement(By.xpath("(//p[contains(text(),'NPS rating')])//following::p[1]"));
		WebElement NPSChbx = driver.findElement(By.xpath("(//mat-icon[contains(text(),'circle')])[2]"));
		if (NPStxbx.isDisplayed() && NPSInfo.isDisplayed() && NPSChbx.isDisplayed()) 
		System.out.println("NPS Rating Field is Present");
		Thread.sleep(3000);		
		
//How would like to send Feedback form Field
		WebElement Heading = driver.findElement(By.xpath("(//p[contains(text(),'How would like to send Feedback form')])"));
		WebElement manually = driver.findElement(By.xpath("(//label[contains(@class,'mat-radio-label')])[1]"));
		WebElement manuallyinfo = driver.findElement(By.xpath("(//p[contains(text(),'How would like to send Feedback form')])//following::p[1]"));
		WebElement Automatically = driver.findElement(By.xpath("(//label[contains(@class,'mat-radio-label')])[2]"));
		WebElement Autoinfo = driver.findElement(By.xpath("(//p[contains(text(),'How would like to send Feedback form')])//following::p[2]"));
	    if (Heading.isDisplayed() && manually.isDisplayed() && manuallyinfo.isDisplayed() && Automatically.isDisplayed() && Autoinfo.isDisplayed() ) 
		System.out.println("Terms and Condition Link Textbox is Present");
	    Thread.sleep(3000);	
		
//Categories Field
		WebElement Categoryheading = driver.findElement(By.xpath("//p[contains(text(),'Categories')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Categoryheading);
		WebElement Addcatinfo = driver.findElement(By.xpath("//p[contains(text(),'Categories')]//following::p[1]"));
		WebElement Addcategbutton = driver.findElement(By.xpath("//span[contains(text(),'Add Categories')]"));
		WebElement Addcatlogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]"));
		WebElement addcatmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[2]"));
		if (Categoryheading.isDisplayed() && Addcatinfo.isDisplayed() && Addcategbutton.isDisplayed() 
		&& addcatmust.isDisplayed()&&Addcatlogo.isDisplayed()) 
		System.out.println("Categories Field is Present");
		
//Add Category		
		js.executeScript("arguments[0].click()", Addcategbutton);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Addcategbutton);
		Thread.sleep(4000);	
		WebElement Entercatname = driver.findElement(By.xpath("//mat-label[contains(text(),'Enter Category Name')]"));
		Actions actions = new Actions(driver);
		Action action = actions.sendKeys(Entercatname, "Auto Testing Category  Creation").build();
        action.perform();
	    WebElement Addicon = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow ng-tns-c')])[2]"));
		js.executeScript("arguments[0].click()", Addicon);
		Thread.sleep(2000);	
		WebElement selIcon = driver.findElement(By.xpath("//mat-icon[contains(text(),'message')]"));
		js.executeScript("arguments[0].click()", selIcon);
		Thread.sleep(2000);	
		WebElement savecat = driver.findElement(By.xpath("//span[contains(text(),' Save')]"));
		js.executeScript("arguments[0].click()", savecat);
		Thread.sleep(2000);	
//Set Messages Field
		WebElement addmsgheading = driver.findElement(By.xpath("//p[contains(text(),'Set Messages')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addmsgheading);
		WebElement Addmsginfo = driver.findElement(By.xpath("//p[contains(text(),'Set Messages')]//following::p[1]"));
		WebElement Addmsgbutton = driver.findElement(By.xpath("//span[contains(text(),'Add Messages')]"));
		WebElement Addmsglogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]"));
		WebElement setmsgmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[3]"));
		if (addmsgheading.isDisplayed() && Addmsginfo.isDisplayed() && Addmsgbutton.isDisplayed() 
		&& setmsgmust.isDisplayed()&&Addmsglogo.isDisplayed()) 
		System.out.println("Set Messages Field is Present");
		Thread.sleep(3000);	
//Add Message 
		
		js.executeScript("arguments[0].click()", Addmsgbutton);
		Thread.sleep(2000);	
		WebElement perso1 = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
		js.executeScript("arguments[0].click()", perso1);
		Thread.sleep(2000);
		WebElement screen1 = driver.findElement(By.xpath("//button[contains(text(),'Screen Name')]"));
		js.executeScript("arguments[0].click()", screen1);
		Thread.sleep(2000);
		WebElement msgfield = driver.findElement(By.xpath("(//textarea[contains(@class,'textarea-featured')])[2]"));
		js.executeScript("arguments[0].click()", msgfield);
		Thread.sleep(2000);
		msgfield.sendKeys("Hello , How are u?");
		WebElement personalization = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
		js.executeScript("arguments[0].click()", personalization);
		Thread.sleep(2000);
		WebElement Link = driver.findElement(By.xpath("//button[contains(text(),'Link')]"));
		js.executeScript("arguments[0].click()", Link);
		Thread.sleep(2000);
		WebElement Add1 = driver.findElement(By.xpath("(//span[contains(text(),'Add')])[5]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Add1);
		Thread.sleep(2000);
		//WebElement WebElement1 = driver.findElement(By.xpath("(//p[contains(@class,'text__light--sm pr-')])[2]"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", WebElement1);
		Thread.sleep(4000);
//Layout and Preview in Browser Field
		WebElement Layoutlabel = driver.findElement(By.xpath("//span[contains(text(),'Layout Theme')]"));
		WebElement layoutlogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'view_quilt')]"));
		WebElement Previewlabel = driver.findElement(By.xpath("//mat-icon[contains(text(),'visibility')]"));
		WebElement Previewlogo = driver.findElement(By.xpath("//span[contains(text(),'Preview in browser')]"));
		if (Layoutlabel.isDisplayed() && layoutlogo.isDisplayed() && Previewlabel.isDisplayed()  && Previewlogo.isDisplayed()) 
		System.out.println("Layout and Preview in Browser Field is Present");
		js.executeScript("arguments[0].click()", Layoutlabel);
		Thread.sleep(2000);	
		WebElement SelLayout1 = driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[3]"));
		js.executeScript("arguments[0].click()", SelLayout1);
		Thread.sleep(2000);
		WebElement Select = driver.findElement(By.xpath("(//span[contains(text(),'Select')])"));
		js.executeScript("arguments[0].click()", Select);
		Thread.sleep(2000);
		WebElement Previewlabel1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'visibility')]"));
		js.executeScript("arguments[0].click()", Previewlabel1);
		Thread.sleep(5000);
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement search = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Rate Our Services')]")));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);
//Selecting NPS Feedback
		WebElement NPSChbx2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'circle')])[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", NPSChbx2);
		js.executeScript("arguments[0].click()", NPSChbx2);
		Thread.sleep(5000);
		
//Adding 2nd msg and checking reset working or not			
		WebElement Addmsgbutton1 = driver.findElement(By.xpath("//span[contains(text(),'Add Messages')]"));
		js.executeScript("arguments[0].click()", Addmsgbutton1);
	    Thread.sleep(2000);
	    WebElement perso2 = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
		js.executeScript("arguments[0].click()", perso2);
		Thread.sleep(2000);
		WebElement screen2 = driver.findElement(By.xpath("//button[contains(text(),'Screen Name')]"));
		js.executeScript("arguments[0].click()", screen2);
		Thread.sleep(2000);
		WebElement msgfield1 = driver.findElement(By.xpath("(//textarea[contains(@class,'textarea-featured')])[2]"));
		js.executeScript("arguments[0].click()", msgfield1);
		Thread.sleep(2000);
		msgfield1.sendKeys("Hello, Checking Reset Functionality");
		Thread.sleep(4000);
		WebElement reset = driver.findElement(By.xpath("//span[contains(text(),' Reset')]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", reset);
		Thread.sleep(2000);
		WebElement perso3 = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
		js.executeScript("arguments[0].click()", perso3);
		Thread.sleep(2000);
		WebElement screen3 = driver.findElement(By.xpath("//button[contains(text(),'Screen Name')]"));
		js.executeScript("arguments[0].click()", screen3);
		Thread.sleep(2000);
		WebElement msgfield3 = driver.findElement(By.xpath("(//textarea[contains(@class,'textarea-featured')])[2]"));
		js.executeScript("arguments[0].click()", msgfield3);
		Thread.sleep(2000);
		msgfield3.sendKeys("Send 2nd message for NPS/Feedback");
		Thread.sleep(4000);
		WebElement perso4 = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
		js.executeScript("arguments[0].click()", perso4);
		Thread.sleep(2000);
		WebElement Link2 = driver.findElement(By.xpath("//button[contains(text(),'Link')]"));
		js.executeScript("arguments[0].click()", Link2);
		Thread.sleep(2000);
		WebElement Add2 = driver.findElement(By.xpath("(//span[contains(text(),'Add')])[5]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Add2);
		Thread.sleep(2000);
		WebElement WebElement = driver.findElement(By.xpath("(//p[contains(@class,'text__light--sm pr-')])[2]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", WebElement);
		Thread.sleep(4000);
//Selecting different layout
		WebElement Layoutlabel1 = driver.findElement(By.xpath("//span[contains(text(),'Layout Theme')]"));
		js.executeScript("arguments[0].click()", Layoutlabel1);
		Thread.sleep(2000);	
		WebElement SelLayout2 = driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-outer-circle')])[3]"));
		js.executeScript("arguments[0].click()", SelLayout2);
		Thread.sleep(2000);
		WebElement Select2 = driver.findElement(By.xpath("(//span[contains(text(),'Select')])"));
		js.executeScript("arguments[0].click()", Select2);
		Thread.sleep(2000);
		WebElement Previewlabel2 = driver.findElement(By.xpath("//mat-icon[contains(text(),'visibility')]"));
		js.executeScript("arguments[0].click()", Previewlabel2);
		Thread.sleep(5000);
		ArrayList<String>tabs2=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(5000);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement search1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Rate Our Services')]")));
		driver.close();
		driver.switchTo().window(tabs.get(0));
//Arrow Back
	    WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
		js.executeScript("arguments[0].click()", arrowBack);
		Thread.sleep(3000);

		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
	}
	}
			
	