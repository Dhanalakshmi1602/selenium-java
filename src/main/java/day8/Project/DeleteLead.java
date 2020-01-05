package day8.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		String leadid = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").getText();
		System.out.println(leadid);
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadid);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadid);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		if(driver.findElementByXPath("//div[text()='No records to display']").getText().contains("No records to display"))
		{
			System.out.println("Deletion successful");
		}
		else
		{
			System.out.println("deletion Unsucessful");
		}
		
		
		
		
		

	}

}
