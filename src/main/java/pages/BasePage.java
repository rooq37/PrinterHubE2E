package pages;

import gherkin.lexer.Th;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static net.sourceforge.htmlunit.corejs.javascript.tools.SourceReader.toUrl;

public abstract class BasePage {

    private static final String CHROME_DRIVER_PATH = "lib/webdrivers/chrome/chromedriver.exe";

    private static WebDriver driver;

    private static final By errorMessageSelector = By.xpath("//div[@class='alert alert-warning alert-dismissible fade show']");

    public BasePage(){
        if(driver == null){
            boolean remote = true;
            if(remote){
                DesiredCapabilities dr = DesiredCapabilities.phantomjs();
                dr.setCapability("phantomjs.page.customHeaders.Accept-Language", "en");
                driver = new RemoteWebDriver(toUrl("http://mtrokosa97.usermd.net:27917"), dr);
            }else{
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--lang=en");
                System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
            }
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public String getErrorMessageText(){
        return getDriver().findElement(errorMessageSelector).getText();
    }

    public void sleep(double sec){
        try {
            Thread.sleep((int) sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
