$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/Search.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search using invalid search term",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open bunnings website",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \"\u003csearchtext\u003e\" in search box",
  "keyword": "When "
});
formatter.step({
  "name": "I select the first suggestion",
  "keyword": "And "
});
formatter.step({
  "name": "Search result displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searchtext"
      ]
    },
    {
      "cells": [
        "Shade"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search using invalid search term",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open bunnings website",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchTest.iOpenChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Shade\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "SearchTest.searchText(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the first suggestion",
  "keyword": "And "
});
formatter.match({
  "location": "SearchTest.selectfirstsuggestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search result displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchTest.verifySearchResultNew()"
});
formatter.result({
  "status": "passed"
});
});