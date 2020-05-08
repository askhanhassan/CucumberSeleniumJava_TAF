package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.TestBase;

public class HomePage extends TestBase {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    @FindBy(xpath = "//a[text()='REGISTER']")
    WebElement registerLink;
    @FindBy(xpath = "//b[contains(text(),'Mercury Tours!')]")
    WebElement homePageWelcomeText;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyHomePageText() {
        wait.until(ExpectedConditions.visibilityOf(homePageWelcomeText));
        return homePageWelcomeText.isDisplayed();
    }

    public RegisterPage clickRegisterLink() {
        registerLink.click();
        return new RegisterPage();
    }


}
