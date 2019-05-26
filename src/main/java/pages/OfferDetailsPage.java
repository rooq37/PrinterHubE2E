package pages;

import org.openqa.selenium.By;

public class OfferDetailsPage extends BasePage {

    private static final By title = By.xpath("//p[@id='title']");
    private static final By creator = By.xpath("//p[@id='creator']");
    private static final By description = By.xpath("//p[@id='description']");
    private static final By categories = By.xpath("//p[@id='categories']");

    public String getTitle(){
        return getDriver().findElement(title).getText();
    }

    public String getCreator(){
        return getDriver().findElement(creator).getText();
    }

    public String getDescription(){
        return getDriver().findElement(description).getText();
    }

    public String getCategories(){
        return getDriver().findElement(categories).getText();
    }
}
