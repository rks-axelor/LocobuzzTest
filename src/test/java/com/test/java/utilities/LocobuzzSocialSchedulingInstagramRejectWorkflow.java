package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocobuzzSocialSchedulingInstagramRejectWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void socialSchedulingInstagramRejectWorkflow(WebDriver driver) throws Exception {
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
			search.sendKeys("titan");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),' Titan ')]"));
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
			WebElement selectProfile = driver.findElement(By.xpath("//span[contains(text(),'launchdemo')]"));
			js.executeScript("arguments[0].click()", selectProfile);
			Thread.sleep(3000);

//verifying the right side
			WebElement channelName = driver
					.findElement(By.xpath("//div[@class='mat-tab-label-content' and text()=' Instagram(1) ']"));
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
			textarea.sendKeys("Instagram nature videos");
			WebElement emojoButton = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'sentiment_satisfied ')]"));
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);
			WebElement emojo = driver.findElement(By.xpath("//span[contains(@aria-label,' wink')]"));
			js.executeScript("arguments[0].click()", emojo);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);
			
			WebElement personalization = driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", personalization);
			Thread.sleep(3000);
			WebElement selectPersonalization = driver.findElement(By.xpath("//li[contains(text(),' WebsiteURL')]"));
			js.executeScript("arguments[0].click()", selectPersonalization);
			Thread.sleep(3000);

			WebElement videoButton = driver.findElement(By.xpath("//img[@src='assets/images/common/video.svg']"));
			js.executeScript("arguments[0].click()", videoButton);
			Thread.sleep(3000);
			WebElement video = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[2]"));
			js.executeScript("arguments[0].click()", video);
			Thread.sleep(2000);

//attach button
			WebElement attachButton = driver.findElement(By.xpath("//span[contains(text(),' Attach ')]"));
			js.executeScript("arguments[0].click()", attachButton);
			Thread.sleep(2000);
			System.out.println("Instagram  video are uploaded");

			WebElement next = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(3000);

			WebElement label = driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
			js.executeScript("arguments[0].click()", label);
			label.sendKeys("insta videos");
			label.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			WebElement next1 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next1);
			Thread.sleep(3000);
			WebElement approvalButton = driver.findElement(By.xpath("//span[contains(text(),' Send for approval ')]"));
			js.executeScript("arguments[0].click()", approvalButton);
			Thread.sleep(5000);

//searching content
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search1.sendKeys("Instagram nature videos");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(4000);

			awaitingApproval(driver);

			csdProcess(driver);
			
			rejectTab(driver);
			
			WebElement allPostTab = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab);
			Thread.sleep(3000);
			
			WebElement search3 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search3.clear();
			Thread.sleep(1000);

			Actions a = new Actions(driver);
			WebElement searchButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			a.doubleClick(searchButton1).build().perform();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search2.sendKeys("titan");
			WebElement selectBrand1 = driver.findElement(By.xpath("//span[contains(text(),' Titan ')]"));
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

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void awaitingApproval(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//awaiting approval
			WebElement awaitingApproval = driver.findElement(By.xpath("//div[contains(text(),'Awaiting Approval')]"));
			js.executeScript("arguments[0].click()", awaitingApproval);
			Thread.sleep(3000);

			WebElement profile = driver
					.findElement(By.xpath("//div[contains(@class,'socialposts__item--head-profilelist-item')]"));
			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Awaiting Approval']"));
			if (profile.isDisplayed() && socialPostName.isDisplayed()) {
				System.out.println("Profile and social post name are displayed");
			} else {
				System.out.println("Profile and social post name are not displayed");
			}

			WebElement scheduling = driver.findElement(By.xpath(
					"//div[contains(@class,'socialposts__item--body-socialicons-item socialposts__breach ml-auto')]"));
			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			WebElement chatButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			WebElement preview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			WebElement label = driver.findElement(
					By.xpath("//div[contains(@class,'socialposts__item--foot-credit border-bottom__light-grey')]"));
			if (postCreatedBy.isDisplayed() && deleteButton.isDisplayed() && scheduling.isDisplayed()
					&& chatButton.isDisplayed() && preview.isDisplayed() && label.isDisplayed()) {
				System.out.println("Post createdby,delete,scheduling,chat,preview buttons,tag,label are displayed");
			} else {
				System.out.println("Post createdby,delete,scheduling,chat,preview buttons,tag,label are not displayed");
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
			Thread.sleep(2000);

//preview
			WebElement previewButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			js.executeScript("arguments[0].click()", previewButton);
			Thread.sleep(3000);

			WebElement previewHeading = driver.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			WebElement leftsidePreview = driver.findElement(By.xpath("//div[@class='postPreview__left']"));
			WebElement socialCard = driver
					.findElement(By.xpath("(//div[contains(@class,'social-cards__body bg__white')])[1]"));
			if (previewHeading.isDisplayed() && leftsidePreview.isDisplayed() && socialCard.isDisplayed()) {
				System.out.println("Preview heading,leftside,social card are displayed");
			} else {
				System.out.println("Preview heading,leftside,social card are not displayed");
			}

			WebElement closeButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);

			WebElement allPostTab = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab);
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void csdProcess(WebDriver driver) throws Exception {
		try {

// csdlogin
			String mainWindow = driver.getWindowHandle();
			System.out.println("Main Window: " + mainWindow);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://locobuzzng-atest.locobuzz.com/login");

			String childWindow = driver.getWindowHandle();
			System.out.println("Child Window: " + childWindow);

			CommonFunctions.login(driver, "Customer");

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

// social Scheduling
			WebElement socialSchedulingLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'schedule_send')]"));
			// js.executeScript("arguments[0].scrollIntoView()", socialSchedulingLogo);
			WebElement socialSchedulingLabel = driver
					.findElement(By.xpath("//span[contains(text(),' Social Scheduling')]"));
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			if (socialSchedulingLogo.isDisplayed() && socialSchedulingLabel.isDisplayed() && pushpin.isDisplayed()) {
				System.out.println("Social Scheduling logo and label are displayed");
			} else {
				System.out.println("Social Scheduling logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", socialSchedulingLabel);
			Thread.sleep(3000);

// manage post tab
			WebElement pushpin1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[4]"));
			WebElement managePostTab = driver.findElement(By.xpath("(//span[contains(text(),'Manage Post')])[1]"));
			if (pushpin1.isDisplayed() && managePostTab.isDisplayed()) {
				System.out.println("Manage Post tab is displayed");
			} else {
				System.out.println("Manage Post tab is not displayed");
			}

// select brand
			WebElement arrow3 = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow3);
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search.sendKeys("titan");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),' Titan ')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
//searching content
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search1.sendKeys("Instagram nature videos");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(4000);
			
