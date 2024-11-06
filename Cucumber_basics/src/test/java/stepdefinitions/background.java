package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class background {
	@Given("^the student have completed higher secondary education$")
	public void the_student_have_completed_higher_secondary_education() throws Throwable {
	System.out.println("the student have completed higher secondary education");
	}

	@Given("^the student applied for medical seat$")
	public void the_student_applied_for_medical_seat() throws Throwable {
		System.out.println("the student applied for medical seat");
	}

	@When("^the student clears the entrance exam$")
	public void the_student_clears_the_entrance_exam() throws Throwable {
		System.out.println("the student clears the entrance exam");
	}

	@Then("^the student can join the medical course$")
	public void the_student_can_join_the_medical_course() throws Throwable {
		System.out.println("the student can join the medical course");
	}

	@Given("^the student applied for engineering seat$")
	public void the_student_applied_for_engineering_seat() throws Throwable {
		System.out.println("the student applied for engineering seat");
	}

	@When("^the student have good cutoff for engineering$")
	public void the_student_have_good_cutoff_for_engineering() throws Throwable {
		System.out.println("the student have good cutoff for engineering");
	}

	@Then("^the student can join the engineering course$")
	public void the_student_can_join_the_engineering_course() throws Throwable {
		System.out.println("the student can join the engineering course");
	}

}
