package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationBarPage extends BasePage {

    private static final String NAV_BAR_XPATH = "//nav[@class='navbar navbar-expand-lg navbar-dark bg-primary']";

    public void navigateToOption(String optionName){
        Capabilities cap = ((RemoteWebDriver) getDriver()).getCapabilities();
        String browserName = cap.getBrowserName();
        if(browserName.equals("phantomjs")){
            getDriver().findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        }

        String xpath = NAV_BAR_XPATH + "//a[text()='" + optionName + "']";
        By selector = By.xpath(xpath);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        getDriver().findElement(selector).click();
    }

    public String getNavigationBarOptions(){
        Capabilities cap = ((RemoteWebDriver) getDriver()).getCapabilities();
        String browserName = cap.getBrowserName();
        if(browserName.equals("phantomjs")){
            getDriver().findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NAV_BAR_XPATH)));
        return getDriver().findElement(By.xpath(NAV_BAR_XPATH)).getText();
    }

}
