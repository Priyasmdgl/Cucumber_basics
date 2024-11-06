$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberoptions.feature");
formatter.feature({
  "line": 2,
  "name": "open google",
  "description": "",
  "id": "open-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@launchgoogle"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "open chrome browser and launch google",
  "description": "",
  "id": "open-google;open-chrome-browser-and-launch-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user should open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user gives the url to navigate",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user selects tamil",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should the page in tamil",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberoptions.the_user_should_open_chrome_browser()"
});
formatter.result({
  "duration": 2118981300,
  "status": "passed"
});
formatter.match({
  "location": "cucumberoptions.the_user_gives_the_url_to_navigate()"
});
formatter.result({
  "duration": 840141900,
  "status": "passed"
});
formatter.match({
  "location": "cucumberoptions.the_user_selects_tamil()"
});
formatter.result({
  "duration": 573346800,
  "status": "passed"
});
formatter.match({
  "location": "cucumberoptions.the_user_should_the_page_in_tamil()"
});
formatter.result({
  "duration": 117378200,
  "status": "passed"
});
});