package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExcelReportEditReportWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void excelReportEditReportWorkflow(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

//Excel report
			WebElement excelReportLogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'integration_instructions')]"));
			WebElement report=driver.findElement(By.xpath("//span[contains(text(),' Reports')]"));
			if (excelReportLogo.isDisplayed() && report.isDisplayed()) {
				System.out.println(" report logo and label are displayed");
			} else {
				System.out.println(" report logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", report);
			Thread.sleep(3000);
			
			WebElement excelReport = driver.findElement(By.xpath("//a[contains(text(),' Export Reports ')]"));
			if (excelReport.isDisplayed()) {
				System.out.println("Excel report  label are displayed");
			} else {
				System.out.println("Excel report  label are not displayed");
			}
			js.executeScript("arguments[0].click()", excelReport);
			Thread.sleep(3000);


//excel report tab
			WebElement excelReportTabLogo = driver
					.findElement(By.xpath("//img[@src='assets/images/common/Excel_Report.svg']"));
			WebElement excelReportTab = driver.findElement(By.xpath("//span[contains(text(),'Excel Report')]"));
			if (excelReportTabLogo.isDisplayed() && excelReportTab.isDisplayed()) {
				System.out.println("Excel report tab is displayed");
			} else {
				System.out.println("Excel report tab is not displayed");
			}
			js.executeScript("arguments[0].click()", excelReportTab);
			Thread.sleep(3000);

//search
			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search2.sendKeys("ticket");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

//actions
			WebElement actions = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_vert')])[1]"));
			js.executeScript("arguments[0].click()", actions);
			Thread.sleep(3000);

//Edit report
			WebElement editReport = driver.findElement(By.xpath("//div[contains(text(),' Edit Report ')]"));
			js.executeScript("arguments[0].click()", editReport);
			Thread.sleep(3000);

			WebElement nextButton = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);

			editProcess(driver);
			
			WebElement nextButton1=driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);

			scheduleReportProcess(driver);
			
//search
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search1.sendKeys("ticket");
			WebElement searchButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);
			
//actions
			WebElement action = driver.findElement(By.xpath("(//mat-icon[contains(text(),'more_vert')])[1]"));
			js.executeScript("arguments[0].click()", action);
			Thread.sleep(3000);
			WebElement deleteReport=driver.findElement(By.xpath("//div[contains(text(),' Delete Report ')]"));
			js.executeScript("arguments[0].click()", deleteReport);
			Thread.sleep(3000);
			WebElement confirmDelete=driver.findElement(By.xpath("//span[contains(text(),' Delete ')]"));
			js.executeScript("arguments[0].click()", confirmDelete);
			Thread.sleep(3000);
			
//search
			WebElement search3 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search3.clear();
			WebElement searchButton2 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton2);
			Thread.sleep(3000);
			
//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			// JavascriptExecutor js = (JavascriptExecutor) driver;
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
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void editProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//edit process
			WebElement editButton = driver.findElement(By.xpath("//a[contains(text(),' Edit ')]"));
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
//drag and drop
			WebElement fromElement=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drag_indicator')])[3]"));
			WebElement toElement=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drag_indicator')])[4]"));
			
			Actions builder=new Actions(driver);
			
			Action dragAndDrop=builder.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();
			dragAndDrop.perform();

			
//search
			WebElement search1=driver.findElement(By.xpath("//input[contains(@class,'mat-input-element mat-form-field-autofill-control material-icons-outlined')]"));
			search1.sendKeys("source type");
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(2000);
			

			
//download report
			WebElement downloadReport=driver.findElement(By.xpath("//span[contains(text(),' Download in Excel ')]"));
			js.executeScript("arguments[0].click()", downloadReport);
			Thread.sleep(2000);
			
//reset columns
			WebElement resetButton=driver.findElement(By.xpath("//span[contains(text(),'Reset Columns')]"));
			js.executeScript("arguments[0].click()", resetButton);
			Thread.sleep(2000);
			
			WebElement continueTemplate=driver.findElement(By.xpath("//span[contains(text(),'Continue with this template')]"));
			js.executeScript("arguments[0].click()", continueTemplate);
			Thread.sleep(2000);
			
			
			


			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void scheduleReportProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement frequencyarrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", frequencyarrow);
			Thread.sleep(3000);
			WebElement selectOption=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Daily']"));
			js.executeScript("arguments[0].click()", selectOption);
			Thread.sleep(3000);
			WebElement duration=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", duration);
			Thread.sleep(3000);
			WebElement selectDuration=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Yesterday']"));
			js.executeScript("arguments[0].click()", selectDuration);
			Thread.sleep(3000);
			WebElement timeDate=driver.findElement(By.xpath("//input[@formcontrolname='scheduleDateTimeControl']"));
			js.executeScript("arguments[0].click()", timeDate);
			Thread.sleep(3000);
			WebElement date=driver.findElement(By.xpath("((//div[@class='calendar-table'])[1]//span[contains(text(),'3')])[2]"));
			js.executeScript("arguments[0].click()", date);
			Thread.sleep(3000);
			WebElement hoursTab=driver.findElement(By.xpath(("(//select[contains(@class,'hourselect select-item')])[1]")));
			hoursTab.click();
			Thread.sleep(2000);
			WebElement selectHours=driver.findElement(By.xpath("(//select[contains(@class,'hourselect select-item')])[1]//option[1]"));
			selectHours.click();
			Thread.sleep(2000);
			WebElement minutesTab=driver.findElement(By.xpath("(//select[contains(@class,'select-item minuteselect')])[1]"));
			minutesTab.click();
			Thread.sleep(2000);
			WebElement selectMinutes=driver.findElement(By.xpath("(//select[contains(@class,'select-item minuteselect')])[1]//option[11]"));
			selectMinutes.click();
			Thread.sleep(2000);
			WebElement ampm=driver.findElement(By.xpath("(//select[contains(@class,'select-item ampmselect')])[1]"));
			ampm.click();
			Thread.sleep(2000);
			WebElement selectAmPm=driver.findElement(By.xpath("(//select[contains(@class,'select-item ampmselect')])[1]//option[1]"));
			selectAmPm.click();
			Thread.sleep(3000);
			WebElement applyButton=driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);
			WebElement timezoneArrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", timezoneArrow);
			Thread.sleep(3000);
			WebElement searchCountry=driver.findElement(By.xpath("(//input[@type='text'])[7]"));
			searchCountry.sendKeys("calcutta");
			WebElement selectCountry=driver.findElement(By.xpath("//span[contains(text(),'(GMT+05:30:00) Asia/Calcutta')]"));
			js.executeScript("arguments[0].click()", selectCountry);
			Thread.sleep(3000);
			
			WebElement nextButton = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);
			
			WebElement nextButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);
			
			WebElement scheduleButton=driver.findElement(By.xpath("//span[contains(text(),'Schedule Report')]"));
			js.executeScript("arguments[0].click()", scheduleButton);
			Thread.sleep(3000);
			


			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
