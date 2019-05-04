package pages;

import org.openqa.selenium.By;

public class CreateMessagePage extends BasePage {

    private static final By selectorReceiverEmailInput = By.xpath("//input[@id='email']");
    private static final By selectorTitleInput = By.xpath("//input[@id='title']");
    private static final By selectorContentInput = By.xpath("//textarea[@id='message']");
    private static final By selectorSendButton = By.xpath("//button[text()='Send']");

    public void enterInEmail(String email){
        getDriver().findElement(selectorReceiverEmailInput).clear();
        getDriver().findElement(selectorReceiverEmailInput).sendKeys(email);
    }

    public void enterInTitle(String title){
        getDriver().findElement(selectorTitleInput).clear();
        getDriver().findElement(selectorTitleInput).sendKeys(title);
    }

    public void enterInContent(String content){
        getDriver().findElement(selectorContentInput).clear();
        getDriver().findElement(selectorContentInput).sendKeys(content);
    }

    public void clickSendButton(){
        getDriver().findElement(selectorSendButton).click();
    }

}
