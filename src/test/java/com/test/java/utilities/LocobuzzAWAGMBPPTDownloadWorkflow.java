package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocobuzzAWAGMBPPTDownloadWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void pptDownloadNativeForGMB(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement gmb = driver.findElement(By.xpath("//span[@class='pl-7' and text()='GMB']"));
			js.executeScript("arguments[0].scrollIntoView();", gmb);
			js.executeScript("arguments[0].click()", gmb);
			Thread.sleep(7000);

			WebElement iframe = driver.findElement(By.xpath("//iframe[@name='analyticsFrame']"));
			driver.switchTo().frame(iframe);
			Thread.sleep(2000);

// select the brand
			WebElement brand = driver.findElement(
					By.xpath("(//img[@src='/static/media/acco_arrow-up.aa1999e6988161299a4640d297e3a038.svg'])[1]"));
			js.executeScript("arguments[0].click()", brand);
			Thread.sleep(3000);

			WebElement selectBrand = driver
					.findElement(By.xpath("//span[@class='d-flex align-items-center' and text()='Auto Demo']"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

			WebElement doneButton = driver.findElement(By.xpath("(//span[contains(text(),'Done')])[2]"));
			js.executeScript("arguments[0].click()", doneButton);
			Thread.sleep(5000);
			
			//duration
			WebElement  duration=driver.findElement(By.xpath("//input[@id='Duration']"));
			js.executeScript("arguments[0].click()", duration);
			Thread.sleep(5000);
			WebElement selectRelative=driver.findElement(By.xpath("//div[contains(text(),'Relative')]"));
			js.executeScript("arguments[0].click()", selectRelative);
			Thread.sleep(5000);
			WebElement selectDuration=driver.findElement(By.xpath("//table[@class='table table-borderless mb-0']//tr[4]//td[2]"));
			selectDuration.click();
			Thread.sleep(2000);
			WebElement doneButton1=driver.findElement(By.xpath("(//span[contains(text(),'Done')])[1]"));
			js.executeScript("arguments[0].click()", doneButton1);
			Thread.sleep(3000);
			
//filters
			WebElement filterButton=driver.findElement(By.xpath("//img[@src='/static/media/filterIcon.cd81bd08ded36dd8a26ed50656bfed9f.svg']"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(4000);
//search the element
			WebElement searchElement=driver.findElement(By.xpath("//input[@placeholder='Search']"));
			searchElement.sendKeys("rating");
			Thread.sleep(2000);
			WebElement rating=driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[1]"));
			js.executeScript("arguments[0].click()", rating);
			Thread.sleep(4000);
			WebElement excludeButton=driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[49]"));
			js.executeScript("arguments[0].click()", excludeButton);
			Thread.sleep(4000);
			WebElement rating1=driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[1]"));
			js.executeScript("arguments[0].click()", rating1);
			Thread.sleep(4000);
			
			WebElement applyButton=driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(4000);
			
//ppt
			Actions action = new Actions(driver);
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement actionButton = wait1.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//button[@type='button']//span[@class='ant-dropdown-trigger']")));
			action.moveToElement(actionButton).click();
			action.build().perform();
			Thread.sleep(4000);
			
			WebElement pptButton = driver.findElement(
					By.xpath("//img[@src='/static/media/PPT_Icon-gray.072eea0b685ea576472645c934315216.svg']"));
			pptButton.click();
			Thread.sleep(4000);
			
			WebElement nativeButton = driver.findElement(By.xpath("//div[contains(text(),'Download as Native')]"));
			js.executeScript("arguments[0].click()", nativeButton);
			Thread.sleep(3000);

			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);
			
			WebElement selectPreview = driver.findElement(By
					.xpath("(//div[contains(@class,'border mb-15 cursor-pointer overflow-hidden border_width2')])[3]"));
			js.executeScript("arguments[0].click()", selectPreview);
			Thread.sleep(3000);
			
			WebElement downloadPPT = driver.findElement(By.xpath("(//span[contains(text(),'Download PPT')])[2]"));
			js.executeScript("arguments[0].click()", downloadPPT);
			TimeUnit.MINUTES.sleep(2);
			
            driver.switchTo().defaultContent();
			
			pptDownloadImageForGMB(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void pptDownloadImageForGMB(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement iframe = driver
					.findElement(By.xpath("//iframe[@name='analyticsFrame']"));
			driver.switchTo().frame(iframe);
			Thread.sleep(2000);
			
			Actions action = new Actions(driver);
			WebElement actionButton = driver.findElement(By.xpath("//span[@class='ant-dropdown-trigger']"));
			action.moveToElement(actionButton).click();
			action.build().perform();
			Thread.sleep(4000);
			
//ppt
			WebElement pptButton = driver.findElement(
					By.xpath("//img[@src='/static/media/PPT_Icon-gray.072eea0b685ea576472645c934315216.svg']"));
			pptButton.click();
			Thread.sleep(4000);
			
			WebElement imageButton = driver.findElement(By.xpath("//div[contains(text(),'Download as Images')]"));
			js.executeScript("arguments[0].click()", imageButton);
			Thread.sleep(3000);

			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);

			WebElement selectPreview = driver.findElement(By
					.xpath("(//div[contains(@class,'border mb-15 cursor-pointer overflow-hidden border_width2')])[2]"));
			js.executeScript("arguments[0].click()", selectPreview);
			Thread.sleep(3000);

			WebElement downloadPPT = driver.findElement(By.xpath("(//span[contains(text(),'Download PPT')])[2]"));
			js.executeScript("arguments[0].click()", downloadPPT);
			TimeUnit.MINUTES.sleep(2);
			//Thread.sleep(20000);
			
			driver.switchTo().defaultContent();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
