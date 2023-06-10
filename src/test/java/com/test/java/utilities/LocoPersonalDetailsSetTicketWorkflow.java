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

public class LocoPersonalDetailsSetTicketWorkflow {
	public static List<String> componentsInformation = new ArrayList<String>();
	public static String ticketIDValue;
	//public static String channel;
	public static List<String> ticketInformation = new ArrayList<String>();

	
public static void gotoTicketSection(WebDriver driver,String channel) throws Exception {
		try {
			goingAccountSession(driver);
			PersonalDetailsSettingsUIVerification(driver);

			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Thread.sleep(5000);
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement search = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
			
//tickets tab
			Thread.sleep(3000);
			Thread.sleep(3000);
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));

			
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);
			CommonFunctions.ticketsSearch(driver, channel);
			WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
			js.executeScript("arguments[0].click()", Brandselect);
			WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
			js.executeScript("arguments[0].click()", Selectbrand);
			WebElement Selectbrand1 = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'AJIO')]"));
			js.executeScript("arguments[0].click()", Selectbrand1);
			WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", Apply);
} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
@SuppressWarnings("deprecation")
//ticket information
public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, " Personal Details Settings Ticket Workflow");

			WebElement imageIcon = driver
					.findElement(By.xpath("(//img[@src='/assets/images/channel-logos/" + channel + ".svg'])[1]"));

//twitter logo
			if (channel.equalsIgnoreCase("twitter")) {
				if (imageIcon.isDisplayed()) {
					System.out.println("Twitter Image displayed successfully");
				} else {
					System.out.println("Twitter Image not displayed");
				}
				ticketInformation.add(1, "Twitter");
			}
//imagename

			WebElement ticketName = driver
					.findElement(By.xpath("//span[contains(text(),'Found')]//following::span[1]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

//username & userID

			WebElement username = driver.findElement(By.xpath("//span[contains(text(),'Found')]//following::a[1]"));
			if (username.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

			ticketInformation.add(2, username.getText());

//brandname

			WebElement brandname = driver.findElement(By.xpath("(//div[@class='post__pill bg__grey--lighter nowrap'])[2]"));
			if (brandname.isDisplayed()) {
				System.out.println("Brand name is displayed");
			} else {
				System.out.println("Brand name is not displayed");
			}

			ticketInformation.add(3, brandname.getText());

//time

			WebElement timeScheduleIcon = driver.findElement(By.xpath("(//mat-icon[contains(.,'schedule')])[2]"));
			WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));

			if (timeScheduleIcon.isDisplayed() && dateTime.getText() != "") {
				System.out.println("Time is displayed");
			} else {
				System.out.println("Time is not displayed");
			}

			Thread.sleep(2000);
			timeInformation(driver);

//ticketsid
			WebElement ticketIcon = driver.findElement(By.xpath(
					"(//div[contains(@class,'post__foot--item')]//following::mat-icon[contains(text(),'local_activity')])[1]"));
			WebElement ticketID = driver.findElement(By.xpath(
					"(//span[@class='post__foot--label'])[3]"));
			ticketIDValue = ticketID.getText();
			System.out.println("Ticket ID: " + ticketIDValue);
			if (ticketIcon.isDisplayed() && ticketID.getText() != "") {
				System.out.println("Ticket ID & Icon are displayed");
			} else {
				System.out.println("Ticket ID & Icon are not displayed");
			}

			ticketInformation.add(7, ticketID.getText());

//ticketStatus

			WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[5]"));
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label ticketstatus__blue colored__locobuzz'])[1]"));

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
			WebElement priorityIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'low_priority')])[1]"));
			WebElement priority = driver.findElement(By.xpath("(//span[@class='post__foot--label colored__red--dark'])[1]"));

			if (priority.isDisplayed() && priorityIcon.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			ticketInformation.add(9, priority.getText());

//mention category

			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate')])[1]"));
			WebElement device = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[6]"));

			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is dispalyed");
			} else {
				System.out.println("Device is not dispalyed");
			}

			ticketInformation.add(10, device.getText());

			ticketInformation.add(11,"NA");
			ticketInformation.add(12, "NA");
			ticketInformation.add(13, "NA");
			
