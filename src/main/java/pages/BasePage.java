package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {

    private static final String CHROME_DRIVER_PATH = "lib/webdrivers/chrome/chromedriver.exe";

    private static WebDriver driver;

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

}
