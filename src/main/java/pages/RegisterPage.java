package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.TestBase;

import java.util.Map;

public class RegisterPage extends TestBase {

    WebDriverWait wait = new WebDriverWait(driver, 30);
    @FindBy(name = "firstName")
    WebElement firstName;
    @FindBy(name = "lastName")
    WebElement lastName;
    @FindBy(name = "phone")
    WebElement phone;
    @FindBy(name = "userName")
    WebElement userName;
    @FindBy(name = "address1")
    WebElement address1;
    @FindBy(name = "address2")
    WebElement address2;
    @FindBy(name = "city")
    WebElement city;
    @FindBy(name = "state")
    WebElement state;
    @FindBy(name = "postalCode")
    WebElement postalCode;
    @FindBy(name = "country")
    WebElement country;
    @FindBy(name = "email")
    WebElement email;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(name = "confirmPassword")
    WebElement confirmPassword;
    @FindBy(name = "register")
    WebElement register;
    @FindBy(xpath = "//font[contains(text(),'Thank you for registering. ')]")
    WebElement successfulNotification;
    @FindBy(xpath = "//a[text()='REGISTER']")
    WebElement registerLink;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyRegisterPageText() {
        wait.until(ExpectedConditions.visibilityOf(firstName));
        return firstName.isDisplayed();
    }

    public boolean enterRegisterDataAndSubmit(Map<String, String> data) {
        if (driver.findElements(By.xpath("//font[contains(text(),'Thank you for registering. ')]")).size() == 1) {
            registerLink.click();
            wait.until(ExpectedConditions.visibilityOf(firstName));
        }

        firstName.sendKeys(data.get("firstName"));
        lastName.sendKeys(data.get("lastName"));
        phone.sendKeys(data.get("phone"));
        userName.sendKeys(data.get("email"));
        address1.sendKeys(data.get("address1"));
        address2.sendKeys(data.get("address2"));
        city.sendKeys(data.get("city"));
        state.sendKeys(data.get("state"));
        postalCode.sendKeys(data.get("postalCode"));

        Select drpCountry = new Select(country);
        drpCountry.selectByVisibleText(data.get("country"));

        email.sendKeys(data.get("userName"));
        password.sendKeys(data.get("password"));
        confirmPassword.sendKeys(data.get("confirmPassword"));

        register.click();
        wait.until(ExpectedConditions.visibilityOf(successfulNotification));

        return successfulNotification.isDisplayed();
    }
}
