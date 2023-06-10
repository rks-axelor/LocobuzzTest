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

public class LocobuzzSocialSchedulingFacebookApprovalWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void socialSchedulingFacebookApprobalWorkflow(WebDriver driver) throws Exception {
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
			
//awaiting approval
	/*		WebElement awaitingApproval = driver.findElement(By.xpath("//div[contains(text(),'Awaiting Approval')]"));
			js.executeScript("arguments[0].click()", awaitingApproval);
			Thread.sleep(3000);*/

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

//verify the social card details
			WebElement channelName = driver
					.findElement(By.xpath("//div[@class='mat-tab-label-content' and text()=' Facebook(1) ']"));
			WebElement socialCard = driver.findElement(By.xpath("(//div[@class='social-cards__body bg__white'])[1]"));
			if (channelName.isDisplayed() && socialCard.isDisplayed()) {
				System.out.println("Channel name,social card are displayed");
			} else {
				System.out.println("Channel name,social card are not displayed");
			}

			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);

//description and inline tag
			WebElement textarea = driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));
			js.executeScript("arguments[0].click()", textarea);
		/*	Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(textarea, "@kalyan page").build();
			action.perform();
			Thread.sleep(10000);
			WebElement tag = driver.findElement(By.xpath("(//span[contains(text(),'Kalyan page')])[3]"));
			js.executeScript("arguments[0].click()", tag);
			Thread.sleep(3000);
			WebElement textarea1 = driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));*/
			textarea.sendKeys(" panda Image");
			WebElement personalization=driver.findElement(By.xpath("//span[contains(text(),'Personalize')]"));
			js.executeScript("arguments[0].click()", personalization);
			Thread.sleep(3000);
			WebElement selectPersonalization=driver.findElement(By.xpath("//li[contains(text(),' WebsiteURL')]"));
			js.executeScript("arguments[0].click()", selectPersonalization);
			Thread.sleep(3000);
			/*WebElement imageButton = driver.findElement(By.xpath("//img[@src='assets/images/common/image.svg']"));
			js.executeScript("arguments[0].click()", imageButton);
			Thread.sleep(3000);
			WebElement image1 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[4]"));
			js.executeScript("arguments[0].click()", image1);
			Thread.sleep(2000);
//attach button
			WebElement attachButton = driver.findElement(By.xpath("//span[contains(text(),' Attach ')]"));
			js.executeScript("arguments[0].click()", attachButton);
			Thread.sleep(2000);*/
			
//tag pages
			WebElement tagPages=driver.findElement(By.xpath("//span[contains(text(),' Tag Facebook pages ')]"));
			js.executeScript("arguments[0].click()", tagPages);
			Thread.sleep(3000);
			WebElement tag=driver.findElement(By.xpath("//input[@formcontrolname='fbTwitterTag']"));
			js.executeScript("arguments[0].click()", tag);
			tag.sendKeys("akhil 1221");
			Thread.sleep(5000);
			WebElement selectTagName=driver.findElement(By.xpath("//span[contains(text(),' Akhil 1221 ')]"));
			js.executeScript("arguments[0].click()", selectTagName);
			Thread.sleep(3000);
			WebElement next = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(3000);
			WebElement label = driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
			js.executeScript("arguments[0].click()", label);
			label.sendKeys("Panda");
			label.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement next1 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next1);
			Thread.sleep(3000);
			WebElement approvalButton = driver.findElement(By.xpath("//span[contains(text(),' Send for approval ')]"));
			js.executeScript("arguments[0].click()", approvalButton);
			Thread.sleep(2000);

//searching content
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search1.sendKeys(" panda Image");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(4000);

			awaitingApproval(driver);

			csdProcess(driver);
			
			publishedTab(driver);
			
			deleteTabVerification(driver);
			
			WebElement allPostTab1 = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab1);
			Thread.sleep(3000);


			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search2.clear();
			WebElement searchButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			searchButton1.click();
			//js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search3 = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search3.sendKeys("titan");
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
			//WebElement tag = driver
			//		.findElement(By.xpath("(//div[contains(@class,'socialposts__item--foot-name')])[1]"));
			if (postCreatedBy.isDisplayed() && deleteButton.isDisplayed() && scheduling.isDisplayed()
					&& chatButton.isDisplayed() && preview.isDisplayed() && label.isDisplayed() ) {
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
			WebElement socialCard = driver.findElement(By.xpath("//div[@class='social-cards__body bg__white']"));
			if (previewHeading.isDisplayed() && leftsidePreview.isDisplayed() && socialCard.isDisplayed()) {
				System.out.println("Preview heading,leftside,social card are displayed");
			} else {
				System.out.println("Preview heading,leftside,social card are not displayed");
			}

			WebElement closeButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);


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

//social Scheduling 
			WebElement socialSchedulingLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'schedule_send')]"));
			//js.executeScript("arguments[0].scrollIntoView()", socialSchedulingLogo);
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
			
//manage post tab
			WebElement pushpin1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[4]"));
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
			
//searching content
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search1.sendKeys(" panda Image");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(4000);
			
//awaiting approval
			WebElement awaitingApproval = driver.findElement(By.xpath("//div[contains(text(),'Awaiting Approval')]"));
			js.executeScript("arguments[0].click()", awaitingApproval);
			Thread.sleep(3000);
			
