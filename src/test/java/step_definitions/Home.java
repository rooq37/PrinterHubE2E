package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

public class Home {

    private HomePage homePage;

    public Home(){
        this.homePage = new HomePage();
    }

    @Given("^Open home page$")
    public void open_home_page() {
        homePage.openHomePage();
    }

    @Then("^Check if logo is visible$")
    public void check_if_logo_is_visible() {
        Assert.assertTrue(homePage.isMainLogoVisible());
    }

    @Then("^Check if home page text is visible$")
    public void check_if_home_page_text_is_visible() {
        Assert.assertTrue(homePage.getContentText().contains("Lorem ipsum dolor sit amet"));
    }

}
