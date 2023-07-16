Feature: As Admin, add employee details

  Background:
    #Given user is navigated to HRMS application
    When user enters valid admin username and password
    And user clicks Login
    And user clicks on PIM tab to navigate to Employee List page
    And user enters a valid employee ID
    And user clicks Search button
    And user clicks on the ID field in the results table

    Scenario: enter employee job details
      And user clicks on Job
      And user clicks on Edit under the Job heading
      And user selects a Job title
      And user selects an Employment Status
      And user selects a Job Category
      And user enters a Joined Date
      And user selects a Sub Unit
      And user selects a Location
      And user selects a Start Date
      And user selects an End Date
      And user uploads a Contract Details file
      And user clicks Save under the Job heading
      Then the application updates the employee's job details


