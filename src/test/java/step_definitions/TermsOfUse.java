package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.TermsOfUsePage;

public class TermsOfUse {

    private TermsOfUsePage termsOfUsePage;

    public TermsOfUse(){
        this.termsOfUsePage = new TermsOfUsePage();
    }

    @Then("^Check if page header is \"([^\"]*)\"$")
    public void check_if_page_header_is(String expectedValue) {
        Assert.assertTrue("Header text", termsOfUsePage.getHeaderText().equals(expectedValue));
    }

    @Then("^Check if terms of use text is visible$")
    public void check_if_terms_of_use_text_is_visible() {
        Assert.assertTrue("Content text", termsOfUsePage.getContentText().contains("Lorem ipsum dolor sit amet"));
    }

}
