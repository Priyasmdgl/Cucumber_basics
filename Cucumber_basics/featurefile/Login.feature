Feature: To test the login functionality of orange hrm application
Scenario: user should be logged in when they give the correct username and password
Given the user should go to the login page of the application
When the user enters the correct username and password
And clicks on the login button
Then the user should be logged in and should see the dashboard page