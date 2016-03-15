package com.sitture.mvn.cucumber.appium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HamburgerDef {

	@Given("^I launch the app$")
	public void I_launch_the_app() throws Throwable {
		// launch the app here
		System.out.println(Settings.applicationUrl);
    }

	@When("^I click on hamburger$")
	public void I_click_on_hamburger() throws Throwable {
		// click on something
    }

	@Then("^I should see list of options$")
	public void I_should_see_list_of_options() throws Throwable {
		// verify list of menu options are displayed
    }

}



