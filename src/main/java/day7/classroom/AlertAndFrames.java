package day7.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[.='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Dhana");
		alert.accept();
		String name = driver.findElementById("demo").getText();
		if(name.contains("rahul"))
		{
			System.out.println("alert successful");
			
		}
		else
		{
			System.out.println("not successful");
		}
		
		
		

	}

}
