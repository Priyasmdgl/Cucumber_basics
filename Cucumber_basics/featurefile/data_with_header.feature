Feature:  to check login functionality
Scenario: user should login and see dashboard
Given the user should navigate to hrm login page
When the user gives correct credentials
|username| password|
|Admin   | admin123|
And press login button
Then the user will be logged in
