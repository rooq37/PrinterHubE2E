package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MessagesPage extends BasePage {

    private static final By selectorCreateMessageButton = By.xpath("//button[@class='btn btn-primary btn-raised btn-lg ']");

    public void clickCreateMessageButton(){
        getDriver().findElement(selectorCreateMessageButton).click();
    }

    public void showMessageByTitleAndSender(String title, String sender){
        By selectorTableRow = By.xpath("//table[@class='table']/tbody/tr");
        List<WebElement> tableRows = getDriver().findElements(selectorTableRow);
        int index = -1;
        for(int i = 0; i < tableRows.size(); i++)
            if(tableRows.get(i).getText().contains(title) && tableRows.get(i).getText().contains(sender)) index = i;

        index += 1;
        By selectorShow = By.xpath("//table[@class='table']/tbody/tr[" + index + "]//a[text()='Show']");
        getDriver().findElement(selectorShow).click();
    }

    public String getMessageList(){
        By selectorTable = By.xpath("//table[@class='table']/tbody");
        return getDriver().findElement(selectorTable).getText();
    }



}
