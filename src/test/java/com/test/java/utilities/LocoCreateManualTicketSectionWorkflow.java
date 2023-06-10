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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocoCreateManualTicketSectionWorkflow {
	public static String ticketIDValue;
	public static int value=1;
	public static List<String> ticketInformation = new ArrayList<String>();
public static void goingAccountSession(WebDriver driver) throws Exception {
try {
			Thread.sleep(3000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement search = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
			Thread.sleep(2000);
			WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
			js.executeScript("arguments[0].click()", Brandselect);
			WebElement Selectbrandall = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
			js.executeScript("arguments[0].click()", Selectbrandall);
			WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'swiggy')]"));
			js.executeScript("arguments[0].click()", Selectbrand);
			WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", Apply);
			Thread.sleep(5000);
			
//Create Manual Ticket Label
			WebElement icon=driver.findElement(By.xpath("//img[@src='assets/images/common/Manual_Ticket.svg']"));
			if(icon.isDisplayed()) {			
			System.out.println("Create Manual Ticket Icon field is displayed");
		    }
			else {
			System.out.println("Create Manual Ticket Icon ield is not displayed");
			}
			
			Thread.sleep(3000);

			WebElement sideBar = driver.findElement(By.xpath("//img[@src='assets/images/Locobuzz_Symbol.svg']"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[1]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);			
}
catch(Exception e) 
{
		    e.printStackTrace();
			throw e;
}
}
	
public static void CreateManualticketTicketFunctionality(WebDriver driver) throws Exception {
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
			WebElement swiggy=driver.findElement(By.xpath("(//span[contains(text(),'swiggy')])[1]"));
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
			   
//Ticket Section
			WebElement icon=driver.findElement(By.xpath("//img[@src='assets/images/common/Manual_Ticket.svg']"));
			if(icon.isDisplayed()) 			
			System.out.println("Create Manual Ticket Icon field is displayed");
			else 
			System.out.println("Create Manual Ticket Icon field is not displayed");
			js.executeScript("arguments[0].click()", icon);
			Thread.sleep(3000);

//Create Manual Ticket Heading in Ticket Section	
			WebElement Heading=driver.findElement(By.xpath("//h3[contains(text(),'create manual ticket')]"));
			WebElement cross=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
			if(Heading.isDisplayed() && cross.isDisplayed()) 			
			System.out.println("Create Manual Ticket Heading in Ticket Section is displayed");
			else 
			System.out.println("Create Manual Ticket Heading in Ticket Section is not displayed");
			Thread.sleep(3000);

//Brand Textbox
			WebElement Brandlabel=driver.findElement(By.xpath("(//label[contains(text(),'Brand')])[2]"));
			WebElement Brandseldrpdwn=driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[6]"));
			WebElement Brandtxbx=driver.findElement(By.xpath("(//button[contains(@class,'custom__selectmenu--trigger select-trigger')])[1]"));
            if(Brandlabel.isDisplayed() && Brandseldrpdwn.isDisplayed() && Brandtxbx.isDisplayed()) 			
			System.out.println("Brand Textbox is displayed");
			else 
			System.out.println("Brand Textbox is not displayed");
			Thread.sleep(3000);

//Channel Textbox
			WebElement Channel=driver.findElement(By.xpath("(//label[contains(text(),'channel')])"));
			WebElement Channeltxbx=driver.findElement(By.xpath("(//button[contains(@class,'custom__selectmenu--trigger select-trigger')])[1]"));
			if(Channel.isDisplayed() && Channeltxbx.isDisplayed()) 			
			System.out.println("Channel Textbox field is displayed");
			else 
			System.out.println("Channel Textbox field is not displayed");
			Thread.sleep(3000);
			
//Username Textbox
			WebElement username=driver.findElement(By.xpath("//mat-label[contains(text(),'User Name')]"));
			if(username.isDisplayed()) 		
			System.out.println("Username Textbox field is displayed");
			else 
			System.out.println("Username Textbox field is not displayed");
			js.executeScript("arguments[0].click()", username);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
            Action action = actions.sendKeys(username, "Komal").build();
            action.perform();
		    
			Thread.sleep(3000);
//From and To Textbox
			WebElement From=driver.findElement(By.xpath("//mat-label[contains(text(),'From')]"));
			WebElement To=driver.findElement(By.xpath("//mat-label[contains(text(),'To')]"));
			WebElement CC=driver.findElement(By.xpath("(//a[contains(text(),'+Cc')])"));
			WebElement BCC=driver.findElement(By.xpath("(//a[contains(text(),'+Bcc')])"));
			if(From.isDisplayed() && To.isDisplayed() && CC.isDisplayed() && BCC.isDisplayed()) 			
			System.out.println("From and To Textbox field is displayed");
		    else 
		    System.out.println("From and To Textbox field is not displayed");
			js.executeScript("arguments[0].click()", From);
			Actions actions1 = new Actions(driver);
            Action action1 = actions1.sendKeys(From, "komal.mali@locobuzz.com").build();
            action1.perform();
			Thread.sleep(3000);
			WebElement todrpdwn1=driver.findElement(By.xpath("(//input[@placeholder='New Email...'])"));
			js.executeScript("arguments[0].click()", todrpdwn1);
			Thread.sleep(3000);
			WebElement selectemail=driver.findElement(By.xpath(" //span[contains(text(),'testing.komal2612@gmail.com')]"));
			js.executeScript("arguments[0].click()", selectemail);
			Thread.sleep(3000);
//Subject Textbox
			 WebElement Subject=driver.findElement(By.xpath("//mat-label[contains(text(),'Subject')]"));
	         WebElement Subjectmust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])[3]"));
	         if(Subject.isDisplayed()) 			
	         System.out.println("Subject Textbox field is displayed");
	    	 else 
	    	 System.out.println("View all conversation field is not displayed");
	         Thread.sleep(3000);
	         js.executeScript("arguments[0].click()", Subject);
	         Actions actions2 = new Actions(driver);
	         Action action2 = actions2.sendKeys(Subject, "Automation Demo Manual Ticket Creation").build();
	         action2.perform();
	         Thread.sleep(3000);
