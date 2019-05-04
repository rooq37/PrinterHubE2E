package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private static final By selectorEmailInput = By.xpath("//input[@id='email']");
    private static final By selectorPasswordInput = By.xpath("//input[@id='password']");

    private static final By selectorSubmitButton = By.xpath("//input[@type='submit']");

    public void enterEmail(String email){
        getDriver().findElement(selectorEmailInput).sendKeys(email);
    }

    public void enterPassword(String password){
        getDriver().findElement(selectorPasswordInput).sendKeys(password);
    }

    public void clickSubmitButton(){
        getDriver().findElement(selectorSubmitButton).click();
    }

}
