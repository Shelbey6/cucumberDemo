package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"C:\\Users\\maddy\\eclipse-workspace\\letcodeCucumber1\\src\\test\\java\\features\\login.feature"},
		dryRun = !true,
		snippets = SnippetType.CAMELCASE,
		glue = {"steps", "hooks", "pages"},
		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		//tags = {"@dev"}
		)
public class loginTestRunner extends AbstractTestNGCucumberTests{


}
