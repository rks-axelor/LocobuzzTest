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

public class LocobuzzUGCAccountUIVeriProcess {

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

	

	public static void AgentQueueManagementUIVerificationprocess(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//  Adv. Response Management 
			WebElement Management=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),' Adv. Response Management ')])[1]"));
			if (Management.isDisplayed()) {
				System.out.println(" Adv. Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println(" Adv. Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", Management);
			Thread.sleep(3000);

//UGC Setting Label and Logo
			
			WebElement UGCLabel = driver.findElement(By.xpath("(//span[contains(text(),'UGC Settings')])[1]"));
			WebElement UGCLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/UGC_Settings.svg']"));			
			if (UGCLabel.isDisplayed() && UGCLogo.isDisplayed()) {
				System.out.println("UGC Setting Label and Logo Field is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("UGC Setting Label and Logo Field  is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", UGCLabel);
			Thread.sleep(3000);
			

//UGC Settings tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement UGCSettingtab = driver
					.findElement(By.xpath("(//span[contains(text(),'UGC Settings')])[2]"));
			if (pushpin.isDisplayed() && UGCSettingtab.isDisplayed()) {
				System.out.println("UGC Setting tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("UGC Setting tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//UGC Settings Heading and  information
			WebElement agentqueueHeading = driver.findElement(By.xpath("//p[contains(text(),'UGC Setting Status')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(text(),'UGC Setting Status')]//following::P[2]"));
			if (agentqueueHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("UGC Settings Heading and  information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("UGC Settings Heading and  information is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			Thread.sleep(5000);
			
//Feature Active Field
			WebElement Featureactivelabel = driver.findElement(By.xpath("//p[contains(text(),'Feature is active')]"));
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
			//js.executeScript("arguments[0].click()",Featurelogo );
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

//Approval Page Details
			 
			WebElement ApprovalHead = driver.findElement(By.xpath("//p[contains(text(),'Approval Page Details')]"));
			Thread.sleep(3000);
			WebElement Approvalinfo = driver.findElement(By.xpath("//p[contains(text(),'Approval Page Details')]//following::p[1]"));
			if (ApprovalHead.isDisplayed() && Approvalinfo.isDisplayed()) {
				System.out.println("Approval Page Details field is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Approval Page Details field is not displayed");
				componentsInformation.add(7, "Not Present");
			}	

//Upload  Brand Logo Deatils			
			WebElement uploadheading = driver.findElement(By.xpath("//p[contains(text(),'Upload Brand Logo')]"));
			Thread.sleep(3000);
			WebElement uploaddetails = driver.findElement(By.xpath("//p[contains(text(),'Upload Brand Logo')]//following::p[1]"));
			WebElement Cameralogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'photo_camera')]"));
			WebElement uploadmust = driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[1]"));
			if (uploadheading.isDisplayed() && uploaddetails.isDisplayed() && Cameralogo.isDisplayed()&& uploadmust.isDisplayed()) {
				System.out.println("Upload  Brand Logo Deatils field is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Upload  Brand Logo Deatils field is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			
//Page Title Textbox
			WebElement Pagetitle = driver.findElement(By.xpath("//mat-label[contains(text(),'Page Title')]"));
			Thread.sleep(3000);
			WebElement Pagetitlemust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[2]"));
			if (Pagetitle.isDisplayed() && Pagetitlemust.isDisplayed()) {
				System.out.println("Page Title Textbox is Present");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Page Title Textbox is not Present");
				componentsInformation.add(9, "Not Present");
			}	

//Description Textbox
			WebElement description = driver.findElement(By.xpath("//mat-label[contains(text(),'Description')]"));
			Thread.sleep(3000);
			WebElement describmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[3]"));
			if (description.isDisplayed() && describmust.isDisplayed()) {
				System.out.println("Description Textbox is Present");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Description Textbox is not Present");
				componentsInformation.add(10, "Not Present");
			}
			
//Footer Textbox
			WebElement footertxbx = driver.findElement(By.xpath("//mat-label[contains(text(),'Footer')]"));
			Thread.sleep(3000);
			if (footertxbx.isDisplayed()) {
				System.out.println("Footer Textbox is Present");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Footer Textbox is not Present");
				componentsInformation.add(11, "Not Present");
			}
			
//Terms and Condition Link Textbox
			WebElement termsTextbx = driver.findElement(By.xpath("//mat-label[contains(text(),'Terms and Conditions Link')]"));
			Thread.sleep(3000);
			WebElement Termslinkmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[4]"));
			if (termsTextbx.isDisplayed() && Termslinkmust.isDisplayed()) {
				System.out.println("Terms and Condition Link Textbox is Present");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Terms and Condition Link Textbox is not Present");
				componentsInformation.add(12, "Not Present");
			}
			
//Set Messages Field
			WebElement addmsgheading = driver.findElement(By.xpath("//p[contains(text(),'Set Messages')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addmsgheading);
			WebElement Addmsginfo = driver.findElement(By.xpath("//p[contains(text(),'Set Messages')]//following::p[1]"));
			WebElement Addmsgbutton = driver.findElement(By.xpath("//span[contains(text(),'Add Messages')]"));
			WebElement Addmsglogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]"));
			WebElement setmsgmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[5]"));
			Thread.sleep(3000);
			
			if (addmsgheading.isDisplayed() && Addmsginfo.isDisplayed() && Addmsgbutton.isDisplayed() 
					&& setmsgmust.isDisplayed()&&Addmsglogo.isDisplayed()) {
				System.out.println("Set Messages Field is Present");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Set Messages Field is not Present");
				componentsInformation.add(13, "Not Present");
			}

//User Approval Page Preview
			WebElement userapprHeading = driver.findElement(By.xpath("//div[contains(text(),'User approval page preview')]"));
			WebElement Previewlabel = driver.findElement(By.xpath("//span[contains(text(),'Preview in browser')]"));
			WebElement Previewlogo = driver.findElement(By.xpath("//span[contains(text(),'Twitter')]"));
			Thread.sleep(3000);
			
			if (userapprHeading.isDisplayed() && Previewlabel.isDisplayed() && Previewlogo.isDisplayed()) {
				System.out.println("User Approval Page Preview Field is Present");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("User Approval Page Preview Field is not Present");
				componentsInformation.add(14, "Not Present");
			}
//Post Preview Field
			WebElement postpreviewHeading = driver.findElement(By.xpath("//p[contains(text(),'Post Preview')]"));
			WebElement Twitterlogo = driver.findElement(By.xpath("//img[@src='assets/images/channel-logos/twitter.svg']"));
			WebElement Twitterlabel = driver.findElement(By.xpath("//mat-label[contains(text(),'Description')]"));
			Thread.sleep(3000);
			
			if (postpreviewHeading.isDisplayed() && Twitterlogo.isDisplayed() && Twitterlabel.isDisplayed()) {
				System.out.println("Post Preview Field is Present");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Post Preview Field is not Present");
				componentsInformation.add(15, "Not Present");
			}
			
            WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			componentsInformation.add(16, CommonFunctions.getDataTime());
			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "UGCSettingUIComponents");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
}
}

