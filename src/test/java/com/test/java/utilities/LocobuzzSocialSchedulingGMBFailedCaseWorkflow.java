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

public class LocobuzzSocialSchedulingGMBFailedCaseWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void socialSchedulingGMBFailedCaseWorkflow(WebDriver driver) throws Exception {
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
			search.sendKeys("ajio");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),' AJIO ')]"));
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
			WebElement selectProfile = driver.findElement(By.xpath("//span[contains(text(),'SandeepGMB')]"));
			js.executeScript("arguments[0].click()", selectProfile);
			Thread.sleep(3000);

//verifying the right side
			WebElement channelName = driver
					.findElement(By.xpath("//div[@class='mat-tab-label-content' and text()=' GMB(1) ']"));
			WebElement socialcard = driver
					.findElement(By.xpath("//div[contains(@class,'social-cards__body bg__white')]"));
			if (channelName.isDisplayed() && socialcard.isDisplayed()) {
				System.out.println("channel name and socialcard are displayed");
			} else {
				System.out.println("channel name and socialcard are not displayed");
			}

			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);

//description
			WebElement textarea = driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));
			textarea.sendKeys("GMB image ");
			WebElement emojoButton = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'sentiment_satisfied ')]"));
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);
			WebElement emojo = driver.findElement(By.xpath("//span[contains(@aria-label,'slightly_smiling_face')]"));
			js.executeScript("arguments[0].click()", emojo);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);
			WebElement imageButton = driver.findElement(By.xpath("//img[@src='assets/images/common/image.svg']"));
			js.executeScript("arguments[0].click()", imageButton);
			Thread.sleep(5000);
			WebElement image1 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[2]"));
			js.executeScript("arguments[0].click()", image1);
			Thread.sleep(2000);
//attach button
			WebElement attachButton = driver.findElement(By.xpath("//span[contains(text(),' Attach ')]"));
			js.executeScript("arguments[0].click()", attachButton);
			Thread.sleep(2000);
			System.out.println("GMB image are uploaded");

//add gmb button
			WebElement chooseArrow = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", chooseArrow);
			Thread.sleep(2000);
			WebElement selectName = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()='Learn more']"));
			js.executeScript("arguments[0].click()", selectName);
			Thread.sleep(2000);
			WebElement addLink = driver.findElement(By.xpath("//input[@formcontrolname='gmbButtonLink']"));
			addLink.sendKeys("www.google.com");

			WebElement next = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(3000);

			WebElement label = driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
			js.executeScript("arguments[0].click()", label);
			label.sendKeys("gmb post");
			label.sendKeys(Keys.ENTER);

			WebElement next1 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next1);
			Thread.sleep(3000);
			WebElement publish = driver.findElement(By.xpath("//span[contains(text(),' Publish ')]"));
			js.executeScript("arguments[0].click()", publish);
			Thread.sleep(2000);

//searching content
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search1.sendKeys("GMB image ");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(4000);

//scheduled tab
			WebElement scheduleTab = driver.findElement(By.xpath("//div[contains(text(),'Scheduled ')]"));
			js.executeScript("arguments[0].click()", scheduleTab);
			Thread.sleep(3000);

			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Scheduled']"));
			WebElement scheduledTime = driver
					.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			if (socialPostName.isDisplayed() && scheduledTime.isDisplayed()) {
				System.out.println("Social post name and time are displayed");
			} else {
				System.out.println("Social post name and time are not  displayed");
			}

			WebElement chat = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", chat);
			Thread.sleep(2000);
			WebElement activityData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--right-scroll')]"));
			if (activityData.isDisplayed()) {
				System.out.println("Activity Data is displayed");
			} else {
				System.out.println("Activity Data is not  displayed");
			}
			WebElement closeButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);

			WebElement allPostTab1 = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab1);
			Thread.sleep(7000);

			failedTab(driver);

			partiallyPublishedTab(driver);

