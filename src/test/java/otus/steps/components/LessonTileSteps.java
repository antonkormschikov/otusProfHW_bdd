package otus.steps.components;

import com.google.inject.Inject;
import io.cucumber.java.ru.Если;
import otus.components.LessonTile;

public class LessonTileSteps {

    @Inject
    public LessonTile lessonTile;

    @Если("Кликнуть по плитке курса {int}")
    public void clickLessonByNumber(int number)    {
        lessonTile.clickLessonTile(number);
    }
}
