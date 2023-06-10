package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzEmailSettingsUIComponents {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void goingAccountSession(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar=driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);
			
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);
			
//account session Button
			WebElement accountSession=driver.findElement(By.xpath("//span[contains(text(),'Account Setting')]"));
			js.executeScript("arguments[0].click()", accountSession);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void verifyingTicketForwardingEmailComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//Adv Response Management 
			WebElement advResponseManagement=driver.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Response Management ')]"));
			if(advResponseManagement.isDisplayed()) {
				System.out.println("Adv Response Management is displayed");
				componentsInformation.add(0,"Present");
			}
			else {
				System.out.println("Adv Response Management is not displayed");
				componentsInformation.add(0,"Not Present");
			}
			js.executeScript("arguments[0].click()", advResponseManagement);
			Thread.sleep(3000);
			
//email settings
			WebElement emailSettingsLogo=driver.findElement(By.xpath("//img[@src='assets/account/menu/Email_Settings.svg']"));
			WebElement emailSettings=driver.findElement(By.xpath("//span[contains(text(),'Email Setting')]"));
			if(emailSettingsLogo.isDisplayed() && emailSettings.isDisplayed()) {
				System.out.println("Email Settings is displayed");
				componentsInformation.add(1,"Present");
			}
			else {
				System.out.println("Email Settings is not displayed");
				componentsInformation.add(1,"Not Present");
			}
			js.executeScript("arguments[0].click()", emailSettings);
			
//ticketForwardingemail
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement ticketForwardingEmail=driver.findElement(By.xpath("(//span[contains(text(),'Ticket Forwarding Email')])[1]"));
			if(pushpin.isDisplayed() && ticketForwardingEmail.isDisplayed()) {
				System.out.println("Ticket Forwarding Email is displayed");
				componentsInformation.add(2,"Present");
			}
			else {
				System.out.println("Ticket Forwarding Email is not displayed");
				componentsInformation.add(2,"Not Present");
			}
			
//setup ticket forwarding email information
			WebElement ticketEmailHeading=driver.findElement(By.xpath("(//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title'])[1]"));
			WebElement setupInformation=driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[1]"));
			if(ticketEmailHeading.isDisplayed() && setupInformation.isDisplayed()) {
				System.out.println("Setup Ticket Forwarding Email Information is displayed");
				componentsInformation.add(3,"Present");
			}
			else {
				System.out.println("Setup Ticket Forwarding Email Information is not displayed");
				componentsInformation.add(3,"Not Present");
			}
			
//select brand
			WebElement selectBrandField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement selectArrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow')])[1]"));
			if(selectBrandField.isDisplayed() && selectArrow.isDisplayed()) {
				System.out.println("Select Brand Field is dispalyed");
				componentsInformation.add(4,"Present");
			}
			else {
				System.out.println("Select Brand Field is not dispalyed");
				componentsInformation.add(4,"Not Present");
			}
			Thread.sleep(2000);
			
//add email address heading
			WebElement addEmailAddressHeading=driver.findElement(By.xpath("//span[contains(text(),'Add Email Address')]"));
			if(addEmailAddressHeading.isDisplayed()) {
				System.out.println("Add Email Address Heading is displayed");
				componentsInformation.add(5,"Present");
			}
			else {
				System.out.println("Add Email Address Heading is not displayed");
				componentsInformation.add(5,"Not Present");
			}
			
//Email Address To
			WebElement emailAddressTo=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[2]"));
			WebElement emailBox=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list ')])[1]"));
			WebElement keyArrowDown=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[1]"));
			if(emailAddressTo.isDisplayed() && emailBox.isDisplayed() && keyArrowDown.isDisplayed()) {
				System.out.println("Email Address To Fields is displayed");
				componentsInformation.add(6,"Present");
			}
			else {
				System.out.println("Email Address To Fields is not displayed");
				componentsInformation.add(6,"Not Present");
			}
			
