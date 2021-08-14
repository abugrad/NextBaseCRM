@wip
  Feature: Drive functionality

    Background:
      Given the user is logged in

    Scenario: Verify My Drive
      When the user navigates to "Drive" menu, "My Drive" tab
      Then the user should be able to display "My Drive"

      Scenario: Verify Company Drive
        When the user navigates to "Drive" menu, "Company Drive" tab
        Then the user should be able to display "Company drive"