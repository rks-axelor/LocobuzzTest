package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExcelReportUIComponents {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void excelReportUIComponents(WebDriver driver) throws Exception {
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
				componentsInformation.add(0, "Present");
			} else {
				System.out.println("Excel report  label are not displayed");
				componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", excelReport);
			Thread.sleep(3000);


//excel report tab
			WebElement excelReportTabLogo = driver
					.findElement(By.xpath("//img[@src='assets/images/common/Excel_Report.svg']"));
			WebElement excelReportTab = driver.findElement(By.xpath("//span[contains(text(),'Excel Report')]"));
			if (excelReportTabLogo.isDisplayed() && excelReportTab.isDisplayed()) {
				System.out.println("Excel report tab is displayed");
				componentsInformation.add(1, "Present");
			} else {
				System.out.println("Excel report tab is not displayed");
				componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", excelReportTab);
			Thread.sleep(3000);

//search field and credit
			WebElement searchField = driver.findElement(By.xpath("//div[@class='report__header--search-left']"));
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			WebElement creditInfo = driver.findElement(By.xpath("//p[@class='mr-12 font-weight-600']"));
			if (searchField.isDisplayed() && searchButton.isDisplayed() && creditInfo.isDisplayed()) {
				System.out.println("Search field and credit information are displayed");
				componentsInformation.add(2, "Present");
			} else {
				System.out.println("Search field and credit information are not displayed");
				componentsInformation.add(2, "Not Present");
			}

//filter button
			WebElement filterButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' filter_alt')]"));
			if (filterButton.isDisplayed()) {
				System.out.println("Filter button is displayed");
				componentsInformation.add(3, "Present");
			} else {
				System.out.println("Filter button is not  displayed");
				componentsInformation.add(3, "Not Present");
			}
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);

//filter fields
			WebElement field = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			WebElement field1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			WebElement field2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			WebElement arrow2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			//WebElement field3 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			//WebElement arrow3 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			if (field.isDisplayed() && arrow.isDisplayed() && field1.isDisplayed() && arrow1.isDisplayed()
					&& field2.isDisplayed() && arrow2.isDisplayed()) {
				System.out.println("All filter fields are  displayed");
				componentsInformation.add(4, "Present");
			} else {
				System.out.println("All filter fields are not displayed");
				componentsInformation.add(4, "Not Present");
			}

//cancel,save button
			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),' Apply ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (applyButton.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Apply and cancel buttons are displayed");
				componentsInformation.add(5, "Present");
			} else {
				System.out.println("Apply and cancel buttons are not displayed");
				componentsInformation.add(5, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);

//columns button
			WebElement columnButton = driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			if (columnButton.isDisplayed()) {
				System.out.println("Column button is displayed");
				componentsInformation.add(6, "Present");
			} else {
				System.out.println("Column button is not displayed");
				componentsInformation.add(6, "Not Present");
			}
			js.executeScript("arguments[0].click()", columnButton);
			Thread.sleep(3000);

//columns fields
			WebElement columnField = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[1]"));
			WebElement columnField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[2]"));
			WebElement columnField2 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[3]"));
			WebElement columnField3 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[4]"));
			WebElement columnField4 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[5]"));
			WebElement columnField5 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[6]"));
			if (columnField.isDisplayed() && columnField1.isDisplayed() && columnField2.isDisplayed()
					&& columnField3.isDisplayed() && columnField4.isDisplayed() && columnField5.isDisplayed()) {
				System.out.println("All Columns fields are displayed");
				componentsInformation.add(7, "Present");
			} else {
				System.out.println("All Columns fields are not displayed");
				componentsInformation.add(7, "Not Present");
			}

//columns button
			WebElement columnButton1 = driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			js.executeScript("arguments[0].click()", columnButton1);
			Thread.sleep(3000);

//generate report button
			WebElement generateButton = driver.findElement(By.xpath("//span[contains(text(),'Generate New Report')]"));
			if (generateButton.isDisplayed()) {
				System.out.println("Generate report button is displayed");
				componentsInformation.add(8, "Present");
			} else {
				System.out.println("Generate report button is not displayed");
				componentsInformation.add(8, "Not Present");
			}

			reportHistory(driver);
			
			componentsInformation.add(16, CommonFunctions.getDataTime());

			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "ExcelReportUIComponents");
			
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

	public static void reportHistory(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//reportHistory
			WebElement reportHistoryLogo = driver
					.findElement(By.xpath("//img[@src='assets/images/common/History.svg']"));
			WebElement reportHistory = driver.findElement(By.xpath("(//span[contains(text(),'Report History')])[1]"));
			if (reportHistoryLogo.isDisplayed() && reportHistory.isDisplayed()) {
				System.out.println("Report History tab is displayed");
				componentsInformation.add(9, "Present");
			} else {
				System.out.println("Report History tab is not displayed");
				componentsInformation.add(9, "Not Present");
			}
			js.executeScript("arguments[0].click()", reportHistory);
			Thread.sleep(3000);

//search field 
			WebElement searchField = driver.findElement(By.xpath("//div[@class='report__header--search-left']"));
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			if (searchField.isDisplayed() && searchButton.isDisplayed()) {
				System.out.println("Search field is displayed");
				componentsInformation.add(10, "Present");
			} else {
				System.out.println("Search field is not displayed");
				componentsInformation.add(10, "Not Present");
			}

// filter button
			WebElement filterButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' filter_alt')]"));
			if (filterButton.isDisplayed()) {
				System.out.println("Filter button is displayed");
				componentsInformation.add(11, "Present");
			} else {
				System.out.println("Filter button is not  displayed");
				componentsInformation.add(11, "Not Present");
			}
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);

