@regression
Feature: Dashboard Menu Checks

  Background:
    Given The user is on the login page

  @c_List
  Scenario: Example-1 for Cucumber List
  #  Given The user is on the login page
    When The user logs in with using credentials "ofyardim@hotmail.com" and "Of567248*"
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard   |
      | Developers  |
      | Components  |
      | Forms       |
      | JavaScript  |
      | dd          |

  @c_Map
  Scenario: Example-2 Map for Cucumber
   #   Given The user is on the login page
    When The user logs in following menu
      | usermail | ofyardim@hotmail.com |
      | password | Of567248*            |
      | name     | dd                   |
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard   |
      | Developers  |
      | Components  |
      | Forms       |
      | JavaScript  |
      | dd          |

  @c_ScenarioOutline
  Scenario Outline: Example-2 Map for Cucumber
   #   Given The user is on the login page
    When The user logs in following menu
      | usermail | <userEmail> |
      | password | <password>  |
    Then The user should be able to login
    And The user should be able to see following menu
      | Dashboard   |
      | Developers  |
      | Components  |
      | Forms       |
      | JavaScript  |
      | <name>      |
    Examples:
      | userEmail            | password   | name        |
      | rosa@test.com        | Test123456 | Rosa        |
      | mike@gmail.com       | mike1234   | mike        |
      | ofyardim@hotmail.com | Of567248*  | dd          |

