package com.test.java.utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzPublishPersonalizationWorkflow {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
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
	
	public static void publishPersonalizationWorkflow(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//Listening Settings
			WebElement ListeningSettings = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if (ListeningSettings.isDisplayed()) {
				System.out.println("Listening Settings is displayed");
			} else {
				System.out.println("Listening Settings is not displayed");
			}
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);
			
//publish settings
			WebElement publishSettingsLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Publish_Settings.svg']"));
			WebElement publishSettingsLabel=driver.findElement(By.xpath("//span[contains(text(),'Publish Setting')]"));
			if(publishSettingsLogo.isDisplayed()&&publishSettingsLabel.isDisplayed()) {
				System.out.println("Publish settings logo and label are displayed");
			}
			else {
				System.out.println("Publish settings logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", publishSettingsLabel);
			Thread.sleep(3000);
			
//personalization
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[3]"));
			WebElement personalizationTab=driver.findElement(By.xpath("(//span[contains(text(),'Personalization')])[1]"));
			if(pushpin.isDisplayed()&&personalizationTab.isDisplayed()) {
				System.out.println("Personalization tab is displayed");
			}
			else {
				System.out.println("Personalization tab is not displayed");
			}
			js.executeScript("arguments[0].click()", personalizationTab);
			Thread.sleep(3000);
			
//personalization(heading,information)
			WebElement personalizeHeading=driver.findElement(By.xpath("//p[contains(text(),'Personalization ')]"));
			WebElement personalizeInformation=driver.findElement(By.xpath("(//p[@class='mb-0 mt-6 text__light--sm font-weight-400'])[3]"));
			if(personalizeHeading.isDisplayed()&&personalizeInformation.isDisplayed()) {
				System.out.println("personalization heading and information are displayed");
			}
			else {
				System.out.println("personalization heading and information are not displayed");
			}
			
//select the brand
			WebElement arrow=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand=driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			searchBrand.sendKeys("titan");
			WebElement brand=driver.findElement(By.xpath("//span[contains(text(),'Titan')]"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			
//add new field
			WebElement addNewField=driver.findElement(By.xpath("//span[contains(text(),' Add New Field ')]"));
			js.executeScript("arguments[0].click()", addNewField);
			Thread.sleep(3000);
			
//add information
			WebElement arrow1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			WebElement fieldType=driver.findElement(By.xpath("(//span[contains(text(),'Numeric')])[2]"));
			js.executeScript("arguments[0].click()", fieldType);
			Thread.sleep(3000);
			WebElement fieldname=driver.findElement(By.xpath("//input[@type='string']"));
			fieldname.sendKeys("Field no:");
			WebElement characterLimit=driver.findElement(By.xpath("//input[@type='number']"));
			characterLimit.sendKeys("10");
			
//add new field
			WebElement addNewField1=driver.findElement(By.xpath("//span[contains(text(),'+Add New Field')]"));
			js.executeScript("arguments[0].click()", addNewField1);
			Thread.sleep(3000);
			
//add information
			WebElement arrow2=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow2);
			Thread.sleep(3000);
			WebElement fieldType1=driver.findElement(By.xpath("(//span[contains(text(),'Text')])"));
			js.executeScript("arguments[0].click()", fieldType1);
			Thread.sleep(3000);
			WebElement fieldname1=driver.findElement(By.xpath("(//input[@type='string'])[2]"));
			fieldname1.sendKeys("information");
			WebElement characterLimit1=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			characterLimit1.sendKeys("50");
			
//add new field
			WebElement addNewField2=driver.findElement(By.xpath("//span[contains(text(),'+Add New Field')]"));
			js.executeScript("arguments[0].click()", addNewField2);
			Thread.sleep(3000);
			
//add information
			WebElement arrow3=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", arrow3);
			Thread.sleep(3000);
			WebElement fieldType2=driver.findElement(By.xpath("(//span[contains(text(),'Image')])"));
			js.executeScript("arguments[0].click()", fieldType2);
			Thread.sleep(3000);
			WebElement fieldname2=driver.findElement(By.xpath("(//input[@type='string'])[3]"));
			fieldname2.sendKeys("youtube");
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save Field ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//columns fields name
			WebElement columnsField=driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			js.executeScript("arguments[0].click()", columnsField);
			Thread.sleep(3000);
			
//add columns
			WebElement addcolumn=driver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[1]"));
			addcolumn.click();
			WebElement addcolumn1=driver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[2]"));
			addcolumn1.click();
			WebElement addcolumn2=driver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[3]"));
			addcolumn2.click();
			
			WebElement columnsField1=driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			js.executeScript("arguments[0].click()", columnsField1);
			Thread.sleep(3000);
			
//action class
			WebElement action=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit ')])[1]"));
			js.executeScript("arguments[0].click()", action);
			Thread.sleep(3000);
			
			WebElement addData=driver.findElement(By.xpath("//input[@formcontrolname='phone']"));
			addData.sendKeys("5364724345");
			
			WebElement addData1=driver.findElement(By.xpath("//input[@formcontrolname='email']"));
			addData1.sendKeys("kalyan97@gmail.com");
			
			WebElement addData2=driver.findElement(By.xpath("//input[@formcontrolname='websiteUrl']"));
			addData2.sendKeys("www.google.com");
			
			WebElement addData3=driver.findElement(By.xpath("(//input[@type='text'])[8]"));
			addData3.sendKeys("9536363464");
			
			WebElement addData4=driver.findElement(By.xpath("(//input[@type='text'])[9]"));
			addData4.sendKeys("This is latest information of channel");
			
//upload image
/*			WebElement uploadImage=driver.findElement(By.xpath("//span[contains(text(),'Upload Image')]"));
			uploadImage.click();
			WebElement fileName1 = driver.findElement(By.xpath("//input[@id='file2']"));
			fileName1.sendKeys("‪C:\\Users\\admin\\Desktop\\New folder\\wings.png");
			Thread.sleep(4000);
			Robot rb=new Robot();
			rb.delay(2000);
			StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\New folder\\wings.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(2000);*/
			
//save button
			WebElement saveButton1=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(3000);
			
//search with name
			WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search by Personalized Data']"));
			search.sendKeys("Komal25169281");
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[4]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
//columns fields name
			WebElement columnsField2=driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			js.executeScript("arguments[0].click()", columnsField2);
			Thread.sleep(3000);
			
			WebElement deleteField=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])[1]"));
			js.executeScript("arguments[0].click()", deleteField);
			Thread.sleep(3000);
			WebElement confirmDelete=driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", confirmDelete);
			Thread.sleep(3000);
			
			WebElement columnsField3=driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			js.executeScript("arguments[0].click()", columnsField3);
			Thread.sleep(3000);
			
//download
			WebElement download=driver.findElement(By.xpath("//span[contains(text(),' Download ')]"));
			js.executeScript("arguments[0].click()", download);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
