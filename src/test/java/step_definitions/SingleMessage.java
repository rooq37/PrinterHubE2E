package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.SingleMessagePage;

public class SingleMessage {

    private SingleMessagePage singleMessagePage;

    public SingleMessage(){
        singleMessagePage = new SingleMessagePage();
    }

    @Then("^Check if at Single Message Page \"([^\"]*)\" is \"([^\"]*)\"$")
    public void check_if_at_Single_Message_Page_is(String fieldName, String value) {
        switch (fieldName){
            case "From":
                Assert.assertEquals("Value from field From", value, singleMessagePage.getFrom());
                break;

            case "To":
                Assert.assertEquals("Value from field To", value, singleMessagePage.getTo());
                break;

            case "Title":
                Assert.assertEquals("Value from field Title", value, singleMessagePage.getTitle());
                break;

            case "Message":
                Assert.assertEquals("Value from field Message", value, singleMessagePage.getContent());
                break;

            default:
                throw new IllegalArgumentException("There is no field like " + fieldName);
        }
    }

}
