package week7.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://dev69210.service-now.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@1234");
		driver.findElementById("sysverb_login").click();
		WebElement incident = driver.findElementByXPath("(//div[text()='Incidents'])[2]");
		incident.click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//div[text()='Create New'])[1]").click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		String incidentnumber = driver.findElementById("incident.number").getText();
		System.out.println("INcident number is :" + incidentnumber);
		
		driver.findElementById("lookup.incident.caller_id").click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> listwinhandles = new ArrayList<>(windowhandles);
		int NoOfOpenedBrowswers = listwinhandles.size();
		
		System.out.println("No of browswers opened = " +NoOfOpenedBrowswers);
		String Parentwindow = driver.getWindowHandle();
		System.out.println("Parentwindow =" + Parentwindow);
		String lastwindow = listwinhandles.get(NoOfOpenedBrowswers-1);
		driver.switchTo().window(lastwindow);
		driver.findElementByXPath("(//input[@class='form-control'])[1]");
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='glide_ref_item_link'])[1]").click();
		
		
		driver.switchTo().defaultContent()	;		
		driver.findElementById("incident.short_description").sendKeys("Test Description");
		driver.findElementById("sysverb_insert").click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

		

	}

}
