package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.OfferDetailsPage;

public class OfferDetails {

    OfferDetailsPage offerDetailsPage;

    public OfferDetails(){
        offerDetailsPage = new OfferDetailsPage();
    }

    @Then("^Check if at Offer Details Page \"([^\"]*)\" is \"([^\"]*)\"$")
    public void check_if_at_Offer_Details_Page_is(String fieldName, String expectedValue) {
        switch (fieldName){
            case "Title":
                Assert.assertEquals(offerDetailsPage.getTitle(), expectedValue);
                break;
            case "Creator":
                Assert.assertEquals(offerDetailsPage.getCreator(), expectedValue);
                break;
            case "Description":
                Assert.assertEquals(offerDetailsPage.getDescription(), expectedValue);
                break;
            case "Categories":
                Assert.assertEquals(offerDetailsPage.getCategories(), expectedValue);
                break;
        }
    }


}
