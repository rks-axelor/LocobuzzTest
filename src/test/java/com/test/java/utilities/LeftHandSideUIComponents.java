package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LeftHandSideUIComponents {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void verifyingLeftSideUIComponents(WebDriver driver) throws Exception {
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
			Thread.sleep(4000);
			
//font size
			WebElement fontsizeLogo=driver.findElement(By.xpath("(//mat-icon[contains(text(),'format_size')])"));
			WebElement fontsizeLabel=driver.findElement(By.xpath("(//span[contains(text(),'Font Size')])"));
			if(fontsizeLogo.isDisplayed()&&fontsizeLabel.isDisplayed()) {
				System.out.println("font size logo and label are displayed");
			}
			else {
				System.out.println("font size logo and label are not displayed");
			}
			
			WebElement fontsizeArrow=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", fontsizeArrow);
			Thread.sleep(3000);
			
			WebElement selectSize=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Large']"));
			js.executeScript("arguments[0].click()", selectSize);
			Thread.sleep(3000);
			
			WebElement expand1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand1);
			Thread.sleep(3000);
			
			WebElement expand2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand2);
			Thread.sleep(3000);
			
			WebElement fontsizeArrow1=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", fontsizeArrow1);
			Thread.sleep(3000);
			
			WebElement selectSize1=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Regular']"));
			js.executeScript("arguments[0].click()", selectSize1);
			Thread.sleep(3000);
			
//theme
			WebElement themeLogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'dark_mode')]"));
			WebElement themeLabel=driver.findElement(By.xpath("//span[contains(text(),'Theme')]"));
			if(themeLogo.isDisplayed()&&themeLabel.isDisplayed()) {
				System.out.println("Theme logo and label are displayed");
			}
			else {
				System.out.println("Theme logo and label are not displayed");
			}
			
			WebElement themeButton=driver.findElement(By.xpath("//div[@class='slider round']"));
			js.executeScript("arguments[0].click()", themeButton);
			Thread.sleep(3000);
			
			WebElement themeButton1=driver.findElement(By.xpath("//div[@class='slider round slider-checked']"));
			js.executeScript("arguments[0].click()", themeButton1);
			Thread.sleep(3000);
			
//sound
			WebElement soundLogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'volume_up')]"));
			WebElement soundLabel=driver.findElement(By.xpath("//span[contains(text(),'Sound')]"));
			if(soundLogo.isDisplayed()&&soundLabel.isDisplayed()) {
				System.out.println("Sound log and label are displayed");
			}
			else {
				System.out.println("Sound log and label are not displayed");
			}
			
			WebElement soundButton=driver.findElement(By.xpath("//div[@class='slider round bg__locobuzz']"));
			js.executeScript("arguments[0].click()", soundButton);
			Thread.sleep(3000);
			
			WebElement soundButton1=driver.findElement(By.xpath("//div[@class='slider round bg__sub']"));
			js.executeScript("arguments[0].click()", soundButton1);
			Thread.sleep(3000);
			
			/*WebElement expand3 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand3);
			Thread.sleep(4000);*/
			
			verifyingMediaGalleryUIComponents(driver);

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public static void verifyingMediaGalleryUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//mediagallery
			WebElement mediaGalleryLogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'perm_media')]"));
			WebElement mediaGalleryLabel=driver.findElement(By.xpath("//span[contains(text(),'Media Gallery')]"));
			if(mediaGalleryLogo.isDisplayed()&&mediaGalleryLabel.isDisplayed()) {
				System.out.println("Media Gallery logo and label are displayed");
			}
			else {
				System.out.println("Media Gallery logo and label are not displayed");
			}
			
			js.executeScript("arguments[0].click()", mediaGalleryLabel);
			Thread.sleep(4000);
			
//select brand field
			WebElement brandField=driver.findElement(By.xpath("//div[contains(@class,'mat-form-field-wrapper')]"));
			WebElement arrow=driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			if(brandField.isDisplayed()&&arrow.isDisplayed()) {
				System.out.println("Brand field is displayed");
			}
			else {
				System.out.println("Brand field is not displayed");
			}
			
//upload file and close button
			WebElement uploadFile=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));
			WebElement closebutton=driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]"));
			if(uploadFile.isDisplayed()&&closebutton.isDisplayed()) {
				System.out.println("Upload file and closed button are displayed");
			}
			else {
				System.out.println("Upload file and closed button are not displayed");
			}
			
//search tags,  media types
			WebElement searchTagsField=driver.findElement(By.xpath("//div[contains(@class,'custom__input--wrapper media-gallery__sidebar--section')]"));
			WebElement searchButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			WebElement media=driver.findElement(By.xpath("//a[contains(text(),'Media')]"));
			WebElement mediaTypes=driver.findElement(By.xpath("(//div[contains(@class,'media-gallery__sidebar--item')])[2]"));
			if(searchTagsField.isDisplayed()&&searchButton.isDisplayed()&&media.isDisplayed()&&mediaTypes.isDisplayed()) {
				System.out.println("Search tags and media types are displayed");
			}
			else {
				System.out.println("Search tags and media types are not displayed");
			}
			
//ugc types
			WebElement ugc=driver.findElement(By.xpath("//a[contains(text(),'UGC')]"));
			js.executeScript("arguments[0].click()", ugc);
			Thread.sleep(3000);
			WebElement ugcTypes=driver.findElement(By.xpath("(//div[contains(@class,'media-gallery__sidebar--item')])[2]"));
			if(ugcTypes.isDisplayed()) {
				System.out.println("UGC and types are displayed");
			}
			else {
				System.out.println("UGC and types are not displayed");
			}
			
