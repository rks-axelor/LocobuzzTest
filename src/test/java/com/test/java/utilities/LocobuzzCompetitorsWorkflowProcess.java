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


public class LocobuzzCompetitorsWorkflowProcess {
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

	

	public static void CompetitorsWorkprocess(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

// Listening Settings
			WebElement ListeningSettings=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));
			if(ListeningSettings.isDisplayed()) 
				System.out.println(" Listening Settings is displayed");
			else 
				System.out.println(" Listening Settings is not displayed");
			js.executeScript("arguments[0].click()", ListeningSettings);
			Thread.sleep(3000);
			
//Competitors Label in Account Section
			
			
			
			WebElement Competitorslabel=driver.findElement(By.xpath("(//span[contains(text(),'Competitors')])[1]"));
			WebElement Competitorslogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Competitors.svg']"));
			if(Competitorslabel.isDisplayed())
				System.out.println("Competitors Label in Account Section is displayed");
			else 
				System.out.println("Competitors Label in Account Section not displayed");
				js.executeScript("arguments[0].click()", Competitorslabel);
			Thread.sleep(3000);
			
//Competitors Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement Logicalgroupingtab=driver.findElement(By.xpath("(//span[contains(text(),'Competitors')])[2]"));
			if(pushpin.isDisplayed()&&Logicalgroupingtab.isDisplayed()) 
				System.out.println("Competitors Tab is displayed");
			else 
				System.out.println("Competitors Tab is not displayed");
				
//Map Your Competitors Heading and Information	

			WebElement MapHeading=driver.findElement(By.xpath("(//p[contains(text(),'Map Your Competitors')])"));
			WebElement MapInformation=driver.findElement(By.xpath("(//p[contains(text(),'Map Your Competitors')])//following::p[1]"));
			if(MapHeading.isDisplayed()&&MapInformation.isDisplayed()) 
				System.out.println("Map Your Competitors Heading and Information is displayed");
			else 
				System.out.println("Map Your Competitors Heading and Information is not displayed");
			
//search field
			WebElement searchField=driver.findElement(By.xpath("(//input[@data-placeholder='Search by Brand Name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchField.isDisplayed()&&symbol.isDisplayed()) 
				System.out.println("Search Field is displayed");
			else 
				System.out.println("Search Field is not displayed");
			Thread.sleep(3000);				


			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("Auto Demo");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", symbol);	
             Thread.sleep(3000);	
             MapnewCompetitorsprocess(driver);
         	WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
             
private static void MapnewCompetitorsprocess(WebDriver driver) throws Exception {
	try {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

//Map New Competitors 
		WebElement MapNewCompetitorslogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle_outline')]"));
		WebElement MapNewCompetitorslabel=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]"));
		if(MapNewCompetitorslogo.isDisplayed() && MapNewCompetitorslabel.isDisplayed()) 
			System.out.println("Map New Competitors Field is displayed");
	    else 
			System.out.println("Map New Competitors Field is not displayed");
			js.executeScript("arguments[0].click()", MapNewCompetitorslabel);
		Thread.sleep(5000);

//Map New Competitors Field UI Components			
//Map New Competitors Heading			
			WebElement MappingHeading=driver.findElement(By.xpath("//h3[contains(text(),'Map New Competitors')]"));
			WebElement MappingInformation=driver.findElement(By.xpath("//h3[contains(text(),'Map New Competitors')]//following::p[1]"));		
			if(MappingHeading.isDisplayed() && MappingInformation.isDisplayed())
				System.out.println("Map New Competitors Heading and Information is displayed");
			else 
				System.out.println("Map New Competitors Heading and Information is not displayed");
				Thread.sleep(3000);

//Select Your Main Brand Field			
		WebElement Mainbrandselect=driver.findElement(By.xpath("//p[contains(text(),'Select Your Main Brand ')]"));
		WebElement mustselectmain=driver.findElement(By.xpath("//p[contains(text(),'Select Your Main Brand ')]//following::span[1]"));
		if(Mainbrandselect.isDisplayed() &&  mustselectmain.isDisplayed())
			System.out.println("Select Your Main Brand Field is displayed");
		else 
			System.out.println("Select Your Main Brand Field is not displayed");
			Thread.sleep(3000);
		
//Select Main Brand TextBox field 			
		WebElement SelectmainTextbox=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value ng-tns-c')])"));
		WebElement dropdownmain=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])"));
		if( dropdownmain.isDisplayed()) 
			System.out.println("Enter groupname field is present");
		else 
			System.out.println("Enter groupname field is not present");
			js.executeScript("arguments[0].click()", dropdownmain);
		    Thread.sleep(5000);

//search brand	
		WebElement searchbrand=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
		WebElement symbol1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
		if(searchbrand.isDisplayed() &&  symbol1.isDisplayed()) 
			System.out.println("Search brands  Text Box field is present");
		else 
		System.out.println("Search brands  Text Box field is not  present");
		js.executeScript("arguments[0].click()", searchbrand);
		Thread.sleep(5000);		
		WebElement select1=driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));	
		js.executeScript("arguments[0].click()", select1);
		Thread.sleep(5000);
		System.out.println("Competitors for that brand are Displayed");

