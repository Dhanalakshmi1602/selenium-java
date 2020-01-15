package day8.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import day9.classroom.annotation.ProjectSpeificMethods;

public class CreateLead extends ProjectSpeificMethods {

	@Test(dataProvider="getData")
	public  void createLead(String companyname, String Firstname, String lastname) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(companyname);
		driver.findElementById("createLeadForm_firstName").sendKeys(Firstname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("ammu");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("rahul");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Testleaf");
		/*driver.findElementById("createLeadForm_annualRevenue").sendKeys("100000");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Selenium");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("10");
		driver.findElementById("createLeadForm_sicCode").sendKeys("123");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$");
		driver.findElementById("createLeadForm_description").sendKeys("description");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important note");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("123");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1233456789");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("445");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Rahul");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("dhana@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("testleaf.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Rahul");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("mylapore");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("chennai");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("tamilnadu");
		driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600004");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("768");
		
*/		Select dropdown = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		dropdown.selectByIndex(3);
		
		Select dropdown1 = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		dropdown1.selectByValue("CATRQ_AUTOMOBILE");

		Select dropdown2 = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		dropdown2.selectByVisibleText("BRR - Brazil");

		Select dropdown3= new Select(driver.findElementById("createLeadForm_industryEnumId"));
		dropdown3.selectByIndex(7);
		

		Select dropdown5 = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		dropdown5.selectByIndex(3);

		Select dropdown4 = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		dropdown4.selectByValue("LEAD_EMPLOYEE");
		
		Select dropdown6 = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		dropdown6.selectByVisibleText("India");
		

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Select dropdown7 = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		dropdown7.selectByIndex(3);

		driver.findElementByClassName("smallSubmit").click();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
