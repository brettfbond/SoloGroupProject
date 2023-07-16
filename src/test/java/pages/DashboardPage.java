package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    public WebElement pimTab;

    @FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
    public WebElement addEmployee;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}
