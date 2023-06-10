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

public class LocobuzzSocialSchedulingGMBDraftWorkflow {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void socialSchedulingGMBWorkflow(WebDriver driver) throws Exception {
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
			WebElement channelName=driver.findElement(By.xpath("//div[@class='mat-tab-label-content' and text()=' GMB(1) ']"));
			WebElement socialcard=driver.findElement(By.xpath("//div[contains(@class,'social-cards__body bg__white')]"));
			if(channelName.isDisplayed()&&socialcard.isDisplayed()) {
				System.out.println("channel name and socialcard are displayed");
			}
			else {
				System.out.println("channel name and socialcard are not displayed");
			}
			
			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);
			
//description
			WebElement textarea = driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));
			textarea.sendKeys("There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.");
			textarea.sendKeys("There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.");
			/*WebElement emojoButton = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'sentiment_satisfied ')]"));
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);
			WebElement emojo = driver.findElement(By.xpath("//span[contains(@aria-label,'slightly_smiling_face')]"));
			js.executeScript("arguments[0].click()", emojo);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", emojoButton);*/
			Thread.sleep(3000);
			WebElement imageButton = driver.findElement(By.xpath("//img[@src='assets/images/common/image.svg']"));
			js.executeScript("arguments[0].click()", imageButton);
			Thread.sleep(5000);
			WebElement image1 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[6]"));
			js.executeScript("arguments[0].click()", image1);
			Thread.sleep(2000);
//attach button
			WebElement attachButton = driver.findElement(By.xpath("//span[contains(text(),' Attach ')]"));
			js.executeScript("arguments[0].click()", attachButton);
			Thread.sleep(2000);
			System.out.println("GMB image are uploaded");
			
//add gmb button
			WebElement chooseArrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", chooseArrow);
			Thread.sleep(2000);
			WebElement selectName=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Learn more']"));
			js.executeScript("arguments[0].click()", selectName);
			Thread.sleep(2000);
			WebElement addLink=driver.findElement(By.xpath("//input[@formcontrolname='gmbButtonLink']"));
			addLink.sendKeys("www.google.com");
			
//save draft
			WebElement draftButton = driver.findElement(By.xpath("//span[contains(text(),' Save Draft ')]"));
			js.executeScript("arguments[0].click()", draftButton);
			Thread.sleep(4000);
			
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search1.sendKeys("There are many variations of passages of Lorem Ipsum available");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(4000);
			
			WebElement draftTab = driver.findElement(By.xpath("//div[contains(text(),'Drafts ')]"));
			js.executeScript("arguments[0].click()", draftTab);
			Thread.sleep(2000);
			
			draftTabVerification(driver);
			
			WebElement next = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(2000);
			
			WebElement next1 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next1);
			Thread.sleep(2000);
			
			WebElement label = driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
			js.executeScript("arguments[0].click()", label);
			label.sendKeys("gmb post");
			label.sendKeys(Keys.ENTER);
			
			WebElement next2 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next2);
			Thread.sleep(2000);

			WebElement publish = driver.findElement(By.xpath("//span[contains(text(),' Publish ')]"));
			js.executeScript("arguments[0].click()", publish);
			Thread.sleep(4000);
			
			WebElement scheduleTab = driver.findElement(By.xpath("//div[contains(text(),'Scheduled ')]"));
			js.executeScript("arguments[0].click()", scheduleTab);
			Thread.sleep(5000);

		/*	WebElement socialPostName = driver.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Publishing']"));
			//WebElement scheduledTime = driver.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			if (socialPostName.isDisplayed()) {
				System.out.println("Social post name and time are displayed");
			} else {
				System.out.println("Social post name and time are not  displayed");
			}
			Thread.sleep(5000);*/

			WebElement allPostTab = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab);
			Thread.sleep(30000);
			
			publishedVerification(driver);
			
			deleteTabVerification(driver);
			
			WebElement allPostTab1 = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab1);
			Thread.sleep(3000);
			
			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search2.clear();
			WebElement searchButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search3 = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search3.sendKeys("ajio");
			WebElement selectBrand1 = driver.findElement(By.xpath("//span[contains(text(),' AJIO ')]"));
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
	
	public static void draftTabVerification(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement profile = driver
					.findElement(By.xpath("//div[contains(@class,'socialposts__item--head-profilelist-item')]"));
			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Draft']"));
			if (profile.isDisplayed() && socialPostName.isDisplayed()) {
				System.out.println("Profile and social post name are displayed");
			} else {
				System.out.println("Profile and social post name are not displayed");
			}
			
			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			WebElement editButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			WebElement chatButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			WebElement preview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			if (postCreatedBy.isDisplayed() && deleteButton.isDisplayed() && editButton.isDisplayed()
					&& chatButton.isDisplayed() && preview.isDisplayed()) {
				System.out.println("Post createdby,delete,edit,chat,preview buttons are displayed");
			} else {
				System.out.println("Post createdby,delete,edit,chat,preview buttons are not displayed");
			}

			WebElement chat = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", chat);
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
			Thread.sleep(3000);

			WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			js.executeScript("arguments[0].click()", edit);
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void publishedVerification(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement publishedTab = driver.findElement(By.xpath("(//div[contains(text(),'Published ')])[1]"));
			js.executeScript("arguments[0].click()", publishedTab);
			Thread.sleep(6000);
			
			WebElement socialPostName1 = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Published']"));
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
			WebElement socialCard = driver.findElement(By.xpath("//div[contains(@class,'social-cards__body bg__white')]"));
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
			WebElement socialcard = driver.findElement(By.xpath("//div[@class='postPreview__right bg__grey--lighter']"));
			if (heading.isDisplayed() && publishedOn.isDisplayed() && ApprovedBy.isDisplayed()
					&& postPreview.isDisplayed() && socialcard.isDisplayed()) {
				System.out.println("Heading,publishedOn,ApprovedBy,Postpreview,Socialcard are displayed");
			} else {
				System.out.println("Heading,publishedOn,ApprovedBy,Postpreview,Socialcard are not displayed");
			}


			WebElement data=driver.findElement(By.xpath("(//div[contains(@class,'nodata')])[1]"));
			if(data.isDisplayed()) {
				System.out.println("Data is present");
			}
			else {
				System.out.println("Data is not present");
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
			Thread.sleep(10000);

			
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
			Thread.sleep(8000);
			
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
			Thread.sleep(5000);
			
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
			WebElement selectChannel=driver.findElement(By.xpath("//span[contains(text(),'GMB')]"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//social profile
			WebElement socialProfile=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", socialProfile);
			Thread.sleep(3000);
			WebElement selectProfile=driver.findElement(By.xpath("//span[contains(text(),'SandeepGMB')]"));
			js.executeScript("arguments[0].click()", selectProfile);
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			
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