//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			// JavascriptExecutor js = (JavascriptExecutor) driver;
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

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void failedTab(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//failed tab
			WebElement failedTab = driver.findElement(By.xpath("(//div[contains(text(),'Failed ')])"));
			js.executeScript("arguments[0].click()", failedTab);
			Thread.sleep(2000);

			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Failed']"));
			WebElement failedTime = driver
					.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			System.out.println("failedTime: " + failedTime.getText());
			if (socialPostName.isDisplayed() && failedTime.isDisplayed()) {
				System.out.println("social post name,Failed time are displayed");
			} else {
				System.out.println("social post name,Failed time are not displayed");
			}

			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement editButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			WebElement chatButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			WebElement preview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			WebElement label = driver.findElement(
					By.xpath("//div[contains(@class,'socialposts__item--foot-credit border-bottom__light-grey')]"));
			if (postCreatedBy.isDisplayed() && editButton.isDisplayed() && chatButton.isDisplayed()
					&& preview.isDisplayed() && label.isDisplayed()) {
				System.out.println("Post createdby,edit,chat,preview buttons ,labelare displayed");
			} else {
				System.out.println("Post createdby,edit,chat,preview buttons ,label are not displayed");
			}

//activity log
			WebElement activityLog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", activityLog);
			Thread.sleep(3000);

			WebElement heading = driver.findElement(By.xpath("//h3[contains(text(),'Activity Log')]"));
			WebElement leftsideData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--left bg__grey')]"));
			WebElement activityData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--right-scroll')]"));
			if (activityData.isDisplayed() && heading.isDisplayed() && leftsideData.isDisplayed()) {
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
			WebElement socialCard = driver
					.findElement(By.xpath("//div[contains(@class,'social-cards__body bg__white')]"));
			if (previewHeading.isDisplayed() && leftsidePreview.isDisplayed() && socialCard.isDisplayed()) {
				System.out.println("Preview heading,leftside,social card are displayed");
			} else {
				System.out.println("Preview heading,leftside,social card are not displayed");
			}

			WebElement closeButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);

//edit
			WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			js.executeScript("arguments[0].click()", edit);
			Thread.sleep(2000);

//select profile
			WebElement selectProfile = driver.findElement(By.xpath("//span[contains(text(),'Bittu Singh')]"));
			js.executeScript("arguments[0].click()", selectProfile);
			Thread.sleep(3000);
			WebElement next = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(2000);

			WebElement next1 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next1);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", next1);
			Thread.sleep(2000);
			WebElement publish = driver.findElement(By.xpath("//span[contains(text(),' Publish ')]"));
			js.executeScript("arguments[0].click()", publish);
			Thread.sleep(2000);

//scheduled tab
			WebElement scheduleTab = driver.findElement(By.xpath("//div[contains(text(),'Scheduled ')]"));
			js.executeScript("arguments[0].click()", scheduleTab);
			Thread.sleep(7000);

			WebElement socialPostName1 = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Scheduled']"));
			WebElement scheduledTime = driver
					.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			if (socialPostName1.isDisplayed() && scheduledTime.isDisplayed()) {
				System.out.println("Social post name and time are displayed");
			} else {
				System.out.println("Social post name and time are not  displayed");
			}
			Thread.sleep(5000);

			WebElement allPostTab1 = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab1);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void partiallyPublishedTab(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//partiallyPublished tab
			WebElement partiallyPublishedTab = driver
					.findElement(By.xpath("(//div[contains(text(),'Partially Published ')])"));
			js.executeScript("arguments[0].click()", partiallyPublishedTab);
			Thread.sleep(6000);

			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Partially Published']"));
			WebElement partiallyPublishedTime = driver
					.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			System.out.println("partiallyPublishedTime: " + partiallyPublishedTime.getText());
			if (socialPostName.isDisplayed() && partiallyPublishedTime.isDisplayed()) {
				System.out.println("social post,time are displayed");
			} else {
				System.out.println("social post,time are not displayed");
			}

			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			WebElement openPost = driver.findElement(By.xpath("(//mat-icon[contains(text(),' open_in_new')])"));
			WebElement chatButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			WebElement preview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			WebElement trend = driver.findElement(By.xpath("(//mat-icon[contains(text(),'trending_up')])"));
			if (postCreatedBy.isDisplayed() && deleteButton.isDisplayed() && openPost.isDisplayed()
					&& chatButton.isDisplayed() && preview.isDisplayed() && trend.isDisplayed()) {
				System.out.println("Post createdby,delete,openpost,chat,preview,trends buttons are displayed");
			} else {
				System.out.println("Post createdby,delete,openpost,chat,preview,trends buttons are not displayed");
			}

//activity log
			WebElement activityLog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", activityLog);
			Thread.sleep(3000);

			WebElement activityData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--right-scroll')]"));
			if (activityData.isDisplayed()) {
				System.out.println("Activity Data is displayed");
			} else {
				System.out.println("Activity Data is not  displayed");
			}
			WebElement closeButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);

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

//openPost
			WebElement openPost1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' open_in_new')])"));
			js.executeScript("arguments[0].click()", openPost1);
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

}
