package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//features//UserLogin_DataDriven.feature" ,
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

public class BookSearchRunner extends AbstractTestNGCucumberTests {

	/**
	 * the AbstractTestNGCucumberTests will be extended to run each cucumber
	 * scenario found in the features as separated test
	 */
}


/**
 * @cucumberOptions : It allows to configure things like:
 * 1. 	dryRun: Set to true or false; checks if all steps in the Feature File have corresponding code in
 *  the Step Definition file.
 * 2.	Monochrome: Set to true for more readable console output; set to false for less readable output
 * 3.	Features: Specifies the folder path where Cucumber will locate all '.features' files
 * 4.	Glue: Specifies the folder path where Cucumber will locate the Step Definition files.
 * 5.	tags: The tags to include or exclude during execution.
 * 6.	plugin: Defines output report formats like Pretty, HTML, JSON, or JUnit for generating readable 
 * 		or structured reports
 */


