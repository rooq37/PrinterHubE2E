package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class Login {

    private LoginPage loginPage;

    public Login(){
        this.loginPage = new LoginPage();
    }

    @When("^Enter at Login Page in \"([^\"]*)\" value \"([^\"]*)\"$")
    public void enter_at_Login_Page_in_value(String fieldName, String value) {
        switch (fieldName){
            case "Email":
                loginPage.enterEmail(value);
                break;

            case "Password":
                loginPage.enterPassword(value);
                break;

            default:
                throw new IllegalArgumentException("There is no field like " + fieldName);
        }
    }

    @When("^Click at Login Page \"([^\"]*)\" Button$")
    public void click_at_Login_Page_Button(String buttonName) {
        switch (buttonName){
            case "Log In":
                loginPage.clickSubmitButton();
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

    @Then("^Check if error message is \"([^\"]*)\"$")
    public void check_if_error_message_is(String expectedMessage) {
        Assert.assertEquals("Error message", expectedMessage, loginPage.getErrorMessageText());
    }

}
