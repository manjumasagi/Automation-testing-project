@sanity
Feature: Login Scenarios

  Scenario Outline: Login to Application with Correct Id and password
    Given User Opens the Application
    And User enter the "<username>"
    And User will enter the "<password>"
    When User will click on the submit button
    Then User will be navigated to the homepage

    Examples: 
      | username   | password |
      | mngr530983 | pEsaqUm  |
