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

public class LocobuzzLogicalGroupingWorkflowprocess {
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
	
	public static void LogicalGroupingWorkprocess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Advance Listening Settings
			WebElement AdvListeningSettings=driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			if(AdvListeningSettings.isDisplayed()) {
				System.out.println("Advance Listening Settings is displayed");
				}
			else {
				System.out.println("Advance Listening Settings is not displayed");
				}
			js.executeScript("arguments[0].click()", AdvListeningSettings);
			Thread.sleep(3000);
			
//Logical Grouping Label in Account Section
			WebElement Logicalgroupinglogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Logical_Grouping.svg']"));
			WebElement Logicalgroupinglabel=driver.findElement(By.xpath("//span[contains(text(),'Logical Grouping')]"));
			if(Logicalgroupinglogo.isDisplayed()&&Logicalgroupinglabel.isDisplayed()) {
				System.out.println("Publish Setting is displayed");
				}
			else {
				System.out.println("Publish Setting is not displayed");
				}
			js.executeScript("arguments[0].click()", Logicalgroupinglabel);
			Thread.sleep(3000);
			
//Logical Grouping Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement Logicalgroupingtab=driver.findElement(By.xpath("(//span[contains(text(),'Logical Grouping')])[2]"));
			if(pushpin.isDisplayed()&&Logicalgroupingtab.isDisplayed()) {
			System.out.println("Logical Grouping Tab is displayed");
			}
			else {
			System.out.println("Logical Grouping Tab is not displayed");
			}

//Create Logical Grouping tab name	and Information	

