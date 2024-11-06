package Runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefile", glue ="stepdefinitions", dryRun = false, monochrome = true, plugin = {"html:reports/htmlreporter", "json:reports/jsonreporter.json"}, tags = {"@launchgoogle"})
public class cucumberoptions {

}
