package otus.pageobject;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import otus.support.DIScooped;

public abstract class AbsPageObject {

    protected WebDriver driver;

    @Inject
    public AbsPageObject(DIScooped scenarioScoped){
        this.driver=scenarioScoped.getDriver();
    }
}
