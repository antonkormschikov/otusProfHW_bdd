package otus.hooks;

import com.google.inject.Inject;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import otus.support.DIScooped;

public class Hooks {


@Inject
public DIScooped diScooped;


    @After
    public void close(){
        WebDriver driver = diScooped.getDriver();
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }
}
