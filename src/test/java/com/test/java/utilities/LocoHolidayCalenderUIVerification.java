package com.test.java.utilities;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoHolidayCalenderUIVerification {
public static List<String> componentsInformation = new ArrayList<String>();

public static void goingAccountSession(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//img[@src='assets/images/Locobuzz_Symbol.svg']"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

			WebElement expand = driver.findElement(By.xpath("//mat-icon[contains(text(),'expand_less')]"));
			js.executeScript("arguments[0].click()", expand);

//account session Button
			WebElement accountSession = driver.findElement(By.xpath("//span[contains(text(),'Accounts')]"));
			js.executeScript("arguments[0].click()", accountSession);
			Thread.sleep(3000);
			
}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
}
}

	

	public static void VerifyingHolidayUIComponents(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//  Adv. Response Management 
			WebElement Management=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),' Adv. Response Management ')])[1]"));
			if (Management.isDisplayed()) {
			System.out.println(" Adv. Response Management is displayed");
			componentsInformation.add(0, "Present");
			} else {
			System.out.println(" Adv. Response Management is not displayed");
			componentsInformation.add(0, "Not Present");
			}
			js.executeScript("arguments[0].click()", Management);
			Thread.sleep(3000);

//Holiday Calender Label and Logo
			
			WebElement HolidayCaledndelabel = driver.findElement(By.xpath("(//span[contains(text(),'Holiday Calendar')])[1]"));
			WebElement Holidaycalenderlogo = driver
			.findElement(By.xpath("//img[@src='assets/account/menu/Agent_Queue_Management.svg']"));			
			if (HolidayCaledndelabel.isDisplayed() && Holidaycalenderlogo.isDisplayed()) {
			System.out.println("Holiday Calender Label and Logo Field is displayed");
			componentsInformation.add(1, "Present");
			} else {
			System.out.println("Holiday Calender Label and Logo Field  is not displayed");
			componentsInformation.add(1, "Not Present");
			}
			js.executeScript("arguments[0].click()", HolidayCaledndelabel);
			Thread.sleep(3000);
			

//Working Days and Hours tab(Holiday calender tab1)
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement Holidaycaltab1 = driver
			.findElement(By.xpath("(//span[contains(text(),'Working Days And Hours')])[1]"));
			if (pushpin.isDisplayed() && Holidaycaltab1.isDisplayed()) {
			System.out.println("Working Days and Hours tab(Holiday calender tab1) is displayed");
			componentsInformation.add(2, "Present");
			} else {
			System.out.println("Working Days and Hours tab(Holiday calender tab1) is not displayed");
			componentsInformation.add(2, "Not Present");
			}
			Thread.sleep(3000);
			
//Set Time Zone and Working Hours Heading and  information
			WebElement TimezoneHeading = driver.findElement(By.xpath("//p[contains(text(),'Set Time Zone and Working Hours')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(text(),'Set Time Zone and Working Hours')]//following::P[1]"));
			if (TimezoneHeading.isDisplayed() && information.isDisplayed()) {
			System.out.println("Set Time Zone and Working Hours Heading and  information is displayed");
			componentsInformation.add(3, "Present");
			} else {
			System.out.println("Agent Queue Management Heading and  information is not displayed");
			componentsInformation.add(3, "Not Present");
			}
			Thread.sleep(5000);
			
//select Brand
			WebElement selectbrandtxbxlabel = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[1]"));
			WebElement drpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			WebElement SelectBrandTxbx = driver.findElement(By.xpath(("(//div[contains(@class,'mat-select-trigger')])[1]")));

			if (selectbrandtxbxlabel.isDisplayed() && drpdwn.isDisplayed() && SelectBrandTxbx.isDisplayed()) {
			System.out.println("select Brand field is displayed");
			Thread.sleep(3000);
			componentsInformation.add(4, "Present");
			} else {
			System.out.println("select Brand field is not displayed");
			componentsInformation.add(4, "Not Present");
			}
			Thread.sleep(5000);
			
//Select Auto Demo Brand	
			/*WebElement Brandlist = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[1]"));
			js.executeScript("arguments[0].click()",Brandlist );
			Thread.sleep(1000);
			WebElement AutoDemo = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));
			js.executeScript("arguments[0].click()",AutoDemo );
			Thread.sleep(5000);*/
			
//Agent Working Days & Hours Field
			WebElement AgentHeading = driver.findElement(By.xpath("//p[contains(text(),'Agent Working Days & Hours')]"));
			WebElement AgentSetTimezonetxbx = driver.findElement(By.xpath("(//mat-label[contains(text(),'Set Timezone')])[1]"));
			WebElement AgentSetTimezonedrpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			WebElement AgentSetTimezonenote = driver.findElement(By.xpath("(//span[contains(text(),'Set same working time frame for all selected days')])[1]"));
			WebElement AgentSetTimezonenotechbx = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[8]"));
			WebElement AgentSetTimezonenoteinfo = driver.findElement(By.xpath("(//span[contains(text(),'Note:')])[1]"));
			if (AgentHeading.isDisplayed() && AgentSetTimezonetxbx.isDisplayed() && AgentSetTimezonedrpdwn.isDisplayed() &&
			AgentSetTimezonenote.isDisplayed() && AgentSetTimezonenotechbx.isDisplayed() && AgentSetTimezonenoteinfo.isDisplayed()) {
			System.out.println("Agent Working Days & Hours Field is displayed");
			componentsInformation.add(5, "Present");
			}else {
			System.out.println("Agent Working Days & Hours Field is not displayed");
			componentsInformation.add(5, "Not Present");
			}
			Thread.sleep(5000);
			
