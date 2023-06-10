package com.test.java.utilities;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocCreateManualTicketAccountWorkflow {
public static List<String> componentsInformation = new ArrayList<String>();
public static void goingAccountSession(WebDriver driver) throws Exception {
try {
			Thread.sleep(3000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    //tickets tab
			Thread.sleep(5000);
			Thread.sleep(3000);
		
			WebElement sideBar = driver.findElement(By.xpath("//img[@src='assets/images/Locobuzz_Symbol.svg']"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("//mat-icon[contains(text(),'expand_less')]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement socialinboxSession = driver.findElement(By.xpath("//span[contains(text(),'Social Inbox')]"));
			js.executeScript("arguments[0].click()", socialinboxSession);
			Thread.sleep(3000);
			WebElement ticketsTab = driver
			.findElement(By.xpath("//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));

			
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);
			Thread.sleep(3000);
		    WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement search = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
			Thread.sleep(2000);
			WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
			js.executeScript("arguments[0].click()", Brandselect);
			Thread.sleep(3000);
			WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
			js.executeScript("arguments[0].click()", Selectbrand);
			WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Auto Demo')]"));
			js.executeScript("arguments[0].click()", Selectbrand1);
			Thread.sleep(3000);
			WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", Apply);
			Thread.sleep(5000);
			
//Create Manual Ticket Label
			WebElement icon=driver.findElement(By.xpath("//img[@src='assets/images/Locobuzz_Symbol.svg']"));
			if(icon.isDisplayed()) {			
			System.out.println("Create Manual Ticket Icon field is displayed");
		    }
			else {
			System.out.println("Create Manual Ticket Icon field is not displayed");
			}
			
			Thread.sleep(3000);

			WebElement sideBar1 = driver.findElement(By.xpath("//img[@src='assets/images/Locobuzz_Symbol.svg']"));
			Actions builder1 = new Actions(driver);
			//Action mouseOverHome1 = builder1.moveToElement(sideBar1).build();
			//mouseOverHome1.perform();
			Thread.sleep(2000);

			WebElement expand1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'expand_less')]"));
			js.executeScript("arguments[0].click()", expand1);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("(//mat-icon[contains(text(),'account_box')])[1]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);			
}
catch(Exception e) 
{
		    e.printStackTrace();
			throw e;
}
}
	
public static void CreateManualticketAccountFunctionality(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Adv Response Management
			WebElement advremngt=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Adv. Response Management')]"));
			if(advremngt.isDisplayed()) {
			System.out.println("Adv Response Management is displayed");
			}
			else {
			System.out.println("Adv Response Management is not displayed");
			}
			js.executeScript("arguments[0].click()", advremngt);
			Thread.sleep(3000);
			
//Create Manual Ticket Label in Account Section
			WebElement crmanualticketlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Create_Manual_Ticket.svg']"));
			WebElement crmanualticketlabel=driver.findElement(By.xpath("//span[contains(text(),'Create Manual Ticket')]"));
			if(crmanualticketlogo.isDisplayed()&&crmanualticketlabel.isDisplayed()) {
			System.out.println("Create Manual Ticket Label in Account Section is displayed");
			}
			else {
			System.out.println("Create Manual Ticket Label in Account Section is not displayed");
			}
			js.executeScript("arguments[0].click()", crmanualticketlabel);
			Thread.sleep(3000);
			
//Create Manual Ticket Tab
			WebElement pushpin=driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement Createmanualtab=driver.findElement(By.xpath("(//span[contains(text(),'Create Manual Ticket')])[2]"));
			if(pushpin.isDisplayed()&&Createmanualtab.isDisplayed()) {
			System.out.println("Create Manual Ticket Tab is displayed");
			}
			else {
			System.out.println("Create Manual Ticket Tab is not displayed");
			}

//Create Manual Ticket Tab Heading and Information	

			WebElement CMTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Create Manual Ticket Setting')])"));
			WebElement CMTInformation=driver.findElement(By.xpath("(//p[contains(text(),'Create Manual Ticket Setting')])//following::p[1]"));
			if(CMTHeading.isDisplayed()&&CMTInformation.isDisplayed()) {
			System.out.println("Create Manual Ticket Tab Heading and Information is displayed");
			}
			else {
			System.out.println("Create Manual Ticket Tab Heading and Information is not displayed");
			}
			
// Select Brand Field
			WebElement selectbrandlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
			WebElement selectbrdrpdn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])"));
			if(selectbrandlabel.isDisplayed() & selectbrdrpdn.isDisplayed()) {
			System.out.println("Select Brand Field is displayed");
			}
			else {
			System.out.println("Select Brand Field is not displayed");
			}
			js.executeScript("arguments[0].click()", selectbrdrpdn);
			Thread.sleep(3000);
			WebElement swiggy=driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));
			js.executeScript("arguments[0].click()", swiggy);
			Thread.sleep(3000);

//Role and act/inactive label Field
			WebElement Role=driver.findElement(By.xpath("//th[contains(text(),'Role')]"));
			WebElement actinact=driver.findElement(By.xpath("//th[contains(text(),' Active/Inactive')]"));
			if(Role.isDisplayed()&&actinact.isDisplayed()) {
			System.out.println("Role and act/inactive label Field is displayed");
			}
			else {
			System.out.println("Role and act/inactive label Field is not displayed");
			}
			Thread.sleep(3000);	
			WebElement supervisortoggle=driver.findElement(By.xpath("(//label[contains(@class,'rounded-toggle-switch-label')])[2]"));
			js.executeScript("arguments[0].click()", supervisortoggle);
			Thread.sleep(3000);
			WebElement agenttoggle=driver.findElement(By.xpath("(//label[contains(@class,'rounded-toggle-switch-label')])[1]"));
			js.executeScript("arguments[0].click()", agenttoggle);
			Thread.sleep(3000);


//Autoacknowledgement Email Field
	        WebElement Autoackwheading=driver.findElement(By.xpath("//p[contains(text(),'Auto Acknowledgement Email')]"));
	        WebElement Autoackwinfo=driver.findElement(By.xpath("//p[contains(text(),'Auto Acknowledgement Email')]//following::p[1]"));				
	        WebElement note=driver.findElement(By.xpath("//span[contains(text(),'Note:')]"));				

			if(Autoackwheading.isDisplayed() && Autoackwinfo.isDisplayed() && note.isDisplayed()) {
			System.out.println("Autoacknowledgement Email Field is displayed");
			}
			else {
			System.out.println("Autoacknowledgement Email Field is not displayed");
			}
			Thread.sleep(3000);	          

//Sent Autoacknowledgement Mail Field
			WebElement Checkbox=driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-inner-container')]"));
			WebElement Sentautoackwlabel=driver.findElement(By.xpath("//label[contains(@class,'mat-checkbox-layout')]"));
		
			if(Checkbox.isDisplayed() && Sentautoackwlabel.isDisplayed() ) {
			System.out.println("Sent Autoacknowledgement Mail Field is present");
			}
			else {
			System.out.println("Sent Autoacknowledgement Mail Field is not present");
			}
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			

agentlogin(driver);
}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//Agent Login Verification
public static void agentlogin(WebDriver driver) throws Exception {
	try {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//Agentlogin
		 String parent = driver.getWindowHandle();
		 System.out.println("Main window handle is " + parent);
		 Thread.sleep(2000);
		 
//Child window Handle
		    
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://locobuzzng-uat-aws.locobuzz.com/login");
	    Thread.sleep(5000);
		CommonFunctions.login(driver, "Agent");
		Thread.sleep(7000);
		   	
        WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement search = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),'search')])[1]")));
		Thread.sleep(2000);
		WebElement Brandselect1 = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		Brandselect1.click();
		 Thread.sleep(2000);
		WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrand);
		 Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Auto Demo')]"));   
		Selectbrand1.click();
		Thread.sleep(3000);
		
		Actions actions1 = new Actions(driver);
		WebElement Apply1 = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		Apply1.click();
		Thread.sleep(3000);
		
        