//Body Field
	         WebElement TextArea = driver.findElement(By.xpath("(//iframe[@class='cke_wysiwyg_frame cke_reset'])"));
	         driver.switchTo().frame(TextArea);
	         Thread.sleep(2000);

	         WebElement framedata = driver.
	        		 findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p"));

	         Actions builder = new Actions(driver);
	         Action act = builder.moveToElement(framedata).click().
	        		 sendKeys(framedata, "hello\r\n"
	                 	+ "checking CMT.\r\n"
	                 	+ "Thanks,\r\n"
	                 	+ "Komal.").build();	         
	         act.perform();
             driver.switchTo().defaultContent();
             Thread.sleep(3000);
//Attach Media 
            WebElement attachmedia=driver.findElement(By.xpath("//span[contains(text(),'Attach Media')]"));
            WebElement Iconmedia=driver.findElement(By.xpath("(//mat-icon[contains(text(),'insert_photo')])"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Iconmedia);
            Thread.sleep(3000);
            if(attachmedia.isDisplayed() && Iconmedia.isDisplayed()) 			
    		System.out.println("Attach Media field is displayed");
    		else 
    		System.out.println("Attach Media field is not displayed");
    		Thread.sleep(3000);
    		attachmedia.click();
			Thread.sleep(3000);
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
//Cancel
            WebElement Cancel=driver.findElement(By.xpath("(//span[contains(text(),'Cancel')])[2]"));
            if(Cancel.isDisplayed()) 			
    		System.out.println("Cancel field is displayed");
    		else 
    		System.out.println("Cancel field is not displayed");
    		Thread.sleep(3000);
            
//Tag and Create
            WebElement Tagcreate=driver.findElement(By.xpath("//span[contains(text(),'Tag & Create Ticket')]"));
            if(Tagcreate.isDisplayed())			
    		System.out.println("Tag and Create field is displayed");
    		else 
    		System.out.println("Tag and Create field is not displayed");
    		Thread.sleep(3000);
            Tagcreate.click();
			Thread.sleep(3000);

//Category Mapping Heading
            WebElement CatmapHeading=driver.findElement(By.xpath("//span[contains(text(),'Tag & Create Ticket')]"));
            if(CatmapHeading.isDisplayed())			
    		System.out.println("Category Mapping Heading field is displayed");
    		else 
    		System.out.println("Category Mapping Heading field is not displayed");
    		Thread.sleep(3000);
    		
//Select Upper Category 
            WebElement uppercategory=driver.findElement(By.xpath("//span[contains(text(),'Select upper category')]"));
            WebElement uppercategorydrpdwn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow ng-tns-c')])[27]"));
            if(uppercategory.isDisplayed() && uppercategorydrpdwn.isDisplayed())			
    		System.out.println("Select Upper Category field is displayed");
    		else 
    		System.out.println("Select Upper Category field is not displayed");
    		Thread.sleep(3000);
    		js.executeScript("arguments[0].click()", uppercategory);
			Thread.sleep(3000);
			WebElement selectuppercategory=driver.findElement(By.xpath("//span[contains(text(),'Testing')]"));
			js.executeScript("arguments[0].click()", selectuppercategory);
			Thread.sleep(3000);
			WebElement clearall=driver.findElement(By.xpath("//span[contains(text(),'Clear All')]"));
			js.executeScript("arguments[0].click()", clearall);
			Thread.sleep(3000);
			WebElement uppercategory1=driver.findElement(By.xpath("//span[contains(text(),'Select upper category')]"));
			js.executeScript("arguments[0].click()", uppercategory1);
			Thread.sleep(3000);
			WebElement selectuppercategory1=driver.findElement(By.xpath("//span[contains(text(),'sindhu upper')]"));
			js.executeScript("arguments[0].click()", selectuppercategory1);
			Thread.sleep(3000);
			WebElement selsubcategory=driver.findElement(By.xpath("//span[contains(text(),' Four Wheeler')]"));
			js.executeScript("arguments[0].click()", selsubcategory);
			Thread.sleep(3000);
			WebElement positive=driver.findElement(By.xpath("//span[contains(text(),'Positive')]"));
			js.executeScript("arguments[0].click()", positive);
		    Thread.sleep(3000);
		    
//Submit
		    WebElement submit=driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
			js.executeScript("arguments[0].click()", submit);
		    Thread.sleep(3000);
		    driver.navigate().refresh();
		    Thread.sleep(5000);
		    WebDriverWait wait3 = new WebDriverWait(driver, 40);
			WebElement more = wait3.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//a[contains(text(),'More')] ")));
			
//More 
			  //WebElement more=driver.findElement(By.xpath("//a[contains(text(),'More')] "));
			  js.executeScript("arguments[0].click()", more);
			  Thread.sleep(3000);
//Manualy Created Tickets
			  WebElement createmanual=driver.findElement(By.xpath("//button[contains(text(),'Manually Created Tickets')]"));
			  js.executeScript("arguments[0].click()", createmanual);
			  Thread.sleep(10000);
			  driver.navigate().refresh();
			  WebDriverWait wait4 = new WebDriverWait(driver, 40);
				WebElement more1 = wait4.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//a[contains(text(),'More')] ")));
				 js.executeScript("arguments[0].click()", more1);
				 Thread.sleep(5000);
				 WebElement createmanual1=driver.findElement(By.xpath("//button[contains(text(),'Manually Created Tickets')]"));
				  js.executeScript("arguments[0].click()", createmanual1);
				  Thread.sleep(10000);
			  WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
			  js.executeScript("arguments[0].click()", Brandselect);
			  WebElement Selectbrandall = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
			  js.executeScript("arguments[0].click()", Selectbrandall);
			  WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'swiggy')]"));
			  js.executeScript("arguments[0].click()", Selectbrand);
			  WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
				js.executeScript("arguments[0].click()", Apply);
				Thread.sleep(5000);
			  WebDriverWait wait = new WebDriverWait(driver, 20);
				WebElement search = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
				
				js.executeScript("arguments[0].click()", search);

				Thread.sleep(2000);

				WebElement inputbox = driver.findElement(By.id("post-search-input"));
			    inputbox.sendKeys("komal");
				
				
				js.executeScript("arguments[0].click()", search);
				//search.click();
				Thread.sleep(5000);
				js.executeScript("arguments[0].click()", search);
				//search.click();
				Thread.sleep(5000);
				js.executeScript("arguments[0].click()", search);
				//search.click();
				Thread.sleep(5000);
			  WebDriverWait wait1 = new WebDriverWait(driver, 20);
			  WebElement komal = wait1.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Komal')])[1]")));
			  Thread.sleep(5000);
			  ticketTabVerification(driver);
			 // acknowledgementemail(driver);

}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
public static void acknowledgementemail(WebDriver driver) throws Exception {
	try {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//Gmail login
		 String parent = driver.getWindowHandle();
		 System.out.println("Main window handle is " + parent);
		 Thread.sleep(2000);
		 
//Child window Handle
		    
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://accounts.google.com/");
	    Thread.sleep(10000);
	    WebElement email = driver.findElement(By.xpath("//div[contains(text(),'Email or phone')]"));
	    Actions actionsb = new Actions(driver);
        Action actionb = actionsb.sendKeys(email, "komalmali7296@gmail.com").build();
        actionb.perform();
	    Thread.sleep(7000);
	    WebElement next= driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	    js.executeScript("arguments[0].click()", next);
	    Thread.sleep(7000);
	    WebElement passw = driver.findElement(By.xpath("//div[contains(text(),'Enter your password')]"));
	    Actions actionsa = new Actions(driver);
        Action actiona = actionsa.sendKeys(email, "loco@123").build();
        actiona.perform();
	    Thread.sleep(7000);
	    js.executeScript("arguments[0].click()", next);
	    Thread.sleep(7000);   	
        WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement search = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),'search')])[1]")));
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		logout.click();
		driver.close();
		driver.switchTo().window(tabs.get(0));
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
		//driver.get("https://accounts.google.com/");
	    Thread.sleep(5000);
		CommonFunctions.login(driver, "Agent");
		Thread.sleep(7000);
		   	
        WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement search = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),'search')])[1]")));
		Thread.sleep(2000);
		WebElement Brandselect1 = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		Brandselect1.click();
		WebElement Selectbrandall = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrandall);
		WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'swiggy')]"));   
		Selectbrand1.click();
		Thread.sleep(3000);
	    WebElement Apply1 = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		Apply1.click();
		Thread.sleep(3000);
		
        
