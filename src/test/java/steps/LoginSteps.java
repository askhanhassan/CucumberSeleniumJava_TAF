package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import util.TestBase;

public class LoginSteps extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    @Given("^user enter userName as \"([^\"]*)\"$")
    public void enterUserName(String userName) throws Throwable {
        loginPage = new LoginPage();
        loginPage.setUserName(userName);
    }

    @Given("^user enter passWord as \"([^\"]*)\"$")
    public void enterPassword(String passWord) throws Throwable {
        loginPage.setPassword(passWord);
    }

    @When("^user clicks on sign in button$")
    public void clickSignIn() throws Throwable {
        homePage = loginPage.clickLoginButton();

    }

    @Then("^user navigated to Home Page$")
    public void verifyHomePage() throws Throwable {
        boolean isHomePageTextVisible = homePage.verifyHomePageText();
        Assert.assertTrue(isHomePageTextVisible);


    }
}
