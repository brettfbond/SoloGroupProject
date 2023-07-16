package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//input[@id='txtUsername']")
    public WebElement usernameField;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement loginBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}