//open post
			if (channel.equalsIgnoreCase("twitter")) {
				WebElement openPostIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'open_in_new')])[1]"));
				WebElement openPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Post')])[1]"));

				if (openPostButton.isEnabled() && openPostIcon.isDisplayed()) {
					System.out.println("Open post button is displayed and enabled");
				} else {
					System.out.println("Open post button is not displayed and enabled");
				}
			}

//direct close

			WebElement directCloseIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]//preceding::mat-icon[1]"));
			WebElement directCloseButton = driver.findElement(By.xpath("(//span[contains(text(),'Direct Close')])[1]"));

			if (directCloseButton.isEnabled() && directCloseIcon.isDisplayed()) {
				System.out.println("Direct close button is displayed and enabled");
			} else {
				System.out.println("Direct close button is not displayed and enabled");
			}
			
//sendemail
			WebElement sendEmailIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'mail_outline')])[1]"));
			WebElement sendEmailButton = driver.findElement(By.xpath("(//span[contains(text(),'Send Email')])[1]"));
			if (sendEmailIcon.isDisplayed() && sendEmailButton.isDisplayed()) {
				System.out.println("Send email button is displayed and enabled");
			} else {
				System.out.println("Send email button is not displayed and enabled");
			}

//Open details

			WebElement openDetailsIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]//preceding::mat-icon[1]"));
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));

			if (openDetailsButton.isEnabled() && openDetailsIcon.isDisplayed()) {
				System.out.println("Open details button is displayed and enabled");
			} else {
				System.out.println("Open details button is not displayed and enabled");
			}

//Reply post

			WebElement replyPostIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'Reply')])[1]//preceding::mat-icon[1]"));
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply')])[1]"));

			if (replyPostButton.isEnabled() && replyPostIcon.isDisplayed()) {
				System.out.println("Reply post button is displayed and enabled");
			} else {
				System.out.println("Reply post button is not displayed and enabled");
			}

//More

			WebElement moreIcon = driver
					.findElement(By.xpath("(//span[contains(text(),'More')])[1]//preceding::mat-icon[1]"));
			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));

			if (moreButton.isEnabled() && moreIcon.isDisplayed()) {
				System.out.println("More button is displayed and enabled");
			} else {
				System.out.println("More button is not displayed and enabled");
			}

			Thread.sleep(5000);

			

}

		catch (Exception e) {
			e.printStackTrace();
			throw e;
}
}

