package com.test.java.utilities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

public class LocoBrandPreferenceTicketWorkprocess {
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
	
public static void BrandPreferenceFunctionality(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Response Management
			WebElement responsemngt=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Response Management')])[1]"));
			if(responsemngt.isDisplayed()) 
				System.out.println("Response Management is displayed");
			else 
				System.out.println("Response Management is not displayed");
			js.executeScript("arguments[0].click()", responsemngt);
			Thread.sleep(3000);
			
//Actionable/Non Actionable Label in Account Section
			WebElement actionableogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Actionable_Nonactionable.svg']"));
			WebElement actionablelabel=driver.findElement(By.xpath("(//span[contains(text(),'Actionable/Non Actionable')])"));
			if(actionableogo.isDisplayed()&&actionablelabel.isDisplayed()) 
				System.out.println("Actionable/Non Actionable Label in Account Section is displayed");
			else 
				System.out.println("Actionable/Non Actionable Label in Account Section is not displayed");
			js.executeScript("arguments[0].click()", actionablelabel);
			Thread.sleep(3000);
			
//Brand Preference Tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement brandtab=driver.findElement(By.xpath("(//span[contains(text(),'Brand Preference')])[1]"));
			if(pushpin.isDisplayed()&&brandtab.isDisplayed()) 
				System.out.println("Brand Preference Tab is displayed");
			else 
				System.out.println("Brand Preference Tab is not displayed");
				Thread.sleep(3000);
			js.executeScript("arguments[0].click()", brandtab);
			Thread.sleep(3000);

//Information Field
			WebElement info=driver.findElement(By.xpath("//mat-icon[contains(text(),'info')]"));
			WebElement noteinfo=driver.findElement(By.xpath("//span[contains(text(),'Same colors represents the same brand profiles')]"));
			if(info.isDisplayed()&&noteinfo.isDisplayed()) 
				System.out.println("Information Field is present");
			else
				System.out.println("Information Field is not present");
			Thread.sleep(3000);
			
//Brand Preference Heading and Information	
            WebElement ACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Brand Preference ')])[1]"));
			WebElement ACTInformation=driver.findElement(By.xpath("(//p[contains(text(),'Brand Preference ')])[1]//following::p[1]"));
			if(ACTHeading.isDisplayed()&&ACTInformation.isDisplayed()) 
				System.out.println("Brand Preference Heading and Information is displayed");
			else 
				System.out.println("Brand Preference Heading and Information is not displayed");
				Thread.sleep(3000);
			
//Search By Category Group	
            WebElement Searchbycat=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category Group')])"));
			WebElement Dropdown=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-c')])[2]"));
			if(Searchbycat.isDisplayed()&&Dropdown.isDisplayed()) 
				System.out.println("Search By Category Name	 is displayed");
			else 
				System.out.println("Search By Category Name	 is not displayed");
				Thread.sleep(3000);
		        js.executeScript("arguments[0].click()", Dropdown);
			    Thread.sleep(3000);

//Select Testing123 Category	
            WebElement Testingcat=driver.findElement(By.xpath("//span[contains(text(),'Testing123')]"));
			if(Testingcat.isDisplayed()) 
				System.out.println("Default2 Category is Present");
			else 
				System.out.println("Default2 Category is not Present");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Testingcat);
			Thread.sleep(3000);
			Actions builder = new Actions(driver);
			WebElement toWebElement = driver.findElement(By.xpath("(//span[contains(text(),'Komal')])[2]"));
		    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", toWebElement);
		        Thread.sleep(2000);
		        WebElement fromWebElement = driver.findElement(By.xpath("(//span[contains(text(),'Komal')])[3]"));
		        Thread.sleep(2000);
	           
		        builder.clickAndHold(fromWebElement).moveToElement(toWebElement).perform();
		        Thread.sleep(2000);// add 2 sec wait
		        builder.release(toWebElement).build().perform();
		        Thread.sleep(2000);
		        WebElement Save = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
				js.executeScript("arguments[0].click()", Save);
				Thread.sleep(3000);
				 Actions builder2 = new Actions(driver);
				WebElement toWebElement1 = driver.findElement(By.xpath("(//span[contains(text(),'Komal')])[2]"));
			    Thread.sleep(2000);
			    WebElement fromWebElement1 = driver.findElement(By.xpath("(//span[contains(text(),'Komal')])[3]"));
			    Thread.sleep(2000);
			    builder2.clickAndHold(fromWebElement1).moveToElement(toWebElement1).perform();
		        Thread.sleep(2000);// add 2 sec wait
		        builder2.release(toWebElement1).build().perform();
		        Thread.sleep(2000);
		        WebElement Save1 = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
				js.executeScript("arguments[0].click()", Save1);
				Thread.sleep(3000);
			TwitterticketGeneration(driver);
			
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}

