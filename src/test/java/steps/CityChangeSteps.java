package steps;

import Pages.RadiologyPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;

public class CityChangeSteps {

    private final RadiologyPage radiologyPage = new RadiologyPage();

    @Дано("Пользователь открывает главную страницу сайта {string}")
    public void пользовательОткрываетГлавнуюСтраницу(String url) {
        Selenide.open(url);
    }

    @Когда("Пользователь меняет город на {string}")
    public void пользовательМеняетГород(String город) {
        radiologyPage.changeCity(город);
    }

    @Тогда("В адресной строке отображается код города {string}")
    public void вАдреснойСтрокеОтображаетсяКодГорода(String код_города) {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assertions.assertTrue(
                currentUrl.contains(код_города) ||
                        currentUrl.contains("CITY_NAME=" + код_города),
                "URL не содержит код города: " + код_города
        );
    }
}
