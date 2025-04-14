package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//taggedFeatures//" ,
		glue = {"stepDefinitions"},
		monochrome=true,
//		tags="@SmokeTest",							// runs all scenarios that have given tag
//		tags="@SmokeTest and @RegressionTest"		// and operator : runs all scenarios that have both the given tags
//		tags="@SmokeTest or @RegressionTest"  		// OR Operator : runs all scenarios which have either one (or both) of the given the tags
//		tags = "not @SmokeTest"						// runs all scenarios that does not have the given tag
//		tags="@PhaseOne"							// can be used to run specific feature file with the given tag from list of files
		tags="@PhaseOne and @RegressionTest or @PhaseOne and @SmokeTest"				// combination of tag of feature and scenario to run specific scenario from specific feature
//		tags="@PhaseOne and @RegressionTest"
		)

public class CRMRunner extends AbstractTestNGCucumberTests {

}
