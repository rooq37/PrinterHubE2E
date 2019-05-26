package step_definitions;

import cucumber.api.java.en.When;
import pages.OffersPage;

public class Offers {

    OffersPage offersPage;

    public Offers(){
        offersPage = new OffersPage();
    }

    @When("^Click at Offers Page \"([^\"]*)\" button at \"([^\"]*)\" row$")
    public void click_at_Offers_Page_button_at_row(String buttonName, String rowContent) {
        switch (buttonName){
            case "See more":
                offersPage.clickSeeMoreButtonAtRow(rowContent);
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }
}
