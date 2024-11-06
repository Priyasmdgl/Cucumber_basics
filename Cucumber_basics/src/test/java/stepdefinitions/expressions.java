package stepdefinitions;

import cucumber.api.java.en.Given;

public class expressions {
	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(int arg1) throws Throwable {
	    System.out.println(arg1);
	}

	@Given("^I have (\\d+) mobile$")
	public void i_have_mobile(int arg1) throws Throwable {
	    System.out.println(arg1);
	}

	@Given("^I am learning \"([^\"]*)\"$")
	public void i_am_learning(String arg1) throws Throwable {
	   System.out.println(arg1);
	}
	@Given("^I have scored (\\d+\\.\\d+) percentage$")
	public void i_have_scored_percentage(Float arg1) throws Throwable {
	    System.out.println(arg1);
	}

}
