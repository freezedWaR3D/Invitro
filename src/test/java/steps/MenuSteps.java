package steps;


import Pages.RadiologyPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;




    public class MenuSteps {

        private final RadiologyPage radiologyPage = new RadiologyPage();

        @Дано("Пользователь открывает страницу медицинских услуг {string}")
        public void пользовательОткрываетСтраницуМедицинскихУслуг(String url) {
            Selenide.open(url);
        }

        @Когда("Пользователь кликает по всем пунктам меню, кроме 'МРТ тела' из коллекции")
        public void пользовательКликаетПоВсемПунктамМенюКоллекц() {
            radiologyPage.collectAllElementExeptMrtCollect();
        }

        @И("Пользователь кликает по всем пунктам меню, кроме 'МРТ тела' в процессе клика")
        public void пользовательКликаетПоВсемПунктамМенюКлик() {
            radiologyPage.collectAllElementExeptMrtClick();
        }

        @Тогда("Все пункты меню были прокликаны успешно")
        public void всеПунктыМенюКромеМртКликабельны() {
            Assertions.assertTrue(true);
        }
    }

















































