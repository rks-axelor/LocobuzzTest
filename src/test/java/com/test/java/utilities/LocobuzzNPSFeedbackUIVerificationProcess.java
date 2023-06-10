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

public class LocobuzzNPSFeedbackUIVerificationProcess {

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

	

	public static void NPSFeedbackUIVerification(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

// Premium Features
			WebElement premium=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Premium Features')])[1]"));
			if (premium.isDisplayed()) {
				System.out.println("Premium Features is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Premium Features is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", premium);
			Thread.sleep(3000);

//NPS/Feedback Label and Logo
			
			WebElement NPSLabel = driver.findElement(By.xpath("(//span[contains(text(),'Feedback / NPS')])[1]"));
			WebElement NPSLogo = driver.findElement(By.xpath("//img[@src='assets/account/menu/Feedback_NPS.svg']"));			
			if (NPSLabel.isDisplayed() && NPSLogo.isDisplayed()) {
				System.out.println("NPS/Feedback Label and Logo Field is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("NPS/Feedback Label and Logo Field  is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", NPSLabel);
			Thread.sleep(3000);
			

//NPS/Feedback tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement NPSFeedbacktab = driver.findElement(By.xpath("(//span[contains(text(),'Feedback / NPS')])[2]"));
			if (pushpin.isDisplayed() && NPSFeedbacktab.isDisplayed()) {
				System.out.println("NPS/Feedback tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("NPS/Feedback tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//NPS/Feedback Heading and  information
			WebElement NPSFDBHeading = driver.findElement(By.xpath("(//p[contains(text(),'Feedback/NPS')])[1]"));
			WebElement information = driver.findElement(By.xpath("(//p[contains(text(),'Feedback/NPS')])//following::p[2]"));
			if (NPSFDBHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("NPS/Feedback Heading and  information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("NPS/Feedback Heading and  information is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			Thread.sleep(5000);
			
//Feature Active Field
			WebElement Featureactivelabel = driver.findElement(By.xpath("//p[contains(text(),'Feature is inactive')]"));
			WebElement Featurelogo = driver.findElement(By.xpath("//label[contains(@class,'rounded-toggle-switch-label')]"));
			
			if (Featureactivelabel.isDisplayed() && Featurelogo.isDisplayed()) {
				System.out.println("Feature Active Field is displayed");
				Thread.sleep(3000);
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Feature Active Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			js.executeScript("arguments[0].click()",Featurelogo );
			Thread.sleep(5000);
			System.out.println("Feature Active Field is Disabled Successfully");
			js.executeScript("arguments[0].click()",Featurelogo );
			Thread.sleep(5000);
			System.out.println("Feature Active Field is  Enabled Successfully");
			
//Select Brand Field
			WebElement selbrandlabel = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
			WebElement selbrand = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
			if (selbrandlabel.isDisplayed()&& selbrand.isDisplayed()) {
				System.out.println("Select Brand Field is displayed");
				componentsInformation.add(5, "Present");
			}else {
				System.out.println("Select Brand Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}
				js.executeScript("arguments[0].click()",selbrand );
				Thread.sleep(5000);
				System.out.println("All Brands List Is displayed");


//Brand Selection textbox 
			WebElement SelbyBrName = driver.findElement(By.xpath("(//input[@data-placeholder='Search brand name'])"));
			Thread.sleep(3000);
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (SelbyBrName.isDisplayed() && symbol.isDisplayed()) {
				System.out.println("Brand Selection textbox   field is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Brand Selection textbox field is not displayed");
				componentsInformation.add(6, "Not Present");
			}
			WebElement Komalbrand = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
			Thread.sleep(3000);
            js.executeScript("arguments[0].click()",Komalbrand );
			Thread.sleep(5000);
			System.out.println("Komal Brand Is displayed and Selected for UGC Settings");

//Feedback Rating Details
			 
			WebElement Feedbackpreviewheading = driver.findElement(By.xpath("//div[contains(text(),'Feedback Rating form Preview')]"));
			Thread.sleep(3000);
			if (Feedbackpreviewheading.isDisplayed()) {
				System.out.println("Feedback Rating Details field is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Feedback Rating Details field is not displayed");
				componentsInformation.add(7, "Not Present");
			}	

//Upload  Brand Logo Deatils			
			WebElement BrlogoHeading = driver.findElement(By.xpath("(//p[contains(text(),'Brand Logo')])[1]"));
			WebElement uploadheading = driver.findElement(By.xpath("//p[contains(text(),'Upload Brand Logo')]"));
			WebElement uploaddetails = driver.findElement(By.xpath("//p[contains(text(),'Upload Brand Logo')]//following::p[1]"));
			WebElement Cameralogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'photo_camera')]"));
			WebElement uploadmust = driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[1]"));
			if (BrlogoHeading.isDisplayed() && uploadheading.isDisplayed() && uploaddetails.isDisplayed() && 
					Cameralogo.isDisplayed()&& uploadmust.isDisplayed()) {
				System.out.println("Upload  Brand Logo Deatils field is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Upload  Brand Logo Deatils field is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			
//Select Feedback Type Field Details
			WebElement selfeedback = driver.findElement(By.xpath("(//p[contains(text(),'Select Feedback Type')])[1]"));
			WebElement selfeedbackinfo = driver.findElement(By.xpath("(//p[contains(text(),'Select Feedback Type')])//following::p[1]"));
			if (selfeedback.isDisplayed() && selfeedbackinfo.isDisplayed()) {
				System.out.println("Select Feedback Type Field Details is Present");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Select Feedback Type Field Details is not Present");
				componentsInformation.add(9, "Not Present");
			}
			Thread.sleep(3000);

//Feedback Rating
			WebElement FDBTXBX = driver.findElement(By.xpath("(//p[contains(text(),'Feedback Rating')])"));
			WebElement FDBINFO = driver.findElement(By.xpath("(//p[contains(text(),'Feedback Rating')])//following::p[1]"));
			WebElement FDBCHBX = driver.findElement(By.xpath("(//mat-icon[contains(text(),'check_circle')])"));
			if (FDBTXBX.isDisplayed() && FDBINFO.isDisplayed() && FDBCHBX.isDisplayed()) {
				System.out.println("Feedback Rating is Present");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Feedback Rating is not Present");
				componentsInformation.add(10, "Not Present");
			}
			
//NPS Rating
			WebElement NPStxbx = driver.findElement(By.xpath("(//p[contains(text(),'NPS rating')])"));
			WebElement NPSInfo = driver.findElement(By.xpath("(//p[contains(text(),'NPS rating')])//following::p[1]"));
			WebElement NPSChbx = driver.findElement(By.xpath("(//mat-icon[contains(text(),'circle')])[2]"));
			if (NPStxbx.isDisplayed() && NPSInfo.isDisplayed() && NPSChbx.isDisplayed()) {
				System.out.println("NPS Rating Field is Present");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("NPS Rating Field is not Present");
				componentsInformation.add(11, "Not Present");
			}
			
//How would like to send Feedback form Field
			WebElement Heading = driver.findElement(By.xpath("(//p[contains(text(),'How would like to send Feedback form')])"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Heading);
			WebElement manually = driver.findElement(By.xpath("(//label[contains(@class,'mat-radio-label')])[1]"));
			WebElement manuallyinfo = driver.findElement(By.xpath("(//p[contains(text(),'How would like to send Feedback form')])//following::p[1]"));
			WebElement Automatically = driver.findElement(By.xpath("(//label[contains(@class,'mat-radio-label')])[2]"));
			WebElement Autoinfo = driver.findElement(By.xpath("(//p[contains(text(),'How would like to send Feedback form')])//following::p[2]"));
			Thread.sleep(3000);
			if (Heading.isDisplayed() && manually.isDisplayed() && manuallyinfo.isDisplayed() && Automatically.isDisplayed() && Autoinfo.isDisplayed() ) {
				System.out.println("Terms and Condition Link Textbox is Present");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Terms and Condition Link Textbox is not Present");
				componentsInformation.add(12, "Not Present");
			}
			
//Categories Field
			WebElement Categoryheading = driver.findElement(By.xpath("//p[contains(text(),'Categories')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Categoryheading);
			WebElement Addcatinfo = driver.findElement(By.xpath("//p[contains(text(),'Categories')]//following::p[1]"));
			WebElement Addcategbutton = driver.findElement(By.xpath("//span[contains(text(),'Add Categories')]"));
			WebElement Addcatlogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]"));
			WebElement addcatmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[2]"));
			Thread.sleep(3000);
			
			if (Categoryheading.isDisplayed() && Addcatinfo.isDisplayed() && Addcategbutton.isDisplayed() 
					&& addcatmust.isDisplayed()&&Addcatlogo.isDisplayed()) {
				System.out.println("Categories Field is Present");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Categories Field is not Present");
				componentsInformation.add(13, "Not Present");
			}
			
//Set Messages Field
			WebElement addmsgheading = driver.findElement(By.xpath("//p[contains(text(),'Set Messages')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addmsgheading);
			WebElement Addmsginfo = driver.findElement(By.xpath("//p[contains(text(),'Set Messages')]//following::p[1]"));
			WebElement Addmsgbutton = driver.findElement(By.xpath("//span[contains(text(),'Add Messages')]"));
			WebElement Addmsglogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]"));
			WebElement setmsgmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[3]"));
			Thread.sleep(3000);
			
			if (addmsgheading.isDisplayed() && Addmsginfo.isDisplayed() && Addmsgbutton.isDisplayed() 
					&& setmsgmust.isDisplayed()&&Addmsglogo.isDisplayed()) {
				System.out.println("Set Messages Field is Present");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Set Messages Field is not Present");
				componentsInformation.add(14, "Not Present");
			}

//Layout and Preview in Browser Field
			WebElement Layoutlabel = driver.findElement(By.xpath("//span[contains(text(),'Layout Theme')]"));
			WebElement layoutlogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'view_quilt')]"));
			WebElement Previewlabel = driver.findElement(By.xpath("//mat-icon[contains(text(),'visibility')]"));
			WebElement Previewlogo = driver.findElement(By.xpath("//span[contains(text(),'Preview in browser')]"));
			Thread.sleep(3000);
			
			if (Layoutlabel.isDisplayed() && layoutlogo.isDisplayed() && Previewlabel.isDisplayed()  && Previewlogo.isDisplayed()) {
				System.out.println("Layout and Preview in Browser Field is Present");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Layout and Preview in Browser Field is not Present");
				componentsInformation.add(15, "Not Present");
			}

            WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			componentsInformation.add(16, CommonFunctions.getDataTime());
			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "NPSFeedbackUIVerification");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
}
}

