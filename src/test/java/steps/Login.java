package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class Login extends CommonMethods {

    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        sendText(ConfigReader.getPropertyValue("username"), loginPage.usernameField);
        sendText(ConfigReader.getPropertyValue("password"), loginPage.passwordField);
    }
    @When("user clicks Login")
    public void user_clicks_login() {
        click(loginPage.loginBtn);
    }
    @Then("user is successfully logged in and navigated to Dashboard page")
    public void user_is_successfully_logged_in_and_navigated_to_dashboard_page() {
        System.out.println("Test case passed: User logged in");
    }
}
