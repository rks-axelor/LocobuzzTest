package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExcelReportEditTemplateWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void excelReportEditTemplateWorkflow(WebDriver driver) throws Exception {
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

//edit template
			WebElement editTemplate = driver.findElement(By
					.xpath("(//h3[contains(text(),'temp098')]//preceding::mat-icon[contains(text(),'more_vert')])[11]"));
			js.executeScript("arguments[0].scrollIntoView()", editTemplate);
			js.executeScript("arguments[0].click()", editTemplate);
			Thread.sleep(3000);
			WebElement editButton = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
			js.executeScript("arguments[0].click()", editButton);
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
			
//drag and drop
			WebElement fromElement=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drag_indicator')])[3]"));
			WebElement toElement=driver.findElement(By.xpath("(//mat-icon[contains(text(),'drag_indicator')])[4]"));
			
			Actions builder1=new Actions(driver);
			
			Action dragAndDrop=builder1.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build();
			dragAndDrop.perform();


			
//search
			WebElement search1=driver.findElement(By.xpath("//input[contains(@class,'mat-input-element mat-form-field-autofill-control material-icons-outlined')]"));
			search1.sendKeys("ticket");
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(2000);
			
//download report
			WebElement downloadReport=driver.findElement(By.xpath("//span[contains(text(),' Download in Excel ')]"));
			js.executeScript("arguments[0].click()", downloadReport);
			Thread.sleep(2000);
			
//save template
			WebElement saveTemplate = driver.findElement(By.xpath("//span[contains(text(),'Save Template')]"));
			js.executeScript("arguments[0].click()", saveTemplate);
			Thread.sleep(2000);
			WebElement saveAs=driver.findElement(By.xpath("//button[contains(text(),'Save as')]"));
			js.executeScript("arguments[0].click()", saveAs);
			Thread.sleep(2000);
			
//template name
			WebElement templateName = driver.findElement(By.xpath("//input[@type='string']"));
			templateName.sendKeys("temp527");
			WebElement saveButton2 = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			js.executeScript("arguments[0].click()", saveButton2);
			Thread.sleep(3000);
			
//search template name
			WebElement search2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", search2);
			Thread.sleep(3000);
			WebElement search3=driver.findElement(By.xpath("//input[@placeholder='Search Templates by name']"));
			search3.sendKeys("temp527");
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
//delete template
			WebElement actionButton=driver.findElement(By.xpath("(//h3[contains(text(),'temp527')]//preceding::mat-icon[contains(text(),'more_vert')])[11]"));
			js.executeScript("arguments[0].click()", actionButton);
			Thread.sleep(3000);
			WebElement deleteButton=driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
			js.executeScript("arguments[0].click()", deleteButton);
			Thread.sleep(3000);
			WebElement confirmDelete=driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", confirmDelete);
			Thread.sleep(3000);
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
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

}