//ratings
			WebElement ratings=driver.findElement(By.xpath("//label[contains(text(),'Ratings')]"));
			WebElement ratingsTypes=driver.findElement(By.xpath("(//div[contains(@class,'media-gallery__sidebar--item')])[3]"));
			if(ratings.isDisplayed()&&ratingsTypes.isDisplayed()) {
				System.out.println("Rating and types are displayed");
			}
			else {
				System.out.println("Rating and types are not displayed");
			}
			
//sort by and order
			WebElement sortBy=driver.findElement(By.xpath("//label[contains(text(),'Sort By')]"));
			WebElement sortByTypes=driver.findElement(By.xpath("(//mat-radio-group[contains(@class,'mat-radio-group')])[2]"));
			WebElement sortOrder=driver.findElement(By.xpath("//label[contains(text(),'Sort Order')]"));
			WebElement sortOrderTypes=driver.findElement(By.xpath("(//mat-radio-group[contains(@class,'mat-radio-group')])[3]"));
			if(sortBy.isDisplayed()&&sortByTypes.isDisplayed()&&sortOrder.isDisplayed()&&sortOrderTypes.isDisplayed()) {
				System.out.println("Sort by and order are displayed");
			}
			else {
				System.out.println("Sort by and order are not displayed");
			}
			
//media gallery and arrowback
			WebElement mediaGallery=driver.findElement(By.xpath("//span[contains(text(),'Media Gallery')]"));
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			if(mediaGallery.isDisplayed()&&arrowBack.isDisplayed()) {
				System.out.println("Media Gallery and arrowBack are displayed");
			}
			else {
				System.out.println("Media Gallery and arrowBack are not displayed");
			}
			
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			verifyingFeedbackUIComponents(driver);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public static void verifyingFeedbackUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			/*WebElement sideBar=driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);*/
			
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);
			Thread.sleep(4000);
			
//feedback
			WebElement feedbackLogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'rate_review')]"));
			WebElement feedbackLabel=driver.findElement(By.xpath("//span[contains(text(),'Feedback')]"));
			if(feedbackLogo.isDisplayed()&&feedbackLabel.isDisplayed()) {
				System.out.println("Feedback logo and label are displayed");
			}
			else {
				System.out.println("Feedback logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", feedbackLabel);
			Thread.sleep(4000);
			
//feedback heading and locobuzz 
			WebElement feedbackHeading=driver.findElement(By.xpath("//h3[contains(text(),'Feedback Page')]"));
			WebElement locobuzz=driver.findElement(By.xpath("//img[@src='assets/images/common/locobuzz.svg']"));
			if(feedbackHeading.isDisplayed()&&locobuzz.isDisplayed()) {
				System.out.println("Feedback heading and locobuzz are displayed");
			}
			else {
				System.out.println("Feedback heading and locobuzz are not displayed");
			}
			
//feedback info and question
			WebElement feedbackInfo=driver.findElement(By.xpath("//div[@class='feedback__body--title']"));
			WebElement question=driver.findElement(By.xpath("//div[@class='feedback__body--qone']"));
			WebElement option=driver.findElement(By.xpath("//div[@class='feedback__body--rating']"));
			WebElement option1=driver.findElement(By.xpath("//div[@class='feedback__body--stage']"));
			WebElement nextButton=driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			if(feedbackInfo.isDisplayed()&&question.isDisplayed()&&option.isDisplayed()&&option1.isDisplayed()&&nextButton.isDisplayed()) {
				System.out.println("Feedback Information ,question,next button are displayed");
			}
			else {
				System.out.println("Feedback Information ,question,next button are not displayed");
			}
			
//arrowback
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back ')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
			verifyingHelpUIComponents(driver);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void verifyingHelpUIComponents(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			/*WebElement sideBar=driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);*/
			
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			js.executeScript("arguments[0].click()", expand);
			Thread.sleep(4000);
			
//help
			WebElement helpLogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'help_outline')]"));
			WebElement helpLabel=driver.findElement(By.xpath("(//mat-icon[contains(text(),'help_outline')])//following::span[contains(text(),'Help')]"));
			if(helpLogo.isDisplayed()&&helpLabel.isDisplayed()) {
				System.out.println("Help logo and label are displayed");
			}
			else {
				System.out.println("Help logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", helpLabel);
			Thread.sleep(4000);
			
//instant answers list
		/*	WebElement instantHeading=driver.findElement(By.xpath("//div[@class='Flexystyles__FlexyUI-sc-1jgl4rz-0 lkkbUJ c-Flexy HeaderNavcss__ContentUI-sc-1lrk31j-0 cvVvBi c-HeaderNav__content']"));
			WebElement instant=driver.findElement(By.xpath("//div[@class='Bodycss__BodyUI-sc-rh63dm-0 VNuEP BeaconBody']"));
			WebElement searchBox=driver.findElement(By.xpath("//div[@class='SearchInputcss__SearchInputUI-sc-14ruiq2-0 jtDVtt c-SearchInput has-border']"));
			if(instant.isDisplayed()&&searchBox.isDisplayed()) {
				System.out.println("Instant heading,list and search box are displayed");
			}
			else {
				System.out.println("Instant heading,list and search box are not displayed");
			}*/
			
			WebElement closedButton=driver.findElement(By.xpath("//span[@class='Textstyles__TextUI-sc-jkyxsz-0 frCWgc c-Text is-span is-13 is-default' and text()='Close']"));
			js.executeScript("arguments[0].click()", closedButton);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
