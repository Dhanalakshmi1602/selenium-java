package day8.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import day9.classroom.annotation.ProjectSpeificMethods;

public class DuplicateLeafTaps extends ProjectSpeificMethods {

	@Test
	public  void duplicateLead() {
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-tab-panel-header x-unselectable']//li)[2]").click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("123");
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("044");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1233456789");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		driver.findElementByXPath("//input[@value='Create Lead']").click();
				

	}

}
