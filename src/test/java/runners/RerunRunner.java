package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failedScenarios.txt" ,
		glue = {"stepDefinitions"},
		monochrome =true,
		plugin = {"pretty",
				"html:target/Reports/TestReport.html"
		}
	)

public class RerunRunner extends AbstractTestNGCucumberTests {


}





