$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "To verify the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be in the facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_has_to_be_in_the_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate login using invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter invalid username and password",
  "rows": [
    {
      "cells": [
        "greens",
        "greens@123"
      ]
    },
    {
      "cells": [
        "java",
        "java@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enter_invalid_username_and_password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 3, Size: 2\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat java.util.Collections$UnmodifiableList.get(Unknown Source)\r\n\tat org.stepdefinition.Steps.user_enter_invalid_username_and_password(Steps.java:39)\r\n\tat ✽.user enter invalid username and password(file:src/test/resources/Feature/login.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be in the facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_has_to_be_in_the_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login without passing credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click the login without passing value",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_the_login_without_passing_value()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});