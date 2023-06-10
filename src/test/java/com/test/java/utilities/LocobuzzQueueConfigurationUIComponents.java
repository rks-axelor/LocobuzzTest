package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzQueueConfigurationUIComponents {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
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

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void verifyingQueueConfigurationComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//response management
			WebElement responseManagement = driver
					.findElement(By.xpath("(//mat-panel-title[contains(text(),' Response Management ')])[1]"));
			if (responseManagement.isDisplayed()) {
				System.out.println("Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", responseManagement);
			Thread.sleep(3000);

//queue management
			WebElement queueManagementLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Queue_Configuration.svg']"));
			WebElement queueManagement = driver.findElement(By.xpath("//span[contains(text(),'Queue Configuration')]"));
			if (queueManagementLogo.isDisplayed() && queueManagement.isDisplayed()) {
				System.out.println("Queue Management is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Queue Management is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", queueManagement);
			Thread.sleep(3000);

//queue management tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement qmTab = driver.findElement(By.xpath("(//span[contains(text(),'Queue Configuration')])[2]"));
			if (pushpin.isDisplayed() && qmTab.isDisplayed()) {
				System.out.println("Queue management Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Queue management Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//queue management information
			WebElement heading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement info = driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[1]"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("Queue Management Information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Queue Management Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])"));
			if (brandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Brand Field is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Brand Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//teams
			WebElement agentTeam = driver.findElement(By.xpath("(//span[contains(text(),'Agent')])[4]"));
			WebElement csdTeam = driver.findElement(By.xpath("(//span[contains(text(),'CSD')])"));
			WebElement brandTeam = driver.findElement(By.xpath("(//span[contains(text(),'Brand')])"));
			if (agentTeam.isDisplayed() && csdTeam.isDisplayed() && brandTeam.isDisplayed()) {
				System.out.println("All Teams are displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("All Teams are not displayed");
				componentsInformation.add(5, "Not Present");
			}

//activity agent information and button
			WebElement activityHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4 mr-10']"));
			WebElement activityInfo = driver.findElement(By.xpath("//p[@class='text__sub--sm mb-0']"));
			WebElement active = driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
			if (activityHeading.isDisplayed() && activityInfo.isDisplayed() && active.isDisplayed()) {
				System.out.println("Activity Agent Information and active button are displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Activity Agent Information and active button are not displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", active);
			Thread.sleep(3000);

//ticket assignment information and fields
			WebElement ticketAssignmentHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-2']"));
			WebElement ticketAssignmentHeading1 = driver.findElement(By.xpath("//p[@class='text__sub--sm mb-15']"));
			WebElement assignmentDurationField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement assignmentLimit = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (ticketAssignmentHeading.isDisplayed() && ticketAssignmentHeading1.isDisplayed()
					&& assignmentDurationField.isDisplayed() && assignmentLimit.isDisplayed()) {
				System.out.println("Ticket Assignment information and field are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Ticket Assignment information and field are not displayed");
				componentsInformation.add(7, "Not Present");
			}

//ticket order and types
			WebElement ticketOrderHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-3']"));
			WebElement latestTicket = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]"));
			WebElement oldestTicket = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]"));
			if (ticketOrderHeading.isDisplayed() && latestTicket.isDisplayed() && oldestTicket.isDisplayed()) {
				System.out.println("Ticket order types are displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Ticket order types are not displayed");
				componentsInformation.add(8, "Not Present");
			}

//enforce skill based assignment information
			WebElement enforceHeading = driver
					.findElement(By.xpath("//mat-checkbox[@class='mat-checkbox mat-accent']"));
			WebElement viewAgentSkills = driver
					.findElement(By.xpath("//span[@class='queueconfig__container--body-skill link-hover']"));
			WebElement enforceInfo = driver.findElement(By.xpath("//p[@class='text__light text__sm ml-23 mb-4']"));
			if (enforceHeading.isDisplayed() && viewAgentSkills.isDisplayed() && enforceInfo.isDisplayed()) {
				System.out.println("Enforce Skill Based assignment information is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Enforce Skill Based assignment information is not displayed");
				componentsInformation.add(9, "Not Present");
			}

//agent ticket affinity information
			WebElement affinityHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4']"));
			WebElement affinityInfo = driver.findElement(By.xpath("//p[@class='text__light mb-0 font-size-12']"));
			if (affinityHeading.isDisplayed() && affinityInfo.isDisplayed()) {
				System.out.println("Agent Ticket Affinity Information is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Agent Ticket Affinity Information is not displayed");
				componentsInformation.add(10, "Not Present");
			}

//affinity types
			WebElement highAnffinity = driver
					.findElement(By.xpath("//div[@class='queueconfig__container--card bg__white card-active']"));
			WebElement mediumAnffinity = driver
					.findElement(By.xpath("(//div[@class='queueconfig__container--card bg__white'])[1]"));
			WebElement lowAnffinity = driver
					.findElement(By.xpath("(//div[@class='queueconfig__container--card bg__white'])[2]"));
			if (highAnffinity.isDisplayed() && mediumAnffinity.isDisplayed() && lowAnffinity.isDisplayed()) {
				System.out.println("All Types of Affinity are displayed ");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("All Types of Affinity are not displayed ");
				componentsInformation.add(11, "Not Present");
			}

//note message
			WebElement noteMessage = driver.findElement(By.xpath("(//span[@class='text__sm'])"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(12, "Not Present");
			}

			csdConfigurationProcess(driver);
			brandConfigurationProcess(driver);

			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void csdConfigurationProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//csd team button
			WebElement csdTeam = driver.findElement(By.xpath("//span[contains(text(),'CSD')]"));
			js.executeScript("arguments[0].click()", csdTeam);
			Thread.sleep(3000);

//activity csd information and button
			WebElement activityHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4 mr-10']"));
			WebElement csdActivityInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[1]"));
			WebElement activeButton = driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])"));
			if (activityHeading.isDisplayed() && csdActivityInfo.isDisplayed() && activeButton.isDisplayed()) {
				System.out.println("Activity CSD Information and Button are displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Activity CSD Information and Button are not displayed");
				componentsInformation.add(13, "Not Present");
			}
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);

//process
		/*	WebElement createTeam = driver.findElement(By.xpath("//span[contains(text(),' Create Team ')]"));
			js.executeScript("arguments[0].click()", createTeam);
			Thread.sleep(3000);

			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);*/

//views information and types
			WebElement viewsHeading = driver.findElement(By.xpath("//span[contains(text(),'View as')]"));
			WebElement infoSymbol = driver
					.findElement(By.xpath("//img[@src='assets/images/account/info-button-grey.svg ']"));
			WebElement viewsInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[2]"));
			WebElement viewsType = driver.findElement(
					By.xpath("(//mat-radio-button[@class='mat-radio-button mat-radio-checked mat-accent'])[1]"));
			WebElement viewsType1 = driver
					.findElement(By.xpath("(//mat-radio-button[@class='mat-radio-button mat-accent'])[1]"));
			if (viewsHeading.isDisplayed() && infoSymbol.isDisplayed() && viewsInfo.isDisplayed()
					&& viewsType.isDisplayed() && viewsType1.isDisplayed()) {
				System.out.println("Views Information and Types are displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Views Information and Types are not displayed");
				componentsInformation.add(14, "Not Present");
			}

//ticket assignment information and fields
			WebElement assignmentHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-2 mt-25']"));
			WebElement info = driver.findElement(By.xpath("//p[@class='text__sub--sm mb-10']"));
			WebElement assignmentDurationField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement assignmentLimitField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (assignmentHeading.isDisplayed() && info.isDisplayed() && assignmentDurationField.isDisplayed()
					&& assignmentLimitField.isDisplayed()) {
				System.out.println("Ticket Assignment Information and Field are displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Ticket Assignment Information and Field are not displayed");
				componentsInformation.add(15, "Not Present");
			}

//ticket order types
			WebElement ticketOrderHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-3']"));
			WebElement latestTicket = driver.findElement(
					By.xpath("(//mat-radio-button[@class='mat-radio-button mat-accent mat-radio-checked'])"));
			WebElement oldestTicket = driver
					.findElement(By.xpath("(//mat-radio-button[@class='mat-radio-button mat-accent'])[2]"));
			if(ticketOrderHeading.isDisplayed()&&latestTicket.isDisplayed()&&oldestTicket.isDisplayed()) {
				System.out.println("Ticket Order Types are displayed");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Ticket Order Types are not displayed");
				componentsInformation.add(16, "Not Present");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void brandConfigurationProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//brand team button
			WebElement brandTeam=driver.findElement(By.xpath("(//span[contains(text(),'Brand')])"));
			js.executeScript("arguments[0].click()", brandTeam);
			Thread.sleep(3000);
			
//activity brand information and button
			WebElement activityHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4 mr-10']"));
			WebElement brandActivityInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[1]"));
			WebElement activeButton = driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])"));
			if (activityHeading.isDisplayed() && brandActivityInfo.isDisplayed() && activeButton.isDisplayed()) {
				System.out.println("Activity Brand Information and Button are displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Activity Brand Information and Button are not displayed");
				componentsInformation.add(17, "Not Present");
			}
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);

