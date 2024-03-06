package otus.pages;

import com.google.inject.Inject;
import otus.annotations.Path;
import otus.factories.WebDriverFactory;
import otus.pageobject.AbsPageObject;
import otus.support.DIScooped;

public abstract class AbsBasePage<T> extends AbsPageObject {
    @Inject
    public AbsBasePage(DIScooped scenarioScoped){
        super(scenarioScoped);
    }
    private  String baseUrl = System.getProperty("base.url");
    private String getPath(){
        Class clazz = this.getClass();
        if (clazz.isAnnotationPresent(Path.class)){
            Path path = (Path)clazz.getDeclaredAnnotation(Path.class);
            return path.value().endsWith("/") ? path.value():path.value()+"/";
        }
        return "";
    }



    public T open(){
        this.driver.get(baseUrl+getPath());
        return (T)this;
    }
}
