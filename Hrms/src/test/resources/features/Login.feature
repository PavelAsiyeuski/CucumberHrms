@sprint12
Feature: Login
@smoke
Scenario: Login with valid username and invalid password
And User enter valid username and invalid password
When User click on login button
Then User see Invalid Credentials text on login page
@smoke
Scenario: valid admin login
When user enters valid admin username and password
And user clicks on login button
Then admin user is successfully logged in
@regression
Scenario: valid ess login
When user enters valid username and password
And user clicks on login button
Then ess user is successfully logged in
