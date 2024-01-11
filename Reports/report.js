$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:\\Users\\maddy\\eclipse-workspace\\letcodeCucumber1\\src\\test\\java\\features\\addToCart.feature");
formatter.feature({
  "name": "BookCart Application Demo",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@cleanup"
    }
  ]
});
formatter.step({
  "name": "user should login with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user search a \"\u003cbook\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user add the book to the cart",
  "keyword": "When "
});
formatter.step({
  "name": "cart badge should be updated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "book"
      ]
    },
    {
      "cells": [
        "Manny",
        "Sunday!123",
        "hp6"
      ]
    }
  ],
  "tags": [
    {
      "name": "@dev"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Add a product to the cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@cleanup"
    },
    {
      "name": "@dev"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user should login with \"Manny\" and \"Sunday!123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userShouldLoginWithAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user search a \"hp6\"",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCartSteps.userSearchA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user add the book to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCartSteps.userAddTheBookToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "cart badge should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartSteps.cartBadgeShouldBeUpdated()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});