package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {

    private static final String CHROME_DRIVER_PATH = "lib/webdrivers/chrome/chromedriver.exe";

    private static WebDriver driver;

    private static final By errorMessageSelector = By.xpath("//div[@class='alert alert-warning alert-dismissible fade show']");

    public BasePage(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public String getErrorMessageText(){
        return getDriver().findElement(errorMessageSelector).getText();
    }

}
