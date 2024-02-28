package otus.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin.dom.exception.BrowserNotSupportedException;

public class WebDriverFactory {

    private String browserName = System.getProperty("browser","chrome");
    public WebDriver create() {
        switch (browserName){
            case "chrome":{
                return new ChromeDriver();
            }
            default:{
                throw new BrowserNotSupportedException(browserName);
            }

        }

    }
}
