Feature: Login test with excel file

  @wip
  Scenario Outline:
    Given The user is on the login page
    When The user logins with using excel file: "<path>", "<sheetName>" and <rowNumber>
    Then The user should be able to login
    Examples:
      | path                              | sheetName | rowNumber |
      | src/test/resources/LoginList.xlsx | QaTeam1   | 1         |