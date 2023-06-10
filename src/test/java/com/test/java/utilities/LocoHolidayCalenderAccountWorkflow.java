package com.test.java.utilities;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocoHolidayCalenderAccountWorkflow {
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

			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_more')])[1]"));
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

	

	public static void HolidayCalendarAccountWorkflow(WebDriver driver) throws Exception {
try {
			
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//  Adv. Response Management 
			WebElement Management=driver.findElement(By.xpath("(//mat-panel-title[contains(text(),' Adv. Response Management ')])[1]"));
			if (Management.isDisplayed()) {
			System.out.println(" Adv. Response Management is displayed");
			} else {
			System.out.println(" Adv. Response Management is not displayed");
			}
			js.executeScript("arguments[0].click()", Management);
			Thread.sleep(3000);

//Holiday Calender Label and Logo
			
			WebElement HolidayCaledndelabel = driver.findElement(By.xpath("(//span[contains(text(),'Holiday Calendar')])[1]"));
			WebElement Holidaycalenderlogo = driver
			.findElement(By.xpath("//img[@src='assets/account/menu/Agent_Queue_Management.svg']"));			
			if (HolidayCaledndelabel.isDisplayed() && Holidaycalenderlogo.isDisplayed()) {
			System.out.println("Holiday Calender Label and Logo Field is displayed");
			} else {
			System.out.println("Holiday Calender Label and Logo Field  is not displayed");
			}
			js.executeScript("arguments[0].click()", HolidayCaledndelabel);
			Thread.sleep(3000);
			

//Working Days and Hours tab(Holiday calender tab1)
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement Holidaycaltab1 = driver
			.findElement(By.xpath("(//span[contains(text(),'Working Days And Hours')])[1]"));
			if (pushpin.isDisplayed() && Holidaycaltab1.isDisplayed()) {
			System.out.println("Working Days and Hours tab(Holiday calender tab1) is displayed");
			} else {
			System.out.println("Working Days and Hours tab(Holiday calender tab1) is not displayed");
			}
			Thread.sleep(3000);
			
//Set Time Zone and Working Hours Heading and  information
			WebElement TimezoneHeading = driver.findElement(By.xpath("//p[contains(text(),'Set Time Zone and Working Hours')]"));
			WebElement information = driver.findElement(By.xpath("//p[contains(text(),'Set Time Zone and Working Hours')]//following::P[1]"));
			if (TimezoneHeading.isDisplayed() && information.isDisplayed()) {
			System.out.println("Set Time Zone and Working Hours Heading and  information is displayed");
			} else {
			System.out.println("Agent Queue Management Heading and  information is not displayed");
			}
			Thread.sleep(5000);
			
//select Brand
			WebElement selectbrandtxbxlabel = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[1]"));
			WebElement drpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			WebElement SelectBrandTxbx = driver.findElement(By.xpath(("(//div[contains(@class,'mat-select-trigger')])[1]")));
            if (selectbrandtxbxlabel.isDisplayed() && drpdwn.isDisplayed() && SelectBrandTxbx.isDisplayed()) {
			System.out.println("select Brand field is displayed");
			} else {
			System.out.println("select Brand field is not displayed");
			}
			Thread.sleep(5000);
//Select Auto Demo Brand	
			WebElement Brandlist = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[1]"));
			js.executeScript("arguments[0].click()",Brandlist );
			Thread.sleep(1000);
			WebElement AutoDemo = driver.findElement(By.xpath("(//span[contains(text(),'Auto Demo')])[1]"));
			js.executeScript("arguments[0].click()",AutoDemo );
			Thread.sleep(5000);
			WebElement Mondayuncheck1 = driver.findElement(By.xpath("(//span[contains(text(),'Mon')])[1]"));
			js.executeScript("arguments[0].click()", Mondayuncheck1);
			Thread.sleep(1000);
			WebElement Mondayuncheck2 = driver.findElement(By.xpath("(//span[contains(text(),'Mon')])[2]"));
			js.executeScript("arguments[0].click()", Mondayuncheck2);
			Thread.sleep(1000);
			WebElement Mondayuncheck3 = driver.findElement(By.xpath("(//span[contains(text(),'Mon')])[3]"));
			js.executeScript("arguments[0].click()", Mondayuncheck3);
			Thread.sleep(1000);
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
			}else {
			System.out.println("Agent Working Days & Hours Field is not displayed");
			}
			js.executeScript("arguments[0].click()", AgentSetTimezonedrpdwn);
			Thread.sleep(3000);
			WebElement AsiaKolkata = driver.findElement(By.xpath("(//span[contains(text(),'(GMT+05:30) Asia/Kolkata')])[4]"));
			js.executeScript("arguments[0].click()", AsiaKolkata);
			Thread.sleep(3000);
			/*WebElement CSDSetTimezonenote = driver.findElement(By.xpath("(//span[contains(text(),'Set same working time frame for all selected days')])[2]"));
			js.executeScript("arguments[0].click()", CSDSetTimezonenote);
			Thread.sleep(3000);
			WebElement SameasAgent = driver.findElement(By.xpath("(//span[contains(text(),'Set same as agent ')])[2]"));
			js.executeScript("arguments[0].click()", SameasAgent);
			Thread.sleep(3000);
			WebElement SameasAgent1 = driver.findElement(By.xpath("(//span[contains(text(),'Set same as agent ')])[1]"));
			js.executeScript("arguments[0].click()", SameasAgent1);
			Thread.sleep(3000);*/
//Select Agent Working Day
			WebElement Monday = driver.findElement(By.xpath("(//span[contains(text(),'Mon')])[1]"));
			js.executeScript("arguments[0].click()", Monday);
			Thread.sleep(3000);
			WebElement Tuesday = driver.findElement(By.xpath("(//span[contains(text(),'Tue')])[1]"));
			js.executeScript("arguments[0].click()", Tuesday);
			Thread.sleep(3000);
			WebElement Wed = driver.findElement(By.xpath("(//span[contains(text(),'Wed')])[1]"));
			js.executeScript("arguments[0].click()", Wed);
			Thread.sleep(3000);
			WebElement Thurs = driver.findElement(By.xpath("(//span[contains(text(),'Thu')])[1]"));
			js.executeScript("arguments[0].click()", Thurs);
			Thread.sleep(3000);
			WebElement Fri = driver.findElement(By.xpath("(//span[contains(text(),'Fri')])[1]"));
			js.executeScript("arguments[0].click()", Fri);
			Thread.sleep(3000);
			
//CSD Working Days & Hours Field
			WebElement CSDHeading = driver.findElement(By.xpath("//p[contains(text(),'CSD Working Days & Hours')]"));
			WebElement CSDSetTimezonetxbx = driver.findElement(By.xpath("(//mat-label[contains(text(),'Set Timezone')])[2]"));
			WebElement CSDSetTimezonedrpdwn = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			WebElement CSDSetTimezonenote2 = driver.findElement(By.xpath("(//span[contains(text(),'Set same working time frame for all selected days')])[2]"));
			WebElement CSDSetTimezonenotechbx = driver.findElement(By.xpath("(//span[contains(@class,'mat-checkbox-inner-container')])[17]"));
			WebElement CSDSetTimezonenoteinfo = driver.findElement(By.xpath("(//span[contains(text(),'Note:')])[2]"));
			if (CSDHeading.isDisplayed() && CSDSetTimezonetxbx.isDisplayed() && CSDSetTimezonedrpdwn.isDisplayed() &&
			CSDSetTimezonenote2.isDisplayed() && CSDSetTimezonenotechbx.isDisplayed() && CSDSetTimezonenoteinfo.isDisplayed()) {
			System.out.println("CSD Working Days & Hours Field is displayed");
			}else {
			System.out.println("CSD Working Days & Hours Field is not displayed");
			}
			Thread.sleep(5000);
			WebElement SameasAgentCSD = driver.findElement(By.xpath("(//span[contains(text(),'Set same as agent ')])[1]"));
			js.executeScript("arguments[0].click()", SameasAgentCSD);
			Thread.sleep(3000);
			
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
			}else {
			System.out.println("Brand Working Days & Hours Field is not displayed");
			}
			Thread.sleep(5000);
			WebElement Sunday = driver.findElement(By.xpath("(//span[contains(text(),'Sat')])[3]"));
			js.executeScript("arguments[0].click()", Sunday);
			Thread.sleep(3000);
			WebElement Saturday = driver.findElement(By.xpath("(//span[contains(text(),'Sun')])[3]"));
			js.executeScript("arguments[0].click()", Saturday);
			Thread.sleep(2000);
			WebElement Friday = driver.findElement(By.xpath("(//span[contains(text(),'Fri')])[3]"));
			js.executeScript("arguments[0].click()", Friday);
			Thread.sleep(5000);
			WebElement sundayintime = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[21]"));
			js.executeScript("arguments[0].click()", sundayintime);
			Thread.sleep(2000);
			WebElement sundayintime1 = driver.findElement(By.xpath("(//span[contains(text(),' 07:00 AM ')])[1]"));
			js.executeScript("arguments[0].click()", sundayintime1);
			Thread.sleep(2000);
			WebElement sundayouttime = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[22]"));
			js.executeScript("arguments[0].click()", sundayouttime);
			Thread.sleep(2000);
			WebElement sundayintime2 = driver.findElement(By.xpath("(//span[contains(text(),' 07:00 PM ')])[1]"));
			js.executeScript("arguments[0].click()", sundayintime2);
			Thread.sleep(2000);
			WebElement BrandSetTimezonenote1 = driver.findElement(By.xpath("(//span[contains(text(),'Set same working time frame for all selected days')])[3]"));
			js.executeScript("arguments[0].click()", BrandSetTimezonenote1);
			Thread.sleep(3000);
//Set Timeframe of Working days
			WebElement mondaytime = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[1]"));
			js.executeScript("arguments[0].click()", mondaytime);
			Thread.sleep(5000);
			WebElement Mondayintime1 = driver.findElement(By.xpath("(//span[contains(text(),' 09:30 AM ')])[1]"));
			js.executeScript("arguments[0].click()", Mondayintime1);
			Thread.sleep(2000);
			WebElement mondayouttime = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[2]"));
			js.executeScript("arguments[0].click()", mondayouttime);
			Thread.sleep(5000);
			WebElement Mondayouttime1 = driver.findElement(By.xpath("(//span[contains(text(),' 06:30 PM ')])[1]"));
			js.executeScript("arguments[0].click()", Mondayouttime1);
			Thread.sleep(2000);
			WebElement AgentSetTimezonenote1 = driver.findElement(By.xpath("(//span[contains(text(),'Set same working time frame for all selected days')])[1]"));
			js.executeScript("arguments[0].click()", AgentSetTimezonenote1);
			Thread.sleep(3000);
//Save Settings	
			WebElement SaveSettings = driver.findElement(By.xpath("(//span[contains(text(),'Save Settings')])"));
			js.executeScript("arguments[0].click()", SaveSettings);
			Thread.sleep(5000);
			
//Holiday Calender Tab2			
			WebElement pushpin2 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[2]"));
			WebElement Holidaycaltab2 = driver
			.findElement(By.xpath("(//span[contains(text(),'Holiday Calendar')])[2]"));
			if (pushpin2.isDisplayed() && Holidaycaltab2.isDisplayed()) {
			System.out.println("Holiday Calender Tab2 is displayed");
			} else {
			System.out.println("Holiday Calender Tab2 is not displayed");
			}
			js.executeScript("arguments[0].click()",Holidaycaltab2 );
			Thread.sleep(5000);

//Holiday Calendar Heading and Its Information
			WebElement HolidayHeading = driver.findElement(By.xpath("//p[contains(text(),'Holiday Calendar')]"));
			WebElement information2 = driver.findElement(By.xpath("//p[contains(text(),'Holiday Calendar')]//following::P[1]"));
			if (HolidayHeading.isDisplayed() && information2.isDisplayed()) {
			System.out.println("Holiday Calendar Heading and Its Information is displayed");
			} else {
			System.out.println("Holiday Calendar Heading and Its Information is not displayed");
			}
			Thread.sleep(5000);
			
//select Brand
			WebElement selectbrandtxbxlabel1 = driver.findElement(By.xpath("(//mat-label[contains(text(),'Select Brand')])[2]"));
			WebElement drpdwn1 = driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			WebElement SelectBrandTxbx1 = driver.findElement(By.xpath(("(//div[contains(@class,'mat-select-trigger')])[2]")));

			if (selectbrandtxbxlabel1.isDisplayed() && drpdwn1.isDisplayed() && SelectBrandTxbx1.isDisplayed()) {
			System.out.println("select Brand field is displayed");
			} else {
			System.out.println("select Brand field is not displayed");
			}
			Thread.sleep(5000);
			
//User role names
			WebElement UserroleAgent = driver.findElement(By.xpath("//div[contains(text(),'Agent')]"));
			WebElement UserroleCSD = driver.findElement(By.xpath("//div[contains(text(),'CSD')]"));
			WebElement UserroleBrand = driver.findElement(By.xpath("//div[contains(text(),'Brand')]"));
			if (UserroleAgent.isDisplayed() && UserroleCSD.isDisplayed() && UserroleBrand.isDisplayed()) {
			System.out.println("All User role names are displayed");
			} else {
			System.out.println("All User role names are not displayed");
			}
			Thread.sleep(5000);
			
//Holidays For Year Heading and Its Information
			WebElement UserroleBrand1 = driver.findElement(By.xpath("//div[contains(text(),'Brand')]"));
			js.executeScript("arguments[0].click()",UserroleBrand1 );
			Thread.sleep(5000);
			WebElement Heading = driver.findElement(By.xpath("//p[contains(text(),'Holidays for year, ')] "));
			WebElement Information = driver.findElement(By.xpath("//p[contains(text(),'Holidays for year, ')]//following::p[1]"));
			if (Heading.isDisplayed() && Information.isDisplayed()) {
			System.out.println("Holidays For Year Heading and Its Information field is displayed");
			} else {
			System.out.println("Holidays For Year Heading and Its Information field is not displayed");
			}
			Thread.sleep(10000);

//Calendar Field
			WebElement Calendarlabel = driver.findElement(By.xpath("//p[contains(text(),'Calendar:')]"));
			WebElement Calendarlink = driver.findElement(By.xpath("//span[contains(text(),'LocoBuzz Holiday Calendar')]"));
			WebElement Refreshicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]"));
			WebElement Deleteicon = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]"));
			//WebElement NoEvent = driver.findElement(By.xpath("//div[contains(@class,'grid__noresultfound ng-star-inserted')]"));
			if (Calendarlabel.isDisplayed() && Calendarlink.isDisplayed() && Refreshicon.isDisplayed() && Deleteicon.isDisplayed()) {
			System.out.println("Calendar Field is displayed");
			} else {
			System.out.println("Calendar Field is not displayed");
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
			} else {
			System.out.println("Clear All Button is not Present");
			}
			Thread.sleep(5000);
			
