Feature: login functionality
Scenario: user should be able to login
Given the user should go to the login page 
When the user gives the credentials
|Admin| admin123|
And login
Then the user should see the dashboard page
