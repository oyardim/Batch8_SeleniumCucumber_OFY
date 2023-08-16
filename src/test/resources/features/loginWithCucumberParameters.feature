@regression
Feature: Login Tests with cucumber parameters

  Background:
    Given The user is on the login page

  @rerun
  Scenario: Login as dd - Cucumber Parameters
#    Given The user is on the login page
    When The user logs in with using credentials "ofyardim@hotmail.com" and "Of567248*"
    Then The user should be able to login
    And Verify that username "dd61" is displayed on dashboard page

  @number
  Scenario: Login as mike - Cucumber Parameters
#    Given The user is on the login page
    When The user logs in with using credentials "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    And Verify that username "mike" is displayed on dashboard page
    And The number is 5

#   class task
#   login as Rosa with cucumber parameters

  Scenario: Login as Rosa - Cucumber Parameters
#    Given The user is on the login page
    When The user logs in with using credentials "rosa@test.com" and "Test123456"
    Then The user should be able to login
    And Verify that username "Rosa" is displayed on dashboard page

  @c_ScenarioOutline
  Scenario Outline: Login with different names
#      Given The user is on the login page
    When The user logs in with using credentials "<userEmail>" and "<password>"
    Then The user should be able to login
    And Verify that username "<name>" is displayed on dashboard page
    Examples:
      | userEmail            | password   | name |
      | rosa@test.com        | Test123456 | Rosa |
      | mike@gmail.com       | mike1234   | mike |
      | ofyardim@hotmail.com | Of567248*  | dd   |


  Scenario: Login with list
    When The user logins with following credentials
      | ofyardim@hotmail.com |
      | Of567248*            |
    Then The user should be able to login

  @wip @rerun
  Scenario Outline: Login with list DDF
    When The user logins with following credentials
      | <userEmail> |
      | <password>  |
    Then The user should be able to login
    Examples:
      | userEmail            | password   |
      | rosa@test.com        | Test123456 |
      | mike@gmail.com       | mike1234   |
      | ofyardim@hotmail.com61 | Of567248*  |