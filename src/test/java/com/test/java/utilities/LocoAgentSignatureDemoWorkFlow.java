package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocoAgentSignatureDemoWorkFlow {
	public static List<String> componentsInformation = new ArrayList<String>();
	public static String ticketIDValue;
	public static List<String> ticketInformation = new ArrayList<String>();

	public static void makeActionableProcess(WebDriver driver, String channel) throws Exception {
		try {
			goingAccountSession(driver);
			AgentSignatureworkflowProcess(driver);
//tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);
			CommonFunctions.ticketsSearch(driver, channel);
			WebElement Brandselect = driver.findElement(By.xpath("(//span[contains(text(),'Brands')])[1]"));
			js.executeScript("arguments[0].click()", Brandselect);
			WebElement Selectbrand = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'All')]"));
			js.executeScript("arguments[0].click()", Selectbrand);
			WebElement Selectbrandajio = driver.findElement(By.xpath("//span[@class = 'mat-checkbox-label' and contains(text(),'AJIO')]"));
			js.executeScript("arguments[0].click()", Selectbrandajio);
			WebElement Apply = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", Apply);
//Assigning

			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(2000);

			WebElement assignTo = driver.findElement(By.xpath("(//span[contains(text(),'Assign to')])"));
			js.executeScript("arguments[0].click()", assignTo);
			Thread.sleep(2000);

			WebElement selectUser = driver
					.findElement(By.xpath("//mat-label[contains(text(),'Select User')]//preceding::input[1]"));
			js.executeScript("arguments[0].click()", selectUser);
			Thread.sleep(2000);

			WebElement assignUser = driver.findElement(By.xpath("(//span[contains(text(),'Komal suplive')])[2]"));
			js.executeScript("arguments[0].click()", assignUser);
			Thread.sleep(2000);
			WebElement assignButton = driver.findElement(By.xpath("(//span[contains(text(),'Assign')])[2]"));
			js.executeScript("arguments[0].click()", assignButton);
			Thread.sleep(2000);
			WebElement search = driver.findElement(By.xpath("//mat-icon[contains(text(),' search')]"));
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

//ticket information
	public static void ticketTabVerification(WebDriver driver, String channel) throws Exception {
		try {

			ticketInformation.add(0, " Agent Signature Twitter Ticket reply and hold  WorkFlow");

			WebElement imageIcon = driver
					.findElement(By.xpath("(//img[@src='/assets/images/channel-logos/" + channel + ".svg'])[1]"));


// twitter logo
			if (channel.equalsIgnoreCase("twitter")) {
				if (imageIcon.isDisplayed()) {
					System.out.println("Twitter Image displayed successfully");
				} else {
					System.out.println("Twitter Image not displayed");
				}
				ticketInformation.add(1, "Twitter");
			}

// imagename

			WebElement ticketName = driver
					.findElement(By.xpath("//span[contains(text(),'Found')]//following::span[1]"));
			if (ticketName.isDisplayed()) {
				System.out.println("Ticket name is displayed");
			} else {
				System.out.println("Ticket name is not displayed");
			}

// username & userID

			WebElement username = driver.findElement(By.xpath("//span[contains(text(),'Found')]//following::a[1]"));
			if (username.isDisplayed()) {
				System.out.println("Username is displayed");
			} else {
				System.out.println("Username  is not displayed");
			}

			ticketInformation.add(2, username.getText());

//assign
			WebElement assignName = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'how_to_reg')]//following::span)[4]"));
			if (assignName.isDisplayed()) {
				System.out.println("Assign name is displayed");
			} else {
				System.out.println("Assign name is not displayed");
			}

			String assignNameValue = assignName.getText();

// brandname

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

// ticketsid
			WebElement ticketIcon = driver.findElement(By.xpath(
					"(//div[contains(@class,'post__foot--item')]//following::mat-icon[contains(text(),'local_activity')])[1]"));
			WebElement ticketID = driver.findElement(By.xpath(
					"(//mat-icon[contains(text(),'local_activity')]//following::span[@class='post__foot--label'])[3]"));
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
			WebElement ticketStatus = driver.findElement(By.xpath("(//span[contains(@class,'post__foot--label')])[5]"));

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
			WebElement priority = driver.findElement(By.xpath("(//span[contains(@class,'post__foot--label')])[6]"));

			if (priority.isDisplayed() && priorityIcon.getText() != "") {
				System.out.println("Priority is displayed");
			} else {
				System.out.println("Priority is not displayed");
			}

			ticketInformation.add(9, priority.getText());

// mention category

			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'alternate')])[1]"));
			WebElement device = driver.findElement(By.xpath("(//span[contains(@class,'post__foot--label')])[7]"));

			if (symbol.isDisplayed() && device.getText() != "") {
				System.out.println("Device is dispalyed");
			} else {
				System.out.println("Device is not dispalyed");
			}

			ticketInformation.add(10, device.getText());

			ticketInformation.add(11, assignNameValue);
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
					.findElement(By.xpath("(//mat-icon[contains(text(),'reply ')])[1]"));
			WebElement replyPostButton = driver.findElement(By.xpath("(//span[contains(text(),'Reply')])[1]"));

			if (replyPostButton.isEnabled() && replyPostIcon.isDisplayed()) {
				System.out.println("Reply post button is displayed and enabled");
			} else {
				System.out.println("Reply post button is not displayed and enabled");
			}

