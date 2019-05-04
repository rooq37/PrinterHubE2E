package pages;

import org.openqa.selenium.By;

public class SingleMessagePage extends BasePage {

    private static final By selectorSender = By.xpath("//main[@class='container']//p[1]");
    private static final By selectorTitle = By.xpath("//main[@class='container']//p[3]");
    private static final By selectorContent = By.xpath("//main[@class='container']//p[4]");

    public String getSender(){
        return getDriver().findElement(selectorSender).getText();
    }

    public String getTitle(){
        return getDriver().findElement(selectorTitle).getText();
    }

    public String getContent(){
        return getDriver().findElement(selectorContent).getText();
    }

}