//Connect Via Google Calendar Field	
			WebElement UserroAgent1 = driver.findElement(By.xpath("//div[contains(text(),'CSD')]"));
			js.executeScript("arguments[0].click()",UserroAgent1 );
			Thread.sleep(5000);
			//WebElement Connect = driver.findElement(By.xpath("//span[contains(text(),'Connect via Google Calendar')]"));
			//js.executeScript("arguments[0].click()", Connect);
			Thread.sleep(3000);
			WebElement ConnectviaGoogle = driver.findElement(By.xpath("//div[contains(@class,'holical__nodatafound position-absolute ng-star-inserted')]"));
			if (ConnectviaGoogle.isDisplayed()) {
			System.out.println("Connect Via Google Calendar Field is Present");
			} else {
			System.out.println("Connect Via Google Calendar Field is not Present");
			}
			Thread.sleep(5000);
			//js.executeScript("arguments[0].click()", Connect);
			String parentWindowHandle = driver.getWindowHandle();
			System.out.println("Parent window handle - "+parentWindowHandle + driver.getTitle());
			driver.findElement(By.xpath("//span[contains(text(),'Connect via Google Calendar')]")).click();
			Thread.sleep(10000);
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			Thread.sleep(5000);
			for (String windowHandle : windowHandles) {
			Thread.sleep(3000);
			if(!windowHandle.equals(parentWindowHandle)) {
			driver.switchTo().window(windowHandle);
				//driver.findElement(By.xpath("//div[contains(text(),'Email or phone')]")).sendKeys("komal.mali@locobuzz.com");
			Thread.sleep(3000);
			WebElement addemail = driver.findElement(By.xpath("//input[@type='email']"));
			js.executeScript("arguments[0].click()",addemail );
			Thread.sleep(5000);
			addemail.sendKeys("komal.mali@locobuzz.com");
			Thread.sleep(5000);
			WebElement selectacc = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()",selectacc );
			Thread.sleep(5000);
			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			js.executeScript("arguments[0].click()",password );
			//Thread.sleep(5000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(password, "Locobuzz@123").build();
		    action.perform();
		    Thread.sleep(5000);
		    WebElement next2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()",next2 );
	        Thread.sleep(50000);
			WebElement next3 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			js.executeScript("arguments[0].click()",next3 );
			Thread.sleep(50000);
			WebElement advanced = driver.findElement(By.xpath("(//a[contains(text(),'Advanced')])"));
			js.executeScript("arguments[0].click()",advanced );
			Thread.sleep(5000);
			WebElement gotolocobuzz = driver.findElement(By.xpath("(//a[contains(text(),'Go to locobuzz.com (unsafe)')])"));
			js.executeScript("arguments[0].click()",gotolocobuzz );
			Thread.sleep(5000);
			WebElement allow = driver.findElement(By.xpath("(//span[contains(text(),'Allow')])"));
			js.executeScript("arguments[0].click()",allow );
			Thread.sleep(5000);
	        Thread.sleep(2000);		       
			}
			}
					
			driver.switchTo().window(parentWindowHandle);
						
			Thread.sleep(5000);
			WebElement Refreshiconagent = driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]"));
			js.executeScript("arguments[0].click()",Refreshiconagent );
			Thread.sleep(50000);
			WebElement Deleteiconagent = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]"));
			js.executeScript("arguments[0].click()",Deleteiconagent );
			Thread.sleep(5000);
			WebElement Deleteiconagentconfirm = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
			js.executeScript("arguments[0].click()",Deleteiconagentconfirm );
			Thread.sleep(5000);
			Thread.sleep(5000);
			WebElement pushpin1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[1]"));
			WebElement Holidaycaltab11 = driver
			.findElement(By.xpath("(//span[contains(text(),'Working Days And Hours')])[1]"));
			if (pushpin1.isDisplayed() && Holidaycaltab11.isDisplayed()) {
			System.out.println("Working Days and Hours tab(Holiday calender tab1) is displayed");
			} else {
			System.out.println("Working Days and Hours tab(Holiday calender tab1) is not displayed");
			}
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()",pushpin1 );
			Thread.sleep(5000);
			WebElement Monday1 = driver.findElement(By.xpath("(//span[contains(text(),'Mon')])[1]"));
			js.executeScript("arguments[0].click()", Monday1);
			Thread.sleep(3000);
			WebElement Tuesday1 = driver.findElement(By.xpath("(//span[contains(text(),'Tue')])[1]"));
			js.executeScript("arguments[0].click()", Tuesday1);
			Thread.sleep(3000);
			WebElement Wed1 = driver.findElement(By.xpath("(//span[contains(text(),'Wed')])[1]"));
			js.executeScript("arguments[0].click()", Wed1);
			Thread.sleep(3000);
			WebElement Thurs1 = driver.findElement(By.xpath("(//span[contains(text(),'Thu')])[1]"));
			js.executeScript("arguments[0].click()", Thurs1);
			Thread.sleep(3000);
			WebElement Fri1 = driver.findElement(By.xpath("(//span[contains(text(),'Fri')])[1]"));
			js.executeScript("arguments[0].click()", Fri1);
			Thread.sleep(3000);
			WebElement Fri2 = driver.findElement(By.xpath("(//span[contains(text(),'Fri')])[3]"));
			js.executeScript("arguments[0].click()", Fri2);
			Thread.sleep(3000);
			WebElement sun = driver.findElement(By.xpath("(//span[contains(text(),'Sun')])[3]"));
			js.executeScript("arguments[0].click()", sun);
			Thread.sleep(3000);
			WebElement sat = driver.findElement(By.xpath("(//span[contains(text(),'Sat')])[3]"));
			js.executeScript("arguments[0].click()", sat);
			Thread.sleep(3000);
			WebElement CSDsettings = driver.findElement(By.xpath("(//span[contains(text(),'Set same as agent ')])[1]"));
			js.executeScript("arguments[0].click()", CSDsettings);
			Thread.sleep(3000);
			WebElement SaveSettings3 = driver.findElement(By.xpath("(//span[contains(text(),'Save Settings')])"));
			js.executeScript("arguments[0].click()", SaveSettings3);
			Thread.sleep(5000);
			WebElement Mondaycheck1 = driver.findElement(By.xpath("(//span[contains(text(),'Mon')])[1]"));
			js.executeScript("arguments[0].click()", Mondaycheck1);
			Thread.sleep(3000);
			WebElement Mondaycheck2 = driver.findElement(By.xpath("(//span[contains(text(),'Mon')])[2]"));
			js.executeScript("arguments[0].click()", Mondaycheck2);
			Thread.sleep(3000);
			WebElement Mondaycheck3 = driver.findElement(By.xpath("(//span[contains(text(),'Mon')])[3]"));
			js.executeScript("arguments[0].click()", Mondaycheck3);
			Thread.sleep(3000);
			WebElement mondaytimeLast = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[1]"));
			js.executeScript("arguments[0].click()", mondaytimeLast);
			Thread.sleep(5000);
			WebElement Mondayintime1last = driver.findElement(By.xpath("(//span[contains(text(),'24 Hours')])[1]"));
			js.executeScript("arguments[0].click()", Mondayintime1last);
			Thread.sleep(2000);
			WebElement mondaytimeLastCSD = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[2]"));
			js.executeScript("arguments[0].click()", mondaytimeLastCSD);
			Thread.sleep(5000);
			WebElement Mondayintime1lastCSD = driver.findElement(By.xpath("(//span[contains(text(),'24 Hours')])[1]"));
			js.executeScript("arguments[0].click()", Mondayintime1lastCSD);
			Thread.sleep(2000);
			WebElement mondaytimeLastBrand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'schedule')])[3]"));
			js.executeScript("arguments[0].click()", mondaytimeLastBrand);
			Thread.sleep(5000);
			WebElement Mondayintime1lastBrand = driver.findElement(By.xpath("(//span[contains(text(),'24 Hours')])[1]"));
			js.executeScript("arguments[0].click()", Mondayintime1lastBrand);
			Thread.sleep(2000);
			WebElement SaveSettings2 = driver.findElement(By.xpath("(//span[contains(text(),'Save Settings')])"));
			js.executeScript("arguments[0].click()", SaveSettings2);
			Thread.sleep(5000);
			WebElement arrowBack = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
} catch (Exception e) {
			e.printStackTrace();
			throw e;
}
}
}


