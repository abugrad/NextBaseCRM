@wip
  Feature: Drive functionality

    Background:
      Given the user is logged in

    Scenario: Verify My Drive
      When the user navigates to "Drive" "My Drive"
      Then the title should be "My Drive"

      Scenario: Verify Company Drive
        When the user navigates to "Drive" "Company Drive"
        Then the title should be "Company drive"