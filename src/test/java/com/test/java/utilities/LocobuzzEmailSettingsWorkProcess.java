package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzEmailSettingsWorkProcess {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar=driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);
			
			
//account session Button
			WebElement accountSession=driver.findElement(By.xpath("//span[contains(text(),' Accounts')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(2000);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
	
	@SuppressWarnings("unused")
	public static void ticketForwardingEmailProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Adv Response Management 
			WebElement advResponseManagement=driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);
			
//email settings
			WebElement emailSettings=driver.findElement(By.xpath("//span[contains(text(),'Email Setting')]"));
			js.executeScript("arguments[0].click()", emailSettings);
			Thread.sleep(2000);
			
//ticketForwardingemail
			WebElement ticketForwardingEmail=driver.findElement(By.xpath("(//span[contains(text(),'Ticket Forwarding Email')])[1]"));
			js.executeScript("arguments[0].click()", ticketForwardingEmail);
			Thread.sleep(2000);
			
//select brand
			WebElement selectBrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[1]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);
			WebElement searchBrand=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
			searchBrand.sendKeys("renault");
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),'Renault')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(2000);
			
//Email Address To
			WebElement emailAddressTo=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[2]"));
			WebElement emailTo=driver.findElement(By.xpath("(//input[@id='clearTagToEmail'])"));
			emailTo.sendKeys("kalyan.chinni@locobuzz.com");
			WebElement selectEmail=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' kalyan.chinni@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail);
			Thread.sleep(2000);
			
//Email Address Cc
			WebElement emailAddressCc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[3]"));
			WebElement emailCc=driver.findElement(By.xpath("//input[@id='clearTagCcEmail']"));
			emailCc.sendKeys("sumit.choudhary@locobuzz.com");
			WebElement selectEmail1=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' sumit.choudhary@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail1);
			Thread.sleep(2000);
			