//Email Address Cc
			WebElement emailAddressCc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[3]"));
			WebElement emailBox1=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list ')])[2]"));
			WebElement keyArrowDown1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[2]"));
			if(emailAddressCc.isDisplayed() && emailBox1.isDisplayed() && keyArrowDown1.isDisplayed()) {
				System.out.println("Email Address Cc Fields is displayed");
				componentsInformation.add(7,"Present");
			}
			else {
				System.out.println("Email Address Cc Fields is not displayed");
				componentsInformation.add(7,"Not Present");
			}
			
//Email Address Bcc
			WebElement emailAddressBcc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[4]"));
			WebElement emailBox2=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list ')])[3]"));
			WebElement keyArrowDown2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[3]"));
			if(emailAddressBcc.isDisplayed() && emailBox2.isDisplayed() && keyArrowDown2.isDisplayed()) {
				System.out.println("Email Address Bcc Fields is displayed");
				componentsInformation.add(8,"Present");
			}
			else {
				System.out.println("Email Address Bcc Fields is not displayed");
				componentsInformation.add(8,"Not Present");
			}
			
//Note Message
			WebElement noteMessage=driver.findElement(By.xpath("(//p[contains(@class,'text__regular text__sm mt-6')])"));
			if(noteMessage.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(9,"Present");
			}
			else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(9,"Not Present");
			}
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(10,"Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(10,"Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(11,"Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(11,"Not Present");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void verifyingEmailGroupInsideTicketsComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//emailgroupinsidetickets
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement emailGroupInsideTickets=driver.findElement(By.xpath("(//span[contains(text(),'Email Groups Inside Tickets')])[1]"));
			if(pushpin.isDisplayed() && emailGroupInsideTickets.isDisplayed()) {
				System.out.println("Email Group Inside Tickets is displayed");
				componentsInformation.add(12,"Present");
			}
			else {
				System.out.println("Email Group Inside Tickets is not displayed");
				componentsInformation.add(12,"Not Present");
			}
			
			js.executeScript("arguments[0].click()", emailGroupInsideTickets);
			Thread.sleep(5000);
			
//setup email group inside tickets information
			WebElement emailGroupHeading=driver.findElement(By.xpath("(//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title'])[2]"));
			WebElement setupInformation=driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[2]"));
			if(emailGroupHeading.isDisplayed() && setupInformation.isDisplayed()) {
				System.out.println("Setup Email Group Inside Tickets Information is displayed");
				componentsInformation.add(13,"Present");
			}
			else {
				System.out.println("Setup Email Group Inside Tickets Information is not displayed");
				componentsInformation.add(13,"Not Present");
			}
			
//select brand
			WebElement selectBrand=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement selectArrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow')])[3]"));
			if(selectBrand.isDisplayed() && selectArrow.isDisplayed()) {
				System.out.println("Select Brand Field is displayed");
				componentsInformation.add(14,"Present");
			}
			else {
				System.out.println("Select Brand Field is not  displayed");
				componentsInformation.add(14,"Not Present");
			}
			
//search button
			WebElement searchButton=driver.findElement(By.xpath("//input[@placeholder='Search by Group Name,To, Cc, Bcc']"));
			WebElement searchIcon=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if(searchButton.isDisplayed() && searchIcon.isDisplayed()) {
				System.out.println("Search Button is displayed");
				componentsInformation.add(15,"Present");
			}
			else {
				System.out.println("Search Button is not displayed");
				componentsInformation.add(15,"Not Present");
			}
			
//create new group
			WebElement createNewGroup=driver.findElement(By.xpath("(//span[contains(text(),'Create New Group ')])"));
			if(createNewGroup.isDisplayed()) {
				System.out.println("Create New Group is displayed");
				componentsInformation.add(16,"Present");
			}
			else {
				System.out.println("Create New Group is not  displayed");
				componentsInformation.add(16,"Not Present");
			}
			
			js.executeScript("arguments[0].click()", createNewGroup);
			Thread.sleep(2000);
			
//new group information
			WebElement newGroupTitle=driver.findElement(By.xpath("//h3[contains(@class,'modal__title text-capitalize')]"));
			WebElement newGroupInformation=driver.findElement(By.xpath("//p[contains(@class,'text__sub--sm')]"));
			if(newGroupTitle.isDisplayed() && newGroupInformation.isDisplayed()) {
				System.out.println("New Group Information is displayed");
				componentsInformation.add(17,"Present");
			}
			else {
				System.out.println("New Group Information is not displayed");
				componentsInformation.add(17,"Not Present");
			}
			
//group name
			WebElement groupNameHeading=driver.findElement(By.xpath("//p[contains(@class,'text__regular--md')]"));
			WebElement groupNameInformation=driver.findElement(By.xpath("//p[contains(@class,'text__light mb-3 text__sm')]"));
			WebElement textBox=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-infix')]//following::input[@type='text'])[2]"));
			if(groupNameHeading.isDisplayed()&&groupNameInformation.isDisplayed()&&textBox.isDisplayed()) {
				System.out.println("Group Name is displayed");
				componentsInformation.add(18,"Present");
			}
			else {
				System.out.println("Group Name is not displayed");
				componentsInformation.add(18,"Not Present");
			}
			
//email address to
			WebElement emailTo=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[1]"));
			WebElement emailBox=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list')])[1]"));
			WebElement keyArrowDown=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[1]"));
			if(emailTo.isDisplayed()&&emailBox.isDisplayed()&&keyArrowDown.isDisplayed()) {
				System.out.println("Email Address To Fields is displayed");
				componentsInformation.add(19,"Present");
			}
			else {
				System.out.println("Email Address To Fields is not  displayed");
				componentsInformation.add(19,"Not Present");
			}
			
//email address Cc
			WebElement emailCc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[2]"));
			WebElement emailBox1=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list')])[2]"));
			WebElement keyArrowDown1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[2]"));
			if(emailCc.isDisplayed()&&emailBox1.isDisplayed()&&keyArrowDown1.isDisplayed()) {
				System.out.println("Email Address Cc Fields is displayed");
				componentsInformation.add(20,"Present");
			}
			else {
				System.out.println("Email Address Cc Fields is not displayed");
				componentsInformation.add(20,"Not Present");
			}
			
//email address Bcc
			WebElement emailBcc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[3]"));
			WebElement emailBox2=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list')])[3]"));
			WebElement keyArrowDown2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[3]"));
			if(emailBcc.isDisplayed()&&emailBox2.isDisplayed()&&keyArrowDown2.isDisplayed()) {
				System.out.println("Email Address Bcc Fields is displayed");
				componentsInformation.add(21,"Present");
			}
			else {
				System.out.println("Email Address Bcc Fields is not displayed");
				componentsInformation.add(21,"Not Present");
			}
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(22,"Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(22,"Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("(//span[contains(text(),' Save ')])"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(23,"Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(23,"Not Present");
			}
			
//close button
			WebElement closeButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])"));
			if(closeButton.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(24,"Present");
			}
			else {
				System.out.println("Close Button is not  displayed");
				componentsInformation.add(24,"Not Present");
			}
			
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);

		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void verifyingCsdEmailSettingsComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//csd email settings
			WebElement pushpin=driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[3]"));
			WebElement csdEmailSettings=driver.findElement(By.xpath("(//span[contains(text(),'CSD Email Setting')])[1]"));
			if(pushpin.isDisplayed() && csdEmailSettings.isDisplayed()) {
				System.out.println("Csd Email Settings is displayed");
				componentsInformation.add(25,"Present");
			}
			else {
				System.out.println("Csd Email Settings is not displayed");
				componentsInformation.add(25,"Not Present");
			}
			
			js.executeScript("arguments[0].click()", csdEmailSettings);
			Thread.sleep(5000);
			
//setup csd email settings information
			WebElement csdEmailHeading=driver.findElement(By.xpath("(//p[@class='mb-0 mt-10 text__title--font colored__blue--dark account-option__title'])[3]"));
			WebElement setupInformation=driver.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])[3]"));
			if(csdEmailHeading.isDisplayed() && setupInformation.isDisplayed()) {
				System.out.println("Setup Csd Email Settings Information is displayed");
				componentsInformation.add(26,"Present");
			}
			else {
				System.out.println("Setup Csd Email Settings Information is not displayed");
				componentsInformation.add(26,"Not Present");
			}
			
