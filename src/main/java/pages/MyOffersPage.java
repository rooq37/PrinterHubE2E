package pages;

import org.openqa.selenium.By;

public class MyOffersPage extends BasePage {

    private static final By createNewOfferButton = By.xpath("//button[text()='Create new offer']");
    private static final By myOffersTable = By.xpath("//tbody");


    public void clickCreateNewOfferButton(){
        getDriver().findElement(createNewOfferButton).click();
    }

    public String getMyOffersList(){
        return getDriver().findElement(myOffersTable).getText();
    }

}
