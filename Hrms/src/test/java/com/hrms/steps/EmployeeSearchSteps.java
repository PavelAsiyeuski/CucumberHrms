package com.hrms.steps;

import org.openqa.selenium.By; 

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods{
	@Given("user is logged in with valid admin credentials")
	public void user_is_logged_in_with_valid_admin_credentials() {
	   login.login("Admin","Hum@nhrm123");
	}

	@Given("user navigates to employee list page")
	public void user_navigates_to_employee_list_page() {
	    jsClick(dashboard.PIM);
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	    sendText(viewEmp.empId,"10100");
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
	    jsClick(viewEmp.searchBtn);
	}

	@Then("user sees employee information is displayed")
	public void user_sees_employee_information_is_displayed() {
	   System.out.println("Information is displayed");
	}

	@When("user enters valid employee name and last name")
	public void user_enters_valid_employee_name_and_last_name() {
	   sendText(viewEmp.empName,"Umit");
	}
}
