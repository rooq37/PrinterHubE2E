package step_definitions;

import cucumber.api.java.en.When;
import pages.CreateOfferPage;

public class CreateOffer {

    CreateOfferPage createOfferPage;

    public CreateOffer(){
        createOfferPage = new CreateOfferPage();
    }

    @When("^Enter at Create Offer Page in \"([^\"]*)\" value \"([^\"]*)\"$")
    public void enter_at_Create_Offer_Page_in_value(String fieldName, String value) {
        switch (fieldName){
            case "Title":
                createOfferPage.enterInTitle(value);
                break;
            case "Price":
                createOfferPage.enterInPrice(value);
                break;
            case "Description":
                createOfferPage.enterInDescription(value);
                break;

            default:
                throw new IllegalArgumentException("There is no element like " + fieldName);
        }
    }

    @When("^Click at Create Offer Page \"([^\"]*)\" checkbox$")
    public void click_at_Create_Offer_Page_checkbox(String checkboxName) {
        createOfferPage.clickTheCheckbox(checkboxName);
    }

    @When("^Click at Create Offer Page \"([^\"]*)\" Button$")
    public void click_at_Create_Offer_Page_Button(String buttonName) {
        switch (buttonName){
            case "Save":
                createOfferPage.clickSaveButton();
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }


}