public static String getTicketValueID() {
		return ticketIDValue;
}
public static void openDetailsButton(WebDriver driver, String channel) throws Exception {
	try {

//Click open details
		WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", openDetailsButton);
		Thread.sleep(2000);
		WebElement PersonalDetails = driver.findElement(By.xpath("//div[contains(text(),'Personal Details')]"));
		js.executeScript("arguments[0].click()", PersonalDetails);
		Thread.sleep(8000);
		WebElement name = driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat')])[13]"));
		name.clear();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat')])[14]"));
		email.clear();
		Thread.sleep(2000);
		WebElement phno = driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat')])[16]"));
		phno.clear();
		Thread.sleep(2000);
		WebElement aadhar = driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat')])[25]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", aadhar);
		aadhar.clear();
		Thread.sleep(2000);
	    WebElement pincode = driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat')])[24]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", pincode);
		pincode.sendKeys("123456");
		Thread.sleep(2000);
		WebElement numdemo = driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat')])[27]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", numdemo);
		numdemo.sendKeys("1234567891");
		Thread.sleep(2000);
		WebElement update = driver.findElement(By.xpath("(//span[contains(text(),'Update')])"));
		js.executeScript("arguments[0].click()", update);
		Thread.sleep(2000);
		WebElement arrow = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[3]"));
		js.executeScript("arguments[0].click()", arrow);
		Thread.sleep(2000);
		goingtwitteraccount(driver);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
}
public static void backtosupervisor(WebDriver driver) throws Exception {
	try {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement search = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", search);
        Thread.sleep(5000);
        js.executeScript("arguments[0].click()", search);
        Thread.sleep(5000);
        js.executeScript("arguments[0].click()", search);
        Thread.sleep(5000);
//Click open details
  		WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
  		js.executeScript("arguments[0].click()", openDetailsButton);
  		Thread.sleep(2000);
  		WebElement PersonalDetails = driver.findElement(By.xpath("//div[contains(text(),'Personal Details')]"));
  		js.executeScript("arguments[0].click()", PersonalDetails);
  		Thread.sleep(8000);
  		WebElement aadhar = driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat')])[25]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", aadhar);
		Thread.sleep(5000);
		WebElement city = driver.findElement(By.xpath("(//input[contains(@class,'mat-input-element mat')])[21]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", city);
	    Thread.sleep(5000);
	    city.sendKeys("Satara");
		WebElement update = driver.findElement(By.xpath("(//span[contains(text(),'Update')])"));
		js.executeScript("arguments[0].click()", update);
		Thread.sleep(2000);
		WebElement arrow = driver.findElement(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[3]"));
		js.executeScript("arguments[0].click()", arrow);
		Thread.sleep(2000);
		WebElement filter = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),'filter_alt')])[1]")));
		js.executeScript("arguments[0].click()", filter);
		Thread.sleep(2000);
		WebElement ajiodeselect = driver.findElement(By.xpath("(//mat-icon[contains(text(),'cancel')])[1]"));
		js.executeScript("arguments[0].click()", ajiodeselect);
		Thread.sleep(2000);
		WebElement ajioselect = driver.findElement(By.xpath("(//input[@placeholder='Type to search Brand'])[1]"));
		js.executeScript("arguments[0].click()", ajioselect);
		Thread.sleep(2000);
		WebElement ajio = driver.findElement(By.xpath("(//span[@class='mat-option-text' and text()=' AJIO '])"));
		js.executeScript("arguments[0].click()", ajio);
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
		action1.perform();
		WebElement userchar = driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'User characteristics')])[1]"));
		js.executeScript("arguments[0].click()", userchar);
		Thread.sleep(2000);
		WebElement userwith = driver.findElement(By.xpath("(//mat-label[contains(text(),'User With')])[1]"));
		js.executeScript("arguments[0].click()", userwith);
		Thread.sleep(2000);
		WebElement tranID = driver.findElement(By.xpath("(//span[contains(text(),'Email')])[3]"));
		js.executeScript("arguments[0].click()", tranID);
		Thread.sleep(2000);
		WebElement apply = driver.findElement(By.xpath("(//span[contains(text(),'Apply')])"));
		js.executeScript("arguments[0].click()", apply);
		Thread.sleep(2000);
		WebElement twticket1=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
		js.executeScript("arguments[0].click()", twticket1);
		Thread.sleep(3000);
		WebElement deletetw = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
		js.executeScript("arguments[0].click()", deletetw);
		Thread.sleep(3000);
		WebElement yestw = driver.findElement(By.xpath(" //span[contains(text(),'Yes')] "));
		js.executeScript("arguments[0].click()", yestw);
		Thread.sleep(3000);js.executeScript("arguments[0].click()", search);
		Thread.sleep(10000);
		WebElement twticket12=driver.findElement(By.xpath("((//div[@id='socialBox'])[2]//following::span[contains(text(),'More')])[1]"));
		js.executeScript("arguments[0].click()", twticket12);
		Thread.sleep(3000);
		WebElement deletetw2 = driver.findElement(By.xpath("//span[contains(text(),'Delete from Locobuzz')]"));
		js.executeScript("arguments[0].click()", deletetw2);
		Thread.sleep(3000);
		WebElement yestw2 = driver.findElement(By.xpath(" //span[contains(text(),'Yes')] "));
		js.executeScript("arguments[0].click()", yestw2);
		Thread.sleep(3000);
	} catch (Exception e) {
	e.printStackTrace();
	throw e;
	}
	}