// logout
        CommonFunctions.logout(driver);
        driver.close();
        driver.switchTo().window(tabs.get(0)); 
		Thread.sleep(5000);
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		WebElement search3 = wait3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
		Thread.sleep(2000);
		Actions action3 = new Actions(driver); 
		WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
		js.executeScript("arguments[0].click()", Brandselect);
		WebElement Selectbrandall1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
		js.executeScript("arguments[0].click()", Selectbrandall1);
		WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'swiggy')]"));
		js.executeScript("arguments[0].click()", Selectbrand);
		WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
		js.executeScript("arguments[0].click()", Apply);
		Thread.sleep(5000);
		
       
}
	catch(Exception e) {
		e.printStackTrace();
		throw e;
}
}
public static void ticketTabVerification(WebDriver driver) throws Exception {
	try {

		ticketInformation.add(0, "Email Configuration Ticket WorkFlow");

//emaillogo
		WebElement imageIcon = driver
				.findElement(By.xpath("(//img[@src='assets/images/channel-logos/email.svg'])[1]"));
		if (imageIcon.isDisplayed()) {
			System.out.println("Email image is displayed");
		} else {
			System.out.println("Email image is not displayed");
		}
		ticketInformation.add(1, "Email");

//imagename
		WebElement ticketName = driver.findElement(By.xpath("(//span[contains(text(),'Email')])[1]"));
		if (ticketName.isDisplayed()) {
			System.out.println("Ticket Name is displayed");
		} else {
			System.out.println("Ticket Name is not displayed");
		}

//username
		WebElement userName = driver
				.findElement(By.xpath("(//span[contains(text(),'Email')])[1]//following::a[1]"));
		if (userName.isDisplayed()) {
			System.out.println("Username is displayed ");
		} else {
			System.out.println("Username is not displayed ");
		}

		ticketInformation.add(2, userName.getText());

//assign
		WebElement assignName = driver
				.findElement(By.xpath("(//span[contains(text(),'Email')])[1]//following::div[4]"));
		if (assignName.isDisplayed()) {
			System.out.println("Assign name is displayed");
		} else {
			System.out.println("Assign name is not  displayed");
		}

		String assignNameValue = assignName.getText();

//brandname
		WebElement brandName = driver.findElement(By.xpath("(//div[@class='post__pill bg__grey--lighter nowrap'])[2]"));
		if (brandName.isDisplayed()) {
			System.out.println("Brand name is dispalyed");
		} else {
			System.out.println("Brand name is not displayed");
		}

		ticketInformation.add(3, brandName.getText());

//time
		WebElement timeScheduleIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[2]"));
		WebElement dateTime = driver
				.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));
		if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
			System.out.println("Time is displayed");
		} else {
			System.out.println("Time is not displayed");
		}

		Thread.sleep(2000);
		timeInformation(driver);

