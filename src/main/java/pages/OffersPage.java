package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OffersPage extends BasePage {

    public void clickSeeMoreButtonAtRow(String rowContent){
        By selectorTableRow = By.xpath("//table[@class='table row-container']/tbody/tr");
        List<WebElement> tableRows = getDriver().findElements(selectorTableRow);
        int index = -1;
        for(int i = 0; i < tableRows.size(); i++)
            if(tableRows.get(i).getText().contains(rowContent)) index = i;

        index += 1;
        By selectorSeeMore = By.xpath("//table[@class='table row-container']/tbody/tr[" + index + "]//a[text()='See more']");
        getDriver().findElement(selectorSeeMore).click();
    }

}