// logout
        //CommonFunctions.logout(driver);
        driver.switchTo().window(tabs.get(0)); 
		Thread.sleep(5000);
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		WebElement search3 = wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
		Thread.sleep(2000);
		Actions action3 = new Actions(driver); 
		WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		js.executeScript("arguments[0].click()", Brandselect);
		WebElement Selectbrandz = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrandz);
		WebElement Selectbrandx = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Auto Demo')]"));
		js.executeScript("arguments[0].click()", Selectbrandx);
		WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		js.executeScript("arguments[0].click()", Apply);
		Thread.sleep(5000);
		
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
//Adv Response Management
		WebElement advremngt=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Adv. Response Management')]"));
		js.executeScript("arguments[0].click()", advremngt);
		Thread.sleep(3000);
		
//Create Manual Ticket Label in Account Section
		WebElement crmanualticketlogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Create_Manual_Ticket.svg']"));
		WebElement crmanualticketlabel=driver.findElement(By.xpath("//span[contains(text(),'Create Manual Ticket')]"));
		js.executeScript("arguments[0].click()", crmanualticketlabel);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(8000);
//Select Brand Field
		WebElement selectbrandlabel=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])"));
		WebElement selectbrdrpdn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])"));
		js.executeScript("arguments[0].click()", selectbrdrpdn);
		Thread.sleep(3000);
		WebElement swiggy=driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));
		js.executeScript("arguments[0].click()", swiggy);
		Thread.sleep(3000);

//Role and act/inactive label Field
		WebElement supervisortoggle=driver.findElement(By.xpath("(//label[contains(@class,'rounded-toggle-switch-label')])[2]"));
		js.executeScript("arguments[0].click()", supervisortoggle);
		Thread.sleep(3000);
		WebElement agenttoggle=driver.findElement(By.xpath("(//label[contains(@class,'rounded-toggle-switch-label')])[1]"));
		js.executeScript("arguments[0].click()", agenttoggle);
		Thread.sleep(3000);
		WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
		js.executeScript("arguments[0].click()", arrowBack1);
		Thread.sleep(3000);
		Teamleadandagentverificationlogin(driver);

}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
}
}
public static void Teamleadandagentverificationlogin(WebDriver driver) throws Exception {
	try {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
      
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.navigate().refresh();
		   	
        WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement search = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),'search')])[1]")));
		Thread.sleep(2000);
		WebElement Brandselect1 = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		Brandselect1.click();
		Thread.sleep(2000);
		WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrand);
		Actions actions = new Actions(driver);
		WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Auto Demo')]"));   
		Selectbrand1.click();
		Thread.sleep(4000);
		
		Actions actions1 = new Actions(driver);
		WebElement Apply1 = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		Thread.sleep(3000);
		Apply1.click();
		Thread.sleep(5000);
		
        
// logout
        CommonFunctions.logout(driver);
        driver.close();
        driver.switchTo().window(tabs.get(0));

	    
		Thread.sleep(5000);	
}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
}
}		
}
	



