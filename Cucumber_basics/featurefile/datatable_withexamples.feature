Feature: check login functionality
Scenario Outline: user should login 
Given the user should navigate to hrm application
When the user gives correct credentials "<username>" and "<password>"
And select login
Then the user will be navigated to the dashboard page

Examples:
|username| password|
|Admin   | admin123|
|demo    | demouser|