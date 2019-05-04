package pages;

import org.openqa.selenium.By;

public class NavigationBarPage extends BasePage {

    private static final String NAV_BAR_XPATH = "//nav[@class='navbar navbar-expand-lg navbar-dark bg-primary']";

    public void navigateToOption(String optionName){
        String xpath = NAV_BAR_XPATH + "//a[text()='" + optionName + "']";
        By selector = By.xpath(xpath);
        getDriver().findElement(selector).click();
    }

    public String getNavigationBarOptions(){
        return getDriver().findElement(By.xpath(NAV_BAR_XPATH)).getText();
    }

}
