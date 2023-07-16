Feature: Add employees

  #USER STORY 2: Adding an Employee to the HRMS Application
  #Acceptance Criteria:
  #1. An admin user should be able to add an employee to the HRMS application
  #without providing an employee ID. The system should automatically
  #generate a unique employee ID for the new employeeThe required fields for
  #this process should include:
  #● First Name
  #● Middle Name (optional)
  #● Last Name
  #2. An admin user should also have the option to add an employee to the HRMS
  #application by providing a unique employee ID. The required fields for this
  #process should include:
  #● First Name
  #● Middle Name (optional)
  #● Last Name
  #● Employee ID
  #3. The system should provide appropriate error messages or prompts for users
  #who attempt to submit incomplete or invalid employee information. Error
  #messages should be clear, easily visible, and placed near the respective input fields.

  Background:
    When user enters valid admin username and password
    And user clicks Login
    And user hovers over PIM tab
    And user clicks Add Employee

    Scenario: add employee with auto-generated ID
      And user fills in First Name, Middle name (optional), and Last Name
      And user clicks Save under Add Employee heading
      Then a new employee is saved with an auto-generated ID

    Scenario: add empoloyee with unique ID
      And user fills in First Name, Middle name (optional), and Last Name
      And user enters unique Employee ID
      And user clicks Save under Add Employee heading
      Then a new employee is saved with the unique ID

    Scenario: error message when adding invalid new employee information
      And user fills in only First name "Johnny"
      And user clicks Save under Add Employee heading
      Then an error message is displayed and employee is not added


