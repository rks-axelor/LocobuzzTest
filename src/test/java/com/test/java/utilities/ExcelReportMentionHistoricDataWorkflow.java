package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExcelReportMentionHistoricDataWorkflow {
	
	public static List<String> componentsInformation = new ArrayList<String>();
	
	public static void excelReportMentionHistoricDataTemplateWorkflow(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

//Excel report
			WebElement excelReportLogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'table_chart')]"));
			js.executeScript("arguments[0].scrollIntoView()", excelReportLogo);
			WebElement excelReport = driver.findElement(By.xpath("//span[contains(text(),' Export Data')]"));
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[11]"));
			if (excelReportLogo.isDisplayed() && excelReport.isDisplayed() && pushpin.isDisplayed()) {
				System.out.println("Excel report logo and label are displayed");
			} else {
				System.out.println("Excel report logo and label are not displayed");
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

//section names
			WebElement sectionName = driver.findElement(By.xpath("//a[contains(text(),'Mention')]"));
			js.executeScript("arguments[0].click()", sectionName);
			Thread.sleep(3000);
			
			WebElement historicTemplate=driver.findElement(By.xpath("//h3[contains(text(),'Historic Data')]"));
			js.executeScript("arguments[0].click()", historicTemplate);
			Thread.sleep(3000);
			
//search the brand
			WebElement search = driver.findElement(By.xpath("//input[@data-placeholder='Search Brands']"));
			search.sendKeys("alerttesting");
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
			Thread.sleep(3000);
			
			editProcess(driver);
			
			WebElement generateNow=driver.findElement(By.xpath("//span[@class='mat-radio-label-content' and text()='Generate Now ']"));
			js.executeScript("arguments[0].click()", generateNow);
			Thread.sleep(2000);
			
			WebElement duration=driver.findElement(By.xpath("//mat-icon[contains(text(),'date_range')]"));
			js.executeScript("arguments[0].click()", duration);
			Thread.sleep(3000);
			
			WebElement selectDay=driver.findElement(By.xpath("(//button[@type='button' and text()='Last 7 Days'])[1]"));
			js.executeScript("arguments[0].click()", selectDay);
			Thread.sleep(3000);
			
			WebElement done=driver.findElement(By.xpath("(//button[@type='button' and text()='Done'])[1]"));
			js.executeScript("arguments[0].click()", selectDay);
			Thread.sleep(3000);
			
			WebElement nextButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);
			
			WebElement nextButton2 = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton2);
			Thread.sleep(3000);
			
			WebElement generateReport=driver.findElement(By.xpath("(//span[contains(text(),'Generate Now')])"));
			js.executeScript("arguments[0].click()", generateReport);
			Thread.sleep(5000);
			
//search
			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search2.sendKeys("template17");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(6000);

//names of fields
			WebElement field = driver.findElement(By.xpath("//div[contains(text(),'Brands ')]"));
			WebElement field1 = driver.findElement(By.xpath("//div[contains(text(),'Report Name ')]"));
			WebElement field2 = driver.findElement(By.xpath("//div[contains(text(),'Duration ')]"));
			WebElement field3 = driver.findElement(By.xpath("//div[contains(text(),'Applied filters ')]"));
			WebElement field4 = driver.findElement(By.xpath("//div[contains(text(),'Generated On/Scheduled On ')]"));
			WebElement field5 = driver.findElement(By.xpath("//th[contains(text(),'Actions ')]"));
			WebElement field6=driver.findElement(By.xpath("//div[contains(text(),'Report Type ')]"));
			if (field.isDisplayed() && field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed()
					&& field4.isDisplayed() && field5.isDisplayed()&&field6.isDisplayed()) {
				System.out.println("All fields are displayed");
			} else {
				System.out.println("All fields are not  displayed");
			}
			
			TimeUnit.MINUTES.sleep(5);
			driver.navigate().refresh();
			Thread.sleep(5000);

			reportHistory(driver);
			
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

			

			
		}
		catch(Exception e) {
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
			WebElement fromElement=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drag_indicator')])[2]"));
			WebElement toElement=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drag_indicator')])[3]"));
			
			Actions builder=new Actions(driver);
			
			Action dragAndDrop=builder.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();
			dragAndDrop.perform();
			
//search
			WebElement search1 = driver.findElement(By.xpath(
					"//input[contains(@class,'mat-input-element mat-form-field-autofill-control material-icons-outlined')]"));
			search1.sendKeys("mentionid");
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
			templateName.sendKeys("template17");
			WebElement saveButton2 = driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton2);
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
	
	public static void reportHistory(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//report history tab
			WebElement reportHistoryTabLogo = driver
					.findElement(By.xpath("//img[@src='assets/images/common/History.svg']"));
			WebElement reportHistoryTab = driver
					.findElement(By.xpath("(//span[contains(text(),'Report History')])[1]"));
			if (reportHistoryTabLogo.isDisplayed() && reportHistoryTab.isDisplayed()) {
				System.out.println("Report History tab is displayed");
			} else {
				System.out.println("Report History tab is not displayed");
			}
			js.executeScript("arguments[0].click()", reportHistoryTab);
			Thread.sleep(3000);
			
//search
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search1.sendKeys("template17");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

//names of fields
			WebElement field = driver.findElement(By.xpath("//th[contains(text(),'Generated On ')]"));
			//WebElement field1 = driver.findElement(By.xpath("//th[contains(text(),'Generated In ')]"));
			WebElement field2 = driver.findElement(By.xpath("//th[contains(text(),'Report Name ')]"));
			WebElement field3 = driver.findElement(By.xpath("//th[contains(text(),'Brands ')]"));
			WebElement field4 = driver.findElement(By.xpath("//th[contains(text(),'Generated By ')]"));
			WebElement field5 = driver.findElement(By.xpath("//th[contains(text(),'Actions ')]"));
			if (field.isDisplayed() &&  field2.isDisplayed() && field3.isDisplayed()
					&& field4.isDisplayed() && field5.isDisplayed()) {
				System.out.println("All fields are displayed");
			} else {
				System.out.println("All fields are not  displayed");
			}
			
//download report
			//WebElement download=driver.findElement(By.xpath("//mat-icon[contains(text(),' download ')]"));
			//download.click();
			//Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
