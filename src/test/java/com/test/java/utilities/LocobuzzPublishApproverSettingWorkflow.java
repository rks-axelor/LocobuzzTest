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


public class LocobuzzPublishApproverSettingWorkflow {
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
	
	public static void PublishApproverworkprocess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//Listening Settings
			WebElement ListeningSettings=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if(ListeningSettings.isDisplayed()) {
				System.out.println("Listening Settings is  displayed");
				}
			else {
				System.out.println("Listening Settings is not displayed");
				}
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);
			
//Publish Setting
			WebElement PublishSettinglogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Publish_Settings.svg']"));
			WebElement PublishSetting=driver.findElement(By.xpath("//span[contains(text(),'Publish Setting')]"));
			if(PublishSettinglogo.isDisplayed()&&PublishSetting.isDisplayed()) {
				System.out.println("Publish Setting is displayed");
				}
			else {
				System.out.println("Publish Setting is not displayed");
				}
			js.executeScript("arguments[0].click()", PublishSetting);
			Thread.sleep(3000);
			
//Publish Approver Setting tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement PASTab=driver.findElement(By.xpath("(//span[contains(text(),'Publish Approver Setting')])[1]"));
			if(pushpin.isDisplayed()&&PASTab.isDisplayed()) {
				System.out.println("Publish Approver Setting tab Label is displayed");
				}
			else {
				System.out.println("Publish Approver Setting tab Label is not displayed");
				}

//Publish Approver Setting tab name	and Information	

			WebElement Publishheading=driver.findElement(By.xpath("(//p[contains(text(),'Publish Approver Settings')])"));
			WebElement PASinfromation=driver.findElement(By.xpath("(//p[contains(text(),'Publish Approver Settings')])//following::p[1]"));
			if(Publishheading.isDisplayed()&&PASinfromation.isDisplayed()) {
				System.out.println("Publish Approver Setting tab name	and Information	 is displayed");
				}
			else {
				System.out.println("Publish Approver Setting tab name and Information is not displayed");
				}
			
//search field
			WebElement searchField=driver.findElement(By.xpath("(//input[@placeholder='Search by Brand Name'])[1]"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("BURBERRY");
			js.executeScript("arguments[0].click()", symbol);			
             Thread.sleep(7000);
//Configure Approvers
			WebElement ConfigureApprovers=driver.findElement(By.xpath("(//span[contains(text(),'Configure Approvers')])"));
			js.executeScript("arguments[0].click()", ConfigureApprovers);
			Thread.sleep(3000);			
			
//Configure Approver Field UI Components			
			
//Select brand & approver(s)			
						
			WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Select brand & approver(s)')]"));
			if(heading.isDisplayed()) {
				System.out.println("Select brand & approver(s) is displayed");
				}
			else {
				System.out.println("Select brand & approver(s) is not  displayed");
				}
											
//Select Brand Heading and Information
			WebElement BrandHeading=driver.findElement(By.xpath("//p[contains(text(),'Select Brand')]"));
			WebElement BrandInformation=driver.findElement(By.xpath("//p[contains(text(),'Select Brand')]//following::p[1]"));
			if(heading.isDisplayed() &&  BrandInformation.isDisplayed()){
				System.out.println("Select Brand Heading and Information is displayed");
				
			}
			else {
				System.out.println("Select Brand Heading and Information is not displayed");
			     }
						
//Select Brand Field
			WebElement SelectBrandField=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns')])[2]"));
			if(SelectBrandField.isDisplayed()) {
				System.out.println("Select Brand Field is displayed");
				}
			else {
				System.out.println("Select Brand Field is not displayed");
				}
			js.executeScript("arguments[0].click()", SelectBrandField);
			Thread.sleep(3000);			
//select Brand						
			WebElement selectbrand=driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])"));
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(3000);
			System.out.println("Brand Selected successfully");
			
//Select users for Approval Heading and Information
			WebElement UserHeading=driver.findElement(By.xpath("(//p[contains(text(),'Select users for approval')])"));
			WebElement userInformation=driver.findElement(By.xpath("(//p[contains(text(),'Select users for approval')])//following::p[1]"));
			if(UserHeading.isDisplayed() &&  userInformation.isDisplayed()){
				System.out.println("Select user Heading and Information is displayed");
				}
			else {
				System.out.println("Select user Heading and Information is not displayed");
				}			
//Search User Field
			WebElement SearchuserField=driver.findElement(By.xpath("//input[@placeholder='Search users']"));
			if(SearchuserField.isDisplayed()) {
				System.out.println("Search User Field is displayed");
				}
			else {
				System.out.println("Search User Field is not displayed");
				}
			js.executeScript("arguments[0].click()", SearchuserField);
			Thread.sleep(3000);
