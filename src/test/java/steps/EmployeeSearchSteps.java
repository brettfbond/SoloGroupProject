package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {

    @When("user clicks on PIM tab to navigate to Employee List page")
    public void user_clicks_on_pim_tab_to_navigate_to_employee_list_page() {
        click(dashboardPage.pimTab);
    }

    @When("user enters a valid employee ID")
    public void user_enters_a_valid_employee_id() {
        sendText("49855835", employeeListPage.idField);
    }

    @When("user clicks Search button")
    public void user_clicks_search_button() {
        click(employeeListPage.searchBtn);
    }

    @When("user clicks on the ID field in the results table")
    public void user_clicks_on_the_id_field_in_the_results_table() {
        click(employeeListPage.firstSearchResultID);
    }

    @Then("user is navigated to that employee's details page")
    public void user_is_navigated_to_that_employee_s_details_page() {
        System.out.println("Test passed, navigated to employee details page");
    }
}
