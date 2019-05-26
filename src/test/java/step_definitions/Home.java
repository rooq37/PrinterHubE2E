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

    @Then("^Check if chart is visible$")
    public void check_if_chart_is_visible() {
        Assert.assertTrue(homePage.isChartVisible());
    }

    @Then("^Check if home page text is visible$")
    public void check_if_home_page_text_is_visible() {
        Assert.assertTrue(homePage.getContentText().contains("Welcome on PrinterHub. " +
                "This site is made by students for students which want to print some " +
                "stuff and they don't have a printer or which have a printer but want" +
                " to share it with other students in dormitory."));
    }

}
