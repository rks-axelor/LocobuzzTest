package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExcelReportPostSchedulingReportWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void excelReportPostSchedulingReportTemplateWorkflow(WebDriver driver) throws Exception {
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

//generate new report
			WebElement generateNewReport = driver
					.findElement(By.xpath("//span[contains(text(),'Generate New Report')]"));
			js.executeScript("arguments[0].click()", generateNewReport);
			Thread.sleep(3000);

//section name
			WebElement sectionName = driver.findElement(By.xpath("//a[contains(text(),'Post Scheduling')]"));
			js.executeScript("arguments[0].click()", sectionName);
			Thread.sleep(3000);

			WebElement template = driver.findElement(By.xpath("//h3[contains(text(),'Post Scheduling Report')]"));
			js.executeScript("arguments[0].click()", template);
			Thread.sleep(3000);

//search the brand
			WebElement search = driver.findElement(By.xpath("//input[@data-placeholder='Search Brands']"));
			search.sendKeys("ajio");
			WebElement searchButon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", searchButon);
			Thread.sleep(3000);

			WebElement selectBrand = driver.findElement(By.xpath("//span[@class='brandselect__image--circle']"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

			WebElement brandSelected = driver.findElement(By.xpath("//span[contains(@class,'font-weight-600 ml-10')]"));
			if (brandSelected.isDisplayed()) {
				System.out.println("Selected brand is displayed");
			} else {
				System.out.println("Selected brand is not displayed");
			}

			WebElement nextButton = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(5000);

			editProcess(driver);
			
			scheduleProcess(driver);
			
			WebElement scheduleButton = driver.findElement(By.xpath("//span[contains(text(),'Schedule Report')]"));
			js.executeScript("arguments[0].click()", scheduleButton);
			Thread.sleep(6000);

//search
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search1.sendKeys("template92");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(4000);
			
//names of fields
			WebElement field = driver.findElement(By.xpath("//div[contains(text(),'Brands ')]"));
			WebElement field1 = driver.findElement(By.xpath("//div[contains(text(),'Report Name ')]"));
			WebElement field2 = driver.findElement(By.xpath("//div[contains(text(),'Duration ')]"));
			WebElement field3 = driver.findElement(By.xpath("//div[contains(text(),'Applied filters ')]"));
			WebElement field4 = driver.findElement(By.xpath("//div[contains(text(),'Frequency/Scheduled On ')]"));
			WebElement field5 = driver.findElement(By.xpath("//th[contains(text(),'Actions')]"));
			WebElement field6 = driver.findElement(By.xpath("//div[contains(text(),'Scheduled By ')]"));
			if (field.isDisplayed() && field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed()
					&& field4.isDisplayed() && field5.isDisplayed() && field6.isDisplayed()) {
				System.out.println("All fields are displayed");
			} else {
				System.out.println("All fields are not  displayed");
			}

//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
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

//edit
			WebElement editButton = driver.findElement(By.xpath("//a[contains(text(),' Edit ')]"));
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);
			
//drag and drop
			WebElement fromElement=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drag_indicator')])[1]"));
			WebElement toElement=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drag_indicator')])[2]"));
			
			Actions builder=new Actions(driver);
			
			Action dragAndDrop=builder.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();
			dragAndDrop.perform();


			
//search
			WebElement search1 = driver.findElement(By.xpath(
					"//input[contains(@class,'mat-input-element mat-form-field-autofill-control material-icons-outlined')]"));
			search1.sendKeys("channel");
			WebElement searchButton1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(2000);

//download report
			WebElement downloadReport = driver.findElement(By.xpath("//span[contains(text(),' Download in Excel ')]"));
			js.executeScript("arguments[0].click()", downloadReport);
			Thread.sleep(2000);
			
//save
			WebElement saveAs = driver.findElement(By.xpath("//span[contains(text(),'Save as')]"));
			js.executeScript("arguments[0].click()", saveAs);
			Thread.sleep(2000);

			WebElement templateName = driver.findElement(By.xpath("//input[@type='string']"));
			templateName.sendKeys("template92");
			WebElement saveButton2 = driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton2);
			Thread.sleep(3000);

			WebElement nextButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void scheduleProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement scheduleReportButton = driver
					.findElement(By.xpath("//span[contains(text(),'Schedule Report ')]"));
			js.executeScript("arguments[0].click()", scheduleReportButton);
			Thread.sleep(3000);
			WebElement frequencyarrow = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", frequencyarrow);
			Thread.sleep(3000);
			WebElement selectOption=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Weekly']"));
			js.executeScript("arguments[0].click()", selectOption);
			Thread.sleep(3000);
			WebElement duration=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", duration);
			Thread.sleep(3000);
			WebElement selectDuration=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='This week so far']"));
			js.executeScript("arguments[0].click()", selectDuration);
			Thread.sleep(3000);
			WebElement scheduleDay=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", scheduleDay);
			Thread.sleep(3000);
			WebElement selectDay=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Friday']"));
			js.executeScript("arguments[0].click()", selectDay);
			Thread.sleep(3000);
			WebElement scheduleTime=driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[3]"));
			js.executeScript("arguments[0].click()", scheduleTime);
			Thread.sleep(3000);
			WebElement selectTime=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='07:00 PM']"));
			js.executeScript("arguments[0].click()", selectTime);
			Thread.sleep(3000);
			
			WebElement nextButton = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);
			WebElement nextButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
