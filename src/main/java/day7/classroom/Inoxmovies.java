package day7.classroom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inoxmovies {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.inoxmovies.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.findElementByXPath("//span[text()='Mumbai']").click();

		Actions builder = new Actions(driver);
		WebElement element = driver.findElementByXPath("(//div[text()='Chennai    '])[2]");
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		
		driver.findElementByXPath("(//div[contains(text(),'CINEMAS')])[1]").click();
		WebElement inox = driver.findElementByXPath("//div[text()='INOX Chennai Citi Centre,Dr. R. K. Salai']");
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", inox);
		
		
		
		/*builder.moveToElement(cinemas).perform();
		Thread.sleep(2000);
		builder.click(inox);
		*/
		
	
		
	}

}
