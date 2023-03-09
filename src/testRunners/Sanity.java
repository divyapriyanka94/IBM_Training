package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features",
		glue = {"stepDefinitions"},
		plugin = {"html:reporting/CucmberHTMLReports/Sanity"},
		tags = "Smoke"
		)


public class Sanity {

	

}
