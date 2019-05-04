package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.OtherUsersPage;

public class OtherUsers {

    private OtherUsersPage otherUsersPage;

    public OtherUsers(){
        otherUsersPage = new OtherUsersPage();
    }

    @When("^Enter at Other Users Page in \"([^\"]*)\" value \"([^\"]*)\"$")
    public void enter_at_Other_Users_Page_in_value(String fieldName, String value) {
        otherUsersPage.enterInTheField(fieldName, value);
    }

    @When("^Click at Other Users Page \"([^\"]*)\" button$")
    public void click_at_Other_Users_Page_button(String buttonName) {
        switch (buttonName){
            case "Search":
                otherUsersPage.clickSearchButton();
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

    @Then("^Check if Other Users result list \"([^\"]*)\" contains$")
    public void check_if_Other_Users_result_list_contains(String expectedResult) {
        Assert.assertEquals("Result list", expectedResult, otherUsersPage.getResultTableContent());
    }

    @When("^Click at Other Users Page \"([^\"]*)\" button at \"([^\"]*)\" row$")
    public void click_at_Other_Users_Page_button_at_row(String buttonName, String rowContent) {
        switch (buttonName){
            case "See more":
                otherUsersPage.clickSeeMoreButtonAtRow(rowContent);
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

}
