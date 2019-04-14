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
        switch (pageName){
            case "Home":
                navigationBarPage.navigateToHome();
                break;

            case "Terms of use":
                navigationBarPage.navigateToTermsOfUse();
                break;

            case "Login":
                navigationBarPage.navigateToLogin();
                break;

            case "Register":
                navigationBarPage.navigateToRegister();
                break;

            default:
                throw new IllegalArgumentException("There is no page like " + pageName);
        }
    }

    @Then("^Check if option \"([^\"]*)\" is visible on the navigation bar$")
    public void check_if_option_is_visible_on_the_navigation_bar(String expectedOption) {
        System.out.println(navigationBarPage.getNavigationBarOptions());
        Assert.assertTrue("There is no option like " + expectedOption + " on the navigation bar", navigationBarPage.getNavigationBarOptions().contains(expectedOption));
    }

}