//filter fields
			WebElement field = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[2]"));
			WebElement arrow = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			WebElement field1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[3]"));
			WebElement arrow1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			//WebElement field2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			//WebElement arrow2 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			if (field.isDisplayed() && arrow.isDisplayed() && field1.isDisplayed() && arrow1.isDisplayed() ) {
				System.out.println("All filter fields are  displayed");
				componentsInformation.add(12, "Present");
			} else {
				System.out.println("All filter fields are not displayed");
				componentsInformation.add(12, "Not Present");
			}

//cancel,save button
			WebElement applyButton = driver.findElement(By.xpath("//span[contains(text(),' Apply ')]"));
			WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
			if (applyButton.isDisplayed() && cancelButton.isDisplayed()) {
				System.out.println("Apply and cancel buttons are displayed");
				componentsInformation.add(13, "Present");
			} else {
				System.out.println("Apply and cancel buttons are not displayed");
				componentsInformation.add(13, "Not Present");
			}
			js.executeScript("arguments[0].click()", cancelButton);
			Thread.sleep(3000);
			
//columns button
			WebElement columnButton = driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			if (columnButton.isDisplayed()) {
				System.out.println("Column button is displayed");
				componentsInformation.add(14, "Present");
			} else {
				System.out.println("Column button is not displayed");
				componentsInformation.add(14, "Not Present");
			}
			js.executeScript("arguments[0].click()", columnButton);
			Thread.sleep(3000);

//columns fields
			WebElement columnField = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[1]"));
			WebElement columnField1 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[2]"));
			WebElement columnField2 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[3]"));
			WebElement columnField3 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[4]"));
			WebElement columnField4 = driver
					.findElement(By.xpath("(//div[contains(@class,'cdk-drag option__list--column')])[5]"));
			if (columnField.isDisplayed() && columnField1.isDisplayed() && columnField2.isDisplayed()
					&& columnField3.isDisplayed() && columnField4.isDisplayed()) {
				System.out.println("All Columns fields are displayed");
				componentsInformation.add(15, "Present");
			} else {
				System.out.println("All Columns fields are not displayed");
				componentsInformation.add(15, "Not Present");
			}

//columns button
			WebElement columnButton1 = driver.findElement(By.xpath("//div[contains(text(),' Columns ')]"));
			js.executeScript("arguments[0].click()", columnButton1);
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
