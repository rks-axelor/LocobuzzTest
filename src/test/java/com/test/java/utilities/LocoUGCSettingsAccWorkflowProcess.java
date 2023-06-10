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

public class LocoUGCSettingsAccWorkflowProcess {

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
			if (Management.isDisplayed())
				System.out.println(" Adv. Response Management is displayed");
			 else 
				System.out.println(" Adv. Response Management is not displayed");
			js.executeScript("arguments[0].click()", Management);
			Thread.sleep(3000);

//UGC Setting Label and Logo
			
			WebElement UGCLabel = driver.findElement(By.xpath("(//span[contains(text(),'UGC Settings')])[1]"));
			WebElement UGCLogo = driver.findElement(By.xpath("//img[@src='assets/account/menu/UGC_Settings.svg']"));			
			if (UGCLabel.isDisplayed() && UGCLogo.isDisplayed()) 
				System.out.println("UGC Setting Label and Logo Field is displayed");
			else 
			    System.out.println("UGC Setting Label and Logo Field  is not displayed");
			js.executeScript("arguments[0].click()", UGCLabel);
			Thread.sleep(3000);
			

//UGC Settings tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement UGCSettingtab = driver.findElement(By.xpath("(//span[contains(text(),'UGC Settings')])[2]"));
			System.out.println("UGC Setting tab is displayed");
			Thread.sleep(3000);	

//UGC Settings Heading and  information
			WebElement agentqueueHeading = driver.findElement(By.xpath("//p[contains(text(),'UGC Setting Status')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(text(),'UGC Setting Status')]//following::P[2]"));
		    System.out.println("UGC Settings Heading and  information is displayed");
			Thread.sleep(5000);
			
//Feature Active Field
			WebElement Featureactivelabel = driver.findElement(By.xpath("//p[contains(text(),'Feature is inactive')]"));
			WebElement Featurelogo = driver.findElement(By.xpath("//label[contains(@class,'rounded-toggle-switch-label')]"));
			if (Featureactivelabel.isDisplayed() && Featurelogo.isDisplayed()) 
				System.out.println("Feature Active Field is displayed");
		    else 
				System.out.println("Feature Active Field is not displayed");
			js.executeScript("arguments[0].click()",Featurelogo );
			Thread.sleep(5000);
			System.out.println("Feature Active Field is Disabled Successfully");
			js.executeScript("arguments[0].click()",Featurelogo );
			Thread.sleep(5000);
			System.out.println("Feature Active Field is  Enabled Successfully");
			
//Select Brand Field
			WebElement selbrandlabel = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
			WebElement selbrand = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
			if (selbrandlabel.isDisplayed()&& selbrand.isDisplayed()) 
			System.out.println("Select Brand Field is displayed");
			js.executeScript("arguments[0].click()",selbrand );
			Thread.sleep(5000);
			System.out.println("All Brands List Is displayed");


//Brand Selection textbox 
			WebElement SelbyBrName = driver.findElement(By.xpath("(//input[@data-placeholder='Search brand name'])"));
			Thread.sleep(1000);
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (SelbyBrName.isDisplayed() && symbol.isDisplayed()) 
			System.out.println("Brand Selection textbox   field is displayed");
			Thread.sleep(1000);	
			WebElement Komalbrand = driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
			Thread.sleep(1000);
            js.executeScript("arguments[0].click()",Komalbrand );
			Thread.sleep(3000);
			System.out.println("Komal Brand Is displayed and Selected for UGC Settings");
			
//Feature Active Field
			WebElement Featureactivelabel1 = driver.findElement(By.xpath("//p[contains(text(),'Feature is inactive')]"));
			WebElement Featurelogo1 = driver.findElement(By.xpath("//label[contains(@class,'rounded-toggle-switch-label')]"));
			if (Featureactivelabel1.isDisplayed() && Featurelogo1.isDisplayed()) 
				System.out.println("Feature Active Field is displayed");
		    else 
				System.out.println("Feature Active Field is not displayed");
			js.executeScript("arguments[0].click()",Featurelogo );
			Thread.sleep(5000);
			System.out.println("Feature Active Field is Enabled Successfully");
			Thread.sleep(5000);

//Approval Page Details
			 
