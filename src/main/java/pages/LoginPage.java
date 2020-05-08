package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestBase;

public class LoginPage extends TestBase {

    @FindBy(name = "userName")
    WebElement userName;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(name = "login")
    WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String userName) {
        this.userName.sendKeys(userName);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public HomePage clickLoginButton() {
        this.loginButton.click();
        return new HomePage();
    }


}
