package day8.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

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
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winhandlist = new ArrayList<String>(windowHandles);
		String secondwindow = winhandlist.get(1);
		driver.switchTo().window(secondwindow);
			
		
		driver.findElementByXPath("(//div[@class='x-tab-panel-header x-unselectable']//li)[3]").click();
				driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("dhana@gmail.com");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> winhandlist1 = new ArrayList<String>(windowHandles1);
		String secondwindow1 = winhandlist.get(1);
		driver.switchTo().window(secondwindow1);
		
		
		driver.findElementByXPath("(//div[@class='x-tab-panel-header x-unselectable']//li)[3]").click();
			
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("dhana@gmail.com");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
				
		}

}
