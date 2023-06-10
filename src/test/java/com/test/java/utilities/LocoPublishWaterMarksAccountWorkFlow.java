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


public class LocoPublishWaterMarksAccountWorkFlow {
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
	
public static void verifyingPublishApproverUIComponents(WebDriver driver) throws Exception {
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
			
//Publish Setting
			WebElement PublishSettinglogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Publish_Settings.svg']"));
			WebElement PublishSetting=driver.findElement(By.xpath("//span[contains(text(),'Publish Setting')]"));
			if(PublishSettinglogo.isDisplayed()&&PublishSetting.isDisplayed()) {
				System.out.println("Publish Setting is displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Publish Setting is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", PublishSetting);
			Thread.sleep(3000);
			
//Publish Settings WaterMark tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement WaterMarksTab=driver.findElement(By.xpath("(//span[contains(text(),'WaterMarks')])[1]"));
			if(pushpin.isDisplayed() && WaterMarksTab.isDisplayed()) {
				System.out.println("Publish Settings WaterMark tab Label is displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Publish Settings WaterMark tab Label is not displayed");
				componentsInformation.add(2, "Not Present");
			}
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", WaterMarksTab);
			Thread.sleep(3000);
//Publish Settings WaterMarks Heading and its Information	

			WebElement WaterMarksheading=driver.findElement(By.xpath("(//p[contains(text(),'Watermarks ')])"));
			WebElement infromation=driver.findElement(By.xpath("(//p[contains(text(),'Watermarks ')])//following::p[1]"));
			if(WaterMarksheading.isDisplayed() && infromation.isDisplayed()) {
				System.out.println("Publish Settings WaterMarks Heading and its Information is displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Publish Settings WaterMarks Heading and its Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			Thread.sleep(2000);
			
//search field
			WebElement searchField=driver.findElement(By.xpath("(//input[@placeholder='Search by Brand Name'])[2]"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			if(searchField.isDisplayed()&&symbol.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			Thread.sleep(2000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(searchField, "Auto Demo").sendKeys(Keys.ENTER).build();
	        action.perform();
	        Thread.sleep(5000);
			
			
//Upload WaterMark Field
			WebElement WaterMarksUpload=driver.findElement(By.xpath("(//span[contains(text(),' Upload Watermark ')])"));
			if(WaterMarksUpload.isDisplayed()) {
				System.out.println("Upload Watermark Field is displayed");
				componentsInformation.add(5, "Present");
			}
			
			else {
				System.out.println("Upload Watermark Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", WaterMarksUpload);
			Thread.sleep(3000);

//Upload WaterMark Field UI Components			
			WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Upload Watermark')]"));
		    WebElement Close=driver.findElement(By.xpath("//h3[contains(text(),'Upload Watermark')]"));
			if(heading.isDisplayed() && Close.isDisplayed()) {
			System.out.println("Upload WaterMark Field UI Components Window Heading is displayed");
			componentsInformation.add(6, "Present");
			}
			else {
			System.out.println("Upload WaterMark Field UI Components Window Heading is not  displayed");
			componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", heading);
			Thread.sleep(3000);
			
//Select Brand Heading and TextBox
			WebElement BrandHeading=driver.findElement(By.xpath("//p[contains(text(),\"For which brand you want to upload watermark's\")]"));
			WebElement Textbox=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[6]"));
			if(BrandHeading.isDisplayed() &&  Textbox.isDisplayed()){
				System.out.println("Select Brand Heading and Textbox is displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Select Brand Heading and Textbox is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			Thread.sleep(2000);
			
//Select Brand Field
			WebElement SelectBrandField=driver.findElement(By.xpath("//input[@placeholder='Search brands']"));
			if(SelectBrandField.isDisplayed()) {
				System.out.println("Select Brand Field is displayed");
				componentsInformation.add(8, "Present");
			}
			else {
				System.out.println("Select Brand Field is not displayed");
				componentsInformation.add(8, "Not Present");
			}
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", SelectBrandField);
			Thread.sleep(5000);
			WebElement AutoDemo=driver.findElement(By.xpath("//span[contains(text(),'Auto Demo')]"));
			js.executeScript("arguments[0].click()", AutoDemo);
			Thread.sleep(5000);
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			Thread.sleep(2000);
			
//Select Image(Drag and Drop Operation)
			WebElement Uploadicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'cloud_upload')])"));
			WebElement uploadinfo=driver.findElement(By.xpath("(//div[contains(text(),' Drag & drop or click to upload files/media')])"));
			WebElement uploadimagenote=
			driver.findElement(By.xpath("(//p[contains(text(),'You can upload JPEG, JPG, PNG files upto 5 Mb of file size.')])"));
			WebElement uploadimagemust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])"));
			if(Uploadicon.isDisplayed() &&  uploadinfo.isDisplayed() && uploadimagenote.isDisplayed() && uploadimagemust.isDisplayed()){
			System.out.println("Select Image(Drag and Drop Operation) is displayed");
			componentsInformation.add(9, "Present");
			}
			else {
			System.out.println("Select Image(Drag and Drop Operation) is not displayed");
			componentsInformation.add(9, "Not Present");
			}
			WebElement Uploadicon1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'cloud_upload')])"));
			Uploadicon1.click();
			Thread.sleep(4000);	
			Robot rb = new Robot();
			rb.delay(2000);
			StringSelection ss = new StringSelection("C:\\Users\\admin\\Downloads\\locologo.png");
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

//Save Button
			WebElement Save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			if(Save.isDisplayed()) {
				System.out.println("Save Button is Present");
				componentsInformation.add(10, "Present");
			}
			else {
				System.out.println("Save Button is not Present");
				componentsInformation.add(10, "Not Present");
			}
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", Save);
			Thread.sleep(4000);

//Download and Delete Operation
		    WebElement Download=driver.findElement(By.xpath("(//mat-icon[contains(text(),'download')])"));
		    js.executeScript("arguments[0].click()", Download);
		    Thread.sleep(2000);	
//Moving on New Tab	
		    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));	
		    Actions a = new Actions(driver);
		    a.moveToElement(driver.findElement(By.xpath("//img[@style='display: block;-webkit-user-select: none;margin: auto;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;']"))).
		    contextClick().
		    build().perform();
		    Thread.sleep(10000);	
		    driver.switchTo().window(tabs.get(0));
		    Thread.sleep(5000);	
//Delete Operation		    
		    WebElement Deleteimage=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])"));
		    js.executeScript("arguments[0].click()", Deleteimage);
		    Thread.sleep(2000);	
		    WebElement Confirmdelete=driver.findElement(By.xpath("(//span[contains(text(),'Yes')])"));
		    js.executeScript("arguments[0].click()", Confirmdelete);
		    Thread.sleep(2000);
		    
//Search 		    
		    WebElement Search=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
		    js.executeScript("arguments[0].click()", Search);
		    Thread.sleep(2000);	
		    
		    WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			componentsInformation.add(11, CommonFunctions.getDataTime());
		    CommonFunctions.writeUIComponentsToExcel(componentsInformation, "PublishWatermarksVerification");
		       

		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	

}



