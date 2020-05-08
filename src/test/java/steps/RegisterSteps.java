package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import util.TestBase;

import java.util.Map;

public class RegisterSteps extends TestBase {

    RegisterPage registerPage;

    @When("^user enters registration details as$")
    public void filRegData(DataTable regData) throws Throwable {
        registerPage = new RegisterPage();
        for (Map<String, String> data : regData.asMaps(String.class, String.class)) {
            boolean successMessageIsVisible = registerPage.enterRegisterDataAndSubmit(data);
            Assert.assertTrue(successMessageIsVisible);
        }

    }
}
