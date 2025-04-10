package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDefs {

	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("User is logged in");
	}
	@When("User delete a Contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a Contact");
	}
	
	@When("User views Deals details")
	public void user_views_deals_details() {
		System.out.println("User views Deals details");
	}
	
	@When("User create a new Contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new Contact");
	}
	
	@When("User views Contact details")
	public void user_views_contact_details() {
		System.out.println("User views Contact details");
	}
	
	
	@When("User delete a Deals")
	public void user_delete_a_deals() {
		System.out.println("User delete a Deals");
	}
	
	@When("User delete a Tasks")
	public void user_delete_a_tasks() {
		System.out.println("User delete a Tasks");
	}
	
	@When("User create a new Deal")
	public void user_create_a_new_deal() {
		System.out.println("User create a new Deal");
	}
	
	@When("User views Tasks details")
	public void user_views_tasks_details() {
		System.out.println("User views Tasks details");
	}
	
	@When("User create a new Tasks")
	public void user_create_a_new_tasks() {
		System.out.println("User create a new Tasks");
	}
}
