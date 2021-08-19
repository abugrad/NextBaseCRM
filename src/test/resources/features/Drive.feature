@NEXTBASE-248
Feature: Drive functionality

  Background:
    Given the user is logged in

@NEXTBASE-256
  Scenario: Verify My Drive
    When the user navigates to "Drive" menu, "My Drive" tab
    Then the user should be able to display "My Drive"

@NEXTBASE-257
  Scenario: Verify Company Drive
    When the user navigates to "Drive" menu, "Company Drive" tab
    Then the user should be able to display "Company drive"