			WebElement LGHeading=driver.findElement(By.xpath("(//p[contains(text(),'Logical Grouping')])"));
			WebElement LGInformation=driver.findElement(By.xpath("(//p[contains(text(),'Logical Grouping')])//following::p[1]"));
			if(LGHeading.isDisplayed()&&LGInformation.isDisplayed()) {
			System.out.println("Create Logical Grouping tab name and Information is displayed");
			}
			else {
			System.out.println("Create Logical Grouping tab name and Information is not displayed");
			}
			

//search field
			WebElement searchField=driver.findElement(By.xpath("(//input[@data-placeholder='Search by Group Name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("komal");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", symbol);	
            Thread.sleep(3000);	
            createnewlogicalgroupprocess(driver);
         	WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
             
private static void createnewlogicalgroupprocess(WebDriver driver) throws Exception {
	try {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

//Create New Group
			WebElement CreateNewGrouplogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle_outline')]"));
			WebElement CreateNewGrouplabel=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]"));
			if(CreateNewGrouplogo.isDisplayed() && CreateNewGrouplabel.isDisplayed()) 
			System.out.println("Create New Group Field is displayed");
			else 
			System.out.println("Create New Group Field is not displayed");
			js.executeScript("arguments[0].click()", CreateNewGrouplabel);
			Thread.sleep(3000);

//Create New Group Field UI Components			
			
//Create New Logical Group Heading			
			WebElement CreateHeading=driver.findElement(By.xpath("//h3[contains(text(),'Create New Logical Group')]"));
			if(CreateHeading.isDisplayed())
			System.out.println("Create New Logical Group Heading is displayed");
			else 
			System.out.println("Create New Logical Group Heading is not displayed");
					
//Define New Logical Group			
			WebElement DefineHeading=driver.findElement(By.xpath("//p[contains(text(),'Define New Logical Group')]"));
			WebElement DefineInformation=driver.findElement(By.xpath("//p[contains(text(),'Define New Logical Group')]//following::p[1]"));
			if(DefineHeading.isDisplayed() &&  DefineInformation.isDisplayed())
			System.out.println("Define New Logical Group Information is displayed");
			else 
			System.out.println("Define New Logical Group Information is not displayed");
				
			
//Enter groupname field 			
			WebElement groupname=driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat-form')])[3]"));
			WebElement charlimit=driver.findElement(By.xpath("(//span[contains(@class,'text__light ng-tns-c')])"));
			if(groupname.isDisplayed() && charlimit.isDisplayed()) 
			System.out.println("Enter groupname field is present");
			else 
			System.out.println("Enter groupname field is not present");
			js.executeScript("arguments[0].click()", groupname);
			Thread.sleep(4000);
			groupname.sendKeys("Komal LogicalGroupingAutoDemo1");
			Thread.sleep(3000);


//Upload group logo field
			
			WebElement uploadlogo=driver.findElement(By.xpath("(//mat-icon[contains(text(),'photo_camera')])"));
			js.executeScript("arguments[0].click()", uploadlogo);
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
			
//Save logo After crop operation	
			WebElement savelogo=driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", savelogo);
			Thread.sleep(4000);				
//select Group Colour			
			
			WebElement selectcolourdropdown=driver.findElement(By.xpath("(//span[contains(text(),'crop_square')])"));
			WebElement selectheading=driver.findElement(By.xpath("(//p[contains(text(),' Select Logical Group Color ')])"));
			if(selectcolourdropdown.isDisplayed() && selectheading.isDisplayed()) 
				System.out.println("select Group Colour heading and dropdown is displayed");
			else 
				System.out.println("select Group Colour heading and dropdown is not displayed");
				js.executeScript("arguments[0].click()", selectcolourdropdown);
				Thread.sleep(4000);	
				WebElement selectcolourformygroup=driver.findElement(By.xpath("(//span[contains(@class,'material-icons createnewlogicalgroup__body--left-squarewrapper-color')])[17]"));	
				js.executeScript("arguments[0].click()", selectcolourformygroup);
				Thread.sleep(2000);	
				Actions actions = new Actions(driver);
				Action action = actions.sendKeys(Keys.ESCAPE).build();
				action.perform();
				
			
//View Other Group colours through Scrolling
			WebElement Viewheading=driver.findElement(By.xpath("(//p[contains(text(),' View other group colors ')])"));
			if(Viewheading.isDisplayed()) 
				System.out.println("View Other Group colours thr Scrolling Field is displayed");
			else 
				System.out.println("View Other Group colours thr Scrolling Field is not displayed");
			js.executeScript("arguments[0].click()", Viewheading);
			Thread.sleep(3000);
			WebElement viewclrotrgrp=driver.findElement(By.xpath("(//span[contains(text(),'Kalyan demo 2')])"));
			js.executeScript("arguments[0].click()", viewclrotrgrp);
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();

//Select Brand  field
			WebElement Selectbrandheading=driver.findElement(By.xpath("(//p[contains(text(),'Group Color ')])[1]"));
			WebElement selectbrandmust=driver.findElement(By.xpath("(//p[contains(text(),'Select Brands ')])//following::span[1]"));
			WebElement brandinformation=driver.findElement(By.xpath("(//p[contains(text(),'Select Brands ')])//following::p[1]"));
			
			if(Selectbrandheading.isDisplayed() && selectbrandmust.isDisplayed() && brandinformation.isDisplayed() ) 
				System.out.println("Select Brand  field is present");
			else 
				System.out.println("Select Brand  field is not  present");
				
//Select Brand Textbox
			WebElement searchbrand=driver.findElement(By.xpath("(//input[@placeholder='Type to search'])"));
			if(searchbrand.isDisplayed()) 
				System.out.println("Select Brand Textbox is present");
			else 
				System.out.println("Select Brand Textbox is not present");
			js.executeScript("arguments[0].click()", searchbrand);
			Thread.sleep(3000);
			WebElement brand1=driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])"));
			js.executeScript("arguments[0].click()", brand1);
			Thread.sleep(3000);
			WebElement brand2=driver.findElement(By.xpath("(//span[contains(text(),'Renault')])"));
			js.executeScript("arguments[0].click()", brand2);
			Thread.sleep(3000);
			WebElement brand3=driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));
			js.executeScript("arguments[0].click()", brand3);
			Thread.sleep(3000);
			WebElement brand4=driver.findElement(By.xpath("(//span[contains(text(),'BURBERRY')])[1]"));
			js.executeScript("arguments[0].click()", brand4);
			Thread.sleep(3000);
