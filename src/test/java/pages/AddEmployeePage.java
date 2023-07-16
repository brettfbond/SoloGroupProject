package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='middleName']")
    public WebElement middleName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='employeeId']")
    public WebElement employeeID;

    @FindBy(xpath = "//input[@id='photofile']")
    public WebElement photographInput;

    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement saveBtn;

    public AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }
}