//CSD Working Days & Hours Field
			WebElement CSDHeading = driver.findElement(By.xpath("//p[contains(text(),'CSD Working Days & Hours')]"));
			WebElement CSDSetTimezonetxbx = driver.findElement(By.xpath("(//mat-label[contains(text(),'Set Timezone')])[2]"));
			WebElement CSDSetTimezonedrpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			WebElement CSDSetTimezonenote = driver.findElement(By.xpath("(//span[contains(text(),'Set same working time frame for all selected days')])[2]"));
			WebElement CSDSetTimezonenotechbx = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[17]"));
			WebElement CSDSetTimezonenoteinfo = driver.findElement(By.xpath("(//span[contains(text(),'Note:')])[2]"));
			if (CSDHeading.isDisplayed() && CSDSetTimezonetxbx.isDisplayed() && CSDSetTimezonedrpdwn.isDisplayed() &&
			CSDSetTimezonenote.isDisplayed() && CSDSetTimezonenotechbx.isDisplayed() && CSDSetTimezonenoteinfo.isDisplayed()) {
			System.out.println("CSD Working Days & Hours Field is displayed");
			componentsInformation.add(6, "Present");
			}else {
			System.out.println("CSD Working Days & Hours Field is not displayed");
			componentsInformation.add(6, "Not Present");
			}
			Thread.sleep(5000);
			
//Brand Working Days & Hours Field
			WebElement BrandHeading = driver.findElement(By.xpath("//p[contains(text(),'Brand Working Days & Hours')]"));
			WebElement BrandSetTimezonetxbx = driver.findElement(By.xpath("(//mat-label[contains(text(),'Set Timezone')])[3]"));
			WebElement BrandSetTimezonedrpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			WebElement BrandSetTimezonenote = driver.findElement(By.xpath("(//span[contains(text(),'Set same working time frame for all selected days')])[3]"));
			WebElement BrandSetTimezonenotechbx = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[26]"));
			WebElement BrandSetTimezonenoteinfo = driver.findElement(By.xpath("(//span[contains(text(),'Note:')])[3]"));
			if (BrandHeading.isDisplayed() && BrandSetTimezonetxbx.isDisplayed() && BrandSetTimezonedrpdwn.isDisplayed() &&
			BrandSetTimezonenote.isDisplayed() && BrandSetTimezonenotechbx.isDisplayed() && BrandSetTimezonenoteinfo.isDisplayed()) {
			System.out.println("Brand Working Days & Hours Field is displayed");
			componentsInformation.add(7, "Present");
			}else {
			System.out.println("Brand Working Days & Hours Field is not displayed");
			componentsInformation.add(7, "Not Present");
			}
			Thread.sleep(5000);
			
//Holiday Calender Tab2			
			WebElement pushpin2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement Holidaycaltab2 = driver
			.findElement(By.xpath("(//span[contains(text(),'Holiday Calendar')])[2]"));
			if (pushpin2.isDisplayed() && Holidaycaltab2.isDisplayed()) {
			System.out.println("Holiday Calender Tab2 is displayed");
			componentsInformation.add(8, "Present");
			} else {
			System.out.println("Holiday Calender Tab2 is not displayed");
			componentsInformation.add(8, "Not Present");
			}
			js.executeScript("arguments[0].click()",Holidaycaltab2 );
			Thread.sleep(5000);

//Holiday Calendar Heading and Its Information
			WebElement HolidayHeading = driver.findElement(By.xpath("//p[contains(text(),'Holiday Calendar')]"));
			WebElement information2 = driver.findElement(By.xpath("//p[contains(text(),'Holiday Calendar')]//following::P[1]"));
			if (HolidayHeading.isDisplayed() && information2.isDisplayed()) {
			System.out.println("Holiday Calendar Heading and Its Information is displayed");
			componentsInformation.add(9, "Present");
			} else {
			System.out.println("Holiday Calendar Heading and Its Information is not displayed");
			componentsInformation.add(9, "Not Present");
			}
			Thread.sleep(5000);
			
//select Brand
			WebElement selectbrandtxbxlabel1 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[2]"));
			WebElement drpdwn1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			WebElement SelectBrandTxbx1 = driver.findElement(By.xpath(("(//div[contains(@class,'mat-select-trigger')])[2]")));

			if (selectbrandtxbxlabel1.isDisplayed() && drpdwn1.isDisplayed() && SelectBrandTxbx1.isDisplayed()) {
			System.out.println("select Brand field is displayed");
			Thread.sleep(3000);
			componentsInformation.add(10, "Present");
			} else {
			System.out.println("select Brand field is not displayed");
			componentsInformation.add(10, "Not Present");
			}
			Thread.sleep(5000);
			