//Save Button
			WebElement Save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			if(Save.isDisplayed()) 
				System.out.println("Save Button is Present");
			else 
				System.out.println("Save Button is not Present");
				js.executeScript("arguments[0].click()", Save);
				Thread.sleep(4000);	



			VerifyLogicalGroupDetails(driver);
	}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
	}
}
			
			private static void VerifyLogicalGroupDetails(WebDriver driver) throws Exception {
				
	try {
	
//groupname

		WebElement groupname = driver
			.findElement(By.xpath("(//div[contains(text(),'Group Name')])"));
		if (groupname.isDisplayed()) 
		System.out.println("Ticket name is displayed");
		else 
		System.out.println("Ticket name is not displayed");
		WebElement newgroupname = driver
				.findElement(By.xpath("(//span[contains(text(),' Komal LogicalGroupingAuto')])"));
		System.out.println("new created group name is=" + newgroupname.getText());
		
//Selected Brands

		WebElement selBrands = driver.findElement(By.xpath("(//div[contains(text(),'Selected Brands')])"));
		if (selBrands.isDisplayed()) {
		System.out.println("Selected Brands for new group are  displayed");
		} else {
		System.out.println("Selected Brands for new group are not  displayed");
		}

	
//assigned colour
		WebElement assignclr = driver
			.findElement(By.xpath("(//div[contains(text(),'Assigned Color')])"));
		if (assignclr.isDisplayed()) {
		System.out.println("assigned colour for new group is displayed");
		} else {
		System.out.println("assigned colour for new group not displayed");
		}

		
//time

		WebElement createdon = driver.findElement(By.xpath("(//div[contains(text(),'Created On')])"));
		WebElement dateTime = driver.findElement(By.xpath("(//span[contains(@class,'text__light')])"));

		if (createdon.isDisplayed() && dateTime.getText() != "") {
		System.out.println("Time is displayed");
		} else {
		System.out.println("Time is not displayed");
		}
		System.out.println("new created group name is=" + dateTime.getText());

//Actions
		WebElement Actions = driver.findElement(By.xpath("(//div[contains(text(),'Actions')])"));
		if (Actions.isDisplayed()) {
			System.out.println("Actions colomn for new group is displayed");
			} else {
			System.out.println("Actions colomn for new group not displayed");
			}		
			WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
			WebElement delete = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])"));
			WebElement copy = driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])"));
			if(edit.isDisplayed() && delete.isDisplayed() && copy.isDisplayed())			
			System.out.println("All Actions for new group is displayed");
			else
			System.out.println("All Actions for new group is displayed");			
		Actionsperformedonlogicalgrouping(driver);			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

			private static void Actionsperformedonlogicalgrouping(WebDriver driver) throws Exception {
			try {
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				
//Edit Action
				WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
				System.out.println("Edit Action is displayed");				
				js.executeScript("arguments[0].click()", edit);
				Thread.sleep(4000);					
				WebElement Addbrand1 = driver.findElement(By.xpath("(//span[contains(text(),'Oracle CRM ')])"));				
				js.executeScript("arguments[0].click()", Addbrand1);
				Thread.sleep(4000);	
				WebElement deletebrand1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[4]"));				
				js.executeScript("arguments[0].click()", deletebrand1);
				Thread.sleep(4000);	
				WebElement update = driver.findElement(By.xpath("(//span[contains(text(),' Update ')])"));				
				js.executeScript("arguments[0].click()", update);
				Thread.sleep(4000);	

//Copy Action
				WebElement copy = driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])"));
				System.out.println("Copy Action is displayed");				
				js.executeScript("arguments[0].click()", copy);
				Thread.sleep(4000);	
//Verify UI Components of Copy section

//Copy logical group brands to other groups Heading

			
				WebElement CreateHeading=driver.findElement(By.xpath("(//p[contains(text(),'Copy logical group brands to other groups')])"));
				if(CreateHeading.isDisplayed())
					System.out.println("Copy logical group brands to other groups Heading is displayed");
				else 
					System.out.println("Copy logical group brands to other groups Heading is not displayed");
					
