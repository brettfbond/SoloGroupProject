Feature: Login scenarios

  Scenario: Admin User Login for HRMS Application
    #Given user is navigated to HRMS application
    When user enters valid admin username and password
    And user clicks Login
    Then user is successfully logged in and navigated to Dashboard page