package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAdvanceTicketSettingsUIComponents {

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

	public static void verifyingAdvanceTicketSettingComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv.response management
			WebElement advResponseManagement = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			if (advResponseManagement.isDisplayed()) {
				System.out.println("Advance Response Management is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Advance Response Management is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);
			
			

//advance ticket settings
			WebElement advTicketSettingLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Advanced Ticket Setting.svg']"));
			WebElement advTicketSetting = driver
					.findElement(By.xpath("//span[contains(text(),'Advance Ticket Setting')]"));		
			js.executeScript("arguments[0].scrollIntoView()", advTicketSetting);
			Thread.sleep(3000);
			if (advTicketSettingLogo.isDisplayed() && advTicketSetting.isDisplayed()) {
				System.out.println("Advance Ticket Settings image and name are displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Advance Ticket Settings image and name are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", advTicketSetting);
			Thread.sleep(3000);

//advance ticket settings tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement advTicketSettingTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Advance Email Ticket Setting')])[1]"));
			if (pushpin.isDisplayed() && advTicketSettingTab.isDisplayed()) {
				System.out.println("Advance Ticket Settings Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Advance Ticket Settings Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//advance ticket settings information
			WebElement advTicketSettingHeading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title']"));
			WebElement advTicketSettingInfo = driver
					.findElement(By.xpath("//p[@class='mb-0 mt-6 text__light--sm font-weight-400']"));
			if (advTicketSettingHeading.isDisplayed() && advTicketSettingInfo.isDisplayed()) {
				System.out.println("Advance Ticket Setting Heading and Information are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Advance Ticket Setting Heading and Information are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])"));
			if (searchField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//reopen ticket button
			WebElement reopenButton = driver.findElement(By.xpath("//div[contains(text(),' Reopen Ticket ')]"));
			if (reopenButton.isDisplayed()) {
				System.out.println("Reopen Button is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Reopen Button is not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", reopenButton);
			Thread.sleep(3000);

//feature active button
			WebElement featureHeading = driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4 mr-12']"));
			WebElement activeButton = driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			if (featureHeading.isDisplayed() && activeButton.isDisplayed()) {
				System.out.println("Feature Active Heading and Button are displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Feature Active Heading and Button are not displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);

//ticket is closed reopen ticket
			WebElement ticketHeading = driver.findElement(By.xpath("(//p[@class='emailticket__body--title'])[1]"));
			WebElement ticketInfo = driver.findElement(By.xpath("(//p[@class='emailticket__body--subtitle'])[1]"));
			if (ticketHeading.isDisplayed() && ticketInfo.isDisplayed()) {
				System.out.println("Ticket is closed reopen ticket heading and information are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Ticket is closed reopen ticket heading and information are not displayed");
				componentsInformation.add(7, "Not Present");
			}

//ticket hours field
			WebElement hoursField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement hoursArrowUp = driver.findElement(By.xpath("//mat-icon[contains(text(),' keyboard_arrow_up')]"));
			WebElement hoursArrowdown = driver
					.findElement(By.xpath("//mat-icon[contains(text(),' keyboard_arrow_down')]"));
			WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Hours')]"));
			if (hoursField.isDisplayed() && hoursArrowUp.isDisplayed() && hoursArrowdown.isDisplayed()
					&& name.isDisplayed()) {
				System.out.println("Ticket Hours Field is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Ticket Hours Field is not displayed");
				componentsInformation.add(8, "Not Present");
			}

//ticket minutes field
			WebElement minutesField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			WebElement minutesArrowUp = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_up')])[2]"));
			WebElement minutesArrowdown = driver
					.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[2]"));
			WebElement name1 = driver.findElement(By.xpath("//span[contains(text(),'Minutes')]"));
			WebElement heading = driver.findElement(By.xpath("//span[@class='font-weight-600']"));
			if (minutesField.isDisplayed() && minutesArrowUp.isDisplayed() && minutesArrowdown.isDisplayed()
					&& name1.isDisplayed() && heading.isDisplayed()) {
				System.out.println("Ticket Minutes Field is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Ticket Minutes Field is not displayed");
				componentsInformation.add(9, "Not Present");
			}

//note message
			WebElement noteMessage = driver
					.findElement(By.xpath("//p[@class='emailticket__body--subtitle mt-5 mb-25']"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(10, "Not Present");
			}

//reopen ticket directly closed ticket
			WebElement reopenTicketHeading = driver
					.findElement(By.xpath("(//p[@class='emailticket__body--title'])[2]"));
			WebElement reopenTicketInfo = driver
					.findElement(By.xpath("(//p[@class='emailticket__body--subtitle mb-15'])"));
			WebElement radioButton = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]"));
			WebElement radioButton1 = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]"));
			if (reopenTicketHeading.isDisplayed() && reopenTicketInfo.isDisplayed() && radioButton.isDisplayed()
					&& radioButton1.isDisplayed()) {
				System.out.println(
						"Reopen Ticket directly closed ticket heading,information and radio buttons are displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println(
						"Reopen Ticket directly closed ticket heading,information and radio buttons are not displayed");
				componentsInformation.add(11, "Not Present");
			}
			
//custom settings
			WebElement customSettingsHeading=driver.findElement(By.xpath("(//p[@class='emailticket__body--title'])[3]"));
			WebElement customSettingsInfo=driver.findElement(By.xpath("(//p[@class='emailticket__body--subtitle'])[2]"));
			if(customSettingsHeading.isDisplayed()&&customSettingsInfo.isDisplayed()) {
				System.out.println("Custom Settings heading and information are displayed");
				componentsInformation.add(12, "Present");
			}
			else {
				System.out.println("Custom Settings heading and information are not displayed");
				componentsInformation.add(12, "Not Present");
			}
			
//channels
			WebElement channels=driver.findElement(By.xpath("//div[@class='card__body grid']"));
			if(channels.isDisplayed()) {
				System.out.println("All channels are displayed");
				componentsInformation.add(13, "Present");
			}
			else {
				System.out.println("All channels are not displayed");
				componentsInformation.add(13, "Not Present");
			}
			
//customize button
			WebElement customizeButton=driver.findElement(By.xpath("//span[contains(text(),' Customize ')]"));
			if(customizeButton.isDisplayed()) {
				System.out.println("Customize Button is displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Customize Button is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			js.executeScript("arguments[0].click()", customizeButton);
			Thread.sleep(3000);
			
//customize heading
			WebElement customizeHeading=driver.findElement(By.xpath("//h3[contains(@class,'modal__title text-capitalize')]"));
			if(customizeHeading.isDisplayed()) {
				System.out.println("Customize Heading is displayed");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Customize Heading is not displayed");
				componentsInformation.add(15, "Not Present");
			}
			
//select channels
			WebElement selectChannelsHeading=driver.findElement(By.xpath("//h4[@class='text__label mb-0']"));
			WebElement selectChannelsInfo=driver.findElement(By.xpath("//p[contains(@class,'text__light--sm mb-7')]"));
			WebElement selectChannelsField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement arrow1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[3]"));
			if(selectChannelsHeading.isDisplayed()&&selectChannelsInfo.isDisplayed()&&selectChannelsField.isDisplayed()&&arrow1.isDisplayed()) {
				System.out.println("Select Channels information and field are displayed");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Select Channels information and field are not displayed");
				componentsInformation.add(16, "Not Present");
			}
			
//field
			WebElement field=driver.findElement(By.xpath("//div[contains(@class,'autoclosureedit__twitterchannel bg__grey--lighter mt-15')]"));
			if(field.isDisplayed()) {
				System.out.println("Field is displayed");
				componentsInformation.add(17, "Present");
			}
			else {
				System.out.println("Field is not displayed");
				componentsInformation.add(17, "Not Present");
			}
			
//reset button
			WebElement resetButton=driver.findElement(By.xpath("//span[contains(text(),'Reset')]"));
			if(resetButton.isDisplayed()) {
				System.out.println("Reset Button is displayed");
				componentsInformation.add(18, "Present");
			}
			else {
				System.out.println("Reset Button is not displayed");
				componentsInformation.add(18, "Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),' Done ')])"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(19, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(19, "Not Present");
			}
			
//cross/close button
			WebElement crossButton=driver.findElement(By.xpath("//mat-icon[contains(text(),' close ')]"));
			if(crossButton.isDisplayed()) {
				System.out.println("Cross/Closed Button is displayed");
				componentsInformation.add(20, "Present");
			}
			else {
				System.out.println("Cross/Closed Button is not displayed");
				componentsInformation.add(20, "Not Present");
			}
			js.executeScript("arguments[0].click()", crossButton);
			Thread.sleep(3000);
			
//cancel Button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(21, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(21, "Not Present");
			}
			
//save button
			WebElement saveButton1=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			if(saveButton1.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(22, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(22, "Not Present");
			}
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(3000);
			
//force read email button
			WebElement readEmailButton=driver.findElement(By.xpath("//div[contains(text(),' Force Read Email ')]"));
			if(readEmailButton.isDisplayed()) {
				System.out.println("Force Read Email button is displayed ");
				componentsInformation.add(23, "Present");
			}
			else {
				System.out.println("Force Read Email button is not displayed ");
				componentsInformation.add(23, "Not Present");
			}
			js.executeScript("arguments[0].click()", readEmailButton);
			Thread.sleep(3000);
			
//feature active button for emails
			WebElement featureActiveHeading=driver.findElement(By.xpath("//p[@class='font-weight-600 mb-4 mr-12']"));
			WebElement featureActiveButton=driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[1]"));
			if(featureActiveHeading.isDisplayed()&&featureActiveButton.isDisplayed()) {
				System.out.println("Feature Actie Button for emails is displayed");
				componentsInformation.add(24, "Present");
			}
			else {
				System.out.println("Feature Actie Button for emails is not displayed");
				componentsInformation.add(24, "Not Present");
			}
			js.executeScript("arguments[0].click()", featureActiveButton);
			Thread.sleep(3000);
			
//selected channel for ticket actions
			WebElement selectedChannelHeading=driver.findElement(By.xpath("(//p[@class='emailticket__body--title'])[1]"));
			WebElement selectedChannelInfo=driver.findElement(By.xpath("(//p[@class='emailticket__body--subtitle'])[1]"));
			WebElement selectedChannel=driver.findElement(By.xpath("//div[@class='d-flex-items-center mt-8']"));
			if(selectedChannelHeading.isDisplayed()&&selectedChannelInfo.isDisplayed()&&selectedChannel.isDisplayed()) {
				System.out.println("Selected Channels information and channel are displayed");
				componentsInformation.add(25, "Present");
			}
			else {
				System.out.println("Selected Channels information and channel are not displayed");
				componentsInformation.add(25, "Not Present");
			}
			
//role wise
			WebElement rolewiseHeading=driver.findElement(By.xpath("(//p[@class='emailticket__body--title'])[2]"));
			WebElement rolewiseInfo=driver.findElement(By.xpath("(//p[@class='emailticket__body--subtitle'])[2]"));
			if(rolewiseHeading.isDisplayed()&&rolewiseInfo.isDisplayed()) {
				System.out.println("Role Wise information is displayed");
				componentsInformation.add(26, "Present");
			}
			else {
				System.out.println("Role Wise information is not displayed");
				componentsInformation.add(26, "Not Present");
			}
			
//role&active heading
			WebElement roleHeading=driver.findElement(By.xpath("//th[contains(text(),'Role')]"));
			WebElement activeHeading=driver.findElement(By.xpath("//th[contains(text(),' Active/Inactive ')]"));
			if(roleHeading.isDisplayed()&&activeHeading.isDisplayed()) {
				System.out.println("Role and Active/Inactive heading are displayed");
				componentsInformation.add(27, "Present");
			}
			else {
				System.out.println("Role and Active/Inactive heading are not displayed");
				componentsInformation.add(27, "Not Present");
			}
			
//agency(heading,active button)
			WebElement agencyImage=driver.findElement(By.xpath("(//img[@src='assets/images/agentimages/sample-image.svg'])[2]"));
			WebElement agencyHeading=driver.findElement(By.xpath("//span[contains(text(),'Agency')]"));
			WebElement agencyActiveButton=driver.findElement(By.xpath("//div[contains(@class,'mat-tooltip-trigger rounded-toggle-switch mt-4')]"));
			if(agencyImage.isDisplayed()&&agencyHeading.isDisplayed()&&agencyActiveButton.isDisplayed()) {
				System.out.println("Agency heading and active button are displayed");
				componentsInformation.add(28, "Present");
			}
			else {
				System.out.println("Agency heading and active button are not displayed");
				componentsInformation.add(28, "Not Present");
			}
			
//csd(heading,active button)
			WebElement csdImage=driver.findElement(By.xpath("(//img[@src='assets/images/agentimages/sample-image.svg'])[3]"));
			WebElement csdHeading=driver.findElement(By.xpath("//span[contains(text(),'CSD')]"));
			WebElement csdActiveButton=driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[2]"));
			if(csdImage.isDisplayed()&&csdHeading.isDisplayed()&&csdActiveButton.isDisplayed()) {
				System.out.println("Csd heading and active button are displayed");
				componentsInformation.add(29, "Present");
			}
			else {
				System.out.println("Csd heading and active button are not displayed");
				componentsInformation.add(29, "Not Present");
			}
			
//brand(heading,active button)
			WebElement brandImage=driver.findElement(By.xpath("(//img[@src='assets/images/agentimages/sample-image.svg'])[4]"));
			WebElement brandHeading=driver.findElement(By.xpath("(//span[contains(text(),'Brand')])"));
			WebElement brandActiveButton=driver.findElement(By.xpath("(//label[@class='rounded-toggle-switch-label'])[3]"));
			if(brandImage.isDisplayed()&&brandHeading.isDisplayed()&&brandActiveButton.isDisplayed()) {
				System.out.println("Brand heading and active button are displayed");
				componentsInformation.add(30, "Present");
			}
			else {
				System.out.println("Brand heading and active button are not displayed");
				componentsInformation.add(30, "Not Present");
			}
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
			
			componentsInformation.add(31, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "AdvanceTicketSettingUIComponent");
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