//Selected logical source group Heading and information

			
			WebElement DefineHeading=driver.findElement(By.xpath("(//p[contains(text(),'Selected logical source group')])"));
			WebElement DefineInformation=driver.findElement(By.xpath("(//p[contains(text(),'Selected logical source group')])//following::P[1]"));
			if(DefineHeading.isDisplayed() &&  DefineInformation.isDisplayed())
				System.out.println("Selected logical source group Heading and information is displayed");
			else 
				System.out.println("Selected logical source group Heading and information is not displayed");
				
			
//Selected Logical Group textbox
			WebElement selectedtextbox=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[3]"));
			if(selectedtextbox.isDisplayed())
				System.out.println("Selected Logical Group textbox is displayed");
			else 
				System.out.println("Selected Logical Group textbox is not displayed");
			
// Brands of Selected Logical Group textbox
			WebElement Brands=driver.findElement(By.xpath("(//p[contains(text(),'Brands')])"));
			if(Brands.isDisplayed())
				System.out.println("Brands of Selected Logical Group are displayed");
			else 
				System.out.println("Brands of Selected Logical Group are not displayed");
			
//Select destination group Heading and information

			
			WebElement destinationgrp=driver.findElement(By.xpath("(//p[contains(text(),'Select destination group')])"));
			WebElement destinationgrpinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select destination group')])//following::p[1]"));
			if(destinationgrp.isDisplayed() &&  destinationgrpinfo.isDisplayed())
				System.out.println("Select destination group Heading and information is displayed");
			else 
				System.out.println("Select destination group Heading and information is not displayed");
				
			
//Select  Group textbox
			WebElement selectgrptextbox=driver.findElement(By.xpath("(//input[@placeholder='Search groups'])"));
			if(selectgrptextbox.isDisplayed())
				System.out.println("Select  Group textbox is displayed");
			else 
				System.out.println("Select  Group textbox is not displayed");

//Replace brands inside logical group
			WebElement checkbox=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])"));
			WebElement replaceinfo=driver.findElement(By.xpath("(//span[contains(text(),'Replace brands inside logical groups')])"));
			if(checkbox.isDisplayed() && replaceinfo.isDisplayed()) 
				System.out.println("Replace brands inside logical group  field is present");
			else 
				System.out.println("Replace brands inside logical group field is not present");

//close copy field
			WebElement cross=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close ')])[1]"));
			if(cross.isDisplayed())
				System.out.println("close copy field is present");
			else 
				System.out.println("close copy field is not present");			
					
//performing copy action
//Select  Group textbox
			WebElement selectgrptextbox1=driver.findElement(By.xpath("(//input[@placeholder='Search groups'])"));
		    js.executeScript("arguments[0].click()", selectgrptextbox1);
			Thread.sleep(4000);	
			WebElement selectgrp=driver.findElement(By.xpath("(//span[contains(text(),'Kalyan demo 2')])[1]"));
		    js.executeScript("arguments[0].click()", selectgrp);
			Thread.sleep(4000);				

//Replace brands inside logical group
			WebElement checkbox1=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])"));
			js.executeScript("arguments[0].click()", checkbox1);
			Thread.sleep(4000);	

//copy brands
			WebElement copybrands=driver.findElement(By.xpath("//span[contains(text(),'Copy Brands')]"));
			js.executeScript("arguments[0].click()", copybrands);
			Thread.sleep(4000);	