//More

			WebElement moreIcon = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'more_horiz')])[1]"));
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

	public static void replyPostButton(WebDriver driver, String channel) throws Exception {
		try {
			//Click open details
			WebElement openDetailsButton = driver.findElement(By.xpath("(//span[contains(text(),'Open Details')])[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", openDetailsButton);
			Thread.sleep(5000);
			checkReplyType(driver, channel);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void checkReplyType(WebDriver driver, String channel) throws Exception {
		try {

//ReplyType 
			Thread.sleep(5000);
			WebElement replyTypeSelector = driver.findElement(
					By.xpath("//span[contains(@class,'ng-star-inserted') and contains(text(),'Reply &')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", replyTypeSelector);
			WebElement replyCloseButton = driver
					.findElement(By.xpath("(//span[@class = 'mat-option-text' and contains(text(),'Reply & Close')])"));
			String replyCloseButtonValue = replyCloseButton.getText();
			System.out.println("Reply Type: " + replyCloseButtonValue);
			WebElement replyEscalateButton = driver.findElement(
					By.xpath("//span[@class = 'mat-option-text' and contains(text(),'Reply & Escalate')]"));
			String replyEscalateButtonValue = replyEscalateButton.getText();
			System.out.println("Reply Type: " + replyEscalateButtonValue);
			WebElement replyOnHoldButton = driver
					.findElement(By.xpath("//span[@class = 'mat-option-text' and contains(text(),'Reply & On Hold')]"));

			String replyOnHoldButtonValue = replyOnHoldButton.getText();
			System.out.println("Reply Type: " + replyOnHoldButtonValue);

			WebElement replyAwaitingButton = driver.findElement(By.xpath(
					"//span[@class = 'mat-option-text' and contains(text(),'Reply & Awaiting response from Customer')]"));

			String replyAwaitingButtonValue = replyAwaitingButton.getText();
			System.out.println("Reply Type: " + replyAwaitingButtonValue);

			if (replyCloseButton.isDisplayed() && replyEscalateButton.isDisplayed() && replyOnHoldButton.isDisplayed()
					&& replyAwaitingButton.isDisplayed()) {

				System.out.println("All reply types are displayed");
			} else {
				System.out.println("All reply types are not displayed");
			}

			replyWorkFlow(driver, replyOnHoldButtonValue, channel);
            Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
}
	@SuppressWarnings("deprecation")
	public static void replyWorkFlow(WebDriver driver, String replyType, String channel) throws Exception {
    try {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement replyTypeSelect = driver.findElement(
						By.xpath("//span[@class = 'mat-option-text' and contains(text(),'" + replyType + "')]"));
				replyTypeSelect.click();
				Thread.sleep(2000);
				
				WebElement send = driver.findElement(By.xpath("(//span[@class = 'mat-button-wrapper' and contains(text(),'Send')])"));
				js.executeScript("arguments[0].click()", send);
				Thread.sleep(3000);
			
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement closeSearch = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),'arrow_back')])[2]")));
			js.executeScript("arguments[0].click()", closeSearch);
			Thread.sleep(2000);
			driver.navigate().refresh();
			if (replyType.trim().equalsIgnoreCase("Reply & On Hold")) {
				WebElement onHoldTickets = driver.findElement(By.xpath("//a[contains(text(),'On Hold')]"));
				js.executeScript("arguments[0].click()", onHoldTickets);
				Thread.sleep(2000);
				
			
			// search with ticket
						WebDriverWait wait = new WebDriverWait(driver, 10);
						WebElement search = wait.until(ExpectedConditions
								.visibilityOfElementLocated(By.xpath("(//mat-icon[contains(text(),' search')])[1]")));
						
						js.executeScript("arguments[0].click()", search);

						Thread.sleep(2000);
						WebElement inputbox = driver.findElement(By.id("post-search-input"));
						inputbox.sendKeys("komal");
						js.executeScript("arguments[0].click()", search);
						Thread.sleep(5000);

			//check ticket status			
						WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[5]"));

						if (replyType.trim().equalsIgnoreCase("Reply & On Hold")) {

							if (ticketStatus.getText().trim().equalsIgnoreCase("Kept On Hold")) {
								System.out.println("Ticket Status is On Hold");
							} else {
								System.out.println("Ticket Status is not On Hold");
							}
							ticketInformation.add(14, ticketStatus.getText());
						
							WebElement dateTime = driver.findElement(By.xpath("//span[@class='post__head--label text-nowrap']"));
							Actions actions = new Actions(driver);
							Action action = actions.moveToElement(dateTime).click().build();
							action.perform();
							Thread.sleep(4000);

							WebElement onholdTime = driver.findElement(By.xpath(
									"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));
							ticketInformation.add(15, onholdTime.getText());
							System.out.println("Modified On: " + onholdTime.getText());
							
							ticketInformation.add(16, "NA");
							ticketInformation.add(17, "NA");
							ticketInformation.add(18, "NA");
							ticketInformation.add(19, "NA");
							ticketInformation.add(20, "NA");
							

				// direct close
				WebElement directCloseButton = driver.findElement(By.xpath("//span[contains(text(),'Direct Close')]"));
				js.executeScript("arguments[0].click()", directCloseButton);
				Thread.sleep(1000);
				WebElement closeWithoutNote = driver
						.findElement(By.xpath("//span[contains(text(),'Close Without Note')]"));
				js.executeScript("arguments[0].click()", closeWithoutNote);
				Thread.sleep(1000);
				WebElement close = driver.findElement(
						By.xpath("//div[@class='alert-modal__actions']//following::span[contains(text(),' Yes ')]"));
				js.executeScript("arguments[0].click()", close);
				Thread.sleep(2000);

 //Close search

				WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
				Thread.sleep(2000);

// ticket close

				verifyClosedTicket(driver, ticketIDValue);
				
				
			}

						}
    }

	 catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
}


@SuppressWarnings("deprecation")
public static void verifyClosedTicket(WebDriver driver, String ticketIDValue) throws Exception {
try {

JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement moreButton = driver.findElement(By.xpath("//a[contains(text(),'More')]"));
js.executeScript("arguments[0].click()", moreButton);

WebElement closedTickets = driver.findElement(By.xpath("//button[contains(text(),' Closed Tickets ')]"));
closedTickets.click();
Thread.sleep(2000);


//search for ticket			
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement search = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-icon[contains(text(),' search')]")));
js.executeScript("arguments[0].click()", search);

Thread.sleep(2000);
WebElement inputbox = driver.findElement(By.id("post-search-input"));

inputbox.sendKeys(ticketIDValue);
js.executeScript("arguments[0].click()", search);
Thread.sleep(5000);

//ticketclosed status
WebElement ticketStatusIcon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'folder')])[5]"));
WebElement ticketStatus = driver.findElement(By.xpath("(//span[@class='post__foot--label'])[5]"));

if (ticketStatusIcon.isDisplayed() && ticketStatus.getText() != "") {
	System.out.println("TicketStatus is displayed");
	if (ticketStatus.getText().trim().equalsIgnoreCase("closed")) {
		System.out.println("Ticket  is closed");
		System.out.println("Reply & hold process completed");
	} else {
		System.out.println("Ticket  is not closed");
	}

} else {
	System.out.println("Ticket Status is not displayed");
}

ticketInformation.add(21, ticketStatus.getText());

WebElement dateTime = driver.findElement(By.xpath("(//span[@class='post__head--label text-nowrap'])[1]"));
Actions actions = new Actions(driver);
Action action = actions.moveToElement(dateTime).click().build();
action.perform();
Thread.sleep(4000);

WebElement modifiedOnTime = driver.findElement(By.xpath(
		"(//span[@class='custom__tooltip--label' and contains(.,'Modified on:')]//following::span)[1]"));

ticketInformation.add(22, modifiedOnTime.getText());
System.out.println("Modified On: " + modifiedOnTime.getText());

CommonFunctions.writeStatusInformationToExcel(ticketInformation);


//open post
WebElement openPost=driver.findElement(By.xpath("//span[contains(text(),'Open Post')]"));
js.executeScript("arguments[0].click()", openPost);
Thread.sleep(3000);

ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(newTb.get(1));
Thread.sleep(5000);
driver.switchTo().window(newTb.get(0));

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

			WebElement expand = driver.findElement(By.xpath("//mat-icon[contains(text(),'expand_less')]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}	
	
	
public static void AgentSignatureworkflowProcess(WebDriver driver) throws Exception {
	try {

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
//response management
		WebElement ResponseManagement = driver
				.findElement(By.xpath("//mat-panel-title[contains(text(),' Response Management')][1]"));
		if (ResponseManagement.isDisplayed()) {
			System.out.println(" Response Management is displayed");
			componentsInformation.add(0, "Present");
		} else {
			System.out.println("Adv Response Management is not displayed");
			componentsInformation.add(0, "Not Present");
		}
		js.executeScript("arguments[0].click()", ResponseManagement);
		Thread.sleep(3000);

//Agent Signature
		WebElement AgentSignatureLogo = driver
				.findElement(By.xpath("//img[@src='assets/account/menu/Agent_Signature.svg']"));
		WebElement AgentSignature = driver.findElement(By.xpath("(//span[contains(text(),'Agent Signature')])"));
		if (AgentSignature.isDisplayed()) {
			System.out.println("Agent Signature is displayed");
			componentsInformation.add(1, "Present");
		} else {
			System.out.println("Agent Signature is not displayed");
			componentsInformation.add(1, "Not Present");
		}
		js.executeScript("arguments[0].click()", AgentSignature);
		Thread.sleep(3000);
		

//Agent Signature tab
		WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
		WebElement agentsignatureTab = driver
				.findElement(By.xpath("(//span[contains(text(),'Agent Signature')])[2]"));
		if (pushpin.isDisplayed() && agentsignatureTab.isDisplayed()) {
			System.out.println("agentsignatureTab is displayed");
			componentsInformation.add(2, "Present");
		} else {
			System.out.println("agentsignatureTab is not displayed");
			componentsInformation.add(2, "Not Present");
		}

//Agent Signature information
		WebElement agentsignatureHeading = driver.findElement(By.xpath("//p[contains(text(),'Agent Signature ')]"));
		WebElement information = driver.findElement(By.xpath("//p[contains(text(),'Configure settings of reply signatures for your brands.')]"));
		if (agentsignatureHeading.isDisplayed() && information.isDisplayed()) {
			System.out.println("Agent Signature Information is displayed");
			componentsInformation.add(3, "Present");
		} else {
			System.out.println("Agent Signature Information is not displayed");
			componentsInformation.add(3, "Not Present");
		}
		
//select brand
		WebElement selectbrand = driver
				.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
		WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
		
		if (selectbrand.isDisplayed() && arrow.isDisplayed()) {
			System.out.println("Select brand field is displayed");
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()",arrow );
			WebElement AJIOBrand=driver.findElement(By.xpath("(//span[contains(text(),'AJIO')])"));
			js.executeScript("arguments[0].click()",AJIOBrand );
			Thread.sleep(5000);
			componentsInformation.add(4, "Present");
		} else {
			System.out.println("Select brand field is not displayed");
			componentsInformation.add(4, "Not Present");
		}

		
//Feature field
		WebElement featureactive = driver
				.findElement(By.xpath("//p[contains(text(),'Feature is Active')]"));
		WebElement featureactiveSymbol = driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])"));
		if (featureactive.isDisplayed() && featureactiveSymbol.isDisplayed()) {
			System.out.println("Feature Field is displayed");
			componentsInformation.add(5, "Present");
			js.executeScript("arguments[0].click()",featureactiveSymbol );
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()",featureactiveSymbol );
			Thread.sleep(3000);
			System.out.println("All UI Components Enabled");
		} else {
			System.out.println("FeatureField is not displayed");
			componentsInformation.add(5, "Not Present");
			System.out.println("All UI Components disabled");
		}





//Pending users signature field
		WebElement Pendinguserheading = driver
				.findElement(By.xpath("//p[contains(text(),'Pending user(s) signature')]"));
		WebElement Addsignaturebutton = driver
				.findElement(By.xpath("//span[contains(text(),'Add Signature(s)')]"));
		if (Pendinguserheading.isDisplayed() && Addsignaturebutton.isDisplayed()) {
			System.out.println("Pending users signature fieldis displayed");
			componentsInformation.add(6, "Present");
		} else {
			System.out.println("Pending users signature field is not displayed");
			componentsInformation.add(6, "Not Present");
		}

//Select channel where signature to be displayed field
		WebElement addKeywordField = driver
				.findElement(By.xpath("//p[contains(text(),'Pending user(s) signature')]"));
		if (addKeywordField.isDisplayed()) {
			System.out.println("Select channel where signature to be displayed field");
			componentsInformation.add(7, "Present");
		} else {
			System.out.println("Select channel where signature to be displayed field");
			componentsInformation.add(7, "Not Present");
		}
		
//Search channels field
		WebElement searchchannels = driver
				.findElement(By.xpath("//input[@placeholder='Search channels']"));
		js.executeScript("arguments[0].click()",searchchannels );
		Thread.sleep(3000);
		WebElement AddChannel = driver.findElement(By.xpath("//span[contains(text(),'WhatsApp')]"));
		js.executeScript("arguments[0].click()",AddChannel);
		
		if (searchchannels.isDisplayed()) {
			System.out.println("Search channels field   is displayed");
			componentsInformation.add(8, "Present");
		} else {
			System.out.println("Search channels field is not displayed");
			componentsInformation.add(8, "Not Present");
		}
		
//DM Checkbox
		WebElement DMCheckbox = driver
				.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));
		if (DMCheckbox.isDisplayed()) {
			System.out.println("DM Checkboxis displayed");
			componentsInformation.add(9, "Present");
		} else {
			System.out.println("DM Checkboxnot displayed");
			componentsInformation.add(9, "Not Present");
		}
		
//Saperator Symbol
		WebElement Saperatorsymbol = driver
				.findElement(By.xpath("(//mat-select[@aria-required='false'])[2]"));
		if (Saperatorsymbol.isDisplayed()) {
			System.out.println(" Saperatorsymbol displayed");
			js.executeScript("arguments[0].click()",Saperatorsymbol );
			Thread.sleep(3000);
			WebElement Symboldropdown = driver.findElement(By.xpath("(//span[contains(text(),'*')])[4]"));
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()",Symboldropdown );
			Thread.sleep(3000);
			componentsInformation.add(10, "Present");
		} else {
			System.out.println(" Saperatorsymbol displayed");
			componentsInformation.add(10, "Not Present");
		}
		
//Append New Line before Signature
		WebElement Appendcheckbox = driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));
		WebElement Appendinfo = driver.findElement(By.xpath("//span[contains(text(),'Append new line before signature')]"));
		if (Appendcheckbox.isDisplayed() && Appendinfo.isDisplayed()) {
			System.out.println("Append New Line before Signature is displayed");
			componentsInformation.add(11, "Present");
		} else {
			System.out.println("Append New Line before Signature is not displayed");
			componentsInformation.add(11, "Not Present");
		}
		
	//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

