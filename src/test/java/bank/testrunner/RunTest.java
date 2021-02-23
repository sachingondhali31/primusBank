package bank.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

		(
				
				plugin= "pretty",
				features="src/test/resources/BUSINESS_LOGIC/CUCMBER_SUITES",
				tags="@smokeTest",
				glue="bank.cucumber",
				monochrome=true
							
		)


public class RunTest
{

}
