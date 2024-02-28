package otus.pages;

import com.google.inject.Inject;
import io.cucumber.java.it.Ma;
import otus.support.DIScooped;

public class MainPage extends AbsBasePage<MainPage>{
    @Inject
    public MainPage(DIScooped diScooped){
        super(diScooped);
    }
}