//Signature Preview field
		
		WebElement SignaturePreviewField = driver
				.findElement(By.xpath("//div[@class='agentsign__smchannel--sign bg__grey--lighter']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", SignaturePreviewField);
		Thread.sleep(3000);
		if (SignaturePreviewField.isDisplayed()) {
			System.out.println("Signature preview field is displayed");
			
	   WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])"));
	   js.executeScript("arguments[0].click()",edit);
	   Thread.sleep(3000);
	   
	  js.executeScript("arguments[0].scrollIntoView();",edit);
	   WebElement selectuserdropdown = driver.findElement(By.xpath("(//mat-select[@aria-required='false'])[4]"));
	   js.executeScript("arguments[0].click()",selectuserdropdown);
	   Thread.sleep(3000);
	   WebElement selectuser = driver.findElement(By.xpath("//span[contains(text(),'Komal suplive(komalsup)')]"));
	   js.executeScript("arguments[0].click()",selectuser);
	   Thread.sleep(3000);
	   WebElement ApplyButton = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
	   js.executeScript("arguments[0].click()",ApplyButton);
	   Thread.sleep(3000);
			componentsInformation.add(12, "Present");
		} else {
			System.out.println("Signature preview field is not displayed");
			componentsInformation.add(12, "Not Present");
		}
		
//Save settings
		
		 WebElement save = driver.findElement(By.xpath("//span[contains(text(),' Save Settings ')]"));
		  js.executeScript("arguments[0].click()",save);
		  Thread.sleep(3000);
		  
		WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
		js.executeScript("arguments[0].click()", arrowBack);
		Thread.sleep(3000);

		componentsInformation.add(13, CommonFunctions.getDataTime());
		
	


			
		CommonFunctions.writeUIComponentsToExcel(componentsInformation, "AgentSignatureUIcomponents");
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
}
}

