package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.UserProfilePage;

public class UserProfile {

    private UserProfilePage userProfilePage;

    public UserProfile(){
        userProfilePage = new UserProfilePage();
    }

    @Then("^Check if at User Profile Page \"([^\"]*)\" is \"([^\"]*)\"$")
    public void check_if_at_User_Profile_Page_is(String fieldName, String expectedValue) {
        Assert.assertEquals("Value from field " + fieldName, expectedValue, userProfilePage.getValueFromField(fieldName));
    }

    @Then("^Check if at User Profile Page button \"([^\"]*)\" is visible$")
    public void check_if_at_User_Profile_Page_button_is_visible(String buttonName) {
        switch (buttonName){
            case "Edit":
                Assert.assertTrue(buttonName + " button visibility", userProfilePage.checkIfEditButtonIsVisible());
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

    @When("^Click at User Profile Page button \"([^\"]*)\"$")
    public void click_at_User_Profile_Page_button(String buttonName) {
        switch (buttonName){
            case "Edit":
                userProfilePage.clickEditButton();
                break;
            case "Save":
                userProfilePage.clickSaveButton();
                break;

            case "Cancel":
                userProfilePage.clickCancelButton();
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

    @When("^Enter at User Profile Page in \"([^\"]*)\" value \"([^\"]*)\"$")
    public void enter_at_User_Profile_Page_in_value(String fieldName, String value) {
        userProfilePage.enterInTheField(fieldName, value);
    }

}
