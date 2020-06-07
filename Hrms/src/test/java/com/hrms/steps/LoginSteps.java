package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods{
	@Given("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		sendText(login.username,"Admin");
		sendText(login.password,"hsfhfsgh");
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		jsClick(login.loginBtn);
	}

	@Then("User see Invalid Credentials text on login page")
	public void user_see_Invalid_Credentials_text_on_login_page() {
		String expected="Invalid credentials";
		String actual=login.errorMsg.getText();
		Assert.assertEquals(expected, actual);
	}

	@When("user enters valid admin username and password")
	public void user_enters_valid_admin_username_and_password() {
		sendText(login.username,"Admin");
		sendText(login.password,"Hum@nhrm123");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		jsClick(login.loginBtn);
	}

	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
		String expected="Welcome Admin";
		String actual=dashboard.welcome.getText();
		Assert.assertEquals(expected,actual);

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		sendText(login.username,"Elvira");
		sendText(login.password,"Syntax123.");
	}

	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
		String expected="Welcome Elvira";
		String actual=dashboard.welcome.getText();
		Assert.assertEquals(expected,actual);
	}



}
