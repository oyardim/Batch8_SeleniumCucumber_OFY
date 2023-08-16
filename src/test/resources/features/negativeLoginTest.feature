@regression
Feature: Negative Login Test

  @negativeLogin
  Scenario Outline: negative login tests
    Given The user is on the login page
    When The user logs in with using credentials "<invalidUserEmail>" and "<invalidPassword>"
    Then Verify that warning message is "<message>"
    Examples:
      | invalidUserEmail        | invalidPassword     | message                                  |
      | invalidEmail            | Of567248*           | Email address is incorrect. Please check |
      | ofyardim@hotmail.com    | invalidPassword     | Password is incorrect. Please check      |
      |                         | Of567248*           | Please enter your email.                 |
      | ofyardim@hotmail.com    |                     | Please enter your password!              |
      |                         |                     | Please enter your email.                 |