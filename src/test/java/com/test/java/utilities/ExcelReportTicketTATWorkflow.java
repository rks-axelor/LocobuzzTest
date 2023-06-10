package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExcelReportTicketTATWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void excelReportTicketTATTemplateWorkflow(WebDriver driver) throws Exception {
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

//section names
			WebElement sectionName = driver.findElement(By.xpath("//a[contains(text(),'Ticket')]"));
			js.executeScript("arguments[0].click()", sectionName);
			Thread.sleep(3000);

			WebElement ticketTatTemplate = driver.findElement(By.xpath("(//h3[contains(text(),'Ticket TAT')])[1]"));
			js.executeScript("arguments[0].click()", ticketTatTemplate);
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
			
			WebElement nextButton1=driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);
			
//generate now
			WebElement generateNow=driver.findElement(By.xpath("(//span[contains(text(),'Generate Now ')])"));
			js.executeScript("arguments[0].click()", generateNow);
			Thread.sleep(3000);
			WebElement arrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement selectTicketBasedOn=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Created Date']"));
			js.executeScript("arguments[0].click()", selectTicketBasedOn);
			Thread.sleep(3000);
			
			WebElement nextButton2=driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton2);
			Thread.sleep(3000);
			
			filterProcess(driver);
			
			WebElement nextButton3=driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton3);
			Thread.sleep(3000);
			
			WebElement generateButton = driver.findElement(By.xpath("(//span[contains(text(),'Generate Now')])"));
			js.executeScript("arguments[0].click()", generateButton);
			Thread.sleep(5000);
			
//search
			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search2.sendKeys("Ash template");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(6000);

//names of fields
			WebElement field = driver.findElement(By.xpath("//div[contains(text(),'Brands ')]"));
			WebElement field1 = driver.findElement(By.xpath("//div[contains(text(),'Report Name ')]"));
			WebElement field2 = driver.findElement(By.xpath("//div[contains(text(),'Duration ')]"));
			WebElement field3 = driver.findElement(By.xpath("//div[contains(text(),'Applied filters ')]"));
			WebElement field4 = driver.findElement(By.xpath("//div[contains(text(),'Frequency/Scheduled On ')]"));
			WebElement field5 = driver.findElement(By.xpath("//th[contains(text(),'Actions')]"));
			//WebElement field6=driver.findElement(By.xpath("//div[contains(text(),'Report Category ')]"));
			WebElement field7=driver.findElement(By.xpath("//div[contains(text(),'Scheduled By ')]"));
			if (field.isDisplayed() && field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed()
					&& field4.isDisplayed() && field5.isDisplayed()&&field7.isDisplayed()) {
				System.out.println("All fields are displayed");
			} else {
				System.out.println("All fields are not  displayed");
			}
			
			//Thread.sleep(60000);
			TimeUnit.MINUTES.sleep(2);
			//driver.navigate().refresh();
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
			
//search
			WebElement search1=driver.findElement(By.xpath("//input[contains(@class,'mat-input-element mat-form-field-autofill-control material-icons-outlined')]"));
			search1.sendKeys("source type");
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(2000);
			
			WebElement column=driver.findElement(By.xpath("(//span[contains(text(),'Source Type')])[1]"));
			js.executeScript("arguments[0].click()", column);
			Thread.sleep(2000);
			
			js.executeScript("arguments[0].click()", column);
			Thread.sleep(2000);
			
			
//download report
			WebElement downloadReport=driver.findElement(By.xpath("//span[contains(text(),' Download in Excel ')]"));
			js.executeScript("arguments[0].click()", downloadReport);
			Thread.sleep(2000);
			
//save
			WebElement saveAs=driver.findElement(By.xpath("//span[contains(text(),'Save as')]"));
			js.executeScript("arguments[0].click()", saveAs);
			Thread.sleep(2000);
			
			WebElement templateName=driver.findElement(By.xpath("//input[@type='string']"));
			templateName.sendKeys("Ash template");
			WebElement saveButton2 = driver.findElement(By.xpath("//span[contains(text(),' Save ')]"));
			js.executeScript("arguments[0].click()", saveButton2);
			Thread.sleep(3000);


		} catch (Exception e) {
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
			search1.sendKeys("Ash template");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

//names of fields
			WebElement field = driver.findElement(By.xpath("//th[contains(text(),'Generated On ')]"));
			WebElement field1 = driver.findElement(By.xpath("//th[contains(text(),'Duration ')]"));
			WebElement field2 = driver.findElement(By.xpath("//th[contains(text(),'Report Name ')]"));
			WebElement field3 = driver.findElement(By.xpath("//th[contains(text(),'Brands ')]"));
			WebElement field4 = driver.findElement(By.xpath("//th[contains(text(),'Generated By ')]"));
			WebElement field5 = driver.findElement(By.xpath("//th[contains(text(),'Actions ')]"));
			if (field.isDisplayed() && field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed()
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
	
	public static void filterProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//tickets and mentions
			WebElement ticketsMentions=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Tickets and mentions')]"));
			js.executeScript("arguments[0].click()", ticketsMentions);
			Thread.sleep(3000);
			WebElement priority=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[10]"));
			js.executeScript("arguments[0].click()", priority);
			Thread.sleep(3000);
			WebElement selectPriority=driver.findElement(By.xpath("(//span[@class='mat-option-text'])//div[contains(text(),'High')]"));
			js.executeScript("arguments[0].click()", selectPriority);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			WebElement sentiments=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[14]"));
			js.executeScript("arguments[0].click()", sentiments);
			Thread.sleep(3000);
			WebElement selectSentiment=driver.findElement(By.xpath("(//span[@class='mat-option-text'])//div[contains(text(),' Neutral')]"));
			js.executeScript("arguments[0].click()", selectSentiment);
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			
			WebElement ticketsMentions1=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Tickets and mentions')]"));
			js.executeScript("arguments[0].click()", ticketsMentions1);
			Thread.sleep(3000);
			
//others
			WebElement others=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Others')]"));
			js.executeScript("arguments[0].click()", others);
			Thread.sleep(3000);
			
			WebElement replyStatus=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[22]"));
			js.executeScript("arguments[0].click()", replyStatus);
			Thread.sleep(3000);
			WebElement selectReplyStatus=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Replied ']"));
			js.executeScript("arguments[0].click()", selectReplyStatus);
			Thread.sleep(3000);
			WebElement actionStatus=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-value')])[25]"));
			js.executeScript("arguments[0].click()", actionStatus);
			Thread.sleep(3000);
			WebElement selectActionStatus=driver.findElement(By.xpath("((//span[@class='mat-option-text'])//div[contains(text(),'Replied And Closed')])[1]"));
			js.executeScript("arguments[0].click()", selectActionStatus);
			Thread.sleep(3000);
			Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(Keys.ESCAPE).build();
			action2.perform();
			
			WebElement others1=driver.findElement(By.xpath("//mat-panel-title[contains(text(),'Others')]"));
			js.executeScript("arguments[0].click()", others1);
			Thread.sleep(3000);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
