package day8.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("twotabsearchtextbox").sendKeys("Oneplus 7 pro mobiles");
		driver.findElementByXPath("//div[@class='nav-search-submit nav-sprite']/input").click();;
		String price = driver.findElementByXPath("(//div[@class='a-row'][1])//span[@class='a-price-whole']").getText();
		System.out.println("the Price of first resulting mobile is : " + price);
		
		driver.findElementByXPath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]").click();
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> listwinhandles = new ArrayList<>(windowhandles);
		int NoOfOpenedBrowswers = listwinhandles.size();
		System.out.println("No of browswers opened = " +NoOfOpenedBrowswers);		
		String lastwindow = listwinhandles.get(NoOfOpenedBrowswers-1);
		driver.switchTo().window(lastwindow);
		
		String NoOfCustomerRatings = driver.findElementById("acrCustomerReviewText").getText();
		System.out.println(NoOfCustomerRatings);
		
		driver.findElementById("add-to-cart-button").click();
		String Cart = driver.findElementByXPath("//div[@id='huc-v2-order-row-confirm-text']/h1").getText();
		if(Cart.contains("Added to Cart"))
		{
			System.out.println(Cart + " Message Appeared");
		}
		else
		{
			System.out.println("add to cart faild");
		}
		
		driver.findElementById("hlb-ptc-btn-native").click();
		String title = driver.getTitle();
		if(title.contains("Amazon Sign In"))
		{
			System.out.println(title  + " is confirmed ");
		}
		else
		{
		System.out.println("titles doesn't match");
		}
		
		driver.findElementById("continue").click();
		String errormsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		if(errormsg.equals("Enter your email or mobile phone number"))
		{
			System.out.println("validation confirmed");
		}
		else
		{
			System.out.println("validation failed");
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