//Select Competitors Field
					
		WebElement SelectCompetitorsHeading=driver.findElement(By.xpath("(//p[contains(text(),'Select Competitors')])"));
		WebElement SelectCompetitorsmust=driver.findElement(By.xpath("(//p[contains(text(),'Select Competitors')])//following::span[1]"));
		WebElement SelectCompetitorsinformation=driver.findElement(By.xpath("(//p[contains(text(),'Select Competitors')])//following::p[1]"));
		
		if(SelectCompetitorsHeading.isDisplayed() && SelectCompetitorsmust.isDisplayed() && SelectCompetitorsinformation.isDisplayed() ) 
			System.out.println("Select Competitors Field is present");
		else 
			System.out.println("Select Competitors Field is not  present");
			Thread.sleep(3000);

//Search brands as Competitors Text Box field
		
		WebElement barandsearch=driver.findElement(By.xpath("(//input[@placeholder='Type to search'])"));
		if(barandsearch.isDisplayed() ) 
			System.out.println("Search brands as Competitors Text Box field is present");
		else 
			System.out.println("Search brands as Competitors Text Box field is not  present");
			Thread.sleep(3000);
			WebElement barandselect1=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));		
			js.executeScript("arguments[0].click()", barandselect1);
			Thread.sleep(5000);
			/*WebElement barandselect2=driver.findElement(By.xpath("(//span[contains(text(),'Dialog chatbot')])"));		
			js.executeScript("arguments[0].click()", barandselect2);
			Thread.sleep(5000);
			WebElement barandselect3=driver.findElement(By.xpath("(//span[contains(text(),'Nutan')])"));		
			js.executeScript("arguments[0].click()", barandselect3);
			Thread.sleep(5000);
			WebElement barandselect4=driver.findElement(By.xpath("(//span[contains(text(),'DELL')])"));		
			js.executeScript("arguments[0].click()", barandselect4);
			Thread.sleep(5000);
			WebElement barandselect5=driver.findElement(By.xpath("(//span[contains(text(),'Dmart')])"));		
			js.executeScript("arguments[0].click()", barandselect5);
			Thread.sleep(5000);*/

//Save Button
		WebElement Save=driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
		if(Save.isDisplayed()) 
			System.out.println("Save Button is Present");
		else 
			System.out.println("Save Button is not Present");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Save);
			Thread.sleep(5000);



			VerifymappingCompetitorsDetails(driver);
	}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
	}
}
			
			private static void VerifymappingCompetitorsDetails(WebDriver driver) throws Exception {
				
	try {
	
//Brandname

		WebElement Brandname = driver
			.findElement(By.xpath("(//div[contains(text(),'Brand Name')])"));
		if (Brandname.isDisplayed()) 
		System.out.println("Brandname is displayed");
		else 
		System.out.println("Brandname is not displayed");
		WebElement newBrandname = driver
				.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])"));
		System.out.println("new created brand name is=" + newBrandname.getText());
		
