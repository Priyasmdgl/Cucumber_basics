Feature: To test for Google Search
Scenario: Search for Dindigul 
 Given user navigates to Google.com
 When the user enters the search term "Dindigul"
 And click on search button
 Then the user should get the results for Dindigul