//ticketid
		WebElement ticketIcon = driver.findElement(By
				.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'local_activity')])[1]"));
		WebElement ticketId = driver.findElement(
				By.xpath("((//div[@id='socialBox'])[1]//following::span[@class='post__foot--label'])[1]"));
		ticketIDValue = ticketId.getText();
		System.out.println("Ticket ID: " + ticketIDValue);
		if (ticketIcon.isDisplayed() && ticketId.getText() != "") {
			System.out.println("Ticket ID & Icon are displayed");
		} else {
			System.out.println("Ticket ID & Icon are not displayed");
		}

		ticketInformation.add(7, ticketId.getText());

//ticketStatus
		WebElement ticketStatusIcon = driver.findElement(
				By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'folder')])[1]"));
		WebElement ticketStatus = driver.findElement(
				By.xpath("(//span[@class='post__foot--label ticketstatus__blue colored__locobuzz'])[1]"));
		if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
			System.out.println("TicketStatus is displayed");
			if (ticketStatus.getText().trim().equalsIgnoreCase("open")) {
				System.out.println("Ticket Status is open");
			} else {
				System.out.println("Ticket Status is not open");
			}

		} else {
			System.out.println("TicketStatus is not displayed");
		}

		ticketInformation.add(8, ticketStatus.getText());

