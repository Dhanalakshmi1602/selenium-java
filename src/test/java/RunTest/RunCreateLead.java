package RunTest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/Feature/CreateLead.feature", glue = "Steps", monochrome = true/*, dryRun = true, snippets = SnippetType.CAMELCASE*/)

public class RunCreateLead extends AbstractTestNGCucumberTests {
	

}
