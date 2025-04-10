package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//features" ,	// it will run all features in folder
		glue = {"stepDefinitions"},
		monochrome =true,
		dryRun = false,
		plugin = {"pretty",
				"html:target/Reports/TestReport.html",
//				"usage:target/Reports/TestUsage",
//				"json:target/Reports/TestReport.json"
				"rerun:target/FailedScenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
	)


public class ParallelRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider (parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
		
		/**
		 * Overrides the scenarios provider to enable parallel execution of Cucumber scenarios.
		 * Retrieves a two-dimensional array of feature and scenario details, wrapped in {@link PickleWrapper}
		 * and {@link FeatureWrapper} objects, via super.scenarios(), which internally calls 
		 * testNGCucumberRunner.provideScenarios() from the base class.
		 * TestNG uses this data to run each scenario as a separate, parallel test when status is true
		 */

	}
}
