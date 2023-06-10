package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzQueueConfigurationWorkflow {
	
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
	
	public static void queueConfigurationProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//response management
			WebElement responseManagement = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Response Management ')])[1]"));
			js.executeScript("arguments[0].click()", responseManagement);
			Thread.sleep(3000);
			
//queue management
			WebElement queueManagementLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Queue_Configuration.svg']"));
			WebElement queueManagement = driver.findElement(By.xpath("//span[contains(text(),'Queue Configuration')]"));
			js.executeScript("arguments[0].click()", queueManagement);
			Thread.sleep(3000);
			
//queue management tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement qmTab = driver.findElement(By.xpath("(//span[contains(text(),'Queue Configuration')])[2]"));
			js.executeScript("arguments[0].click()", qmTab);
			Thread.sleep(3000);
			
//queue management information
			WebElement heading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement info = driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[1]"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Queue Management Information is displayed");				
			} else {
				System.out.println("Queue Management Information is not displayed");				
			}
			
//select brand
			WebElement arrow=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement searchBrand=driver.findElement(By.xpath("//input[@id='searchTextBrand']"));
			searchBrand.sendKeys("renault");
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),'Renault')])"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			
//select active button
			WebElement active = driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			js.executeScript("arguments[0].click()", active);
			Thread.sleep(3000);
			
//select duration
			WebElement assignmentDuration=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			assignmentDuration.clear();
			Thread.sleep(2000);
			assignmentDuration.sendKeys("1");
			WebElement assignmentLimit=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			assignmentLimit.clear();
			Thread.sleep(2000);
			assignmentLimit.sendKeys("10");
			
//select ticket order
			WebElement selectTicketOrder=driver.findElement(By.xpath("(//span[@class='mat-radio-label-content'])[1]"));
			js.executeScript("arguments[0].click()", selectTicketOrder);
			Thread.sleep(3000);
			
//enforce skill based assignment information
			WebElement enforceHeading = driver
					.findElement(By.xpath("//span[contains(text(),' Enforce Skill Based Assignment ')]"));
			WebElement viewAgentSkills = driver
					.findElement(By.xpath("//span[@class='queueconfig__container--body-skill link-hover']"));
			WebElement enforceInfo = driver.findElement(By.xpath("//p[@class='text__light text__sm ml-23 mb-4']"));
			if (enforceHeading.isDisplayed() && viewAgentSkills.isDisplayed() && enforceInfo.isDisplayed()) {
				System.out.println("Enforce Skill Based assignment information is displayed");
			} else {
				System.out.println("Enforce Skill Based assignment information is not displayed");
			}
			js.executeScript("arguments[0].click()", enforceHeading);
			Thread.sleep(3000);
			
//select ticket affinity
			WebElement selectTicketAffinity=driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[4]"));
			js.executeScript("arguments[0].click()", selectTicketAffinity);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),' Save ')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
			csdConfigurationProcess(driver);
			brandConfigurationProcess(driver);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);


			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void csdConfigurationProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//csd team button
			WebElement csdTeam = driver.findElement(By.xpath("//span[contains(text(),'CSD')]"));
			js.executeScript("arguments[0].click()", csdTeam);
			Thread.sleep(3000);
			
//select active button
			WebElement activeButton = driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])"));
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);
			
//select view types
			WebElement viewsType=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-container')])[1]"));
			js.executeScript("arguments[0].click()", viewsType);
			Thread.sleep(3000);
			
//select ticket duration
			WebElement assignmentDuration=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			assignmentDuration.clear();
			assignmentDuration.sendKeys("2");
			WebElement assignmentLimit=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			assignmentLimit.clear();
			assignmentLimit.sendKeys("8");
			
//select ticket order
			WebElement selectTicketOrder=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-container')])[3]"));
			js.executeScript("arguments[0].click()", selectTicketOrder);
			Thread.sleep(3000);
			
			WebElement selectcheckbox=driver.findElement(By.xpath("//span[contains(text(),'Unassign tickets from users on logout')]"));
			js.executeScript("arguments[0].click()", selectcheckbox);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),' Save ')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public static void brandConfigurationProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//brand team button
			WebElement brandTeam=driver.findElement(By.xpath("(//span[contains(text(),'Brand')])"));
			js.executeScript("arguments[0].click()", brandTeam);
			Thread.sleep(3000);
			
//select active button
			WebElement activeButton = driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])"));
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);
			
//select view types
			WebElement viewsType=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-container')])[1]"));
			js.executeScript("arguments[0].click()", viewsType);
			Thread.sleep(3000);
			
//select ticket duration
			WebElement assignmentDuration=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			assignmentDuration.clear();
			assignmentDuration.sendKeys("2");
			WebElement assignmentLimit=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			assignmentLimit.clear();
			assignmentLimit.sendKeys("10");
			
//select ticket order
			WebElement selectTicketOrder=driver.findElement(By.xpath("(//span[contains(@class,'mat-radio-container')])[3]"));
			js.executeScript("arguments[0].click()", selectTicketOrder);
			Thread.sleep(3000);
			
			WebElement selectcheckbox=driver.findElement(By.xpath("//span[contains(text(),'Unassign tickets from users on logout')]"));
			js.executeScript("arguments[0].click()", selectcheckbox);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),' Save ')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
}

