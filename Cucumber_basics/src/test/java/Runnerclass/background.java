package Runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefile", glue={"stepdefinitions","hooks"}, tags= {"@background"})
public class background {

}
