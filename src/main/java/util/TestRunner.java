package util;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature/",
        glue = {"steps"},
        format = {"pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports"},
        monochrome = true,
        strict = false,
        dryRun = false
)

public class TestRunner {

    static TestBase testBase = new TestBase();

    @BeforeClass
    public static void init() {
        testBase.initialaization();
    }

    @AfterClass
    public static void quitExec() {
        testBase.quit();
    }


}