//select brand
			WebElement selectBrandField=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement selectArrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow')])[5]"));
			if(selectBrandField.isDisplayed() && selectArrow.isDisplayed()) {
				System.out.println("Select Brand Field is dispalyed");
				componentsInformation.add(27,"Present");
			}
			else {
				System.out.println("Select Brand Field is not dispalyed");
				componentsInformation.add(27,"Not Present");
			}
			
//add email address heading
			WebElement addEmailAddressHeading=driver.findElement(By.xpath("//span[contains(text(),'Add Email Address')]"));
			if(addEmailAddressHeading.isDisplayed()) {
				System.out.println("Add Email Address Heading is displayed");
				componentsInformation.add(28,"Present");
			}
			else {
				System.out.println("Add Email Address Heading is not displayed");
				componentsInformation.add(28,"Not Present");
			}
			
//Email Address To
			WebElement emailAddressTo=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[2]"));
			WebElement emailBox=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list ')])[1]"));
			WebElement keyArrowDown=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[1]"));
			if(emailAddressTo.isDisplayed() && emailBox.isDisplayed() && keyArrowDown.isDisplayed()) {
				System.out.println("Email Address To Fields is displayed");
				componentsInformation.add(29,"Present");
			}
			else {
				System.out.println("Email Address To Fields is not displayed");
				componentsInformation.add(29,"Not Present");
			}
			
