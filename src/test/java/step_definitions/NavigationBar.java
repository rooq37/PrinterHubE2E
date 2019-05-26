package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.NavigationBarPage;

public class NavigationBar {

    private NavigationBarPage navigationBarPage;

    public NavigationBar(){
        this.navigationBarPage = new NavigationBarPage();
    }

    @When("^Navigate to \"([^\"]*)\"$")
    public void navigate_to(String pageName) {
        navigationBarPage.navigateToOption(pageName);
    }

    @Then("^Check if user is logged in$")
    public void check_if_user_is_logged_in() {
        Assert.assertTrue("Check if user is logged in", navigationBarPage.checkIfUserIsLoggedIn());
    }

}
