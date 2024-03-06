package otus.pages;

import com.google.inject.Inject;
import otus.support.DIScooped;

public class LessonPage extends AbsBasePage<LessonPage>{
    @Inject
    public LessonPage(DIScooped diScooped){

        super(diScooped);
    }
}
