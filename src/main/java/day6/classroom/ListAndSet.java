package day6.classroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListAndSet {
	
	public static void webTable(WebDriver driver, int rowNum , int colNum)
	{
		WebElement traintable = driver.findElements(By.className("TrainList")).get(1);
		WebElement row= traintable.findElements(By.tagName("tr")).get(rowNum);
		WebElement col = row.findElements(By.tagName("td")).get(colNum);
		
		System.out.println(col.getText());
	}
	public static void webTablerow(WebDriver driver, int rowNum)
	{
		WebElement traintable = driver.findElements(By.className("TrainList")).get(1);
		WebElement row= traintable.findElements(By.tagName("tr")).get(rowNum);
		 List<WebElement> col = row.findElements(By.tagName("td"));
		 for(int i=0 ; i<col.size(); i++)
		 {		 
		System.out.println(col.get(i).getText());
		 }
			
	}	
	public static void webTableCol(WebDriver driver, int colNum)
	{
		WebElement traintable = driver.findElements(By.className("TrainList")).get(1);
		List<WebElement> row= traintable.findElements(By.tagName("tr"));
		for(int i=0 ; i<row.size() ; i++)
		{
			WebElement col = row.get(i).findElements(By.tagName("td")).get(colNum);
			System.out.println(col.getText());
		}
		
	}
	
	public static void getTrain(WebDriver driver, String trainname)
	{
		WebElement traintable = driver.findElements(By.className("TrainList")).get(1);
		List<WebElement> row= traintable.findElements(By.tagName("tr"));
		for(int i=0; i<row.size(); i++)
		{
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			
			if((col.get(1)).getText().equals(trainname)) {
				System.out.println(trainname + "," + col.get(2).getText() + " , " +col.get(5).getText());
				break;
			}
		}
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
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
		
		//Trainslist
		List<String> trians = new ArrayList<>();
      
		List<WebElement> Trainnames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		for (WebElement train : Trainnames) {
		
			System.out.println(train.getText());
		}
		int size = Trainnames.size();
		System.out.println(size);
		
		Set<String> uniqueTrainNames = new HashSet<>();
		for (WebElement eachTrainElement :Trainnames ) {
			String eachTrainName = eachTrainElement.getText();
			uniqueTrainNames.add(eachTrainName);
		}
		// count of unique train names
		int Setsize = uniqueTrainNames.size();
		System.out.println("Unique train names count "+ Setsize);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
