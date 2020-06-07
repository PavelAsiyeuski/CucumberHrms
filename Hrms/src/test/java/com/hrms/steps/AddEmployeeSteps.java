package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddEmployeeSteps extends CommonMethods{
	@Given("user navigates to Add Employee page")
	public void user_navigates_to_Add_Employee_page() {
	   jsClick(dashboard.PIM);
	   wait(2);
	   jsClick(dashboard.addEmp);
	}

	
	@When("user enters employees first name and last name")
	public void user_enters_employees_first_name_and_last_name() {
	 sendText(addEmp.firstName,"John");
	 sendText(addEmp.lastName,"Smith");
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
	    jsClick(addEmp.saveBtn);
	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
	    Assert.assertTrue(addEmp.empPic.isDisplayed());
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
	  addEmp.empId.clear();
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
	    jsClick(addEmp.loginCheckbox);
	}

	@When("user enters  login credentials")
	public void user_enters_login_credentials() {
	    sendText(addEmp.username,"JohnSmith111");
	    sendText(addEmp.password,"Syntax123.");
	    sendText(addEmp.passConfirm,"Syntax123.");
	}
}
