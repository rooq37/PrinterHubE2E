package pages;

import org.openqa.selenium.By;

public class CreateOfferPage extends BasePage {

    private static final By titleInput = By.id("title");
    private static final By priceInput = By.id("price");
    private static final By descriptionInput = By.id("description");
    private static final By saveButton = By.xpath("//button[text()='Save']");

    public void enterInTitle(String value){
        getDriver().findElement(titleInput).sendKeys(value);
    }

    public void enterInPrice(String value){
        getDriver().findElement(priceInput).sendKeys(value);
    }

    public void enterInDescription(String value){
        getDriver().findElement(descriptionInput).sendKeys(value);
    }

    public void clickTheCheckbox(String checkboxName){
        String xpath = "//*[text()[contains(.,'" + checkboxName + "')]]";
        By selector = By.xpath(xpath);
        getDriver().findElement(selector).click();
    }

    public void clickSaveButton(){
        getDriver().findElement(saveButton).click();
    }

}