//approval button
			WebElement approvalButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'check_circle')])"));
			js.executeScript("arguments[0].click()", approvalButton);
			Thread.sleep(3000);
			WebElement approved=driver.findElement(By.xpath("//span[contains(text(),'Approve')]"));
			js.executeScript("arguments[0].click()", approved);
			Thread.sleep(3000);
			WebElement confirmApproved=driver.findElement(By.xpath("//span[contains(text(),' Approve ')]"));
			js.executeScript("arguments[0].click()", confirmApproved);
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
	
	public static void publishedTab(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement publishedTab = driver.findElement(By.xpath("(//div[contains(text(),'Published ')])[1]"));
			js.executeScript("arguments[0].click()", publishedTab);
			Thread.sleep(3000);
			
			WebElement socialPostName1 = driver
					.findElement(By.xpath("//div[contains(@class,'socialposts__item--head-profilelist-item')]"));
			WebElement publishedTime = driver.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			System.out.println("publishedTime: " + publishedTime.getText());
			if (socialPostName1.isDisplayed() && publishedTime.isDisplayed()) {
				System.out.println("Published post name ,time are displayed");
			} else {
				System.out.println("Published post name,time are not  displayed");
			}
			Thread.sleep(2000);

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

//trend
			WebElement trendButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'trending_up')]"));
			js.executeScript("arguments[0].click()", trendButton);
			Thread.sleep(3000);

			WebElement heading = driver.findElement(By.xpath("//span[contains(@class,'text__title text-capitalize')]"));
			WebElement publishedOn = driver.findElement(By.xpath("//span[@class='postPublishedBy']"));
			WebElement ApprovedBy = driver.findElement(By.xpath("//span[@class='postApprovedBy']"));
			WebElement postPreview = driver.findElement(By.xpath("//div[@class='postPreview__left']"));
			WebElement socialcard = driver.findElement(By.xpath("//div[@class='social-cards__body bg__white']"));
			if (heading.isDisplayed() && publishedOn.isDisplayed() && ApprovedBy.isDisplayed()
					&& postPreview.isDisplayed() && socialcard.isDisplayed()) {
				System.out.println("Heading,publishedOn,ApprovedBy,Postpreview,Socialcard are displayed");
			} else {
				System.out.println("Heading,publishedOn,ApprovedBy,Postpreview,Socialcard are not displayed");
			}

//relative fields
			WebElement field = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[1]"));
			WebElement field1 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[2]"));
			WebElement field2 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[3]"));
			WebElement field3 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[4]"));
			WebElement field4 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[5]"));
			WebElement field5 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[6]"));
			WebElement field6 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[7]"));
			WebElement field7 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[8]"));
			if (field.isDisplayed() && field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed()
					&& field4.isDisplayed() && field5.isDisplayed() && field6.isDisplayed() && field7.isDisplayed()) {
				System.out.println("All fields are displayed");
			} else {
				System.out.println("All fields are not displayed");
			}

			WebElement heading1 = driver.findElement(By.xpath("(//h2[@class='text__title text-capitalize'])[1]"));
			WebElement duration = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			WebElement heading2 = driver.findElement(By.xpath("//h3[@class='text__title text-center text_style']"));
			WebElement heading3 = driver.findElement(By.xpath("(//h2[@class='text__title text-capitalize'])[2]"));
			//WebElement data = driver.findElement(By.xpath("(//div[@class='highcharts-container '])"));
			if (heading1.isDisplayed() && duration.isDisplayed() && heading2.isDisplayed() && heading3.isDisplayed()) {
				System.out.println("Headings,duration and data are displayed");
			} else {
				System.out.println("Headings,duration and data are not displayed");
			}

			WebElement arrowback = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowback);
			Thread.sleep(3000);

//openPost
			WebElement openPost1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' open_in_new')])"));
			js.executeScript("arguments[0].click()", openPost1);
			Thread.sleep(3000);

			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			Thread.sleep(5000);
			driver.switchTo().window(newTb.get(0));

//delete
			WebElement delete1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			js.executeScript("arguments[0].click()", delete1);
			Thread.sleep(3000);

			WebElement delete2 = driver
					.findElement(By.xpath("//span[contains(text(),' Delete from Locobuzz ')]"));
			js.executeScript("arguments[0].click()", delete2);
			Thread.sleep(15000);

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void deleteTabVerification(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement deleteTab = driver.findElement(By.xpath("(//div[contains(text(),'Deleted ')])"));
			js.executeScript("arguments[0].click()", deleteTab);
			Thread.sleep(3000);

			WebElement status = driver.findElement(By.xpath("//p[contains(text(),'Deleted')]"));
			WebElement time = driver.findElement(
					By.xpath("//div[contains(@class,'socialposts__item--body-socialicons-item ml-auto')]"));
			System.out.println("Delete Time: " + time.getText());
			if (status.isDisplayed() && time.isDisplayed()) {
				System.out.println("Status and time is displayed");
			} else {
				System.out.println("Status and time is not displayed");
			}

			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement labels = driver.findElement(
					By.xpath("//div[contains(@class,'socialposts__item--foot-credit border-bottom__light-grey')]"));			
			if (postCreatedBy.isDisplayed() && labels.isDisplayed() ) {
				System.out.println("Post createdby,labels are displayed");
			} else {
				System.out.println("Post createdby,labels are not displayed");
			}
			
			WebElement activityLog=driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
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
			
//postlabel
			WebElement postLabel=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
			js.executeScript("arguments[0].click()", postLabel);
			Thread.sleep(3000);
			WebElement selectLabel=driver.findElement(By.xpath("(//span[@class='mat-checkbox-label' and text()=' Panda '])[1]"));
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
