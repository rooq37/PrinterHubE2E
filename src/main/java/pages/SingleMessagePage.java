package pages;

import org.openqa.selenium.By;

public class SingleMessagePage extends BasePage {

    private static final By selectorFrom = By.xpath("//main[@class='container']//p[1]");
    private static final By selectorTo = By.xpath("//main[@class='container']//p[2]");
    private static final By selectorTitle = By.xpath("//main[@class='container']//p[4]");
    private static final By selectorContent = By.xpath("//main[@class='container']//p[5]");

    public String getFrom(){
        return getDriver().findElement(selectorFrom).getText();
    }

    public String getTo(){
        return getDriver().findElement(selectorTo).getText();
    }

    public String getTitle(){
        return getDriver().findElement(selectorTitle).getText();
    }

    public String getContent(){
        return getDriver().findElement(selectorContent).getText();
    }

}