//Select Auto Demo Brand	
			WebElement Brandlist = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[2]"));
			js.executeScript("arguments[0].click()",Brandlist );
			Thread.sleep(1000);
			WebElement AutoDemo = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));
			js.executeScript("arguments[0].click()",AutoDemo );
			Thread.sleep(5000);
			
			
//User role names
			WebElement UserroleAgent = driver.findElement(By.xpath("//div[contains(text(),'Agent')]"));
			WebElement UserroleCSD = driver.findElement(By.xpath("//div[contains(text(),'CSD')]"));
			WebElement UserroleBrand = driver.findElement(By.xpath("//div[contains(text(),'Brand')]"));
			if (UserroleAgent.isDisplayed() && UserroleCSD.isDisplayed() && UserroleBrand.isDisplayed()) {
			System.out.println("All User role names are displayed");
			componentsInformation.add(11, "Present");
			} else {
			System.out.println("All User role names are not displayed");
			componentsInformation.add(11, "Not Present");
			}
			Thread.sleep(5000);
			
//Holidays For Year Heading and Its Information
			WebElement Heading = driver.findElement(By.xpath("//p[contains(text(),'Holidays for year, ')] "));
			WebElement Information = driver.findElement(By.xpath("//p[contains(text(),'Holidays for year, ')]//following::p[1]"));
			if (Heading.isDisplayed() && Information.isDisplayed()) {
			System.out.println("Holidays For Year Heading and Its Information field is displayed");
			componentsInformation.add(12, "Present");
			} else {
			System.out.println("Holidays For Year Heading and Its Information field is not displayed");
			componentsInformation.add(12, "Not Present");
			}
			Thread.sleep(5000);

//Calendar Field
			WebElement Calendarlabel = driver.findElement(By.xpath("//p[contains(text(),'Calendar:')]"));
			WebElement Calendarlink = driver.findElement(By.xpath("//span[contains(text(),'LocoBuzz Holiday Calendar')]"));
			WebElement Refreshicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]"));
			WebElement Deleteicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]"));
			WebElement NoEvent = driver.findElement(By.xpath("//div[contains(@class,'grid__noresultfound ng-star-inserted')]"));
			if (Calendarlabel.isDisplayed() && Calendarlink.isDisplayed() && Refreshicon.isDisplayed() && Deleteicon.isDisplayed()) {
			System.out.println("Calendar Field is displayed");
			componentsInformation.add(13, "Present");
			} else {
			System.out.println("Calendar Field is not displayed");
			componentsInformation.add(13, "Not Present");
			}
			Thread.sleep(5000);
			
//Annual Working and Leave Days
			WebElement AnnualLeaveHeading = driver.findElement(By.xpath("//div[contains(text(),'Annual Working & Leave Days')]"));
			WebElement ToHolidays = driver.findElement(By.xpath("//p[contains(text(),'Total holidays for')]"));
			WebElement ToWeekends = driver.findElement(By.xpath("//p[contains(text(),'Total weekends for')]"));
			WebElement ToWorking = driver.findElement(By.xpath("//p[contains(text(),'Annual leave for')]"));
			WebElement AnnualLeave = driver.findElement(By.xpath("//p[contains(text(),'Total working days for')]"));
			if (AnnualLeaveHeading.isDisplayed() && ToHolidays.isDisplayed() && ToWeekends.isDisplayed() 
			&& ToWorking.isDisplayed() && AnnualLeave.isDisplayed()) {
			System.out.println("Clear All Button is Present");
			componentsInformation.add(14, "Present");
			} else {
			System.out.println("Clear All Button is not Present");
			componentsInformation.add(14, "Not Present");
			}
			Thread.sleep(5000);
			
//Connect Via Google Calendar Field			
			WebElement Connect = driver.findElement(By.xpath("//div[contains(text(),'CSD')]"));
			js.executeScript("arguments[0].click()", Connect);
			Thread.sleep(3000);
			WebElement ConnectviaGoogle = driver.findElement(By.xpath("//div[contains(@class,'holical__nodatafound position-absolute ng-star-inserted')]"));
			if (ConnectviaGoogle.isDisplayed()) {
			System.out.println("Connect Via Google Calendar Field is Present");
			componentsInformation.add(15, "Present");
			} else {
			System.out.println("Connect Via Google Calendar Field is not Present");
			componentsInformation.add(15, "Not Present");
			}
			Thread.sleep(5000);
			
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);

			componentsInformation.add(16, CommonFunctions.getDataTime());
			CommonFunctions.writeUIComponentsToExcel(componentsInformation, "HolidayCalendarUIVerification");
} catch (Exception e) {
			e.printStackTrace();
			throw e;
}
}
}

