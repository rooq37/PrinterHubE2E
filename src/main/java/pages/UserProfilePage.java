package pages;

import org.openqa.selenium.By;

public class UserProfilePage extends BasePage {

    private static final By selectorEditButton = By.xpath("//input[@class='btn btn-primary btn-raised' and @value='Edit']");
    private static final By selectorSaveButton = By.xpath("//input[@class='btn btn-primary btn-raised' and @value='Save']");
    private static final By selectorCancelButton = By.xpath("//div[@class='btn btn-raised btn-danger' and text()='Cancel']");

    public String getValueFromField(String fieldName){
        String xpath = "(//div[contains(.,'" + fieldName + "')])[1]/div[2]//input";
        By selector = By.xpath(xpath);
        return getDriver().findElement(selector).getAttribute("value");
    }

    public boolean checkIfEditButtonIsVisible(){
        return getDriver().findElement(selectorEditButton).isDisplayed();
    }

    public void clickEditButton(){
        getDriver().findElement(selectorEditButton).click();
    }

    public void enterInTheField(String fieldName, String value){
        String xpath = "(//div[contains(.,'" + fieldName + "')])[1]/div[2]//input";
        By selector = By.xpath(xpath);
        getDriver().findElement(selector).clear();
        getDriver().findElement(selector).sendKeys(value);
    }

    public void clickSaveButton(){
        getDriver().findElement(selectorSaveButton).click();
    }

    public void clickCancelButton(){
        getDriver().findElement(selectorCancelButton).click();
    }

}
