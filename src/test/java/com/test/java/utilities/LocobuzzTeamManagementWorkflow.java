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

public class LocobuzzTeamManagementWorkflow {
	
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
	
	public static void teamManagementProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//response teams
			WebElement responseTeam=driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Response Teams ')]"));
			js.executeScript("arguments[0].click()", responseTeam);
			Thread.sleep(3000);
			
//team management
			WebElement teamManagementLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Team_Management.svg']"));
			WebElement teamManagement=driver.findElement(By.xpath("//span[contains(text(),'Team Management')]"));
			js.executeScript("arguments[0].click()", teamManagement);
			Thread.sleep(3000);
			
//TM information
			WebElement tmHeading=driver.findElement(By.xpath("(//p[contains(text(),'Team Management')])"));
			WebElement infromation=driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])"));
			if(tmHeading.isDisplayed()&&infromation.isDisplayed()) {
				System.out.println("Team Management Infromation is displayed");				
			}
			else {
				System.out.println("Team Management Infromation is not displayed");				
			}
			
//create team
			WebElement createTeam=driver.findElement(By.xpath("(//span[contains(text(),'Create Team ')])"));
			js.executeScript("arguments[0].click()", createTeam);
			Thread.sleep(3000);
			
//team name
			WebElement teamName=driver.findElement(By.xpath("//input[@type='string']"));
			teamName.sendKeys("KalyanTeam");
			
//team type
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			
			WebElement selectTeamType=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Agent']"));
			js.executeScript("arguments[0].click()", selectTeamType);
			Thread.sleep(3000);
			