//search brand copied grp
			WebElement searchField=driver.findElement(By.xpath("(//input[@data-placeholder='Search by Group Name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			searchField.clear();
			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("kalyan");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", symbol);	
            Thread.sleep(3000);	
            searchField.clear();
            js.executeScript("arguments[0].click()", searchField);
 			searchField.sendKeys("komal");
 			Thread.sleep(3000);
 			js.executeScript("arguments[0].click()", symbol);	
            Thread.sleep(3000);		
            
//Verifying in war room   
            WebElement arrowback = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));			
            System.out.println("arrowback Action is displayed");				
			js.executeScript("arguments[0].click()", arrowback);
			Thread.sleep(4000);
			WebElement commandcentre = driver.findElement(By.xpath("//span[contains(text(),' Command Center')]"));			
            System.out.println("commandcentre Action is displayed");				
			js.executeScript("arguments[0].click()", commandcentre);
			Thread.sleep(4000);
			
			WebElement searchcontent = driver.findElement(By.xpath("//mat-label[contains(text(),'Select Brand Logical Group')]"));			
            System.out.println("arrowback Action is displayed");				
			js.executeScript("arguments[0].click()", searchcontent);
			Thread.sleep(4000);
			WebElement selectbrand = driver.findElement(By.xpath("//span[contains(text(),' Komal LogicalGroupingAutoDemo1 ')]"));			
            System.out.println("selectbrand Action is displayed");				
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(4000);
			/*WebElement launch = driver.findElement(By.xpath(" //span[contains(text(),'Launch')] "));			
            System.out.println("launch Action is displayed");				
			js.executeScript("arguments[0].click()", launch);
			Thread.sleep(4000);
			ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));	
			WebElement selectbrand = driver.findElement(By.xpath("//span[contains(text(),' Komal LogicalGroupingAutoDemo1 ')]"));			
            System.out.println("selectbrand Action is displayed");				
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(4000);
			WebElement selectbrandautodemo = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));			
            System.out.println("selectbrandautodemo Action is displayed");				
			js.executeScript("arguments[0].click()", selectbrandautodemo);
			Thread.sleep(5000);
			WebElement accounts = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));			
          	js.executeScript("arguments[0].click()", accounts);
			Thread.sleep(2000);
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(10000);*/
			WebElement accounts1 = driver.findElement(By.xpath(" //span[contains(text(),'Accounts')]"));			
          	js.executeScript("arguments[0].click()", accounts1);
			Thread.sleep(2000);
			WebElement listningsettings = driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));			
          	js.executeScript("arguments[0].click()", listningsettings);
			Thread.sleep(2000);
			WebElement competitors = driver.findElement(By.xpath("//span[contains(text(),'Logical Grouping')]"));			
          	js.executeScript("arguments[0].click()", competitors);
			Thread.sleep(2000);
			WebElement selectbrand1 = driver.findElement(By.xpath("(//input[@data-placeholder='Search by Group Name'])"));			
          	js.executeScript("arguments[0].click()", selectbrand1);
			Thread.sleep(2000);
			//selectbrand1.sendKeys("Komal LogicalGroupingAutoDemo1 ");
			//Thread.sleep(2000);
			WebElement symbold=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(selectbrand1.isDisplayed()&&symbold.isDisplayed()) 
				System.out.println("Search Field is displayed");
			else 
				System.out.println("Search Field is not displayed");
			Thread.sleep(3000);				


			js.executeScript("arguments[0].click()", selectbrand1);
			selectbrand1.sendKeys("Komal LogicalGroupingAutoDemo1");
			Thread.sleep(3000);
			WebElement symbold1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", symbold1);	
             Thread.sleep(3000);	
			
            
//Performing Delete Action			
            WebElement delete = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])"));			
            System.out.println("Delete Action is displayed");				
			js.executeScript("arguments[0].click()", delete);
			Thread.sleep(4000);
		    WebElement CONFIRMDELETE = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));			
	        System.out.println("Delete Action Confirm Validation message is displayed");				
		    js.executeScript("arguments[0].click()", CONFIRMDELETE);
			Thread.sleep(4000);
//Search After delete Operation
			//js.executeScript("arguments[0].click()", searchField);
		 	//searchField.sendKeys("komal");
		 	//Thread.sleep(3000);
			WebElement symbold12=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
		 	js.executeScript("arguments[0].click()", symbold12);	
		    Thread.sleep(3000);				
			
			}catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
		}
}
	