//Competitors

		WebElement Competitors = driver.findElement(By.xpath("(//th[contains(text(),'Competitors')])"));
		if (Competitors.isDisplayed()) {
		System.out.println("Competitors are  displayed");
		} else {
		System.out.println("Competitors are not  displayed");
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
		if (Actions.isDisplayed()) 
			System.out.println("Actions colomn for new group is displayed");
		else 
			System.out.println("Actions colomn for new group not displayed");
					
			WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
			WebElement delete = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])"));
			WebElement copy = driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])"));
			if(edit.isDisplayed() && delete.isDisplayed() && copy.isDisplayed())			
			System.out.println("All Actions for new mapped brand are displayed");
			else
			System.out.println("All Actions for new mapped brand are not displayed");			
		Actionsperformedonmappedbrand(driver);			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

			private static void Actionsperformedonmappedbrand(WebDriver driver) throws Exception {
			try {
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				
//Edit Action
				WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
				System.out.println("Edit Action is displayed");				
				js.executeScript("arguments[0].click()", edit);
				Thread.sleep(4000);					
				/*WebElement Addbrand1 = driver.findElement(By.xpath("(//span[contains(text(),'BittuLoco2030')])"));				
				js.executeScript("arguments[0].click()", Addbrand1);
				Thread.sleep(4000);	*/
				WebElement deletebrand1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'highlight_off')])[1]"));				
				js.executeScript("arguments[0].click()", deletebrand1);
				Thread.sleep(4000);	
				WebElement update = driver.findElement(By.xpath("(//span[contains(text(),'Update')])"));				
				js.executeScript("arguments[0].click()", update);
				Thread.sleep(4000);	
				WebElement barandselect1=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));		
				js.executeScript("arguments[0].click()", barandselect1);
				Thread.sleep(5000);
				WebElement update2 = driver.findElement(By.xpath("(//span[contains(text(),'Update')])"));				
				js.executeScript("arguments[0].click()", update2);
				Thread.sleep(4000);	
//Copy Action
				WebElement copy = driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])"));
				System.out.println("Copy Action is displayed");				
				js.executeScript("arguments[0].click()", copy);
				Thread.sleep(4000);	
//Verify UI Components of Copy section

//Copy Competitors to other brands Heading

				WebElement CopyHeading=driver.findElement(By.xpath("(//p[contains(text(),'Copy Competitors to other brands')])"));
				WebElement CopyInformation=driver.findElement(By.xpath("(//p[contains(text(),'Copy Competitors to other brands')])//following::P[1]"));		
				if(CopyHeading.isDisplayed() && CopyInformation.isDisplayed())
					System.out.println("Copy Competitors to other brands Heading and Information is displayed");
				else 
					System.out.println("Copy Competitors to other brands Heading and Information is not displayed");
								
//Selected competitors source brand Heading and information

			
			WebElement Sourceheading=driver.findElement(By.xpath("(//p[contains(text(),'Selected competitors source brand')])"));
			WebElement sourceInformation=driver.findElement(By.xpath("(//p[contains(text(),'Selected competitors source brand')])//following::p[1]"));
			if(Sourceheading.isDisplayed() &&  sourceInformation.isDisplayed())
				System.out.println("Selected competitors source brand Heading and information is displayed");
			else 
				System.out.println("Selected competitors source brand Heading and information is not displayed");
				
			
//Sorce Brand textbox
			WebElement sourcebrandtextbox=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[3]"));
			if(sourcebrandtextbox.isDisplayed())
				System.out.println("Selected Logical Group textbox is displayed");
			else 
				System.out.println("Selected Logical Group textbox is not displayed");
			WebElement SourceBrand=driver.findElement(By.xpath("(//div[contains(@class,'d-flex-items-center ng-tns-c')])[1]"));
			System.out.println("Selected brand for copy" + SourceBrand.getText() );

//Competitors
			WebElement Competitors=driver.findElement(By.xpath("(//p[contains(text(),'Competitors')])[4]"));
			if(Competitors.isDisplayed())
				System.out.println("Competitors are displayed");
			else 
				System.out.println("Competitors are not displayed");
			
