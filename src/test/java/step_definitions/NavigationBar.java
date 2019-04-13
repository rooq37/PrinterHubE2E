package step_definitions;

import cucumber.api.java.en.When;
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

}
