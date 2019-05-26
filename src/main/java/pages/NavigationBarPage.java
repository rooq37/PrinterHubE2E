package pages;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationBarPage extends BasePage {

    private static final String NAV_BAR_XPATH = "//nav[@class='navbar navbar-expand-lg navbar-dark bg-primary']";
    private static final String CREDTIS_XPATH = "//span[text()='Credits: ']";

    public void navigateToOption(String optionName){
        Capabilities cap = ((RemoteWebDriver) getDriver()).getCapabilities();
        String browserName = cap.getBrowserName();
        String xpath = NAV_BAR_XPATH + "//a[text()='" + optionName + "']";
        By selector = By.xpath(xpath);

        //if(browserName.equals("phantomjs")){
            if(!getDriver().findElement(selector).isDisplayed())
                getDriver().findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        //}

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        getDriver().findElement(selector).click();
    }

    public boolean checkIfUserIsLoggedIn(){
        Capabilities cap = ((RemoteWebDriver) getDriver()).getCapabilities();
        String browserName = cap.getBrowserName();
        if(browserName.equals("phantomjs")){
            getDriver().findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CREDTIS_XPATH)));
        return getDriver().findElement(By.xpath(NAV_BAR_XPATH)).isDisplayed();
    }

}
