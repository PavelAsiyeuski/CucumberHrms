Feature: Add Employee

  Scenario: Add new Employee
    Given user enters valid admin username and password
    And user clicks on login button
    And user navigates to Add Employee page
    When user enters employees first name and last name
    And user clicks save button
    Then employee is added successfully

  Scenario: Add Employee without employee id
    Given user enters valid admin username and password
    And user clicks on login button
    And user navigates to Add Employee page
    When user enters employees first name and last name
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully

  Scenario: AddEmployee and create Login Credentials
    Given user enters valid admin username and password
    And user clicks on login button
    And user navigates to Add Employee page
    When user enters employees first name and last name
    And user clicks on create login checkbox
    And user enters  login credentials
    And user clicks save button
    Then employee is added successfully
