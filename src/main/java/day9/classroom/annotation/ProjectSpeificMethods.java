package day9.classroom.annotation;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpeificMethods{
	
	public void setData() {
		excelfile = "createLead";
	}
	
	public String excelfile;
	public ChromeDriver driver;
	@BeforeMethod
	@Parameters({"url","username","password"})
			
	public void login(String url, String username, String password) {
			
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementById("username").sendKeys(username);
	driver.findElementById("password").sendKeys(password);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	}
	
	@AfterMethod	
	public void close()
	{
		driver.close();
	}
	@DataProvider
	public String[][] getData() throws IOException
	{
		/*String[][] data= new String[3][3];
		data[0][0] = "TechM";
		data[0][1] = "Dhana";
		data[0][2] = "Lakshmi";
		data[1][0] = "IcuMed";
		data[1][1] = "Rahul";
		data[1][2] = "Katte";
		data[2][0] = "Google";
		data[2][1] = "Nahul";
		data[2][2] = "Katte";
		*/
		
		ExcelSheet data = new ExcelSheet();
		return data.readExcel(excelfile);
		
		
		
	}

}
