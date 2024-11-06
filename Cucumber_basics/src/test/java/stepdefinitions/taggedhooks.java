package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class taggedhooks {
	@Given("^first step$")
	public void first_step() throws Throwable {
	   System.out.println("First step");
	}

	@When("^second step$")
	public void second_step() throws Throwable {
		 System.out.println("Second step");
	}

	@Then("^third step$")
	public void third_step() throws Throwable {
		 System.out.println("Third step");
}
}