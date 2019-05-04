package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MessagesPage;

public class Messages {

    private MessagesPage messagesPage;

    public Messages(){
        messagesPage = new MessagesPage();
    }

    @When("^Click at Messages Page \"([^\"]*)\" button$")
    public void click_at_Messages_Page_button(String buttonName) {
        switch (buttonName){
            case "Create message":
                messagesPage.clickCreateMessageButton();
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

    @Then("^Check if messages list \"([^\"]*)\" contains$")
    public void check_if_messages_list_contains(String expectedValue) {
        Assert.assertTrue("Message list", messagesPage.getMessageList().contains(expectedValue));
    }

    @When("^Click at messages list at message \"([^\"]*)\" from \"([^\"]*)\" \"([^\"]*)\" button$")
    public void click_at_messages_list_at_message_from_button(String title, String sender, String buttonName) {
        switch (buttonName){
            case "Show":
                messagesPage.showMessageByTitleAndSender(title, sender);
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

}
