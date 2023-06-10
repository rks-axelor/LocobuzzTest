package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocobuzzAWACompetitionBenchmarkingPPTDownloadWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void pptDownloadNativeForCompetitonBenchmarking(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement competitonBenchmark = driver
					.findElement(By.xpath("//span[@class='pl-7' and text()='Competition Benchmarking']"));
			js.executeScript("arguments[0].scrollIntoView();", competitonBenchmark);
			js.executeScript("arguments[0].click()", competitonBenchmark);
			Thread.sleep(7000);

			WebElement iframe = driver.findElement(By.xpath("//iframe[@name='analyticsFrame']"));
			driver.switchTo().frame(iframe);
			Thread.sleep(2000);

// duration
			WebElement duration = driver.findElement(By.xpath("//input[@id='Duration']"));
			js.executeScript("arguments[0].click()", duration);
			Thread.sleep(5000);
			WebElement selectRelative = driver.findElement(By.xpath("//div[contains(text(),'Relative')]"));
			js.executeScript("arguments[0].click()", selectRelative);
			Thread.sleep(5000);
			WebElement selectDuration = driver
					.findElement(By.xpath("//table[@class='table table-borderless mb-0']//tr[4]//td[2]"));
			selectDuration.click();
			Thread.sleep(2000);
			WebElement doneButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Done')])[1]"));
			js.executeScript("arguments[0].click()", doneButton1);
			Thread.sleep(3000);
			
//filter
			WebElement filterButton=driver.findElement(By.xpath("//img[@src='/static/media/filterIcon.cd81bd08ded36dd8a26ed50656bfed9f.svg']"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(4000);
			
//search the element
			WebElement searchElement=driver.findElement(By.xpath("//input[@placeholder='Search']"));
			searchElement.sendKeys("sentiment");
			Thread.sleep(2000);
			WebElement sentiment=driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[1]"));
			js.executeScript("arguments[0].click()", sentiment);
			Thread.sleep(4000);
			WebElement neutralexcludeButton=driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[3]"));
			js.executeScript("arguments[0].click()", neutralexcludeButton);
			Thread.sleep(4000);
			WebElement sentiment1=driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[1]"));
			js.executeScript("arguments[0].click()", sentiment1);
			Thread.sleep(4000);
			
			WebElement searchElement1=driver.findElement(By.xpath("//input[@placeholder='Search']"));
			//searchElement1.clear();
			Actions actions = new Actions(driver);

			
			String s = Keys.chord(Keys.CONTROL,"a");
			searchElement1.sendKeys(s);
		      
			searchElement1.sendKeys(Keys.DELETE);
			Thread.sleep(2000);
			
//search the element
			WebElement searchElement2=driver.findElement(By.xpath("//input[@placeholder='Search']"));
			searchElement2.sendKeys("category");
			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[3]"));
			js.executeScript("arguments[0].click()", category);
			Thread.sleep(4000);
			WebElement searchcategory=driver.findElement(By.xpath("//input[@placeholder='Search Category']"));
			searchcategory.sendKeys("atm");
			Thread.sleep(3000);
			WebElement excludeButton=driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[3]"));
			js.executeScript("arguments[0].click()", excludeButton);
			Thread.sleep(4000);
			WebElement category1=driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[3]"));
			js.executeScript("arguments[0].click()", category1);
			Thread.sleep(4000);
			
//search the element
			WebElement searchElement3=driver.findElement(By.xpath("//input[@placeholder='Search']"));
			searchElement3.sendKeys("media type");
			Thread.sleep(2000);
			WebElement mediatype=driver.findElement(By.xpath("(//div[@class='ant-collapse-header']//div)[1]"));
			js.executeScript("arguments[0].click()", mediatype);
			Thread.sleep(4000);
			WebElement excludeButton1=driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[7]"));
			js.executeScript("arguments[0].click()", excludeButton1);
			Thread.sleep(4000);
			
			WebElement applyButton=driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(4000);


//ppt
			Actions action = new Actions(driver);
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			WebElement actionButton = wait1.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//button[@type='button']//span[@class='ant-dropdown-trigger']")));
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

			pptDownloadImageForCompetitionBenchmarking(driver);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void pptDownloadImageForCompetitionBenchmarking(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement iframe = driver.findElement(By.xpath("//iframe[@name='analyticsFrame']"));
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
			// Thread.sleep(20000);

			driver.switchTo().defaultContent();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
