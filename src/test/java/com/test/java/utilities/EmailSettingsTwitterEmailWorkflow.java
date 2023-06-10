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

public class EmailSettingsTwitterEmailWorkflow {
	
	public static String ticketIDValue;
	public static List<String> ticketInformation = new ArrayList<String>();
	
	public static void emailProcess(WebDriver driver, String channel) throws Exception {
		try {
			
//tickets tab
			Thread.sleep(3000);
			WebElement ticketsTab = driver
					.findElement(By.xpath("//span[@class = 'header__tabs--label activeText-blur moreText-blur' and contains(text(),'Tickets')]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ticketsTab);

			Thread.sleep(2000);

			CommonFunctions.ticketsSearch(driver, channel);
			
//select the brand
			WebElement brand=driver.findElement(By.xpath("(//span[contains(text(),' All ')])[2]"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(2000);
			WebElement searchBrand=driver.findElement(By.xpath("//input[@data-placeholder='Search brand']"));
			searchBrand.sendKeys("renault");
			WebElement selectBrand=driver.findElement(By.xpath("//span[contains(text(),' Renault ')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(2000);
			WebElement applyButton=driver.findElement(By.xpath("(//span[contains(text(),'Apply')])[2]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);

//Assigning

			WebElement moreButton = driver.findElement(By.xpath("(//span[contains(text(),'More')])[1]"));
			js.executeScript("arguments[0].click()", moreButton);
			Thread.sleep(2000);

			WebElement assignTo = driver.findElement(By.xpath("(//span[contains(text(),'Assign to')])"));
			js.executeScript("arguments[0].click()", assignTo);
			Thread.sleep(2000);

			WebElement selectUser = driver
					.findElement(By.xpath("//mat-label[contains(text(),'Select User')]//preceding::input[1]"));
			js.executeScript("arguments[0].click()", selectUser);
			Thread.sleep(2000);

			WebElement assignUser = driver.findElement(By.xpath("(//span[contains(text(),'Kalyanlive chinni')])[2]"));
			js.executeScript("arguments[0].click()", assignUser);
			Thread.sleep(2000);
			WebElement assignButton = driver.findElement(By.xpath("(//span[contains(text(),'Assign')])[2]"));
			js.executeScript("arguments[0].click()", assignButton);
			Thread.sleep(2000);
			WebElement search = driver.findElement(By.xpath("//mat-icon[contains(text(),' search')]"));
			js.executeScript("arguments[0].click()", search);
			Thread.sleep(2000);
			
//send email
			WebElement sendEmailButton=driver.findElement(By.xpath("(//span[contains(text(),'Send Email')])"));
			js.executeScript("arguments[0].click()", sendEmailButton);
			Thread.sleep(5000);
			
			WebElement cancelButton=driver.findElement(By.xpath("(//span[contains(text(),' Cancel ')])[2]"));
			js.executeScript("arguments[0].scrollIntoView()", cancelButton);
			Thread.sleep(3000);
			
			//Actions at = new Actions(driver);
			//at.sendKeys(Keys.PAGE_DOWN).build().perform();
			
			WebElement sendButton=driver.findElement(By.xpath("(//span[contains(text(),' Send ')])"));
			js.executeScript("arguments[0].click()", sendButton);
			Thread.sleep(2000);

			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