public static void goingtoallmensionstab(WebDriver driver)throws Exception{

try {
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(2000);
	WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
	js.executeScript("arguments[0].click()", arrowBack);
	Thread.sleep(3000);
    WebElement allmentions = driver.findElement(By.xpath("(//span[contains(text(),'All Mention')])[1]"));
	allmentions.click();
	Thread.sleep(5000);

//useractivity

	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement useractivity = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'User Activity ')]")));			
	Thread.sleep(3000);
	WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[2]"));
	js.executeScript("arguments[0].click()", Brandselect);
	Thread.sleep(3000);
	//WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[8]"));
	//js.executeScript("arguments[0].click()", expand);
	Thread.sleep(3000);
	// allunse = driver.findElement(By.xpath("(//span[contains(text(),'All')])[9]"));
	//js.executeScript("arguments[0].click()", allunse);
	//Thread.sleep(3000);
	WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
	js.executeScript("arguments[0].click()", Selectbrand);
	WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Auto Demo')]"));
	js.executeScript("arguments[0].click()", Selectbrand1);
	Thread.sleep(3000);
	WebElement Selectbrand2 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'Titan')]"));
	js.executeScript("arguments[0].click()", Selectbrand2);
	Thread.sleep(3000);
	WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[3]"));
	js.executeScript("arguments[0].click()", Apply);
	//WebDriverWait wait1 = new WebDriverWait(driver, 30);
	//WebElement useractivity1 = wait1.until(
			//ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'User Activity ')]")));			
	Thread.sleep(3000);
//Searching and deleting ticket from locobuzz
	WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[2]"));
	js.executeScript("arguments[0].click()", search);
	Thread.sleep(10000);
	WebElement inputbox = driver.findElement(By.id("post-search-input"));
	inputbox.sendKeys("komal");
	Thread.sleep(4000);
	js.executeScript("arguments[0].click()", search);
	Thread.sleep(10000);
	WebElement twticket1=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
	js.executeScript("arguments[0].click()", twticket1);
	Thread.sleep(3000);
	WebElement deletetw = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
	js.executeScript("arguments[0].click()", deletetw);
	Thread.sleep(3000);
	WebElement yestw = driver.findElement(By.xpath(" //span[contains(text(),'Yes')] "));
	js.executeScript("arguments[0].click()", yestw);
	Thread.sleep(3000);
    WebElement twticket2=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
	js.executeScript("arguments[0].click()", twticket2);
	Thread.sleep(3000);
	WebElement deletetw2 = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
	js.executeScript("arguments[0].click()", deletetw2);
	Thread.sleep(3000);
	WebElement yestw2 = driver.findElement(By.xpath(" //span[contains(text(),'Yes')] "));
	js.executeScript("arguments[0].click()", yestw2);
	Thread.sleep(3000);	
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void TwitterticketGeneration(WebDriver driver)throws Exception{

try {
	 ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));	
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.get("https://twitter.com/");
		Thread.sleep(5000);
		//Login

		WebElement signUp = driver.findElement(By.xpath("(//span[contains(text(),'Sign up')])[1]"));
		signUp.click();
		Thread.sleep(3000);
		WebElement signUp2 = driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]"));
		js.executeScript("arguments[0].click()", signUp2);
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.name("text"));
		username.sendKeys("@Komal87224405");
		Thread.sleep(3000);
		WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		next.click();
		Thread.sleep(1000);
		/*
		 * WebElement email=driver.findElement(By.name("text"));
		 * email.sendKeys("kalyan.chinni@locobuzz.com"); Thread.sleep(1000); WebElement
		 * next1=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		 * next1.click(); Thread.sleep(1000);
		 */
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Loco@123");
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
		login.click();
		Thread.sleep(4000);
		System.out.println("Tweet Login Successful");

//Tweet		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
		String strDate = formatter.format(date);

		WebElement whatHappening = driver.findElement(By.xpath("//div[@data-testid='tweetTextarea_0']"));
		js.executeScript("arguments[0].click()", whatHappening);
		String twitterDynamicMessage = "@Komal25169281   twitter test" + " " + strDate;
		whatHappening.sendKeys(twitterDynamicMessage);
		Thread.sleep(1000);

		WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
		js.executeScript("arguments[0].click()", tweetButton);
		Thread.sleep(4000);
		System.out.println("Tweet posted Successfully");
		//driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(0));
		goingtoallmensionstab(driver);
	
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}				
}


