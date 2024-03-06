package otus.factories;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.plugin.dom.exception.BrowserNotSupportedException;

public class WebDriverFactory {

    private String browserName = System.getProperty("browser","chrome").toLowerCase();
    public WebDriver create() {
        switch (browserName){
            case "chrome":{
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            case "firefox":{
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            default:{
                throw new BrowserNotSupportedException(browserName);
            }

        }

    }
}