//Select destination brand Heading and information

			
			WebElement destinationbrand=driver.findElement(By.xpath("(//p[contains(text(),'Select destination brand')])"));
			WebElement destinationbrandinfo=driver.findElement(By.xpath("(//p[contains(text(),'Select destination brand')])//following::p[1]"));
			if(destinationbrand.isDisplayed() &&  destinationbrandinfo.isDisplayed())
				System.out.println("Select destination brand Heading and information is displayed");
			else 
				System.out.println("Select destination brand Heading and information is not displayed");
				
			
//Select  Destination Brand textbox
			WebElement Destinationtextbox=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
			if(Destinationtextbox.isDisplayed())
				System.out.println("Select  Destination Brand textbox is displayed");
			else 
				System.out.println("Select  Destination Brand textbox is not displayed");

//Replace brands
			WebElement checkbox=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])"));
			WebElement replaceinfo=driver.findElement(By.xpath("(//span[contains(text(),'Replace brands')])"));
			if(checkbox.isDisplayed() && replaceinfo.isDisplayed()) 
				System.out.println("Replace brands field is present");
			else 
				System.out.println("Replace brands field is not present");

//close copy field
			WebElement cross=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close ')])[1]"));
			if(cross.isDisplayed())
				System.out.println("close copy field is present");
			else 
				System.out.println("close copy field is not present");			
					
//performing copy action
//Select  Group textbox
			WebElement selectgrptextbox1=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
		    js.executeScript("arguments[0].click()", selectgrptextbox1);
			Thread.sleep(4000);	
			WebElement selectgrp=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
		    js.executeScript("arguments[0].click()", selectgrp);
			Thread.sleep(4000);				

//Replace brands inside logical group
			WebElement checkbox1=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])"));
			js.executeScript("arguments[0].click()", checkbox1);
			Thread.sleep(4000);	

//copy brands
			WebElement copybrands=driver.findElement(By.xpath("//span[contains(text(),' Copy Competitors')]"));
			js.executeScript("arguments[0].click()", copybrands);
			Thread.sleep(4000);	


//search brand copied grp
			WebElement searchField=driver.findElement(By.xpath("(//input[@data-placeholder='Search by Brand Name'])"));
			WebElement symbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			searchField.clear();
			js.executeScript("arguments[0].click()", searchField);
			searchField.sendKeys("Titan");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", symbol);	
            Thread.sleep(3000);	
            WebElement delete2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])"));			
            System.out.println("Delete Action is displayed");				
			js.executeScript("arguments[0].click()", delete2);
			Thread.sleep(4000);
		    WebElement CONFIRMDELETE2 = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));			
	        System.out.println("Delete Action Confirm Validation message is displayed");				
		    js.executeScript("arguments[0].click()", CONFIRMDELETE2);
			Thread.sleep(4000);
			WebElement symbol3=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", symbol3);	
		    Thread.sleep(3000);		

            searchField.clear();
            js.executeScript("arguments[0].click()", searchField);
 			searchField.sendKeys("Auto demo");
 			Thread.sleep(3000);
 			js.executeScript("arguments[0].click()", symbol);	
            Thread.sleep(3000);	
            
//Copy Compititors without replace brands
		    WebElement copy1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'content_copy')])"));
			System.out.println("Copy Action is displayed");				
			js.executeScript("arguments[0].click()", copy1);
			Thread.sleep(4000);	
			
//Select  Group textbox
			WebElement selectgrptextbox11=driver.findElement(By.xpath("(//input[@placeholder='Search Brand'])"));
		    js.executeScript("arguments[0].click()", selectgrptextbox11);
			Thread.sleep(4000);	
			WebElement selectgrp1=driver.findElement(By.xpath("(//span[contains(text(),'Titan')])"));
		    js.executeScript("arguments[0].click()", selectgrp1);
			Thread.sleep(4000);				

//copy brands
			WebElement copybrands1=driver.findElement(By.xpath("//span[contains(text(),' Copy Competitors')]"));
			js.executeScript("arguments[0].click()", copybrands1);
			Thread.sleep(4000);	