//Email Address Bcc
			WebElement emailAddressBcc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[4]"));
			WebElement emailBcc=driver.findElement(By.xpath("//input[@id='clearTagBccEmail']"));
			emailBcc.sendKeys("saumya@locobuzz.com");
			WebElement selectEmail2=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' saumya@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail2);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(2000);
			
			System.out.println("Emails added Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void emailGroupInsideTicketsProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//emailgroupinsidetickets
			WebElement emailGroupInsideTickets=driver.findElement(By.xpath("(//span[contains(text(),'Email Groups Inside Tickets')])[1]"));
			js.executeScript("arguments[0].click()", emailGroupInsideTickets);
			Thread.sleep(3000);
			
//select brand
		/*	WebElement selectBrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[2]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);
			WebElement searchBrand=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
			searchBrand.sendKeys("renault");
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),'Renault')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(1000);*/
			
//create new group
			WebElement createNewGroup=driver.findElement(By.xpath("(//span[contains(text(),'Create New Group ')])"));
			js.executeScript("arguments[0].click()", createNewGroup);
			Thread.sleep(3000);
			
// new Group Name
			WebElement newGroupName=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix')]//following::input[@type='text'])[2]"));
			newGroupName.sendKeys("Email test op");
			Thread.sleep(2000);
			
			WebElement emailTo=driver.findElement(By.xpath("(//input[@id='clearTagToNewEmail'])"));
			emailTo.sendKeys("kalyan.chinni@locobuzz.com");
			WebElement selectEmail=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' kalyan.chinni@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail);
			Thread.sleep(1000);
			
			WebElement emailCc=driver.findElement(By.xpath("(//input[@id='clearTagCcNewEmail'])"));
			emailCc.sendKeys("akhil@locobuzz.com");
			WebElement selectEmail1=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' akhil@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail1);
			Thread.sleep(1000);
			
			WebElement emailBcc=driver.findElement(By.xpath("(//input[@id='clearTagBccNewEmail'])"));
			emailBcc.sendKeys("kkkkktp@locobuzz.com");
			WebElement selectEmail2=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' kkkkktp@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail2);
			Thread.sleep(2000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(2000);
			
//search button
			WebElement searchButton=driver.findElement(By.xpath("//input[@placeholder='Search by Group Name,To, Cc, Bcc']"));
			searchButton.sendKeys("Email test op");
			WebElement searchIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchIcon);
			Thread.sleep(2000);
			
//edit button
			WebElement editButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
			if(editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(2000);
			
			WebElement emailTo1=driver.findElement(By.xpath("(//input[@id='clearTagToNewEmail'])"));
			emailTo1.sendKeys("ekta.joshi@locobuzz.com");
			WebElement selectEmail3=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' ekta.joshi@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail3);
			Thread.sleep(1000);
			
//save button
			WebElement saveButton1=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(2000);
			
			
			
//delete button
			WebElement deleteButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),' delete_outline ')])"));
			if(deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
			
//copy content Button
			WebElement copyContentButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy ')])"));
			if(copyContentButton.isDisplayed()) {
				System.out.println("Copy Content Button is displayed");
			}
			else {
				System.out.println("Copy Content Button is displayed");
			}
			System.out.println("New Group Created Successfully");
			js.executeScript("arguments[0].click()", copyContentButton);
			Thread.sleep(3000);
			
			WebElement searchBrand1=driver.findElement(By.xpath("//input[@placeholder='Type to search']"));
			js.executeScript("arguments[0].click()", searchBrand1);
			Thread.sleep(2000);
			searchBrand1.sendKeys("titan");
			WebElement selectBrand1=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(2000);
			
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//copy button
			WebElement copyButton=driver.findElement(By.xpath("(//span[contains(text(),' Copy ')])"));
			js.executeScript("arguments[0].click()", copyButton);
			Thread.sleep(2000);
			
//select brand
			WebElement selectBrand3=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[2]"));
			js.executeScript("arguments[0].click()", selectBrand3);
			Thread.sleep(2000);
			WebElement searchBrand3=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
			searchBrand3.sendKeys("titan");
			WebElement brand2=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
			js.executeScript("arguments[0].click()", brand2);
			Thread.sleep(1000);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@SuppressWarnings("unused")
	public static void csdEmailSettingsProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//csd email settings
			WebElement csdEmailSettings=driver.findElement(By.xpath("(//span[contains(text(),'CSD Email Setting')])[1]"));
			js.executeScript("arguments[0].click()", csdEmailSettings);
			Thread.sleep(5000);
			
//select brand
			WebElement selectBrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[3]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(5000);
			WebElement searchBrand=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
			searchBrand.sendKeys("renault");
			//selectBrand(driver, "value1");
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),'Renault')])"));
			js.executeScript("arguments[0].click()", brand);
			
//Email Address To
			WebElement emailAddressTo=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[2]"));
			WebElement emailTo=driver.findElement(By.xpath("(//input[@id='clearToEmail'])"));
			emailTo.sendKeys("Auto1@gmail.com");
			WebElement selectEmail=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' Auto1@gmail.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail);
			Thread.sleep(1000);
			
//Email Address Cc
			WebElement emailAddressCc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[3]"));
			WebElement emailCc=driver.findElement(By.xpath("//input[@id='clearccEmail']"));
			emailCc.sendKeys("AutoTest1@gmail.com");
			WebElement selectEmail1=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' AutoTest1@gmail.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail1);
			Thread.sleep(1000);
			
//Email Address Bcc
			WebElement emailAddressBcc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[4]"));
			WebElement emailBcc=driver.findElement(By.xpath("//input[@id='clearbccEmail']"));
			emailBcc.sendKeys("diksha.verma123@locobuzz.com");
			WebElement selectEmail2=driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(),' diksha.verma123@locobuzz.com ')]"));
			js.executeScript("arguments[0].click()", selectEmail2);
			Thread.sleep(1000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(2000);
			
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			System.out.println("Emails added Successfully");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	

}
