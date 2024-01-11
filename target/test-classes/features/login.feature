@sanity
Feature: Bookcart application tests

  Background: 
    Given user click on the login link

  #@reg
  Scenario: Login page should be success
    And user enter the username as "Manny"
    And user enter the password as "Sunday!123"
    When user click on the login button
    Then Login should be success

  #@smoke @reg
  Scenario: Login page should be failed
    And user enter the username as "man"
    And user enter the password as "pa123"
    When user click on the login button
    But Login should be failed
