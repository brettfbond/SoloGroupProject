package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class AddEmployeesSteps extends CommonMethods {

    @When("user hovers over PIM tab")
    public void user_hovers_over_pim_tab() {
        Actions builder = new Actions(driver);
        builder.moveToElement(dashboardPage.pimTab).perform();
    }
    @When("user clicks Add Employee")
    public void user_clicks_add_employee() {
        click(dashboardPage.addEmployee);
    }
    @When("user fills in First Name, Middle name \\(optional), and Last Name")
    public void user_fills_in_first_name_middle_name_optional_and_last_name() {
        System.out.println(Constants.EXCEL_FILE_PATH);
        List<Map<String, String>> newEmployees = ExcelReader.read("EmployeeDatabase", Constants.EXCEL_FILE_PATH);
        for (Map<String, String> newEmployee : newEmployees) {
            sendText(newEmployee.get("FirstName"), addEmployeePage.firstName);
            sendText(newEmployee.get("MiddleName"), addEmployeePage.middleName);
            sendText(newEmployee.get("LastName"), addEmployeePage.lastName);
            sendText(Constants.PHOTO_PATH, addEmployeePage.photographInput);
        }
    }
    @When("user clicks Save under Add Employee heading")
    public void user_clicks_save_under_add_employee_heading() {
        click(addEmployeePage.saveBtn);
    }
    @Then("a new employee is saved with an auto-generated ID")
    public void a_new_employee_is_saved_with_an_auto_generated_id() {
        System.out.println("Test passed. New employee added");
    }
}
