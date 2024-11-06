Feature: To test the login functionality 
Scenario: user should be able to login
Given the user should navigate to the application
When the user enters "Admin" and "admin123"
And when the user login
Then the user should be able to see the dashboard page