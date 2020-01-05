package day8.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import day9.classroom.annotation.ProjectSpeificMethods;

public class EditLeafTaps extends ProjectSpeificMethods{

	@Test
	public  void editLead() {
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Dhana");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("the title of the current page is " + driver.getTitle());
		}
		
		else
		{
		System.out.println("Titles doesnt match");
		
		}
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement companyname = driver.findElementById("updateLeadForm_companyName");
		companyname.clear();
		companyname.sendKeys("TechM");
			
		driver.findElementByXPath("//input[@value='Update']").click();
		
		if(driver.findElementById("viewLead_companyName_sp").getText().contains("TechM"))
		{
			System.out.println("companyname updated successfully");
		}
		else
		{
			System.out.println("companyname not updated");
		}
		
		
		
		

	}

}