public static void timeInformation(WebDriver driver) throws Exception {
		try {

		WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));
		Actions actions = new Actions(driver);
		Action action = actions.moveToElement(dateTime).click().build();
		action.perform();
		Thread.sleep(4000);

		//Created Time			

		WebElement createdOnTime = driver.findElement(By.xpath(
				"(//span[@class='custom__tooltip--label' and contains(.,'Created on:')]//following::span)[1]"));
		ticketInformation.add(4, createdOnTime.getText());
		System.out.println("Created Time: " + createdOnTime.getText());

		//Modified Time

		WebElement modifiedOnTime = driver.findElement(By.xpath(
				"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));
		ticketInformation.add(5, modifiedOnTime.getText());
		System.out.println("Modified On: " + modifiedOnTime.getText());

		//Mentioned Time

		WebElement mentionedOnTime = driver.findElement(By.xpath(
				"(//span[@class='custom__tooltip--label' and contains(.,'Mentioned on:')]//following::span)[1]"));
		ticketInformation.add(6, mentionedOnTime.getText());
		System.out.println("Mentioned On: " + mentionedOnTime.getText());

		} catch (Exception e) {
		e.printStackTrace();
		throw e;
		}
		}
	

public static void goingAccountSession(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//img[@src='assets/images/Locobuzz_Symbol.svg']"));
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
	
public static void PersonalDetailsSettingsUIVerification(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
// Response Management
			WebElement responsemngt=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),'Response Management')])[1]"));
			js.executeScript("arguments[0].click()", responsemngt);
			Thread.sleep(3000);
			
//Personal Details Settings  Label in Account Section
			WebElement PersonalLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Personal_Details_Settings.svg']"));
			WebElement Personallabel=driver.findElement(By.xpath("(//span[contains(text(),'Personal Details Settings')])"));
			js.executeScript("arguments[0].click()", Personallabel);
			Thread.sleep(3000);

//Select Category Field
			WebElement selectCatHead=driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Category Group')])"));
			WebElement selectCatTxbx=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix ng-tns-c')])[2]"));
			WebElement selectCatDrpdn=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper ng-tns-')])"));
			if(selectCatHead.isDisplayed() && selectCatTxbx.isDisplayed() && selectCatDrpdn.isDisplayed()) 
			System.out.println("Select Category Field is present");
			else 
			System.out.println("Select Category Field is not present");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", selectCatDrpdn);
			Thread.sleep(3000);
			WebElement default2=driver.findElement(By.xpath("(//span[contains(text(),'Default2')])"));
			js.executeScript("arguments[0].click()", default2);
			Thread.sleep(3000);

//Search by Field Name Field	
            WebElement Searchbyfieldtx=driver.findElement(By.xpath("//input[@placeholder='Search by Field Name']"));
			WebElement Searchsymbol=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(Searchbyfieldtx.isDisplayed() && Searchsymbol.isDisplayed()) 
			System.out.println("Search by Field Name Field is displayed");
			else 
			System.out.println("Search by Field Name Field is not displayed");
			Searchbyfieldtx.sendKeys("Kdemo");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Searchsymbol);
			Thread.sleep(3000);

//Add New Field Label and Icon 	
            WebElement Addicon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'add_circle_outline')])"));
			WebElement Addlabel=driver.findElement(By.xpath("(//span[contains(text(),'Add New Field')])[1]"));
			js.executeScript("arguments[0].click()", Addicon);
			Thread.sleep(5000);

//Field Type Textbox Field
			WebElement Fieldtypeheading=driver.findElement(By.xpath("(//mat-label[contains(text(),'Field Type')])"));
			WebElement Fieldtypetxbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[4]"));
			WebElement drpdwn=driver.findElement(By.xpath("(//span[contains(text(),'Contact Number')])"));
			js.executeScript("arguments[0].click()", drpdwn);
			Thread.sleep(3000);
			WebElement selfieldtype=driver.findElement(By.xpath("(//mat-option[contains(@class,'mat-option mat')])[4]"));
			js.executeScript("arguments[0].click()", selfieldtype);
			Thread.sleep(3000);
			
// Enter a Field name 
			WebElement enterfieldname=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[6]"));
			WebElement fieldnamemust=driver.findElement(By.xpath("(//span[contains(@class,'colored__red')])"));
			if(enterfieldname.isDisplayed()&&fieldnamemust.isDisplayed()) 
			System.out.println("Enter a Field name is Present");
			else 
			System.out.println("Enter a Field name is not Present");
			Actions actions = new Actions(driver);
	        Action action = actions.sendKeys(enterfieldname, "Kdemo Text Demo").build();
	        action.perform();
	        Thread.sleep(3000);

