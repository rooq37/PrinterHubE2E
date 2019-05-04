package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Hooks {

    @After
    @Attachment(value = "Attachment", type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @After
    public void deleteCookies(){
        BasePage.getDriver().manage().deleteAllCookies();
    }

}
