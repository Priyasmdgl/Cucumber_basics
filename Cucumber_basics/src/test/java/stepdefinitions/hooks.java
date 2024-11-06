package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hooks {
	@Given("^I have (\\d+) mangoes$")
	public void i_have_mangoes(int arg1) throws Throwable {
	  System.out.println(arg1);
	}

	@When("^I give (\\d+) to my mother$")
	public void i_give_to_my_mother(int arg1) throws Throwable {
	   System.out.println(arg1);
	}

	@Then("^there will be remaining (\\d+) mangoes with me$")
	public void there_will_be_remaining_mangoes_with_me(int arg1) throws Throwable {
	   System.out.println(arg1);
	}

}
