package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MyOffersPage;

public class MyOffers {

    private MyOffersPage myOffersPage;

    public MyOffers(){
        myOffersPage = new MyOffersPage();
    }

    @When("^Click at My Offers Page \"([^\"]*)\" Button$")
    public void click_at_My_Offers_Page_Button(String buttonName) {
        switch (buttonName){
            case "Create new offer":
                myOffersPage.clickCreateNewOfferButton();
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

    @Then("^Check if at My Offers List \"([^\"]*)\" contains$")
    public void check_if_at_My_Offers_List_contains(String expectedElement) {
        Assert.assertTrue("My offers table", myOffersPage.getMyOffersList().contains(expectedElement));
    }

}