//awaiting approval
			WebElement awaitingApproval = driver.findElement(By.xpath("//div[contains(text(),'Awaiting Approval')]"));
			js.executeScript("arguments[0].click()", awaitingApproval);
			Thread.sleep(3000);
			
//approval,reject button
			WebElement approval=driver.findElement(By.xpath("//mat-icon[contains(text(),'check_circle')]"));
			WebElement reject=driver.findElement(By.xpath("//mat-icon[contains(text(),'cancel')]"));
			if(approval.isDisplayed()&&reject.isDisplayed()) {
				System.out.println("Approval and reject button are displayed");
			}
			else {
				System.out.println("Approval and reject button are not displayed");
			}
			
//reject button
			WebElement rejectButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'cancel')]"));
			js.executeScript("arguments[0].click()", rejectButton);
			Thread.sleep(3000);
			WebElement confirmReject=driver.findElement(By.xpath("(//span[contains(text(),' Reject ')])[2]"));
			js.executeScript("arguments[0].click()", confirmReject);
			Thread.sleep(5000);
			
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
			
			driver.switchTo().window(childWindow).close();
			

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void rejectTab(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//rejected tab
			WebElement rejectedTab = driver.findElement(By.xpath("//div[contains(text(),'Rejected')]"));
			js.executeScript("arguments[0].click()", rejectedTab);
			Thread.sleep(3000);
			
			WebElement socialPostName1 = driver
					.findElement(By.xpath("//div[contains(@class,'socialposts__item--head-profilelist-item')]"));
			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Rejected']"));
			WebElement publishedTime = driver.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			System.out.println("publishedTime: " + publishedTime.getText());
			if (socialPostName1.isDisplayed() && publishedTime.isDisplayed()&&socialPostName.isDisplayed()) {
				System.out.println("post name ,time are displayed");
			} else {
				System.out.println(" post name,time are not  displayed");
			}
			Thread.sleep(2000);
			
			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			WebElement chatButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			WebElement preview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			if (postCreatedBy.isDisplayed() && deleteButton.isDisplayed() && chatButton.isDisplayed() && preview.isDisplayed() ) {
				System.out.println("Post createdby,delete,chat,preview buttons are displayed");
			} else {
				System.out.println("Post createdby,delete,chat,preview buttons are not displayed");
			}
			
//activity log
			WebElement activityLog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", activityLog);
			Thread.sleep(4000);

			WebElement activityData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--right-scroll')]"));
			if (activityData.isDisplayed()) {
				System.out.println("Activity Data is displayed");
			} else {
				System.out.println("Activity Data is not  displayed");
			}
			WebElement closeButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);
			
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

			WebElement filterButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt ')]"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);
			
//channel
			WebElement channels = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", channels);
			Thread.sleep(3000);
			WebElement selectChannel = driver.findElement(By.xpath("//span[contains(text(),'Instagram')]"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//postlabel
			WebElement postLabel = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
			js.executeScript("arguments[0].click()", postLabel);
			Thread.sleep(3000);
			WebElement selectLabel = driver
					.findElement(By.xpath("(//span[@class='mat-checkbox-label' and text()=' All '])[1]"));
			js.executeScript("arguments[0].click()", selectLabel);
			Thread.sleep(3000);
			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(Keys.ESCAPE).build();
			action3.perform();
			
			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
