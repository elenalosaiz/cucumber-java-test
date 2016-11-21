$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("navigation.feature");
formatter.feature({
  "line": 1,
  "name": "Try to open a website",
  "description": "",
  "id": "try-to-open-a-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open a URL",
  "description": "",
  "id": "try-to-open-a-website;open-a-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to the url",
  "keyword": "Given "
});
formatter.match({
  "location": "navigationSteps.homeScreen()"
});
formatter.result({
  "duration": 13460918154,
  "status": "passed"
});
});