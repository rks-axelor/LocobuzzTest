package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzEngagementFormulaUIComponents {

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

	public static void verifyingEngagementFormulaComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv listening settings
			WebElement advListeningSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			if (advListeningSettings.isDisplayed()) {
				System.out.println("Adv Listening Settings is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Adv Listening Settings is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", advListeningSettings);
			Thread.sleep(3000);

//engagement formula
			WebElement engagementFormulaLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Engagement_Formula.svg']"));
			WebElement engagementFormula = driver
					.findElement(By.xpath("//span[contains(text(),'Engagement Formula')]"));
			if (engagementFormulaLogo.isDisplayed() && engagementFormula.isDisplayed()) {
				System.out.println("Engagement Formula is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Engagement Formula is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", engagementFormula);
			Thread.sleep(3000);

//EF tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement efTab = driver.findElement(By.xpath("(//span[contains(text(),'Engagement Formula')])[2]"));
			if (pushpin.isDisplayed() && efTab.isDisplayed()) {
				System.out.println("Engagement Formula is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Engagement Formula is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//Et information
			WebElement heading = driver.findElement(By.xpath("(//p[contains(text(),'Engagement Formula')])"));
			WebElement information = driver
					.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])"));
			if (heading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Engagement Formula Information is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Engagement Formula Information is not displayed");
				componentsInformation.add(3, "Not Present");
			}

//note
			WebElement note = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.25 mb-0 mt-5'])"));
			if (note.isDisplayed()) {
				System.out.println("Note message is displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Note message is not displayed");
				componentsInformation.add(4, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement symbol = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchField.isDisplayed() && symbol.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//default,custom
			WebElement defaultinfo = driver.findElement(By.xpath("//span[contains(text(),'Default')]"));
			WebElement custom = driver.findElement(By.xpath("//span[contains(text(),'Custom')]"));
			if (defaultinfo.isDisplayed() && custom.isDisplayed()) {
				System.out.println("Default and Custom is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Default and Custom is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//create formula
			WebElement createFormulaButton = driver.findElement(By.xpath("//span[contains(text(),'Create Formula ')]"));
			if (createFormulaButton.isDisplayed()) {
				System.out.println("Create Formula Button is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Create Formula Button is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", createFormulaButton);
			Thread.sleep(3000);

//create EF heading
			WebElement createEFHeading = driver.findElement(By.xpath("//h3[contains(@class,'modal__title')]"));
			if (createEFHeading.isDisplayed()) {
				System.out.println("Create Engagement Formula Heading is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Create Engagement Formula Heading is not displayed");
				componentsInformation.add(8, "Not Present");
			}

//select types of EF
			WebElement typesOfEFHeading = driver.findElement(By.xpath("(//p[@class='font-weight-600 mb-4'])[1]"));
			WebElement info = driver.findElement(By.xpath("(//p[@class='text__light--sm line-height-1.50 mb-7'])"));
			WebElement brandPost = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]"));
			WebElement userPost = driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]"));
			if (typesOfEFHeading.isDisplayed() && info.isDisplayed() && brandPost.isDisplayed()
					&& userPost.isDisplayed()) {
				System.out.println("Types of Engagement Formula are displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Types of Engagement Formula are not displayed");
				componentsInformation.add(9, "Not Present");
			}

//social media channels
			WebElement socialMediaChannelHeading = driver
					.findElement(By.xpath("(//p[@class='font-weight-600 mb-4'])[2]"));
			WebElement socialInfo = driver
					.findElement(By.xpath("(//p[@class='text__light--sm line-height-1.50 mb-17'])[1]"));
			WebElement socialChannelField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[5]"));
			if (socialMediaChannelHeading.isDisplayed() && socialInfo.isDisplayed()
					&& socialChannelField.isDisplayed()) {
				System.out.println("Social Media Channels info and field are displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Social Media Channels info and field are not displayed");
				componentsInformation.add(10, "Not Present");
			}

//followers,friends
			WebElement followersHeading = driver.findElement(By.xpath("(//p[@class='font-weight-600 mb-4'])[3]"));
			WebElement followersInfo = driver
					.findElement(By.xpath("(//p[@class='text__light--sm line-height-1.50 mb-17'])[2]"));
			WebElement followersField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (followersHeading.isDisplayed() && followersInfo.isDisplayed() && followersField.isDisplayed()) {
				System.out.println("Followers/Friends info and field are displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Followers/Friends info and field are not displayed");
				componentsInformation.add(11, "Not Present");
			}

//note
			WebElement noteMessage = driver.findElement(By.xpath("//p[@class='text__light--sm mt-5']"));
			if (noteMessage.isDisplayed()) {
				System.out.println("Note Message is displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Note Message is not displayed");
				componentsInformation.add(12, "Not Present");
			}

//reset button
			WebElement resetButton = driver.findElement(By.xpath("//span[contains(text(),' Reset to default ')]"));
			if (resetButton.isDisplayed()) {
				System.out.println("Reset Button is displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Reset Button is not displayed");
				componentsInformation.add(13, "Not Present");
			}

//cancel button
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(14, "Not Present");
			}

//save button
			WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			if (saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}

//close
			WebElement close = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			if (close.isDisplayed()) {
				System.out.println("Close/cross is displayed");
				componentsInformation.add(16, "Present");
			} else {
				System.out.println("Close/cross is not  displayed");
				componentsInformation.add(16, "Not Present");
			}
			js.executeScript("arguments[0].click()", close);
			Thread.sleep(3000);

			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

			componentsInformation.add(17, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "EngagementFormulaUIComponent");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
