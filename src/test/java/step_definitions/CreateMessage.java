package step_definitions;

import cucumber.api.java.en.When;
import pages.CreateMessagePage;

public class CreateMessage {

    private CreateMessagePage createMessagePage;

    public CreateMessage(){
        createMessagePage = new CreateMessagePage();
    }

    @When("^Enter at Create Message Page in \"([^\"]*)\" value \"([^\"]*)\"$")
    public void enter_at_Create_Message_Page_in_value(String fieldName, String value) {
        switch (fieldName){
            case "To":
                createMessagePage.enterInEmail(value);
                break;

            case "Title":
                createMessagePage.enterInTitle(value);
                break;

            case "Message":
                createMessagePage.enterInContent(value);
                break;

            default:
                throw new IllegalArgumentException("There is no field like " + fieldName);
        }
    }

    @When("^Click at Create Message Page \"([^\"]*)\" Button$")
    public void click_at_Create_Message_Page_Button(String buttonName) {
        switch (buttonName){
            case "Send":
                createMessagePage.clickSendButton();
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

}
