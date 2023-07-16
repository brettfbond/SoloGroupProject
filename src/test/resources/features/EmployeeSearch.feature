Feature: Search for an employee

  Background:
    #Given user is navigated to HRMS application
    When user enters valid admin username and password
    And user clicks Login
    And user clicks on PIM tab to navigate to Employee List page

    Scenario: search employee by ID
      And user enters a valid employee ID
      And user clicks Search button
      And user clicks on the ID field in the results table
      Then user is navigated to that employee's details page