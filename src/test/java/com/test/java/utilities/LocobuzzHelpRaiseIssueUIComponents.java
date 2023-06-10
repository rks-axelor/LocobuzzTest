package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzHelpRaiseIssueUIComponents {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void verifyingRaiseIssueComponents(WebDriver driver) throws Exception {
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
			Thread.sleep(3000);
			
//raise issue
			WebElement raiseIssueLogo=driver.findElement(By.xpath("//mat-icon[contains(text(),'bug_report')]"));
			WebElement raiseIssueLabel=driver.findElement(By.xpath("//span[contains(text(),'Raise Issue')]"));
			if(raiseIssueLogo.isDisplayed()&&raiseIssueLabel.isDisplayed()) {
				System.out.println("Raise Issue logo and label are displayed");
				componentsInformation.add(0, "Present");
			}
			else {
				System.out.println("Raise Issue logo and label are not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", raiseIssueLabel);
			Thread.sleep(3000);
			
//raise issue heading,cross button
			WebElement raiseIssueHeading=driver.findElement(By.xpath("//h3[contains(text(),'Raise Issue/Queries')]"));
			WebElement crossButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close ')]"));
			if(raiseIssueHeading.isDisplayed()&&crossButton.isDisplayed()) {
				System.out.println("Raise Issue heading,cross button are displayed");
				componentsInformation.add(1, "Present");
			}
			else {
				System.out.println("Raise Issue heading,cross button are not displayed");
				componentsInformation.add(1, "Not Present");
			}
			
//category field,heading
			WebElement categoryHeading=driver.findElement(By.xpath("//p[contains(text(),'Support Category ')]"));
			WebElement categoryField=driver.findElement(By.xpath("//mat-form-field[contains(@class,'mat-form-field material__select mt-7')]"));
			if(categoryHeading.isDisplayed()&&categoryField.isDisplayed()) {
				System.out.println("Category heading,field are displayed");
				componentsInformation.add(2, "Present");
			}
			else {
				System.out.println("Category heading,field are not displayed");
				componentsInformation.add(2, "Not Present");
			}
			
//area (heading,field)
			WebElement areaHeading=driver.findElement(By.xpath("//p[@class='font-weight-600 mt-16 mb-5']"));
			WebElement areaField=driver.findElement(By.xpath("//mat-form-field[contains(@class,'mat-form-field mt-7 material__select')]"));
			WebElement message=driver.findElement(By.xpath("(//span[@class='text__light--sm'])[1]"));
			if(areaHeading.isDisplayed()&&areaField.isDisplayed()&&message.isDisplayed()) {
				System.out.println("Area relative heading,field,message are displayed");
				componentsInformation.add(3, "Present");
			}
			else {
				System.out.println("Area relative heading,field,message are not displayed");
				componentsInformation.add(3, "Not Present");
			}
			
//subject/summary(heading,field)
			WebElement subjectHeading=driver.findElement(By.xpath("//p[@class='font-weight-600 mt-16 mb-7']"));
			WebElement subjectField=driver.findElement(By.xpath("(//mat-form-field[contains(@class,'mat-form-field material__select')])[2]"));
			WebElement message1=driver.findElement(By.xpath("(//span[@class='text__light--sm'])[2]"));
			if(subjectHeading.isDisplayed()&&subjectField.isDisplayed()&&message1.isDisplayed()) {
				System.out.println("Subject/Summary heading,field,message are displayed");
				componentsInformation.add(4, "Present");
			}
			else {
				System.out.println("Subject/Summary heading,field,message are not displayed");
				componentsInformation.add(4, "Not Present");
			}
			
//description(heading,field)
			WebElement descriptionHeading=driver.findElement(By.xpath("//p[@class='font-weight-600 mt-16']"));
			WebElement descriptionField=driver.findElement(By.xpath("//textarea[@placeholder='Describe the issue']"));
			WebElement message2=driver.findElement(By.xpath("//div[@class='d-flex-items-center mb-12']"));
			if(descriptionHeading.isDisplayed()&&descriptionField.isDisplayed()&&message2.isDisplayed()) {
				System.out.println("Description relative heading,field,message are displayed");
				componentsInformation.add(5, "Present");
			}
			else {
				System.out.println("Description relative heading,field,message are not displayed");
				componentsInformation.add(5, "Present");
			}
			
//upload button,information
			WebElement uploadButton=driver.findElement(By.xpath("//label[contains(text(),' Upload file ')]"));
			WebElement uploadInfo=driver.findElement(By.xpath("//p[@class='text__light--sm mt-13']"));
			if(uploadButton.isDisplayed()&&uploadInfo.isDisplayed()) {
				System.out.println("Upload button,information are displayed");
				componentsInformation.add(6, "Present");
			}
			else {
				System.out.println("Upload button,information are not displayed");
				componentsInformation.add(6, "Not Present");
			}
			
//cancel,submit buttons
			WebElement submitButton=driver.findElement(By.xpath("//span[contains(text(),' Submit ')]"));
			WebElement cancelButton=driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])"));
			if(submitButton.isDisplayed()&&cancelButton.isDisplayed()) {
				System.out.println("Cancel,Submit button are displayed");
				componentsInformation.add(7, "Present");
			}
			else {
				System.out.println("Cancel,Submit button are not displayed");
				componentsInformation.add(7, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);
			
			
			
			componentsInformation.add(8, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "HelpRaiseIssueUIComponents");
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