//Email Address Cc
			WebElement emailAddressCc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[3]"));
			WebElement emailBox1=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list ')])[2]"));
			WebElement keyArrowDown1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[2]"));
			if(emailAddressCc.isDisplayed() && emailBox1.isDisplayed() && keyArrowDown1.isDisplayed()) {
				System.out.println("Email Address Cc Fields is displayed");
				componentsInformation.add(30,"Present");
			}
			else {
				System.out.println("Email Address Cc Fields is not displayed");
				componentsInformation.add(30,"Not Present");
			}
			
//Email Address Bcc
			WebElement emailAddressBcc=driver.findElement(By.xpath("(//span[contains(@class,'text__regular--md')])[4]"));
			WebElement emailBox2=driver.findElement(By.xpath("(//mat-chip-list[contains(@class,'mat-chip-list ')])[3]"));
			WebElement keyArrowDown2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'keyboard_arrow_down')])[3]"));
			if(emailAddressBcc.isDisplayed() && emailBox2.isDisplayed() && keyArrowDown2.isDisplayed()) {
				System.out.println("Email Address Bcc Fields is displayed");
				componentsInformation.add(31,"Present");
			}
			else {
				System.out.println("Email Address Bcc Fields is not displayed");
				componentsInformation.add(31,"Not Present");
			}
			
//Note Message
			WebElement noteMessage=driver.findElement(By.xpath("(//p[contains(@class,'text__regular text__sm mt-6')])"));
			if(noteMessage.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(32,"Present");
			}
			else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(32,"Not Present");
			}
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(33,"Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(33,"Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(34,"Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(34,"Not Present");
			}
			
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			componentsInformation.add(35,CommonFunctions.getDataTime());
			
			
			CommonFunctions.writeUIComponentsToExcel(componentsInformation,"EmailSettingsUIComponents");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