//search brand copied grp
			WebElement searchFieldx=driver.findElement(By.xpath("(//input[@data-placeholder='Search by Brand Name'])"));
			WebElement symbolx=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			searchField.clear();
			js.executeScript("arguments[0].click()", searchFieldx);
			searchField.sendKeys("Titan");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", symbolx);	
            Thread.sleep(3000);
        	searchField.clear();
        	 Thread.sleep(3000);
            js.executeScript("arguments[0].click()", searchField);
 			searchField.sendKeys("Auto demo");
 			Thread.sleep(3000);
 			js.executeScript("arguments[0].click()", symbol);	
            Thread.sleep(3000);	
//verifying in war room /dcc
            WebElement arrowback = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));			
            System.out.println("arrowback Action is displayed");				
			js.executeScript("arguments[0].click()", arrowback);
			Thread.sleep(4000);
			WebElement commandcentre = driver.findElement(By.xpath("//span[contains(text(),' Command Center')]"));			
            System.out.println("commandcentre Action is displayed");				
			js.executeScript("arguments[0].click()", commandcentre);
			Thread.sleep(4000);
			
			WebElement searchcontent = driver.findElement(By.xpath("//input[@data-placeholder='Search for post content']"));			
            System.out.println("arrowback Action is displayed");				
			js.executeScript("arguments[0].click()", searchcontent);
			Thread.sleep(4000);
			searchcontent.sendKeys("Share of Voice");
			Thread.sleep(2000);
			WebElement launch = driver.findElement(By.xpath(" //span[contains(text(),'Launch')] "));			
            System.out.println("launch Action is displayed");				
			js.executeScript("arguments[0].click()", launch);
			Thread.sleep(4000);
			ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));	
			WebElement selectbrand = driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])[1]"));			
            System.out.println("selectbrand Action is displayed");				
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(4000);
			WebElement selectbrandautodemo = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));			
            System.out.println("selectbrandautodemo Action is displayed");				
			js.executeScript("arguments[0].click()", selectbrandautodemo);
			Thread.sleep(5000);
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(10000);
			WebElement accounts1 = driver.findElement(By.xpath(" //span[contains(text(),'Accounts')]"));			
          	js.executeScript("arguments[0].click()", accounts1);
			Thread.sleep(2000);
			WebElement listningsettings = driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Listening Settings')])[1]"));			
          	js.executeScript("arguments[0].click()", listningsettings);
			Thread.sleep(2000);
			WebElement competitors = driver.findElement(By.xpath("(//span[contains(text(),'Competitors')])[1]"));			
          	js.executeScript("arguments[0].click()", competitors);
			Thread.sleep(2000);
			WebElement selectbrand1 = driver.findElement(By.xpath("(//input[@data-placeholder='Search by Brand Name'])"));			
          	js.executeScript("arguments[0].click()", selectbrand1);
			Thread.sleep(2000);
			WebElement symbold=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(selectbrand1.isDisplayed()&&symbold.isDisplayed()) 
				System.out.println("Search Field is displayed");
			else 
				System.out.println("Search Field is not displayed");
			Thread.sleep(3000);				


			js.executeScript("arguments[0].click()", selectbrand1);
			searchField.sendKeys("Auto Demo");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", symbold);	
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
		 	js.executeScript("arguments[0].click()", symbol);	
		    Thread.sleep(3000);				
		    WebElement searchField2=driver.findElement(By.xpath("(//input[@data-placeholder='Search by Brand Name'])"));
		    js.executeScript("arguments[0].click()", searchField2);
 			searchField.sendKeys("Titan");
 			Thread.sleep(3000);
 			WebElement symbol2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
 			js.executeScript("arguments[0].click()", symbol2);	
            Thread.sleep(3000);				
            
//Performing Delete Action			
            WebElement deletex = driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])"));			
            System.out.println("Delete Action is displayed");				
			js.executeScript("arguments[0].click()", deletex);
			Thread.sleep(4000);
		    WebElement CONFIRMDELETEx = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));			
	        System.out.println("Delete Action Confirm Validation message is displayed");				
		    js.executeScript("arguments[0].click()", CONFIRMDELETEx);
			Thread.sleep(4000);
			WebElement symbolxz=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", symbolxz);	
		    Thread.sleep(3000);		
			}catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
		}

	
	
		
	}


