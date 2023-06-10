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

public class LocoActNactTicketWorkflowProcess {
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


	
public static void Actinablenonactionablefunctionality(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Response Management
			WebElement responsemngt=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Response Management')])[1]"));
			js.executeScript("arguments[0].click()", responsemngt);
			Thread.sleep(3000);
			
//Actionable/Non Actionable Label in Account Section
			WebElement actionableogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Actionable_Nonactionable.svg']"));
			WebElement actionablelabel=driver.findElement(By.xpath("(//span[contains(text(),'Actionable/Non Actionable')])"));
			js.executeScript("arguments[0].click()", actionablelabel);
			Thread.sleep(3000);
			
//Actionable//Non Actionable tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement actionabletab=driver.findElement(By.xpath("(//span[contains(text(),'Actionable/Non Actionable')])[2]"));
			Thread.sleep(3000);

//Select Brand Field
			WebElement selectbrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[2]"));
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(3000);
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])[1]"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();

//Actionable Heading and Information	
            WebElement ACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Actionable')])[1]"));
			WebElement ACTInformation=driver.findElement(By.xpath("((//p[contains(text(),'Actionable')])//following::p[1])[1]"));
			Thread.sleep(3000);
			
			
// Actionable Edit field
			WebElement editlogo=driver.findElement(By.xpath("(//img[@src='assets/images/common/edit.svg'])[1]"));
			WebElement editlabel=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[1]"));
			if(editlogo.isDisplayed()&&editlabel.isDisplayed()) 
			System.out.println("Edit field is Present");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", editlogo);
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();

