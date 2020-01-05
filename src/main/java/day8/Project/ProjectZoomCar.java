package day8.Project;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ProjectZoomCar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByClassName("search").click();
		driver.findElementByXPath("//div[@class='items'][2]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
			
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc)
		String today = sdf.format(date); // Get today's date
		System.out.println("today date = " + today);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> days = driver.findElementByXPath("(//div[@class='days'])").findElements(By.className("day"));
		
		WebElement tomorrowElement = null;
		for(int i=0; i<days.size(); i++)
		{
			if(days.get(i).getText().contains(today))
			{
				System.out.println("today found");
				tomorrowElement = days.get(i + 1);
				break;
			}
		}
		if(tomorrowElement != null)
		{
			tomorrowElement.click();
		}

		driver.findElementByXPath("//button[text()='Next']").click();	
		driver.findElementByXPath("//button[text()='Done']").click();
		
		
		//SOLUTON 1
		/*
		List<WebElement> carPrices = driver.findElementsByXPath("//div[@class='price']");
		int highestpricedcar = 0;
		int highestpricedcarIndex = -1;
		for(int i=0; i<carPrices.size(); i++)
		{
			String eachCarPrice = carPrices.get(i).getText().replace("₹", "").replace(",","").replace(" ","");
			
			System.out.println(eachCarPrice);
			
			int eachCarPriceInt = Integer.parseInt(eachCarPrice);
			if(eachCarPriceInt > highestpricedcar)
			{
				highestpricedcar = eachCarPriceInt;
				highestpricedcarIndex = i;
			}
		}
		
		System.out.println("highestpricedcar = " + highestpricedcar);
		System.out.println("Clicking book now at index = " + highestpricedcarIndex);
		
		if(highestpricedcarIndex != -1)
		{
			driver.findElementsByXPath("//button[@class='book-car']").get(highestpricedcarIndex).click();
		}*/
		
		//SOLUTION 2
		/*List<WebElement> carListings = driver.findElementsByXPath("//div[@class='car-listing']");
		int highestpricedcar = 0;
		WebElement higehestPriceButton = null;
		
		for (WebElement carListing : carListings)
		{
			WebElement price = carListing.findElement(By.className("price"));
			
			String eachCarPrice = price.getText().replace("₹", "").replace(",","").replace(" ","");
			
			System.out.println(eachCarPrice);
			
			int eachCarPriceInt = Integer.parseInt(eachCarPrice);
			if(eachCarPriceInt > highestpricedcar)
			{
				highestpricedcar = eachCarPriceInt;
				higehestPriceButton = carListing.findElement(By.className("book-car"));
			}
		}
		
		System.out.println("the highest priced car is " + highestpricedcar);
		higehestPriceButton.click();*/
		
		//SOLUTION 3
		List<WebElement> carListings = driver.findElementsByXPath("//div[@class='car-listing']");
		Collections.sort(carListings, new Comparator<WebElement>() {

			@Override
			public int compare(WebElement listing1, WebElement listing2) {
				String car1Price = listing1.findElement(By.className("price")).getText().replace("₹", "").replace(",","").replace(" ","");
				String car2Price = listing2.findElement(By.className("price")).getText().replace("₹", "").replace(",","").replace(" ","");
				int car1PriceInt = Integer.parseInt(car1Price);
				int car2PriceInt = Integer.parseInt(car2Price);
				if(car1PriceInt == car2PriceInt)
				{
					return 0;
				}
				else if(car1PriceInt < car2PriceInt)
				{
					return -1;
				}
				else
				{
					return 1;
				}
			}
		});
		
		WebElement highestPricedCarListing = carListings.get(carListings.size() - 1);
		System.out.println("highestPricedCarListing = " + highestPricedCarListing.findElement(By.className("price")).getText());
		highestPricedCarListing.findElement(By.className("book-car")).click();
		
	}

}
