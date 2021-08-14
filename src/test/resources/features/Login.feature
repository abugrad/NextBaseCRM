
Feature: Login functionality

  Background:
    Given the user is on the login page

  Scenario Outline: Login as a HR, Helpdesk and Marketing user with valid credentials
    When the user enters "<userName>" and "<password>"
    Then the user should be on the home page

    Examples:
      | userName                       | password |
      | helpdesk29@cybertekschool.com  | UserUser |
      | hr29@cybertekschool.com        | UserUser |
      | marketing29@cybertekschool.com | UserUser |

  Scenario Outline: Login with different invalid credentials
    When the user enters "<userName>" and "<password>"
    Then "Incorrect login or password" warning should be displayed

    Examples:
      | userName                         | password |
      | helpdesk2900@cybertekschool.com  | UserUser |
      | hr29@cybertekschool.com          | aslkdndk |
      | marketing2948@cybertekschool.com | asdqwec  |

    Scenario: Login with blank credentials
      When the user enters "" username and "" password
      Then "Incorrect login or password" warning should be displayed

    Scenario: Login attempt 5 times with invalid credentials
      When the user enters "zcvadqwe" and "qwe65a1s" 5 times
      Then user should not be able to try to login