//priority
		WebElement priorityIcon = driver.findElement(
				By.xpath("((//div[@id='socialBox'])[1]//following::mat-icon[contains(text(),'low_priority')])[1]"));
		WebElement priority = driver.findElement(
				By.xpath("(//span[contains(@class,'post__foot--label')])[4]"));
		if (priorityIcon.isDisplayed() && priority.getText() != "") {
			System.out.println("Priority is displayed");
		} else {
			System.out.println("Priority is not displayed");
		}

		ticketInformation.add(9, priority.getText());

//mention category
		WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate_email')])[1]"));
		WebElement device = driver
				.findElement(By.xpath("(//mat-icon[contains(text(),'alternate_email')])[1]//following::span[1]"));
		if (symbol.isDisplayed() && device.getText() != "") {
			System.out.println("Device is dispalyed");
		} else {
			System.out.println("Device is not dispalyed");
		}

		ticketInformation.add(10, device.getText());

		ticketInformation.add(11, assignNameValue);

//direct close
		WebElement directCloseIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'cancel')])[2]"));
		WebElement directCloseButton = driver.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]"));
		if (directCloseIcon.isDisplayed() && directCloseButton.isDisplayed()) {
			System.out.println("Direct close button is displayed and enabled");
		} else {
			System.out.println("Direct close button is not displayed and enabled");
		}

//send email
		WebElement sendEmailIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'mail_outline')])[1]"));
		WebElement sendEmailButton = driver.findElement(By.xpath("(//span[contains(text(),'Send Email')])[1]"));
		if (sendEmailIcon.isDisplayed() && sendEmailButton.isDisplayed()) {
			System.out.println("Send email button is displayed and enabled");
		} else {
			System.out.println("Send email button is not displayed and enabled");
		}

//opendetails
		WebElement openDetailsIcon = driver
				.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])[1]"));
		WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
		if (openDetailsIcon.isDisplayed() && openDetailsButton.isDisplayed()) {
			System.out.println("Open details button is displayed and enabled");
		} else {
			System.out.println("Open details button is not displayed and enabled");
		}

//reply post
		WebElement replyPostIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'reply ')])[1]"));
		WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply')])[1]"));
		if (replyPostIcon.isDisplayed() && replyPostButton.isDisplayed()) {
			System.out.println("Reply post button is displayed and enabled");
		} else {
			System.out.println("Reply post button is not displayed and enabled");
		}

//more
		WebElement moreIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])[1]"));
		WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
		if (moreIcon.isDisplayed() && moreButton.isDisplayed()) {
			System.out.println("More button is displayed and enabled");
		} else {
			System.out.println("More button is not displayed and enabled");
		}

		Thread.sleep(5000);
		

	} catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
}

public static String getTicketValueID() {
	return ticketIDValue;
}
public static void timeInformation(WebDriver driver) throws Exception {
	try {

		WebElement dateTime = driver
				.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[2]//following::span[1]"));
		Actions actions = new Actions(driver);
		Action action = actions.moveToElement(dateTime).click().build();
		action.perform();
		Thread.sleep(4000);

//createdTime
		WebElement createdOnTime = driver.findElement(By.xpath(
				"(//span[@class='custom__tooltip--label' and contains(text(),'Created on:')])[1]//following::span[1]"));
		ticketInformation.add(4, createdOnTime.getText());
		System.out.println("Created Time: " + createdOnTime.getText());

//Modified Time
		WebElement modifiedOnTime = driver.findElement(By.xpath(
				"(//span[@class='custom__tooltip--label' and contains(text(),'Modified on:')])[1]//following::span[1]"));
		ticketInformation.add(5, modifiedOnTime.getText());
		System.out.println("Created Time: " + modifiedOnTime.getText());

//Mentioned Time
		WebElement mentionedOnTime = driver.findElement(By.xpath(
				"(//span[@class='custom__tooltip--label' and contains(text(),'Mentioned on:')])[1]//following::span[1]"));
		ticketInformation.add(6, mentionedOnTime.getText());
		System.out.println("Created Time: " + mentionedOnTime.getText());

	} catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
}
}
	





