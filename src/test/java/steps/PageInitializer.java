package steps;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeListPage;
import pages.LoginPage;

public class PageInitializer {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static EmployeeListPage employeeListPage;
    public static AddEmployeePage addEmployeePage;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        employeeListPage = new EmployeeListPage();
        addEmployeePage = new AddEmployeePage();
    }
}
