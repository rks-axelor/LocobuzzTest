package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSignatureWorkProcess {

	
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

			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}	
		
		
	public static void VerifyingUIComponentsProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		
// response management
			WebElement ResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Response Management')][1]"));
			if (ResponseManagement.isDisplayed()) {
				System.out.println(" Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Adv Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", ResponseManagement);
			Thread.sleep(3000);

//Agent Signature
			//WebElement AgentSignatureLogo = driver
				//	.findElement(By.xpath("//img[@src='assets/account/menu/Agent_Signature_Active.svg']"));
			WebElement AgentSignature = driver.findElement(By.xpath("(//span[contains(text(),'Agent Signature')])"));
			if (AgentSignature.isDisplayed()) {
				System.out.println("Agent Signature is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Agent Signature is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", AgentSignature);
			Thread.sleep(3000);
			

//Agent Signature tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement agentsignatureTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Agent Signature')])[2]"));
			if (pushpin.isDisplayed() && agentsignatureTab.isDisplayed()) {
				System.out.println("agentsignatureTab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("agentsignatureTab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//Agent Signature information
			WebElement agentsignatureHeading = driver.findElement(By.xpath("//p[contains(text(),'Agent Signature ')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(text(),'Configure settings of reply signatures for your brands.')]"));
			if (agentsignatureHeading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Agent Signature Information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Agent Signature Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
//select brand
			WebElement selectbrand = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			
			if (selectbrand.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Select brand field is displayed");
				Thread.sleep(3000);
				js.executeScript("arguments[0].click()",arrow );
				WebElement AJIOBrand=driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])"));
				js.executeScript("arguments[0].click()",AJIOBrand );
				Thread.sleep(5000);
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Select brand field is not displayed");
				componentsInformation.add(4, "Not Present");
			}

			
//Feature field
			WebElement featureactive = driver
					.findElement(By.xpath("//p[contains(text(),'Feature is Active')]"));
			WebElement featureactiveSymbol = driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])"));
			if (featureactive.isDisplayed() && featureactiveSymbol.isDisplayed()) {
				System.out.println("Feature Field is displayed");
				componentsInformation.add(5, "Present");
				js.executeScript("arguments[0].click()",featureactiveSymbol );
				Thread.sleep(3000);
				js.executeScript("arguments[0].click()",featureactiveSymbol );
				Thread.sleep(3000);
				System.out.println("All UI Components Enabled");
			} else {
				System.out.println("FeatureField is not displayed");
				componentsInformation.add(5, "Not Present");
				System.out.println("All UI Components disabled");
			}





//Pending users signature field
			WebElement Pendinguserheading = driver
					.findElement(By.xpath("//p[contains(text(),'Pending user(s) signature')]"));
			WebElement Addsignaturebutton = driver
					.findElement(By.xpath("//span[contains(text(),'Add Signature(s)')]"));
			if (Pendinguserheading.isDisplayed() && Addsignaturebutton.isDisplayed()) {
				System.out.println("Pending users signature fieldis displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Pending users signature field is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//Select channel where signature to be displayed field
			WebElement addKeywordField = driver
					.findElement(By.xpath("//p[contains(text(),'Pending user(s) signature')]"));
			if (addKeywordField.isDisplayed()) {
				System.out.println("Select channel where signature to be displayed field");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Select channel where signature to be displayed field");
				componentsInformation.add(7, "Not Present");
			}
			
//Search channels field
			WebElement searchchannels = driver
					.findElement(By.xpath("//input[@placeholder='Search channels']"));
			js.executeScript("arguments[0].click()",searchchannels );
			Thread.sleep(3000);
			WebElement AddChannel = driver.findElement(By.xpath("//span[contains(text(),'WhatsApp')]"));
			js.executeScript("arguments[0].click()",AddChannel);
			
			if (searchchannels.isDisplayed()) {
				System.out.println("Search channels field   is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Search channels field is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			
//DM Checkbox
			WebElement DMCheckbox = driver
					.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
			if (DMCheckbox.isDisplayed()) {
				System.out.println("DM Checkboxis displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("DM Checkboxnot displayed");
				componentsInformation.add(9, "Not Present");
			}
			
//Saperator Symbol
			WebElement Saperatorsymbol = driver
					.findElement(By.xpath("(//mat-select[@aria-required='false'])[2]"));
			if (Saperatorsymbol.isDisplayed()) {
				System.out.println(" Saperatorsymbol displayed");
				js.executeScript("arguments[0].click()",Saperatorsymbol );
				Thread.sleep(3000);
				WebElement Symboldropdown = driver.findElement(By.xpath("(//span[contains(text(),'*')])[4]"));
				Thread.sleep(3000);
				js.executeScript("arguments[0].click()",Symboldropdown );
				Thread.sleep(3000);
				componentsInformation.add(10, "Present");
			} else {
				System.out.println(" Saperatorsymbol displayed");
				componentsInformation.add(10, "Not Present");
			}
			
//Append New Line before Signature
			WebElement Appendcheckbox = driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
			WebElement Appendinfo = driver.findElement(By.xpath("//span[contains(text(),'Append new line before signature')]"));
			if (Appendcheckbox.isDisplayed() && Appendinfo.isDisplayed()) {
				System.out.println("Append New Line before Signature is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Append New Line before Signature is not displayed");
				componentsInformation.add(11, "Not Present");
			}
			
		//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

//Signature Preview field
			WebElement SignaturePreviewField = driver
					.findElement(By.xpath("//div[@class='agentsign__smchannel--sign bg__grey--lighter']"));
			if (SignaturePreviewField.isDisplayed()) {
				System.out.println("Signature preview field is displayed");
				
		   WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
		   js.executeScript("arguments[0].click()",edit);
		   Thread.sleep(3000);
		   
		  js.executeScript("arguments[0].scrollIntoView();",edit);
		   WebElement selectuserdropdown = driver.findElement(By.xpath("(//mat-select[@aria-required='false'])[4]"));
		   js.executeScript("arguments[0].click()",selectuserdropdown);
		   Thread.sleep(3000);
		   WebElement selectuser = driver.findElement(By.xpath("//span[contains(text(),'Komal suplive(komalsup)')]"));
		   js.executeScript("arguments[0].click()",selectuser);
		   Thread.sleep(3000);
		   WebElement ApplyButton = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
		   js.executeScript("arguments[0].click()",ApplyButton);
		   Thread.sleep(3000);
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Signature preview field is not displayed");
				componentsInformation.add(12, "Not Present");
			}
			
			//Save settings
			
			 WebElement save = driver.findElement(By.xpath("//span[contains(text(),' Save Settings ')]"));
			  js.executeScript("arguments[0].click()",save);
			  Thread.sleep(3000);
			  
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			componentsInformation.add(13, CommonFunctions.getDataTime());
			
		
	
	
				
			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "AgentSignatureUIcomponents");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
}
}



