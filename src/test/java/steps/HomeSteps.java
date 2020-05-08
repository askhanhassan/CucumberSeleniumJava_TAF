package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.RegisterPage;
import util.TestBase;

public class HomeSteps extends TestBase {

    RegisterPage registerPage;
    HomePage homePage;

    @Given("^user navigated to Register Page$")
    public void verifyRegisterPage() throws Throwable {
        homePage = new HomePage();
        registerPage = homePage.clickRegisterLink();
        boolean isRegisterPageVisible = registerPage.verifyRegisterPageText();
        Assert.assertTrue(isRegisterPageVisible);
    }
}
