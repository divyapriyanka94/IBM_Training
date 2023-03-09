$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/features/search.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate search functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is in search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.enterProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.clickSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.verifyProduct()"
});
formatter.result({
  "status": "passed"
});
});