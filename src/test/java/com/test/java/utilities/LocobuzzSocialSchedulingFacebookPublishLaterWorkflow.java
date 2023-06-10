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

public class LocobuzzSocialSchedulingFacebookPublishLaterWorkflow {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void socialSchedulingFacebookPublishLaterWorkflow(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

//social Scheduling 
			WebElement socialSchedulingLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'schedule_send')]"));
			js.executeScript("arguments[0].scrollIntoView()", socialSchedulingLogo);
			WebElement socialSchedulingLabel = driver
					.findElement(By.xpath("//span[contains(text(),' Social Scheduling')]"));
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[3]"));
			if (socialSchedulingLogo.isDisplayed() && socialSchedulingLabel.isDisplayed() && pushpin.isDisplayed()) {
				System.out.println("Social Scheduling logo and label are displayed");
			} else {
				System.out.println("Social Scheduling logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", socialSchedulingLabel);
			Thread.sleep(3000);

//manage post tab
			WebElement pushpin1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[8]"));
			WebElement managePostTab = driver.findElement(By.xpath("(//span[contains(text(),'Manage Post')])[1]"));
			if (pushpin1.isDisplayed() && managePostTab.isDisplayed()) {
				System.out.println("Manage Post tab is displayed");
			} else {
				System.out.println("Manage Post tab is not displayed");
			}

//select brand
			WebElement arrow3 = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow3);
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search.sendKeys("auto demo");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),' Auto Demo ')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//compose post button
			WebElement composePostButton = driver.findElement(By.xpath("//span[contains(text(),' Compose Post ')]"));
			WebElement composePostLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'drive_file_rename_outline')]"));
			if (composePostButton.isDisplayed() && composePostLogo.isDisplayed()) {
				System.out.println("Compose post button is displayed");
			} else {
				System.out.println("Compose post button is not displayed");
			}
			js.executeScript("arguments[0].click()", composePostButton);
			Thread.sleep(3000);
			
//select profile
			WebElement selectProfile = driver.findElement(By.xpath("//span[contains(text(),'Kalyan page')]"));
			js.executeScript("arguments[0].click()", selectProfile);
			Thread.sleep(3000);
			WebElement selectProfile2=driver.findElement(By.xpath("(//span[contains(text(),'Komal')])[1]"));
			js.executeScript("arguments[0].click()", selectProfile2);
			Thread.sleep(3000);
			
//verify the social card details
			WebElement channelName = driver
					.findElement(By.xpath("//div[@class='mat-tab-label-content' and text()=' Facebook(2) ']"));
			WebElement socialCard = driver.findElement(By.xpath("(//div[@class='social-cards__body bg__white'])[1]"));
			WebElement socialCard1 = driver.findElement(By.xpath("(//div[@class='social-cards__body bg__white'])[2]"));
			if(channelName.isDisplayed()&&socialCard.isDisplayed()&&socialCard1.isDisplayed()) {
				System.out.println("Channel name,social cards are displayed");
			}
			else {
				System.out.println("Channel name,social cards are not displayed");
			}
			
			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);
			
//description
			WebElement textarea = driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));
			textarea.sendKeys("Wonderful Gif");
			WebElement emojoButton = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'sentiment_satisfied ')]"));
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);
			WebElement emojo = driver.findElement(By.xpath("//span[contains(@aria-label,'innocent')]"));
			js.executeScript("arguments[0].click()", emojo);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);
			WebElement personalization=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", personalization);
			Thread.sleep(3000);
			WebElement selectPersonalization=driver.findElement(By.xpath("//li[contains(text(),' EmailAddress')]"));
			js.executeScript("arguments[0].click()", selectPersonalization);
			Thread.sleep(3000);
			WebElement imageButton = driver.findElement(By.xpath("//img[@src='assets/images/common/image.svg']"));
			js.executeScript("arguments[0].click()", imageButton);
			Thread.sleep(3000);			
			WebElement loadmore=driver.findElement(By.xpath("//span[contains(text(),' Load More ')]"));
			js.executeScript("arguments[0].click()", loadmore);
			Thread.sleep(5000);
			WebElement image1 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[22]"));
			js.executeScript("arguments[0].click()", image1);
			Thread.sleep(2000);
			WebElement image2 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[21]"));
			js.executeScript("arguments[0].click()", image2);
			Thread.sleep(2000);
//attach button
			WebElement attachButton = driver.findElement(By.xpath("//span[contains(text(),' Attach ')]"));
			js.executeScript("arguments[0].click()", attachButton);
			Thread.sleep(2000);
			System.out.println("For Facebook allowed 1 gif only");
			WebElement images2 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[21]"));
			js.executeScript("arguments[0].click()", images2);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", attachButton);
			Thread.sleep(2000);
			
