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

    @Then("^Check if option \"([^\"]*)\" is visible on the navigation bar$")
    public void check_if_option_is_visible_on_the_navigation_bar(String expectedOption) {
        Assert.assertTrue("There is no option like " + expectedOption + " on the navigation bar", navigationBarPage.getNavigationBarOptions().contains(expectedOption));
    }

    @Then("^Check if option \"([^\"]*)\" is not visible on the navigation bar$")
    public void check_if_option_is_not_visible_on_the_navigation_bar(String notExpectedOption) {
        Assert.assertFalse("There is no option like " + notExpectedOption + " on the navigation bar", navigationBarPage.getNavigationBarOptions().contains(notExpectedOption));
    }

}
