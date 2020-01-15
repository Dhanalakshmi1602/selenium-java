package day5and6.Assignments;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTrainIdAndTrainname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		WebElement source = driver.findElementById("txtStationFrom");
		source.clear();
		source.sendKeys("MAS", Keys.TAB);
		WebElement destiny = driver.findElementById("txtStationTo");
		destiny.clear();
		destiny.sendKeys("SBC",Keys.TAB);
				
		driver.findElementById("buttonFromTo").click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementById("chkSelectDateOnly").click();
		WebElement calender = driver.findElementByXPath("//input[@title='Select Departure date for availability']");
		calender.sendKeys("14-Dec-19");
		
	
		Map<String,String> map = new LinkedHashMap<>();
		
		WebElement table = driver.findElements(By.className("TrainList")).get(1);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows)
		{
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			String column0 = cols.get(0).getText();
			String column1 = cols.get(1).getText();
			
			map.put(column0, column1);
		
		}
		/*//System.out.println(map);
		
		for (String eachentry : map.keySet())
		{	
			System.out.println(eachentry);
		}
		
		for (String eachentry : map.values())
		{
			System.out.println(map.get(eachentry));
		}//
*/		
		for (Entry<String, String> eachentry  : map.entrySet())
		{
		System.out.println(eachentry.getKey() + " = " + eachentry.getValue());	
		}
		
		

	}

}
