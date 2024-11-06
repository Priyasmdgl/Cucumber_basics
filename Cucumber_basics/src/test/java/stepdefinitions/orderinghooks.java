package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orderinghooks {
	@Given("^I have some money$")
	public void i_have_some_money() throws Throwable {
	   System.out.println("I have some money");
	}

	@When("^I am free will go for shopping$")
	public void i_am_free_will_go_for_shopping() throws Throwable {
	    System.out.println("will go for shopping");
	}

	@Then("^will buy some kurtis$")
	public void will_buy_some_kurtis() throws Throwable {
	  System.out.println("will buy some kurtis");
	}

}
