package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzManageAgentSkillsUIComponents {

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

	public static void verifyingManageAgentSkillsComponents(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//response teams
			WebElement responseTeams = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Response Teams ')]"));
			if (responseTeams.isDisplayed()) {
				System.out.println("Response Teams is displayed");
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Response Teams is not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", responseTeams);
			Thread.sleep(3000);

//manage agent skills
			WebElement manageSkillsLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Manage_Agent_Skills.svg']"));
			WebElement manageSkills = driver.findElement(By.xpath("//span[contains(text(),'Manage Agent Skills')]"));
			if (manageSkillsLogo.isDisplayed() && manageSkills.isDisplayed()) {
				System.out.println("Manage Agent Skills logo and label are displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Manage Agent Skills logo and label are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", manageSkills);
			Thread.sleep(3000);

//manage agent skills tab
			WebElement pushpin = driver.findElement(By.xpath("//mat-icon[contains(text(),'push_pin')]"));
			WebElement tabName = driver.findElement(By.xpath("(//span[contains(text(),'Manage Agent Skills')])[2]"));
			if (pushpin.isDisplayed() && tabName.isDisplayed()) {
				System.out.println("Manage Agent Skill tab is displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Manage Agent Skill tab is not displayed");
				componentsInformation.add(2, "Not Present");
			}

//manage agent skills(heading&information)
			WebElement heading = driver.findElement(
					By.xpath("//p[@class='mb-0 mt-6 text__title--font colored__blue--dark account-option__title']"));
			WebElement inform = driver.findElement(By.xpath("//p[contains(@class,'mb-0 mt-3 text__light--sm')]"));
			if (heading.isDisplayed() && inform.isDisplayed()) {
				System.out.println("Manage Agent Skills heading and information are displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Manage Agent Skills heading and information are not displayed");
				componentsInformation.add(3, "Not Present");
			}

//feature active button
			WebElement activeHeading = driver.findElement(By.xpath("//p[contains(@class,'text__md mb-4 mr-12')]"));
			WebElement activeButton = driver.findElement(By.xpath("//label[@class='rounded-toggle-switch-label']"));
			if (activeHeading.isDisplayed() && activeButton.isDisplayed()) {
				System.out.println("Feature Active button is displayed ");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("Feature Active button is not displayed ");
				componentsInformation.add(4, "Not Present");
			}
			js.executeScript("arguments[0].click()", activeButton);
			Thread.sleep(3000);

//brand field
			WebElement brandField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			if (brandField.isDisplayed() && arrow.isDisplayed()) {
				System.out.println("Brand field is displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Brand field is not displayed");
				componentsInformation.add(5, "Not Present");
			}

//search field
			WebElement searchField = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement searchButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			if (searchField.isDisplayed() && searchButton.isDisplayed()) {
				System.out.println("Search Field is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Search Field is not displayed");
				componentsInformation.add(6, "Not Present");
			}

//create new skill button
			WebElement createSkillButton = driver
					.findElement(By.xpath("//span[contains(text(),' Create New Skill ')]"));
			if (createSkillButton.isDisplayed()) {
				System.out.println("Create New Skill button is displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("Create New Skill button is not displayed");
				componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", createSkillButton);
			Thread.sleep(3000);

//create skill(heading,information)
			WebElement heading1 = driver.findElement(By.xpath("//h3[@class='modal__title']"));
			WebElement info = driver
					.findElement(By.xpath("//p[@class='configure__body--title text__light--sm line-height-1.5 mb-0']"));
			if (heading1.isDisplayed() && info.isDisplayed()) {
				System.out.println("create new skill heading and information are displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("create new skill heading and information are not displayed");
				componentsInformation.add(8, "Not Present");
			}

//manual tab
			WebElement manualImage = driver
					.findElement(By.xpath("(//img[@src='assets/images/account-profile/keyword-create.svg'])"));
			WebElement manualName = driver.findElement(By.xpath("(//p[contains(text(),' Enter Manually ')])[2]"));
			if (manualImage.isDisplayed() && manualName.isDisplayed()) {
				System.out.println("Manual Tab is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Manual Tab is not displayed");
				componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", manualName);
			Thread.sleep(3000);

//configure skills heading and cross button
			WebElement configureSkillsHeading = driver
					.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			WebElement crossButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'close')])[2]"));
			if (configureSkillsHeading.isDisplayed() && crossButton.isDisplayed()) {
				System.out.println("Configure Skill heading and cross button are displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Configure Skill heading and cross button are not displayed");
				componentsInformation.add(10, "Not Present");
			}

//skill name tab
			WebElement skillNameTab = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if (skillNameTab.isDisplayed()) {
				System.out.println("Skill name tab is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Skill name tab is not displayed");
				componentsInformation.add(11, "Not Present");
			}

//skill keywords(heading,information)
			WebElement keywordHeading = driver
					.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[1]"));
			WebElement keywordInfo = driver.findElement(By.xpath("(//p[@class='text__light'])"));
			if (keywordHeading.isDisplayed() && keywordInfo.isDisplayed()) {
				System.out.println("Skill Keyword heading and information are displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("Skill Keyword heading and information are not displayed");
				componentsInformation.add(12, "Not Present");
			}

//tabs of skill keywords
			WebElement tab = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement button = driver.findElement(
					By.xpath("//mat-radio-button[@class='mat-radio-button mat-radio-checked mat-accent']"));
			WebElement button1 = driver
					.findElement(By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent']"));
			WebElement tab1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[8]"));
			WebElement tab2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[9]"));
			if (tab.isDisplayed() && button.isDisplayed() && button1.isDisplayed() && tab1.isDisplayed()
					&& tab2.isDisplayed()) {
				System.out.println("Tabs of skill keywords are displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Tabs of skill keywords are not displayed");
				componentsInformation.add(13, "Not Present");
			}
			
//keyword preview
			WebElement previewHeading=driver.findElement(By.xpath("(//p[@class='text__regular font-weight-600 mb-4'])[2]"));
			WebElement previewInfo=driver.findElement(By.xpath("(//p[@class='text__sm'])"));
			WebElement previewTab=driver.findElement(By.xpath("//div[@class='mt-10 mb-0 config-skill__preview--textarea border__light-grey textarea-featured__input']"));
			WebElement copyQuery=driver.findElement(By.xpath("//span[contains(text(),'Copy Keywords')]"));
			WebElement queryLength=driver.findElement(By.xpath("//span[contains(text(),'Query length')]"));
			if(previewHeading.isDisplayed()&&previewInfo.isDisplayed()&&previewTab.isDisplayed()&&copyQuery.isDisplayed()&&queryLength.isDisplayed()) {
				System.out.println("Keyword Preview information,field and copy query button are displayed");
				componentsInformation.add(14, "Present");
			}
			else {
				System.out.println("Keyword Preview information,field and copy query button are not displayed");
				componentsInformation.add(14, "Not Present");
			}
			
//reset button
			WebElement resetButton=driver.findElement(By.xpath("//span[contains(text(),' Reset Query ')]"));
			if(resetButton.isDisplayed()) {
				System.out.println("Reset Button is displayed");
				componentsInformation.add(15, "Present");
			}
			else {
				System.out.println("Reset Button is not displayed");
				componentsInformation.add(15, "Not Present");
			}
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),'Save Skills')]"));
			if(saveButton.isDisplayed()) {
				System.out.println("Save Button is displayed");
				componentsInformation.add(16, "Present");
			}
			else {
				System.out.println("Save Button is not displayed");
				componentsInformation.add(16, "Not Present");
			}
			
//cancel button
			WebElement cancelButton=driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if(cancelButton.isDisplayed()) {
				System.out.println("Cancel Button is displayed");
				componentsInformation.add(17, "Present");
			}
			else {
				System.out.println("Cancel Button is not displayed");
				componentsInformation.add(17, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);
			
//link existing category button
			WebElement image=driver.findElement(By.xpath("(//img[@src='assets/images/account-profile/category-create.svg'])"));
			WebElement name=driver.findElement(By.xpath("//p[contains(text(),' Link existing Categories ')]"));
			if(image.isDisplayed()&&name.isDisplayed()) {
				System.out.println("Link existing category button is displayed");
				componentsInformation.add(18, "Present");
			}
			else {
				System.out.println("Link existing category button is not displayed");
				componentsInformation.add(18, "Not Present");
			}
			js.executeScript("arguments[0].click()", name);
			Thread.sleep(3000);
			
//category heading
			WebElement categoryHeading=driver.findElement(By.xpath("(//h3[@class='modal__title'])[2]"));
			if(categoryHeading.isDisplayed()) {
				System.out.println("Category heading is displayed ");
				componentsInformation.add(19, "Present");
			}
			else {
				System.out.println("Category heading is not displayed ");
				componentsInformation.add(19, "Not Present");
			}
			
//skill name tab
			WebElement skillNameTab1=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[6]"));
			if(skillNameTab1.isDisplayed()) {
				System.out.println("Skill name tab is displayed");
				componentsInformation.add(20, "Present");
			}
			else {
				System.out.println("Skill name tab is not displayed");
				componentsInformation.add(20, "Not Present");
			}
			
//category(heading,searchfield,tab)
			WebElement heading3=driver.findElement(By.xpath("//p[@class='text__md font-weight-600']"));
			WebElement searchField3=driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[7]"));
			WebElement searchButton3=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			WebElement categoryTab=driver.findElement(By.xpath("//div[contains(@class,'edit-action-nonaction__body--tree-wrapper bg__grey--lighter ')]"));
			if(heading3.isDisplayed()&&searchField3.isDisplayed()&&searchButton3.isDisplayed()&&categoryTab.isDisplayed()) {
				System.out.println("Category heading,serach field,tab are displayed");
				componentsInformation.add(21, "Present");
			}
			else {
				System.out.println("Category heading,serach field,tab are not displayed");
				componentsInformation.add(21, "Not Present");
			}
			
//link skill button
			WebElement linkSkillButton=driver.findElement(By.xpath("//span[contains(text(),' Link Skills ')]"));
			if(linkSkillButton.isDisplayed()) {
				System.out.println("Link skill button is displayed");
				componentsInformation.add(22, "Present");
			}
			else {
				System.out.println("Link skill button is not displayed");
				componentsInformation.add(22, "Not Present");
			}
			
//close button
			WebElement closeButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),' close')])[2]"));
			if(closeButton.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(23, "Present");
			}
			else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(23, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);
			
//close button
			WebElement closeButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),' close')])"));
			if(closeButton1.isDisplayed()) {
				System.out.println("Close Button is displayed");
				componentsInformation.add(24, "Present");
			}
			else {
				System.out.println("Close Button is not displayed");
				componentsInformation.add(24, "Not Present");
			}
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);
			
		
			
			componentsInformation.add(25, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "ManageAgentSkillUIComponents");

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
