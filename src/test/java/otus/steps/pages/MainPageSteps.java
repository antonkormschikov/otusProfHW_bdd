package otus.steps.pages;

import com.google.inject.Inject;

import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.Пусть;
import otus.pages.MainPage;

public class MainPageSteps {

    @Inject
    public MainPage mainPage;

    @Пусть("Открыта главная траница")
    public void openMainPage(){
        mainPage.open();
    }







    //Пусть Открыта главная траница
    //Если Кликнуть по плитке курса 1
    //Тогда Откроется страница курса
    //И На странице верный заголовой


}
