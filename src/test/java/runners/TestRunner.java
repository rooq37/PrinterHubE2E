package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "classpath:step_definitions",
        plugin = "html:target/selenium-reports"
)

public class TestRunner {

    @AfterClass
    public static void closeDriver(){
        BasePage.getDriver().quit();
    }

}