			WebElement ApprovalHead = driver.findElement(By.xpath("//p[contains(text(),'Approval Page Details')]"));
			Thread.sleep(3000);
			WebElement Approvalinfo = driver.findElement(By.xpath("//p[contains(text(),'Approval Page Details')]//following::p[1]"));
			if (ApprovalHead.isDisplayed() && Approvalinfo.isDisplayed()) 
			System.out.println("Approval Page Details field is displayed");
			Thread.sleep(5000);

//Upload  Brand Logo Deatils			
			WebElement uploadheading = driver.findElement(By.xpath("//p[contains(text(),'Upload Brand Logo')]"));
			Thread.sleep(3000);
			WebElement uploaddetails = driver.findElement(By.xpath("//p[contains(text(),'Upload Brand Logo')]//following::p[1]"));
			WebElement Cameralogo = driver.findElement(By.xpath("(//mat-icon[contains(text(),'photo_camera')])[1]"));
			WebElement uploadmust = driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[1]"));
			if (uploadheading.isDisplayed() && uploaddetails.isDisplayed() && Cameralogo.isDisplayed()&& uploadmust.isDisplayed()) 
			System.out.println("Upload  Brand Logo Deatils field is displayed");
			Thread.sleep(5000);
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
			
//Page Title Textbox
			WebElement Pagetitle = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			Thread.sleep(3000);
			WebElement Pagetitlemust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[2]"));
			if (Pagetitle.isDisplayed() && Pagetitlemust.isDisplayed()) 
			System.out.println("Page Title Textbox is Present");
			Thread.sleep(1000);
			Pagetitle.sendKeys("Locobuzz UGC Settings DemoPage");
			Thread.sleep(5000);
//Description Textbox
			WebElement description = driver.findElement(By.xpath("//mat-label[contains(text(),'Description')]"));
			Thread.sleep(3000);
			WebElement describmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[3]"));
			if (description.isDisplayed() && describmust.isDisplayed()) 
			System.out.println("Description Textbox is Present");
			Thread.sleep(5000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(description, "Komal Brand Wants to Reuse Your brand post(Images and Videos) so approve request").build();
	        action.perform();
//Footer Textbox
			WebElement footertxbx = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", footertxbx);
			Thread.sleep(3000);
			if (footertxbx.isDisplayed()) 
			System.out.println("Footer Textbox is Present");
			footertxbx.sendKeys("UGC Settings Approver");
			Thread.sleep(5000);
			
//Terms and Condition Link Textbox
			WebElement termsTextbx = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			Thread.sleep(3000);
			WebElement Termslinkmust = driver.findElement(By.xpath("(//span[contains(text(),'*')])[4]"));
			if (termsTextbx.isDisplayed() && Termslinkmust.isDisplayed()) 
			System.out.println("Terms and Condition Link Textbox is Present");
			termsTextbx.sendKeys("https://app.hrone.cloud/app");
			Thread.sleep(5000);
			
//Set Messages Field
			WebElement addmsgheading = driver.findElement(By.xpath("//p[contains(text(),'Set Messages')]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addmsgheading);
		    WebElement Addmsgbutton = driver.findElement(By.xpath("//span[contains(text(),'Add Messages')]"));
			WebElement Addmsglogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]"));
		    js.executeScript("arguments[0].click()", Addmsgbutton);
			Thread.sleep(2000);	
			WebElement perso1 = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", perso1);
			Thread.sleep(2000);
			WebElement screen1 = driver.findElement(By.xpath("//button[contains(text(),'Screen Name')]"));
			js.executeScript("arguments[0].click()", screen1);
			Thread.sleep(2000);
			WebElement msgfield = driver.findElement(By.xpath("//textarea[contains(@class,'textarea-featured__input')]"));
			js.executeScript("arguments[0].click()", msgfield);
			Thread.sleep(2000);
			msgfield.sendKeys("Hello , How are u?");
			WebElement Add1 = driver.findElement(By.xpath("(//span[contains(text(),'Add')])[4]"));
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Add1);
			Thread.sleep(2000);
			
//Adding 2nd msg and checking reset working or not			
			
			js.executeScript("arguments[0].click()", Addmsgbutton);
		    Thread.sleep(2000);
		    WebElement perso2 = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", perso2);
			Thread.sleep(2000);
			WebElement screen2 = driver.findElement(By.xpath("//button[contains(text(),'Screen Name')]"));
			js.executeScript("arguments[0].click()", screen2);
			Thread.sleep(2000);
			WebElement msgfield1 = driver.findElement(By.xpath("//textarea[contains(@class,'textarea-featured__input')]"));
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
			WebElement msgfield3 = driver.findElement(By.xpath("//textarea[contains(@class,'textarea-featured__input')]"));
			js.executeScript("arguments[0].click()", msgfield3);
			Thread.sleep(2000);
			msgfield3.sendKeys("Send 2nd message for UGC Settings");
			Thread.sleep(4000);
			WebElement Add2 = driver.findElement(By.xpath("(//span[contains(text(),'Add')])[4]"));
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Add2);
			Thread.sleep(2000);
//User Approval Page Preview
			WebElement userapprHeading = driver.findElement(By.xpath("//div[contains(text(),'User approval page preview')]"));
			WebElement Previewlabel = driver.findElement(By.xpath("//span[contains(text(),'Preview in browser')]"));
			WebElement Previewlogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'visibility')]"));
			Thread.sleep(3000);
			if (userapprHeading.isDisplayed() && Previewlabel.isDisplayed() && Previewlogo.isDisplayed()) 
			System.out.println("User Approval Page Preview Field is Present");
			Thread.sleep(5000);
//Post Preview Field
			WebElement postpreviewHeading = driver.findElement(By.xpath("//p[contains(text(),'Post Preview')]"));
			WebElement Twitterlogo = driver.findElement(By.xpath("//img[@src='assets/images/channel-logos/twitter.svg']"));
			WebElement Twitterlabel = driver.findElement(By.xpath("//span[contains(text(),'Twitter')]"));
			Thread.sleep(3000);
			if (postpreviewHeading.isDisplayed() && Twitterlogo.isDisplayed() && Twitterlabel.isDisplayed()) 
			System.out.println("Post Preview Field is Present");
			Thread.sleep(5000);
//clicking on Preview in Browser
			WebElement Previewlogo1 = driver.findElement(By.xpath("//span[contains(text(),'Preview in browser')]"));
			js.executeScript("arguments[0].click()", Previewlogo1);
			Thread.sleep(5000);
			ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(5000);
//Performing operation on 2nd Tab
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement toterms = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//p[contains(text(),'I agree')]//following::a[1]")));
			WebElement toterms2 = driver.findElement(By.xpath("//p[contains(text(),'I agree')]//following::a[1]"));
			toterms2.click();
			Thread.sleep(5000);
			ArrayList<String>tabs2=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(2));
			WebElement hrone = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Welcome!')]")));
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(tabs2.get(1));
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(tabs2.get(0));
			Thread.sleep(5000);
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
}
}