//Non Actionable Heading  and Information	
            WebElement NACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Actionable')])[2]"));
			WebElement NACTInformation=driver.findElement(By.xpath("((//p[contains(text(),'Actionable')])//following::p[1])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", NACTHeading);
			Thread.sleep(3000);

//Edit Non Actionable Channel Field
			WebElement NActeditlogo=driver.findElement(By.xpath("(//img[@src='assets/images/common/edit.svg'])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", NActeditlogo);
			Thread.sleep(3000);

			WebElement NActeditlabel=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[2]"));
			if(NActeditlogo.isDisplayed()&&NActeditlabel.isDisplayed()) {
				System.out.println("Edit field for non actionable is Present");
			}
			else {
				System.out.println("Edit field for non actionable is not Present");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", NActeditlogo);
			Thread.sleep(3000);
			WebElement addfb=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_box')])[2]"));
			js.executeScript("arguments[0].click()", addfb);
			Thread.sleep(3000);
			WebElement fbchbx=driver.findElement(By.xpath("(//img[@src='/assets/images/channel-logos/facebook.svg'])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", fbchbx);
			js.executeScript("arguments[0].click()", fbchbx);
			Thread.sleep(3000);
			WebElement closefb=driver.findElement(By.xpath("(//mat-icon[contains(text(),'indeterminate_check_box')])[1]"));
			js.executeScript("arguments[0].click()", closefb);
			Thread.sleep(3000);
			WebElement addtw=driver.findElement(By.xpath("(//mat-icon[contains(text(),' add_box ')])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addtw);
			js.executeScript("arguments[0].click()", addtw);
			Thread.sleep(3000);
			WebElement twchbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", twchbx);
			js.executeScript("arguments[0].click()", twchbx);
			Thread.sleep(3000);
			WebElement closetw=driver.findElement(By.xpath("(//mat-icon[contains(text(),' indeterminate_check_box ')])[1]"));
			js.executeScript("arguments[0].click()", closetw);
			Thread.sleep(3000);
			WebElement save2=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", save2);
			Thread.sleep(3000);
			goingFacebookaccount(driver);
			
}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
				}
				}
public static void goingtwitteraccount(WebDriver driver) throws Exception {
try {
	((JavascriptExecutor)driver).executeScript("window.open()");
    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(2));	
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
	String twitterDynamicMessage = "@sh34017751   twitter test" + " " + strDate;
	whatHappening.sendKeys(twitterDynamicMessage);
	Thread.sleep(1000);

	WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
	js.executeScript("arguments[0].click()", tweetButton);
	Thread.sleep(4000);
	System.out.println("Tweet posted Successfully");
	//driver.close();
	Thread.sleep(5000);
	driver.switchTo().window(tabs.get(0));
	gotoallmensionstab(driver);

}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void goingFacebookaccount(WebDriver driver) throws Exception {
try {
			
	
//Second  Child window Handle
	 String parent = driver.getWindowHandle();
	    System.out.println("Main window handle is " + parent);
	    Thread.sleep(2000);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//Child window Handle
	    
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));  
	
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
	
//Login
		//Login
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("malikomal7296@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Loco@123");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", login);
		Thread.sleep(3000);
		System.out.println("Facebook login successful");
		Thread.sleep(8000);
		/*WebElement Allow = driver.findElement(By.xpath("//a[contains(text(),'See all in Messenger')]"));
		js.executeScript("arguments[0].click()", Allow);
		Thread.sleep(3000);*/
//Message  
		WebElement messengerButton = driver.findElement(
				By.xpath("(//div[@aria-label='Messenger' and @role='button'])[1]"));
		js.executeScript("arguments[0].click()", messengerButton);
		Thread.sleep(3000);
		WebElement messengers = driver.findElement(By.xpath("//a[contains(text(),'See all in Messenger')]"));
		js.executeScript("arguments[0].click()", messengers);
		Thread.sleep(3000);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement userMessenger = wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Ritesh test page')])[1]")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", userMessenger);
		if (userMessenger.isDisplayed()) {
			System.out.println("User messenger is displayed");
		} else {
			System.out.println("User messenger is not displayed");
		}
		Thread.sleep(2000);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
		String strDate = formatter.format(date);

		WebElement messenges = driver.findElement(By.xpath("//div[@aria-label='Message']"));
		String facebookDynamicMessage = "facebook test" + " " + strDate;
		messenges.sendKeys(facebookDynamicMessage);
		Thread.sleep(3000);
		WebElement send = driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']"));
		js.executeScript("arguments[0].click()", send);
		Thread.sleep(5000);
		System.out.println("Message sent successful");
		
		goingtwitteraccount(driver);
      
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void gotoallmensionstab(WebDriver driver) throws Exception {
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
	WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
	js.executeScript("arguments[0].click()", Selectbrand);
	WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'AJIO')]"));
	js.executeScript("arguments[0].click()", Selectbrand1);
	WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[3]"));
	js.executeScript("arguments[0].click()", Apply);
	
//Searching and deleting ticket from locobuzz
	WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[2]"));
	js.executeScript("arguments[0].click()", search);
	Thread.sleep(10000);
	WebElement inputbox = driver.findElement(By.id("post-search-input"));
	inputbox.sendKeys("komal");
	Thread.sleep(4000);
	js.executeScript("arguments[0].click()", search);
	Thread.sleep(10000);
	WebElement fbticket1=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
	js.executeScript("arguments[0].click()", fbticket1);
	Thread.sleep(3000);
	WebElement deletefb = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
	js.executeScript("arguments[0].click()", deletefb);
	Thread.sleep(3000);
	WebElement yesfb = driver.findElement(By.xpath(" //span[contains(text(),' Yes ')] "));
	js.executeScript("arguments[0].click()", yesfb);
	Thread.sleep(3000);
	WebElement twticket1=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
	js.executeScript("arguments[0].click()", twticket1);
	Thread.sleep(3000);
	WebElement deletetw = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
	js.executeScript("arguments[0].click()", deletetw);
	Thread.sleep(3000);
	WebElement yestw = driver.findElement(By.xpath(" //span[contains(text(),' Yes ')] "));
	js.executeScript("arguments[0].click()", yestw);
	Thread.sleep(3000);
	goingAccountSession(driver);
	ActinableFunctionality(driver);
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void ActinableFunctionality(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Response Management
			WebElement responsemngt=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Response Management')])[1]"));
			js.executeScript("arguments[0].click()", responsemngt);
			Thread.sleep(3000);
			
//Actionable/Non Actionable Label in Account Section
			WebElement actionableogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Actionable_Nonactionable.svg']"));
			WebElement actionablelabel=driver.findElement(By.xpath("(//span[contains(text(),'Actionable/Non Actionable')])"));
			js.executeScript("arguments[0].click()", actionablelabel);
			Thread.sleep(3000);
			
//Actionable//Non Actionable tab
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement actionabletab=driver.findElement(By.xpath("(//span[contains(text(),'Actionable/Non Actionable')])[2]"));
			Thread.sleep(3000);

//Select Brand Field
			WebElement selectbrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[2]"));
			js.executeScript("arguments[0].click()", selectbrand);
			Thread.sleep(3000);
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])[1]"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();

//Actionable Heading and Information	
            WebElement ACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Actionable')])[1]"));
			WebElement ACTInformation=driver.findElement(By.xpath("((//p[contains(text(),'Actionable')])//following::p[1])[1]"));
			Thread.sleep(3000);
			
			
// Actionable Edit field
			WebElement editlogo=driver.findElement(By.xpath("(//img[@src='assets/images/common/edit.svg'])[1]"));
			WebElement editlabel=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[1]"));
			if(editlogo.isDisplayed()&&editlabel.isDisplayed()) 
			System.out.println("Edit field is Present");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", editlogo);
			Thread.sleep(3000);
			WebElement addfb=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_box')])[1]"));
			js.executeScript("arguments[0].click()", addfb);
			Thread.sleep(3000);
			WebElement fbchbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", fbchbx);
			js.executeScript("arguments[0].click()", fbchbx);
			Thread.sleep(3000);
			WebElement closefb=driver.findElement(By.xpath("(//mat-icon[contains(text(),' indeterminate_check_box ')])[1]"));
			js.executeScript("arguments[0].click()", closefb);
			Thread.sleep(3000);
			WebElement addtw=driver.findElement(By.xpath("(//mat-icon[contains(text(),' add_box ')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", addtw);
			js.executeScript("arguments[0].click()", addtw);
			Thread.sleep(3000);
			WebElement twchbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", twchbx);
			js.executeScript("arguments[0].click()", twchbx);
			Thread.sleep(3000);
			WebElement closetw=driver.findElement(By.xpath("(//mat-icon[contains(text(),' indeterminate_check_box ')])[1]"));
			js.executeScript("arguments[0].click()", closetw);
			Thread.sleep(3000);
			WebElement save2=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", save2);
			Thread.sleep(3000);
			

//Non Actionable Heading  and Information	
            WebElement NACTHeading=driver.findElement(By.xpath("(//p[contains(text(),'Actionable')])[2]"));
			WebElement NACTInformation=driver.findElement(By.xpath("((//p[contains(text(),'Actionable')])//following::p[1])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", NACTHeading);
			Thread.sleep(3000);

//Edit Non Actionable Channel Field
			WebElement NActeditlogo=driver.findElement(By.xpath("(//img[@src='assets/images/common/edit.svg'])[2]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", NActeditlogo);
			Thread.sleep(3000);

			WebElement NActeditlabel=driver.findElement(By.xpath("(//span[contains(text(),'Edit')])[2]"));
			if(NActeditlogo.isDisplayed()&&NActeditlabel.isDisplayed()) {
				System.out.println("Edit field for non actionable is Present");
			}
			else {
				System.out.println("Edit field for non actionable is not Present");
			}
			Thread.sleep(3000);
		
			goingFacebookaccount2(driver);
			
}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
				}
				}
public static void goingtwitteraccount2(WebDriver driver) throws Exception {
try {
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(2));
	    Thread.sleep(5000);

//Tweet		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
		String strDate = formatter.format(date);

		WebElement whatHappening = driver.findElement(By.xpath("//div[@data-testid='tweetTextarea_0']"));
		js.executeScript("arguments[0].click()", whatHappening);
		String twitterDynamicMessage = "@sh34017751   twitter test" + " " + strDate;
		whatHappening.sendKeys(twitterDynamicMessage);
		Thread.sleep(1000);

		WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
		js.executeScript("arguments[0].click()", tweetButton);
		Thread.sleep(4000);
		System.out.println("Tweet posted Successfully");
		driver.switchTo().window(tabs.get(0));
        gototicketstab(driver);
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void goingFacebookaccount2(WebDriver driver) throws Exception {
try {
			
	
// Second Child window Handle
	 Thread.sleep(5000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;	
	    ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(5000);    
	
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyhhmmss");
		String strDate = formatter.format(date);

		WebElement messenges = driver.findElement(By.xpath("//div[@aria-label='Message']"));
		String facebookDynamicMessage = "facebook test" + " " + strDate;
		messenges.sendKeys(facebookDynamicMessage);
		Thread.sleep(3000);
		WebElement send = driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']"));
		js.executeScript("arguments[0].click()", send);
		Thread.sleep(3000);
		System.out.println("Message sent successful");
		goingtwitteraccount2(driver);
}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
public static void gototicketstab(WebDriver driver) throws Exception {
	try {

//tickets tab
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
		js.executeScript("arguments[0].click()", arrowBack);
		Thread.sleep(10000);
		
		WebElement ticketsTab = driver
				.findElement(By.xpath("//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));
       
      

		Thread.sleep(10000);
		WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		js.executeScript("arguments[0].click()", Brandselect);
		WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrand);
		WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'AJIO')]"));
		js.executeScript("arguments[0].click()", Selectbrand1);
		WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		js.executeScript("arguments[0].click()", Apply);
	
//Searching ticket and deleting from locobuzz
		WebElement search = driver.findElement(By.xpath("(//mat-icon[contains(text(),' search')])[1]"));
		js.executeScript("arguments[0].click()", search);
		Thread.sleep(10000);
		WebElement inputbox = driver.findElement(By.id("post-search-input"));
		inputbox.sendKeys("komal");
		Thread.sleep(4000);
		js.executeScript("arguments[0].click()", search);
		Thread.sleep(10000);
		WebElement fbticket1=driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
		js.executeScript("arguments[0].click()", fbticket1);
		Thread.sleep(3000);
		WebElement deletefb = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
		js.executeScript("arguments[0].click()", deletefb);
		Thread.sleep(10000);
		WebElement yesfb = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		js.executeScript("arguments[0].click()", yesfb);
		Thread.sleep(3000);
		WebElement twticket1=driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
		js.executeScript("arguments[0].click()", twticket1);
		Thread.sleep(3000);
		WebElement deletetw = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
		js.executeScript("arguments[0].click()", deletetw);
		Thread.sleep(10000);
		WebElement yestw = driver.findElement(By.xpath(" //span[contains(text(),'Yes')] "));
		js.executeScript("arguments[0].click()", yestw);
		Thread.sleep(3000);
		

}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
		}
		}
}
