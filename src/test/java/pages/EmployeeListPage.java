package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeListPage extends CommonMethods {

    @FindBy(xpath = "//input[@id='empsearch_id']")
    public WebElement idField;

    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement searchBtn;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public WebElement firstSearchResultID;

    public EmployeeListPage() {
        PageFactory.initElements(driver, this);
    }
}