//tag pages
		/*	WebElement tagButton=driver.findElement(By.xpath("//span[contains(text(),' Tag Facebook pages ')]"));
			js.executeScript("arguments[0].click()", tagButton);
			Thread.sleep(2000);
			WebElement tag=driver.findElement(By.xpath("//input[@formcontrolname='fbTwitterTag']"));
			js.executeScript("arguments[0].click()", tag);
			tag.sendKeys("akhil 1221");
			Thread.sleep(5000);
			WebElement selectTagName=driver.findElement(By.xpath("//span[contains(text(),' Akhil 1221 ')]"));
			js.executeScript("arguments[0].click()", selectTagName);
			Thread.sleep(3000);*/
			WebElement next = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(3000);
			WebElement label = driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
			js.executeScript("arguments[0].click()", label);
			label.sendKeys("see gif video");
			label.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement next1 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next1);
			Thread.sleep(3000);
			
			WebElement publishLater=driver.findElement(By.xpath("//span[contains(text(),'Publish Later')]"));
			js.executeScript("arguments[0].click()", publishLater);
			Thread.sleep(3000);
			
//add time
			WebElement timeZone=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", timeZone);
			Thread.sleep(3000);
			WebElement search1=driver.findElement(By.xpath("//input[@placeholder='Search']"));
			search1.sendKeys("kolkata");
			WebElement selectTimeZone=driver.findElement(By.xpath("//span[contains(text(),' (GMT+05:30) Asia/Kolkata')]"));
			js.executeScript("arguments[0].click()", selectTimeZone);
			Thread.sleep(3000);
			WebElement date=driver.findElement(By.xpath("//input[@placeholder='Choose Date']"));
			js.executeScript("arguments[0].click()", date);
			Thread.sleep(3000);
			WebElement selectDate=driver.findElement(By.xpath("((//tbody[contains(@class,'drp-animate')])[3]//following::span[contains(text(),'12')])[1]"));
			//selectDate.click();
			js.executeScript("arguments[0].click()", selectDate);
			Thread.sleep(3000);
			WebElement hoursTab=driver.findElement(By.xpath(("(//div[contains(@class,'calendar-time')])[5]//div[1]")));
			hoursTab.click();
			//js.executeScript("arguments[0].click()", hoursTab);
			Thread.sleep(3000);
			WebElement selectHours=driver.findElement(By.xpath("(//div[contains(@class,'calendar-time')])[5]//div[1]//option[6]"));
			selectHours.click();
			//js.executeScript("arguments[0].click()", selectHours);
			Thread.sleep(3000);
			WebElement minutesTab=driver.findElement(By.xpath("(//div[contains(@class,'calendar-time')])[5]//div[2]"));
			minutesTab.click();
			//js.executeScript("arguments[0].click()", minutesTab);
			Thread.sleep(3000);
			WebElement selectMinutes=driver.findElement(By.xpath("(//div[contains(@class,'calendar-time')])[5]//div[2]//option[1]"));
			selectMinutes.click();
			//js.executeScript("arguments[0].click()", selectMinutes);
			Thread.sleep(3000);
			WebElement ampm=driver.findElement(By.xpath("(//div[contains(@class,'calendar-time')])[5]//div[4]"));
			ampm.click();
			//js.executeScript("arguments[0].click()", ampm);
			Thread.sleep(3000);
			WebElement selectAmPm=driver.findElement(By.xpath("(//div[contains(@class,'calendar-time')])[5]//div[4]//option[1]"));
			selectAmPm.click();
			//js.executeScript("arguments[0].click()", selectAmPm);
			Thread.sleep(3000);
			WebElement applyButton=driver.findElement(By.xpath("(//button[contains(text(),'Apply')])[1]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);
			WebElement scheduleButton=driver.findElement(By.xpath("//span[contains(text(),' Schedule ')]"));
			js.executeScript("arguments[0].click()", scheduleButton);
			Thread.sleep(5000);
			
//search content
			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search2.sendKeys("Wonderful Gif");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(5000);
			
			scheduledTabVerification(driver);
			
			WebElement allPostTab = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab);
			Thread.sleep(3000);
			
			WebElement search3=driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search3.clear();
			WebElement searchButton1=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search4 = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search4.sendKeys("auto demo");
			WebElement selectBrand1 = driver.findElement(By.xpath("//span[contains(text(),' Auto Demo ')]"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(3000);
			
			filterSection(driver);
			Thread.sleep(3000);
			
//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", expand);

			WebElement logout = driver.findElement(By.xpath("//button[contains(text(),'Logout')]"));
			js.executeScript("arguments[0].click()", logout);
			Thread.sleep(4000);

			WebElement confirmLogout = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
			if (confirmLogout.isDisplayed()) {
				js.executeScript("arguments[0].click()", confirmLogout);
				System.out.println("Logout Successful");
			} else {
				System.out.println("Logout Not Successful");
			}
			

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void scheduledTabVerification(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement scheduleTab = driver.findElement(By.xpath("//div[contains(text(),'Scheduled ')]"));
			js.executeScript("arguments[0].click()", scheduleTab);
			Thread.sleep(5000);
			
			WebElement channel=driver.findElement(By.xpath("(//div[contains(@class,'socialposts__item--head-profilelist-item')])[1]"));
			WebElement channel1=driver.findElement(By.xpath("(//div[contains(@class,'socialposts__item--head-profilelist-item')])[2]"));
			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Scheduled']"));
			WebElement scheduledTime = driver
					.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			System.out.println("scheduledTime: " + scheduledTime.getText());
			if(channel.isDisplayed()&&channel1.isDisplayed()&&socialPostName.isDisplayed()&&scheduledTime.isDisplayed()) {
				System.out.println("channels,social post,time are displayed");
			}
			else {
				System.out.println("channels,social post,time are not displayed");
			}
			
			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			WebElement chatButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			WebElement preview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			WebElement label = driver.findElement(By.xpath("//div[contains(@class,'socialposts__item--foot-credit border-bottom__light-grey')]"));
			//WebElement tag=driver.findElement(By.xpath("(//div[contains(@class,'socialposts__item--foot-name')])[1]"));
			if(postCreatedBy.isDisplayed()&&deleteButton.isDisplayed()&&chatButton.isDisplayed()&&preview.isDisplayed()&&label.isDisplayed()) {
				System.out.println("Post createdby,delete,chat,preview buttons ,label,tag are displayed");
			}
			else {
				System.out.println("Post createdby,delete,chat,preview buttons ,label,tag are not displayed");
			}
			
//activity log
			WebElement activityLog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", activityLog);
			Thread.sleep(3000);

			WebElement heading=driver.findElement(By.xpath("//h3[contains(text(),'Activity Log')]"));
			WebElement leftsideData=driver.findElement(By.xpath("//div[contains(@class,'activitylog__body--left bg__grey')]"));
			WebElement activityData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--right-scroll')]"));
			if (activityData.isDisplayed()&&heading.isDisplayed()&&leftsideData.isDisplayed()) {
				System.out.println("Activity Data,heading,leftside data are displayed");
			} else {
				System.out.println("Activity Data,heading,leftside data are not  displayed");
			}
			WebElement closeButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);

//preview
			WebElement previewButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			js.executeScript("arguments[0].click()", previewButton);
			Thread.sleep(3000);

			WebElement previewHeading = driver.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			WebElement leftsidePreview = driver.findElement(By.xpath("//div[@class='postPreview__left']"));
			WebElement socialCard = driver.findElement(By.xpath("//div[@class='social-cards__body bg__white']"));
			if (previewHeading.isDisplayed() && leftsidePreview.isDisplayed() && socialCard.isDisplayed()) {
				System.out.println("Preview heading,leftside,social card are displayed");
			} else {
				System.out.println("Preview heading,leftside,social card are not displayed");
			}

			WebElement closeButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public static void filterSection(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement filterButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt ')]"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);
			
//channel
			WebElement channels=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", channels);
			Thread.sleep(3000);
			WebElement selectChannel=driver.findElement(By.xpath("//span[contains(text(),'Facebook')]"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//team member
			WebElement teamMember=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", teamMember);
			Thread.sleep(3000);
			WebElement selectMember=driver.findElement(By.xpath("//span[@class='mat-checkbox-label' and text()=' All ']"));
			js.executeScript("arguments[0].click()", selectMember);
			Thread.sleep(3000);
			Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(Keys.ESCAPE).build();
			action2.perform();
			
//postlabel
			WebElement postLabel=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
			js.executeScript("arguments[0].click()", postLabel);
			Thread.sleep(3000);
			WebElement selectLabel=driver.findElement(By.xpath("(//span[@class='mat-checkbox-label' and text()=' All '])[1]"));
			js.executeScript("arguments[0].click()", selectLabel);
			Thread.sleep(3000);
			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(Keys.ESCAPE).build();
			action3.perform();
			
			WebElement applyButton=driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
