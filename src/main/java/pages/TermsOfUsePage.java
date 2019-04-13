package pages;

import org.openqa.selenium.By;

public class TermsOfUsePage extends BasePage {

    private static final By selectorHeaderText = By.xpath("//div[@class='col text-center mb-3']");
    private static final By selectorContent = By.xpath("(//div[@class='row'])[2]");

    public String getHeaderText(){
        return getDriver().findElement(selectorHeaderText).getText();
    }

    public String getContentText(){
        return getDriver().findElement(selectorContent).getText();
    }
}
