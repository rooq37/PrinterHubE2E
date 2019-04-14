package pages;

import org.openqa.selenium.By;

public class NavigationBarPage extends BasePage {

    private static final String NAV_BAR_XPATH = "//nav[@class='navbar navbar-expand-lg navbar-dark bg-primary']";

    private static final By selectorNavigationHome = By.xpath(NAV_BAR_XPATH + "//a[text()='Home']");
    private static final By selectorNavigationLogin = By.xpath(NAV_BAR_XPATH + "//a[text()='Login']");
    private static final By selectorNavigationRegister = By.xpath(NAV_BAR_XPATH + "//a[text()='Register']");
    private static final By selectorNavigationTermsOfUse = By.xpath(NAV_BAR_XPATH + "//a[text()='Terms of use']");

    public void navigateToHome(){
        getDriver().findElement(selectorNavigationHome).click();
    }

    public void navigateToLogin(){
        getDriver().findElement(selectorNavigationLogin).click();
    }

    public void navigateToRegister(){
        getDriver().findElement(selectorNavigationRegister).click();
    }

    public void navigateToTermsOfUse(){
        getDriver().findElement(selectorNavigationTermsOfUse).click();
    }

    public String getNavigationBarOptions(){
        return getDriver().findElement(By.xpath(NAV_BAR_XPATH)).getText();
    }

}
