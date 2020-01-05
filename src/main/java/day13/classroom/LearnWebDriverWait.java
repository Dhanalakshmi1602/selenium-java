package day13.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElementById("btn");
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.textToBePresentInElement(ele, "Click ME!"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		

		

	}

}
