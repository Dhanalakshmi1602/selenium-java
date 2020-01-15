package day6.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> listwinhandles = new ArrayList<>(windowhandles);
		int NoOfOpenedBrowswers = listwinhandles.size();
		System.out.println("No of browswers opened = " +NoOfOpenedBrowswers);
		
		
		String lastwindow = listwinhandles.get(NoOfOpenedBrowswers-1);
		driver.switchTo().window(lastwindow);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
