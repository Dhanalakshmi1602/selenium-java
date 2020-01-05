package day8.Project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		
		Actions builder = new Actions(driver);
		WebElement vendors = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");		
		builder.moveToElement(vendors).perform();
		driver.findElementByXPath("//a[text()='Search for Vendor']").click();
		//builder.click(searchvendor).perform();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		//String country = driver.findElementByXPath("(//table[@class='table']//td)[5]").getText();

		String columnToFind = "Country";
		
		WebElement table = driver.findElementByXPath("//table[@class='table']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int countryColumnIndex = -1;
		List<WebElement> headingColumns = rows.get(0).findElements(By.tagName("th"));
		
		for(int i=0; i<headingColumns.size(); i++)
		{
			if(headingColumns.get(i).getText().equalsIgnoreCase(columnToFind)) 
			{
				countryColumnIndex = i;
				System.out.println(columnToFind + " column found at index " + i);
				break;
			}
		}
		
		if(countryColumnIndex != -1)
		{
			for(int i=0; i < rows.size() ; i++)
			{
				List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
				if(cols.size() >= countryColumnIndex)
				{
					if(cols.get(0).getText().equalsIgnoreCase("Blue Lagoon"))
					{
						System.out.println(cols.get(countryColumnIndex).getText());
					}
				}
			}
		}
		else
		{
			System.out.println("Country column not found");
		}
			
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
