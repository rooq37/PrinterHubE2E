package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OtherUsersPage extends BasePage {

    private static final By selectorSearchButton = By.xpath("//input[@class='btn btn-outline-primary' and @value='Search']");
    private static final By selectorResultTable = By.xpath("//table[@class='table']//tbody");

    public void enterInTheField(String fieldName, String value){
        String xpath = "//input[@aria-label='" + fieldName + "']";
        By selector = By.xpath(xpath);
        getDriver().findElement(selector).clear();
        getDriver().findElement(selector).sendKeys(value);
    }

    public void clickSearchButton(){
        getDriver().findElement(selectorSearchButton).click();
    }

    public String getResultTableContent(){
        return getDriver().findElement(selectorResultTable).getText();
    }

    public void clickSeeMoreButtonAtRow(String rowContent){
        By selectorTableRow = By.xpath("//table[@class='table']/tbody/tr");
        List<WebElement> tableRows = getDriver().findElements(selectorTableRow);
        int index = -1;
        for(int i = 0; i < tableRows.size(); i++)
            if(tableRows.get(i).getText().equals(rowContent)) index = i;

        index += 1;
        By selectorSeeMore = By.xpath("//table[@class='table']/tbody/tr[" + index + "]//a[text()='See more']");
        getDriver().findElement(selectorSeeMore).click();
    }

}