//Character Limit Textbox			
			WebElement charlimitheading=driver.findElement(By.xpath("(//mat-label[contains(text(),'Character Limit')])"));
			WebElement charlimittxbx=driver.findElement(By.xpath("(//span[contains(@class,'mat-form-field-label-')])[7]"));
			WebElement drpdwnm=driver.findElement(By.xpath("(//mat-icon[contains(text(),' keyboard_arrow_up')])"));
			WebElement note=driver.findElement(By.xpath("(//p[contains(@class,'text__light--sm mt-')])"));
			if(charlimitheading.isDisplayed()&&charlimittxbx.isDisplayed()&&drpdwnm.isDisplayed()&&note.isDisplayed()) 
			System.out.println("Character Limit Textbox	is Present");
			else 
			System.out.println("Character Limit Textbox	is not Present");
			Actions actions1 = new Actions(driver);
	        Action action1 = actions1.sendKeys(charlimittxbx, "10").build();
	        action1.perform();
	        Thread.sleep(3000);
			
//Enter Regular Expression
			WebElement Heading =driver.findElement(By.xpath("(//p[contains(text(),'Enter the regular')])"));
			WebElement Textbox=driver.findElement(By.xpath("(//input[@placeholder='Enter the Regular Expression'])"));
			if(Heading.isDisplayed()&&Textbox.isDisplayed()) 
			System.out.println("Create Super rules heading and information is displayed");
			else 
			System.out.println("Create Super rules heading and information is not displayed");
			Textbox.sendKeys("[A-Z]{5}[0-9]{4}[A-Z]{1}");
			Thread.sleep(3000);	
			

//Save all  set Details
			WebElement Savefield=driver.findElement(By.xpath("(//span[contains(text(),' Save Field ')])"));
			js.executeScript("arguments[0].click()", Savefield);
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", Searchsymbol);
			Thread.sleep(3000);
			
//Edit Old Details			
			WebElement edit=driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[1]"));
			js.executeScript("arguments[0].click()", edit);
			Thread.sleep(3000);
			WebElement Checkbox1=driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])"));
			js.executeScript("arguments[0].click()", Checkbox1);
			Thread.sleep(3000);

//How Character Limit help to identify details
		    WebElement Characterlimitlink=driver.findElement(By.xpath("(//p[contains(text(),'How character limit')])"));
			if(Characterlimitlink.isDisplayed()) 
			System.out.println("How Character Limit help to identify details is displayed");
			else 
			System.out.println("How Character Limit help to identify details is not displayed");
			js.executeScript("arguments[0].click()", Characterlimitlink);
			Thread.sleep(5000);          			  
			WebElement close=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(5000); 
			WebElement Savefield2=driver.findElement(By.xpath("(//span[contains(text(),' Save Field ')])"));
			js.executeScript("arguments[0].click()", Savefield2);
			Thread.sleep(3000);
			
//Delete all Personal Details Field
			WebElement delete1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'delete_outline')])[1]"));
			js.executeScript("arguments[0].click()", delete1);
			Thread.sleep(3000);
			WebElement confirmdelete1=driver.findElement(By.xpath("(//span[contains(text(),' Yes ')])"));
			js.executeScript("arguments[0].click()", confirmdelete1);
		    Thread.sleep(5000);
		    

		    
		   
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
		String twitterDynamicMessage = " @sh34017751\r\n"
				+ " \r\n"
				+ "Komal\r\n"
				+ "komalmali123@gmail.com\r\n"
				+ "7767667787\r\n"
				+ "634500981714\r\n"
				+ "123456";
		whatHappening.sendKeys(twitterDynamicMessage);
		Thread.sleep(1000);

		WebElement tweetButton = driver.findElement(By.xpath("(//span[contains(text(),'Tweet')])[3]"));
		js.executeScript("arguments[0].click()", tweetButton);
		Thread.sleep(4000);
		System.out.println("Tweet posted Successfully");
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);
		backtosupervisor( driver);

}
catch(Exception e) {
e.printStackTrace();
throw e;
}
}
}


