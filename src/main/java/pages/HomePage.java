package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final String URL = "http://printerhub.mtrokosa97.usermd.net";
    //private static final String URL = "http://printerhub.mateuszs.usermd.net";

    private static final By selectorMainLogo = By.xpath("//img[@class='main-logo img-fluid']");
    private static final By selectorContent = By.xpath("//div[@class='row']");

    public void openHomePage(){
        getDriver().get(URL);
    }

    public boolean isMainLogoVisible(){
        return getDriver().findElement(selectorMainLogo).isDisplayed();
    }

    public String getContentText(){
        return getDriver().findElement(selectorContent).getText();
    }

}
