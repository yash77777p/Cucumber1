$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/EBaySportsPage.feature");
formatter.feature({
  "name": "Ebay Sport Page Scenarios",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Winter Sport Category",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@all"
    },
    {
      "name": "@sports"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EbayHomePage.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on sprots link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EbaySportPage_Steps.i_clicked_on_sprots_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the winter sports category",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EbaySportPage_Steps.i_validate_the_winter_sports_category()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});