//process
		/*	WebElement createTeam = driver.findElement(By.xpath("//span[contains(text(),' Create Team ')]"));
			js.executeScript("arguments[0].click()", createTeam);
			Thread.sleep(3000);

			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);*/

//views information and types
			WebElement viewsHeading = driver.findElement(By.xpath("//span[contains(text(),'View as')]"));
			WebElement infoSymbol = driver
					.findElement(By.xpath("//img[@src='assets/images/account/info-button-grey.svg']"));
			WebElement viewsInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[2]"));
			WebElement viewsType = driver.findElement(
					By.xpath("(//mat-radio-button[@class='mat-radio-button mat-radio-checked mat-accent'])[1]"));
			WebElement viewsType1 = driver
					.findElement(By.xpath("(//mat-radio-button[@class='mat-radio-button mat-accent'])[1]"));
			if (viewsHeading.isDisplayed() && infoSymbol.isDisplayed() && viewsInfo.isDisplayed()
					&& viewsType.isDisplayed() && viewsType1.isDisplayed()) {
				System.out.println("Views Information and Types are displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Views Information and Types are not displayed");
				componentsInformation.add(18, "Not Present");
			}

//ticket assignment information and fields
			WebElement assignmentHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-2 mt-25']"));
			WebElement info = driver.findElement(By.xpath("//p[@class='text__sub--sm mb-10']"));
			WebElement assignmentDurationField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement assignmentLimitField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			if (assignmentHeading.isDisplayed() && info.isDisplayed() && assignmentDurationField.isDisplayed()
					&& assignmentLimitField.isDisplayed()) {
				System.out.println("Ticket Assignment Information and Field are displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("Ticket Assignment Information and Field are not displayed");
				componentsInformation.add(19, "Not Present");
			}

//ticket order types
			WebElement ticketOrderHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-3']"));
			WebElement latestTicket = driver.findElement(
					By.xpath("(//mat-radio-button[@class='mat-radio-button mat-accent mat-radio-checked'])"));
			WebElement oldestTicket = driver
					.findElement(By.xpath("(//mat-radio-button[@class='mat-radio-button mat-accent'])[2]"));
			if(ticketOrderHeading.isDisplayed()&&latestTicket.isDisplayed()&&oldestTicket.isDisplayed()) {
				System.out.println("Ticket Order Types are displayed");
				componentsInformation.add(20, "Present");
			}
			else {
				System.out.println("Ticket Order Types are not displayed");
				componentsInformation.add(20, "Not Present");
			}
			
			componentsInformation.add(21, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "QueueConfigurationUIComponents");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