//team leader
			WebElement teamLeader=driver.findElement(By.xpath("//input[@placeholder='Search team leader']"));
			js.executeScript("arguments[0].click()", teamLeader);
			Thread.sleep(3000);
			
			WebElement selectLeader=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[1]"));
			js.executeScript("arguments[0].click()", selectLeader);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//team members
			WebElement teamMembers=driver.findElement(By.xpath("//input[@placeholder='Search team member']"));
			js.executeScript("arguments[0].click()", teamMembers);
			Thread.sleep(3000);
			teamMembers.sendKeys("kalyan");
			WebElement selectMember=driver.findElement(By.xpath("//span[contains(text(),'kalyan agent')]"));
			js.executeScript("arguments[0].click()", selectMember);
			Thread.sleep(3000);
			
			WebElement selectMember1=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[1]"));
			js.executeScript("arguments[0].click()", selectMember1);
			Thread.sleep(3000);
			
			WebElement selectMember2=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[2]"));
			js.executeScript("arguments[0].click()", selectMember2);
			Thread.sleep(3000);
			
			WebElement selectMember3=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[3]"));
			js.executeScript("arguments[0].click()", selectMember3);
			Thread.sleep(3000);
			
			
			Action action1 = actions.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save Team ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//search
			WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search.sendKeys("KalyanTeam");
			
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
//delete
			WebElement deleteButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			if(deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
//edit
			WebElement editButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			if(editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
//edit process
			WebElement member=driver.findElement(By.xpath("(//mat-icon[contains(text(),' highlight_off')])[4]"));
			js.executeScript("arguments[0].click()", member);
			Thread.sleep(3000);
			
			WebElement update=driver.findElement(By.xpath("(//span[contains(text(),' Update Team ')])"));
			js.executeScript("arguments[0].click()", update);
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			search.clear();
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			createCSDProcess(driver);
			
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void createCSDProcess(WebDriver driver) throws Exception {
		try {
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//create team
			WebElement createTeam=driver.findElement(By.xpath("(//span[contains(text(),'Create Team ')])"));
			js.executeScript("arguments[0].click()", createTeam);
			Thread.sleep(3000);
			
//team name
			WebElement teamName=driver.findElement(By.xpath("//input[@type='string']"));
			teamName.sendKeys("KalyanCSD");
			
//team type
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			
			WebElement selectTeamType=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='CSD (L1)']"));
			js.executeScript("arguments[0].click()", selectTeamType);
			Thread.sleep(3000);
			
//team members
			WebElement teamMembers=driver.findElement(By.xpath("//input[@placeholder='Search team member']"));
			js.executeScript("arguments[0].click()", teamMembers);
			Thread.sleep(3000);
			
			WebElement selectMember1=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[1]"));
			js.executeScript("arguments[0].click()", selectMember1);
			Thread.sleep(3000);
			
			WebElement selectMember2=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[2]"));
			js.executeScript("arguments[0].click()", selectMember2);
			Thread.sleep(3000);
			
			WebElement selectMember3=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[3]"));
			js.executeScript("arguments[0].click()", selectMember3);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			Action action1 = actions.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save Team ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//search
			WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search.sendKeys("KalyanCSD");
			
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
//delete
			WebElement deleteButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			if(deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
//edit
			WebElement editButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			if(editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
//edit process
			WebElement member=driver.findElement(By.xpath("(//mat-icon[contains(text(),' highlight_off')])[3]"));
			js.executeScript("arguments[0].click()", member);
			Thread.sleep(3000);
			
			WebElement update=driver.findElement(By.xpath("(//span[contains(text(),' Update Team ')])"));
			js.executeScript("arguments[0].click()", update);
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			search.clear();
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			createBrandProcess(driver);
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public static void createBrandProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//create team
			WebElement createTeam=driver.findElement(By.xpath("(//span[contains(text(),'Create Team ')])"));
			js.executeScript("arguments[0].click()", createTeam);
			Thread.sleep(3000);
			
//team name
			WebElement teamName=driver.findElement(By.xpath("//input[@type='string']"));
			teamName.sendKeys("KalyanBrand");
			
//team type
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			
			WebElement selectTeamType=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Brand (L2)']"));
			js.executeScript("arguments[0].click()", selectTeamType);
			Thread.sleep(3000);
			
//team members
			WebElement teamMembers=driver.findElement(By.xpath("//input[@placeholder='Search team member']"));
			js.executeScript("arguments[0].click()", teamMembers);
			Thread.sleep(3000);
			
			WebElement selectMember1=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[1]"));
			js.executeScript("arguments[0].click()", selectMember1);
			Thread.sleep(3000);
			
			WebElement selectMember2=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[2]"));
			js.executeScript("arguments[0].click()", selectMember2);
			Thread.sleep(3000);
			
			WebElement selectMember3=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[3]"));
			js.executeScript("arguments[0].click()", selectMember3);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			Action action1 = actions.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save Team ')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//search
			WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search.sendKeys("KalyanBrand");
			
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
//delete
			WebElement deleteButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			if(deleteButton.isDisplayed()) {
				System.out.println("Delete Button is displayed");
			}
			else {
				System.out.println("Delete Button is not displayed");
			}
			
//edit
			WebElement editButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]"));
			if(editButton.isDisplayed()) {
				System.out.println("Edit Button is displayed");
			}
			else {
				System.out.println("Edit Button is not displayed");
			}
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
//edit process
			WebElement member=driver.findElement(By.xpath("(//mat-icon[contains(text(),' highlight_off')])[3]"));
			js.executeScript("arguments[0].click()", member);
			Thread.sleep(3000);
			
			WebElement update=driver.findElement(By.xpath("(//span[contains(text(),' Update Team ')])"));
			js.executeScript("arguments[0].click()", update);
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			search.clear();
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			filterProcess(driver);
			

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void filterProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement filter=driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt ')]"));
			js.executeScript("arguments[0].click()", filter);
			Thread.sleep(3000);
			
//select agent team
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			
			WebElement selectTeam=driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]"));
			js.executeScript("arguments[0].click()", selectTeam);
			Thread.sleep(3000);
			
			WebElement applyButton=driver.findElement(By.xpath("(//span[contains(text(),' Apply ')])"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);
			
//select csd team
			WebElement filter1=driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt ')]"));
			js.executeScript("arguments[0].click()", filter1);
			Thread.sleep(3000);
			
			WebElement arrow1=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(3000);
			
			WebElement selectTeam1=driver.findElement(By.xpath("(//span[@class='mat-option-text'])[3]"));
			js.executeScript("arguments[0].click()", selectTeam1);
			Thread.sleep(3000);
			
			WebElement applyButton1=driver.findElement(By.xpath("(//span[contains(text(),' Apply ')])"));
			js.executeScript("arguments[0].click()", applyButton1);
			Thread.sleep(3000);
			
//select brand team
			
			WebElement filter2=driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt ')]"));
			js.executeScript("arguments[0].click()", filter2);
			Thread.sleep(3000);
			
			WebElement arrow2=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow2);
			Thread.sleep(3000);
			
			WebElement selectTeam2=driver.findElement(By.xpath("(//span[@class='mat-option-text'])[4]"));
			js.executeScript("arguments[0].click()", selectTeam2);
			Thread.sleep(3000);
			
			WebElement applyButton2=driver.findElement(By.xpath("(//span[contains(text(),' Apply ')])"));
			js.executeScript("arguments[0].click()", applyButton2);
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
