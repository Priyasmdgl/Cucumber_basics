$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/Opengoogle.feature");
formatter.feature({
  "line": 1,
  "name": "To test for Google Search",
  "description": "",
  "id": "to-test-for-google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Search for Dindigul",
  "description": "",
  "id": "to-test-for-google-search;search-for-dindigul",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user navigates to Google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user enters the search term \"Dindigul\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "the user should get the results for Dindigul",
  "keyword": "Then "
});
formatter.match({
  "location": "Opengoogle.user_navigates_to_Google_com()"
});
formatter.result({
  "duration": 3064235800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dindigul",
      "offset": 33
    }
  ],
  "location": "Opengoogle.the_user_enters_the_search_term(String)"
});
formatter.result({
  "duration": 150385200,
  "status": "passed"
});
formatter.match({
  "location": "Opengoogle.click_on_search_button()"
});
formatter.result({
  "duration": 200962100,
  "status": "passed"
});
formatter.match({
  "location": "Opengoogle.the_user_should_get_the_results_for_Dindigul()"
});
formatter.result({
  "duration": 1166828300,
  "status": "passed"
});
});