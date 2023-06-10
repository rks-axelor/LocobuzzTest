package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzAutoClosureSettingsUIComponents {

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

	public static void verifyingAutoClosureSettingsComponents(WebDriver driver) throws Exception {
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

//autoclosure settings
			WebElement autoClosureSettingLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Autoclosure_Settings.svg']"));
			WebElement autoClosureSetting = driver
					.findElement(By.xpath("//span[contains(text(),'Autoclosure Settings')]"));
			if (autoClosureSettingLogo.isDisplayed() && autoClosureSetting.isDisplayed()) {
				System.out.println("Auto Closure Setting is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Auto Closure Setting is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", autoClosureSetting);
			Thread.sleep(3000);

//autoclosure settings tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tab = driver.findElement(By.xpath("(//span[contains(text(),'Autoclosure Settings')])[2]"));
			if (pushpin.isDisplayed() && tab.isDisplayed()) {
				System.out.println("AutoClosure Settings Tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("AutoClosure Settings Tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//autoclosure settings information
			WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'Autoclosure Settings ')]"));
			WebElement info = driver.findElement(By.xpath("//p[contains(@class,'mb-0 text__light--sm')]"));
			if (heading.isDisplayed() && info.isDisplayed()) {
				System.out.println("AutoClosure Settings Information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("AutoClosure Settings Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//Active button
			WebElement featureActiveHeading = driver
					.findElement(By.xpath("//p[contains(@class,'text__md mb-4 mr-12')]"));
			WebElement activeButton = driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			if (featureActiveHeading.isDisplayed() && activeButton.isDisplayed()) {
				System.out.println("Feature Active Button is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Feature Active Button is not displayed");
				componentsInformation.add(4, "Not Present");
			}
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);

//brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])"));
			if (brandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Brand Field is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Brand Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//set reminder message duration
			WebElement reminderHeading = driver.findElement(By.xpath("(//h4[@class='text__label mb-0'])[1]"));
			WebElement reminderMessageInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[1]"));
			WebElement hoursField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement minutesField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			WebElement message = driver
					.findElement(By.xpath("(//span[@class='d-flex-items-center ml-10 text__label'])[1]"));
			if (reminderHeading.isDisplayed() && reminderMessageInfo.isDisplayed() && hoursField.isDisplayed()
					&& minutesField.isDisplayed() && message.isDisplayed()) {
				System.out.println("Reminder Message Duration Fields and Information are displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Reminder Message Duration Fields and Information are not displayed");
				componentsInformation.add(6, "Not Present");
			}

//note message for reminder
			WebElement noteMessage = driver
					.findElement(By.xpath("//p[@class='text__light text__sm mt-10 mb-10 pl-10']"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note Message for Reminder is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Note Message for Reminder is not displayed");
				componentsInformation.add(7, "Not Present");
			}

//custom settings
			WebElement customerHeading = driver.findElement(By.xpath("(//p[@class='text__label mb-3'])[1]"));
			WebElement customerInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-5'])[1]"));
			WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			if (customerHeading.isDisplayed() && customerInfo.isDisplayed() && button.isDisplayed()) {
				System.out.println("Customer Settings Information and button are displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Customer Settings Information and button are not displayed");
				componentsInformation.add(8, "Not Present");
			}

//reminder message
			WebElement reminderCheckBox = driver
					.findElement(By.xpath("(//mat-checkbox[@class='mat-checkbox mat-accent'])[1]"));
			WebElement reminderMessageInfo1 = driver
					.findElement(By.xpath("(//p[@class='text__sub--sm mt-2 mb-7'])[1]"));
			WebElement messagesLimit = driver.findElement(By.xpath("(//p[@class='colored__yellow--dark'])[1]"));
			WebElement messageButton = driver.findElement(By.xpath("(//span[contains(text(),'+Add Messages')])[1]"));
			if (reminderCheckBox.isDisplayed() && reminderMessageInfo1.isDisplayed() && messageButton.isDisplayed()
					&& messagesLimit.isDisplayed()) {
				System.out.println("Reminder Message Information and Buttons are displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Reminder Message Information and Buttons are not displayed");
				componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", messageButton);
			Thread.sleep(3000);

//Add reminder message
			WebElement addReminderHeading = driver.findElement(By.xpath("//h3[contains(@class,'modal__title text-capitalize')]"));
			WebElement message1 = driver.findElement(By.xpath("//p[contains(@class,'font-size-12 mb-0 line-height-1.25')]"));
			if (addReminderHeading.isDisplayed()&&message1.isDisplayed()) {
				System.out.println("Add Reminder Message Heading and Info are displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Add Reminder Message Heading and Info are not displayed");
				componentsInformation.add(10, "Not Present");
			}

//add messages
			WebElement heading1 = driver.findElement(By.xpath("(//h4[@class='text__label mb-0'])[3]"));
			WebElement infomation = driver.findElement(By.xpath("(//p[contains(@class,'mb-12')])"));
			WebElement messageBox = driver
					.findElement(By.xpath("(//div[contains(@class,'textarea-featured__block')])"));
			WebElement personalize = driver.findElement(By.xpath("(//span[contains(text(),'Personalize')])"));
			if (heading1.isDisplayed() && infomation.isDisplayed() && messageBox.isDisplayed()
					&& personalize.isDisplayed()) {
				System.out.println("Add Message box and info are displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Add Message box and info are not displayed");
				componentsInformation.add(11, "Not Present");
			}

//add more messages
			WebElement addMoreMessagesButton = driver.findElement(
					By.xpath("//p[contains(@class,'colored__locobuzz font-weight-500 mt-14 cursor-pointer')]"));
			if (addMoreMessagesButton.isDisplayed()) {
				System.out.println("Add More Messages Button is displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Add More Messages Button is not displayed");
				componentsInformation.add(12, "Not Present");
			}

//reset button
			WebElement resetButton = driver.findElement(By.xpath("//span[contains(text(),' Reset ')]"));
			if (resetButton.isDisplayed()) {
				System.out.println("Reset Button is displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Reset Button is not displayed");
				componentsInformation.add(13, "Not Present");
			}

//add button
			WebElement addButton = driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
			if (addButton.isDisplayed()) {
				System.out.println("Add Button is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Add Button is not displayed");
				componentsInformation.add(14, "Not Present");
			}

//cancel Button
			WebElement cancelButton = driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}

//close
			WebElement close = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if (close.isDisplayed()) {
				System.out.println("Close/cross is displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Close/cross is not displayed");
				componentsInformation.add(16, "Not Present");
			}
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(3000);

//reminder message for email 
			WebElement reminderinfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[2]"));
			WebElement addMessagesButton = driver
					.findElement(By.xpath("(//span[contains(text(),'+Add Messages')])[2]"));
			if (reminderinfo.isDisplayed() && addMessagesButton.isDisplayed()) {
				System.out.println("Reminder Message for emails button and info are displayed");
				componentsInformation.add(17, "Present");
			} else {
				System.out.println("Reminder Message for emails button and info are not displayed");
				componentsInformation.add(17, "Not Present");
			}
			js.executeScript("arguments[0].click()", addMessagesButton);
			Thread.sleep(3000);

//Add reminder message
			WebElement addReminderHeading1 = driver
					.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			WebElement message2 = driver.findElement(By.xpath("//p[contains(@class,'font-size-12 mb-0 line-height-1.25')]"));
			if (addReminderHeading1.isDisplayed() && message2.isDisplayed()) {
				System.out.println("Add Reminder Message Heading and Info are displayed");
				componentsInformation.add(18, "Present");
			} else {
				System.out.println("Add Reminder Message Heading and Info are not displayed");
				componentsInformation.add(18, "Not Present");
			}

//add messages
			WebElement heading2 = driver.findElement(By.xpath("(//h4[@class='text__label mb-0'])[3]"));
			WebElement infomation1 = driver.findElement(By.xpath("(//p[@class='mb-12'])"));
			WebElement messageBox1 = driver
					.findElement(By.xpath("(//div[contains(@class,'textarea-featured__block')])"));
			WebElement personalize1 = driver.findElement(By.xpath("(//span[contains(text(),'Personalize')])"));
			if (heading2.isDisplayed() && infomation1.isDisplayed() && messageBox1.isDisplayed()
					&& personalize1.isDisplayed()) {
				System.out.println("Add Message box and info are displayed");
				componentsInformation.add(19, "Present");
			} else {
				System.out.println("Add Message box and info are not displayed");
				componentsInformation.add(19, "Not Present");
			}

//add more messages
			WebElement addMoreMessagesButton1 = driver.findElement(
					By.xpath("//p[contains(@class,'colored__locobuzz font-weight-500 mt-14 cursor-pointer')]"));
			if (addMoreMessagesButton1.isDisplayed()) {
				System.out.println("Add More Messages Button is displayed");
				componentsInformation.add(20, "Present");
			} else {
				System.out.println("Add More Messages Button is not displayed");
				componentsInformation.add(20, "Not Present");
			}

//reset button
			WebElement resetButton1 = driver.findElement(By.xpath("//span[contains(text(),' Reset ')]"));
			if (resetButton1.isDisplayed()) {
				System.out.println("Reset Button is displayed");
				componentsInformation.add(21, "Present");
			} else {
				System.out.println("Reset Button is not displayed");
				componentsInformation.add(21, "Not Present");
			}

//add button
			WebElement addButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
			if (addButton1.isDisplayed()) {
				System.out.println("Add Button is displayed");
				componentsInformation.add(22, "Present");
			} else {
				System.out.println("Add Button is not displayed");
				componentsInformation.add(22, "Not Present");
			}

//cancel Button
			WebElement cancelButton1 = driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])"));
			if (cancelButton1.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(23, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(23, "Not Present");
			}

//close
			WebElement close1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if (close1.isDisplayed()) {
				System.out.println("Close/cross is displayed");
				componentsInformation.add(24, "Present");
			} else {
				System.out.println("Close/cross is not displayed");
				componentsInformation.add(24, "Not Present");
			}
			js.executeScript("arguments[0].click()", close1);
			Thread.sleep(3000);

//set autoclosure duration
			WebElement autoClosureHeading = driver.findElement(By.xpath("(//h4[@class='text__label mb-0'])[2]"));
			WebElement autoClosureInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[3]"));
			WebElement hoursField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			WebElement minuteField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			WebElement message3 = driver
					.findElement(By.xpath("(//span[@class='d-flex-items-center ml-10 text__label'])[2]"));
			if (autoClosureHeading.isDisplayed() && autoClosureInfo.isDisplayed() && hoursField1.isDisplayed()
					&& minuteField1.isDisplayed() && message3.isDisplayed()) {
				System.out.println("AutoClosure Duration Fields and Information are displayed");
				componentsInformation.add(25, "Present");
			} else {
				System.out.println("AutoClosure Duration Fields and Information are not displayed");
				componentsInformation.add(25, "Not Present");
			}

//note meessage for auto closure
			WebElement noteMessage1 = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm mt-5 pl-10 mb-10'])"));
			if (noteMessage1.isDisplayed()) {
				System.out.println("Note Message for Auto Closure is displayed");
				componentsInformation.add(26, "Present");
			} else {
				System.out.println("Note Message for Auto Closure is not displayed");
				componentsInformation.add(26, "Not Present");
			}

//custom settings for autoclosure
			WebElement customHeading = driver.findElement(By.xpath("(//p[@class='text__label mb-3'])[2]"));
			WebElement customInfo = driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-5'])[2]"));
			WebElement customButton = driver.findElement(By.xpath("(//span[contains(text(),'Customize')])[2]"));
			if (customHeading.isDisplayed() && customInfo.isDisplayed() && customButton.isDisplayed()) {
				System.out.println("Custom Settings For Autoclosure and button are displayed");
				componentsInformation.add(27, "Present");
			} else {
				System.out.println("Custom Settings For Autoclosure and button are not displayed");
				componentsInformation.add(27, "Not Present");
			}

//autoclosure messages
			WebElement autoClosureHeading1 = driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[2]"));
			WebElement autoClosureInfo1 = driver.findElement(By.xpath("(//p[@class='text__sub--sm mt-2 mb-7'])[2]"));
			WebElement messagesLimit1 = driver.findElement(By.xpath("(//p[@class='colored__yellow--dark'])[2]"));
			WebElement addMessagesButton1 = driver
					.findElement(By.xpath("(//span[contains(text(),'+Add Messages')])[3]"));
			if (autoClosureHeading1.isDisplayed() && autoClosureInfo1.isDisplayed() && messagesLimit1.isDisplayed()
					&& addMessagesButton1.isDisplayed()) {
				System.out.println("Auto Closure Messages Information and Button are displayed");
				componentsInformation.add(28, "Present");
			}
			else {
				System.out.println("Auto Closure Messages Information and Button are not displayed");
				componentsInformation.add(28, "Not Present");
			}
			js.executeScript("arguments[0].click()", addMessagesButton1);
			Thread.sleep(3000);
			
//add autoclosure messages 
			WebElement addAutoClosureHeading=driver.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			WebElement addAutoClosureInfo=driver.findElement(By.xpath("//p[contains(@class,'font-size-12 mb-0 line-height-1.25')]"));
			if(addAutoClosureHeading.isDisplayed()&&addAutoClosureInfo.isDisplayed()) {
				System.out.println("Add AutoClosure Messages is displayed");
				componentsInformation.add(29, "Present");
			}
			else {
				System.out.println("Add AutoClosure Messages is not displayed");
				componentsInformation.add(29, "Not Present");
			}
			
//cross/close
			WebElement close2=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if(close2.isDisplayed()) {
				System.out.println("Close/Cross button is displayed");
				componentsInformation.add(30, "Present");
			}
			else {
				System.out.println("Close/Cross button is not displayed");
				componentsInformation.add(30, "Not Present");
			}
			
//add messages
			WebElement heading3=driver.findElement(By.xpath("(//h4[@class='text__label mb-0'])[3]"));
			WebElement info3=driver.findElement(By.xpath("(//span[@class='text-subtitle'])"));
			WebElement box=driver.findElement(By.xpath("//div[contains(@class,'textarea-featured__block')]"));
			WebElement personalize3=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			if(heading3.isDisplayed()&&info3.isDisplayed()&&box.isDisplayed()&&personalize3.isDisplayed()) {
				System.out.println("Add Messages Fields are displayed");
				componentsInformation.add(31, "Present");
			}
			else {
				System.out.println("Add Messages Fields are not displayed");
				componentsInformation.add(31, "Not Present");
			}
			
//add more messages
			WebElement addMoreMessagesButton3=driver.findElement(By.xpath("//p[contains(text(),'+Add More Messages')]"));
			if(addMoreMessagesButton3.isDisplayed()) {
				System.out.println("Add More Messages Button is displayed");
				componentsInformation.add(32, "Present");
			}
			else {
				System.out.println("Add More Messages Button is not displayed");
				componentsInformation.add(32, "Not Present");
			}
			
//reset button
			WebElement resetButton3=driver.findElement(By.xpath("//span[contains(text(),' Reset ')]"));
			if(resetButton3.isDisplayed()) {
				System.out.println("Reset Button is displayed");
				componentsInformation.add(33, "Present");
			}
			else {
				System.out.println("Reset Button is not  displayed");
				componentsInformation.add(33, "Not Present");
			}
			
//add button
			WebElement addButton3=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
			if(addButton3.isDisplayed()) {
				System.out.println("Add Button is displayed");
				componentsInformation.add(34, "Present");
			}
			else {
				System.out.println("Add Button is not displayed");
				componentsInformation.add(34, "Not Present");
			}
			
//cancel button
			WebElement cancelButton3=driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])"));
			if(cancelButton3.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(35, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(35, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton3);
			Thread.sleep(3000);
			
//autoclosure message for emails
			WebElement message4=driver.findElement(By.xpath("(//p[@class='text__sub--sm mb-0'])[4]"));
			WebElement addMessageButton=driver.findElement(By.xpath("(//span[contains(text(),'+Add Messages')])[4]"));
			if(message4.isDisplayed()&&addMessageButton.isDisplayed()) {
				System.out.println("Auto Closure Message For Emails and Button are displayed");
				componentsInformation.add(36, "Present");
			}
			else {
				System.out.println("Auto Closure Message For Emails and Button are not displayed");
				componentsInformation.add(36, "Not Present");
			}
			js.executeScript("arguments[0].click()", addMessageButton);
			Thread.sleep(3000);
			
//add autoclosure messages 
			WebElement addAutoClosureHeading1=driver.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			WebElement addAutoClosureInfo1=driver.findElement(By.xpath("//p[contains(@class,'font-size-12 mb-0 line-height-1.25')]"));
			if(addAutoClosureHeading1.isDisplayed()&&addAutoClosureInfo1.isDisplayed()) {
				System.out.println("Add AutoClosure Messages is displayed");
				componentsInformation.add(37, "Present");
			}
			else {
				System.out.println("Add AutoClosure Messages is not displayed");
				componentsInformation.add(37, "Not Present");
			}
			
//cross/close
			WebElement close3=driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			if(close3.isDisplayed()) {
				System.out.println("Close/Cross button is displayed");
				componentsInformation.add(38, "Present");
			}
			else {
				System.out.println("Close/Cross button is not displayed");
				componentsInformation.add(38, "Not Present");
			}
			
//add messages
			WebElement heading4=driver.findElement(By.xpath("(//h4[@class='text__label mb-0'])[3]"));
			WebElement info4=driver.findElement(By.xpath("(//span[@class='text-subtitle'])"));
			WebElement box1=driver.findElement(By.xpath("//div[contains(@class,'textarea-featured__block')]"));
			WebElement personalize4=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			if(heading4.isDisplayed()&&info4.isDisplayed()&&box1.isDisplayed()&&personalize4.isDisplayed()) {
				System.out.println("Add Messages Fields are displayed");
				componentsInformation.add(39, "Present");
			}
			else {
				System.out.println("Add Messages Fields are not displayed");
				componentsInformation.add(39, "Not Present");
			}
			
//add more messages
			WebElement addMoreMessagesButton4=driver.findElement(By.xpath("//p[contains(text(),'+Add More Messages')]"));
			if(addMoreMessagesButton4.isDisplayed()) {
				System.out.println("Add More Messages Button is displayed");
				componentsInformation.add(40, "Present");
			}
			else {
				System.out.println("Add More Messages Button is not displayed");
				componentsInformation.add(40, "Not Present");
			}
			
//reset button
			WebElement resetButton4=driver.findElement(By.xpath("//span[contains(text(),' Reset ')]"));
			if(resetButton4.isDisplayed()) {
				System.out.println("Reset Button is displayed");
				componentsInformation.add(41, "Present");
			}
			else {
				System.out.println("Reset Button is not  displayed");
				componentsInformation.add(41, "Not Present");
			}
			
//add button
			WebElement addButton4=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
			if(addButton4.isDisplayed()) {
				System.out.println("Add Button is displayed");
				componentsInformation.add(42, "Present");
			}
			else {
				System.out.println("Add Button is not displayed");
				componentsInformation.add(42, "Not Present");
			}
			
//cancel button
			WebElement cancelButton4=driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])"));
			if(cancelButton4.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(43, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(43, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton4);
			Thread.sleep(3000);
			
//twitter reply handle
			WebElement twitterReplyHandleHeading=driver.findElement(By.xpath("//h4[@class='text__label mb-1']"));
			WebElement twitterHandleInfo=driver.findElement(By.xpath("//p[@class='text__sub--sm mb-3']"));
			WebElement handleName=driver.findElement(By.xpath("//div[@class='autoclosure__container--handle-profile']"));
			if(twitterReplyHandleHeading.isDisplayed()&&twitterHandleInfo.isDisplayed()&&handleName.isDisplayed()) {
				System.out.println("Twitter Reply Handle Information are displayed");
				componentsInformation.add(44, "Present");
			}
			else {
				System.out.println("Twitter Reply Handle Information are not displayed");
				componentsInformation.add(44, "Not Present");
			}
			
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			
			componentsInformation.add(45, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "AutoClosureSettingsUIComponents");
			
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
