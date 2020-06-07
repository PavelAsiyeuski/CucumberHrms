Feature: Employee search

Scenario: Search employee by id
And user is logged in with valid admin credentials
And user navigates to employee list page
When user enters valid employee id
And clicks on search button
Then user sees employee information is displayed 

Scenario: Search employee by name
And user is logged in with valid admin credentials
And user navigates to employee list page
When user enters valid employee name and last name 
And clicks on search button
Then user sees employee information is displayed 

 