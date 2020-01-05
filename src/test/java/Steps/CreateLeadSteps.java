package Steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateLeadSteps   {
public ChromeDriver driver;
@Given("launch the browser")
public void launchTheBrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
}

@Given("Maximize the browser")
public void maximizeTheBrowser() {
    driver.manage().window().maximize();
}

@Given("Load the Url")
public void loadTheUrl() {
   driver.get("http://leaftaps.com/opentaps");
}

@Given("Enter the username as Demosalesmanager")
public void enterTheUsernameAsDemosalesmanager() {
	driver.findElementById("username").sendKeys("demosalesmanager");
}

@Given("Enter the Password as crmsfa")
public void enterThePasswordAsCrmsfa() {
	driver.findElementById("password").sendKeys("crmsfa");
}

@When("Click on Login button")
public void clickOnLoginButton() {
	driver.findElementByClassName("decorativeSubmit").click();
}

@Given("Click on Crmsfa")
public void ClickOnCrmsfa() {
	driver.findElementByLinkText("CRM/SFA").click();
}

@Given("click on lead button")
public void clickOnLeadButton() {
	driver.findElementByLinkText("Create Lead").click();
		}

@Given("Enter the company name as (.*)")
public void enterTheCompanyName(String cname) {
	driver.findElementById("createLeadForm_companyName").sendKeys(cname);
}

@Given("Enter the Firstname as (.*)")
public void enterTheFirstname(String fname) {
	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
}

@Given("Enter the Lastname as (.*)")
public void enterTheLastname(String lname) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
}

@When("Click on create lead button")
public void clickOnCreateLeadButton() {
	driver.findElementByClassName("smallSubmit").click();
}


}
