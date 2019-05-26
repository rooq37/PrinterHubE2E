package pages;

import org.openqa.selenium.By;

public class SingleMessagePage extends BasePage {

    private static final By selectorFrom = By.xpath("//*[@id='sender']/../span[2]");
    private static final By selectorTo = By.xpath("//*[@id='receiver']/../span[2]");
    private static final By selectorTitle = By.xpath("//*[@id='title']");
    private static final By selectorContent = By.xpath("//*[@id='content']");

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
