Feature: Login Functionality
  # user story = feature
  # test case = scenario
  # test steps = Given, When, Then etc...

#  Background:
#    Given The user is on the login page

  Scenario: Login as dd
    Given The user is on the login page
    When The user enters dd's credentials
    Then The user should be able to login

  Scenario: Login as mike
    Given The user is on the login page
    When The user enters mike's credentials
    Then The user should be able to login

  # class task :
  # new scenario : Login as Rosa
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa's credentials
    Then The user should be able to login

  Scenario: Login as Mansimmo
    Given The user is on the login page
    When The user enters Mansimmos's email
    And The user enters Mansimmo's password
    And The user clicks on login button
    Then The user should be able to login
    And The user should be able to see own username


