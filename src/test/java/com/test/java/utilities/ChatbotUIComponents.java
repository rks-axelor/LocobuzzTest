package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChatbotUIComponents {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void assignProcess(WebDriver driver, String channel) throws Exception {
		try {

//tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);

			CommonFunctions.ticketsSearch(driver, channel);

//Assigning  to agent
			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(2000);
			WebElement assignTo = driver.findElement(By.xpath("(//span[contains(text(),'Assign to')])"));
			js.executeScript("arguments[0].click()", assignTo);
			Thread.sleep(2000);
			WebElement selectUser = driver
					.findElement(By.xpath("//mat-label[contains(text(),'Select User')]//preceding::input[1]"));
			js.executeScript("arguments[0].click()", selectUser);
			Thread.sleep(2000);
			WebElement assignUser = driver.findElement(By.xpath("(//span[contains(text(),'kalyan agent')])"));
			js.executeScript("arguments[0].click()", assignUser);
			Thread.sleep(2000);
			WebElement assignButton = driver.findElement(By.xpath("(//span[contains(text(),'Assign')])[2]"));
			js.executeScript("arguments[0].click()", assignButton);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void agentChatbotUIComponents(WebDriver driver, String channel) throws Exception {
		try {

// Agentlogin
			String mainWindow = driver.getWindowHandle();
			System.out.println("Main Window: " + mainWindow);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://locobuzzng-atest.locobuzz.com/login");

			String childWindow = driver.getWindowHandle();
			System.out.println("Child Window: " + childWindow);

			CommonFunctions.login(driver, "Agent");
			
			driver.navigate().refresh();
						

//tickets tab
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement ticketsTab = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]")));
			/*WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label' and contains(text(),'Tickets')]"));*/
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);
			Thread.sleep(2000);			
			
//opentab
			WebDriverWait wait1 = new WebDriverWait(driver, 10);
			WebElement openTickets = wait1
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Open')]")));
			js.executeScript("arguments[0].click()", openTickets);
			Thread.sleep(5000);
			

//selecting brand
			WebElement brand = driver.findElement(By.xpath("(//span[contains(text(),' All ')])[2]"));
			js.executeScript("arguments[0].click()", brand);
			WebElement brandName = driver.findElement(By.xpath("//input[@data-placeholder='Search brand']"));
			brandName.sendKeys("Kalyan");
			WebElement selectBrand = driver.findElement(By.xpath("(//div[contains(text(),' kalyan ')])[1]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(4000);

//chatbot 
			WebElement chatbot = driver.findElement(By.xpath("//img[@src='/assets/images/common/chat-bubble.svg']"));
			if (chatbot.isDisplayed()) {
				System.out.println("Chatbot Logo is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Chatbot Logo is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", chatbot);
			Thread.sleep(5000);
			System.out.println("Chatbot page is open");

//Facebook messenger logo
			WebElement facebookMessengerLogo = driver
					.findElement(By.xpath("//img[@src='/assets/images/channel-logos/messanger.svg']"));
			if (facebookMessengerLogo.isDisplayed()) {
				System.out.println("Facebook Messenger logo is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Facebook Messenger logo is not displayed");
				componentsInformation.add(1, "Not Present");
			}

//instagram messenger logo
			WebElement instagramMessengerLogo = driver
					.findElement(By.xpath("//img[@src='/assets/images/channel-logos/insta_dm.svg']"));
			if (instagramMessengerLogo.isDisplayed()) {
				System.out.println("Instagram Messenger logo is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Instagram Messenger logo is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//crop din 
			WebElement cropDin = driver.findElement(By.xpath("//mat-icon[contains(text(),'crop_din')]"));
			if (cropDin.isDisplayed()) {
				System.out.println("Crop Din is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Crop Din is not displayed");
				componentsInformation.add(3, "Not Present");
			}
			js.executeScript("arguments[0].click()", cropDin);
			Thread.sleep(2000);

			System.out.println("Crop din is expand");
//username
			WebElement userName = driver
					.findElement(By.xpath("//span[contains(@class,'text__label chatbot__user--name')]"));
			if (userName.isDisplayed()) {
				System.out.println("Username is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Username is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//username messaged from brand
			WebElement messaged = driver.findElement(By.xpath("//p[contains(@class,'text__sub')]"));
			if (messaged.isDisplayed()) {
				System.out.println("User Messaged from brand is dispalyed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("User Messaged from brand is not dispalyed");
				componentsInformation.add(5, "Not Present");
			}

//view chat history logo
			WebElement chatHistoryLogo = driver.findElement(By.xpath("//mat-icon[contains(text(),' history')]"));
			if (chatHistoryLogo.isDisplayed()) {
				System.out.println("Chat History Logo is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Chat History Logo is not displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", chatHistoryLogo);
			Thread.sleep(3000);

			System.out.println("Chat History page is open");

//conversation history
			WebElement conversationHistory = driver
					.findElement(By.xpath("//h3[contains(text(),'Conversation history')]"));
			if (conversationHistory.isDisplayed()) {
				System.out.println("Conversation History Title is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Conversation History Title is not displayed");
				componentsInformation.add(7, "Not Present");
			}

//username messaged from brand in histroy
			WebElement message = driver.findElement(By.xpath("(//p[contains(@class,'text__sub')])[2]"));
			if (message.isDisplayed()) {
				System.out.println("User Messaged from brand in histroy  is dispalyed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("User Messaged from brand in histroy is not dispalyed");
				componentsInformation.add(8, "Not Present");
			}

//close button in history
			WebElement closeButton = driver.findElement(
					By.xpath("(//mat-icon[@fontset='material-icons-outlined' and contains(text(),'close')])[4]"));
			if (closeButton.isDisplayed()) {
				System.out.println("Close Button in Histroy is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Close Button in Histroy is not displayed");
				componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);

			System.out.println("Chat History page is closed ");

//remaining days to reply for ticket
			WebElement days = driver.findElement(By.xpath("(//div[contains(@class,'days__reply')])[2]"));
			if (days.isDisplayed()) {
				System.out.println("Remaining Days to reply for ticket is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Remaining Days to reply for ticket is not displayed");
				componentsInformation.add(10, "Not Present");
			}

//ticket id
			WebElement ticketIcon = driver.findElement(By.xpath("//mat-icon[contains(text(),' local_activity ')]"));
			WebElement ticketID = driver
					.findElement(By.xpath("//mat-icon[contains(text(),' local_activity ')]//following::span[1]"));
			if (ticketIcon.isDisplayed() && ticketID.getText() != "") {
				System.out.println("Ticket ID  is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Ticket ID  is not  displayed");
				componentsInformation.add(11, "Not Present");
			}

//escalate
			WebElement escalateIcon = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'escalator_warning')])"));
			WebElement escalate = driver.findElement(By.xpath("(//span[contains(text(),' Escalate')])"));
			if (escalateIcon.isDisplayed() && escalate.isDisplayed()) {
				System.out.println("Escalate is displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Escalate is not displayed");
				componentsInformation.add(12, "Not Present");
			}

//canned responses
			WebElement cannedResponseIcon = driver
					.findElement(By.xpath("//img[@src='assets/images/chatbot/canned.svg']"));
			WebElement cannedResponse = driver.findElement(By.xpath("//span[contains(text(),' Canned Responses')]"));
			if (cannedResponseIcon.isDisplayed() && cannedResponse.isDisplayed()) {
				System.out.println("Canned Response is displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Canned Response is not displayed");
				componentsInformation.add(13, "Not Present");
			}

//closed ticket
			WebElement closedTicketIcon = driver
					.findElement(By.xpath("(//span[contains(text(),' Close Ticket')])//preceding::mat-icon[1]"));
			WebElement closedTicket = driver.findElement(By.xpath("(//span[contains(text(),' Close Ticket')])"));
			if (closedTicketIcon.isDisplayed() && closedTicket.isDisplayed()) {
				System.out.println("Closed Ticket is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Closed Ticket is not displayed");
				componentsInformation.add(14, "Not Present");
			}

//Eye Symbol
			WebElement eyeSymbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),' remove_red_eye')])"));
			if (eyeSymbol.isDisplayed()) {
				System.out.println("Eye Symbol is displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Eye Symbol is not displayed");
				componentsInformation.add(15, "Not Present");
			}

			js.executeScript("arguments[0].click()", eyeSymbol);
			Thread.sleep(5000);

			System.out.println("we went to Ticket History page");
//new ticket filter
			WebElement newTicketFilter = driver
					.findElement(By.xpath("(//span[contains(text(),'New Ticket Filter')])[1]"));
			if (newTicketFilter.isDisplayed()) {
				System.out.println("New Ticket Filter is displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("New Ticket Filter is not displayed");
				componentsInformation.add(16, "Not Present");
			}
			js.executeScript("arguments[0].click()", newTicketFilter);
			Thread.sleep(2000);
			
			WebElement chatbot1 = driver.findElement(By.xpath("//img[@src='/assets/images/common/chat-bubble.svg']"));
			js.executeScript("arguments[0].click()", chatbot1);
			Thread.sleep(2000);

//emoji
			WebElement emoji = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'sentiment_satisfied_alt ')])"));
			if (emoji.isDisplayed()) {
				System.out.println("Emoji is displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Emoji is not displayed");
				componentsInformation.add(17, "Not Present");
			}

//attach file
			WebElement attachFile = driver.findElement(By.xpath("(//mat-icon[contains(text(),'attach_file')])"));
			if (attachFile.isDisplayed()) {
				System.out.println("Attach File Icon is displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Attach File Icon is not displayed");
				componentsInformation.add(18, "Not Present");
			}
			js.executeScript("arguments[0].click()", attachFile);
			Thread.sleep(3000);
			System.out.println("Attach file is open");

//media gallery
			WebElement mediaGallery = driver.findElement(By.xpath("(//span[contains(text(),'Media Gallery')])"));
			if (mediaGallery.isDisplayed()) {
				System.out.println("Media Gallery is displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("Media Gallery is not displayed");
				componentsInformation.add(19, "Not Present");
			}
			js.executeScript("arguments[0].click()", mediaGallery);
			Thread.sleep(2000);

//white space
			WebElement whiteSpace = driver
					.findElement(By.xpath("//input[@type='text' and contains(@class,'p-0 bg__white')]"));
			whiteSpace.sendKeys("done");

			WebElement sendButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'send')]"));
			if (sendButton.isDisplayed()) {
				System.out.println("Send Button is visible");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Send Button is not visible");
				componentsInformation.add(20, "Not Present");
			}
			Thread.sleep(3000);

//close button
			WebElement closeButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[4]"));
			if (closeButton1.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(21, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton1);
			
			componentsInformation.add(22,CommonFunctions.getDataTime());
			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"ChatbotUIComponents");

// logout
			CommonFunctions.logout(driver);

			driver.switchTo().window(childWindow).close();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
