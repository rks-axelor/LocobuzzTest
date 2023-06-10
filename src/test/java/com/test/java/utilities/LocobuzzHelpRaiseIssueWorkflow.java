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

public class LocobuzzHelpRaiseIssueWorkflow {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void raiseIssueProcess(WebDriver driver) throws Exception {
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
			}
			else {
				System.out.println("Raise Issue logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", raiseIssueLabel);
			Thread.sleep(3000);
			
//raise issue heading,cross button
			WebElement raiseIssueHeading=driver.findElement(By.xpath("//h3[contains(text(),'Raise Issue/Queries')]"));
			WebElement crossButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'close ')]"));
			if(raiseIssueHeading.isDisplayed()&&crossButton.isDisplayed()) {
				System.out.println("Raise Issue heading,cross button are displayed");
			}
			else {
				System.out.println("Raise Issue heading,cross button are not displayed");
			}
			
//select support category
			WebElement supportCategory=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])"));
			js.executeScript("arguments[0].click()", supportCategory);
			Thread.sleep(3000);
			WebElement selectCategory=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Complaint']"));
			js.executeScript("arguments[0].click()", selectCategory);
			Thread.sleep(3000);
			
//select area
			WebElement areaField=driver.findElement(By.xpath("//input[@placeholder='Search area']"));
			js.executeScript("arguments[0].click()", areaField);
			Thread.sleep(3000);
			WebElement selectArea=driver.findElement(By.xpath("//span[@class='mat-checkbox-label' and text()=' Social Inbox ']"));
			js.executeScript("arguments[0].click()", selectArea);
			Thread.sleep(3000);
			WebElement selectArea1=driver.findElement(By.xpath("//span[@class='mat-checkbox-label' and text()=' Accounts ']"));
			js.executeScript("arguments[0].scrollIntoView()", selectArea1);
			js.executeScript("arguments[0].click()", selectArea1);
			Thread.sleep(3000);
			
			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(Keys.ESCAPE).build();
			action3.perform();
			
//subject/summary
			WebElement subject=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			js.executeScript("arguments[0].click()", subject);
			Thread.sleep(3000);
			subject.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout");
			Thread.sleep(2000);
			
//description
			WebElement description=driver.findElement(By.xpath("//textarea[@placeholder='Describe the issue']"));
			description.sendKeys("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.");
			Thread.sleep(2000);
			
//upload file
			WebElement uploadFile=driver.findElement(By.xpath("//label[contains(text(),' Upload file ')]"));
			js.executeScript("arguments[0].click()", uploadFile);
			Thread.sleep(3000);
			WebElement fileName = driver.findElement(By.xpath("//input[@id='fileIssue']"));
			fileName.sendKeys("C:\\Users\\admin\\Downloads\\image777.png");
			Thread.sleep(2000);
			
//submit button
			WebElement submitButton=driver.findElement(By.xpath("//span[contains(text(),' Submit ')]"));
			js.executeScript("arguments[0].click()", submitButton);
			Thread.sleep(3000);
			
//close button
			WebElement closeButton=driver.findElement(By.xpath("//span[contains(text(),' Close ')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