//Select users			
			
			WebElement selectMember1=driver.findElement(By.xpath("//span[contains(text(),'komal malibrand')]"));
			js.executeScript("arguments[0].click()", selectMember1);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", SearchuserField);
			Thread.sleep(3000);
			WebElement selectMember2=driver.findElement(By.xpath("//span[contains(text(),' komal malicsd ')]"));
			js.executeScript("arguments[0].click()", selectMember2);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", SearchuserField);
			Thread.sleep(3000);
			//WebElement selectMember3=driver.findElement(By.xpath("//span[contains(text(),'kalyan csd')]"));
			//js.executeScript("arguments[0].click()", selectMember3);
			Thread.sleep(3000);
			System.out.println("Users selected for approver");
			Actions actions = new Actions(driver);
			Action action1 = actions.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			System.out.println("Configured approver setting saved sucessfully");
	


			verifyconfiguredapprover(driver);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void verifyconfiguredapprover(WebDriver driver) throws Exception {
		try {
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//search
			WebElement searchField=driver.findElement(By.xpath("(//input[@placeholder='Search by Brand Name'])[1]"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("BURBERRY");
			js.executeScript("arguments[0].click()", symbol);					
Thread.sleep(5000);
//Brand logo
			WebElement brandlogo=
			driver.findElement(By.xpath("(//img[@src='https://s3.amazonaws.com/locobuzz.socialimages/BrandImage/reliancejiodb/8e0a9e9d-3216-4d81-b2c3-c5e8285bac90.png'])"));
			if (brandlogo.isDisplayed()) {
				System.out.println("Brand logo is displayed");
			} else {
				System.out.println("Brand logo is not displayed");
			}
			
//Brand Name
			WebElement brandname=driver.findElement(By.xpath("(//p[contains(text(),'BURBERRY')])"));
			if (brandname.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}
			
			
//Time Information
			WebElement updatedtime=driver.findElement(By.xpath("(//p[@class='mb-0'])"));
			if (updatedtime.isDisplayed()) {
				System.out.println("Time Information is displayed");
			} else {
				System.out.println("Time Information is not displayed");
			}
			
			System.out.println("Modified On: " + updatedtime.getText());
			
		
			
//Cofigured approvers 
			WebElement approver1=driver.findElement(By.xpath("(//span[contains(text(),' komal malibrand')])"));
			WebElement approver2=driver.findElement(By.xpath("(//span[contains(text(),' komal malicsd ')])"));
			if (approver1.isDisplayed() && approver2.isDisplayed()) {
				System.out.println("Cofigured approvers  is displayed");
			} else {
				System.out.println("Cofigured approvers  is not displayed");
			}
			
//Toogle button
			WebElement togglebutton=driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			//js.executeScript("arguments[0].click()", saveButton);
			if (togglebutton.isDisplayed()) {
				System.out.println("Toogle button  is displayed");
			} else {
				System.out.println("Toogle button is not displayed");
			}
			Thread.sleep(5000);
			
//More field
			WebElement More=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]"));
			if (More.isDisplayed()) {
				System.out.println("More field  is displayed");
			} else {
				System.out.println("More field is not displayed");
			}
			js.executeScript("arguments[0].click()", More);
			WebElement editlogo=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
			WebElement edit=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])"));
			if (edit.isDisplayed() && editlogo.isDisplayed()) {
				System.out.println("edit field  is displayed");
			} else {
				System.out.println("edit field is not displayed");
			}
			
			Thread.sleep(3000);
			WebElement deletelogo=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])"));
			WebElement delete=driver.findElement(By.xpath("(//span[contains(text(),'Delete')])"));
			if (delete.isDisplayed() && deletelogo.isDisplayed()) {
				System.out.println("delete field  is displayed");
			} else {
				System.out.println("delete field is not displayed");
			}
			
			Thread.sleep(3000);
			
			editprocess(driver);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public static void editprocess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//Toogle button
			WebElement togglebutton=driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			js.executeScript("arguments[0].click()", togglebutton);
		    Thread.sleep(5000);			
		    System.out.println("Approver setting off for kalyan brand");
//search
			WebElement searchField=driver.findElement(By.xpath("(//input[@placeholder='Search by Brand Name'])[1]"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("BURBERRY");
			js.executeScript("arguments[0].click()", symbol);	
			 Thread.sleep(5000);	
//Toogle button
			WebElement togglebutton1=driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			js.executeScript("arguments[0].click()", togglebutton1);
		    Thread.sleep(5000);		
		    System.out.println("Approver setting on for BURBERRY brand");
			
		    searchField.clear();
		    js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("BURBERRY");
			js.executeScript("arguments[0].click()", symbol);	
			Thread.sleep(5000);

//More field
			WebElement More=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]"));
			js.executeScript("arguments[0].click()", More);
			Thread.sleep(3000);
			 System.out.println("More field displayed");
//Edit Field			
			WebElement edit=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])"));
			js.executeScript("arguments[0].click()", edit);
			Thread.sleep(3000);
//Deleting one user by edit field
			WebElement deleteuser=driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[2]"));
			js.executeScript("arguments[0].click()", deleteuser);
			Thread.sleep(3000);
			 System.out.println("Deleted one approver user ");
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);	
			 System.out.println("Approver setting saved after editing");
			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("BURBERRY");
			js.executeScript("arguments[0].click()", symbol);	
			Thread.sleep(3000);
//Verifying last updated time information	

			WebElement updatedtime=driver.findElement(By.xpath("(//p[@class='mb-0'])"));
			if (updatedtime.isDisplayed()) {
				System.out.println("Time Information is displayed");
			} else {
				System.out.println("Time Information is not displayed");
			}
			
			System.out.println("Modified On: " + updatedtime.getText());
						
			
//Delete field
//More field
			WebElement More1=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]"));
			js.executeScript("arguments[0].click()", More1);
			Thread.sleep(3000);			
			 System.out.println("Delete operation of configured approver");
			WebElement deletelogo=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete')])"));
			WebElement delete=driver.findElement(By.xpath("(//span[contains(text(),'Delete')])"));
			js.executeScript("arguments[0].click()", delete);
			Thread.sleep(3000);			
			WebElement confirmdelete=driver.findElement(By.xpath("(//span[contains(text(),'Yes')])"));
			js.executeScript("arguments[0].click()", confirmdelete);
			Thread.sleep(3000);	
			searchField.clear();
			 System.out.println("Configured Approver Deleted Successfully");
			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("BURBERRY");
			js.executeScript("arguments[0].click()", symbol);
			Thread.sleep(7000);	
//Arrow back			
            WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);	
		
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}


