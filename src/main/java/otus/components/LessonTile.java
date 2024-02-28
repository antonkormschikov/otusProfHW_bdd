package otus.components;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import otus.pageobject.AbsPageObject;
import otus.pages.LessonPage;
import otus.support.DIScooped;

import java.util.List;

public class LessonTile extends AbsPageObject {

    @Inject
    public LessonTile(DIScooped diScooped){
        super(diScooped);
        this.
    }

    @FindBy(css = "section h2 ~ div a[href*='/lessons/']")
    private List<WebElement> lessonsTile;

    public LessonPage clickLessonTile(int number){
lessonsTile.get(--number).click();
    }

}
