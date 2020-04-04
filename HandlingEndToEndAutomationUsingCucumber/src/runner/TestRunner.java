package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ={"Feature"},
		glue="stepDefenition",
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		
		
		)
public class TestRunner {

}
