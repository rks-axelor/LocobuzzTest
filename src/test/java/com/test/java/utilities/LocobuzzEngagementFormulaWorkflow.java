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

public class LocobuzzEngagementFormulaWorkflow {

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

	public static void engagementFormulaProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//adv listening settings
			WebElement advListeningSettings = driver
					.findElement(By.xpath("//mat-panel-title[contains(text(),' Adv. Listening Settings ')]"));
			js.executeScript("arguments[0].click()", advListeningSettings);
			Thread.sleep(3000);
			
//engagement formula
			WebElement engagementFormulaLogo = driver
					.findElement(By.xpath("//img[@src='assets/account/menu/Engagement_Formula.svg']"));
			WebElement engagementFormula = driver
					.findElement(By.xpath("//span[contains(text(),'Engagement Formula')]"));
			js.executeScript("arguments[0].click()", engagementFormula);
			Thread.sleep(3000);
			
//Et information
			WebElement heading = driver.findElement(By.xpath("(//p[contains(text(),'Engagement Formula')])"));
			WebElement information = driver
					.findElement(By.xpath("(//p[contains(@class,'mb-0 mt-6 text__light--sm')])"));
			if (heading.isDisplayed() && information.isDisplayed()) {
				System.out.println("Engagement Formula Information is displayed");
			} else {
				System.out.println("Engagement Formula Information is not displayed");
			}

//note
			WebElement note = driver
					.findElement(By.xpath("(//p[@class='text__light text__sm line-height-1.25 mb-0 mt-5'])"));
			if (note.isDisplayed()) {
				System.out.println("Note message is displayed");
			} else {
				System.out.println("Note message is not displayed");
			}
			
//create formula
			WebElement createFormulaButton = driver.findElement(By.xpath("//span[contains(text(),'Create Formula ')]"));
			js.executeScript("arguments[0].click()", createFormulaButton);
			Thread.sleep(3000);
			
//select type of Engagement formula(brand post)
			WebElement postType=driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[1]"));
			js.executeScript("arguments[0].click()", postType);
			Thread.sleep(3000);
			
//select social media channel
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			
			WebElement selectChannel=driver.findElement(By.xpath("//span[@class='ml-10 font-weight-500' and text()='Instagram']"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			
//followers or friends
			WebElement selectFollowers=driver.findElement(By.xpath("//input[@type='number']"));
			selectFollowers.sendKeys("175");
			
//video views
			WebElement videoViews=driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[3]"));
			js.executeScript("arguments[0].click()", videoViews);
			Thread.sleep(3000);
			
//select brands
			WebElement selectField=driver.findElement(By.xpath("//input[@placeholder='Select Brand/Brands']"));
			js.executeScript("arguments[0].click()", selectField);
			Thread.sleep(3000);
			
			WebElement selectBrand=driver.findElement(By.xpath("(//span[@class='ml-10'])[1]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
			WebElement selectBrand2=driver.findElement(By.xpath("(//span[@class='ml-10'])[2]"));
			js.executeScript("arguments[0].click()", selectBrand2);
			Thread.sleep(3000);
			
			WebElement selectBrand3=driver.findElement(By.xpath("(//span[@class='ml-10'])[3]"));
			js.executeScript("arguments[0].click()", selectBrand3);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//impression formula
			WebElement impressionFormula=driver.findElement(By.xpath("(//textarea[contains(@class,'textarea-featured__input h-57')])[1]"));
			impressionFormula.sendKeys("+9+");
			WebElement likebutton=driver.findElement(By.xpath("(//div[contains(@class,'eng-formula__body--textarea-footer-item bg__grey border-radius-16 font-weight-500 mr-10')])[2]"));
			js.executeScript("arguments[0].click()", likebutton);
			Thread.sleep(3000);
			
//reach formula
			WebElement reachFormula=driver.findElement(By.xpath("(//textarea[contains(@class,'textarea-featured__input h-57')])[2]"));
			reachFormula.sendKeys("+");
			WebElement followersButton=driver.findElement(By.xpath("(//div[contains(@class,'eng-formula__body--textarea-footer-item bg__grey border-radius-16 font-weight-500 mr-10')])[5]"));
			js.executeScript("arguments[0].click()", followersButton);
			Thread.sleep(3000);
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
			System.out.println("Engagement Formula successfully Created for brand post");
			
//search 
			WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search.sendKeys("instagram");
			
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			search.clear();
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			createUserPost(driver);
			
			WebElement arrowBack1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack1);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void createUserPost(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//create formula
			WebElement createFormulaButton = driver.findElement(By.xpath("//span[contains(text(),'Create Formula ')]"));
			js.executeScript("arguments[0].click()", createFormulaButton);
			Thread.sleep(3000);
			
//select type of Engagement formula(user post)
			WebElement postType=driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[2]"));
			js.executeScript("arguments[0].click()", postType);
			Thread.sleep(3000);
			
//select social media channel
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			
			WebElement selectChannel=driver.findElement(By.xpath("//span[@class='ml-10 font-weight-500' and text()='Facebook']"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			
//followers or friends
			WebElement selectFollowers=driver.findElement(By.xpath("//input[@type='number']"));
			selectFollowers.sendKeys("140");
			
//video views
			WebElement videoViews=driver.findElement(By.xpath("(//label[@class='mat-radio-label'])[4]"));
			js.executeScript("arguments[0].click()", videoViews);
			Thread.sleep(3000);
			
//select brands
			WebElement selectField=driver.findElement(By.xpath("//input[@placeholder='Select Brand/Brands']"));
			js.executeScript("arguments[0].click()", selectField);
			Thread.sleep(3000);
			
			WebElement selectBrand=driver.findElement(By.xpath("(//span[@class='ml-10'])[1]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);
			
			WebElement selectBrand2=driver.findElement(By.xpath("(//span[@class='ml-10'])[2]"));
			js.executeScript("arguments[0].click()", selectBrand2);
			Thread.sleep(3000);
			
			WebElement selectBrand3=driver.findElement(By.xpath("(//span[@class='ml-10'])[3]"));
			js.executeScript("arguments[0].click()", selectBrand3);
			Thread.sleep(3000);
			
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//impression formula
			WebElement impressionFormula=driver.findElement(By.xpath("(//textarea[contains(@class,'textarea-featured__input h-57')])[1]"));
			impressionFormula.sendKeys("+5+");
			WebElement likebutton=driver.findElement(By.xpath("(//div[contains(@class,'eng-formula__body--textarea-footer-item bg__grey border-radius-16 font-weight-500 mr-10')])[2]"));
			js.executeScript("arguments[0].click()", likebutton);
			Thread.sleep(3000);
			
//reach formula
			WebElement reachFormula=driver.findElement(By.xpath("(//textarea[contains(@class,'textarea-featured__input h-57')])[2]"));
			reachFormula.sendKeys("+");
			WebElement followersButton=driver.findElement(By.xpath("(//div[contains(@class,'eng-formula__body--textarea-footer-item bg__grey border-radius-16 font-weight-500 mr-10')])[5]"));
			js.executeScript("arguments[0].click()", followersButton);
			Thread.sleep(3000);
			
//reset to default
	/*		WebElement resetButton=driver.findElement(By.xpath("//span[contains(text(),' Reset to default ')]"));
			js.executeScript("arguments[0].click()", resetButton);
			Thread.sleep(3000);
			WebElement confirmButton=driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", confirmButton);
			Thread.sleep(3000);*/
			
//save button
			WebElement saveButton=driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(3000);
			
//search 
			WebElement search=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			search.sendKeys("facebook");
			
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
			System.out.println("Engagement Formula successfully Created for user post");
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
